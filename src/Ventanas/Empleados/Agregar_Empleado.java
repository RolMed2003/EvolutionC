package Ventanas.Empleados;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.Utilities;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Agregar_Empleado extends javax.swing.JInternalFrame {

    Utilities ut = new Utilities();

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
        dni_field = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        DNI_txt = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        edad_txt = new javax.swing.JLabel();
        edad_field = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        registrar_panel = new javax.swing.JPanel();
        registrar_txt = new javax.swing.JLabel();
        sexo_txt = new javax.swing.JLabel();
        femenino_jradio = new javax.swing.JRadioButton();
        masculino_jradio = new javax.swing.JRadioButton();
        cargo_txt = new javax.swing.JLabel();
        tipo_combobx = new javax.swing.JComboBox<>();
        tipo_field = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        nombreEmpleado_field1 = new javax.swing.JTextField();

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

        dni_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        dni_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dni_field.setBorder(null);
        Fondo.add(dni_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, 30));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 350, 10));

        DNI_txt.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        DNI_txt.setText("DNI");
        Fondo.add(DNI_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
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

        registrar_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        registrar_txt.setForeground(new java.awt.Color(255, 255, 255));
        registrar_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrar_txt.setText("REGISTRAR");
        registrar_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrar_txtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registrar_panelLayout = new javax.swing.GroupLayout(registrar_panel);
        registrar_panel.setLayout(registrar_panelLayout);
        registrar_panelLayout.setHorizontalGroup(
            registrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrar_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        registrar_panelLayout.setVerticalGroup(
            registrar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrar_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Fondo.add(registrar_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 130, 50));

        sexo_txt.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        sexo_txt.setText("Sexo:");
        Fondo.add(sexo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        buttonGroup1.add(femenino_jradio);
        femenino_jradio.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        femenino_jradio.setText("Femenino");
        Fondo.add(femenino_jradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        buttonGroup1.add(masculino_jradio);
        masculino_jradio.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        masculino_jradio.setText("Masculino");
        Fondo.add(masculino_jradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        cargo_txt.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        cargo_txt.setText("Cargo:");
        Fondo.add(cargo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        tipo_combobx.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tipo_combobx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Presidente ejecutivo", "Vicepresidente ejecutivo", "Gerente general", "Contador", "Auxiliar contable", "Secretari@", "Guarda de seguridad", "Afanadora", " " }));
        Fondo.add(tipo_combobx, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 190, -1));

        tipo_field.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        tipo_field.setText("Tipo:");
        Fondo.add(tipo_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Gerencial", "Administrativo", "Operativo", " " }));
        Fondo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 190, -1));

        nombreEmpleado_field1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nombreEmpleado_field1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreEmpleado_field1.setBorder(null);
        Fondo.add(nombreEmpleado_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 351, 30));

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

    private void registrar_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrar_txtMouseClicked

        //Variables.
        int Val = 0;
        int edad = 0;
        int select_cargo;
        int select_tipo;
        String name = "", dni = "", sexo = "", cargo = "", tipo = "";
        boolean edadOk = true;

        name = nombreEmpleado_field1.getText();
        select_cargo = tipo_combobx.getSelectedIndex();
        select_tipo = jComboBox1.getSelectedIndex();
        dni = dni_field.getText();

        //Condicionales para la seleccion del JRadioButton.
        if (masculino_jradio.isSelected()) {
            sexo = "Masculino";
        }

        if (femenino_jradio.isSelected()) {
            sexo = "Femenino";
        }

        //Obteniendo valores de la combo box "Cargo".
        if (select_cargo == 1) {

            cargo = "Presidente ejecutivo";
        } else if (select_cargo == 2) {

            cargo = "Vicepresidente ejecutivo";
        } else if (select_cargo == 3) {

            cargo = "Gerente General";
        }else if (select_cargo == 4) {

            cargo = "Contador";
        } else if (select_cargo == 5) {

            cargo = "Auxiliar contable";
        } else if (select_cargo == 6) {

            cargo = "Secretari@";
        } else if (select_cargo == 7) {

            cargo = "Guarda de seguridad";
        } else if (select_cargo == 8) {

            cargo = "Afanadora";
        }

        //Obteniendo valores de la combo box "Tipo".
        if (select_tipo == 1) {

            tipo = "Gerencial";
        } else if (select_tipo == 2) {

            tipo = "Administrativo";
        } else if (select_tipo == 3) {

            tipo = "Operativo";
        }
        //Validaciones para campos vacios.
        if (nombreEmpleado_field1.getText().equals("")) {
            Val++;
            nombreEmpleado_field1.setBackground(new Color(224, 186, 51));

        }
        if (dni_field.getText().equals("")) {
            Val++;
            dni_field.setBackground(new Color(224, 186, 51));

        }

        //Validando la edad
        if (ut.isInt(edad_field.getText())) {

            edad = Integer.parseInt(edad_field.getText());

        } else {

            edadOk = false;

        }

        if (Val == 0) {

            if (edadOk) {

                try {
                    Connection cn = Conexion.conectar();
                    PreparedStatement pst3 = cn.prepareStatement("insert into Empleados values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                    pst3.setInt(1, 0);
                    pst3.setString(2, name);
                    pst3.setString(3, dni);
                    pst3.setString(4, sexo);
                    pst3.setInt(5, edad);
                    pst3.setString(6, cargo);
                    pst3.setString(7, tipo);
                    pst3.setFloat(8, 0);
                    pst3.setFloat(9, 0);
                    pst3.setInt(10, 0);
                    pst3.setFloat(11, 0);
                    pst3.setFloat(12, 0);
                    pst3.setFloat(13, 0);
                    pst3.setString(14, "");
                    pst3.execute();

                    //Mensaje de confirmacion.
                    Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                    JOptionPane.showMessageDialog(null, "Registro guardado exitosamente", " -  Info",
                            JOptionPane.PLAIN_MESSAGE, icon);

                    //Reseteando campos.
                    nombreEmpleado_field1.setText("");
                    dni_field.setText("");
                    edad_field.setText("");
                    buttonGroup1.clearSelection();
                    tipo_combobx.setSelectedIndex(0);
                    jComboBox1.setSelectedIndex(0);
                    
                    cn.close();

                } catch (SQLException e) {

                    System.err.println("Error al registrar usuario." + e);

                }
            } else {

                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor valido para la edad.", " -  Advertencia",
                        JOptionPane.PLAIN_MESSAGE, icon);
            }

        } else {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.",
                    " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        }

    }//GEN-LAST:event_registrar_txtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DNI_txt;
    private javax.swing.JPanel Fondo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cargo_txt;
    private javax.swing.JTextField dni_field;
    private javax.swing.JTextField edad_field;
    private javax.swing.JLabel edad_txt;
    private javax.swing.JRadioButton femenino_jradio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton masculino_jradio;
    private javax.swing.JTextField nombreEmpleado_field1;
    private javax.swing.JLabel nombreEmpleado_txt;
    private javax.swing.JPanel registrar_panel;
    private javax.swing.JLabel registrar_txt;
    private javax.swing.JLabel sexo_txt;
    private javax.swing.JComboBox<String> tipo_combobx;
    private javax.swing.JLabel tipo_field;
    // End of variables declaration//GEN-END:variables
}
