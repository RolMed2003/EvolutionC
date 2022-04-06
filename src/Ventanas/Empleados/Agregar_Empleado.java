package Ventanas.Empleados;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.Utilities;
import Clases.Generales.Empleados;
import Clases.Generales.Usuario;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agregar_Empleado extends javax.swing.JInternalFrame {

    Utilities ut = new Utilities();
    Empleados empleado = new Empleados();
    Usuario user = new Usuario();

    String name = "", dni = "", sexo = "", cargo = "", tipo = "", UserAsign = "";
    float SalarioBase = 0;
    int edad = 0;

    public Agregar_Empleado() {

        initComponents();

        //Modelando
        setSize(815, 660);
        setLocation(260, 0);

        //Cargando usuarios disponibles.
        new Thread() {

            @Override
            public void run() {

                loading.setVisible(true);
                usuariosTbl.setModel(user.mostrarUsuariosDisponibles((DefaultTableModel) usuariosTbl.getModel()));

                if (usuariosTbl.getRowCount() == 0) {

                    jLabel5.setVisible(true);

                } else {

                    jLabel5.setVisible(false);

                }

                loading.setVisible(false);

            }

        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Fondo = new javax.swing.JPanel();
        loading = new javax.swing.JLabel();
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
        cargo_combobx = new javax.swing.JComboBox<String>();
        nombreEmpleado_field1 = new javax.swing.JTextField();
        edad_txt1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariosTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registro de Empleado");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/cargando.gif"))); // NOI18N
        Fondo.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Empleados/cv.png"))); // NOI18N
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 140));

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
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 110));

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
        edad_txt.setText("Asignar un usuario");
        Fondo.add(edad_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

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

        Fondo.add(registrar_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 130, 50));

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

        cargo_combobx.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cargo_combobx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "Presidente ejecutivo", "Vicepresidente ejecutivo", "Gerente general", "Contador", "Auxiliar contable", "Secretari@", "Conductor", "Guarda de seguridad", "Afanadora", " " }));
        Fondo.add(cargo_combobx, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 190, -1));

        nombreEmpleado_field1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nombreEmpleado_field1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreEmpleado_field1.setBorder(null);
        Fondo.add(nombreEmpleado_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 351, 30));

        edad_txt1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        edad_txt1.setText("Edad");
        Fondo.add(edad_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 2, 14)); // NOI18N
        jLabel5.setText("No hay usuarios disponibles, por favor, cree uno nuevo.");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, -1, -1));

        usuariosTbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        usuariosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Tipo de acceso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuariosTbl.setRowHeight(25);
        jScrollPane1.setViewportView(usuariosTbl);
        if (usuariosTbl.getColumnModel().getColumnCount() > 0) {
            usuariosTbl.getColumnModel().getColumn(0).setResizable(false);
            usuariosTbl.getColumnModel().getColumn(0).setPreferredWidth(10);
            usuariosTbl.getColumnModel().getColumn(1).setResizable(false);
            usuariosTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 600, 140));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 205, 20, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 444, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrar_txtMouseClicked

        //Reseteando los warnings.
        nombreEmpleado_field1.setBackground(Color.white);
        dni_field.setBackground(Color.white);
        edad_field.setBackground(Color.white);
        cargo_combobx.setBackground(Color.white);
        jLabel3.setText("");
        jLabel4.setText("");

        //Variables.
        int Val = 0, select_cargo;
        int selectedRow;
        boolean edadOk = true, userOk = true;

        //Obteniendo datos del formulario
        name = nombreEmpleado_field1.getText();
        dni = dni_field.getText();

        select_cargo = cargo_combobx.getSelectedIndex();
        cargo = empleado.showCargo(select_cargo);
        tipo = empleado.showTipo(select_cargo);
        SalarioBase = empleado.showSalarioBase(cargo);

        selectedRow = usuariosTbl.getSelectedRow();

        //Condicionales para la seleccion del JRadioButton.
        if (masculino_jradio.isSelected()) {

            sexo = "Masculino";

        }
        if (femenino_jradio.isSelected()) {

            sexo = "Femenino";

        }

        //Validando la edad
        if (ut.isInt(edad_field.getText())) {

            edad = Integer.parseInt(edad_field.getText());

        } else {

            edadOk = false;

        }

        //Validaciones para campos vacios.
        if (name.equals("")) {

            Val++;
            nombreEmpleado_field1.setBackground(new Color(224, 186, 51));

        }
        if (dni.equals("")) {

            Val++;
            dni_field.setBackground(new Color(224, 186, 51));

        }
        if (edad_field.getText().equals("")) {

            Val++;
            edad_field.setBackground(new Color(224, 186, 51));

        }
        if (!femenino_jradio.isSelected() && !masculino_jradio.isSelected()) {

            Val++;
            jLabel3.setText("!");

        }
        if (cargo_combobx.getSelectedIndex() == 0) {

            Val++;
            cargo_combobx.setBackground(Color.orange);

        }
        if (selectedRow == -1) {

            userOk = false;
            jLabel4.setText("!");

        } else {

            UserAsign = (String) usuariosTbl.getValueAt(selectedRow, 1);

        }

        //Registrando
        if (Val == 0) {

            if (edadOk) {

                if (userOk) {

                    new Thread() {

                        @Override
                        public void run() {

                            loading.setVisible(true);

                            try {
                                Connection cn = Conexion.conectar();
                                PreparedStatement pst3 = cn.prepareStatement("insert into Empleados values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                                PreparedStatement pst4 = cn.prepareStatement("update Usuarios set AsignadoA = ? where User = '"
                                        + UserAsign + "'");

                                pst3.setInt(1, 0);
                                pst3.setString(2, name);
                                pst3.setString(3, dni);
                                pst3.setString(4, sexo);
                                pst3.setInt(5, edad);
                                pst3.setString(6, cargo);
                                pst3.setFloat(7, SalarioBase);
                                pst3.setString(8, tipo);
                                pst3.setFloat(9, 0);
                                pst3.setInt(10, 0);
                                pst3.setFloat(11, 0);
                                pst3.setFloat(12, 0);
                                pst3.setFloat(13, 0);
                                pst3.setString(14, UserAsign);
                                pst3.execute();

                                pst4.setString(1, name);
                                pst4.executeUpdate();

                                loading.setVisible(false);

                                //Mensaje de confirmacion.
                                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                                JOptionPane.showMessageDialog(null, "Registro guardado exitosamente", " -  Info",
                                        JOptionPane.PLAIN_MESSAGE, icon);

                                //Reseteando campos.
                                nombreEmpleado_field1.setText("");
                                dni_field.setText("");
                                edad_field.setText("");
                                buttonGroup1.clearSelection();
                                cargo_combobx.setSelectedIndex(0);
                                DefaultTableModel model = (DefaultTableModel) usuariosTbl.getModel();
                                model.removeRow(selectedRow);
                                if (model.getRowCount() == 0) {

                                    jLabel5.setVisible(true);

                                } else {

                                    jLabel5.setVisible(false);

                                }
                                usuariosTbl.setModel(model);

                                cn.close();

                            } catch (SQLException e) {

                                System.err.println("Error al registrar usuario." + e);

                            }

                        }

                    }.start();

                } else {

                    Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione un usuario para el empleado. ",
                            " -  Advertencia", JOptionPane.PLAIN_MESSAGE, icon);

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
    private javax.swing.JComboBox<String> cargo_combobx;
    private javax.swing.JLabel cargo_txt;
    private javax.swing.JTextField dni_field;
    private javax.swing.JTextField edad_field;
    private javax.swing.JLabel edad_txt;
    private javax.swing.JLabel edad_txt1;
    private javax.swing.JRadioButton femenino_jradio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JLabel loading;
    private javax.swing.JRadioButton masculino_jradio;
    private javax.swing.JTextField nombreEmpleado_field1;
    private javax.swing.JLabel nombreEmpleado_txt;
    private javax.swing.JPanel registrar_panel;
    private javax.swing.JLabel registrar_txt;
    private javax.swing.JLabel sexo_txt;
    private javax.swing.JTable usuariosTbl;
    // End of variables declaration//GEN-END:variables
}
