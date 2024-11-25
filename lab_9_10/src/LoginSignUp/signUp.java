/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginSignUp;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author meraj
 */
public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form signUp
     */
    public signUp() {
        initComponents();
        jtxtFName.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            handleEnterKey(evt);
          }
        });
        jtxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            handleEnterKey(evt);
           }
        });
        jtxtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                handleEnterKey(evt);
            }
        });
        jtxtRePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                handleEnterKey(evt);
            }
        });
        jtxtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
                handleEnterKey(evt);
            }
        });
     }
    private void handleEnterKey(java.awt.event.KeyEvent evt){
        if(evt.getKeyCode() != java.awt.event.KeyEvent.VK_ENTER){
            return ;
        }
        if(jtxtEmail.getText().isEmpty() || jtxtFName.getText().isEmpty() || jtxtPass.getText().isEmpty() || jtxtPass.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Required field are blank!");
       }
       else{
            try {
            String db = "jdbc:mysql://localhost:3306/phonebook";
            String query = "insert into login (full_name,username,email,password) values (?,?,?,?);";
            String root = "root";
            Connection con = DriverManager.getConnection(db,root,root);
                System.out.println("nigga");
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,jtxtFName.getText());
             pstm.setString(2,jtxtUsername.getText());
             pstm.setString(3, jtxtEmail.getText());
             pstm.setString(4, jtxtPass.getText());
             boolean ok = false;
             if(!jtxtPass.getText().equals(jtxtRePass.getText())){
                 JOptionPane.showMessageDialog(this, "Password not matched!");
                 ok = true;
             }
             if(!ok){
              int count = pstm.executeUpdate();
              if(count>0)
             {
                 JOptionPane.showMessageDialog(this, "Successfully! Signed up");
             }
             else
             {
                 JOptionPane.showMessageDialog(this, "Service Unavailable!");
             }
             }
             con.close();
            
        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Username already Exist!");
        }
       }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HeadingPanel = new javax.swing.JPanel();
        jLHead = new javax.swing.JLabel();
        SignUpDetails = new javax.swing.JPanel();
        jLIcon = new javax.swing.JLabel();
        jLFName = new javax.swing.JLabel();
        jtxtFName = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLUsername = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jLPass = new javax.swing.JLabel();
        jtxtPass = new javax.swing.JTextField();
        jLRePass = new javax.swing.JLabel();
        jtxtRePass = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PhoneBook-SignUp");
        setResizable(false);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        MainPanel.setBackground(new java.awt.Color(51, 255, 255));

        HeadingPanel.setBackground(new java.awt.Color(255, 0, 0));
        HeadingPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), javax.swing.BorderFactory.createEtchedBorder()));
        HeadingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLHead.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHead.setText("Sign Up");
        HeadingPanel.add(jLHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 150, 60));

        SignUpDetails.setBackground(new java.awt.Color(128, 235, 246));
        SignUpDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginSignUp/signUp1.png"))); // NOI18N

        jLFName.setText("Full Name  :   *");

        jLEmail.setText("Email        :    *");

        jtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmailActionPerformed(evt);
            }
        });

        jLUsername.setText("Username :    *");

        jtxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsernameActionPerformed(evt);
            }
        });

        jLPass.setText("Password  :   *");

        jLRePass.setText("Confirm Password  :   *");

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Already have Account ? Login ");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginActionListener(evt);
            }
        });

        javax.swing.GroupLayout SignUpDetailsLayout = new javax.swing.GroupLayout(SignUpDetails);
        SignUpDetails.setLayout(SignUpDetailsLayout);
        SignUpDetailsLayout.setHorizontalGroup(
            SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpDetailsLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpDetailsLayout.createSequentialGroup()
                            .addComponent(jLRePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpDetailsLayout.createSequentialGroup()
                            .addComponent(jLPass, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpDetailsLayout.createSequentialGroup()
                            .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(SignUpDetailsLayout.createSequentialGroup()
                            .addComponent(jLFName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(jtxtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(SignUpDetailsLayout.createSequentialGroup()
                            .addComponent(Reset)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Submit))
                        .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SignUpDetailsLayout.createSequentialGroup()
                            .addComponent(jLUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SignUpDetailsLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        SignUpDetailsLayout.setVerticalGroup(
            SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFName)
                    .addComponent(jtxtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jtxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsername)
                    .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPass)
                    .addComponent(jtxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRePass)
                    .addComponent(jtxtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(SignUpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset)
                    .addComponent(Submit))
                .addGap(27, 27, 27)
                .addComponent(login)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeadingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(SignUpDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(HeadingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SignUpDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(MainPanel);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEmailActionPerformed

    private void loginActionListener(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginActionListener
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_loginActionListener

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        
        jtxtFName.setText("");
        jtxtEmail.setText("");
        jtxtPass.setText("");
        jtxtRePass.setText("");
        jtxtUsername.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void jtxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsernameActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
       if(jtxtEmail.getText().isEmpty() || jtxtFName.getText().isEmpty() || jtxtPass.getText().isEmpty() || jtxtPass.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Required field are blank!");
       }
       else{
            
               try {
//            Class.forName("com.mysql.jdbc.Driver");
            String username = "root";
            String password = "root";
            String db = "jdbc:mysql://localhost:3306/phonebook";
            String query = "insert into login (full_name,username,email,password) values (?,?,?,?);";
            
            Connection con = DriverManager.getConnection(db,username,password);
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,jtxtFName.getText());
             pstm.setString(2,jtxtUsername.getText());
             pstm.setString(3, jtxtEmail.getText());
             pstm.setString(4, jtxtPass.getText());
             boolean ok = false;
             if(!jtxtPass.getText().equals(jtxtRePass.getText())){
                 JOptionPane.showMessageDialog(this, "Password not matched!");
                 ok = true;
             }
             if(!ok){
              int count = pstm.executeUpdate();
              if(count>0)
             {
                 JOptionPane.showMessageDialog(this, "Successfully! Signed up");
             }
             else
             {
                 JOptionPane.showMessageDialog(this, "Service Unavailable!");
             }
             }
             con.close();
            
        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Username already Exist!");
//            Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       
    }//GEN-LAST:event_SubmitActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new signUp().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeadingPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton Reset;
    private javax.swing.JPanel SignUpDetails;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFName;
    private javax.swing.JLabel jLHead;
    private javax.swing.JLabel jLIcon;
    private javax.swing.JLabel jLPass;
    private javax.swing.JLabel jLRePass;
    private javax.swing.JLabel jLUsername;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFName;
    private javax.swing.JTextField jtxtPass;
    private javax.swing.JTextField jtxtRePass;
    private javax.swing.JTextField jtxtUsername;
    private javax.swing.JLabel login;
    // End of variables declaration//GEN-END:variables
}
