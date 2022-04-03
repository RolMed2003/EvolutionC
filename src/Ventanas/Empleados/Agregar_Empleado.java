
package Ventanas.Empleados;


public class Agregar_Empleado extends javax.swing.JInternalFrame {

    
    public Agregar_Empleado() {
        initComponents();
        
        setSize(726, 527);
        setLocation(277, 80);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Fondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreEmpleado_txt = new javax.swing.JLabel();
        nombreEmpleado_field = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        DNI_txt = new javax.swing.JLabel();
        DNI_field = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        edad_txt = new javax.swing.JLabel();
        edad_field = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        registrar_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        tipo_field = new javax.swing.JLabel();
        tipo_combobx = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Registro de Empleado");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Empleados/cv.png"))); // NOI18N
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 140));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 710, 110));

        nombreEmpleado_txt.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        nombreEmpleado_txt.setText("Nombre del Empleado");
        Fondo.add(nombreEmpleado_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        nombreEmpleado_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nombreEmpleado_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreEmpleado_field.setBorder(null);
        Fondo.add(nombreEmpleado_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 351, 30));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 350, 10));

        DNI_txt.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        DNI_txt.setText("DNI");
        Fondo.add(DNI_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        DNI_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        DNI_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        DNI_field.setBorder(null);
        Fondo.add(DNI_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 197, 30));
        Fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, 10));

        edad_txt.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        edad_txt.setText("Edad");
        Fondo.add(edad_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        edad_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        edad_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        edad_field.setBorder(null);
        Fondo.add(edad_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 50, 30));
        Fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 50, 10));

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
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        registrar_panelLayout.setVerticalGroup(
            registrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Fondo.add(registrar_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 130, 50));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jRadioButton1.setText("Femenino");
        Fondo.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jRadioButton2.setText("Masculino");
        Fondo.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Sexo:");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        tipo_field.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        tipo_field.setText("Tipo:");
        Fondo.add(tipo_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        tipo_combobx.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tipo_combobx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Presidente ejecutivo", "Vicepresidente ejecutivo", "Contador", "Auxiliar contable", "Secretari@", "Guarda de seguridad", "Afanadora", " " }));
        Fondo.add(tipo_combobx, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNI_field;
    private javax.swing.JLabel DNI_txt;
    private javax.swing.JPanel Fondo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edad_field;
    private javax.swing.JLabel edad_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nombreEmpleado_field;
    private javax.swing.JLabel nombreEmpleado_txt;
    private javax.swing.JPanel registrar_panel;
    private javax.swing.JComboBox<String> tipo_combobx;
    private javax.swing.JLabel tipo_field;
    // End of variables declaration//GEN-END:variables
}
