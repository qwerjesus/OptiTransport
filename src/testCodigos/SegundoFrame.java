//private void servicioActionPerformed(java.awt.event.ActionEvent evt) {                                         
//    JDialog cuadro = new JDialog();
//    cuadro.setUndecorated(true); 
//    cuadro.setBackground(new Color(0, 0, 0, 0)); 
//
//    cuadro.setLayout(null);  
//
//    JLabel label = new JLabel(soli);
//    label.setBounds(50, 20, 200, 30); 
//    cuadro.add(label);
//
//    JTextField info = new JTextField();
//    info.setBounds(50, 60, 200, 30);  
//
//    JButton en = new JButton(enviar);
//    en.setBorderPainted(false);
//    en.setContentAreaFilled(false); 
//    en.setFocusPainted(false); 
//    en.setBounds(50, 100, 100, 30);  
//    en.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            
//        }
//    });
//    cuadro.add(en);
//
//    JButton ce = new JButton(cancelar);  
//    ce.setBorderPainted(false);
//    ce.setContentAreaFilled(false); 
//    ce.setFocusPainted(false); 
//    ce.setBounds(160, 100, 100, 30); 
//    ce.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            cuadro.dispose();  
//        }
//    });
//    cuadro.add(ce);
//
//    cuadro.setSize(300, 200);  // Establece el tamaño del JDialog
//    cuadro.setLocationRelativeTo(null); 
//    cuadro.setVisible(true);
//}

//enviar y cancelar acciones 
/// int option = JOptionPane.showConfirmDialog(null, peticion, "Entrada", JOptionPane.OK_CANCEL_OPTION);
//        if (option == JOptionPane.OK_OPTION) {
//            String text = textField.getText();
//            System.out.println("Texto ingresado: " + text);
//        } else {
//            System.out.println("Cancelado");
//        }