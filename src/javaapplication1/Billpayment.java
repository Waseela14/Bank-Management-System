package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Billpayment extends javax.swing.JFrame {

    /**
     * Creates new form Billpayment
     */
    public Billpayment() {
        initComponents();
        currentdateTime();
    }
    
    public void currentdateTime(){
        
        
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        datetime.setText(dtf.format(now));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        max = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        acbalance = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        billername = new javax.swing.JTextField();
        payfrom = new javax.swing.JTextField();
        datetime = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        amount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("PAY BILLS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 33, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("<BACK>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 44, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Biller Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 172, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("VIEW LIMITS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 270, 141, 41));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PAY FROM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 329, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("AMOUNT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 465, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("You can pay any bill");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 133, -1, -1));

        jLabel8.setText("MIN");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 180, -1, -1));

        min.setText("0000");
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 180, 96, -1));

        jLabel10.setText("MAX");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 243, -1, -1));

        max.setText("0000");
        getContentPane().add(max, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 243, 96, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 0));
        jLabel12.setText("VIEW ACCOUNT BALANCE");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 429, -1, -1));

        jLabel13.setText("Your Account Balance is");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 470, -1, -1));

        jLabel14.setText("PKR/=");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 470, -1, -1));

        acbalance.setText("0000");
        getContentPane().add(acbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 470, 90, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("SELECT AMOUNT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 369, -1, 32));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("PAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 505, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("CANCEL");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 505, -1, -1));
        getContentPane().add(billername, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 174, 234, -1));
        getContentPane().add(payfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 329, 234, -1));

        datetime.setText("Date");
        datetime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datetimeMouseClicked(evt);
            }
        });
        getContentPane().add(datetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 32, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "Electricity", "Gas", "Water", "Internet", "KMC" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 203, 234, -1));
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 467, 234, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3310/banking","root","");
        {
            
                //to get data fron mysql into the jTextField of account number
                
                String sql="select accountnumber from account";
                
                PreparedStatement ptst=con.prepareStatement(sql);
                ResultSet rs=ptst.executeQuery(sql);
                if(rs.next()){
                    payfrom.setText(rs.getString("accountnumber"));
                }
                else{
                    payfrom.setText("");
                }
                con.close();
            }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
        min.setText("PKR/= 01");
        max.setText("PKR/=50,000");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        String selectValue=jComboBox1.getSelectedItem().toString();
        billername.setText(selectValue);
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        try{
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3310/banking","root","");
        
        //To get data from mysql in jTextField
        String sql="Select accountbalance from account where ID=1";
        PreparedStatement ptst=con.prepareStatement(sql);
        ResultSet rs =ptst.executeQuery(sql);
        
        if(rs.next()){
        acbalance.setText(rs.getString("accountbalance"));
        }
        else{
        acbalance.setText("");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        
    
        
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{    
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3310/banking","root","");
        String amnt=amount.getText();
        int amntInt=Integer.parseInt(amnt);
        String billerName=billername.getText();
        
        //To grt data in jTextField from mysql
        String sql ="Select accountbalance from acount where ID=1";
        PreparedStatement ptst=con.prepareStatement(sql);
        ResultSet rs=ptst.executeQuery(sql);
        if(rs.next()){
        acbalance.setText(rs.getString("accountbalance"));
        String accbalance= rs.getString("accountbalance");
        int accbalanceInt= Integer.parseInt(accbalance);
        
        if (accbalanceInt>=amntInt){
            int leftover=accbalanceInt-amntInt;
            
            String sql1="Update `account` SET `accountbalance` ='"+leftover+"'";
            PreparedStatement ptmt= con.prepareStatement(sql1);
            ptmt.execute();
            
            String sql2= "insert into paybills values(?,?,?)";
            PreparedStatement pts= con.prepareStatement(sql2);
            pts.setString(1, billername.getText());
            pts.setString(2, amount.getText());
            pts.setString(3,datetime.getText());
            pts.executeUpdate();
            JOptionPane.showMessageDialog(null,"your "+billerName+" bill of amount "+amnt+" has been paid.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Your account balance is low that is only "+amnt+" ,kindly recharge the account.");
        }
        
        }
        else{
            
            acbalance.setText("");
        }
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error while establishing the connection");
            
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        Home ho=new Home();
        ho.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectValue=jComboBox1.getSelectedItem().toString();
        billername.setText(selectValue);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void datetimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datetimeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datetimeMouseClicked

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
            java.util.logging.Logger.getLogger(Billpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billpayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acbalance;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField billername;
    private javax.swing.JLabel datetime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel max;
    private javax.swing.JLabel min;
    private javax.swing.JTextField payfrom;
    // End of variables declaration//GEN-END:variables
}
