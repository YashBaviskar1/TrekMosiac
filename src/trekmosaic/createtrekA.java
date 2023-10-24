/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;
import java.sql.*;
import javax.swing.ImageIcon;
import trekmosaic.joinatrek;
/**
 *
 * @author khand
 */
public class createtrekA extends javax.swing.JFrame {

    /**
     * Creates new form createtrekA
     */
    public createtrekA() {
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

        jPanel1 = new javax.swing.JPanel();
        panelPune = new javax.swing.JPanel();
        lblPune = new javax.swing.JLabel();
        panelMumbai = new javax.swing.JPanel();
        lblMumbai = new javax.swing.JLabel();
        pandevkund = new javax.swing.JPanel();
        lbldevkund = new javax.swing.JLabel();
        lbldekund = new javax.swing.JLabel();
        buttjoin = new javax.swing.JButton();
        buttinfo = new javax.swing.JButton();
        lbldates = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datelist = new javax.swing.JList<>();
        panpebimage2 = new javax.swing.JPanel();
        lblpebimage2 = new javax.swing.JLabel();
        lblpeb = new javax.swing.JLabel();
        lbldates1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        datelist1 = new javax.swing.JList<>();
        buttinfo1 = new javax.swing.JButton();
        infobutton = new javax.swing.JButton();
        lbljointrek = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        avaliableTrekButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPune.setBackground(new java.awt.Color(255, 255, 255));
        panelPune.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), null, null, new java.awt.Color(0, 102, 102)));
        panelPune.setForeground(new java.awt.Color(255, 255, 255));

        lblPune.setBackground(new java.awt.Color(0, 102, 102));
        lblPune.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblPune.setForeground(new java.awt.Color(0, 153, 153));
        lblPune.setText("PUNE");
        lblPune.setToolTipText("");

        javax.swing.GroupLayout panelPuneLayout = new javax.swing.GroupLayout(panelPune);
        panelPune.setLayout(panelPuneLayout);
        panelPuneLayout.setHorizontalGroup(
            panelPuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuneLayout.createSequentialGroup()
                .addComponent(lblPune, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        panelPuneLayout.setVerticalGroup(
            panelPuneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPuneLayout.createSequentialGroup()
                .addComponent(lblPune, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel1.add(panelPune, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 110, 30));

        panelMumbai.setBackground(new java.awt.Color(255, 255, 255));
        panelMumbai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelMumbai.setForeground(new java.awt.Color(255, 255, 255));

        lblMumbai.setBackground(new java.awt.Color(156, 153, 153));
        lblMumbai.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblMumbai.setText("MUMBAI");
        lblMumbai.setToolTipText("");

        javax.swing.GroupLayout panelMumbaiLayout = new javax.swing.GroupLayout(panelMumbai);
        panelMumbai.setLayout(panelMumbaiLayout);
        panelMumbaiLayout.setHorizontalGroup(
            panelMumbaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMumbaiLayout.createSequentialGroup()
                .addComponent(lblMumbai, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMumbaiLayout.setVerticalGroup(
            panelMumbaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMumbaiLayout.createSequentialGroup()
                .addComponent(lblMumbai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelMumbai, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 30));

        lbldevkund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/resizeddevkund.jpeg"))); // NOI18N

        javax.swing.GroupLayout pandevkundLayout = new javax.swing.GroupLayout(pandevkund);
        pandevkund.setLayout(pandevkundLayout);
        pandevkundLayout.setHorizontalGroup(
            pandevkundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pandevkundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbldevkund, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pandevkundLayout.setVerticalGroup(
            pandevkundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pandevkundLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(lbldevkund, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pandevkund, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 160, 130));

        lbldekund.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbldekund.setText("DEVKUND  WATERFALL");
        jPanel1.add(lbldekund, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 290, 50));

        buttjoin.setBackground(new java.awt.Color(204, 255, 255));
        buttjoin.setText("INFO");
        buttjoin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(204, 255, 255)));
        jPanel1.add(buttjoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 80, 30));

        buttinfo.setText("JOIN");
        buttinfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(204, 255, 255)));
        jPanel1.add(buttinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 80, 30));

        lbldates.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lbldates.setText("Availabe Dates");
        jPanel1.add(lbldates, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        datelist.setBackground(new java.awt.Color(204, 255, 255));
        datelist.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datelist.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        datelist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "31st Thursday", "1st Friday", "2nd Saturday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        datelist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(datelist);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 130, 30));

        lblpebimage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/resized 2.jpeg"))); // NOI18N

        javax.swing.GroupLayout panpebimage2Layout = new javax.swing.GroupLayout(panpebimage2);
        panpebimage2.setLayout(panpebimage2Layout);
        panpebimage2Layout.setHorizontalGroup(
            panpebimage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panpebimage2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblpebimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panpebimage2Layout.setVerticalGroup(
            panpebimage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panpebimage2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblpebimage2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panpebimage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, 130));

        lblpeb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblpeb.setText("PEB FORT");
        jPanel1.add(lblpeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 100, 30));

        lbldates1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lbldates1.setText("Availabe Dates");
        jPanel1.add(lbldates1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        datelist1.setBackground(new java.awt.Color(204, 255, 255));
        datelist1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        datelist1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        datelist1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "24th Thursday", "25th Friday", "26th Saturday" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        datelist1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(datelist1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 130, 30));

        buttinfo1.setText("JOIN");
        buttinfo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(204, 255, 255)));
        buttinfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttinfo1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttinfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, 30));

        infobutton.setText("INFO");
        infobutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), new java.awt.Color(204, 255, 255)));
        infobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infobuttonActionPerformed(evt);
            }
        });
        jPanel1.add(infobutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 80, 30));

        lbljointrek.setBackground(new java.awt.Color(153, 255, 255));
        lbljointrek.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        lbljointrek.setText("JOIN A TREK");
        jPanel1.add(lbljointrek, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 830, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 70, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 830, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 70, 80));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 230, 20));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setText("BACK");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 204, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 180, 30));

        avaliableTrekButton.setText("AVALIABLE TREKS");
        avaliableTrekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliableTrekButtonActionPerformed(evt);
            }
        });
        jPanel1.add(avaliableTrekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 150, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        createtrekA.this.dispose();
        dashboard_v2 db = new dashboard_v2();
        db.setLocationRelativeTo(null);
        db.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttinfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttinfo1ActionPerformed
        // TODO add your handling code here:
        createtrekA.this.dispose();
        Jointrek join_page = new Jointrek();
        join_page.setLocationRelativeTo(null);
        join_page.setVisible(true);
    }//GEN-LAST:event_buttinfo1ActionPerformed

    private void infobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infobuttonActionPerformed
        // TODO add your handling code here:
        
        info info_page = new info();
        info_page.setLocationRelativeTo(null);
        info_page.setVisible(true);
    }//GEN-LAST:event_infobuttonActionPerformed

    private void avaliableTrekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliableTrekButtonActionPerformed
        // TODO add your handling code here:
        createtrekA.this.dispose();
        joinatrek atrek = new joinatrek();
        atrek.setLocationRelativeTo(null);
        atrek.setVisible(true);
    }//GEN-LAST:event_avaliableTrekButtonActionPerformed
  
 private void addTrekPanel(String trekName) {
        javax.swing.JPanel trekPanel;
        trekPanel = new javax.swing.JPanel();
        trekPanel.setBackground(new java.awt.Color(255, 255, 255));
        trekPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 102), null, null, new java.awt.Color(0, 102, 102)));
        
        javax.swing.JLabel lblTrekName = new javax.swing.JLabel();
        lblTrekName.setFont(new java.awt.Font("Dubai", 1, 18));
        lblTrekName.setForeground(new java.awt.Color(0, 153, 153));
        lblTrekName.setText(trekName);

        // You can add more components like JLabels for dates and images here
        
        trekPanel.add(lblTrekName);
        ImageIcon imageIcon = getImageFromDatabase(trekName);
        if (imageIcon != null) {
        javax.swing.JLabel lblImage = new javax.swing.JLabel(imageIcon);
        trekPanel.add(lblImage);
    }
        trekPanel.add(lblTrekName);

    // Add the trek panel to jPanel1
    jPanel1.add(trekPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 420, 290));
        // Add the trek panel to jPanel1
        jPanel1.add(trekPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 420, 290));

        jPanel1.revalidate();
        jPanel1.repaint();
          }
 private ImageIcon getImageFromDatabase(String trekName) {
    try {
        Connection con = DatabaseConnection.connect();
        String selectQuery = "SELECT image FROM trek_data WHERE name = ?";
        try (PreparedStatement statement = con.prepareStatement(selectQuery)) {
            statement.setString(1, trekName);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Blob imageBlob = resultSet.getBlob("image");
                    byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length());
                    ImageIcon imageIcon = new ImageIcon(imageBytes);
                    return imageIcon;
                }
            }
        }
    } catch (SQLException ex) {
    }
    return null;
}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avaliableTrekButton;
    private javax.swing.JButton buttinfo;
    private javax.swing.JButton buttinfo1;
    private javax.swing.JButton buttjoin;
    private javax.swing.JList<String> datelist;
    private javax.swing.JList<String> datelist1;
    private javax.swing.JButton infobutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblMumbai;
    private javax.swing.JLabel lblPune;
    private javax.swing.JLabel lbldates;
    private javax.swing.JLabel lbldates1;
    private javax.swing.JLabel lbldekund;
    private javax.swing.JLabel lbldevkund;
    private javax.swing.JLabel lbljointrek;
    private javax.swing.JLabel lblpeb;
    private javax.swing.JLabel lblpebimage2;
    private javax.swing.JPanel pandevkund;
    private javax.swing.JPanel panelMumbai;
    private javax.swing.JPanel panelPune;
    private javax.swing.JPanel panpebimage2;
    // End of variables declaration//GEN-END:variables
}
