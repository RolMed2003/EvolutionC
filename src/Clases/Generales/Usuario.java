package Clases.Generales;

import Clases.Apoyo.Conexion;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public class Usuario {

    //Atributos
    String Nombre_User;
    String Password_User;
    String Role_User;

    //Constructor
    public Usuario(){
        
        
        
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
    public DefaultTableModel mostrarUsuarios(){
        
        DefaultTableModel model = new DefaultTableModel();
        
        try {
            
            Connection cn = Conexion.conectar();
            
        } catch (Exception e) {
        }
        
        return model;
    }
    
}
