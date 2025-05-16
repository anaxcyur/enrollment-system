/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finals_enrollment;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author aname
 */
public class F16_OnlineEnrollment extends javax.swing.JFrame {
   
    public F16_OnlineEnrollment() {
        initComponents();
        setLocationRelativeTo(null);
        studentname.setBackground(new Color(0, 0, 0, 0));
        year.setBackground(new Color(0, 0, 0, 0));
        term.setBackground(new Color(0, 0, 0, 0));
        section.setBackground(new Color(0, 0, 0, 0));
        course.setBackground(new Color(0, 0, 0, 0));
        
       ArrayList<String> names = Finals_enrollment.name1; // List of names
       ArrayList<String> usernames = Finals_enrollment.username1; // List of usernames
       ArrayList<String> passwords = Finals_enrollment.password1; // List of passwords
    
        
        year.addActionListener(e -> updateSections());
        course.addActionListener(e -> updateSections());
        term.addActionListener(e -> updateSections());
       
        // Assuming you have a String variable to hold the current username
        System.out.println("Current user in cuser: " + Finals_enrollment.cuser);
      
        
            String currentUser = Finals_enrollment.cuser.get(0); 
            int index = Finals_enrollment.username1.indexOf(currentUser);
            if (index != -1) {
                studentname.setText(Finals_enrollment.name1.get(index)); 
            }
            Finals_enrollment.cuser.clear();
    }
     /*public void registerStudent(String studentName, String course, String section) {
        names.add(studentName);
        courses.add(course);
        sections.add(section);

        String professor = findProfessorByCourse(course);
        assignedProfessors.add(professor);
    }*/
    
    private void updateSections() {
    section.removeAllItems();

    String Year = (String) year.getSelectedItem();
    String Course = (String) course.getSelectedItem();
    String Term = (String) term.getSelectedItem();
    Finals_enrollment subj = new Finals_enrollment();
    
    
    //subjects.setLineWrap(true);
    //subjects.setWrapStyleWord(true);
    if (Year == null || Course == null || Term == null) return;

    if ("BS Information Technology".equals(Course)) {
        switch (Year) {
            case "1st":
                section.addItem("401IT");
                section.addItem("402IT");
                if ("1st".equals(Term)){
                    
                    String IT11 = String.join("\n", subj.BSIT_1_1);
                    subjects.setText(IT11);
                }
                else if ("2nd".equals(Term)){
                    String IT12 = String.join("\n", subj.BSIT_1_2);
                    subjects.setText(IT12);
                }
                break;
            case "2nd":
                section.addItem("301IT");
                section.addItem("302IT");
                if ("1st".equals(Term)){
                    
                    String IT21 = String.join("\n", subj.BSIT_2_1);
                    subjects.setText(IT21);
                }
                else if ("2nd".equals(Term)){
                    String IT22 = String.join("\n", subj.BSIT_2_2);
                    subjects.setText(IT22);
                }
                break;
            case "3rd":
                section.addItem("201IT");
                section.addItem("202IT");
                if ("1st".equals(Term)){
                    
                    String IT31 = String.join("\n", subj.BSIT_3_1);
                    subjects.setText(IT31);
                }
                else if ("2nd".equals(Term)){
                    String IT32 = String.join("\n", subj.BSIT_3_2);
                    subjects.setText(IT32);
                }
                break;
            case "4th":
                section.addItem("101IT");
                section.addItem("102IT");
                if ("1st".equals(Term)){
                    
                    String IT41 = String.join("\n", subj.BSIT_4_1);
                    subjects.setText(IT41);
                }
                else if ("2nd".equals(Term)){
                    String IT42 = String.join("\n", subj.BSIT_4_2);
                    subjects.setText(IT42);
                }
                break;
            default:
                break;
        }
    } else if ("BS Psychology".equals(Course)) {
        switch (Year) {
            case "1st":
                section.addItem("401PS");
                section.addItem("402PS");
                if ("1st".equals(Term)){
                    
                    String PS11 = String.join("\n", subj.PSYCH_1_1  );
                    subjects.setText(PS11);
                }
                else if ("2nd".equals(Term)){
                    String PS12 = String.join("\n", subj.PSYCH_1_2);
                    subjects.setText(PS12);
                }
                break;
            case "2nd":
                section.addItem("301PS");
                section.addItem("302PS");
                if ("1st".equals(Term)){
                    
                    String PS21 = String.join("\n", subj.PSYCH_2_1  );
                    subjects.setText(PS21);
                }
                else if ("2nd".equals(Term)){
                    String PS22 = String.join("\n", subj.PSYCH_2_2);
                    subjects.setText(PS22);
                }
                break;
            case "3rd":
                section.addItem("201PS");
                section.addItem("202PS");
                if ("1st".equals(Term)){
                    
                    String PS31 = String.join("\n", subj.PSYCH_3_1  );
                    subjects.setText(PS31);
                }
                else if ("2nd".equals(Term)){
                    String PS32 = String.join("\n", subj.PSYCH_3_2);
                    subjects.setText(PS32);
                }
                break;
            case "4th":
                section.addItem("101PS");
                section.addItem("102PS");
                if ("1st".equals(Term)){
                    
                    String PS41 = String.join("\n", subj.PSYCH_4_1  );
                    subjects.setText(PS41);
                }
                else if ("2nd".equals(Term)){
                    String PS42 = String.join("\n", subj.PSYCH_4_2);
                    subjects.setText(PS42);
                }
                break;
            default:
                break;
        }
    } else if ("BS Nursing".equals(Course)) {
        switch (Year) {
            case "1st":
                section.addItem("401NS");
                section.addItem("402NS");
                if ("1st".equals(Term)){
                    
                    String BSN11 = String.join("\n", subj.BSN_1_1  );
                    subjects.setText(BSN11);
                }
                else if ("2nd".equals(Term)){
                    String BSN12 = String.join("\n", subj.BSN_1_2);
                    subjects.setText(BSN12);
                }
                break;
            case "2nd":
                section.addItem("301NS");
                section.addItem("302NS");
                if ("1st".equals(Term)){
                    
                    String BSN21 = String.join("\n", subj.BSN_2_1  );
                    subjects.setText(BSN21);
                }
                else if ("2nd".equals(Term)){
                    String BSN22 = String.join("\n", subj.BSN_2_2);
                    subjects.setText(BSN22);
                }
                break;
            case "3rd":
                section.addItem("201NS");
                section.addItem("202NS");
                if ("1st".equals(Term)){
                    
                    String BSN31 = String.join("\n", subj.BSN_3_1  );
                    subjects.setText(BSN31);
                }
                else if ("2nd".equals(Term)){
                    String BSN32 = String.join("\n", subj.BSN_3_2);
                    subjects.setText(BSN32);
                }
                break;
            case "4th":
                section.addItem("101NS");
                section.addItem("102NS");
                if ("1st".equals(Term)){
                    
                    String BSN41 = String.join("\n", subj.BSN_4_1  );
                    subjects.setText(BSN41);
                }
                else if ("2nd".equals(Term)){
                    String BSN42 = String.join("\n", subj.BSN_4_2);
                    subjects.setText(BSN42);
                }
                break;
            default:
                break;
        }
    }
          
       
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
        term = new javax.swing.JComboBox<>();
        course = new javax.swing.JComboBox<>();
        section = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        studentname = new javax.swing.JTextField();
        logout = new javax.swing.JButton();
        back = new javax.swing.JButton();
        enrollbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjects = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 550));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        term.setForeground(new java.awt.Color(0, 0, 0));
        term.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd" }));
        term.setBorder(null);
        jPanel1.add(term);
        term.setBounds(150, 300, 340, 40);

        course.setForeground(new java.awt.Color(0, 0, 0));
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BS Information Technology", "BS Psychology", "BS Nursing" }));
        course.setBorder(null);
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        jPanel1.add(course);
        course.setBounds(160, 390, 330, 40);

        section.setForeground(new java.awt.Color(0, 0, 0));
        section.setBorder(null);
        section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionActionPerformed(evt);
            }
        });
        jPanel1.add(section);
        section.setBounds(160, 340, 330, 40);

        year.setForeground(new java.awt.Color(0, 0, 0));
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th" }));
        year.setBorder(null);
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        jPanel1.add(year);
        year.setBounds(150, 250, 340, 40);

        studentname.setEditable(false);
        studentname.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        studentname.setBorder(null);
        studentname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentnameActionPerformed(evt);
            }
        });
        jPanel1.add(studentname);
        studentname.setBounds(210, 212, 290, 30);

        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(790, 500, 80, 30);

        back.setBackground(new java.awt.Color(255, 255, 102));
        back.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Back");
        back.setBorder(null);
        jPanel1.add(back);
        back.setBounds(30, 500, 80, 30);

        enrollbutton.setBackground(new java.awt.Color(102, 255, 102));
        enrollbutton.setForeground(new java.awt.Color(102, 102, 102));
        enrollbutton.setText("Enroll");
        enrollbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(enrollbutton);
        enrollbutton.setBounds(670, 440, 75, 30);

        subjects.setBackground(new java.awt.Color(255, 255, 255));
        subjects.setColumns(20);
        subjects.setForeground(new java.awt.Color(0, 0, 0));
        subjects.setRows(5);
        subjects.setBorder(null);
        jScrollPane1.setViewportView(subjects);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(540, 180, 320, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ENROLMI.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        
    }//GEN-LAST:event_yearActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Finals_enrollment.previousFrame= ("EnrollmentExit");
        new F11_Exit().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void enrollbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollbuttonActionPerformed
        
        String selectedCourse = (String) course.getSelectedItem();
        String selectedYear = (String) year.getSelectedItem();
        String selectedTerm = (String) term.getSelectedItem();
        String selectedSection = (String) section.getSelectedItem();
        String student = studentname.getText().trim();
        
        /*registerStudent(student, selectedCourse, selectedSection);
        years.add(selectedYear);
        terms.add(selectedTerm);
        
        String assignedProfessor = findProfessorByCourse(selectedCourse);
   */
    String enrollmentDetails = """
                               Enrollment Details:
                               Student Name: """ + student + "\n" +
                               "Course: " + selectedCourse + "\n" +
                               "Year: " + selectedYear + "\n" +
                               "Term: " + selectedTerm + "\n" +
                               "Section: " + selectedSection + "\n"+
                               //"Professor: " + assignedProfessor + "\n"+
                               "Please go to the Student Ledger to pay your tuition";
    
    JOptionPane.showMessageDialog(this, enrollmentDetails, "Enrollment Confirmation", JOptionPane.INFORMATION_MESSAGE);
    
        Finals_enrollment.course.add(selectedCourse);
        Finals_enrollment.year.add(selectedYear);
        Finals_enrollment.term.add(selectedTerm);
        Finals_enrollment.section.add(selectedSection);
    }//GEN-LAST:event_enrollbuttonActionPerformed

    private void sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void studentnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentnameActionPerformed

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
            java.util.logging.Logger.getLogger(F16_OnlineEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F16_OnlineEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F16_OnlineEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F16_OnlineEnrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F16_OnlineEnrollment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JButton enrollbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JComboBox<String> section;
    private javax.swing.JTextField studentname;
    private javax.swing.JTextArea subjects;
    private javax.swing.JComboBox<String> term;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
