package Ventanas.Empleados;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.PlaceHolder;
import Clases.Generales.Empleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gestionar_empleados extends javax.swing.JInternalFrame {

    Empleados empleadoobj = new Empleados();

    public Gestionar_empleados() {
        initComponents();

        //Modelando ventana.
        setTitle("Gestión de Empleados");
        setSize(1180, 500);
        setLocation(50, 90);

        //Place Holders.
        PlaceHolder y = new PlaceHolder("Nombre del empleado", buscarTxt_empleados);

        //Tabla.
        new Thread() {

            @Override
            public void run() {

                loading.setVisible(true);
                EmpleadosTbl.setModel(empleadoobj.mostrarEmpleados((DefaultTableModel) EmpleadosTbl.getModel()));
                loading.setVisible(false);

            }

        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editar_empleado = new javax.swing.JFrame();
        Fondo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Nombretxt = new javax.swing.JTextField();
        DNItxt = new javax.swing.JTextField();
        Sexotxt = new javax.swing.JTextField();
        Edadtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aplicarcambios_empleado = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpleadosTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editarEmpleados_button = new javax.swing.JButton();
        eliminarEmpleados_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscarTxt_empleados = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();

        editar_empleado.setUndecorated(true);
        editar_empleado.setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/empleado.png"))); // NOI18N
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        Nombretxt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Fondo.add(Nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 220, -1));

        DNItxt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Fondo.add(DNItxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 220, -1));

        Sexotxt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Fondo.add(Sexotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 220, -1));

        Edadtxt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Fondo.add(Edadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 220, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel3.setText("Nombre");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel4.setText("Sexo");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 50, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel5.setText("DNI");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 50, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel6.setText("Edad");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 50, -1));

        aplicarcambios_empleado.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        aplicarcambios_empleado.setText("Aplicar cambios");
        aplicarcambios_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarcambios_empleadoActionPerformed(evt);
            }
        });
        Fondo.add(aplicarcambios_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Fondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Editar Registro de empleado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 100));

        javax.swing.GroupLayout editar_empleadoLayout = new javax.swing.GroupLayout(editar_empleado.getContentPane());
        editar_empleado.getContentPane().setLayout(editar_empleadoLayout);
        editar_empleadoLayout.setHorizontalGroup(
            editar_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editar_empleadoLayout.setVerticalGroup(
            editar_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/cargando.gif"))); // NOI18N
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EmpleadosTbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        EmpleadosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "DNI", "Sexo", "Edad", "Cargo", "Salario base"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmpleadosTbl);
        if (EmpleadosTbl.getColumnModel().getColumnCount() > 0) {
            EmpleadosTbl.getColumnModel().getColumn(0).setResizable(false);
            EmpleadosTbl.getColumnModel().getColumn(1).setResizable(false);
            EmpleadosTbl.getColumnModel().getColumn(2).setResizable(false);
            EmpleadosTbl.getColumnModel().getColumn(3).setResizable(false);
            EmpleadosTbl.getColumnModel().getColumn(4).setResizable(false);
            EmpleadosTbl.getColumnModel().getColumn(5).setResizable(false);
            EmpleadosTbl.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 999, 338));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabla de empleados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 999, -1));

        editarEmpleados_button.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        editarEmpleados_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/editar-documento.png"))); // NOI18N
        editarEmpleados_button.setText("Editar");
        editarEmpleados_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEmpleados_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(editarEmpleados_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1027, 142, 119, -1));

        eliminarEmpleados_button.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        eliminarEmpleados_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/hombre.png"))); // NOI18N
        eliminarEmpleados_button.setText("Eliminar");
        eliminarEmpleados_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEmpleados_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarEmpleados_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 201, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Buscar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        buscarTxt_empleados.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(buscarTxt_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 11, 175, -1));

        buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/buscar_empleado.png"))); // NOI18N
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        String buscar = buscarTxt_empleados.getText().trim();

        EmpleadosTbl.setModel(empleadoobj.mostrarEmpleados(buscar));

    }//GEN-LAST:event_buscarBtnActionPerformed

    private void editarEmpleados_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEmpleados_buttonActionPerformed

        int SelectedRow = EmpleadosTbl.getSelectedRow();
        if (SelectedRow == -1) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un registro a editar.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        } else {

            editar_empleado.setVisible(true);
            editar_empleado.setSize(540, 367);
            editar_empleado.setLocationRelativeTo(null);
            editar_empleado.setAlwaysOnTop(false);

            //Poniendo los datos en la ventana de editar, segun el campo.
            Nombretxt.setText((String) EmpleadosTbl.getValueAt(SelectedRow, 1));
            DNItxt.setText((String) EmpleadosTbl.getValueAt(SelectedRow, 2));
            Sexotxt.setText((String) EmpleadosTbl.getValueAt(SelectedRow, 3));
            Edadtxt.setText(EmpleadosTbl.getValueAt(SelectedRow, 4).toString());

        }


    }//GEN-LAST:event_editarEmpleados_buttonActionPerformed
    private void eliminarEmpleados_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEmpleados_buttonActionPerformed

        //variables
        int selectedRow = EmpleadosTbl.getSelectedRow();

        if (selectedRow == -1) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un Empleado a eliminar.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        } else {

            int ID = (int) EmpleadosTbl.getValueAt(selectedRow, 0);

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("delete from Empleados where ID_empleado = '"
                        + ID + "'");

                pst.execute();

                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente.", " -  Info",
                        JOptionPane.PLAIN_MESSAGE, icon);

                new Thread() {

                    public void run() {

                        loading.setVisible(true);
                        DefaultTableModel model = (DefaultTableModel) EmpleadosTbl.getModel();
                        while (model.getRowCount() != 0) {

                            model.removeRow(0);

                        }

                        EmpleadosTbl.setModel(empleadoobj.mostrarEmpleados(model));
                        loading.setVisible(false);

                    }
                }.start();
            } catch (SQLException e) {

                System.err.println("Error al eliminar empleado" + e);

            }

        }
    }//GEN-LAST:event_eliminarEmpleados_buttonActionPerformed

    private void aplicarcambios_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarcambios_empleadoActionPerformed
        //Variables
        String Nombre = Nombretxt.getText();
        String DNI = DNItxt.getText();
        String Sexo = Sexotxt.getText();
        String Edad = Edadtxt.getText();
        int Val = 0;

        //Validando campos de edicion
        if (Nombre.equals("")) {

            Val++;

        }
        if (DNI.equals("")) {

            Val++;

        }
        if (Sexo.equals("")) {

            Val++;

        }
        if (Edad.equals("")) {

            Val++;

        }

        int ID = (int) EmpleadosTbl.getValueAt(EmpleadosTbl.getSelectedRow(), 0);

        if (Val == 0) {

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("update Empleados set Nombre_Empleado = ?, DNI = ?,"
                        + "Sexo = ?, Edad = ?"
                        + " where ID_empleado = '" + ID + "'");

                pst.setString(1, Nombre);
                pst.setString(2, DNI);
                pst.setString(3, Sexo);
                pst.setString(4, Edad);
                pst.execute();

                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                JOptionPane.showMessageDialog(null, "Registro editado con exito.", " -  Info",
                        JOptionPane.PLAIN_MESSAGE, icon);

                editar_empleado.setVisible(false);

                Nombretxt.setText("");
                DNItxt.setText("");
                Sexotxt.setText("");
                Edadtxt.setText("");

                new Thread() {

                    @Override
                    public void run() {

                        loading.setVisible(true);
                        DefaultTableModel model = (DefaultTableModel) EmpleadosTbl.getModel();

                        while (model.getRowCount() != 0) {

                            model.removeRow(0);

                        }

                        EmpleadosTbl.setModel(empleadoobj.mostrarEmpleados(model));

                        loading.setVisible(false);
                    }

                }.start();
            } catch (SQLException e) {

                System.err.println("Error al actualizar los dato." + e);

            }

        } else {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        }


    }//GEN-LAST:event_aplicarcambios_empleadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        editar_empleado.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNItxt;
    private javax.swing.JTextField Edadtxt;
    private javax.swing.JTable EmpleadosTbl;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField Nombretxt;
    private javax.swing.JTextField Sexotxt;
    private javax.swing.JButton aplicarcambios_empleado;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTxt_empleados;
    private javax.swing.JButton editarEmpleados_button;
    private javax.swing.JFrame editar_empleado;
    private javax.swing.JButton eliminarEmpleados_button;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel loading;
    // End of variables declaration//GEN-END:variables
}
