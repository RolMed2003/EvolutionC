package Clases.Generales;

import Clases.Apoyo.Conexion;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Usuario {

    //Atributos
    String Nombre_User;
    String Password_User;
    String Role_User;

    //Constructor
    public Usuario() {

    }

    //Getters and setters
    public String getNombre_User() {
        return Nombre_User;
    }

    public void setNombre_User(String Nombre_User) {
        this.Nombre_User = Nombre_User;
    }

    public String getPassword_User() {
        return Password_User;
    }

    public void setPassword_User(String Password_User) {
        this.Password_User = Password_User;
    }

    public String getRole_User() {
        return Role_User;
    }

    public void setRole_User(String Role_User) {
        this.Role_User = Role_User;
    }

    //Metodos particulares
    public DefaultTableModel mostrarUsuarios(DefaultTableModel model) {

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select ID_USER, User, Role_user from Usuarios");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] row = new Object[3];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);

                model.addRow(row);

            }

        } catch (SQLException e) {

            System.err.println("Error al obtener tabla de usuarios" + e);

        }

        return model;
    }

    public DefaultTableModel mostrarUsuarios(String Buscar) {

        Object[] Titulos = new Object[3];
        Titulos[0] = "ID";
        Titulos[1] = "Nombre de usuario";
        Titulos[2] = "Tipo de acceso";
        
        DefaultTableModel model = new DefaultTableModel(Titulos, 0);
        
        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select ID_USER, User, Role_user from Usuarios where User like "
                    + "'%"+ Buscar +"%'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] row = new Object[3];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);

                model.addRow(row);

            }

        } catch (SQLException e) {

            System.err.println("Error al obtener tabla de usuarios" + e);

        }

        return model;

    }

}
