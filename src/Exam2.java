import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package lms;



/**
 *
 * @author USER
 */
public class Exam2 extends javax.swing.JFrame {
    
     String [] questions = {"1 + 1 = ?","3 - 3 = ?","5 + 5 = ?","10 × 9 =?","100 - 50 = ?"};
    // the last item is the correct answer
    String options [] [] ={{"10","4","2","6","2"},{"7","2","5","0","0"},{"10","8","5","6","10"},{"90","16","5","1","90"},{"100","44","50","20","50"}};
    int index = 0, correct = 0; 
    
    ButtonGroup bg = new ButtonGroup();


    /**
     * Creates new form Exam2
     */
    public Exam2() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        // didn't create same choise in the next quest
        bg.add(jRadioButton1_2);
        bg.add(jRadioButton1_3);
        bg.add(jRadioButton1_4);
        bg.add(jRadioButton1_5);
        
        jButton_Next_QActionPerformed(null);
    }
    
     public void getSelectedOption (JRadioButton rbtn )
    {
        // get the selected value from the radiobutton
        // increment the index 
        // disaple the radiobutton
        // check if the user selected the right answer
        System.out.println(rbtn.getText());
        System.out.println(options[index][4]);
        if (rbtn.getText().equals(options[index][4]))
        {
            correct++;
        }
        
        // to go to the next question
        index++;
        enableRbuttons(false);
    }
    
    //enable / disable radiobutton
    public void enableRbuttons(boolean yes_or_no)
    {
        jRadioButton1_2.setEnabled(yes_or_no);
        jRadioButton1_3.setEnabled(yes_or_no);
        jRadioButton1_4.setEnabled(yes_or_no);
        jRadioButton1_5.setEnabled(yes_or_no);
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
        jRadioButton1_2 = new javax.swing.JRadioButton();
        jRadioButton1_4 = new javax.swing.JRadioButton();
        jRadioButton1_5 = new javax.swing.JRadioButton();
        jRadioButton1_3 = new javax.swing.JRadioButton();
        jButton_Next_Q = new javax.swing.JButton();
        jPanel_Q_Counter = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton1_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1_2.setText("jRadioButton1");
        jRadioButton1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_2ActionPerformed(evt);
            }
        });

        jRadioButton1_4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1_4.setText("jRadioButton1");
        jRadioButton1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_4ActionPerformed(evt);
            }
        });

        jRadioButton1_5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1_5.setText("jRadioButton1");
        jRadioButton1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_5ActionPerformed(evt);
            }
        });

        jRadioButton1_3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1_3.setText("jRadioButton1");
        jRadioButton1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_3ActionPerformed(evt);
            }
        });

        jButton_Next_Q.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Next_Q.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Next_Q.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next_Q.setText("Next");
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });

        jPanel_Q_Counter.setBackground(new java.awt.Color(204, 204, 204));

        Lbl_Question.setBackground(new java.awt.Color(204, 204, 204));
        Lbl_Question.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("Questions Here");

        javax.swing.GroupLayout jPanel_Q_CounterLayout = new javax.swing.GroupLayout(jPanel_Q_Counter);
        jPanel_Q_Counter.setLayout(jPanel_Q_CounterLayout);
        jPanel_Q_CounterLayout.setHorizontalGroup(
            jPanel_Q_CounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_CounterLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Lbl_Question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        jPanel_Q_CounterLayout.setVerticalGroup(
            jPanel_Q_CounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Q_CounterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lbl_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Q_Counter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Q_Counter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1_5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1_4)
                .addGap(186, 186, 186)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_2ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton1_2);
    }//GEN-LAST:event_jRadioButton1_2ActionPerformed

    private void jRadioButton1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_4ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton1_4);
    }//GEN-LAST:event_jRadioButton1_4ActionPerformed

    private void jRadioButton1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_5ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton1_5);
    }//GEN-LAST:event_jRadioButton1_5ActionPerformed

    private void jRadioButton1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_3ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton1_3);
    }//GEN-LAST:event_jRadioButton1_3ActionPerformed

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed

        //        if (jButton_Next_Q.getText ().equals("Restart The Quiz") )
        //        {
            //            //restart the quiz
            //            index = 0;
            //            correct = 0;
            //        }

        if (index == questions.length)
        {
            // display the user score
            Lbl_Question.setText("Your Score is :" +correct+ "/" +questions.length);

        }

        else {
            // enable radio buttons
            enableRbuttons(true);

            // display the next question:
            Lbl_Question.setText(questions [index]);
            jRadioButton1_2.setText(options [index][0]);
            jRadioButton1_3.setText(options [index][1]);
            jRadioButton1_4.setText(options [index][2]);
            jRadioButton1_5.setText(options [index][3]);

            if (index == questions.length-1){
                jButton_Next_Q.setText("Finish and See the Result");

            }

        }

        // clear the selection
        bg.clearSelection();
    }//GEN-LAST:event_jButton_Next_QActionPerformed

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
            java.util.logging.Logger.getLogger(Exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exam2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Q_Counter;
    private javax.swing.JRadioButton jRadioButton1_2;
    private javax.swing.JRadioButton jRadioButton1_3;
    private javax.swing.JRadioButton jRadioButton1_4;
    private javax.swing.JRadioButton jRadioButton1_5;
    // End of variables declaration//GEN-END:variables
}
