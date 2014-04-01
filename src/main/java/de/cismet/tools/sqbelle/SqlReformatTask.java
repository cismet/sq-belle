/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cismet.tools.sqbelle;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

import org.openide.util.NbPreferences;

import java.awt.EventQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.text.BadLocationException;

import static de.cismet.tools.sqbelle.SQBellePanel.WEBSERVICEURL_DEFAULT;
import static de.cismet.tools.sqbelle.SQBellePanel.WEBSERVICEURL_PREF_KEY;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  $Revision$, $Date$
 */
public class SqlReformatTask implements ReformatTask {

    //~ Instance fields --------------------------------------------------------

    private Context context;

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new SqlReformatTask object.
     *
     * @param  context  DOCUMENT ME!
     */
    public SqlReformatTask(final Context context) {
        this.context = context;
    }

    //~ Methods ----------------------------------------------------------------

    @Override
    public void reformat() throws BadLocationException {
        final String sql = context.document().getText(0, context.document().getLength());
        HttpURLConnection conn = null;
        try {
            final URL url = new URL(NbPreferences.forModule(SQBellePanel.class).get(
                        WEBSERVICEURL_PREF_KEY,
                        WEBSERVICEURL_DEFAULT));
            conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            final String formParameters = "format=text&keyword_case=upper&reindent=True&n_indents=2&data=" + sql;

            final OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());

            writer.write(formParameters);
            writer.flush();

            String line;
            final BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer newSQL = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                newSQL.append(line).append('\n');
            }
            writer.close();
            reader.close();
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                            + conn.getResponseCode());
            } else {
                context.document().remove(0, context.document().getLength());
                context.document().insertString(0, newSQL.toString(), null);
            }
        } catch (Exception e) {
            java.awt.Toolkit.getDefaultToolkit().beep();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    @Override
    public ExtraLock reformatLock() {
        return null;
    }
}
