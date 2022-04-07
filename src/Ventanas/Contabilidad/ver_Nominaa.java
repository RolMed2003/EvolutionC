package Ventanas.Contabilidad;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.Utilities;
import Clases.Generales.Empleados;
import Clases.Generales.Nomina;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ver_Nominaa extends javax.swing.JInternalFrame {

    Nomina nom = new Nomina();
    Empleados empleado = new Empleados();
    Utilities ut = new Utilities();
    int cMouse, dMouse;
    int IDModificacion = 0;
    String cargo = "";

    public ver_Nominaa() {
        initComponents();
        setSize(1026, 568);
        setLocation(122, 20);

        DefaultTableModel model = (DefaultTableModel) tblDatos_nomina.getModel();
        tblDatos_nomina.setModel(nom.mostrarDatosNomina(model));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrarHoras = new javax.swing.JFrame();
        Fondo_2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        barra_superior2 = new javax.swing.JPanel();
        panel_exit2 = new javax.swing.JPanel();
        txt_exiit2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        viaticos_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        salariobase_field = new javax.swing.JTextField();
        horasExtra_field = new javax.swing.JTextField();
        panel_nomina = new javax.swing.JPanel();
        txt_nomina = new javax.swing.JLabel();
        agregar_button = new javax.swing.JButton();
        Fondo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos_nomina = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNomina = new javax.swing.JTable();
        registrarHoras_button = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        registrarHoras.setUndecorated(true);
        registrarHoras.setResizable(false);

        Fondo_2.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Nómina/payment-day.png"))); // NOI18N
        Fondo_2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        barra_superior2.setBackground(new java.awt.Color(255, 255, 255));
        barra_superior2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superior2MouseDragged(evt);
            }
        });
        barra_superior2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superior2MousePressed(evt);
            }
        });

        panel_exit2.setBackground(new java.awt.Color(255, 255, 255));

        txt_exiit2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        txt_exiit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exiit2.setText("X");
        txt_exiit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_exiit2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txt_exiit2MouseDragged(evt);
            }
        });
        txt_exiit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exiit2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exiit2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exiit2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_exiit2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_exit2Layout = new javax.swing.GroupLayout(panel_exit2);
        panel_exit2.setLayout(panel_exit2Layout);
        panel_exit2Layout.setHorizontalGroup(
            panel_exit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exiit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exit2Layout.setVerticalGroup(
            panel_exit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exiit2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barra_superior2Layout = new javax.swing.GroupLayout(barra_superior2);
        barra_superior2.setLayout(barra_superior2Layout);
        barra_superior2Layout.setHorizontalGroup(
            barra_superior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_superior2Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(panel_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        barra_superior2Layout.setVerticalGroup(
            barra_superior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_superior2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo_2.add(barra_superior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Viaticos:");
        Fondo_2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        viaticos_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        viaticos_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viaticos_fieldActionPerformed(evt);
            }
        });
        Fondo_2.add(viaticos_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 200, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Salario base: ");
        Fondo_2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Horas extras: ");
        Fondo_2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        salariobase_field.setEditable(false);
        salariobase_field.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        salariobase_field.setBorder(null);
        salariobase_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salariobase_fieldActionPerformed(evt);
            }
        });
        Fondo_2.add(salariobase_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));

        horasExtra_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        horasExtra_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasExtra_fieldActionPerformed(evt);
            }
        });
        Fondo_2.add(horasExtra_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 30));

        panel_nomina.setBackground(new java.awt.Color(255, 153, 51));

        txt_nomina.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        txt_nomina.setForeground(new java.awt.Color(255, 255, 255));
        txt_nomina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nomina.setText("Registrar percepciones");

        javax.swing.GroupLayout panel_nominaLayout = new javax.swing.GroupLayout(panel_nomina);
        panel_nomina.setLayout(panel_nominaLayout);
        panel_nominaLayout.setHorizontalGroup(
            panel_nominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nominaLayout.createSequentialGroup()
                .addComponent(txt_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 179, Short.MAX_VALUE))
        );
        panel_nominaLayout.setVerticalGroup(
            panel_nominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_nomina, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        Fondo_2.add(panel_nomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 460, 80));

        agregar_button.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        agregar_button.setText("AGREGAR");
        agregar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_buttonActionPerformed(evt);
            }
        });
        Fondo_2.add(agregar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        javax.swing.GroupLayout registrarHorasLayout = new javax.swing.GroupLayout(registrarHoras.getContentPane());
        registrarHoras.getContentPane().setLayout(registrarHorasLayout);
        registrarHorasLayout.setHorizontalGroup(
            registrarHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        registrarHorasLayout.setVerticalGroup(
            registrarHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Nomina");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos_nomina.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblDatos_nomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cargo", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos_nomina.setRowHeight(20);
        tblDatos_nomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatos_nominaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos_nomina);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 690, 200));

        tblNomina.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salario bruto", "Horas extras", "Total Horas extras", "Viáticos", "Total percepciones", "INSS", "IR", "Total deducciones", "Salario neto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNomina.setRowHeight(20);
        jScrollPane2.setViewportView(tblNomina);

        Fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 970, 160));

        registrarHoras_button.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        registrarHoras_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Nómina/editar_nomina.png"))); // NOI18N
        registrarHoras_button.setText("Registrar horas extras");
        registrarHoras_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarHoras_buttonActionPerformed(evt);
            }
        });
        Fondo.add(registrarHoras_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tabla de empleados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Fondo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 50));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nómina del empleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(736, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1010, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Nómina/employer.png"))); // NOI18N
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione un empleado por favor.");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDatos_nominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatos_nominaMouseClicked

        //Reseteando tabla para que solo se muestre un empleado.
        DefaultTableModel model = (DefaultTableModel) tblNomina.getModel();

        while (model.getRowCount() != 0) {

            model.removeRow(0);

        }

        tblNomina.setModel(model);

        int SelectedRow = tblDatos_nomina.getSelectedRow();

        IDModificacion = (int) tblDatos_nomina.getValueAt(SelectedRow, 0);

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select Salario_base, Horas_extras, Total_horasExtras,"
                    + " Viaticos, Total_percepciones, INSS, IR, Total_deducciones, SalarioNeto "
                    + " from Empleados where ID_empleado = '"+IDModificacion+"'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                DefaultTableModel model1 = (DefaultTableModel) tblNomina.getModel();

                while (model1.getRowCount() != 0) {

                    model1.removeRow(0);

                }

                Object[] row = new Object[9];
                row[0] = rs.getFloat("Salario_base");
                row[1] = rs.getInt("Horas_extras");
                row[2] = rs.getFloat("Total_horasExtras");
                row[3] = rs.getFloat("Viaticos");
                row[4] = rs.getFloat("Total_percepciones");
                row[5] = rs.getFloat("INSS");
                row[6] = rs.getFloat("IR");
                row[7] = rs.getFloat("Total_deducciones");
                row[8] = rs.getFloat("SalarioNeto");

                model.addRow(row);
                tblNomina.setModel(model);
                tblNomina.selectAll();

            }

        } catch (SQLException e) {

            System.err.println(e);

        }

    }//GEN-LAST:event_tblDatos_nominaMouseClicked

    private void registrarHoras_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarHoras_buttonActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblNomina.getModel();

        int x = tblNomina.getSelectedRow();

        if (x == -1) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un registro de la tabla de nomina de empleados.",
                    " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);

        } else {

            registrarHoras.setVisible(true);
            registrarHoras.setSize(461, 515);
            registrarHoras.setLocationRelativeTo(null);

            salariobase_field.setText(Float.toString((Float) tblNomina.getValueAt(x, 0)));

        }

    }//GEN-LAST:event_registrarHoras_buttonActionPerformed

    private void txt_exiit2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MouseDragged

    }//GEN-LAST:event_txt_exiit2MouseDragged

    private void txt_exiit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MouseClicked
        registrarHoras.dispose();
    }//GEN-LAST:event_txt_exiit2MouseClicked

    private void txt_exiit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MouseEntered
        panel_exit2.setBackground(Color.red);
        txt_exiit2.setForeground(Color.white);
    }//GEN-LAST:event_txt_exiit2MouseEntered

    private void txt_exiit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MouseExited
        panel_exit2.setBackground(Color.white);
        txt_exiit2.setForeground(Color.black);
    }//GEN-LAST:event_txt_exiit2MouseExited

    private void txt_exiit2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MousePressed

    }//GEN-LAST:event_txt_exiit2MousePressed

    private void barra_superior2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        registrarHoras.setLocation(x - cMouse, y - dMouse);
    }//GEN-LAST:event_barra_superior2MouseDragged

    private void barra_superior2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior2MousePressed
        cMouse = evt.getX();
        dMouse = evt.getY();
    }//GEN-LAST:event_barra_superior2MousePressed

    private void viaticos_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viaticos_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viaticos_fieldActionPerformed

    private void salariobase_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salariobase_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salariobase_fieldActionPerformed

    private void horasExtra_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasExtra_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasExtra_fieldActionPerformed

    private void agregar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_buttonActionPerformed

        int HorasExtras = 0;
        float viaticos = 0;
        int Val = 0;

        if (ut.isInt(horasExtra_field.getText().trim())) {

            HorasExtras = Integer.parseInt(horasExtra_field.getText().trim());

        } else {

            Val++;

        }
        if (ut.isFloat(viaticos_field.getText().trim())) {

            viaticos = Float.parseFloat(viaticos_field.getText().trim());

        } else {

            Val++;

        }

        if (Val == 0) {

            float totalPerc = 0, INSS = 0, IR = 0, TotalD = 0, SalarioNeto = 0;
            
            try {

                float salariobase = Float.parseFloat(salariobase_field.getText());
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("update Empleados set Horas_Extras = ?, Viaticos = ?, INSS = ?, "
                        + "IR = ?, SalarioNeto = ?, Total_horasExtras = ?, Total_percepciones = ?, Total_deducciones = ? where "
                        + "ID_empleado = '"+ IDModificacion +"'");
                
                pst.setInt(1, HorasExtras);
                pst.setFloat(2, viaticos);
                pst.setFloat(3, Nomina.GetDedInss(salariobase));
                pst.setFloat(4, Nomina.GetDedIr(Nomina.GetDedInss(salariobase), salariobase));
                pst.setFloat(5, salariobase - Nomina.GetDedInss(salariobase) - Nomina.GetDedIr(Nomina.GetDedInss(salariobase), salariobase));
                pst.setFloat(6, HorasExtras * 35);
                pst.setFloat(7, salariobase + viaticos + (HorasExtras * 35));
                pst.setFloat(8, Nomina.GetDedInss(salariobase)+Nomina.GetDedIr(Nomina.GetDedInss(salariobase), salariobase));
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se han agregado los viaticos y horas extras al empleado.");

            } catch (SQLException e) {

                System.err.println(e);

            }

        } else {

            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores validos para todos los campos.");

        }

    }//GEN-LAST:event_agregar_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Fondo_2;
    private javax.swing.JButton agregar_button;
    private javax.swing.JPanel barra_superior2;
    private javax.swing.JTextField horasExtra_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_exit2;
    private javax.swing.JPanel panel_nomina;
    private javax.swing.JFrame registrarHoras;
    private javax.swing.JButton registrarHoras_button;
    private javax.swing.JTextField salariobase_field;
    private javax.swing.JTable tblDatos_nomina;
    private javax.swing.JTable tblNomina;
    private javax.swing.JLabel txt_exiit2;
    private javax.swing.JLabel txt_nomina;
    private javax.swing.JTextField viaticos_field;
    // End of variables declaration//GEN-END:variables
}
