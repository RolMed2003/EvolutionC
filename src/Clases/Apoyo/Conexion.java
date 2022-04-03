package Clases.Apoyo;

//Imports
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection conectar(){
        
        //Variables.
        String url = "jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3483340";
        String user = "sql3483340";
        String pass = "NRZE8Blmtq";
        Connection cn = null;
        
        try {
            
            cn = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            
            //Mensaje que se mostrara por consola si la conexion falla
            System.err.println("Error desde el metodo conectar."+ e);
            JOptionPane.showMessageDialog(null, "No sirve Enrique, hace la base de datos.");
            
        }
        
        //Retornando el valor de la conexion
        return cn;
    }

}
