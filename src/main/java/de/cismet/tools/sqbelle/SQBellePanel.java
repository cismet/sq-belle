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

import org.openide.util.NbPreferences;

import java.awt.Desktop;

import java.net.URL;

/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
final class SQBellePanel extends javax.swing.JPanel {

    //~ Static fields/initializers ---------------------------------------------

    public static final String WEBSERVICEURL_PREF_KEY = "sq-belle-webservice-url";
    public static final String WEBSERVICEURL_DEFAULT = "http://sqlformat-api.cismet.de/format/";

    //~ Instance fields --------------------------------------------------------

    private final SQBelleOptionsPanelController controller;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdModule;
    private javax.swing.JButton cmdReportIssue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtWebserviceUrl;
    // End of variables declaration//GEN-END:variables

    //~ Constructors -----------------------------------------------------------

    /**
     * Creates a new SQBellePanel object.
     *
     * @param  controller  DOCUMENT ME!
     */
    SQBellePanel(final SQBelleOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
    }

    //~ Methods ----------------------------------------------------------------

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        txtWebserviceUrl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmdModule = new javax.swing.JButton();
        cmdReportIssue = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(
            jLabel1,
            org.openide.util.NbBundle.getMessage(SQBellePanel.class, "SQBellePanel.jLabel1.text")); // NOI18N

        txtWebserviceUrl.setEditable(false);
        txtWebserviceUrl.setText(org.openide.util.NbBundle.getMessage(
                SQBellePanel.class,
                "SQBellePanel.txtWebserviceUrl.text")); // NOI18N
        txtWebserviceUrl.setEnabled(false);
        txtWebserviceUrl.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    txtWebserviceUrlActionPerformed(evt);
                }
            });

        org.openide.awt.Mnemonics.setLocalizedText(
            jLabel2,
            org.openide.util.NbBundle.getMessage(SQBellePanel.class, "SQBellePanel.jLabel2.text")); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        cmdModule.setFont(new java.awt.Font("Lucida Grande", 0, 17));                                 // NOI18N
        cmdModule.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/de/cismet/tools/sqbelle/GitHub-Mark-32px.png")));            // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(
            cmdModule,
            org.openide.util.NbBundle.getMessage(SQBellePanel.class, "SQBellePanel.cmdModule.text")); // NOI18N
        cmdModule.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    cmdModuleActionPerformed(evt);
                }
            });

        cmdReportIssue.setFont(new java.awt.Font("Lucida Grande", 0, 17));                                 // NOI18N
        cmdReportIssue.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/de/cismet/tools/sqbelle/Github-Issue-32px.png")));                // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(
            cmdReportIssue,
            org.openide.util.NbBundle.getMessage(SQBellePanel.class, "SQBellePanel.cmdReportIssue.text")); // NOI18N
        cmdReportIssue.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    cmdReportIssueActionPerformed(evt);
                }
            });

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addContainerGap().addGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                        jLabel2,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        0,
                        Short.MAX_VALUE).addGroup(
                        layout.createSequentialGroup().addComponent(cmdModule).addPreferredGap(
                            javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(cmdReportIssue).addGap(
                            0,
                            0,
                            Short.MAX_VALUE)).addGroup(
                        layout.createSequentialGroup().addComponent(jLabel1).addPreferredGap(
                            javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(
                            txtWebserviceUrl,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            518,
                            Short.MAX_VALUE))).addContainerGap()));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                layout.createSequentialGroup().addContainerGap().addGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
                                .addComponent(
                                    txtWebserviceUrl,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                    98,
                    Short.MAX_VALUE).addComponent(
                    jLabel2,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    145,
                    javax.swing.GroupLayout.PREFERRED_SIZE).addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(cmdModule)
                                .addComponent(cmdReportIssue)).addContainerGap()));
    } // </editor-fold>//GEN-END:initComponents

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void txtWebserviceUrlActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_txtWebserviceUrlActionPerformed
        // TODO add your handling code here:
    } //GEN-LAST:event_txtWebserviceUrlActionPerformed

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void cmdModuleActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_cmdModuleActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/helllth/sq-belle/").toURI());
        } catch (Exception e) {
        }
    }                                                                             //GEN-LAST:event_cmdModuleActionPerformed

    /**
     * DOCUMENT ME!
     *
     * @param  evt  DOCUMENT ME!
     */
    private void cmdReportIssueActionPerformed(final java.awt.event.ActionEvent evt) { //GEN-FIRST:event_cmdReportIssueActionPerformed
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/helllth/sq-belle/issues/new").toURI());
        } catch (Exception e) {
        }
    }                                                                                  //GEN-LAST:event_cmdReportIssueActionPerformed

    /**
     * DOCUMENT ME!
     */
    void load() {
    }

    /**
     * DOCUMENT ME!
     */
    void store() {
    }

    /**
     * DOCUMENT ME!
     *
     * @return  DOCUMENT ME!
     */
    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
}