
package View;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.jxmapviewer.JXMapKit;

public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Menu() {
        
        initComponents();
        init();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/newlogo.png")).getImage());
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
        cointrasur = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        transcarive = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        mapagenral1 = new javax.swing.JButton();
        jXMapViewer = new org.jxmapviewer.JXMapViewer();
        fondoL = new javax.swing.JLabel();
        CURSOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cointrasur.setBackground(new java.awt.Color(255, 255, 255));
        cointrasur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cointrasur.png"))); // NOI18N
        cointrasur.setBorder(null);
        cointrasur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cointrasur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cointrasurActionPerformed(evt);
            }
        });
        jPanel1.add(cointrasur, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        perfil.setBackground(new java.awt.Color(255, 255, 255));
        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil2.png"))); // NOI18N
        perfil.setBorder(null);
        perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        jPanel1.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        transcarive.setBackground(new java.awt.Color(255, 255, 255));
        transcarive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/transcaribe.png"))); // NOI18N
        transcarive.setBorder(null);
        transcarive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transcarive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transcariveActionPerformed(evt);
            }
        });
        jPanel1.add(transcarive, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, 40));

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar (2).png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        mapagenral1.setBackground(new java.awt.Color(255, 255, 255));
        mapagenral1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mapageneral.png"))); // NOI18N
        mapagenral1.setBorder(null);
        mapagenral1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mapagenral1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapagenral1ActionPerformed(evt);
            }
        });
        jPanel1.add(mapagenral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));
        jPanel1.add(jXMapViewer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 370, 490));

        fondoL.setBackground(new java.awt.Color(255, 255, 255));
        fondoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/invitados_1.png"))); // NOI18N
        fondoL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(fondoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 610, 530));

        CURSOR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CURSORMouseDragged(evt);
            }
        });
        CURSOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CURSORMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CURSORMousePressed(evt);
            }
        });
        jPanel1.add(CURSOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CURSORMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_CURSORMouseDragged

    private void CURSORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMouseClicked

    }//GEN-LAST:event_CURSORMouseClicked

    private void CURSORMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();


    }//GEN-LAST:event_CURSORMousePressed

    private void transcariveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transcariveActionPerformed
        Transcaribe vert = new Transcaribe();
        vert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transcariveActionPerformed

    private void cointrasurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cointrasurActionPerformed
        Cointrasur verc = new Cointrasur();
        verc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cointrasurActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Login lr = new Login();
        lr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void mapagenral1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapagenral1ActionPerformed
        // TODO add your handling code here:
        MapaGeneralFrame1 mapaGeneralFrame1 = new MapaGeneralFrame1();
        mapaGeneralFrame1.setVisible(true);
    }//GEN-LAST:event_mapagenral1ActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        Perfil verP = new Perfil();
        verP.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_perfilActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CURSOR;
    private javax.swing.JButton cointrasur;
    private javax.swing.JLabel fondoL;
    private javax.swing.JPanel jPanel1;
    private org.jxmapviewer.JXMapViewer jXMapViewer;
    private javax.swing.JButton mapagenral1;
    private javax.swing.JButton perfil;
    private javax.swing.JButton regresar;
    private javax.swing.JButton transcarive;
    // End of variables declaration//GEN-END:variables

    private void init() {
        TileFactoryInfo info = new OSMTileFactoryInfo(); 
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        jXMapViewer.setTileFactory(tileFactory);
        GeoPosition geo = new GeoPosition(10.4065816,-75.5046746);
        jXMapViewer.setAddressLocation(geo);
        jXMapViewer.setZoom(2);
        
        //eventos para mover el mouse
        MouseInputListener mm = new PanMouseInputListener(jXMapViewer); 
        jXMapViewer.addMouseMotionListener(mm);
    }
}

class MapaGeneralFrame1 extends JFrame {
    public MapaGeneralFrame1() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Mapa General");
    }

    private void initComponents() {
        // Crea un JXMapKit para mostrar el mapa general
        JXMapKit jXMapKit = new JXMapKit();
        jXMapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);
        jXMapKit.setAddressLocation(new GeoPosition(10.405508,-75.503549)); // Establece una ubicación inicial

        // Agrega el JXMapKit al JFrame
        add(jXMapKit);
        
        
        setSize(800, 600); 
        jXMapKit.setPreferredSize(new Dimension(800, 600));
        
        pack();
    }
}