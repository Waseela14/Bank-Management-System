package javaapplication1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class OrderChequeBook extends javax.swing.JFrame {

    /**
     * Creates new form OrderChequeBook
     */
    public OrderChequeBook() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accountnumber = new javax.swing.JLabel();
        accountbalance = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        chequebook = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\800,533.jpg")); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ORDER CHEQUE BOOK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 51, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Account Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 137, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Account Balance");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 216, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Cheque Book Leaves");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 290, -1, -1));

        accountnumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        accountnumber.setText("Show Account number");
        accountnumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountnumberMouseClicked(evt);
            }
        });
        getContentPane().add(accountnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 137, -1, -1));

        accountbalance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        accountbalance.setText("Show Account Balance");
        accountbalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountbalanceMouseClicked(evt);
            }
        });
        getContentPane().add(accountbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 216, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10    Leaves", "20    Leaves", "50    Leaves", "100  Leaves" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 287, 190, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 366, -1, 33));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 366, -1, 33));

        chequebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequebookActionPerformed(evt);
            }
        });
        getContentPane().add(chequebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Your cheque book has been ordered");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void accountnumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountnumberMouseClicked
        // TODO add your handling code here:
        
         try{
            
        Class.forName("com.mysql. jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project","root","Waseelalj14012000@#$");
        
        String sql ="select accountnumber from account";
        
        PreparedStatement ptst=con.prepareStatement(sql);
             ResultSet rs = ptst.executeQuery(sql);
             
             if(rs.next()){
             accountnumber.setText(rs.getString("accountnumber"));    
             }
             else{
             accountnumber.setText("");
             }
             
             con.close();
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
             
         }
    }//GEN-LAST:event_accountnumberMouseClicked

    private void accountbalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountbalanceMouseClicked
        // TODO add your handling code here:
        try{
            
        Class.forName("com.mysql. jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/project","root","Waseelalj14012000@#$");
        
        String sql ="select accountbalance from account";
        
        PreparedStatement ptst=con.prepareStatement(sql);
             ResultSet rs = ptst.executeQuery(sql);
             
             if(rs.next()){
             accountbalance.setText(rs.getString("accountbalance"));    
             }
             else{
             accountbalance.setText("");
             }
             
             con.close();
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
             
         }
    }//GEN-LAST:event_accountbalanceMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chequebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequebookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chequebookActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectValue=jComboBox1.getSelectedItem().toString();
        chequebook.setText(selectValue);
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(OrderChequeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderChequeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderChequeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderChequeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderChequeBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountbalance;
    private javax.swing.JLabel accountnumber;
    private javax.swing.JTextField chequebook;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
