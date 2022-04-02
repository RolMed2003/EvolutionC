package Clases.Generales;

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

}
