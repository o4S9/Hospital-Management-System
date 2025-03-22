/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HMS_Package;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Onkar
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Doctor
     */
    public Doctor() {
        initComponents();
        populateTable();
        btn.setVisible(false);
        int i = jTable1.getSelectedRow();
        //App status
        String pid = TFapp.getText();
      
        
        //view Appotiment
        String dname = lab1.getText();
        try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql2 = "SELECT  `p_id`,`Date`,`Time` FROM appointment WHERE Dname='"+dname+"'";
        ResultSet rs2 = st.executeQuery(sql2);
   while(rs2.next()){
              //jComboBox1.addItem(rs2.getString(1));             
              //System.out.println(rs2.getString(1));
              String btn1 = btn.getToolTipText(); 
   
              String id = rs2.getString(1);
              String date = rs2.getString(2);
              String time = rs2.getString(3);
              
              String tbData[] = {id,date,time,btn1};
              DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
              model.addRow(tbData);
     }  
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              } 
//        setContentAreaFilled(false);
//        setBorder(new EmptyBorder(3,3,3,3));
//        jTable1.getColumnModel().getColumn(3).setCellRenderer(new Doctor());

        try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql2 = "SELECT  Date  FROM appointment";
        ResultSet rs2 = st.executeQuery(sql2);
   while(rs2.next()){
              //jComboBox1.addItem(rs2.getString(1));             
              System.out.println(rs2.getString(1));
     }  
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
    }
     public Doctor(String did) {
        initComponents();
        L1.setText("Welcome "+did);
                try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql = "SELECT `Dname`, `age`, `Gender`, `langaugeSpoke`, `Department`,`qulification`,`Schdule`,`Email`  FROM `doctor` WHERE `D_id`='"+did+"'";

     java.sql.ResultSet rs = st.executeQuery(sql);
//     cn.close();
                               //System.out.println(sql);

       if(rs.next()){
                   lab1.setText(rs.getString(1));
                   lab2.setText(rs.getString(2));
                   lab3.setText(rs.getString(3));
                   lab4.setText(rs.getString(4));
                   lab5.setText(rs.getString(5));
                   lab6.setText(rs.getString(6));
                   lab7.setText(rs.getString(7));
                   lab8.setText(rs.getString(8));
                   // System.out.println(rs.getString(1));

                   

       }
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
    } 
     
     public void populateTable(){
    try{
         String dname = lab1.getText();
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql2 = "SELECT  *  FROM appointment WHERE Dname='"+dname+"'";
        ResultSet rs2 = st.executeQuery(sql2);
   while(rs2.next()){
              //jComboBox1.addItem(rs2.getString(1));             
              //System.out.println(rs2.getString(1));
              String id = rs2.getString(2);
              String date = rs2.getString(3);
              String time = rs2.getString(4);
              String tbData[] = {id,date,time};
              DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
              model.addRow(tbData);
     }  
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
     }

//    Doctor(String did) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        lab7 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        lab6 = new javax.swing.JLabel();
        lab8 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        TFapp = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        TF1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        L2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Tfield1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor");
        setBounds(new java.awt.Rectangle(100, 30, 1200, 750));
        setResizable(false);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(200, 200));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Profile");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        L1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        L1.setText("Doctor_Id  ");
        jPanel5.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Doctor-Details :- ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        L6.setBackground(new java.awt.Color(204, 255, 255));
        L6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel5.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        lab7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab7.setText("Schedule");
        jPanel5.add(lab7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        lab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab2.setText("Age");
        jPanel5.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Age :");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        lab4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab4.setText("Langauge Spoken ");
        jPanel5.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        lab6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab6.setText("Qulification");
        jPanel5.add(lab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        lab8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab8.setText("Email");
        jPanel5.add(lab8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        lab3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab3.setText("Gender ");
        jPanel5.add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        lab5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab5.setText("Specilization");
        jPanel5.add(lab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Name :");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        lab1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab1.setText("Name ");
        jPanel5.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Gender :");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Langauge Spoken :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Specilization:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Qulification:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Schedule:-");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Contact Details :-");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Email:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Doctor-ID : ");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jTabbedPane1.addTab("Profile", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 190, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Search Date:-");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jButton2.setBackground(new java.awt.Color(63, 123, 191));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient-id", "Date", "Time", "Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 730, 470));

        btn.setBackground(new java.awt.Color(63, 123, 191));
        btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn.setForeground(new java.awt.Color(255, 255, 255));
        btn.setText("Confirm");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        jPanel6.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, -1, -1));

        btn2.setBackground(new java.awt.Color(63, 123, 191));
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Delete");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel6.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 680, -1, -1));
        jPanel6.add(TFapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 190, 30));

        btn1.setBackground(new java.awt.Color(63, 123, 191));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Cancle");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel6.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 630, -1, -1));

        jTabbedPane1.addTab("My Appointments", jPanel6);

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 200, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Enter patient Id:-");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jButton3.setBackground(new java.awt.Color(63, 123, 191));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, 30));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setText("Patients Name                 :");
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 40));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setText("Treatment Name             :");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 40));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setText("Prescription                     :");
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 40));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setText("Remark                             :");
        jPanel8.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, 40));

        label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label1.setText("jLabel54");
        jPanel8.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, 40));

        jButton4.setBackground(new java.awt.Color(63, 123, 191));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 90, 40));

        L2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        L2.setText("Patient_Id  ");
        jPanel8.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Patient_Id :");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, 40));

        jButton5.setBackground(new java.awt.Color(63, 123, 191));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Edit Prescription");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 200, 40));
        jPanel8.add(Tfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 300, 40));

        jButton6.setBackground(new java.awt.Color(63, 123, 191));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Add Prescription");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 200, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 300, 40));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel8.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 300, 40));

        jTabbedPane1.addTab("Add Prescription", jPanel8);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Do you have exit ? please click Exit");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(63, 123, 191));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jTabbedPane1.addTab("Logout", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       Frame3 f = new Frame3();
        f.setVisible(true);
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String p_id = TF1.getText();
           try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql = "SELECT `p_id`,`Fname` FROM `patient` WHERE `p_id`='"+p_id+"'";
//       String sql1 = "select count(`p_id`) from patient";
//       String sql2 = "select count(D_id) from doctor";
     java.sql.ResultSet rs = st.executeQuery(sql);
   // ResultSet rs1 = st.executeQuery(sql1);
//     ResultSet rs2 = st.executeQuery(sql2);
//     
      if(rs.next()){
                   L2.setText(rs.getString(1));
                   label1.setText(rs.getString(2));
//                   l2.setText(rs.getString(2));
//                   l3.setText(rs.getString(3));
//                   l4.setText(rs.getString(4));
//                   l5.setText(rs.getString(5));
//                   l6.setText(rs.getString(6));
//                    l7.setText(rs.getString(7));
//                    P1.setText(rs.getString(1));
//                   P2.setText(rs.getString(2));
//                   P3.setText(rs.getString(3));
//                   P4.setText(rs.getString(4));
//                   P5.setText(rs.getString(5));
//                   P7.setText(rs.getString(6));
//                    P6.setText(rs.getString(7));
//                   java.sql.Blob b = rs.getBlob(5);
//                   byte barr[] = b.getBytes(1, (int) b.length());
//                    byte[] barr = rs.getBytes(6);
//                   ImageIcon image = new ImageIcon(barr);
//                   Image im = image.getImage();
//                   Image myimg =im.getScaledInstance(image.getWidth(), myimg.getHeight(), Image.SCALE_SMOOTH);
//                   ImageIcon newimg = new ImageIcon(myimg);
//                   L6.setIcon(newimg);
//                   FileOutputStream fos = new FileOutputStream("C:\\Users\\Onkar\\OneDrive\\Desktop\\HMS\\src\\HMS_Package\\HMS_Images\\HMS.png");
//                   fos.write(barr);
                   //L6.setText("");
                   //fos.close();
                   //cn.close();

       }
     


      
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
    }//GEN-LAST:event_jButton3ActionPerformed
        
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String dname = lab1.getText();

        try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql2 = "SELECT  *  FROM appointment WHERE Dname='"+dname+"'";
        ResultSet rs2 = st.executeQuery(sql2);
   while(rs2.next()){
              //jComboBox1.addItem(rs2.getString(1));             
              //System.out.println(rs2.getString(1));
              String btn1 = btn.getToolTipText(); 
   
              String id = rs2.getString(2);
              String date = rs2.getString(5);
              String time = rs2.getString(6);
              String tbData[] = {id,date,time,btn1};
              DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
              model.addRow(tbData);
     }  
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }      
        //Doctor show Appoitment
        String date;
        date = jTextField1.getText();
                  try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "SELECT  p_id,Date,Time FROM appointment WHERE Dname='"+date+"'";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);     
                

     
 while(rs2.next()){
              //Department.addItem(rs2.getString(1));
              jButton btn = new jButton("Confirm");
              String confirmbtn = btn.setVisible();
              String id = rs2.getString(2);
              String date1 = rs2.getString(5);
              String time = rs2.getString(6);
              String tbData[] = {id,date1,time,confirmbtn};
              DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
              model.addRow(tbData);

     }  
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        String con = "Confirm";
        String pid = TFapp.getText();
        String dname = lab1.getText();
        if(pid.equals("")){
        
        }else{
//             try{
//       Connection cn = null;
//       Statement st = null;
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
//       st = cn.createStatement();
//      
//       String  query = "SELECT status FROM appcc where pid = '"+pid+"'";
//         ResultSet rs2 = st.executeQuery(query);
//           while(rs2.next()){
//            JOptionPane.showMessageDialog(rootPane,pid +"Appotiement confirm please contact patient");
//             con = rs2.getString(1); 
//             System.out.print(con);
//           }
//             
//       
//        }catch(Exception ex){
//       System.out.println("Error"+ex.getMessage());
//     }
        }
         try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       if(pid.equals("")){
           javax.swing.JOptionPane.showMessageDialog(rootPane, "Please enter patient-id");
       }else{
       String  query = "insert into Appcc values('"+con+"','"+dname+"','"+pid+"')";
              st.executeUpdate(query);
              cn.close();
              JOptionPane.showMessageDialog(rootPane, "Appotiement confirm please contact patient");
       }
               
       
     }catch(Exception ex){
       System.out.println("Error"+ex.getMessage());
     }
     

      
        
      
         
    }//GEN-LAST:event_btnActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
      int i = jTable1.getSelectedRow();
     
         try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       
       
         
       
        
          }catch(Exception ex){
             System.out.println("Error"+ex.getMessage());

     }
          if(i>=0){             
         
              DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
              model.removeRow(i);  
//              String  query = "DELETE FROM appointment WHERE `p_id`='"+patient_id+"'";
//              st.executeUpdate(query);
//              cn.close();
      }else{
         javax.swing.JOptionPane.showMessageDialog(rootPane, "Please select a row");    
      }
    }//GEN-LAST:event_btn2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
         String patient_id;
        patient_id = TFapp.getText();
        //App record delete
        try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       
       
         
        if(patient_id.equals("")){
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Please enter your id required and delete");
        }else{
          String  query = "DELETE FROM appointment WHERE `p_id`='"+patient_id+"'";
              st.executeUpdate(query);
              cn.close();
                      //javax.swing.JOptionPane.showMessageDialog(rootPane, "Appotient will be cancle");
                     
               //System.out.println("Databse Connected!"+query);
        }
          }catch(Exception ex){
             System.out.println("Error"+ex.getMessage());

     }
        //Status camcle
         try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       
       
         
        if(patient_id.equals("")){
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Please enter your id required and delete");
        }else{
          String  query = "DELETE FROM appcc WHERE `pid`='"+patient_id+"'";
              st.executeUpdate(query);
              cn.close();
                      javax.swing.JOptionPane.showMessageDialog(rootPane, "Appotient will be cancle");
                     
               //System.out.println("Databse Connected!"+query);
        }
          }catch(Exception ex){
             System.out.println("Error"+ex.getMessage());

     }
    }//GEN-LAST:event_btn1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //view treatment
       String tsearch = Tfield1.getText();
           try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql2 = "SELECT `prescription`,`remark` FROM hms.prescription WHERE treatmentname ='"+tsearch+"'";
        ResultSet rs2 = st.executeQuery(sql2);     
                

     
 if(rs2.next()){
              //Department.addItem(rs2.getString(1));
              jTextArea2.setText(rs2.getString(1));
              jTextArea3.setText(rs2.getString(2));
            

     }    
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String pid,pname,tname,prescption,remark,dname;
        pid = L2.getText();
        dname = lab1.getText();
        pname =  label1.getText();
        tname =Tfield1.getText();
        prescption=jTextArea2.getText();
        remark=jTextArea3.getText();
        try{
         Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql = "insert into Prescription values('"+pid+"','"+pname+"','"+tname+"','"+prescption+"','"+remark+"','"+dname+"')";
       st.executeUpdate(sql);
       cn.close();
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Add a Prescription");
        L2.setText("");
        label1.setText("");
        Tfield1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
        }catch(Exception ex){
        System.out.println("Error"+ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         String pid,pname,tname,prescption,remark;
         
        pid = L2.getText();
        pname =  label1.getText();
        tname =Tfield1.getText();
        prescption=jTextArea2.getText();
        remark=jTextArea3.getText();
        try{
         Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql = "update Prescription set `treatmentname`='"+tname+"',`prescription`='"+prescption+"',`remark`='"+remark+"' where `pid`='"+pid+"'";
       st.executeUpdate(sql);
       cn.close();
        javax.swing.JOptionPane.showMessageDialog(rootPane, "Add a Prescription");
        L2.setText("");
        label1.setText("");
        Tfield1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
        }catch(Exception ex){
        System.out.println("Error"+ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L6;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TFapp;
    private javax.swing.JTextField Tfield1;
    private javax.swing.JButton btn;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables

    private void setContentAreaFilled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setBorder(EmptyBorder emptyBorder) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
