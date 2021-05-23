/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadellaspesa;

import javax.swing.JOptionPane;

/**
 *
 * @author Francesco
 */
public class LoginFrame extends javax.swing.JFrame {

    public Utente p;

    /**
     * Creates new form NewJFrame
     */
    public LoginFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonQuit = new javax.swing.JButton();
        jButtonContinua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel4.setText("Password:");

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButtonQuit.setBackground(jButtonContinua.getBackground());
        jButtonQuit.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jButtonQuit.setText("Esci");
        jButtonQuit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitActionPerformed(evt);
            }
        });

        jButtonContinua.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jButtonContinua.setText("Continua");
        jButtonContinua.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButtonContinua.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonContinua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonContinua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Non ho un account");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonContinua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldEmail))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPasswordField1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonContinua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButtonContinuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuaActionPerformed
        // TODO add your handling code here:
        String email = jTextFieldEmail.getText();
        String password = String.valueOf(jPasswordField1.getPassword());

        if (AccessManager.login(email, password) != null) {
            Utente utente = AccessManager.login(email, password);
            MainFrame mf = new MainFrame();
            mf.setVisible(true);
            this.dispose();
            mf.setUtente(utente);
            setInformazioniLabel(utente, mf);
        } else {
            JOptionPane.showMessageDialog(this, "Utente non presente o nome utente e/o password errati", "ATTENZIONE", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonContinuaActionPerformed

    private void setInformazioniLabel(Utente utente, MainFrame mf) {
        mf.getjLabelTitolo().setText("Ciao " + utente.getUsername() + " cosa vuoi ordinare?");
        mf.getjLabelNomeUtente().setText(utente.getUsername());
        mf.getjLabelPassword().setText(utente.getPassword());
        mf.getjLabelSaldo().setText(String.valueOf(utente.getSaldoCarta()));
        mf.getjLabelNumeroCarta().setText(utente.getCarta().getNumeroCarta());
    }

    private void jButtonQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitActionPerformed
        // TODO add your handling code here:

        int res = JOptionPane.showConfirmDialog(null, "Sei sicuro di voler uscire?", "Conferma", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (res) {
            case JOptionPane.YES_OPTION:
                System.exit(0);
                break;
        }
    }//GEN-LAST:event_jButtonQuitActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        RegistrationFrame rf = new RegistrationFrame();
        rf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContinua;
    private javax.swing.JButton jButtonQuit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
