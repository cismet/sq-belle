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
import org.netbeans.modules.editor.indent.spi.ReformatTask;

/**
 * DOCUMENT ME!
 *
 * @author   thorsten
 * @version  $Revision$, $Date$
 */
public class SqlReformatTaskFactory implements ReformatTask.Factory {

    //~ Methods ----------------------------------------------------------------

    @Override
    public ReformatTask createTask(final Context context) {
        return new SqlReformatTask(context);
    }
}
