package Ventanas.Perfil;

import Clases.Apoyo.Conexion;
import Ventanas.Usuarios.login;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;

public class verPerfil extends javax.swing.JInternalFrame {

    String rolUser = login.rolUser;
    String Username = login.Username;

    public verPerfil() {

        initComponents();

        //Modelando ventana
        setLocation(387, 115);
        setSize(470, 460);

        //Seteando la foto del usuario
        if (rolUser.equals("Administrador")) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/Empleados/Enrique.jpeg"));
            empleadoFoto.setIcon(icon);

        } else if (rolUser.equals("Contador")) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/Empleados/Rolando.jpeg"));
            empleadoFoto.setIcon(icon);

        } else if (rolUser.equals("Empleado")) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/Empleados/Andreus.jpeg"));
            empleadoFoto.setIcon(icon);

        } else if (rolUser.equals("Aux.Nomina")) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/Empleados/Oscar.jpeg"));
            empleadoFoto.setIcon(icon);

        }

        //Obteniendo datos del empleado
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from Empleados where UserAsign = '"
                    + Username + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                //Poniendo los datos en los campos del formulario
                nombre_field.setText(rs.getString(2));
                sexo_field.setText(rs.getString(4));
                edad_field.setText(Integer.toString(rs.getInt(5)));
                puesto_field.setText(rs.getString(6));
                tipo_field.setText(rs.getString(7));
                salario_field.setText(Float.toString(rs.getFloat(8)));
                IdTxt.setText(Integer.toString(rs.getInt(1)));

            }

            cn.close();

        } catch (Exception e) {

            System.err.println("Error al mostrar perfil." + e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        fotoEmpleado_panel = new javax.swing.JPanel();
        empleadoFoto = new javax.swing.JLabel();
        nombre_field = new javax.swing.JTextField();
        sexo_txt = new javax.swing.JLabel();
        sexo_field = new javax.swing.JTextField();
        edad_Txt = new javax.swing.JLabel();
        edad_field = new javax.swing.JTextField();
        puesto_txt = new javax.swing.JLabel();
        puesto_field = new javax.swing.JTextField();
        tipo_txt = new javax.swing.JLabel();
        tipo_field = new javax.swing.JTextField();
        salario_txt = new javax.swing.JLabel();
        salario_field = new javax.swing.JTextField();
        nombre_txt1 = new javax.swing.JLabel();
        nombre_txt2 = new javax.swing.JLabel();
        IdTxt = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Perfil ");
        setToolTipText("");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fotoEmpleado_panelLayout = new javax.swing.GroupLayout(fotoEmpleado_panel);
        fotoEmpleado_panel.setLayout(fotoEmpleado_panelLayout);
        fotoEmpleado_panelLayout.setHorizontalGroup(
            fotoEmpleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empleadoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        fotoEmpleado_panelLayout.setVerticalGroup(
            fotoEmpleado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empleadoFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );

        nombre_field.setEditable(false);
        nombre_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        sexo_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        sexo_txt.setText("Sexo:");

        sexo_field.setEditable(false);
        sexo_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        edad_Txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        edad_Txt.setText("Edad:");

        edad_field.setEditable(false);
        edad_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        puesto_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        puesto_txt.setText("Puesto:");

        puesto_field.setEditable(false);
        puesto_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        tipo_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        tipo_txt.setText("Tipo:");

        tipo_field.setEditable(false);
        tipo_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        salario_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        salario_txt.setText("Salario base:");

        salario_field.setEditable(false);
        salario_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        nombre_txt1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        nombre_txt1.setText("Nombre:");

        nombre_txt2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        nombre_txt2.setText("ID:");

        IdTxt.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(fotoEmpleado_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                                .addComponent(nombre_txt2)
                                .addGap(18, 18, 18)
                                .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(FondoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_field, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexo_txt)
                                    .addComponent(sexo_field, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad_Txt)
                                    .addComponent(edad_field, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre_txt1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salario_txt)
                            .addComponent(tipo_txt)
                            .addComponent(puesto_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puesto_field, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_field, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salario_field, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_txt2))
                .addGap(1, 1, 1)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addComponent(nombre_txt1)
                        .addGap(5, 5, 5)
                        .addComponent(nombre_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sexo_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edad_Txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edad_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fotoEmpleado_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puesto_txt)
                    .addComponent(puesto_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_txt)
                    .addComponent(tipo_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salario_txt)
                    .addComponent(salario_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

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
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel IdTxt;
    private javax.swing.JLabel edad_Txt;
    private javax.swing.JTextField edad_field;
    private javax.swing.JLabel empleadoFoto;
    private javax.swing.JPanel fotoEmpleado_panel;
    private javax.swing.JTextField nombre_field;
    private javax.swing.JLabel nombre_txt1;
    private javax.swing.JLabel nombre_txt2;
    private javax.swing.JTextField puesto_field;
    private javax.swing.JLabel puesto_txt;
    private javax.swing.JTextField salario_field;
    private javax.swing.JLabel salario_txt;
    private javax.swing.JTextField sexo_field;
    private javax.swing.JLabel sexo_txt;
    private javax.swing.JTextField tipo_field;
    private javax.swing.JLabel tipo_txt;
    // End of variables declaration//GEN-END:variables
}
