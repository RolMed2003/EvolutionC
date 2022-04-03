
package Ventanas.Empleados;

import Clases.Apoyo.PlaceHolder;
import Clases.Generales.Empleados;
import javax.swing.table.DefaultTableModel;


public class Gestionar_empleados extends javax.swing.JInternalFrame {

   Empleados emp = new Empleados();
    
    public Gestionar_empleados() {
        initComponents();
        
        
        //Modelando ventana.
        setTitle("Gestión de Empleados");
        setSize(940, 495);
        setLocation(170,90);
        
        //Place Holders.
        PlaceHolder y = new PlaceHolder("Nombre del empleado", buscarTxt_empleados);
        
        //Tabla.
        
        EmpleadosTbl.setModel(emp.mostrarEmpleados((DefaultTableModel)EmpleadosTbl.getModel()));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EmpleadosTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editarEmpleados_button = new javax.swing.JButton();
        eliminarEmpleados_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buscarTxt_empleados = new javax.swing.JTextField();

        setClosable(true);

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

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabla de empleados");

        editarEmpleados_button.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        editarEmpleados_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/editar-documento.png"))); // NOI18N
        editarEmpleados_button.setText("Editar");

        eliminarEmpleados_button.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        eliminarEmpleados_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/hombre.png"))); // NOI18N
        eliminarEmpleados_button.setText("Eliminar");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Buscar:");

        buscarTxt_empleados.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarTxt_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminarEmpleados_button)
                            .addComponent(editarEmpleados_button, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(buscarTxt_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(editarEmpleados_button)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarEmpleados_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmpleadosTbl;
    private javax.swing.JTextField buscarTxt_empleados;
    private javax.swing.JButton editarEmpleados_button;
    private javax.swing.JButton eliminarEmpleados_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
