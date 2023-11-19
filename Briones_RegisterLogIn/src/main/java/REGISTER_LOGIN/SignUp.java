/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package REGISTER_LOGIN;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        addFocusListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SIGNUP = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtEmail_Number = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtPass2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnSignUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBacktoLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGNUP");

        SIGNUP.setBackground(new java.awt.Color(255, 255, 255));
        SIGNUP.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Sign Up");

        txtFname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFname.setForeground(new java.awt.Color(204, 204, 204));
        txtFname.setText("Firstname");
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
        });
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        txtLname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLname.setForeground(new java.awt.Color(204, 204, 204));
        txtLname.setText("Lastname");
        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
        });

        txtEmail_Number.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail_Number.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail_Number.setText("Email or number");
        txtEmail_Number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmail_NumberFocusGained(evt);
            }
        });
        txtEmail_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_NumberActionPerformed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("Password");
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        txtPass2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPass2.setForeground(new java.awt.Color(204, 204, 204));
        txtPass2.setText("Confirm password");
        txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass2FocusGained(evt);
            }
        });

        jCheckBox1.setText("I agree to the terms of use");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(0, 204, 0));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("It's quick and easy.");

        btnBacktoLogin.setForeground(new java.awt.Color(51, 0, 255));
        btnBacktoLogin.setText("Already have an account");
        btnBacktoLogin.setBorder(null);
        btnBacktoLogin.setBorderPainted(false);
        btnBacktoLogin.setContentAreaFilled(false);
        btnBacktoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBacktoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLname))
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnBacktoLogin)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtEmail_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBacktoLogin)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SIGNUPLayout = new javax.swing.GroupLayout(SIGNUP);
        SIGNUP.setLayout(SIGNUPLayout);
        SIGNUPLayout.setHorizontalGroup(
            SIGNUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SIGNUPLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        SIGNUPLayout.setVerticalGroup(
            SIGNUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SIGNUPLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SIGNUP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(SIGNUP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        SIGNUP.getAccessibleContext().setAccessibleName("SIGNUP");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        
    }//GEN-LAST:event_txtFnameActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
    String fname = txtFname.getText().trim();
    String lname = txtLname.getText().trim();
    String email_num = txtEmail_Number.getText().trim();
    String pass = txtPass.getText();
    String pass2 = txtPass2.getText();

    boolean errorOccurred = false;

    if (!pass.equals(pass2)) {
        setErrorText("Passwords do not match!", txtPass2);
        setErrorBorder(txtPass2);
        errorOccurred = true;
    } else {
        clearErrorText(txtPass2);
    }
    if (pass.isEmpty()) {
        setErrorText("Please input a password.", txtPass);
        setErrorBorder(txtPass);
        errorOccurred = true;
    } else {
        clearErrorText(txtPass);
    }
    if (pass2.isEmpty()) {
        setErrorText("Please confirm password.", txtPass2);
        setErrorBorder(txtPass2);
        errorOccurred = true;
    } else {
        clearErrorText(txtPass2);
    }

    if (fname.isEmpty()) {
        setErrorText("Please input the first name.", txtFname);
        setErrorBorder(txtFname);
        errorOccurred = true;
    } else {
        clearErrorText(txtFname);
    }

    if (lname.isEmpty()) {
        setErrorText("Please input the last name.", txtLname);
        setErrorBorder(txtLname);
        errorOccurred = true;
    } else {
        clearErrorText(txtLname);
    }

    if (email_num.isEmpty()) {
        setErrorText("Please input an email or number!", txtEmail_Number);
        setErrorBorder(txtEmail_Number);
        errorOccurred = true;
    } else {
        clearErrorText(txtEmail_Number);
    }
    if (!jCheckBox1.isSelected()) {
        JOptionPane.showMessageDialog(this, "Please agree to the terms of use!", "Error", JOptionPane.ERROR_MESSAGE);
        errorOccurred = true;
    }

        if (!errorOccurred) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("FacebookInformation.txt", true)); // Append to the file

                writer.write("Name: " + fname + " " + lname);
                writer.newLine();
                writer.write("Email/Num.: " + email_num);
                writer.newLine();
                writer.write("Password: " + pass);
                writer.newLine();
                writer.write("--------------------------------------------------");
                writer.newLine();
                writer.close();

                JOptionPane.showMessageDialog(this, "Facebook account has been createed successfully!", "Registration Successful", JOptionPane.INFORMATION_MESSAGE);
                txtFname.setText("");
                txtLname.setText("");
                txtEmail_Number.setText("");
                txtPass.setText("");
                txtPass2.setText("");
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error occurred while saving data!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSignUpActionPerformed
    private void clearErrorText(javax.swing.JTextField textField) {
        textField.setForeground(Color.BLACK);
    }
    private void setErrorText(String message, javax.swing.JTextField textField) {
        textField.setText(message);
        textField.setForeground(Color.BLACK);
    }
    private void setErrorBorder(javax.swing.JTextField textField) {
        textField.setBorder(BorderFactory.createLineBorder(Color.RED));
    }
    private void setNormalBorder(javax.swing.JTextField textField) {
        textField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
    }
    
    private void txtEmail_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_NumberActionPerformed
        
    }//GEN-LAST:event_txtEmail_NumberActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusGained
        clearTextField(txtFname, "Firstname");
        setNormalBorder(txtFname);
        txtFname.setForeground(Color.BLACK); 
        setErrorText("", txtFname);
    }//GEN-LAST:event_txtFnameFocusGained

    private void txtLnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLnameFocusGained
        clearTextField(txtLname, "Lastname");
        setNormalBorder(txtLname);
        txtLname.setForeground(Color.BLACK); 
        setErrorText("", txtLname);
    }//GEN-LAST:event_txtLnameFocusGained

    private void txtEmail_NumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmail_NumberFocusGained
        clearTextField(txtEmail_Number, "Email or number");
        setNormalBorder(txtEmail_Number);
        txtEmail_Number.setForeground(Color.BLACK); 
        setErrorText("", txtEmail_Number);
    }//GEN-LAST:event_txtEmail_NumberFocusGained

    private void txtPass2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass2FocusGained
        clearTextField(txtPass2, "Confirm password");
        setNormalBorder(txtPass2);
        txtPass2.setForeground(Color.BLACK); 
        setErrorText("", txtPass2);
    }//GEN-LAST:event_txtPass2FocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        clearTextField(txtPass, "Password");
        setNormalBorder(txtPass);
        txtPass.setForeground(Color.BLACK);
        setErrorText("", txtPass);
    }//GEN-LAST:event_txtPassFocusGained

    private void btnBacktoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoLoginActionPerformed
        LOGIN x = new LOGIN();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnBacktoLoginActionPerformed
    private void clearTextField(javax.swing.JTextField textField, String defaultText) {
        if (textField.getText().equals(defaultText)) {
            textField.setText("");
        }
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SIGNUP;
    private javax.swing.JButton btnBacktoLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail_Number;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPass2;
    // End of variables declaration//GEN-END:variables

    private void addFocusListeners() {
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
        });

        txtLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLnameFocusGained(evt);
            }
        });

        txtEmail_Number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmail_NumberFocusGained(evt);
            }
        });

        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });

        txtPass2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass2FocusGained(evt);
            }
        });
    }
}
