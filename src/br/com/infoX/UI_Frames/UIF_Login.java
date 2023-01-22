package br.com.infoX.UI_Frames;

import java.awt.Color;
import java.sql.*;
import br.com.infoX.model.ModuloConexao;
import javax.swing.JOptionPane;

public class UIF_Login extends javax.swing.JFrame {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;

    public void logar() {
        String sql = "select * from tbusuario where login=? and senha=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, TFuser.getText());
            pst.setString(2, PFpassword.getText());
            rs = pst.executeQuery();

            if (rs.next()) {

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect username or password!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        }
    }

    public UIF_Login() {
        initComponents();
        conexao = ModuloConexao.conectar();
        //System.out.println(conexao); //--> Linha para verificação do status da conexao
        if (conexao != null) {
            JLstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/dbok.png")));
        } else {
            JLstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/dberror.png")));
        }
        getContentPane().setBackground(new Color(8, 13, 32));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLu = new javax.swing.JLabel();
        JLp = new javax.swing.JLabel();
        TFuser = new br.com.infoX.Classes_Custom.TextField();
        PFpassword = new br.com.infoX.Classes_Custom.PasswordField();
        JLk = new javax.swing.JLabel();
        PFkey = new br.com.infoX.Classes_Custom.PasswordField();
        BTloginIn = new javax.swing.JLabel();
        JLinfo = new javax.swing.JLabel();
        JLstatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UIF Custom Login");
        setResizable(false);

        JLu.setBackground(new java.awt.Color(204, 204, 204));
        JLu.setForeground(new java.awt.Color(255, 255, 255));
        JLu.setText("U.:");

        JLp.setForeground(new java.awt.Color(255, 255, 255));
        JLp.setText("P.:");

        TFuser.setBackground(new java.awt.Color(8, 13, 32));
        TFuser.setForeground(new java.awt.Color(3, 155, 216));
        TFuser.setLabelText("Enter user here");

        PFpassword.setBackground(new java.awt.Color(8, 13, 32));
        PFpassword.setForeground(new java.awt.Color(3, 155, 216));
        PFpassword.setLabelText("Enter your password here");

        JLk.setForeground(new java.awt.Color(255, 255, 255));
        JLk.setText("K.:");

        PFkey.setBackground(new java.awt.Color(8, 13, 32));
        PFkey.setForeground(new java.awt.Color(3, 155, 216));
        PFkey.setLabelText("Enter your key");

        BTloginIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/login_In.png"))); // NOI18N

        JLinfo.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        JLinfo.setForeground(new java.awt.Color(204, 204, 204));
        JLinfo.setText("DEV - Giovani V. Chaves");

        JLstatus.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        JLstatus.setForeground(new java.awt.Color(255, 255, 255));
        JLstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infoX/icones/dberror.png"))); // NOI18N
        JLstatus.setText("SGBD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFuser, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLstatus))
                                .addGap(18, 18, 18)
                                .addComponent(BTloginIn))
                            .addComponent(PFkey, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JLu))
                    .addComponent(TFuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JLp))
                    .addComponent(PFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JLk))
                    .addComponent(PFkey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTloginIn)
                    .addComponent(JLstatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(JLinfo)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIF_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIF_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIF_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIF_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIF_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BTloginIn;
    private javax.swing.JLabel JLinfo;
    private javax.swing.JLabel JLk;
    private javax.swing.JLabel JLp;
    private javax.swing.JLabel JLstatus;
    private javax.swing.JLabel JLu;
    private br.com.infoX.Classes_Custom.PasswordField PFkey;
    private br.com.infoX.Classes_Custom.PasswordField PFpassword;
    private br.com.infoX.Classes_Custom.TextField TFuser;
    // End of variables declaration//GEN-END:variables
}
