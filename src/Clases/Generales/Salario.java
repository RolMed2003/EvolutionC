package Clases.Generales;

import Clases.Apoyo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Salario {

    //Atributos
    String Nombre, tipo;
    float monto, Ingreso_Horas_Extras;

    //Constructor
    public Salario() {

    }

    //Getter and Setter
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getIngreso_Horas_Extras() {
        return Ingreso_Horas_Extras;
    }

    public void setIngreso_Horas_Extras(float Ingreso_Horas_Extras) {
        this.Ingreso_Horas_Extras = Ingreso_Horas_Extras;
    }

    //Metodos particulares
    public DefaultTableModel mostrarSalarios(DefaultTableModel model) {

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from SalariosBase");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] row = new Object[5];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getFloat(4);
                row[4] = rs.getFloat(5);

                model.addRow(row);

            }

        } catch (SQLException e) {

            System.err.println("Error al obtener tabla de salarios" + e);

        }

        return model;

    }

    public DefaultTableModel mostrarSalarios(String Buscar, DefaultTableModel model) {

        //Limpiando tabla
        while (model.getRowCount() != 0) {

            model.removeRow(0);

        }

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from SalariosBase where TipoCargo like "
                    + "'%"+ Buscar +"%'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] row = new Object[5];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getFloat(4);
                row[4] = rs.getFloat(5);

                model.addRow(row);

            }

        } catch (SQLException e) {

            System.err.println("Error al obtener tabla de salarios" + e);

        }

        return model;

    }

}
