
package View;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PerfilConductor extends javax.swing.JFrame {
   
  Connection con;
    
  Icon alerta = new ImageIcon(getClass().getResource("/imagenes/CORRECTO.png"));
  Icon soli = new ImageIcon(getClass().getResource("/imagenes/solicitud.png"));
    Icon ok = new ImageIcon(getClass().getResource("/imagenes/ok.png"));
    Icon cancelar = new ImageIcon(getClass().getResource("/imagenes/cancelar.png"));
    Icon enviar = new ImageIcon(getClass().getResource("/imagenes/enviar.png"));
   int xMouse,yMouse;
    public PerfilConductor() {
        initComponents();
        establecerConexion();
        cargarDatosConductor();

        this.setLocationRelativeTo(null);
          setIconImage(new ImageIcon(getClass().getResource("/imagenes/newlogo.png")).getImage());
    }
    
    private void establecerConexion (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OptiTransport", "root", "");
        } catch (Exception e) {
            System.err.println("No se puede establecer conexión con la base de datos: " + e);
        }
    
    }
    
    private void cargarDatosConductor (){
        try {
            String query = "SELECT * FROM conductores WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 1); // Reemplaza ID_DEL_CONDUCTOR_A_CARGAR con el ID del conductor deseado

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombreyapellidos.setText(rs.getString("nombre_apellidos"));
                numeroconductor.setText(rs.getString("numero_conductor"));
                nombredeempresa.setText(rs.getString("nombre_empresa"));
                edad.setText(rs.getString("edad"));
                identificacion.setText(rs.getString("identificacion"));
                bus.setText(rs.getString("bus"));
                ruta.setText(rs.getString("ruta"));
                horadesalida.setText(rs.getString("hora_salida"));
                horadesentrada.setText(rs.getString("hora_entrada"));
                recorrido.setText(rs.getString("recorrido"));
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron datos para el conductor especificado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            System.err.println("Error al cargar los datos del conductor: " + e);
        }
        
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
        nombreyapellidos = new javax.swing.JTextPane();
        numeroconductor = new javax.swing.JTextPane();
        nombredeempresa = new javax.swing.JTextPane();
        edad = new javax.swing.JTextPane();
        identificacion = new javax.swing.JTextPane();
        bus = new javax.swing.JTextPane();
        ruta = new javax.swing.JTextPane();
        horadesalida = new javax.swing.JTextPane();
        horadesentrada = new javax.swing.JTextPane();
        recorrido = new javax.swing.JTextPane();
        regresar = new javax.swing.JButton();
        subirfoto2 = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        reporte = new javax.swing.JButton();
        fondoL = new javax.swing.JLabel();
        CURSOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreyapellidos.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        nombreyapellidos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombreyapellidos.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(nombreyapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 190, 20));

        numeroconductor.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        numeroconductor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        numeroconductor.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(numeroconductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 80, 30));

        nombredeempresa.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        nombredeempresa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombredeempresa.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(nombredeempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 80, 30));

        edad.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        edad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edad.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 190, 20));

        identificacion.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        identificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        identificacion.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 190, 20));

        bus.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        bus.setToolTipText("");
        bus.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        bus.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 130, 30));

        ruta.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        ruta.setToolTipText("");
        ruta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ruta.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 130, 30));

        horadesalida.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        horadesalida.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        horadesalida.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(horadesalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 220, 20));

        horadesentrada.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        horadesentrada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        horadesentrada.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(horadesentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 220, 20));

        recorrido.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        recorrido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        recorrido.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(recorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 220, 20));

        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar (2).png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        subirfoto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subirfoto.png"))); // NOI18N
        subirfoto2.setBorder(null);
        subirfoto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subirfoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirfoto2ActionPerformed(evt);
            }
        });
        jPanel1.add(subirfoto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 10, 100, -1));
        jPanel1.add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 53, 155, 153));

        reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Reportes.png"))); // NOI18N
        reporte.setBorder(null);
        reporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });
        jPanel1.add(reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 100, -1));

        fondoL.setBackground(new java.awt.Color(255, 255, 255));
        fondoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Conductor.png"))); // NOI18N
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

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        adminconductor verAC = new adminconductor();
        verAC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void subirfoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirfoto2ActionPerformed

        JFileChooser fileChooser = new JFileChooser();

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {

                Image image = ImageIO.read(selectedFile);

                Image scaledImage = image.getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_DEFAULT);

                Foto.setIcon(new ImageIcon(scaledImage));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_subirfoto2ActionPerformed

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

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        JDialog cuadro = new JDialog();
        cuadro.setUndecorated(true);
        cuadro.setBackground(new Color(0, 0, 0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 0));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel fondo = new JLabel(soli);
        panel.add(fondo);

        JTextField info = new JTextField();
        info.setBounds(30, 50, 290, 150);
        fondo.add(info);

        JButton en = new JButton(enviar);
        en.setBorderPainted(false);
        en.setContentAreaFilled(false);
        en.setFocusPainted(false);
        en.setBounds(100, 200, 60, 40);
        en.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fondo.add(en);

        JButton ce = new JButton(cancelar);
        ce.setBorderPainted(false);
        ce.setContentAreaFilled(false);
        ce.setFocusPainted(false);
        ce.setBounds(170, 200, 60, 40);
        ce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuadro.dispose();
            }
        });
        fondo.add(ce);

        cuadro.add(panel);
        cuadro.pack();
        cuadro.setLocationRelativeTo(null);
        cuadro.setVisible(true);

    }//GEN-LAST:event_reporteActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilConductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                 PerfilConductor perfilConductor = new PerfilConductor();
                new PerfilConductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CURSOR;
    private javax.swing.JLabel Foto;
    private javax.swing.JTextPane bus;
    private javax.swing.JTextPane edad;
    private javax.swing.JLabel fondoL;
    private javax.swing.JTextPane horadesalida;
    private javax.swing.JTextPane horadesentrada;
    private javax.swing.JTextPane identificacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane nombredeempresa;
    private javax.swing.JTextPane nombreyapellidos;
    private javax.swing.JTextPane numeroconductor;
    private javax.swing.JTextPane recorrido;
    private javax.swing.JButton regresar;
    private javax.swing.JButton reporte;
    private javax.swing.JTextPane ruta;
    private javax.swing.JButton subirfoto2;
    // End of variables declaration//GEN-END:variables
}