package Clases.Apoyo;

//Imports
import java.sql.*;

public class Conexion {

    public static Connection conectar(){
        
        //Variables.
        String url = "jdbc:mysql://sql3.freemysqlhosting.net:3306/sql3481829";
        String user = "sql3481829";
        String pass = "zPVEAE7ie2";
        Connection cn = null;
        
        try {
            
            cn = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            
            //Mensaje que se mostrara por consola si la conexion falla
            System.err.println("Error desde el metodo conectar.");
            
        }
        
        //Retornando el valor de la conexion
        return cn;
    }

}
