/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HMS_Package;

import java.awt.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Onkar
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        
    }
     public Admin(String aid) {
        initComponents();
        L1.setText("Welcome "+aid);
        //Payment Record
          try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "SELECT * FROM bill";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
 while(rs2.next()){
             String date = rs2.getString(1);
                String billno = rs2.getString(2);
                 String dname = rs2.getString(3);
                String amount = rs2.getString(4);
                String status = rs2.getString(5);
                String tbData[] = {date,billno,dname,amount,status};
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(tbData);
     }
     
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
          //Total Fee Collected  
           String total;
            try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "SELECT COUNT(amount) FROM bill WHERE amount = '200'";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
 if(rs2.next()){
            total = rs2.getString(1);
            int number = Integer.parseInt(total);
            int record = number * 200;
            String str = Integer.toString(record);
            totalFee.setText(str+"Rs.");
            //System.out.println(record);
     }
     
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
          //total appointment
            try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "select count(App_id) from appointment";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
 if(rs2.next()){
              totalAppoinments.setText(rs2.getString(1));
              //System.out.println(rs2.getString(1));
     }
     
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
         try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "select count(D_id) from doctor";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
 if(rs2.next()){
              totalDoctor.setText(rs2.getString(1));
              //System.out.println(rs2.getString(1));
     }
     
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
        try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql1 = "select count(`p_id`) from patient";
       //String sql2 = "select count(D_id) from doctor";
        ResultSet rs1 = st.executeQuery(sql1);
        //ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
// if(rs2.next()){
//              //totalDoctor.setText(rs2.getString(1));
//                   System.out.println(rs2.getString(1));
//     }
     
     if(rs1.next()){
     //System.out.println(rs1.getString(1));
     totalPatient.setText(rs1.getString(1));
     }     
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
        //Admin Details
                try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql = "SELECT `Aname`, `age`, `address`, `mobno`, `password`, `image`  FROM `adminregister` WHERE `Admin_id`='"+aid+"'";
       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "select count(D_id) from doctor";
     ResultSet rs = st.executeQuery(sql);
    
      if(rs.next()){
                   L2.setText(rs.getString(1));
                   L3.setText(rs.getString(2));
                   L4.setText(rs.getString(3));
                   L5.setText(rs.getString(4));
//                   java.sql.Blob b = rs.getBlob(5);
//                   byte barr[] = b.getBytes(1, (int) b.length());
                    byte[] barr = rs.getBytes(6);
                   ImageIcon image = new ImageIcon(barr);
                   Image im = image.getImage();
//                   Image myimg =im.getScaledInstance(image.getWidth(), myimg.getHeight(), Image.SCALE_SMOOTH);
//                   ImageIcon newimg = new ImageIcon(myimg);
//                   L6.setIcon(newimg);
//                   FileOutputStream fos = new FileOutputStream("C:\\Users\\Onkar\\OneDrive\\Desktop\\HMS\\src\\HMS_Package\\HMS_Images\\HMS.png");
//                   fos.write(barr);
                   //L6.setText("");
                   //fos.close();
                   //cn.close();

       }
     
// if(rs2.next()){
//              //totalDoctor.setText(rs2.getString(1));
//                   System.out.println(rs2.getString(1));
//     }
     
//     if(rs1.next()){
//     System.out.println(rs1.getString(1));
//     totalPatient.setText(rs1.getString(1));
//     }

//     cn.close();
                               //System.out.println(sql);

      
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
    }

//    Admin(String aid) {
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TF = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        D = new javax.swing.JTextField();
        D1 = new javax.swing.JTextField();
        D2 = new javax.swing.JTextField();
        D3 = new javax.swing.JTextField();
        D7 = new javax.swing.JTextField();
        D6 = new javax.swing.JTextField();
        P1 = new javax.swing.JTextField();
        D4 = new javax.swing.JTextField();
        D5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        R2 = new javax.swing.JRadioButton();
        R1 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lab10 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        lab8 = new javax.swing.JLabel();
        lab6 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        lab9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalFee = new javax.swing.JLabel();
        totalAppoinments = new javax.swing.JLabel();
        totalDoctor = new javax.swing.JLabel();
        totalPatient = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setBounds(new java.awt.Rectangle(100, 30, 1200, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(63, 123, 191));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

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

        L2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        L2.setText("Name ");
        jPanel5.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Age :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        L1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        L1.setText("Admin_Id  ");
        jPanel5.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        L4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        L4.setText("Address ");
        jPanel5.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 160, 30));

        L5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        L5.setText("Mob-no ");
        jPanel5.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 150, -1));

        L3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        L3.setText("Age ");
        jPanel5.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 150, 30));

        L10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        L10.setText("Name :");
        jPanel5.add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Address :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Mob-no :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Admin_Id : ");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        L6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel5.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 150, 140));

        jTabbedPane1.addTab("Profile", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Enter a Patient-Id :");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Bill-no", "Dname", "Amount", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 790, 320));
        jPanel6.add(TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 150, 30));

        jButton7.setText("Show Bill");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel13.setText("Payment Request");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 5, -1, -1));

        jTabbedPane1.addTab("Payment Details", jPanel6);

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Add new Doctor");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setText("Specilization");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 400, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Name");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Age");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Doctor_Id");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setText("Gender");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 400, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("Qulification");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 400, 30));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Password");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 400, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Email");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 400, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Schedule");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 400, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Langauge Spoken");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 400, 30));

        jPanel8.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 400, 400));

        D.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 400, 40));

        D1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 400, 40));

        D2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 400, 40));

        D3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 400, 40));

        D7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(D7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 400, 40));

        D6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 400, 40));

        P1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 400, 40));

        D4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 400, 40));

        D5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 400, 40));

        jButton1.setBackground(new java.awt.Color(63, 123, 191));
        jButton1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, -1, -1));

        R2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        R2.setText("Female");
        jPanel8.add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        R1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        R1.setText("Male");
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });
        jPanel8.add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jButton3.setBackground(new java.awt.Color(63, 123, 191));
        jButton3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 180, 40));

        jButton4.setBackground(new java.awt.Color(63, 123, 191));
        jButton4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 170, 40));

        jTabbedPane1.addTab(" Doctor Deatils", jPanel8);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Update Doctor Details");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 5, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setText("Search ID :");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 82, -1, 40));

        jButton2.setBackground(new java.awt.Color(63, 123, 191));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Schedule      :");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Name             :");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Age                :");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Doctor_Id      :");
        jPanel9.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Langauge Spoken   :");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Qulification   :");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Email            :");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Gender          :");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Specilization :");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        lab10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab10.setForeground(new java.awt.Color(255, 255, 255));
        lab10.setText("Schedule");
        jPanel9.add(lab10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        lab2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab2.setForeground(new java.awt.Color(255, 255, 255));
        lab2.setText("Name");
        jPanel9.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        lab3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab3.setForeground(new java.awt.Color(255, 255, 255));
        lab3.setText("Age");
        jPanel9.add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        lab1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab1.setForeground(new java.awt.Color(255, 255, 255));
        lab1.setText("Doctor_Id");
        jPanel9.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        lab5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab5.setForeground(new java.awt.Color(255, 255, 255));
        lab5.setText("Langauge Spoken");
        jPanel9.add(lab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        lab8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab8.setForeground(new java.awt.Color(255, 255, 255));
        lab8.setText("Qulification");
        jPanel9.add(lab8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        lab6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab6.setForeground(new java.awt.Color(255, 255, 255));
        lab6.setText("Email");
        jPanel9.add(lab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        lab4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab4.setForeground(new java.awt.Color(255, 255, 255));
        lab4.setText("Gender");
        jPanel9.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        lab9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lab9.setForeground(new java.awt.Color(255, 255, 255));
        lab9.setText("Specilization");
        jPanel9.add(lab9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(63, 123, 191));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(300, 100));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 760, 450));

        jButton6.setBackground(new java.awt.Color(63, 123, 191));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Load");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        jComboBox1.setToolTipText("");
        jPanel9.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 300, 30));

        jTabbedPane1.addTab("Search Details of Doctor", jPanel9);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Records");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 5, -1, -1));

        jLabel7.setBackground(new java.awt.Color(63, 123, 191));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Total Doctor Added                :");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 340, 60));

        jLabel8.setBackground(new java.awt.Color(63, 123, 191));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Total Patient Treated              :");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 340, 60));

        jLabel10.setBackground(new java.awt.Color(63, 123, 191));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Total Appoinments Taken      :");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 340, 60));

        jLabel12.setBackground(new java.awt.Color(63, 123, 191));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Total Fee Collected                 :");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 340, 60));

        totalFee.setBackground(new java.awt.Color(63, 123, 191));
        totalFee.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalFee.setText("Rs.10,10,700");
        totalFee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(totalFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 340, 60));

        totalAppoinments.setBackground(new java.awt.Color(63, 123, 191));
        totalAppoinments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalAppoinments.setText("10,123");
        totalAppoinments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(totalAppoinments, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 340, 60));

        totalDoctor.setBackground(new java.awt.Color(63, 123, 191));
        totalDoctor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalDoctor.setText("10");
        totalDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(totalDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 340, 60));

        totalPatient.setBackground(new java.awt.Color(63, 123, 191));
        totalPatient.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalPatient.setText("10,123");
        totalPatient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel10.add(totalPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 340, 60));

        jTabbedPane1.addTab("Records", jPanel10);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel36.setText("Do you have exit ? please click Exit");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jButton5.setBackground(new java.awt.Color(63, 123, 191));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jTabbedPane1.addTab("Logout", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String query,did,dname,age,gender,gender1,email,pass,quli,spe,lspo,sch;
        did =D1.getText();
        dname = D2.getText();
        age = D3.getText();
        quli = D4.getText();
        spe = D5.getText();
        email = D6.getText();
        pass = P1.getText();
        gender = R1.getText();
        gender1 = R2.getText();
        lspo = D7.getText();
        sch = D.getText();
        
        Doctor d = new Doctor();
     
     try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
        if(did.equals("")){
     JOptionPane.showMessageDialog(rootPane, "Please enter your id");
     }       
     else if(dname.equals("")){
          JOptionPane.showMessageDialog(rootPane, "Please enter your name");
     }
      else if(age.equals("")){
          JOptionPane.showMessageDialog(rootPane, "Please enter your age");
     }
      else if(quli.equals("") ){
          JOptionPane.showMessageDialog(rootPane, "Please enter your Qulification");
     }
      else if(spe.equals("")){
          JOptionPane.showMessageDialog(rootPane, "Please enter your specilization");
     }
      else if(email.equals("")){
          JOptionPane.showMessageDialog(rootPane, "Please enter your Email");
     }
      else if(pass.equals("")){
          JOptionPane.showMessageDialog(rootPane, "Please enter your password");
     }
      else{
          if(R1.isSelected() && R2.isSelected()){
//               query = "INSERT INTO `doctorregister`(`Doctor_id`, `DName`, `age`, `Gender`, `Email`, `password`, `qulification`, `spelization`)  "
//                      + "VALUES ('"+did+"','"+dname+"','"+age+"','"+gender+"','"+email+"','"+pass+"','"+quli+","+spe+"')";
//              //st.executeUpdate(query);
//              //cn.close();
//               System.out.println("Databse Connected!"+query);
//        this.dispose();
          JOptionPane.showMessageDialog(rootPane, "Please select one option in gender M/F");

          
         // d.setVisible(true);
          } else if(R2.isSelected()) {
               query = "INSERT INTO doctor (`D_id`, `DName`, `age`, `Gender`,`langaugeSpoke`, `Specilazition`, `qulification`, `Schdule`, `Email`, `pass`)  "
                      + "VALUES ('"+did+"','"+dname+"','"+age+"','"+gender1+"','"+lspo+"','"+spe+"','"+quli+"','"+sch+"','"+email+"','"+pass+"')";
              st.executeUpdate(query);
              cn.close();
               //System.out.println("Databse Connected!"+query);
          
           }else{
              
              query = "INSERT INTO doctor (`D_id`, `DName`, `age`, `Gender`,`langaugeSpoke`, `Specilazition`, `qulification`, `Schdule`, `Email`, `pass`)  "
                      + "VALUES ('"+did+"','"+dname+"','"+age+"','"+gender+"','"+lspo+"','"+spe+"','"+quli+"','"+sch+"','"+email+"','"+pass+"')";
              st.executeUpdate(query);
              cn.close();
              // System.out.println("Databse Connected!"+query);
          }
           
      }
     }catch(Exception ex){
       System.out.println("Error"+ex.getMessage());

     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //view
        String Doc_Id;
        Doc_Id = (String) jComboBox1.getSelectedItem();
         try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql = "SELECT * FROM doctor WHERE `D_id`='"+Doc_Id+"'";
    
     ResultSet rs = st.executeQuery(sql);

//     cn.close();

       if(rs.next()){
                  lab1.setText(rs.getString(1));
                  lab2.setText(rs.getString(2));
                  lab3.setText(rs.getString(3));
                  lab4.setText(rs.getString(4));
                  lab5.setText(rs.getString(5));
                  lab9.setText(rs.getString(6));
                  lab8.setText(rs.getString(7));
                  lab10.setText(rs.getString(8)); 
                  lab6.setText(rs.getString(9));                
                  //lab7.setText(rs.getString(10));

            //System.out.println("Databse Show!");
 

       }
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String query,did,dname,age,gender,gender1,email,pass,quli,spe,lspo,sch;
        did =D1.getText();
        dname = D2.getText();
        age = D3.getText();
        quli = D.getText();
        spe = D5.getText();
        email = D6.getText();
        pass = P1.getText();
        gender = R1.getText();
        gender1 = R2.getText();
        lspo = D7.getText();
        sch = D.getText();
        
        Doctor d = new Doctor();

        try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            st = cn.createStatement();
            if(did.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your id");
            }
            else if(dname.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your name");
            }
            else if(age.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your age");
            }
            else if(quli.equals("") ){
                JOptionPane.showMessageDialog(rootPane, "Please enter your Qulification");
            }
            else if(spe.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your specilization");
            }
            else if(email.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your Email");
            }
            else if(pass.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your password");
            }
            else{
                if(R1.isSelected() && R2.isSelected()){
                    //               query = "INSERT INTO `doctorregister`(`Doctor_id`, `DName`, `age`, `Gender`, `Email`, `password`, `qulification`, `spelization`)  "
                    //                      + "VALUES ('"+did+"','"+dname+"','"+age+"','"+gender+"','"+email+"','"+pass+"','"+quli+","+spe+"')";
                    //              //st.executeUpdate(query);
                    //              //cn.close();
                    //               System.out.println("Databse Connected!"+query);
                    //        this.dispose();
                    JOptionPane.showMessageDialog(rootPane, "Please select one option in gender M/F");

                    // d.setVisible(true);
                } else if(R2.isSelected()) {
                    query = "UPDATE `doctorregister` SET `DName`='"+dname+"',`age`='"+age+"',`Gender`='"+gender1+"',"
                    + "`Email`='"+email+"',`password`='"+pass+"',`qulification`='"+quli+"',`spelization`='"+spe+"' WHERE `Doctor_id`='"+did+"'";
                    st.executeUpdate(query);
                    cn.close();
                    //System.out.println("Databse Connected!"+query);
                    this.dispose();

                    d.setVisible(true);
                }else{

                    query = "UPDATE `doctorregister` SET `DName`='"+dname+"',`age`='"+age+"',`Gender`='"+gender+"',"
                    + "`Email`='"+email+"',`password`='"+pass+"',`qulification`='"+quli+"',`spelization`='"+spe+"' WHERE `Doctor_id`='"+did+"'";
                    st.executeUpdate(query);
                    cn.close();
                    //System.out.println("Databse Connected!"+query);
                    this.dispose();
                    d.setVisible(true);
                }

            }
        }catch(Exception ex){
            System.out.println("Error"+ex.getMessage());

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String D_id;
        D_id = D1.getText();
         try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       
       
         
        if(D_id.equals("")){
        JOptionPane.showMessageDialog(rootPane, "Please enter your id required and delete");
        }else{
          String  query = "DELETE FROM doctor WHERE `D_id`='"+D_id+"'";
              st.executeUpdate(query);
              cn.close();
                      JOptionPane.showMessageDialog(rootPane, "Your data was delete!");
                     

               //System.out.println("Databse Connected!"+query);
        }
          }catch(Exception ex){
             System.out.println("Error"+ex.getMessage());

     }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          Frame3 f = new Frame3();
        f.setVisible(true);
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "select D_id from doctor";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs3 = st.executeQuery(sql2);
//     
  
     
 while(rs3.next()){
              jComboBox1.addItem(rs3.getString(1));
             // System.out.println(rs3.getString(1));
              
     }
     
//     if(rs1.next()){
//     System.out.println(rs1.getString(1));
//     totalPatient.setText(rs1.getString(1));
//     }     
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(TF.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane, "Please enter Patient-ID");
        }else{
        String  mob = TF.getText();    
        //ShowBill bill = new ShowBill(mob);
        Patient_record pr = new Patient_record(mob);
        pr.setVisible(true);
        
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField D;
    private javax.swing.JTextField D1;
    private javax.swing.JTextField D2;
    private javax.swing.JTextField D3;
    private javax.swing.JTextField D4;
    private javax.swing.JTextField D5;
    private javax.swing.JTextField D6;
    private javax.swing.JTextField D7;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JTextField P1;
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R2;
    private javax.swing.JTextField TF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab10;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel lab9;
    private javax.swing.JLabel totalAppoinments;
    private javax.swing.JLabel totalDoctor;
    private javax.swing.JLabel totalFee;
    private javax.swing.JLabel totalPatient;
    // End of variables declaration//GEN-END:variables

    private String setText(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
