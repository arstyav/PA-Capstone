/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

public class menuMurid extends javax.swing.JFrame {

    public menuMurid() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createMurid = new javax.swing.JButton();
        readMurid = new javax.swing.JButton();
        deleteMurid = new javax.swing.JButton();
        updateMurid = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createMurid.setContentAreaFilled(false);
        createMurid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMuridActionPerformed(evt);
            }
        });
        jPanel1.add(createMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 210, 50));

        readMurid.setContentAreaFilled(false);
        readMurid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readMuridActionPerformed(evt);
            }
        });
        jPanel1.add(readMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 200, 60));

        deleteMurid.setContentAreaFilled(false);
        deleteMurid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMuridActionPerformed(evt);
            }
        });
        jPanel1.add(deleteMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 200, 60));

        updateMurid.setContentAreaFilled(false);
        updateMurid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMuridActionPerformed(evt);
            }
        });
        jPanel1.add(updateMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 213, 190, 50));

        ex.setContentAreaFilled(false);
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (20).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createMuridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMuridActionPerformed
       createMurid cm = new createMurid();
       cm.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_createMuridActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        menu1 mn1 = new menu1();
        mn1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exActionPerformed

    private void deleteMuridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMuridActionPerformed
        deleteMurid dm = new deleteMurid();
        dm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteMuridActionPerformed

    private void readMuridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readMuridActionPerformed
        showMurid sw = new showMurid();
        sw.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_readMuridActionPerformed

    private void updateMuridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMuridActionPerformed
        updateMurid um = new updateMurid();
        um.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateMuridActionPerformed

    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(menuMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(menuMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(menuMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(menuMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new menuMurid().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createMurid;
    private javax.swing.JButton deleteMurid;
    private javax.swing.JButton ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton readMurid;
    private javax.swing.JButton updateMurid;
    // End of variables declaration//GEN-END:variables
}
