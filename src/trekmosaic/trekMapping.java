/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trekmosaic;

import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.*;

/**
 *
 * @author ADMIN
 */
public class trekMapping extends javax.swing.JFrame {

    /**
     * Creates new form trekMapping
     */
    public trekMapping() {
        initComponents();
        map();
    }

    private void map(){
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tilefactory = new DefaultTileFactory(info);
        jXMapViewer1.setTileFactory(tilefactory);
        
        GeoPosition geo = new GeoPosition(18.9902425,73.2523064);
        jXMapViewer1.setAddressLocation(geo);
        jXMapViewer1.setZoom(5);
        MouseInputListener m = new PanMouseInputListener(jXMapViewer1);
        jXMapViewer1.addMouseListener(m);
        jXMapViewer1.addMouseMotionListener(m);
        jXMapViewer1.addMouseWheelListener(new ZoomMouseWheelListenerCenter(jXMapViewer1));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagePanel = new javax.swing.JPanel();
        mapDisplay = new javax.swing.JPanel();
        jXMapViewer1 = new org.jxmapviewer.JXMapViewer();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        mapDisplay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jXMapViewer1Layout = new javax.swing.GroupLayout(jXMapViewer1);
        jXMapViewer1.setLayout(jXMapViewer1Layout);
        jXMapViewer1Layout.setHorizontalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jXMapViewer1Layout.setVerticalGroup(
            jXMapViewer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );

        mapDisplay.add(jXMapViewer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -190, 1140, 940));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(944, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mapDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(576, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(mapDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 744, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(trekMapping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trekMapping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trekMapping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trekMapping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trekMapping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel jPanel1;
    private org.jxmapviewer.JXMapViewer jXMapViewer1;
    private javax.swing.JPanel mapDisplay;
    // End of variables declaration//GEN-END:variables
}
