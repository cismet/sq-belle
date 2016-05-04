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

import org.hibernate.jdbc.util.BasicFormatterImpl;
import org.hibernate.jdbc.util.Formatter;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

import javax.swing.text.BadLocationException;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  $Revision$, $Date$
 */
public class SqlReformatTask implements ReformatTask {

    //~ Instance fields --------------------------------------------------------

    private final Context context;

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
        final Formatter f = new BasicFormatterImpl();
        final String formatted_sql_code = f.format(sql);
        context.document().remove(0, context.document().getLength());
        context.document().insertString(0, formatted_sql_code, null);
    }

    @Override
    public ExtraLock reformatLock() {
        return null;
    }
}
