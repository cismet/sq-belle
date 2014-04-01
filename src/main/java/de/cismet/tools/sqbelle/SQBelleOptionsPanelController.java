/***************************************************
*
* cismet GmbH, Saarbruecken, Germany
*
*              ... and it just works.
*
****************************************************/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.cismet.tools.sqbelle;

import org.netbeans.spi.options.OptionsPanelController;

import org.openide.util.HelpCtx;
import org.openide.util.Lookup;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@OptionsPanelController.SubRegistration(
    displayName = "#AdvancedOption_DisplayName_SQBelle",
    keywords = "#AdvancedOption_Keywords_SQBelle",
    keywordsCategory = "Advanced/SQBelle"
)
@org.openide.util.NbBundle.Messages(
    { "AdvancedOption_DisplayName_SQBelle=SQ-Belle", "AdvancedOption_Keywords_SQBelle=SQL formatting SQ-Belle" }
)
public final class SQBelleOptionsPanelController extends OptionsPanelController {

    //~ Instance fields --------------------------------------------------------

    private SQBellePanel panel;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private boolean changed;

    //~ Methods ----------------------------------------------------------------

    @Override
    public void update() {
        getPanel().load();
        changed = false;
    }

    @Override
    public void applyChanges() {
        SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    getPanel().store();
                    changed = false;
                }
            });
    }

    @Override
    public void cancel() {
        // need not do anything special, if no changes have been persisted yet
    }

    @Override
    public boolean isValid() {
        return getPanel().valid();
    }

    @Override
    public boolean isChanged() {
        return changed;
    }

    @Override
    public HelpCtx getHelpCtx() {
        return null; // new HelpCtx("...ID") if you have a help set
    }

    @Override
    public JComponent getComponent(final Lookup masterLookup) {
        return getPanel();
    }

    @Override
    public void addPropertyChangeListener(final PropertyChangeListener l) {
        pcs.addPropertyChangeListener(l);
    }

    @Override
    public void removePropertyChangeListener(final PropertyChangeListener l) {
        pcs.removePropertyChangeListener(l);
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    private SQBellePanel getPanel() {
        if (panel == null) {
            panel = new SQBellePanel(this);
        }
        return panel;
    }

    /**
     * DOCUMENT ME!
     */
    void changed() {
        if (!changed) {
            changed = true;
            pcs.firePropertyChange(OptionsPanelController.PROP_CHANGED, false, true);
        }
        pcs.firePropertyChange(OptionsPanelController.PROP_VALID, null, null);
    }
}
