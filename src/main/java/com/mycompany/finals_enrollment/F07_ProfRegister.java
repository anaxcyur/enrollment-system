package com.mycompany.finals_enrollment;


import com.mycompany.finals_enrollment.Finals_enrollment;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aname
 */
public class F07_ProfRegister extends javax.swing.JFrame {

    /**
     * Creates new form F07_ProfRegister
     */
    public F07_ProfRegister() {
        initComponents();
        setLocationRelativeTo(null);
        prof_name.setBackground(new Color(0, 0, 0, 0));
        prof_username.setBackground(new Color(0, 0, 0, 0));
        prof_pass.setBackground(new Color(0, 0, 0, 0));
        prof_conpass.setBackground(new Color(0, 0, 0, 0));
        
        
        
        
        
        ActionListener sharedLoginListener = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            prof_enterActionPerformed(evt);
        }
    };

        prof_name.addActionListener(sharedLoginListener);
        prof_username.addActionListener(sharedLoginListener);
        prof_pass.addActionListener(sharedLoginListener);
        prof_conpass.addActionListener(sharedLoginListener);
        
        
    }
    public String capitalizeWords(String input) {
        String[] words = input.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1))
                  .append(" ");
            }
        }
        

    return sb.toString().trim(); // remove the trailing space
}
        private boolean isValidInput(String input) {
            if (input.length() < 5) return false;

            boolean hasUpper = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            for (char ch : input.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpper = true;
                else if (Character.isDigit(ch)) hasDigit = true;
                else if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
            }

            return hasUpper && hasDigit && hasSpecial;
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
        prof_username = new javax.swing.JTextField();
        prof_name = new javax.swing.JTextField();
        prof_conpass = new javax.swing.JPasswordField();
        prof_pass = new javax.swing.JPasswordField();
        unhide = new javax.swing.JButton();
        unhide1 = new javax.swing.JButton();
        prof_enter = new javax.swing.JButton();
        prof_back = new javax.swing.JButton();
        prof_clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 550));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        prof_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prof_username.setBorder(null);
        jPanel1.add(prof_username);
        prof_username.setBounds(400, 270, 170, 30);

        prof_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prof_name.setBorder(null);
        prof_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prof_nameActionPerformed(evt);
            }
        });
        jPanel1.add(prof_name);
        prof_name.setBounds(370, 222, 200, 30);

        prof_conpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prof_conpass.setBorder(null);
        jPanel1.add(prof_conpass);
        prof_conpass.setBounds(450, 350, 130, 30);

        prof_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prof_pass.setBorder(null);
        jPanel1.add(prof_pass);
        prof_pass.setBounds(390, 310, 180, 30);

        unhide.setBorderPainted(false);
        unhide.setContentAreaFilled(false);
        unhide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unhideActionPerformed(evt);
            }
        });
        jPanel1.add(unhide);
        unhide.setBounds(590, 310, 30, 20);

        unhide1.setBorderPainted(false);
        unhide1.setContentAreaFilled(false);
        unhide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unhide1ActionPerformed(evt);
            }
        });
        jPanel1.add(unhide1);
        unhide1.setBounds(590, 360, 30, 20);

        prof_enter.setBorderPainted(false);
        prof_enter.setContentAreaFilled(false);
        prof_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prof_enterActionPerformed(evt);
            }
        });
        jPanel1.add(prof_enter);
        prof_enter.setBounds(460, 420, 70, 30);

        prof_back.setBorderPainted(false);
        prof_back.setContentAreaFilled(false);
        prof_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prof_backActionPerformed(evt);
            }
        });
        jPanel1.add(prof_back);
        prof_back.setBounds(580, 500, 70, 30);

        prof_clear.setBorderPainted(false);
        prof_clear.setContentAreaFilled(false);
        prof_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prof_clearActionPerformed(evt);
            }
        });
        jPanel1.add(prof_clear);
        prof_clear.setBounds(370, 420, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prof_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prof_enterActionPerformed
        String name = prof_name.getText();
        name = capitalizeWords(name);  
        prof_name.setText(name);
    
        String username = prof_username.getText();
        String password = prof_pass.getText();
        String confirmpass = prof_conpass.getText();
        
        if (name.length() < 3) {
            JOptionPane.showMessageDialog(null, "Name must be at least 3 letters long.");
            prof_name.setText("");
            return;
        }

        if (username.length()<5) {
            JOptionPane.showMessageDialog(null, "Username must be at least 5 characters long");
            prof_pass.setText("");
            return;
        }

        if (!isValidInput(password)) {
            JOptionPane.showMessageDialog(null, "Password must be at least 5 characters long and include an uppercase letter, a number, and a special character.");
            prof_pass.setText("");
            return;
        }

        if (!isValidInput(confirmpass)) {
            JOptionPane.showMessageDialog(null,"Wrong Password");
            prof_conpass.setText("");            
            return;
            
        }

        if (!password.equals(confirmpass)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match. Please confirm the password again.");
            prof_conpass.setText("");
            return;
        
        }

        Finals_enrollment.username.add(username);
        Finals_enrollment.password.add(password);
        Finals_enrollment.name.add(name);
        JOptionPane.showMessageDialog(null, "New Account Registered!");
       

        prof_name.setText("");
        prof_username.setText("");
        prof_pass.setText("");
        prof_conpass.setText("");
        

    }//GEN-LAST:event_prof_enterActionPerformed

    private void prof_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prof_clearActionPerformed
        prof_pass.setText("");
            prof_conpass.setText("");
            prof_name.setText("");
            prof_username.setText("");
    }//GEN-LAST:event_prof_clearActionPerformed

    private void prof_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prof_backActionPerformed
        Finals_enrollment.previousFrame= ("ProfessorRegister");
        new F08_Back().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_prof_backActionPerformed

    private void prof_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prof_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prof_nameActionPerformed

    private void unhideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unhideActionPerformed
         if (prof_pass.getEchoChar() == '*') {  
             prof_pass.setEchoChar((char) 0);  
    } 
        else {
            prof_pass.setEchoChar('*'); 
         }   
    }//GEN-LAST:event_unhideActionPerformed

    private void unhide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unhide1ActionPerformed
        if (prof_conpass.getEchoChar() == '*') {  
             prof_conpass.setEchoChar((char) 0);  
    } 
        else {
            prof_conpass.setEchoChar('*'); 
         }
    }//GEN-LAST:event_unhide1ActionPerformed

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
            java.util.logging.Logger.getLogger(F07_ProfRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F07_ProfRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F07_ProfRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F07_ProfRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F07_ProfRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton prof_back;
    private javax.swing.JButton prof_clear;
    private javax.swing.JPasswordField prof_conpass;
    private javax.swing.JButton prof_enter;
    private javax.swing.JTextField prof_name;
    private javax.swing.JPasswordField prof_pass;
    private javax.swing.JTextField prof_username;
    private javax.swing.JButton unhide;
    private javax.swing.JButton unhide1;
    // End of variables declaration//GEN-END:variables
}
