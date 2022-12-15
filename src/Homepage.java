
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author A M A
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public Homepage() {
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

        CloseButton = new javax.swing.JButton();
        StudentButton = new javax.swing.JButton();
        TeacherButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseButton.setBackground(new java.awt.Color(255, 255, 255));
        CloseButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(0, 0, 0));
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        CloseButton.setText("Exit");
        CloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        StudentButton.setBackground(new java.awt.Color(51, 153, 255));
        StudentButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StudentButton.setForeground(new java.awt.Color(0, 0, 0));
        StudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N
        StudentButton.setText("Student");
        StudentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(StudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        TeacherButton.setBackground(new java.awt.Color(255, 204, 68));
        TeacherButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TeacherButton.setForeground(new java.awt.Color(0, 0, 0));
        TeacherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index admin.png"))); // NOI18N
        TeacherButton.setText("Teacher");
        TeacherButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TeacherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -2, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"do you realy want to exit the application ?","select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void TeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginTeacher().setVisible(true);
    }//GEN-LAST:event_TeacherButtonActionPerformed

    private void StudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new RegisteredCourses().setVisible(true);
    }//GEN-LAST:event_StudentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton StudentButton;
    private javax.swing.JButton TeacherButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
