package Ventanas.Usuarios;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.PlaceHolder;
import Clases.Generales.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Gestionar extends javax.swing.JInternalFrame {

    Usuario user = new Usuario();
    Usuario z = new Usuario();

    public Gestionar() {

        initComponents();

        //Modelando ventana.
        setTitle("Gestión de usuarios");
        setSize(790, 490);
        setLocation(245, 105);

        //Placeholder.
        PlaceHolder X = new PlaceHolder("Nombre de usuario", buscarTxt);

        //Tabla.
        new Thread() {

            @Override
            public void run() {

                loading.setVisible(true);
                usuariosTbl.setModel(user.mostrarUsuarios((DefaultTableModel) usuariosTbl.getModel()));
                loading.setVisible(false);

            }

        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editar_frame = new javax.swing.JFrame();
        Fondo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tipoCmb = new javax.swing.JComboBox();
        aplicarBtn = new javax.swing.JButton();
        userTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        loading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariosTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editarBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscarTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();

        editar_frame.setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/edit.png"))); // NOI18N
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editar Registro de Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 540, 80));

        tipoCmb.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        tipoCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Contador", "Aux.Nomina", "Empleado" }));
        Fondo.add(tipoCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 225, -1));

        aplicarBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        aplicarBtn.setText("Aplicar cambios");
        aplicarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarBtnActionPerformed(evt);
            }
        });
        Fondo.add(aplicarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        userTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Fondo.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 225, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel6.setText("Tipo de acceso:");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel4.setText("Nombre de usuario:");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        javax.swing.GroupLayout editar_frameLayout = new javax.swing.GroupLayout(editar_frame.getContentPane());
        editar_frame.getContentPane().setLayout(editar_frameLayout);
        editar_frameLayout.setHorizontalGroup(
            editar_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        editar_frameLayout.setVerticalGroup(
            editar_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editar_frameLayout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setClosable(true);
        setTitle("Gestion de usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/cargando.gif"))); // NOI18N
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usuariosTbl.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        usuariosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Tipo de acceso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(usuariosTbl);
        if (usuariosTbl.getColumnModel().getColumnCount() > 0) {
            usuariosTbl.getColumnModel().getColumn(0).setResizable(false);
            usuariosTbl.getColumnModel().getColumn(1).setResizable(false);
            usuariosTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, 616, 338));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setText("Tabla de usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 43, -1, -1));

        editarBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        editarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/editar-documento.png"))); // NOI18N
        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 132, 117, -1));

        deleteBtn.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/hombre.png"))); // NOI18N
        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 191, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Buscar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        buscarTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(buscarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 11, 175, -1));

        buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Otros/buscar.png"))); // NOI18N
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed

        String buscar = buscarTxt.getText().trim();

        usuariosTbl.setModel(user.mostrarUsuarios(buscar));

    }//GEN-LAST:event_buscarBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed

        int SelectedRow = usuariosTbl.getSelectedRow();

        if (SelectedRow == -1) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila a editar.", " -  Advertencia", JOptionPane.PLAIN_MESSAGE,
                    icon);

        } else {

            String user = (String) usuariosTbl.getValueAt(SelectedRow, 1);
            String tipoacceso = (String) usuariosTbl.getValueAt(SelectedRow, 2);

            userTxt.setText(user);
            int tipoIn = 0;

            switch (tipoacceso) {

                case "Administrador":
                    tipoIn = 0;
                    break;
                case "Contador":
                    tipoIn = 1;
                    break;
                case "Aux.Nomina":
                    tipoIn = 2;
                    break;
                case "Empleado":
                    tipoIn = 3;
                    break;
                default:
                    //si
                    break;
            }

            tipoCmb.setSelectedIndex(tipoIn);

            editar_frame.setVisible(true);
            editar_frame.setSize(540, 367);
            editar_frame.setLocationRelativeTo(null);

        }

    }//GEN-LAST:event_editarBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        //Variables
        int selectedRow = usuariosTbl.getSelectedRow();

        //Validaciones
        if (selectedRow == -1) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un registro.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        } else {

            int ID = (int) usuariosTbl.getValueAt(selectedRow, 0);

            new Thread() {

                @Override
                public void run() {

                    loading.setVisible(true);

                    try {

                        Connection cn = Conexion.conectar();
                        PreparedStatement pst = cn.prepareStatement("delete from Usuarios where ID_USER = '" + ID + "'");

                        pst.execute();

                        Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                        JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente.", " -  Info", JOptionPane.PLAIN_MESSAGE,
                                icon);

                        new Thread() {

                            @Override
                            public void run() {

                                loading.setVisible(true);

                                DefaultTableModel model = (DefaultTableModel) usuariosTbl.getModel();
                                while (model.getRowCount() != 0) {

                                    model.removeRow(0);

                                }
                                usuariosTbl.setModel(user.mostrarUsuarios(model));

                                loading.setVisible(false);

                            }

                        }.start();

                    } catch (SQLException e) {

                        System.err.println("Error al eliminar usuario" + e);

                    }

                    loading.setVisible(false);

                }

            }.start();

        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        editar_frame.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void aplicarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarBtnActionPerformed

        String user = userTxt.getText();
        int sl = tipoCmb.getSelectedIndex();
        String tipo = "";
        int Val = 0;

        switch (sl) {

            case 0:
                tipo = "Administrador";
                break;

            case 1:
                tipo = "Contador";
                break;
            case 2:
                tipo = "Aux.Nomina";
                break;
            case 3:
                tipo = "Empleado";
                break;

            default:
                break;
        }

        if (user.equals("")) {

            Val++;

        }

        int ID = (int) usuariosTbl.getValueAt(usuariosTbl.getSelectedRow(), 0);
        if (Val == 0) {

            try {

                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("update Usuarios set User=?, Role_user=? where ID_USER= '" + ID + "'");

                pst.setString(1, user);
                pst.setString(2, tipo);
                pst.execute();
                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                JOptionPane.showMessageDialog(null, "Usuario editado con exito.", " -  Info",
                        JOptionPane.PLAIN_MESSAGE, icon);

                userTxt.setText("");
                tipoCmb.setSelectedIndex(0);

                new Thread() {
                    public void run() {

                        loading.setVisible(true);
                        DefaultTableModel model = (DefaultTableModel) usuariosTbl.getModel();

                        while (model.getRowCount() != 0) {

                            model.removeRow(0);

                        }

                        usuariosTbl.setModel(z.mostrarUsuarios(model));
                        loading.setVisible(false);

                    }
                }.start();

            } catch (SQLException e) {
                System.err.println("Error al modificar el usuario" + e);
            }

            editar_frame.setVisible(false);
        } else {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", " -  Advertencia", JOptionPane.PLAIN_MESSAGE,
                    icon);

        }

    }//GEN-LAST:event_aplicarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton aplicarBtn;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editarBtn;
    private javax.swing.JFrame editar_frame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel loading;
    private javax.swing.JComboBox tipoCmb;
    private javax.swing.JTextField userTxt;
    private javax.swing.JTable usuariosTbl;
    // End of variables declaration//GEN-END:variables

}
