package Clases.Generales;

import Clases.Apoyo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Nomina {

    public Nomina() {
    }
    
    public DefaultTableModel mostrarDatosNomina(DefaultTableModel model) {

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select ID_empleado, Nombre_empleado, Cargo, Tipo_Cargo from Empleados");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] row = new Object[4];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);

                model.addRow(row);
            }

        } catch (SQLException e) {
            System.err.println("Error al mostrar los tabla de Datos."+e);
        }

        return model;
    }

    
    
    //DedINSS
    public static float GetDedInss(float a){

        float DedInss;

        DedInss = a*0.07f;

        return DedInss;

    }


    //DedIR.
    public static float GetDedIr(float a, float b){

        float result;
        float dedir = 0;

    result = (a - b) * (12);


        if(result>=0.01 && result<=100000.00){

            //Sin instrucciones.

    }else if(result>=100000.01 && result<=200000.00){

            result = result-100000.00f;
            result = result*0.15f;
            result = result/12;
            dedir  = result;

    }else if(result>=200000.01 && result<=350000.00){

            result = result-200000.00f;
            result = result+15000;
            result = result*0.20f;
            result = result/12;
            dedir  = result;

    }else if(result>=350000.01 && result<=500000.00){

            result = result-350000.00f;
            result = result+45000;
            result = result*0.25f;
            result = result/12;
            dedir  = result;

    }else if(result>=500000.00){

            result = result-500000.00f;
            result = result+82500;
            result = result*0.30f;
            result = result/12;
            dedir  = result;

    }


    return dedir;

    }


    //Salario Neto.
    public static float GetSalarioNeto(float a, float b, float c){

        float SalarioNeto;

        SalarioNeto = a - b;
        SalarioNeto -= c;

        return SalarioNeto;
    }
    
    
    
    
    
    
    
    
    
    
}
