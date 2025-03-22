/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HMS_Package;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Onkar
 */
public class Patient extends javax.swing.JFrame {

    /**
     * Creates new form Patient
     */
    public Patient(String p_id) {
        initComponents();
        //jTextField1.setText(p_id);
        //view psyment record
        try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
            String sql2 = "SELECT  *  FROM bill WHERE pid='"+p_id+"'";
            ResultSet rs2 = st.executeQuery(sql2);
            while(rs2.next()){
                //jComboBox1.addItem(rs2.getString(1));
                //System.out.println(rs2.getString(1));
               // String btn1 = btn.getToolTipText();

                String date = rs2.getString(1);
                String bill = rs2.getString(2);
                
                 String dname = rs2.getString(3);
                String amount = rs2.getString(4);
                String status = rs2.getString(5);
                String tbData[] = {date,bill,dname,amount,status};
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.addRow(tbData);
//                if(model.isCellEditable(ERROR, NORMAL)){
//                jTextField1.setText(bill);
//                }
            }

        }catch(Exception ex ){
            System.out.println("Error"+ex.getMessage());
        }
        //view you app_id
            try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
            //       String sql1 = "select count(`p_id`) from patient";
            String sql2 = "SELECT App_id FROM appointment where p_id='"+p_id+"'";
            //        ResultSet rs1 = st.executeQuery(sql1);
            ResultSet rs3 = st.executeQuery(sql2);

            if(rs3.next()){
                jLabel4.setText(rs3.getString(1));               
              
            }

          
        }catch(Exception ex ){
            System.out.println("Error"+ex.getMessage());
        }
        //view treatment
        try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "SELECT  treatmentname,prescription,remark,dname  FROM prescription WHERE pid='"+p_id+"'";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
 if(rs2.next()){
              //Department.addItem(rs2.getString(1));
              lab1.setText(rs2.getString(1));
              lab7.setText(rs2.getString(4));
              lab11.setText(rs2.getString(2));
              lab12.setText(rs2.getString(3));
              //System.out.println(rs2.getString(1));

     }    
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
        //view status
         try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
            //       String sql1 = "select count(`p_id`) from patient";
            String sql2 = "SELECT status FROM appcc where pid='"+p_id+"'";
            //        ResultSet rs1 = st.executeQuery(sql1);
            ResultSet rs3 = st.executeQuery(sql2);

            if(rs3.next()){
                s5.setText(rs3.getString(1));
                s5.setForeground(Color.green);
                 s7.setForeground(Color.red);
//                 s7.addMouseListener(new MouseAdapter(){
//                     @Override
//                  public void mouseClicked(MouseEvent e){
//                  javax.swing.JOptionPane.showMessageDialog(rootPane, "Please enter your id");
//                  }
//                    
//            });
                 
                 
//                jComboBox1.addItem(rs3.getString(1));
//                 cm2.addItem(rs3.getString(1));
                // System.out.println(rs3.getString(1));

            }

          
        }catch(Exception ex ){
            System.out.println("Error"+ex.getMessage());
        }
        //view app status
          try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "SELECT  p_id,Dname,Department,Fee  FROM appointment WHERE p_id='"+p_id+"'";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
 if(rs2.next()){
              //Department.addItem(rs2.getString(1));
              s1.setText(rs2.getString(1));
              s2.setText(rs2.getString(2));
              s3.setText(rs2.getString(3));
              s4.setText(rs2.getString(4));
              //System.out.println(rs2.getString(1));

     }    
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
        
        
        //view Department
          try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "select Department from doctor";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
   while(rs2.next()){
              Department.addItem(rs2.getString(1));
             
              //System.out.println(rs2.getString(1));
     }    
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
          //view Doctor 
           try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
            //       String sql1 = "select count(`p_id`) from patient";
            String sql2 = "select Dname from doctor";
            //        ResultSet rs1 = st.executeQuery(sql1);
            ResultSet rs3 = st.executeQuery(sql2);

            while(rs3.next()){
                jComboBox1.addItem(rs3.getString(1));
                 cm2.addItem(rs3.getString(1));
                // System.out.println(rs3.getString(1));

            }

            //     if(rs1.next()){
                //     System.out.println(rs1.getString(1));
                //     totalPatient.setText(rs1.getString(1));
                //     }
        }catch(Exception ex ){
            System.out.println("Error"+ex.getMessage());
        }

        L1.setText(p_id);
        jLabel34.setText(p_id);
            try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       String sql = "SELECT * FROM `patient` WHERE `p_id`='"+p_id+"'";
//       String sql1 = "select count(`p_id`) from patient";
//       String sql2 = "select count(D_id) from doctor";
     java.sql.ResultSet rs = st.executeQuery(sql);
   // ResultSet rs1 = st.executeQuery(sql1);
//     ResultSet rs2 = st.executeQuery(sql2);
//     
      if(rs.next()){
                   l1.setText(rs.getString(2));
                   l2.setText(rs.getString(3));
                   l3.setText(rs.getString(4));
                   l4.setText(rs.getString(5));
                   l5.setText(rs.getString(6));
                   l6.setText(rs.getString(7));
                   l7.setText(rs.getString(8));
                   P1.setText(rs.getString(1));
                   P2.setText(rs.getString(2));
                   P3.setText(rs.getString(3));
                   P4.setText(rs.getString(4));
                   P5.setText(rs.getString(5));
                   P7.setText(rs.getString(7));
                    P6.setText(rs.getString(8));
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
    }

    private Patient() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    

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
        L6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab7 = new javax.swing.JLabel();
        lab11 = new javax.swing.JLabel();
        lab12 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Department = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cm2 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        AT3 = new javax.swing.JTextField();
        AT1 = new javax.swing.JTextField();
        AT2 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        AT4 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        P1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        P5 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        P2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        R2 = new javax.swing.JRadioButton();
        R1 = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        P3 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        P4 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        P6 = new javax.swing.JTextField();
        P7 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lab10 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        lab8 = new javax.swing.JLabel();
        lab6 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        lab9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient");
        setBounds(new java.awt.Rectangle(100, 30, 1200, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        L1.setText("Patient_Id  ");
        jPanel5.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        L6.setBackground(new java.awt.Color(204, 255, 255));
        L6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel5.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Recent Treatment Details:-");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("DOB                :");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Mob no :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Blood-Group :");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Address          :");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Email     :");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Gender           :");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Patient_App_ID :-");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Patient-Details :-");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 40));

        l1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        l1.setText("jLabel11");
        jPanel5.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, 40));

        l2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        l2.setText("jLabel11");
        jPanel5.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, 40));

        l3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        l3.setText("jLabel11");
        jPanel5.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, 40));

        l4.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        l4.setText("jLabel11");
        jPanel5.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, 40));

        l5.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        l5.setText("jLabel11");
        jPanel5.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, 40));

        l6.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        l6.setText("jLabel11");
        jPanel5.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, 40));

        l7.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        l7.setText("jLabel11");
        jPanel5.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, 40));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Patient-Contact :-");
        jPanel5.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, 40));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setText("Name              :");
        jPanel5.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 40));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setText("Treatment Name             :");
        jPanel5.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, 40));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setText("Doctor Name                   :");
        jPanel5.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, 40));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setText("Prescription                     :");
        jPanel5.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, 40));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel52.setText("Remark                             :");
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, -1, 40));

        lab1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab1.setText("jLabel54");
        jPanel5.add(lab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, 40));

        lab7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab7.setText("jLabel54");
        jPanel5.add(lab7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, 40));

        lab11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab11.setText("jLabel54");
        jPanel5.add(lab11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, -1, 40));

        lab12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab12.setText("jLabel54");
        jPanel5.add(lab12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, -1, 40));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setText("Patient_Id :-");
        jPanel5.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jTabbedPane1.addTab("Profile", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Select Department*                :");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, 40));

        jPanel6.add(Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 300, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Select Doctor Name*              :");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 40));

        jPanel6.add(cm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 300, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Consultant Fee                        :");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 330, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Date*                                        :");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 330, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setText("App_Id*                                    :");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 330, 40));

        btn2.setBackground(new java.awt.Color(63, 123, 191));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Edit Appointment");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel6.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 300, 50));

        btn1.setBackground(new java.awt.Color(63, 123, 191));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Book Appointment");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel6.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 300, 50));
        jPanel6.add(AT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 300, 40));

        AT1.setText("200");
        AT1.setEnabled(false);
        jPanel6.add(AT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 300, 40));
        jPanel6.add(AT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 300, 40));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setText("Time*                                        :");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 330, 40));
        jPanel6.add(AT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 300, 40));

        jTabbedPane1.addTab("Book Appointments", jPanel6);

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Patient-ID");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, 50));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Doctor-Name");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 100, 50));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Department");
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 100, 50));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Fee");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 100, 50));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Status");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 100, 50));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Payment");
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 100, 50));

        s1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s1.setText("Patient-ID");
        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 100, 60));

        s2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s2.setText("Doctor-Name");
        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 60));

        s3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s3.setText("Department");
        s3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 100, 60));

        s4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s4.setText("Consultant Fee");
        s4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 100, 60));

        s5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s5.setText("Status");
        s5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 100, 60));

        s7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        s7.setForeground(new java.awt.Color(51, 51, 51));
        s7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s7.setText("Pay");
        s7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        s7.setVerifyInputWhenFocusTarget(false);
        s7.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                s7ComponentAdded(evt);
            }
        });
        s7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                s7MousePressed(evt);
            }
        });
        s7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                s7KeyPressed(evt);
            }
        });
        jPanel8.add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 100, 60));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jTabbedPane1.addTab("Appointments Status", jPanel8);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Patient_Id :-");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 30));

        P1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        P1.setPreferredSize(new java.awt.Dimension(200, 30));
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });
        jPanel1.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 300, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("Name");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, 30));

        P5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        P5.setPreferredSize(new java.awt.Dimension(200, 30));
        P5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P5ActionPerformed(evt);
            }
        });
        jPanel1.add(P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 300, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("DOB");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, 30));

        P2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        P2.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 300, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Mob no");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, 30));

        R2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        R2.setText("Female");
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2ActionPerformed(evt);
            }
        });
        jPanel1.add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        R1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        R1.setText("Male");
        jPanel1.add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Blood-Group");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 30));

        P3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        P3.setPreferredSize(new java.awt.Dimension(200, 30));
        P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3ActionPerformed(evt);
            }
        });
        jPanel1.add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 300, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setText("Address");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, 30));

        P4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        P4.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 300, 30));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("Email");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, 30));

        P6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        P6.setMinimumSize(new java.awt.Dimension(200, 30));
        jPanel1.add(P6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 300, 30));

        P7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        P7.setMinimumSize(new java.awt.Dimension(200, 30));
        P7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P7ActionPerformed(evt);
            }
        });
        jPanel1.add(P7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 300, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Gender");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, 30));

        jButton5.setBackground(new java.awt.Color(63, 123, 191));
        jButton5.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, -1, 50));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Patient_Id");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("Patient_Id");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 30));

        jTabbedPane1.addTab("Update  Details", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(63, 123, 191));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setText("LIST OF DOCTOR AND THEIR DEPARTMENT");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setText("Hospital-Details:-");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, 40));

        jButton2.setBackground(new java.awt.Color(63, 123, 191));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Schedule      :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Name             :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Age                :");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Langauge Spoken    :");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Qulification   :");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Email            :");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, -1, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Gender          :");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Department :");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, -1));

        lab10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab10.setForeground(new java.awt.Color(51, 51, 51));
        lab10.setText("Schedule");
        jPanel2.add(lab10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, 30));

        lab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab2.setForeground(new java.awt.Color(51, 51, 51));
        lab2.setText("Name");
        jPanel2.add(lab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, 30));

        lab3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab3.setForeground(new java.awt.Color(51, 51, 51));
        lab3.setText("Age");
        jPanel2.add(lab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 30));

        lab5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab5.setForeground(new java.awt.Color(51, 51, 51));
        lab5.setText("Langauge Spoken");
        jPanel2.add(lab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, 30));

        lab8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab8.setForeground(new java.awt.Color(51, 51, 51));
        lab8.setText("Qulification");
        jPanel2.add(lab8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, -1, 30));

        lab6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab6.setForeground(new java.awt.Color(51, 51, 51));
        lab6.setText("Email");
        jPanel2.add(lab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, 30));

        lab4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab4.setForeground(new java.awt.Color(51, 51, 51));
        lab4.setText("Gender");
        jPanel2.add(lab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, 30));

        lab9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab9.setForeground(new java.awt.Color(51, 51, 51));
        lab9.setText("Specilization");
        jPanel2.add(lab9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, 30));

        jComboBox1.setToolTipText("");
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 300, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setText("Search ID :");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 40));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel28.setText("Doctor-Details:-");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 40));

        jTabbedPane1.addTab("View Doctor", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Bill No.", "Dr.Name", "Amount", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 750, 290));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel54.setText("Payment History");
        jPanel3.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 190, 30));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setText("Search Date:-");
        jPanel3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jButton3.setBackground(new java.awt.Color(63, 123, 191));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, 30));

        jTabbedPane1.addTab("Receipt of Payment", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Do you have exit ? please click Exit");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jButton4.setBackground(new java.awt.Color(63, 123, 191));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        jTabbedPane1.addTab("Logout", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
          
     
        //Edit Appoitment
         String dname,date,time,fee,department,app_id,pid;
        department= (String) Department.getSelectedItem();
        dname = (String) cm2.getSelectedItem();
        fee = AT1.getText();
        date = AT2.getText();
        time = AT3.getText();
        app_id = AT4.getText();
        pid=L1.getText();
         try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
               if(department.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your department");
            }
            else if(dname.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your Doctor name");
            }
            else if(date.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter a date");
            }
            else if(time.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter a time");
            }else{
            String  query = "UPDATE appointment SET Dname='"+dname+"' ,Department ='"+department+"',Date ='"+date+"',Time='"+time+"',Fee='"+fee+"' WHERE App_id='"+app_id+"'";
                    st.executeUpdate(query);
                    cn.close(); 
                    JOptionPane.showMessageDialog(rootPane, "Edit appointment Please check status");
                    AT1.setText("");
                    AT2.setText("");
                    AT3.setText("");
                    AT4.setText("");
                    //System.out.println("Databse Connected!"+query);

            }
         }catch(Exception ex){
            System.out.println("Error"+ex.getMessage());

        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Frame3 f = new Frame3();
        f.setVisible(true);
        this.dispose();
       // System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            String sql = "SELECT * FROM doctor WHERE `Dname`='"+Doc_Id+"'";

            ResultSet rs = st.executeQuery(sql);

            //     cn.close();

            if(rs.next()){
                //lab1.setText(rs.getString(1));
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

    private void P5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P5ActionPerformed

    private void R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2ActionPerformed

    private void P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P3ActionPerformed

    private void P7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String p_id,name,bg,address,dob,gender,gender1,email ,query,mobno;
        p_id = P1.getText();
        name = P2.getText();
        bg = P3.getText();
        address =P4.getText();
        dob = P5.getText();
        email = P6.getText();
        mobno = P7.getText();
        gender =R1.getText();
        gender1 =R2.getText();
        Patient p = new Patient(p_id);
        try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
            if(p_id.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your id");
            }
            else if(name.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your name");
            }
            else if(bg.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your blood-group");
            }
            else if(address.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your address");
            }
            else if(dob.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your DOB");
            }
            else if(email.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your Email");
            }else{
                if(R1.isSelected() && R2.isSelected()){
                    JOptionPane.showMessageDialog(rootPane, "Please select one option in gender M/F");

                }else if(R1.isSelected()){
                    query = "UPDATE patient SET `Fname`='"+name+"',`Blood_Group`='"+bg+"',`address`='"+address+"',"
                    + "`dob`='"+dob+"',`gender`='"+gender+"',`mob`='"+mobno+"',`email`='"+email+"'WHERE `p_id`='"+p_id+"'";
                    st.executeUpdate(query);
                    cn.close();
                    //System.out.println("Databse Connected!"+query);
                    p.setVisible(true);
                    this.dispose();
                }else{
                    query = "UPDATE `patientregister` SET `name`='"+name+"',`Blood_Group`='"+bg+"',`address`='"+address+"',"
                    + "`dob`='"+dob+"',`gender`='"+gender1+"',`mob`='"+mobno+"',`email`='"+email+"', WHERE `Patient_id`='"+p_id+"'";
                    st.executeUpdate(query);
                    cn.close();
                    //System.out.println("Databse Connected!"+query);
                    p.setVisible(true);
                    this.dispose();
                }

            }

        }catch(Exception ex){
            System.out.println("Error"+ex.getMessage());

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        //Appotiement status
        String p_id = L1.getText();
             try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "SELECT  p_id,Dname,Department,Fee  FROM appointment WHERE p_id='"+p_id+"'";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
 if(rs2.next()){
              //Department.addItem(rs2.getString(1));
              s1.setText(rs2.getString(1));
              s2.setText(rs2.getString(2));
              s3.setText(rs2.getString(3));
              s4.setText(rs2.getString(4));
              //System.out.println(rs2.getString(1));

     }
     
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
        //Apppotiement book
        String dname,date,time,fee,department,app_id,pid;
        department= (String) Department.getSelectedItem();
        dname = (String) cm2.getSelectedItem();
        fee = AT1.getText();
        date = AT2.getText();
        time = AT3.getText();
        app_id = AT4.getText();
        pid=L1.getText();
        try{
             Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
             if(department.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your department");
            }
            else if(dname.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter your Doctor name");
            }
            else if(date.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter a date");
            }
            else if(time.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter a time");
            }else{
            String  query = "insert into appointment(`App_id`,`p_id`,`Dname`,`Department`,`Date`,`Time`,`Fee`) "
                    + "values('"+app_id+"','"+pid+"','"+dname+"','"+department+"','"+date+"','"+time+"','"+fee+"')";
                    st.executeUpdate(query);
                    cn.close();  
                    JOptionPane.showMessageDialog(rootPane, "Book appointment Please check status");
                    AT1.setText("");
                    AT2.setText("");
                    AT3.setText("");
                    AT4.setText("");
                    //System.out.println("Databse Connected!"+query);

            }
            
            
        
        }catch(Exception ex){
        System.out.println("Error"+ex.getMessage());
         JOptionPane.showMessageDialog(rootPane, "Error"+ex.getMessage());
        }
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void s7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_s7KeyPressed
        // TODO add your handling code here:
      
      
        
    }//GEN-LAST:event_s7KeyPressed

    private void s7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s7MouseClicked
        // TODO add your handling code here:
        String con = s5.getText();
        String mob =L1.getText();
        if(con.equals("Confirm")){
        Pyment py = new Pyment(mob);
        py.setVisible(true);
        s5.setText("Status");
        
        }else{
        JOptionPane.showMessageDialog(rootPane, "Please chek your status"); 
        }
        String pid = s1.getText();
        String sta = "Status";
         try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
            String  query = "update appcc set status ='"+sta+"' where pid='"+pid+"'";
                    st.executeUpdate(query);
                    cn.close(); 
                  
                    //System.out.println("Databse Connected!"+query);

            
         }catch(Exception ex){
            System.out.println("Error"+ex.getMessage());

        }   
        
    }//GEN-LAST:event_s7MouseClicked

    private void s7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s7MousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_s7MousePressed

    private void s7ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_s7ComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_s7ComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String pid = s1.getText();
         try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
            String  query = "SELECT status FROM appcc where pid='"+pid+"'";
                ResultSet rs2 = st.executeQuery(query);
                    if(rs2.next()){
              //Department.addItem(rs2.getString(1));
//              s1.setText(rs2.getString(1));
//              s2.setText(rs2.getString(2));
//              s3.setText(rs2.getString(3));
//              s4.setText(rs2.getString(4));
            s5.setText(rs2.getString(1));
             // System.out.println(rs2.getString(1));
     }
                  
                    //System.out.println("Databse Connected!"+query);

            
         }catch(Exception ex){
            System.out.println("Error"+ex.getMessage());

        }
         String p_id = L1.getText();
//        String     department= (String) Department.getSelectedItem();
//        String dname = (String) cm2.getSelectedItem();
             try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
//       String sql1 = "select count(`p_id`) from patient";
       String sql2 = "SELECT  p_id,Dname,Department,Fee  FROM appointment WHERE p_id='"+p_id+"'";
//        ResultSet rs1 = st.executeQuery(sql1);
        ResultSet rs2 = st.executeQuery(sql2);
//     
  
     
 if(rs2.next()){
              //Department.addItem(rs2.getString(1));
              s1.setText(rs2.getString(1));
              s2.setText(rs2.getString(2));
              s3.setText(rs2.getString(3));
              s4.setText(rs2.getString(4));
             // s5.setText("status");
              //System.out.println(rs2.getString(1));

     }
     
    
            }catch(Exception ex ){
                System.out.println("Error"+ex.getMessage());
              }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String d = jTextField1.getText();

        try{
            Connection cn = null;
            Statement st = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
            st = cn.createStatement();
            String sql2 = "SELECT  *  FROM bill WHERE Date='"+d+"'";
            ResultSet rs2 = st.executeQuery(sql2);
            while(rs2.next()){
                //jComboBox1.addItem(rs2.getString(1));
                //System.out.println(rs2.getString(1));
               // String btn1 = btn.getToolTipText();

                String date = rs2.getString(1);
                String bill = rs2.getString(2);
                 String dname = rs2.getString(3);
                String amount = rs2.getString(4);
                String status = rs2.getString(5);
                String tbData[] = {date,bill,dname,amount,status};
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

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AT1;
    private javax.swing.JTextField AT2;
    private javax.swing.JTextField AT3;
    private javax.swing.JTextField AT4;
    private javax.swing.JComboBox<String> Department;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L6;
    private javax.swing.JTextField P1;
    private javax.swing.JTextField P2;
    private javax.swing.JTextField P3;
    private javax.swing.JTextField P4;
    private javax.swing.JTextField P5;
    private javax.swing.JTextField P6;
    private javax.swing.JTextField P7;
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R2;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox<String> cm2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab10;
    private javax.swing.JLabel lab11;
    private javax.swing.JLabel lab12;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel lab9;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s7;
    // End of variables declaration//GEN-END:variables
}
