
package View;

import javax.swing.ImageIcon;


public class Admin extends javax.swing.JFrame {

   int xMouse,yMouse;
    public Admin() {
        initComponents();
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
        MYE = new javax.swing.JButton();
        conductores = new javax.swing.JButton();
        usuarios = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        fondoL = new javax.swing.JLabel();
        CURSOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MYE.setBackground(new java.awt.Color(255, 255, 255));
        MYE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modifi.png"))); // NOI18N
        MYE.setBorder(null);
        MYE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MYE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MYEActionPerformed(evt);
            }
        });
        jPanel1.add(MYE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 170, -1));

        conductores.setBackground(new java.awt.Color(255, 255, 255));
        conductores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adminconductores.png"))); // NOI18N
        conductores.setBorder(null);
        conductores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conductoresActionPerformed(evt);
            }
        });
        jPanel1.add(conductores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 170, -1));

        usuarios.setBackground(new java.awt.Color(255, 255, 255));
        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png"))); // NOI18N
        usuarios.setBorder(null);
        usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        jPanel1.add(usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 170, -1));

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar 3.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 170, -1));

        fondoL.setBackground(new java.awt.Color(255, 255, 255));
        fondoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Admin.png"))); // NOI18N
        fondoL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(fondoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 620, 540));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CURSORMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_CURSORMouseDragged

    private void CURSORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMouseClicked

    }//GEN-LAST:event_CURSORMouseClicked

    private void CURSORMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CURSORMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
        

    }//GEN-LAST:event_CURSORMousePressed

    private void conductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conductoresActionPerformed
    adminconductor verAC = new adminconductor();
    verAC.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_conductoresActionPerformed

    private void MYEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MYEActionPerformed
       MRYE verM = new MRYE();
       verM.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_MYEActionPerformed

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        Usuarios verU = new Usuarios();
        verU.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_usuariosActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Login verL = new Login();
        verL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CURSOR;
    private javax.swing.JButton MYE;
    private javax.swing.JButton conductores;
    private javax.swing.JLabel fondoL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regresar;
    private javax.swing.JButton usuarios;
    // End of variables declaration//GEN-END:variables
}