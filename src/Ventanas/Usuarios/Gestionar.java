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

        loading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuariosTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editarBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscarTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel loading;
    private javax.swing.JTable usuariosTbl;
    // End of variables declaration//GEN-END:variables

}
