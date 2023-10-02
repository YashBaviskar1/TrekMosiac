/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author main
 */
public class create_trek extends javax.swing.JFrame {

    
    public create_trek() {
        initComponents();
        
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcreate_trek = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblregister = new javax.swing.JLabel();
        jtextlast_name = new javax.swing.JTextField();
        jtextemail = new javax.swing.JTextField();
        jtextuser_name = new javax.swing.JTextField();
        jbtregister = new javax.swing.JButton();
        firstNameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, null));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcreate_trek.setText("fg");
        jPanel1.add(jcreate_trek, new org.netbeans.lib.awtextra.AbsoluteConstraints(1640, 75, 314, 388));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 8, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblregister.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        lblregister.setForeground(new java.awt.Color(255, 255, 255));
        lblregister.setText("     Registeration");
        lblregister.setToolTipText("");
        jPanel2.add(lblregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 14, 163, 37));

        jtextlast_name.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jtextlast_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtextlast_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextlast_nameActionPerformed(evt);
            }
        });
        jPanel2.add(jtextlast_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 271, 41));

        jtextemail.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        jtextemail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtextemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextemailActionPerformed(evt);
            }
        });
        jPanel2.add(jtextemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 271, 44));

        jtextuser_name.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jtextuser_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtextuser_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextuser_nameActionPerformed(evt);
            }
        });
        jPanel2.add(jtextuser_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 271, 43));

        jbtregister.setBackground(new java.awt.Color(153, 153, 153));
        jbtregister.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jbtregister.setForeground(new java.awt.Color(255, 255, 255));
        jbtregister.setText("register");
        jbtregister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtregisterActionPerformed(evt);
            }
        });
        jPanel2.add(jbtregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 418, 124, 43));

        firstNameField.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        firstNameField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        firstNameField.setDoubleBuffered(true);
        firstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFieldFocusLost(evt);
            }
        });
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 273, 47));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email :\n");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 70, -1));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 270, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Username :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password : ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -60, 1100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 390, 480));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/logigooo.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1080, 740));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextlast_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextlast_nameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtextlast_nameActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void jtextemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextemailActionPerformed

    private void jbtregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtregisterActionPerformed
        // TODO add your handling code here:
        try{
        String enteredUsername = jtextuser_name.getText();
        String enteredPassword = jPasswordField1.getText();
        
        Connection con = DatabaseConnection.connect();
        String query = "INSERT into user_login (username, password) VALUES (?, ?)";
        try(PreparedStatement statement = con.prepareStatement(query)){
            statement.setString(1, enteredUsername);
            statement.setString(2, enteredPassword);
            
        statement.executeUpdate();
        JOptionPane.showConfirmDialog(this, "Registration confirmed Sign in to continue");
        create_trek.this.dispose();
        login Login = new login();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
        }
            
       
    }//GEN-LAST:event_jbtregisterActionPerformed
    catch(SQLException ex){System.out.print(ex);}
    finally{
            DatabaseConnection.disconnect();
        }
    }
    
    
    
    private void firstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusGained
        
    }//GEN-LAST:event_firstNameFieldFocusGained

    private void firstNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFieldFocusLost
      
       
            
    
    }//GEN-LAST:event_firstNameFieldFocusLost

    private void jtextuser_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextuser_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextuser_nameActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbtregister;
    private javax.swing.JLabel jcreate_trek;
    private javax.swing.JTextField jtextemail;
    private javax.swing.JTextField jtextlast_name;
    private javax.swing.JTextField jtextuser_name;
    private javax.swing.JLabel lblregister;
    // End of variables declaration//GEN-END:variables
}
