/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;
 import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author A M A
 */
public class QuestionManagement extends javax.swing.JFrame {
    public static int open = 0 ;
    /**
     * /*Creates new form Teacher_Homapage*/
   
    public QuestionManagement() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Add_New_Question = new javax.swing.JMenu();
        Update_Question = new javax.swing.JMenu();
        Delete_Question = new javax.swing.JMenu();
        All_Questions = new javax.swing.JMenu();
        All_Studends_Results = new javax.swing.JMenu();
        logOut = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setBackground(new java.awt.Color(255, 204, 0));
        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BackButton.setText("Back");
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 600, -1, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(255, 153, 0))); // NOI18N

        Add_New_Question.setText("Add New Question");
        Add_New_Question.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add_New_Question.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add_New_Question.setMargin(new java.awt.Insets(0, 6, 0, 32));
        Add_New_Question.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_New_QuestionMouseClicked(evt);
            }
        });
        jMenuBar1.add(Add_New_Question);

        Update_Question.setText("Update Question");
        Update_Question.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update_Question.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Update_Question.setMargin(new java.awt.Insets(0, 5, 0, 30));
        Update_Question.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update_QuestionMouseClicked(evt);
            }
        });
        jMenuBar1.add(Update_Question);

        Delete_Question.setText("Delete Question");
        Delete_Question.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete_Question.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Delete_Question.setMargin(new java.awt.Insets(0, 5, 0, 30));
        Delete_Question.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete_QuestionMouseClicked(evt);
            }
        });
        jMenuBar1.add(Delete_Question);

        All_Questions.setText("All Questions");
        All_Questions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        All_Questions.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        All_Questions.setMargin(new java.awt.Insets(0, 5, 0, 30));
        All_Questions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                All_QuestionsMouseClicked(evt);
            }
        });
        jMenuBar1.add(All_Questions);

        All_Studends_Results.setText("All Studends Results");
        All_Studends_Results.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        All_Studends_Results.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        All_Studends_Results.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenuBar1.add(All_Studends_Results);

        logOut.setText("Log out");
        logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        logOut.setMargin(new java.awt.Insets(0, 5, 0, 30));
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });
        jMenuBar1.add(logOut);

        exit.setText("Exit");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        exit.setMargin(new java.awt.Insets(0, 5, 0, 30));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf,"do u realy want to exit app ","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf,"do u realy want to log out","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new LoginTeacher().setVisible(true);
        }
    }//GEN-LAST:event_logOutMouseClicked

    private void Add_New_QuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_New_QuestionMouseClicked
        // TODO add your handling code here:
        if(open==0) 
        {
            new AddNewQuestion().setVisible(true);
            open = 1 ; 
        }
        else
        {
            JFrame jf = new JFrame();           
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf , "one form is allready open ");
        }
    }//GEN-LAST:event_Add_New_QuestionMouseClicked

    private void Update_QuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_QuestionMouseClicked
        // TODO add your handling code here:
         if(open==0) 
        {
            new updateQuestion().setVisible(true);
            open = 1 ; 
        }
        else
        {
            JFrame jf = new JFrame();           
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf , "one form is allready open ");
        }
    }//GEN-LAST:event_Update_QuestionMouseClicked

    private void All_QuestionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_All_QuestionsMouseClicked
        // TODO add your handling code here:
         if(open==0) 
        {
            new AllQuestions().setVisible(true);
            open = 1 ; 
        }
        else
        {
            JFrame jf = new JFrame();           
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf , "one form is allready open ");
        }
    }//GEN-LAST:event_All_QuestionsMouseClicked

    private void Delete_QuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete_QuestionMouseClicked
        // TODO add your handling code here:
         if(open==0) 
        {
            new DeleteQuestion().setVisible(true);
            open = 1 ; 
        }
        else
        {
            JFrame jf = new JFrame();           
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf , "one form is allready open ");
        }
    }//GEN-LAST:event_Delete_QuestionMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
         setVisible(false);
         new TeacherHomepage().setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Add_New_Question;
    private javax.swing.JMenu All_Questions;
    private javax.swing.JMenu All_Studends_Results;
    private javax.swing.JButton BackButton;
    private javax.swing.JMenu Delete_Question;
    private javax.swing.JMenu Update_Question;
    private javax.swing.JMenu exit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu logOut;
    // End of variables declaration//GEN-END:variables
}
