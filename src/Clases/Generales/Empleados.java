package Clases.Generales;

import Clases.Apoyo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Empleados {

    //Datos personales.
    String nombreEmpleado, sexo;
    int edad;
    String tipo;
    //Datos percepciones.
    float salario_bruto;
    float horas_extra;
    float horasExtra_total;
    float viaticos;
    float totalPercepciones;
    //Datos deducciones.
    float INSS, IR;
    float total_deducciones;
    //
    float salario_neto;

    public Empleados() {
    }

    //Getters.
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

    public float getSalario_bruto() {
        return salario_bruto;
    }

    public float getHoras_extra() {
        return horas_extra;
    }

    public float getHorasExtra_total() {
        return horasExtra_total;
    }

    public float getViaticos() {
        return viaticos;
    }

    public float getTotalPercepciones() {
        return totalPercepciones;
    }

    public float getINSS() {
        return INSS;
    }

    public float getIR() {
        return IR;
    }

    public float getTotal_deducciones() {
        return total_deducciones;
    }

    public float getSalario_neto() {
        return salario_neto;
    }

    //Setters.
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSalario_bruto(float salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    public void setHoras_extra(float horas_extra) {
        this.horas_extra = horas_extra;
    }

    public void setHorasExtra_total(float horasExtra_total) {
        this.horasExtra_total = horasExtra_total;
    }

    public void setViaticos(float viaticos) {
        this.viaticos = viaticos;
    }

    public void setTotalPercepciones(float totalPercepciones) {
        this.totalPercepciones = totalPercepciones;
    }

    public void setINSS(float INSS) {
        this.INSS = INSS;
    }

    public void setIR(float IR) {
        this.IR = IR;
    }

    public void setTotal_deducciones(float total_deducciones) {
        this.total_deducciones = total_deducciones;
    }

    public void setSalario_neto(float salario_neto) {
        this.salario_neto = salario_neto;
    }

    //Metodos particulares.
    public DefaultTableModel mostrarEmpleados(DefaultTableModel model) {

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select ID_empleado,Nombre_empleado,DNI,Sexo"
                    + "Edad,Cargo,Salario_base from Empleados");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] row = new Object[7];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getInt(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);

                model.addRow(row);

            }

        } catch (SQLException e) {

            System.err.println("Error al obtener tabla de empleados" + e);

        }

        return model;
    }

}
