
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
        setLocation(50,90);
        
        //Place Holders.
        PlaceHolder y = new PlaceHolder("Nombre del empleado", buscarTxt_empleados);
        
        //Tabla.
        new Thread(){
            
            @Override
            public void run(){
                
                loading.setVisible(true);
                EmpleadosTbl.setModel(empleadoobj.mostrarEmpleados((DefaultTableModel)EmpleadosTbl.getModel()));
                loading.setVisible(false);
                
            }
            
        }.start();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpleadosTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editarEmpleados_button = new javax.swing.JButton();
        eliminarEmpleados_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscarTxt_empleados = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();

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

    private void eliminarEmpleados_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEmpleados_buttonActionPerformed
        
       //variables
         int selectedRow = EmpleadosTbl.getSelectedRow();
         
         if (selectedRow == -1) {
             
             Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un Empleado a eliminar.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);
            
         }else {
             
             int ID = (int) EmpleadosTbl.getValueAt(selectedRow,0);
             
             try {
                 
                 Connection cn = Conexion.conectar();
                 PreparedStatement pst = cn.prepareStatement("delete from Empleados where ID_empleado = '"
                        + ID + "'");
                 
                 pst.execute();
                 
                 
                Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente.", " -  Info",
                        JOptionPane.PLAIN_MESSAGE, icon);
                
                DefaultTableModel model = (DefaultTableModel) EmpleadosTbl.getModel();
                while (model.getRowCount() != 0) {
                    
                    model.removeRow(0);
             
                }
                
                EmpleadosTbl.setModel(empleadoobj.mostrarEmpleados(model));
                
             }catch(SQLException e){
                 
                 System.err.println("Error al eliminar empleado"+e);
                        
                        }
             
                
             
                 
             }
    }//GEN-LAST:event_eliminarEmpleados_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmpleadosTbl;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JTextField buscarTxt_empleados;
    private javax.swing.JButton editarEmpleados_button;
    private javax.swing.JButton eliminarEmpleados_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel loading;
    // End of variables declaration//GEN-END:variables
}
