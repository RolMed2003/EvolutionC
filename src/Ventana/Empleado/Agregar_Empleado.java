
package Ventana.Empleado;


public class Agregar_Empleado extends javax.swing.JInternalFrame {

    
    public Agregar_Empleado() {
        initComponents();
        
        setLocation(387, 0);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Nombre_Empleado_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DNI_txt = new javax.swing.JTextField();
        Edad_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Usuario_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        registrar_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registro de Empleado");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Empleados/Icon/cv.png"))); // NOI18N
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, 140));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 490, 110));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Nombre del Empleado");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        Nombre_Empleado_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Nombre_Empleado_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Nombre_Empleado_txt.setBorder(null);
        Fondo.add(Nombre_Empleado_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 351, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("DNI");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        DNI_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        DNI_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        DNI_txt.setBorder(null);
        Fondo.add(DNI_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 197, 30));

        Edad_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Edad_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Edad_txt.setBorder(null);
        Fondo.add(Edad_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 50, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Edad");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Usuario");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        Usuario_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Usuario_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Usuario_txt.setBorder(null);
        Fondo.add(Usuario_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 180, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Contraseña");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPasswordField1.setBorder(null);
        Fondo.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 183, 30));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 180, 10));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 350, 10));
        Fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 10));
        Fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 50, 10));
        Fondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 10));

        registrar_panel.setBackground(new java.awt.Color(255, 102, 102));
        registrar_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTRAR");

        javax.swing.GroupLayout registrar_panelLayout = new javax.swing.GroupLayout(registrar_panel);
        registrar_panel.setLayout(registrar_panelLayout);
        registrar_panelLayout.setHorizontalGroup(
            registrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        registrar_panelLayout.setVerticalGroup(
            registrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Fondo.add(registrar_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNI_txt;
    private javax.swing.JTextField Edad_txt;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField Nombre_Empleado_txt;
    private javax.swing.JTextField Usuario_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPanel registrar_panel;
    // End of variables declaration//GEN-END:variables
}
