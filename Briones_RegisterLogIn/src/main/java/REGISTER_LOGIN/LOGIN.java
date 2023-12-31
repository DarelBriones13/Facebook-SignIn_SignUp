/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package REGISTER_LOGIN;

import java.awt.Color;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author darel
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
        customizeTextFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtEmail_Num = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        btnForgot = new javax.swing.JButton();
        jShowpass = new javax.swing.JCheckBox();
        jPassHide = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        txtEmail_Num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail_Num.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail_Num.setText("Email or phone number");
        txtEmail_Num.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_NumActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 0, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("__________________________________________________________________");

        btnSignUp.setBackground(new java.awt.Color(0, 204, 0));
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Create new account");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnForgot.setForeground(new java.awt.Color(51, 0, 255));
        btnForgot.setText("Forgot password?");
        btnForgot.setBorder(null);
        btnForgot.setBorderPainted(false);
        btnForgot.setContentAreaFilled(false);
        btnForgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        jShowpass.setText("Show password");
        jShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowpassActionPerformed(evt);
            }
        });

        jPassHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassHideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnForgot)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jShowpass)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(txtEmail_Num, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addComponent(jPassHide))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtEmail_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPassHide, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jShowpass)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnForgot)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(350, 100, 380, 280);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("facebook");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 90, 220, 120);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("Connect with friend and the world ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 170, 220, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("around you on Facebook.");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 170, 220, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void txtEmail_NumActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String emailNum = txtEmail_Num.getText();
        String password = String.valueOf(jPassHide.getPassword());

        if (emailNum.isEmpty() || emailNum.equals("Email or phone number") || password.isEmpty() || password.equals("Password")) {
            JOptionPane.showMessageDialog(this, "Please enter both email/number and password!", "Empty Fields", JOptionPane.WARNING_MESSAGE);

            // Set the red border for the text fields when login fails due to empty fields
            if (emailNum.isEmpty() || emailNum.equals("Email or phone number")) {
                txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            if (password.isEmpty() || password.equals("Password")) {
                jPassHide.setBorder(BorderFactory.createLineBorder(Color.RED));
            } else {
                jPassHide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            }
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("FacebookInformation.txt"))) {
            String line;
            boolean loggedIn = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains("Email/Num.: " + emailNum) && reader.readLine().contains("Password: " + password)) {
                    loggedIn = true;
                    break;
                }
            }

            if (loggedIn) {
                // Clear the text fields if login is successful
                txtEmail_Num.setText("Email or phone number");
                jPassHide.setText("Password");
                JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid email/number or password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "File does not exist or an error occurred!", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                        

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {                                          
        SignUp x = new SignUp();
        x.show();
        this.hide();
    }                                         

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {                                          
        JOptionPane.showMessageDialog(this, "Balik buhat account uyy!", "Wakoy labot, muna bungwon man!", JOptionPane.WARNING_MESSAGE);
        SignUp x = new SignUp();
        x.show();
        this.hide();
    }                                         

    private void jShowpassActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(jShowpass.isSelected()){
            jPassHide.setEchoChar((char)0);
        }else{
            jPassHide.setEchoChar('*');
        }
    }                                         
    private void customizeTextFields() {
    // ... (other existing code remains unchanged)

    txtEmail_Num.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtEmail_Num.getText().equals("Email or phone number")) {
                txtEmail_Num.setText("");
                txtEmail_Num.setForeground(Color.BLACK);
            }
            // Set the border color to black when the text field is focused
            txtEmail_Num.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtEmail_Num.getText().isEmpty()) {
                txtEmail_Num.setText("Email or phone number");
                txtEmail_Num.setForeground(Color.GRAY);
            }
        }
    });

    jPassHide.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            char[] pass = jPassHide.getPassword();
            String passText = String.valueOf(pass);
            if (passText.equals("Password")) {
                jPassHide.setText("");
                jPassHide.setEchoChar('*');
                jPassHide.setForeground(Color.BLACK);
            }
            // Set the border color to black when the text field is focused
            jPassHide.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            char[] pass = jPassHide.getPassword();
            String passText = String.valueOf(pass);
            if (passText.isEmpty()) {
                jPassHide.setText("Password");
                jPassHide.setEchoChar((char) 0);
                jPassHide.setForeground(Color.GRAY);
            }
        }
    });
}

    
    private void jPassHideActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPassHide;
    private javax.swing.JCheckBox jShowpass;
    private javax.swing.JTextField txtEmail_Num;
    // End of variables declaration                   
}
