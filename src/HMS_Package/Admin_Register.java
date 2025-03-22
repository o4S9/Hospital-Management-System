/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HMS_Package;

import java.io.File;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFileChooser;
/**
 *
 * @author Onkar
 */
public class Admin_Register extends javax.swing.JFrame {

 
    public Admin_Register() {
        initComponents();
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        P1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        T6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin-Register");
        setBounds(new java.awt.Rectangle(100, 30, 1200, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Admin_Id ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Mob-no");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        T1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        T1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 300, 30));

        T2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        T2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 300, 30));

        T3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        T3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 300, 30));

        T4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        T4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 300, 30));

        T5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        T5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });
        getContentPane().add(T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 300, 30));

        jButton1.setBackground(new java.awt.Color(63, 123, 191));
        jButton1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancle");
        jButton1.setName("Cancle_btn"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, -1, 50));
        jButton1.getAccessibleContext().setAccessibleName("Cancle_btn1");

        jButton2.setBackground(new java.awt.Color(63, 123, 191));
        jButton2.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, 50));
        jButton2.getAccessibleContext().setAccessibleName("Patient_Register");

        jButton3.setBackground(new java.awt.Color(63, 123, 191));
        jButton3.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, 50));

        jButton4.setBackground(new java.awt.Color(63, 123, 191));
        jButton4.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, 50));

        P1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 300, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS_Package/Images/AdminRegisterForm.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1190, -1));

        jButton5.setBackground(new java.awt.Color(63, 123, 191));
        jButton5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Do you have an account?Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 660, -1, -1));

        jButton6.setText("Browse");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, 30));

        T6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        T6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(T6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 300, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS_Package/Images/HMSBackground1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frame2 f2 = new Frame2();
        f2.setVisible(true);
       this.dispose();
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String aid,name,address,mobno,password,age,query,pt;
    
     aid = T1.getText();
     name = T2.getText();
     age = T3.getText();
     address = T4.getText();
     mobno = T5.getText();
     password = P1.getText();
     pt = T6.getText();

   
   
   try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       if(aid.equals("")){
         JOptionPane.showMessageDialog(rootPane, "Please enter your id");
        }
        else if(name.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your name");
        }
          else if(age.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your age");
        }
         else if(address.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your address");
        }
          else if(mobno.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your no");
        }
          else if(password.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your password");
        }
          else{
              query = "INSERT INTO adminregister (`Admin_id`, `Aname`, `age`, `address`, `mobno`, `password`,`image`) "
                      + "VALUES ('"+aid+"','"+name+"','"+age+"','"+address+"','"+mobno+"','"+password+"','"+pt+"')";
              st.executeUpdate(query);
              cn.close();
               //System.out.println("Databse Connected!"+query);
        this.dispose();
        
        Admin a  = new Admin(aid);
        a.setVisible(true);

          }
   }catch(Exception ex){
  System.out.println("Error"+ex.getMessage());
   }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         String aid,Aname,address,mobno,password,age,query;
    
     aid = T1.getText();
     Aname = T2.getText();
     age = T3.getText();
     address = T4.getText();
     mobno = T5.getText();
     password = P1.getText();

   
   
   try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       if(aid.equals("")){
         JOptionPane.showMessageDialog(rootPane, "Please enter your id");
        }
        else if(Aname.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your name");
        }
          else if(age.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your age");
        }
         else if(address.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your address");
        }
          else if(mobno.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your no");
        }
          else if(password.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Please enter your password");
        }
          else{
              query = "UPDATE adminregister SET `Aname`='"+Aname+"',`age`='"+age+"',"
                      + "`address`='"+address+"',`mobno`='"+mobno+"',`password`='"+password+"' WHERE `Admin_id`='"+aid+"'";
              st.executeUpdate(query);
              cn.close();
                System.out.println("Databse Update!"+query);
        this.dispose();
        Admin a  = new Admin(aid);
        a.setVisible(true);

          }
   }catch(Exception ex){
  System.out.println("Error"+ex.getMessage());
   } 
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                 String aid,name,address,mobno,password,age,query;
    
     aid = T1.getText();
     name = T2.getText();
     age = T3.getText();
     address = T4.getText();
     mobno = T5.getText();
     password = P1.getText();

   
   
   try{
       Connection cn = null;
       Statement st = null;
       Class.forName("com.mysql.cj.jdbc.Driver");
       cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","o4n9k3a9r1");
       st = cn.createStatement();
       if(aid.equals("")){
         JOptionPane.showMessageDialog(rootPane, "Please enter your id");
        }
//        else if(name.equals("")){
//                 JOptionPane.showMessageDialog(rootPane, "Please enter your name");
//        }
//          else if(age.equals("")){
//                 JOptionPane.showMessageDialog(rootPane, "Please enter your age");
//        }
//         else if(address.equals("")){
//                 JOptionPane.showMessageDialog(rootPane, "Please enter your address");
//        }
//          else if(mobno.equals("")){
//                 JOptionPane.showMessageDialog(rootPane, "Please enter your no");
//        }
//          else if(password.equals("")){
//                 JOptionPane.showMessageDialog(rootPane, "Please enter your password");
//        }
          else{
              query = "DELETE FROM `adminregister` WHERE `Admin_Id`='"+aid+"'";
              st.executeUpdate(query);
              cn.close();
                System.out.println("Databse Data Delete! "+query);
//        this.dispose();
//        Admin a  = new Admin();
//        a.setVisible(true);

          }
   }catch(Exception ex){
  System.out.println("Error"+ex.getMessage());
   } 

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
            Admin_Login al = new Admin_Login();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JFileChooser ch = new JFileChooser();
        ch.showOpenDialog(null);
        File f = ch.getSelectedFile();
        String fname = f.getName();
        T6.setText(fname);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T5ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField P1;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
