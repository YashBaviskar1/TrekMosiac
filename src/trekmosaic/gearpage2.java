/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
public class gearpage2 extends javax.swing.JFrame {

    /**
     * Creates new form gearpage2
     */
    public gearpage2() {
        initComponents();
        name = "Trek shoes";
        getItemfromDatabase(name);
        getItemfromDatabase(name);
        Panelitem1();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        item6Panel = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shoeResntButton = new javax.swing.JButton();
        clickCount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        item1Panel = new javax.swing.JPanel();
        item1ImagePanel = new javax.swing.JPanel();
        item1Name = new javax.swing.JLabel();
        item1Price = new javax.swing.JLabel();
        item1Rentbutton = new javax.swing.JButton();
        item1counter = new javax.swing.JLabel();
        item1feature2 = new javax.swing.JLabel();
        item1feature3 = new javax.swing.JLabel();
        item1feature1 = new javax.swing.JLabel();
        item1plus = new javax.swing.JButton();
        item1minus = new javax.swing.JButton();
        item2Panel = new javax.swing.JPanel();
        imagePanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        shoeResntButton2 = new javax.swing.JButton();
        clickCount2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        item3Panel = new javax.swing.JPanel();
        imagePanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        shoeResntButton3 = new javax.swing.JButton();
        clickCount3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        item4Panel = new javax.swing.JPanel();
        imagePanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        shoeResntButton4 = new javax.swing.JButton();
        clickCount4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        item5Panel = new javax.swing.JPanel();
        imagePanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        shoeResntButton5 = new javax.swing.JButton();
        clickCount5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        costButton = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bglabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Swis721 Blk BT", 0, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("RENT GEARS");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        item6Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item6Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel.setBackground(new java.awt.Color(204, 204, 204));
        imagePanel.setForeground(new java.awt.Color(204, 204, 204));
        imagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item6Panel.add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("NAME OF ITEM ");
        item6Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("PRICE : ");
        item6Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 116, 27));

        shoeResntButton.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton.setText("RENT ");
        shoeResntButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButtonActionPerformed(evt);
            }
        });
        item6Panel.add(shoeResntButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 193, 76, 27));

        clickCount.setBackground(new java.awt.Color(153, 153, 153));
        clickCount.setText("   0");
        clickCount.setToolTipText("");
        clickCount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item6Panel.add(clickCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 157, 27, 27));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("feature");
        item6Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("feature");
        item6Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("feature");
        item6Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton13.setText("+");
        jButton13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item6Panel.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 160, 25, 17));

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton14.setText("-");
        jButton14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item6Panel.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 160, 25, 17));

        jPanel1.add(item6Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 300, 230));

        item1Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item1ImagePanel.setBackground(new java.awt.Color(204, 204, 204));
        item1ImagePanel.setForeground(new java.awt.Color(204, 204, 204));
        item1ImagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item1Panel.add(item1ImagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        item1Name.setBackground(new java.awt.Color(153, 153, 153));
        item1Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item1Name.setForeground(new java.awt.Color(0, 51, 51));
        item1Name.setText("NAME OF ITEM ");
        item1Panel.add(item1Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 138, 142, 33));

        item1Price.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        item1Price.setText("PRICE : ");
        item1Panel.add(item1Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 182, 116, 27));

        item1Rentbutton.setBackground(new java.awt.Color(204, 204, 255));
        item1Rentbutton.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        item1Rentbutton.setText("RENT ");
        item1Rentbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        item1Rentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1RentbuttonActionPerformed(evt);
            }
        });
        item1Panel.add(item1Rentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 185, 76, 27));

        item1counter.setBackground(new java.awt.Color(153, 153, 153));
        item1counter.setText("   0");
        item1counter.setToolTipText("");
        item1counter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item1Panel.add(item1counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 144, 27, 27));

        item1feature2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item1feature2.setText("feature");
        item1Panel.add(item1feature2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 70, 135, 28));

        item1feature3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item1feature3.setText("feature");
        item1Panel.add(item1feature3, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 104, 135, 28));

        item1feature1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        item1feature1.setText("feature");
        item1Panel.add(item1feature1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 30, 135, 28));

        item1plus.setBackground(new java.awt.Color(204, 204, 204));
        item1plus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item1plus.setText("+");
        item1plus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item1plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1plusActionPerformed(evt);
            }
        });
        item1Panel.add(item1plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 147, 25, 17));

        item1minus.setBackground(new java.awt.Color(204, 204, 204));
        item1minus.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        item1minus.setText("-");
        item1minus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item1minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1minusActionPerformed(evt);
            }
        });
        item1Panel.add(item1minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 147, 25, 17));

        jPanel1.add(item1Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 230));

        item2Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel2.setBackground(new java.awt.Color(204, 204, 204));
        imagePanel2.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout imagePanel2Layout = new javax.swing.GroupLayout(imagePanel2);
        imagePanel2.setLayout(imagePanel2Layout);
        imagePanel2Layout.setHorizontalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel2Layout.setVerticalGroup(
            imagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        item2Panel.add(imagePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("NAME OF ITEM ");
        item2Panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("PRICE : ");
        item2Panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 116, 27));

        shoeResntButton2.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton2.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton2.setText("RENT ");
        shoeResntButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButton2ActionPerformed(evt);
            }
        });
        item2Panel.add(shoeResntButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 193, 76, 27));

        clickCount2.setBackground(new java.awt.Color(153, 153, 153));
        clickCount2.setText("   0");
        clickCount2.setToolTipText("");
        clickCount2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item2Panel.add(clickCount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 157, 27, 27));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setText("feature");
        item2Panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel14.setText("feature");
        item2Panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel15.setText("feature");
        item2Panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton5.setText("+");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item2Panel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 160, 25, 17));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton6.setText("-");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item2Panel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 160, 25, 17));

        jPanel1.add(item2Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 300, 230));

        item3Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel3.setBackground(new java.awt.Color(204, 204, 204));
        imagePanel3.setForeground(new java.awt.Color(204, 204, 204));
        imagePanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item3Panel.add(imagePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jLabel16.setBackground(new java.awt.Color(153, 153, 153));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 51));
        jLabel16.setText("NAME OF ITEM ");
        item3Panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setText("PRICE : ");
        item3Panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 193, 116, 27));

        shoeResntButton3.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton3.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton3.setText("RENT ");
        shoeResntButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButton3ActionPerformed(evt);
            }
        });
        item3Panel.add(shoeResntButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 196, 76, 27));

        clickCount3.setBackground(new java.awt.Color(153, 153, 153));
        clickCount3.setText("   0");
        clickCount3.setToolTipText("");
        clickCount3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item3Panel.add(clickCount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 157, 27, 27));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel19.setText("feature");
        item3Panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel20.setText("feature");
        item3Panel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel21.setText("feature");
        item3Panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton7.setText("+");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item3Panel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 160, 25, 17));

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton8.setText("-");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item3Panel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 160, 25, 17));

        jPanel1.add(item3Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 300, 230));

        item4Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item4Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel4.setBackground(new java.awt.Color(204, 204, 204));
        imagePanel4.setForeground(new java.awt.Color(204, 204, 204));
        imagePanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item4Panel.add(imagePanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 51));
        jLabel22.setText("NAME OF ITEM ");
        item4Panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel23.setText("PRICE : ");
        item4Panel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 116, 27));

        shoeResntButton4.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton4.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton4.setText("RENT ");
        shoeResntButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButton4ActionPerformed(evt);
            }
        });
        item4Panel.add(shoeResntButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 193, 76, 27));

        clickCount4.setBackground(new java.awt.Color(153, 153, 153));
        clickCount4.setText("   0");
        clickCount4.setToolTipText("");
        clickCount4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item4Panel.add(clickCount4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 157, 27, 27));

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel24.setText("feature");
        item4Panel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel25.setText("feature");
        item4Panel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel26.setText("feature");
        item4Panel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setText("+");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item4Panel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 160, 25, 17));

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton10.setText("-");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item4Panel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 160, 25, 17));

        jPanel1.add(item4Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 300, 230));

        item5Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item5Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel5.setBackground(new java.awt.Color(204, 204, 204));
        imagePanel5.setForeground(new java.awt.Color(204, 204, 204));
        imagePanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item5Panel.add(imagePanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 140, 130));

        jLabel27.setBackground(new java.awt.Color(153, 153, 153));
        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 51));
        jLabel27.setText("NAME OF ITEM ");
        item5Panel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 151, 142, 33));

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel28.setText("PRICE : ");
        item5Panel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 190, 116, 27));

        shoeResntButton5.setBackground(new java.awt.Color(204, 204, 255));
        shoeResntButton5.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 12)); // NOI18N
        shoeResntButton5.setText("RENT ");
        shoeResntButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        shoeResntButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoeResntButton5ActionPerformed(evt);
            }
        });
        item5Panel.add(shoeResntButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 193, 76, 27));

        clickCount5.setBackground(new java.awt.Color(153, 153, 153));
        clickCount5.setText("   0");
        clickCount5.setToolTipText("");
        clickCount5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item5Panel.add(clickCount5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 157, 27, 27));

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel29.setText("feature");
        item5Panel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 58, 135, 28));

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel30.setText("feature");
        item5Panel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 105, 135, 28));

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel31.setText("feature");
        item5Panel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 18, 135, 28));

        jButton11.setBackground(new java.awt.Color(204, 204, 204));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton11.setText("+");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item5Panel.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 160, 25, 17));

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton12.setText("-");
        jButton12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item5Panel.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 160, 25, 17));

        jPanel1.add(item5Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 300, 230));

        costButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        costButton.setText("TOTAL COST : Rs. 0 /-");
        costButton.setOpaque(true);
        jPanel1.add(costButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 210, 60));

        jButton1.setText("REVIEW");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 130, 40));

        jButton2.setText("PURCHASE");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, 130, 40));

        bglabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/BGpict.jpg"))); // NOI18N
        jPanel1.add(bglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1081, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1081, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shoeResntButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButtonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_shoeResntButtonActionPerformed

    private void item1RentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1RentbuttonActionPerformed
        // TODO add your handling code here:
        costButton.setText("TOTAL COST : Rs. " + 180);
    }//GEN-LAST:event_item1RentbuttonActionPerformed

    private void shoeResntButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoeResntButton2ActionPerformed

    private void shoeResntButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoeResntButton3ActionPerformed

    private void shoeResntButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoeResntButton4ActionPerformed

    private void shoeResntButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoeResntButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoeResntButton5ActionPerformed

    private void item1plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1plusActionPerformed
        // TODO add your handling code here:
        itemcounter1++;
        item1counter();
    }//GEN-LAST:event_item1plusActionPerformed

    private void item1minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1minusActionPerformed
        // TODO add your handling code here:
        if(itemcounter1 >= 0){
            itemcounter1--;
            item1counter();
        }
    }//GEN-LAST:event_item1minusActionPerformed
    
    void getItemfromDatabase(String ItemName){
        try {
            Connection con = DatabaseConnection.connect();
            String query = "SELECT * FROM gear_data where name = ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, ItemName);
            ResultSet result = stm.executeQuery();
            if(result.next())
            {
             name = result.getString("name");
             feature1 = result.getString("feature1");
             feature2 = result.getString("feature2");
             feature3 = result.getString("feature3");
             price = result.getInt("price");
            }
            
        } catch (SQLException ex) {
        } finally {
            DatabaseConnection.disconnect();
        }
        
    }
   
     private void Panelitem1(){
        ImageIcon imageIcon = getImageFromDatabase(name);
        imageLabel = new javax.swing.JLabel(imageIcon);
        item1feature1.setText(feature1);
        item1feature2.setText(feature2);
        item1feature3.setText(feature3);
        item1Name.setText(name);
        item1Price.setText("Price :" + price );
        item1ImagePanel.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 130));
     }
    
    void item1counter(){
        item1counter.setText(Integer.toString(itemcounter1));
    }

    private ImageIcon getImageFromDatabase(String Name) {
        try {
            Connection con = DatabaseConnection.connect();
            String selectQuery = "SELECT image FROM gear_data WHERE name = ?";
            try (PreparedStatement statement = con.prepareStatement(selectQuery)) {
                statement.setString(1, Name);
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
        } finally {
            DatabaseConnection.disconnect();
        }
        return null;
    }


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
            java.util.logging.Logger.getLogger(gearpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gearpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gearpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gearpage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gearpage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bglabel;
    private javax.swing.JLabel clickCount;
    private javax.swing.JLabel clickCount2;
    private javax.swing.JLabel clickCount3;
    private javax.swing.JLabel clickCount4;
    private javax.swing.JLabel clickCount5;
    private javax.swing.JLabel costButton;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel imagePanel2;
    private javax.swing.JPanel imagePanel3;
    private javax.swing.JPanel imagePanel4;
    private javax.swing.JPanel imagePanel5;
    private javax.swing.JPanel item1ImagePanel;
    private javax.swing.JLabel item1Name;
    private javax.swing.JPanel item1Panel;
    private javax.swing.JLabel item1Price;
    private javax.swing.JButton item1Rentbutton;
    private javax.swing.JLabel item1counter;
    private javax.swing.JLabel item1feature1;
    private javax.swing.JLabel item1feature2;
    private javax.swing.JLabel item1feature3;
    private javax.swing.JButton item1minus;
    private javax.swing.JButton item1plus;
    private javax.swing.JPanel item2Panel;
    private javax.swing.JPanel item3Panel;
    private javax.swing.JPanel item4Panel;
    private javax.swing.JPanel item5Panel;
    private javax.swing.JPanel item6Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton shoeResntButton;
    private javax.swing.JButton shoeResntButton2;
    private javax.swing.JButton shoeResntButton3;
    private javax.swing.JButton shoeResntButton4;
    private javax.swing.JButton shoeResntButton5;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel imageLabel;
    private int count = 0;
    String feature1;
    String feature2;
    String feature3;
    String name;
    int price;
    int itemcounter1 = 0;
}
