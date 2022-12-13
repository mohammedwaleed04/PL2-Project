import java.awt.print.PrinterException;
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CourseMangnment extends javax.swing.JFrame {
    /**
     * Creates new form CourseMangnment
     */
 Connection con;
 DefaultTableModel CourseTable1;
  DefaultTableModel Model1;
    public CourseMangnment() {
    initComponents();  
     this.setLocationRelativeTo(null); 
    CourseTable1 =new DefaultTableModel();
    
        CourseTable1.addColumn("Id");
        CourseTable1.addColumn("Student Name");
        CourseTable1.addColumn("Semester");
        CourseTable1.addColumn("Course (1)");
        CourseTable1.addColumn("Course (2)");
        CourseTable1.addColumn("Course (3)");
        CourseTable1.addColumn("Course (4)");

         Model1 =new DefaultTableModel();
         Model1.addColumn("Week Number");
         Model1.addColumn("Lecture's Tittle");
         Model1.addColumn("Content");
       
     try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsdb", "root", "root");
            
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(this, "Connection Failed");
        }
     
     FillTableModel();
     FillTableModel1();
    }
    
   private void FillTableModel(){
        try{
            CourseTable1.setRowCount(0);
            
          PreparedStatement stmt=con.prepareStatement("select id,name,semester,course1,course2,course3,course4 from CourseTable;");
          
          ResultSet rs = stmt.executeQuery();
        while(rs.next()){
         CourseTable1.addRow(new Object[]{
                                          rs.getString(1),rs.getString(2),
                                          rs.getString(3),rs.getString(4),
                                          rs.getString(5),rs.getString(6),
                                          rs.getString(7)});
                                         }

        CourseTable.setModel(CourseTable1);
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, " Failed");
        }

    }
    private void FillTableModel1(){
        try{
            Model1.setRowCount(0);
            
          PreparedStatement stmt=con.prepareStatement("select * from lecturetable;");
          
          ResultSet rs = stmt.executeQuery();
        while(rs.next()){
         Model1.addRow(new Object[]{
                                          rs.getString(1),
                                          rs.getString(2),
                                          rs.getString(3)
                                         });
                                         }

        LdTable.setModel(Model1);
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, " Failed");
        }

    }
   
      private void FillSearchBox(){
        try{
            CourseTable1.setRowCount(0);
            
          PreparedStatement stmt=con.prepareStatement("select id,name,semester,course1,course2,course3,course4 from CourseTable where id =?;");
         int ID =Integer.parseInt(StdSearchField.getText());
          stmt.setInt(1, ID);
          
          ResultSet rs = stmt.executeQuery();
        while(rs.next())
        {CourseTable1.addRow(new Object[]{rs.getString(1),rs.getString(2),
                                          rs.getString(3),rs.getString(4),
                                          rs.getString(5),rs.getString(6),
                                          rs.getString(7)});
                    }

        CourseTable.setModel(CourseTable1);
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, " Failed");
        }

    }
    
    public int isEmpSearch(){
    if(StdIDSearchField.getText().isEmpty())
    { JOptionPane.showMessageDialog(this, "Student's ID is missing");
       return 1;}
    else
        return 0;
    }
    
    public int isEmpty(){
            if( IdTextField.getText().isEmpty() || StdName.getText().isEmpty() || 
                C1Box.getSelectedItem().toString().equals("*choose course*") || 
                C2Box.getSelectedItem().toString().equals("*choose course*") ||  
                C3Box.getSelectedItem().toString().equals("*choose course*") || 
                C4Box.getSelectedItem().toString().equals("*choose course*"))
                return 1;
     return 0;

            
    }
    
      public int isEmptyLecture(){
            if(  WeekNoLD.getText().isEmpty()
                || LectTittle.getText().isEmpty()
                ||  Conetent1.getText().isEmpty())
               
                return 1;
     return 0;

            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CourseTab = new javax.swing.JTabbedPane();
        CoursePanel = new javax.swing.JPanel();
        AddCoursesPanel = new javax.swing.JPanel();
        StdIdSearchPanel = new javax.swing.JPanel();
        StdIdLabel = new javax.swing.JLabel();
        StdIDSearchField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        IdTextField = new javax.swing.JTextField();
        StdName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        C1Box = new javax.swing.JComboBox<>();
        C2Box = new javax.swing.JComboBox<>();
        C3Box = new javax.swing.JComboBox<>();
        SemesterLabel = new javax.swing.JLabel();
        Course1Label = new javax.swing.JLabel();
        Course2Label = new javax.swing.JLabel();
        Course3Label = new javax.swing.JLabel();
        Course4Label = new javax.swing.JLabel();
        C4Box = new javax.swing.JComboBox<>();
        SemesterTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        SearchStdPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        StdSearchField = new javax.swing.JTextField();
        SearchStdBtn = new javax.swing.JButton();
        RefreshStdBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CourseTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        AddNewBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        LecturePanel = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        LdTable = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        AddWeekLD = new javax.swing.JButton();
        UpdateBtnLD = new javax.swing.JButton();
        DeleteBtnLD = new javax.swing.JButton();
        LogoutBtn4 = new javax.swing.JButton();
        OpenLD = new javax.swing.JButton();
        AddCoursesPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        LectTittle = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        WeekNoLD = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        Conetent1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ItTable = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        AddWeekIT = new javax.swing.JButton();
        UpdateBtnIT = new javax.swing.JButton();
        DeleteBtnIT = new javax.swing.JButton();
        LogoutBtn3 = new javax.swing.JButton();
        PrintBtnIT = new javax.swing.JButton();
        AddCoursesPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        AddCoursesPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contentTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DsTable = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        AddWeekDS = new javax.swing.JButton();
        UpdateBtnDS = new javax.swing.JButton();
        DeleteBtnDS = new javax.swing.JButton();
        LogoutBtn2 = new javax.swing.JButton();
        PrintBtnDS = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        OrTable = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        AddWeekOR = new javax.swing.JButton();
        UpdateBtnOR = new javax.swing.JButton();
        DeleteBtnOR = new javax.swing.JButton();
        LogoutBtn5 = new javax.swing.JButton();
        PrintBtnOR = new javax.swing.JButton();
        AddCoursesPanel15 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        AssignmentsPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        jLabel1.setText("course mangement");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1039, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        CourseTab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CourseTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CourseTab.setPreferredSize(new java.awt.Dimension(1280, 720));

        AddCoursesPanel.setBackground(new java.awt.Color(153, 255, 255));

        StdIdSearchPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        StdIdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StdIdLabel.setText("student's ID");

        StdIDSearchField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        StdIDSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StdIDSearchFieldActionPerformed(evt);
            }
        });
        StdIDSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StdIDSearchFieldKeyTyped(evt);
            }
        });

        SearchBtn.setBackground(new java.awt.Color(204, 0, 51));
        SearchBtn.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StdIdSearchPanelLayout = new javax.swing.GroupLayout(StdIdSearchPanel);
        StdIdSearchPanel.setLayout(StdIdSearchPanelLayout);
        StdIdSearchPanelLayout.setHorizontalGroup(
            StdIdSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StdIdSearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StdIdSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StdIdSearchPanelLayout.createSequentialGroup()
                        .addComponent(StdIdLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(StdIdSearchPanelLayout.createSequentialGroup()
                        .addComponent(StdIDSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        StdIdSearchPanelLayout.setVerticalGroup(
            StdIdSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StdIdSearchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StdIdLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StdIdSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StdIDSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IdTextField.setEditable(false);
        IdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTextFieldActionPerformed(evt);
            }
        });
        IdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdTextFieldKeyTyped(evt);
            }
        });

        StdName.setEditable(false);
        StdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StdNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Student_name");

        C1Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*choose course*", "Logic Design", "IT", "Data Structures", "OR" }));
        C1Box.setToolTipText("select  course");
        C1Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C1Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1BoxActionPerformed(evt);
            }
        });

        C2Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*choose course*", "Logic Design", "IT", "Data Structures", "OR" }));
        C2Box.setToolTipText("select  course");
        C2Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        C2Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2BoxActionPerformed(evt);
            }
        });

        C3Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*choose course*", "Logic Design", "IT", "Data Structures", "OR" }));
        C3Box.setToolTipText("select  course");
        C3Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SemesterLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SemesterLabel.setText("Semester");

        Course1Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Course1Label.setText("Course 1");

        Course2Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Course2Label.setText("Course 2");

        Course3Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Course3Label.setText("Course 3");

        Course4Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Course4Label.setText("Course 4");

        C4Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*choose course*", "Logic Design", "IT", "Data Structures", "OR" }));
        C4Box.setToolTipText("select  course");
        C4Box.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        SemesterTextField.setEditable(false);

        javax.swing.GroupLayout AddCoursesPanelLayout = new javax.swing.GroupLayout(AddCoursesPanel);
        AddCoursesPanel.setLayout(AddCoursesPanelLayout);
        AddCoursesPanelLayout.setHorizontalGroup(
            AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StdIdSearchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCoursesPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddCoursesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(StdName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCoursesPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SemesterLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Course1Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Course2Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Course3Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Course4Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddCoursesPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(C1Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(C2Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(C3Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(C4Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(AddCoursesPanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(SemesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        AddCoursesPanelLayout.setVerticalGroup(
            AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StdIdSearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(StdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SemesterLabel)
                    .addComponent(SemesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course1Label)
                    .addComponent(C1Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C2Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Course2Label))
                .addGap(30, 30, 30)
                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C3Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Course3Label))
                .addGap(27, 27, 27)
                .addGroup(AddCoursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course4Label)
                    .addComponent(C4Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 207, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        SearchStdPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearchStdPanel.setForeground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("Search Student");

        StdSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StdSearchFieldActionPerformed(evt);
            }
        });

        SearchStdBtn.setBackground(new java.awt.Color(51, 102, 255));
        SearchStdBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchStdBtn.setText("Search");
        SearchStdBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearchStdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchStdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStdBtnActionPerformed(evt);
            }
        });

        RefreshStdBtn.setBackground(new java.awt.Color(51, 102, 255));
        RefreshStdBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RefreshStdBtn.setText("Refresh");
        RefreshStdBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RefreshStdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RefreshStdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshStdBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchStdPanelLayout = new javax.swing.GroupLayout(SearchStdPanel);
        SearchStdPanel.setLayout(SearchStdPanelLayout);
        SearchStdPanelLayout.setHorizontalGroup(
            SearchStdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchStdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StdSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchStdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RefreshStdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        SearchStdPanelLayout.setVerticalGroup(
            SearchStdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchStdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchStdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SearchStdPanelLayout.createSequentialGroup()
                        .addComponent(StdSearchField)
                        .addGap(2, 2, 2))
                    .addGroup(SearchStdPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(SearchStdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchStdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RefreshStdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );

        CourseTable.setAutoCreateRowSorter(true);
        CourseTable.setBackground(new java.awt.Color(204, 204, 204));
        CourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student Name", "Semester", "Course 1", "Course 2", "Course 3", "Course 4"
            }
        ));
        CourseTable.setGridColor(new java.awt.Color(102, 204, 255));
        CourseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CourseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CourseTable);

        jPanel10.setBackground(new java.awt.Color(102, 204, 255));

        AddNewBtn.setBackground(new java.awt.Color(51, 153, 255));
        AddNewBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddNewBtn.setText("Add new");
        AddNewBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddNewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(51, 153, 255));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(51, 153, 255));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setBackground(new java.awt.Color(51, 153, 255));
        LogoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutBtn.setText("Log out");
        LogoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(51, 153, 255));
        PrintBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtn.setText("Print");
        PrintBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PrintBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(AddNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchStdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchStdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CoursePanelLayout = new javax.swing.GroupLayout(CoursePanel);
        CoursePanel.setLayout(CoursePanelLayout);
        CoursePanelLayout.setHorizontalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddCoursesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CoursePanelLayout.setVerticalGroup(
            CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddCoursesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        CourseTab.addTab("         Courses            ", CoursePanel);

        jPanel17.setBackground(new java.awt.Color(102, 204, 255));

        LdTable.setAutoCreateRowSorter(true);
        LdTable.setBackground(new java.awt.Color(204, 204, 204));
        LdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Week Number", "Lecture's Tittle", "Content"
            }
        ));
        LdTable.setGridColor(new java.awt.Color(102, 204, 255));
        LdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LdTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(LdTable);

        jPanel18.setBackground(new java.awt.Color(102, 204, 255));

        AddWeekLD.setBackground(new java.awt.Color(51, 153, 255));
        AddWeekLD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddWeekLD.setText("Add Week");
        AddWeekLD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddWeekLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddWeekLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddWeekLDActionPerformed(evt);
            }
        });

        UpdateBtnLD.setBackground(new java.awt.Color(51, 153, 255));
        UpdateBtnLD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtnLD.setText("Update");
        UpdateBtnLD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateBtnLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBtnLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnLDActionPerformed(evt);
            }
        });

        DeleteBtnLD.setBackground(new java.awt.Color(51, 153, 255));
        DeleteBtnLD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtnLD.setText("Delete");
        DeleteBtnLD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteBtnLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtnLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnLDActionPerformed(evt);
            }
        });

        LogoutBtn4.setBackground(new java.awt.Color(51, 153, 255));
        LogoutBtn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutBtn4.setText("Log out");
        LogoutBtn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutBtn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn4ActionPerformed(evt);
            }
        });

        OpenLD.setBackground(new java.awt.Color(51, 153, 255));
        OpenLD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OpenLD.setText("Open");
        OpenLD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OpenLD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OpenLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenLDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(AddWeekLD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(UpdateBtnLD, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(DeleteBtnLD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(OpenLD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(LogoutBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddWeekLD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtnLD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtnLD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenLD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane5)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AddCoursesPanel11.setBackground(new java.awt.Color(102, 102, 102));
        AddCoursesPanel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Lecture's Tittle");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Week Number");

        WeekNoLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeekNoLDActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Add content");

        Conetent1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Conetent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Conetent1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 0));
        jLabel31.setText(" Logic Design Course ");
        jLabel31.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout AddCoursesPanel11Layout = new javax.swing.GroupLayout(AddCoursesPanel11);
        AddCoursesPanel11.setLayout(AddCoursesPanel11Layout);
        AddCoursesPanel11Layout.setHorizontalGroup(
            AddCoursesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(AddCoursesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel25)
                    .addComponent(jLabel31)
                    .addGroup(AddCoursesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LectTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AddCoursesPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addGap(33, 33, 33)
                            .addComponent(WeekNoLD, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Conetent1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        AddCoursesPanel11Layout.setVerticalGroup(
            AddCoursesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel31)
                .addGap(29, 29, 29)
                .addGroup(AddCoursesPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(WeekNoLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LectTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(Conetent1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(AddCoursesPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddCoursesPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("             Logic Design           ", jPanel7);

        jPanel14.setBackground(new java.awt.Color(102, 204, 255));

        ItTable.setAutoCreateRowSorter(true);
        ItTable.setBackground(new java.awt.Color(204, 204, 204));
        ItTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Week Number", "Lecture's Tittle", "Content"
            }
        ));
        ItTable.setGridColor(new java.awt.Color(102, 204, 255));
        ItTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ItTable);

        jPanel15.setBackground(new java.awt.Color(102, 204, 255));

        AddWeekIT.setBackground(new java.awt.Color(51, 153, 255));
        AddWeekIT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddWeekIT.setText("Add Week");
        AddWeekIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddWeekIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddWeekIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddWeekITActionPerformed(evt);
            }
        });

        UpdateBtnIT.setBackground(new java.awt.Color(51, 153, 255));
        UpdateBtnIT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtnIT.setText("Update");
        UpdateBtnIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateBtnIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBtnIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnITActionPerformed(evt);
            }
        });

        DeleteBtnIT.setBackground(new java.awt.Color(51, 153, 255));
        DeleteBtnIT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtnIT.setText("Delete");
        DeleteBtnIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteBtnIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtnIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnITActionPerformed(evt);
            }
        });

        LogoutBtn3.setBackground(new java.awt.Color(51, 153, 255));
        LogoutBtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutBtn3.setText("Log out");
        LogoutBtn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutBtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn3ActionPerformed(evt);
            }
        });

        PrintBtnIT.setBackground(new java.awt.Color(51, 153, 255));
        PrintBtnIT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtnIT.setText("Print");
        PrintBtnIT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PrintBtnIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintBtnIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(AddWeekIT, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(UpdateBtnIT, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(DeleteBtnIT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(PrintBtnIT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(LogoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddWeekIT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtnIT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtnIT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintBtnIT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AddCoursesPanel6.setBackground(new java.awt.Color(102, 102, 102));
        AddCoursesPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Lecture's Tittle");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Week Number");

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Add content");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 0));
        jLabel14.setText("  IT Course  ");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout AddCoursesPanel6Layout = new javax.swing.GroupLayout(AddCoursesPanel6);
        AddCoursesPanel6.setLayout(AddCoursesPanel6Layout);
        AddCoursesPanel6Layout.setHorizontalGroup(
            AddCoursesPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCoursesPanel6Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(AddCoursesPanel6Layout.createSequentialGroup()
                .addGroup(AddCoursesPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCoursesPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(AddCoursesPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addGroup(AddCoursesPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(33, 33, 33)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddCoursesPanel6Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel14))))
                    .addGroup(AddCoursesPanel6Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddCoursesPanel6Layout.setVerticalGroup(
            AddCoursesPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addGap(29, 29, 29)
                .addGroup(AddCoursesPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(AddCoursesPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddCoursesPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("                  IT                    ", jPanel6);

        AddCoursesPanel5.setBackground(new java.awt.Color(102, 102, 102));
        AddCoursesPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lecture's Tittle");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Week Number");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add content");

        contentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText(" Data Structure Course ");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout AddCoursesPanel5Layout = new javax.swing.GroupLayout(AddCoursesPanel5);
        AddCoursesPanel5.setLayout(AddCoursesPanel5Layout);
        AddCoursesPanel5Layout.setHorizontalGroup(
            AddCoursesPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(AddCoursesPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addGroup(AddCoursesPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AddCoursesPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(33, 33, 33)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(contentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        AddCoursesPanel5Layout.setVerticalGroup(
            AddCoursesPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(AddCoursesPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(contentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(102, 204, 255));

        DsTable.setAutoCreateRowSorter(true);
        DsTable.setBackground(new java.awt.Color(204, 204, 204));
        DsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Week Number", "Lecture's Tittle", "Content"
            }
        ));
        DsTable.setGridColor(new java.awt.Color(102, 204, 255));
        DsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DsTable);

        jPanel13.setBackground(new java.awt.Color(102, 204, 255));

        AddWeekDS.setBackground(new java.awt.Color(51, 153, 255));
        AddWeekDS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddWeekDS.setText("Add Week");
        AddWeekDS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddWeekDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddWeekDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddWeekDSActionPerformed(evt);
            }
        });

        UpdateBtnDS.setBackground(new java.awt.Color(51, 153, 255));
        UpdateBtnDS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtnDS.setText("Update");
        UpdateBtnDS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateBtnDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBtnDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnDSActionPerformed(evt);
            }
        });

        DeleteBtnDS.setBackground(new java.awt.Color(51, 153, 255));
        DeleteBtnDS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtnDS.setText("Delete");
        DeleteBtnDS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteBtnDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtnDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnDSActionPerformed(evt);
            }
        });

        LogoutBtn2.setBackground(new java.awt.Color(51, 153, 255));
        LogoutBtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutBtn2.setText("Log out");
        LogoutBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn2ActionPerformed(evt);
            }
        });

        PrintBtnDS.setBackground(new java.awt.Color(51, 153, 255));
        PrintBtnDS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtnDS.setText("Open");
        PrintBtnDS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PrintBtnDS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintBtnDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnDSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(AddWeekDS, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(UpdateBtnDS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(DeleteBtnDS, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(PrintBtnDS, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(LogoutBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddWeekDS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtnDS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtnDS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintBtnDS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(AddCoursesPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddCoursesPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("           Data Structures              ", jPanel5);

        jPanel20.setBackground(new java.awt.Color(102, 204, 255));

        OrTable.setAutoCreateRowSorter(true);
        OrTable.setBackground(new java.awt.Color(204, 204, 204));
        OrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Week Number", "Lecture's Tittle", "Content"
            }
        ));
        OrTable.setGridColor(new java.awt.Color(102, 204, 255));
        OrTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(OrTable);

        jPanel21.setBackground(new java.awt.Color(102, 204, 255));

        AddWeekOR.setBackground(new java.awt.Color(51, 153, 255));
        AddWeekOR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddWeekOR.setText("Add Week");
        AddWeekOR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddWeekOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddWeekOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddWeekORActionPerformed(evt);
            }
        });

        UpdateBtnOR.setBackground(new java.awt.Color(51, 153, 255));
        UpdateBtnOR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateBtnOR.setText("Update");
        UpdateBtnOR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UpdateBtnOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBtnOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnORActionPerformed(evt);
            }
        });

        DeleteBtnOR.setBackground(new java.awt.Color(51, 153, 255));
        DeleteBtnOR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtnOR.setText("Delete");
        DeleteBtnOR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeleteBtnOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtnOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnORActionPerformed(evt);
            }
        });

        LogoutBtn5.setBackground(new java.awt.Color(51, 153, 255));
        LogoutBtn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoutBtn5.setText("Log out");
        LogoutBtn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogoutBtn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtn5ActionPerformed(evt);
            }
        });

        PrintBtnOR.setBackground(new java.awt.Color(51, 153, 255));
        PrintBtnOR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtnOR.setText("Print");
        PrintBtnOR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PrintBtnOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrintBtnOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnORActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(AddWeekOR, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(UpdateBtnOR, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(DeleteBtnOR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(PrintBtnOR, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(LogoutBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddWeekOR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtnOR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtnOR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintBtnOR, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane6)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AddCoursesPanel15.setBackground(new java.awt.Color(102, 102, 102));
        AddCoursesPanel15.setForeground(new java.awt.Color(255, 255, 255));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Lecture's Tittle");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Week Number");

        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Add content");

        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 0));
        jLabel47.setText("  OR Course  ");
        jLabel47.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout AddCoursesPanel15Layout = new javax.swing.GroupLayout(AddCoursesPanel15);
        AddCoursesPanel15.setLayout(AddCoursesPanel15Layout);
        AddCoursesPanel15Layout.setHorizontalGroup(
            AddCoursesPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanel15Layout.createSequentialGroup()
                .addGroup(AddCoursesPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddCoursesPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddCoursesPanel15Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddCoursesPanel15Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(AddCoursesPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel46)
                                .addComponent(jLabel44)
                                .addGroup(AddCoursesPanel15Layout.createSequentialGroup()
                                    .addComponent(jLabel45)
                                    .addGap(33, 33, 33)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCoursesPanel15Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddCoursesPanel15Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel47)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        AddCoursesPanel15Layout.setVerticalGroup(
            AddCoursesPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddCoursesPanel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel47)
                .addGap(28, 28, 28)
                .addGroup(AddCoursesPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(AddCoursesPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddCoursesPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("                        OR                          ", jPanel19);

        javax.swing.GroupLayout LecturePanelLayout = new javax.swing.GroupLayout(LecturePanel);
        LecturePanel.setLayout(LecturePanelLayout);
        LecturePanelLayout.setHorizontalGroup(
            LecturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        LecturePanelLayout.setVerticalGroup(
            LecturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LecturePanelLayout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        CourseTab.addTab("                 Lectures           ", LecturePanel);

        javax.swing.GroupLayout AssignmentsPanelLayout = new javax.swing.GroupLayout(AssignmentsPanel);
        AssignmentsPanel.setLayout(AssignmentsPanelLayout);
        AssignmentsPanelLayout.setHorizontalGroup(
            AssignmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1283, Short.MAX_VALUE)
        );
        AssignmentsPanelLayout.setVerticalGroup(
            AssignmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );

        CourseTab.addTab("                Assignments               ", AssignmentsPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CourseTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CourseTab, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StdIDSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StdIDSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StdIDSearchFieldActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
     isEmpSearch();
     boolean flag=true;
     int StdID =Integer.parseInt(StdIDSearchField.getText());
     try {
         PreparedStatement stmt=con.prepareStatement("select id,name,semester from CourseTable where id =?;");
          stmt.setInt(1, StdID);
          
          ResultSet rs = stmt.executeQuery();
          
        while(rs.next()){
            
            IdTextField.setText(rs.getString(1));
            StdName.setText(rs.getString(2));
            SemesterTextField.setText(rs.getString(3));
            flag=false;}
     
     if(!rs.next()&& flag )
            JOptionPane.showMessageDialog(this, "not found");
          
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(this, "Error");
     }
        
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void IdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextFieldActionPerformed

    private void StdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StdNameActionPerformed

    private void SearchStdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStdBtnActionPerformed
        // TODO add your handling code here:
 
       if (StdSearchField.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Please enter a student ID");
       } else{ 
           FillSearchBox();
           
       }
        
    }//GEN-LAST:event_SearchStdBtnActionPerformed

    private void AddNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewBtnActionPerformed
     // TODO add your handling code here:
       if(isEmpty() == 0){
        try{
                    int ID =Integer.parseInt(IdTextField.getText());
                    String StudentName=StdName.getText();
                    int Semester = Integer.parseInt(SemesterTextField.getText());
                    String Course1 =C1Box.getSelectedItem().toString();
                    String Course2 =C2Box.getSelectedItem().toString();
                    String Course3 =C3Box.getSelectedItem().toString();
                    String Course4 =C4Box.getSelectedItem().toString();
         
                    PreparedStatement stmt=con.prepareStatement("insert into CourseTable (id,name,semester,course1,course2,course3,course4) values(?,?,?,?,?,?,?);");
                    
                    stmt.setInt(1, ID);
                    stmt.setString(2, StudentName);
                    stmt.setInt(3, Semester);
                    stmt.setString(4, Course1);
                    stmt.setString(5, Course2);
                    stmt.setString(6, Course3);
                    stmt.setString(7, Course4);
                    stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added succsefully");         
                    
                FillTableModel();
     
        }   catch (SQLException ex) {
             
                 JOptionPane.showMessageDialog(this, "Error: Id is Dublicate! ");  
            }
        }
       else
           JOptionPane.showMessageDialog(this, "Missing fields! ");
           
        
    }//GEN-LAST:event_AddNewBtnActionPerformed

    private void C1BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1BoxActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
    int a = JOptionPane.showConfirmDialog(this,"Do you want to logout now?","logout",JOptionPane.YES_NO_OPTION);
    if(a==0){
    this.dispose();}
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void IdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTextFieldKeyPressed

    private void IdTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdTextFieldKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
    }//GEN-LAST:event_IdTextFieldKeyTyped
    }
    
    private void StdIDSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StdIDSearchFieldKeyTyped
        // TODO add your handling code here:
              if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
    }   
    }//GEN-LAST:event_StdIDSearchFieldKeyTyped

    private void C2BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C2BoxActionPerformed

    private void CourseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CourseTableMouseClicked
        // TODO add your handling code here:
     IdTextField.setText((String) CourseTable.getValueAt(CourseTable.getSelectedRow(),0));
     StdName.setText((String) CourseTable.getValueAt(CourseTable.getSelectedRow(),1));
     SemesterTextField.setText((String) CourseTable.getValueAt(CourseTable.getSelectedRow(),2));
     C1Box.setSelectedItem(CourseTable.getValueAt(CourseTable.getSelectedRow(),3));
     C2Box.setSelectedItem(CourseTable.getValueAt(CourseTable.getSelectedRow(),4));
     C3Box.setSelectedItem(CourseTable.getValueAt(CourseTable.getSelectedRow(),5));
     C4Box.setSelectedItem(CourseTable.getValueAt(CourseTable.getSelectedRow(),6));
    }//GEN-LAST:event_CourseTableMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
       if(isEmpty()==0){
        try{
            
                    int ID =Integer.parseInt(IdTextField.getText());
                    String StudentName=StdName.getText();
                    int Semester = Integer.parseInt(SemesterTextField.getText());
                    String Course1 =C1Box.getSelectedItem().toString();
                    String Course2 =C2Box.getSelectedItem().toString();
                    String Course3 =C3Box.getSelectedItem().toString();
                    String Course4 =C4Box.getSelectedItem().toString();
         
                    PreparedStatement stmt=con.prepareStatement("update CourseTable set id=?,name=?,semester=?,course1=?,course2=?,course3=?,course4=? where id=?;");
                    
                    stmt.setInt(1, ID);
                    stmt.setString(2, StudentName);
                    stmt.setInt(3, Semester);
                    stmt.setString(4, Course1);
                    stmt.setString(5, Course2);
                    stmt.setString(6, Course3);
                    stmt.setString(7, Course4);
                    stmt.setInt(8,Integer.parseInt(IdTextField.getText()) );
                    stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "updated succsefully");         
                    
                FillTableModel();
     
        }   catch (SQLException ex) {
              /*  Logger.getLogger(CourseMangnment.class.getName()).log(Level.SEVERE, null, ex);*/
                 JOptionPane.showMessageDialog(this, "Error Id is Dublicate! ");  
        }
       }
        else
           JOptionPane.showMessageDialog(this, "Empty fields! ");
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        if(isEmpty()==0){
         try{
             PreparedStatement stmt=con.prepareStatement("delete from CourseTable where id=?;");   
                    stmt.setInt(1,Integer.parseInt(IdTextField.getText()) );
                    stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted succsefully");         
                    
                FillTableModel();
     
        }   catch (SQLException ex) {
              /*  Logger.getLogger(CourseMangnment.class.getName()).log(Level.SEVERE, null, ex);*/
                 JOptionPane.showMessageDialog(this, "Error: Empty Fields!");  
            }}
         else
           JOptionPane.showMessageDialog(this, "No fields are selected !");
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void StdSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StdSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StdSearchFieldActionPerformed

    private void RefreshStdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshStdBtnActionPerformed
        // TODO add your handling code here:
          FillTableModel();
    }//GEN-LAST:event_RefreshStdBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Course Regestration");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        
        try {
        CourseTable.print(JTable.PrintMode.NORMAL, header, footer);
        }catch (PrinterException ex) {
         Logger.getLogger(CourseMangnment.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void DsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DsTableMouseClicked

    private void AddWeekDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddWeekDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddWeekDSActionPerformed

    private void UpdateBtnDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnDSActionPerformed

    private void DeleteBtnDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnDSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnDSActionPerformed

    private void LogoutBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutBtn2ActionPerformed

    private void ItTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ItTableMouseClicked

    private void AddWeekITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddWeekITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddWeekITActionPerformed

    private void UpdateBtnITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnITActionPerformed

    private void DeleteBtnITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnITActionPerformed

    private void LogoutBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutBtn3ActionPerformed

    private void PrintBtnITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnITActionPerformed

    private void LdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LdTableMouseClicked
        // TODO add your handling code here:
          WeekNoLD.setText((String) Model1.getValueAt(LdTable.getSelectedRow(),0));
     LectTittle.setText((String) Model1.getValueAt(LdTable.getSelectedRow(),1));
     Conetent1.setText((String) Model1.getValueAt(LdTable.getSelectedRow(),2));

    
    }//GEN-LAST:event_LdTableMouseClicked

    private void AddWeekLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddWeekLDActionPerformed
   if(isEmptyLecture() == 0){
        try{
                    int WeekNo =Integer.parseInt(WeekNoLD.getText());
                    String Tittle1=LectTittle.getText();
                    String Content = Conetent1.getText();
                   
                    PreparedStatement stmt=con.prepareStatement("insert into lecturetable  values(?,?,?);");
                    
                    stmt.setInt(1, WeekNo);
                    stmt.setString(2, Tittle1);
                    stmt.setString(3, Content);
                   
                    stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added succsefully");         
                    
                FillTableModel1();
     
        }   catch (SQLException ex) {
             
                 JOptionPane.showMessageDialog(this, "Error : Week Number is Dublicate! ");  
            }
    }
       else
    JOptionPane.showMessageDialog(this, "Missing fields! ");
           
        
    
    }//GEN-LAST:event_AddWeekLDActionPerformed

    private void UpdateBtnLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnLDActionPerformed
        // TODO add your handling code here:
               if(isEmptyLecture()==0){
        try{
            
                   int WeekNo =Integer.parseInt(WeekNoLD.getText());
                    String Tittle1=LectTittle.getText();
                    String Content = Conetent1.getText();
         
                    PreparedStatement stmt=con.prepareStatement("update LectureTable set WeekNO=?,LectureTittle=?,Content=? where WeekNo=?;");
                    
                    stmt.setInt(1, WeekNo);
                    stmt.setString(2, Tittle1);
                    stmt.setString(3, Content);
                    stmt.setInt(4, Integer.parseInt(WeekNoLD.getText()));
                  
                    stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "updated succsefully");         
                    
                FillTableModel1();
     
        }   catch (SQLException ex) {
              /*  Logger.getLogger(CourseMangnment.class.getName()).log(Level.SEVERE, null, ex);*/
                 JOptionPane.showMessageDialog(this, "Error Week Number is Dublicate! ");  
        }
       }
        else
           JOptionPane.showMessageDialog(this, "Empty fields! ");
    }//GEN-LAST:event_UpdateBtnLDActionPerformed

    private void DeleteBtnLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnLDActionPerformed
        // TODO add your handling code here:
                if(isEmptyLecture()==0){
         try{
             PreparedStatement stmt=con.prepareStatement("delete from LectureTable where WeekNO=?;");   
                    stmt.setInt(1,Integer.parseInt(WeekNoLD.getText()) );
                    stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted succsefully");         
                    
                FillTableModel1();
     
        }   catch (SQLException ex) {
              /*  Logger.getLogger(CourseMangnment.class.getName()).log(Level.SEVERE, null, ex);*/
                 JOptionPane.showMessageDialog(this, "Error: Empty Fields!");  
            }}
         else
           JOptionPane.showMessageDialog(this, "No fields are selected !");
      
    }//GEN-LAST:event_DeleteBtnLDActionPerformed

    private void LogoutBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutBtn4ActionPerformed

    private void OpenLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenLDActionPerformed
        // TODO add your handling code here:
             try{
        Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + Conetent1.getText());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Check file");
        }
    }//GEN-LAST:event_OpenLDActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void contentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contentTextFieldActionPerformed

    private void OrTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OrTableMouseClicked

    private void AddWeekORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddWeekORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddWeekORActionPerformed

    private void UpdateBtnORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnORActionPerformed

    private void DeleteBtnORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnORActionPerformed

    private void LogoutBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutBtn5ActionPerformed

    private void PrintBtnORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnORActionPerformed

    private void PrintBtnDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnDSActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_PrintBtnDSActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void WeekNoLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeekNoLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeekNoLDActionPerformed

    private void Conetent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Conetent1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Conetent1ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourseMangnment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseMangnment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseMangnment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseMangnment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CourseMangnment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddCoursesPanel;
    private javax.swing.JPanel AddCoursesPanel11;
    private javax.swing.JPanel AddCoursesPanel15;
    private javax.swing.JPanel AddCoursesPanel5;
    private javax.swing.JPanel AddCoursesPanel6;
    private javax.swing.JButton AddNewBtn;
    private javax.swing.JButton AddWeekDS;
    private javax.swing.JButton AddWeekIT;
    private javax.swing.JButton AddWeekLD;
    private javax.swing.JButton AddWeekOR;
    private javax.swing.JPanel AssignmentsPanel;
    private javax.swing.JComboBox<String> C1Box;
    private javax.swing.JComboBox<String> C2Box;
    private javax.swing.JComboBox<String> C3Box;
    private javax.swing.JComboBox<String> C4Box;
    private javax.swing.JTextField Conetent1;
    private javax.swing.JLabel Course1Label;
    private javax.swing.JLabel Course2Label;
    private javax.swing.JLabel Course3Label;
    private javax.swing.JLabel Course4Label;
    private javax.swing.JPanel CoursePanel;
    private javax.swing.JTabbedPane CourseTab;
    private javax.swing.JTable CourseTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DeleteBtnDS;
    private javax.swing.JButton DeleteBtnIT;
    private javax.swing.JButton DeleteBtnLD;
    private javax.swing.JButton DeleteBtnOR;
    private javax.swing.JTable DsTable;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JTable ItTable;
    private javax.swing.JTable LdTable;
    private javax.swing.JTextField LectTittle;
    private javax.swing.JPanel LecturePanel;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton LogoutBtn2;
    private javax.swing.JButton LogoutBtn3;
    private javax.swing.JButton LogoutBtn4;
    private javax.swing.JButton LogoutBtn5;
    private javax.swing.JButton OpenLD;
    private javax.swing.JTable OrTable;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JButton PrintBtnDS;
    private javax.swing.JButton PrintBtnIT;
    private javax.swing.JButton PrintBtnOR;
    private javax.swing.JButton RefreshStdBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton SearchStdBtn;
    private javax.swing.JPanel SearchStdPanel;
    private javax.swing.JLabel SemesterLabel;
    private javax.swing.JTextField SemesterTextField;
    private javax.swing.JTextField StdIDSearchField;
    private javax.swing.JLabel StdIdLabel;
    private javax.swing.JPanel StdIdSearchPanel;
    private javax.swing.JTextField StdName;
    private javax.swing.JTextField StdSearchField;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton UpdateBtnDS;
    private javax.swing.JButton UpdateBtnIT;
    private javax.swing.JButton UpdateBtnLD;
    private javax.swing.JButton UpdateBtnOR;
    private javax.swing.JTextField WeekNoLD;
    private javax.swing.JTextField contentTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    // End of variables declaration//GEN-END:variables
}
