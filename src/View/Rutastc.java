
package View;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Rutastc extends javax.swing.JFrame {
        Icon ok = new ImageIcon(getClass().getResource("/imagenes/ok.png"));
        Icon[] imagenes = {
        new ImageIcon(getClass().getResource("/imagenes/1llegada.png")),
        new ImageIcon(getClass().getResource("/imagenes/2llegada.png")),
        new ImageIcon(getClass().getResource("/imagenes/3llegada.png")),
        new ImageIcon(getClass().getResource("/imagenes/4llegada.png")),
        new ImageIcon(getClass().getResource("/imagenes/5llegada.png"))
            };
         Timer timer;
           LocalTime startTime;

   int xMouse,yMouse;
    public Rutastc() {
        initComponents();
        this.setLocationRelativeTo(null);
          setIconImage(new ImageIcon(getClass().getResource("/imagenes/newlogo.png")).getImage());
                this.X101.setVisible(false);
                this.X102.setVisible(false);
                this.X103.setVisible(false);
                 iniciarTimer();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ocultar = new javax.swing.JButton();
        solicitar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        X101 = new javax.swing.JLabel();
        X102 = new javax.swing.JLabel();
        X103 = new javax.swing.JLabel();
        consultar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fondoL = new javax.swing.JLabel();
        CURSOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ocultar.setBackground(new java.awt.Color(255, 255, 255));
        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CONSULTARTC.png"))); // NOI18N
        ocultar.setBorder(null);
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultarActionPerformed(evt);
            }
        });
        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 100, -1));

        solicitar.setBackground(new java.awt.Color(255, 255, 255));
        solicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/solicitartc.png"))); // NOI18N
        solicitar.setBorder(null);
        solicitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarActionPerformed(evt);
            }
        });
        jPanel1.add(solicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 100, -1));

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regrsatranscaribe.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 100, -1));

        X101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rutas_X_101.png"))); // NOI18N
        X101.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(X101, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 300));

        X102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rutas_X_102.png"))); // NOI18N
        X102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), java.awt.Color.black, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(X102, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 300));

        X103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rutas_X103_Act_Min.png"))); // NOI18N
        X103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        jPanel1.add(X103, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 300));

        consultar.setBackground(new java.awt.Color(255, 255, 255));
        consultar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        consultar.setForeground(new java.awt.Color(0, 0, 0));
        consultar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X101", "X102", "X103", " " }));
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, 40));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"X101", "5 a.m./9 p.m.", null},
                {"X102", "5 a.m./9 p.m.", null},
                {"X103", "5 a.m./9 p.m.", null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "SALIDA/ENTRADA", "CODUCTOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 260, 300));

        fondoL.setBackground(new java.awt.Color(255, 255, 255));
        fondoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TC.png"))); // NOI18N
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

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
     timer.stop();
   Transcaribe ver = new Transcaribe();
    ver.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_regresarActionPerformed
  private void iniciarTimer() {
    
        timer = new Timer(12000, new ActionListener() {//no ponerlo en menos de 120
            @Override
            public void actionPerformed(ActionEvent e) {
                solicitarActionPerformed(null); 
            }
        });
       
    }
    private void solicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarActionPerformed

        int br = consultar.getSelectedIndex();
        switch (br) {
            case 0:
                this.X101.setVisible(true);
                this.X102.setVisible(false);
                this.X103.setVisible(false);
                mostrarImagenAleatoria();
                timer.stop();
            startTime = LocalTime.now(); 
            timer.start();
                break;
            case 1:
                this.X101.setVisible(false);
                this.X102.setVisible(true);
                this.X103.setVisible(false);
               mostrarImagenAleatoria();
               timer.stop();
            startTime = LocalTime.now(); 
            timer.start();;
                break;
            case 2:
                this.X101.setVisible(false);
                this.X102.setVisible(false);
                this.X103.setVisible(true);
               mostrarImagenAleatoria();
                 timer.stop();
            startTime = LocalTime.now(); 
            timer.start();
                break;
            default:
                throw new AssertionError();
        }
    }
         
  
         private void mostrarImagenAleatoria() {

        int indiceAleatorio = (int) (Math.random() * imagenes.length);
        Icon imagenAleatoria = imagenes[indiceAleatorio];
        AudioClip musica = java.applet.Applet.newAudioClip(getClass().getResource("/sonido/notificacion.wav"));
        musica.play();
        JDialog dialogo = new JDialog();
        dialogo.setUndecorated(true);
        dialogo.setBackground(new Color(0, 0, 0, 0));

        JButton okis = new JButton(new ImageIcon(getClass().getResource("/imagenes/ok.png")));
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
        dialogo.add(new JLabel(imagenAleatoria));
        okis.setBounds(130, 180, 60, 40);
        dialogo.pack();
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
Timer removeTimer = new Timer(5000, new ActionListener() {
         @Override
    public void actionPerformed(ActionEvent e) {
        dialogo.dispose();
        timer.start();
    }
    });
    removeTimer.setRepeats(false); 
    removeTimer.start();
    }//GEN-LAST:event_solicitarActionPerformed
 
    private void ocultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultarActionPerformed
         this.X101.setVisible(false);
        this.X102.setVisible(false);
        this.X103.setVisible(false);
         timer.stop();

    }//GEN-LAST:event_ocultarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarActionPerformed

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
            java.util.logging.Logger.getLogger(Rutastc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutastc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutastc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutastc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Rutastc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CURSOR;
    private javax.swing.JLabel X101;
    private javax.swing.JLabel X102;
    private javax.swing.JLabel X103;
    private javax.swing.JComboBox<String> consultar;
    private javax.swing.JLabel fondoL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton ocultar;
    private javax.swing.JButton regresar;
    private javax.swing.JButton solicitar;
    // End of variables declaration//GEN-END:variables
}
