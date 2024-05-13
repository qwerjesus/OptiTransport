package View;

import config.Conexion;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    Icon alerta = new ImageIcon(getClass().getResource("/imagenes/alertaderegistro.png"));
    Icon ok = new ImageIcon(getClass().getResource("/imagenes/ok.png"));

    int xMouse, yMouse;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.Infoyin.setVisible(false);
        this.regresar.setVisible(false);
        this.invitados.setVisible(false);
        this.registrar.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/newlogo.png")).getImage());
        
        
        Conexion conexion = new Conexion();
        if (conexion.gConnection() != null) {
            System.out.println("Conexión exitosa con la base de datos.");
            conexion.obtenerDatos();
        } else {
            System.out.println("Error al conectar con la base de datos.");
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Infoyin = new javax.swing.JPanel();
        regresar = new javax.swing.JButton();
        invitados = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        X = new javax.swing.JButton();
        iniciarsesion = new javax.swing.JButton();
        info = new javax.swing.JButton();
        fondoL = new javax.swing.JLabel();
        CURSOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Infoyin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regreso.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        Infoyin.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 40, 40));

        invitados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/irinvitados.png"))); // NOI18N
        invitados.setBorder(null);
        invitados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invitadosActionPerformed(evt);
            }
        });
        Infoyin.add(invitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/REGISTRAR.png"))); // NOI18N
        registrar.setBorder(null);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        Infoyin.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informaci.png"))); // NOI18N
        jLabel1.setText("fonodoin");
        Infoyin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 220, 500));

        jPanel1.add(Infoyin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 490));

        usuario.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        usuario.setToolTipText("");
        usuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 30));

        contraseña.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, 30));

        X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SALIIR.png"))); // NOI18N
        X.setBorder(null);
        X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        jPanel1.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 50, 50));

        iniciarsesion.setBackground(null);
        iniciarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciarsesion.png"))); // NOI18N
        iniciarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarsesionActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 100, 40));

        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/info.png"))); // NOI18N
        info.setBorder(null);
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel1.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        fondoL.setBackground(new java.awt.Color(255, 255, 255));
        fondoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuario.png"))); // NOI18N
        fondoL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(fondoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 640, 540));

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

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        System.exit(0);
    }//GEN-LAST:event_XActionPerformed

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

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        Registrar registra = new Registrar();
        registra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        this.Infoyin.setVisible(true);
        this.regresar.setVisible(true);
        this.invitados.setVisible(true);
        this.registrar.setVisible(true);
    }//GEN-LAST:event_infoActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.Infoyin.setVisible(false);
        this.regresar.setVisible(false);
        this.invitados.setVisible(false);
        this.registrar.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void invitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitadosActionPerformed
        Invitados sr = new Invitados();
        sr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_invitadosActionPerformed

    private void iniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarsesionActionPerformed
        final String USUARIO = "usuario";
        final String ADMIN = "admin";
        final String CONDUCTOR = "conductor";
        final String USUARIO_PASSWORD = "12345";
        final String ADMIN_PASSWORD = "admin";
        final String CONDUCTOR_PASSWORD = "conductor";

        String usu = usuario.getText();
        String con = contraseña.getText();

        if (usu.contentEquals(USUARIO) && con.contentEquals(USUARIO_PASSWORD)) {
            Menu ver1 = new Menu();
            ver1.setVisible(true);
            this.dispose();
        } else if (usu.contentEquals(ADMIN) && con.contentEquals(ADMIN_PASSWORD)) {
            Admin ver = new Admin();
            ver.setVisible(true);
            this.dispose();
        } else if (usu.contentEquals(CONDUCTOR) && con.contentEquals(CONDUCTOR_PASSWORD)) {
            PerfilConductor verpc = new PerfilConductor();
            verpc.setVisible(true);
            this.dispose();
        } else {
            mostrarDialogoError();
        }
    }

    private void mostrarDialogoError() {
        AudioClip musica = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/notificacion.wav"));
        musica.play();
        JDialog dialogo = new JDialog();
        dialogo.setUndecorated(true);
        dialogo.setBackground(new Color(0, 0, 0, 0));

        JButton okis = new JButton(ok);
        okis.setBorderPainted(false);
        okis.setContentAreaFilled(false);
        okis.setFocusPainted(false);
        okis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose();
            }
        });

        dialogo.add(okis);
        dialogo.add(new JLabel(alerta));
        okis.setBounds(145, 205, 60, 40);
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);

    }//GEN-LAST:event_iniciarsesionActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CURSOR;
    private javax.swing.JPanel Infoyin;
    private javax.swing.JButton X;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel fondoL;
    private javax.swing.JButton info;
    private javax.swing.JButton iniciarsesion;
    private javax.swing.JButton invitados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
