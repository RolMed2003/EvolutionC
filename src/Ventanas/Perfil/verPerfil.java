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
        IdTxt = new javax.swing.JLabel();
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

        setClosable(true);
        setTitle("Perfil ");
        setToolTipText("");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        Fondo.add(fotoEmpleado_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 128, 208));

        IdTxt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        Fondo.add(IdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        nombre_field.setEditable(false);
        nombre_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        nombre_field.setBorder(null);
        Fondo.add(nombre_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 260, 30));

        sexo_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        sexo_txt.setText("Sexo:");
        Fondo.add(sexo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        sexo_field.setEditable(false);
        sexo_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        sexo_field.setBorder(null);
        Fondo.add(sexo_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 140, 30));

        edad_Txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        edad_Txt.setText("Edad:");
        Fondo.add(edad_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        edad_field.setEditable(false);
        edad_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        edad_field.setBorder(null);
        Fondo.add(edad_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 40, 30));

        puesto_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        puesto_txt.setText("Puesto:");
        Fondo.add(puesto_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        puesto_field.setEditable(false);
        puesto_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        puesto_field.setBorder(null);
        Fondo.add(puesto_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 220, -1));

        tipo_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        tipo_txt.setText("Tipo:");
        Fondo.add(tipo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        tipo_field.setEditable(false);
        tipo_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tipo_field.setBorder(null);
        Fondo.add(tipo_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 220, -1));

        salario_txt.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        salario_txt.setText("Salario base:");
        Fondo.add(salario_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        salario_field.setEditable(false);
        salario_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        salario_field.setBorder(null);
        Fondo.add(salario_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, -1));

        nombre_txt1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        nombre_txt1.setText("Nombre:");
        Fondo.add(nombre_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        nombre_txt2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        nombre_txt2.setText("ID:");
        Fondo.add(nombre_txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
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
