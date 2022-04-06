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
            PreparedStatement pst = cn.prepareStatement("select ID_empleado, Nombre_empleado, DNI, Sexo, Edad, Cargo, Salario_base from Empleados");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] row = new Object[7];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getInt(5);
                row[5] = rs.getString(6);
                row[6] = rs.getFloat(7);

                model.addRow(row);

            }

        } catch (SQLException e) {

            System.err.println("Error al obtener tabla de empleados" + e);

        }

        return model;
    }

    
    //Metodo para el campo "Buscar".
    public DefaultTableModel mostrarEmpleados(String Buscar) {

        Object[] Titulos = new Object[7];
        Titulos[0] = "ID";
        Titulos[1] = "Nombre";
        Titulos[2] = "DNI";
        Titulos[3] = "Sexo";
        Titulos[4] = "Edad";
        Titulos[5] = "Cargo";
        Titulos[6] = "Salario base";

        DefaultTableModel model = new DefaultTableModel(Titulos, 0);

        try {

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select ID_empleado, Nombre_empleado, DNI, Sexo, Edad, "
                    + "Cargo, Salario_Base from Empleados where Nombre_empleado like "
                    + "'%" + Buscar + "%'");

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                Object[] row = new Object[7];

                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getInt(5);
                row[5] = rs.getString(6);
                row[6] = rs.getFloat(7);

                model.addRow(row);

            }

        } catch (SQLException e) {

            System.err.println("Error al obtener tabla de empleados" + e);

        }

        return model;
        
    }

    
    //Metodo para mostrar el salario base dependiendo de la seleccion de la comboBox.
    public float showSalarioBase(String Cargo) {

        float SalarioBase = 0;

        if (Cargo.equalsIgnoreCase("Presidente ejecutivo")) {

            SalarioBase = 25000;

        } else if (Cargo.equalsIgnoreCase("Vicepresidente ejecutivo")) {

            SalarioBase = 20000;

        } else if (Cargo.equalsIgnoreCase("Gerente general")) {

            SalarioBase = 17000;

        } else if (Cargo.equalsIgnoreCase("Contador")) {

            SalarioBase = 15000;

        } else if (Cargo.equalsIgnoreCase("Auxiliar contable")) {

            SalarioBase = 13000;

        } else if (Cargo.equalsIgnoreCase("Secretari@")) {

            SalarioBase = 10000;

        } else if (Cargo.equalsIgnoreCase("Conductor")) {

            SalarioBase = 7000;

        } else if (Cargo.equalsIgnoreCase("Guarda de seguridad")) {

            SalarioBase = 6500;

        } else if (Cargo.equalsIgnoreCase("Afanadora")) {

            SalarioBase = 5500;

        }

        return SalarioBase;
    }

    public String showCargo(int select_cargo) {

        String cargo = "";

        if (select_cargo == 1) {

            cargo = "Presidente ejecutivo";
            
        } else if (select_cargo == 2) {

            cargo = "Vicepresidente ejecutivo";
            
        } else if (select_cargo == 3) {

            cargo = "Gerente General";
            
        } else if (select_cargo == 4) {

            cargo = "Contador";
            
        } else if (select_cargo == 5) {

            cargo = "Auxiliar contable";
            
        } else if (select_cargo == 6) {

            cargo = "Secretari@";
            
        } else if (select_cargo == 7) {

            cargo = "Conductor";
            
        } else if (select_cargo == 8) {

            cargo = "Guarda de seguridad";
            
        } else if (select_cargo == 9) {

            cargo = "Afanadora";
        }

        return cargo;
    }
    
    public String showTipo(int selected){
        
        String Tipo = "";
        
        if(selected == 1 || selected == 2 || selected == 3){
            
            Tipo = "Gerencial";
            
        }else if(selected == 4 || selected == 5 || selected == 6){
            
            Tipo = "Administrativo";
            
        }else if(selected == 7 || selected == 8 || selected == 9){
            
            Tipo = "Operativo";
            
        }
        
        return Tipo;
    }

}
