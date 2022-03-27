
package Clases.Generales;


public class Empelados {
    
    //Los atributos
    
    String Usuario_Asignado,Contraseña,Nombre,DNI ;
    float Deduccion_INS,Deduccion_IR,Salario_Bruto,Salario_Neto ;
    int Edad;

    //El constructor
    public Empelados(String Usuario_Asignado, String Contraseña, String Nombre, String DNI, float Deduccion_INS, float Deduccion_IR, float Salario_Bruto, float Salario_Neto, int Edad) {
        this.Usuario_Asignado = Usuario_Asignado;
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Deduccion_INS = Deduccion_INS;
        this.Deduccion_IR = Deduccion_IR;
        this.Salario_Bruto = Salario_Bruto;
        this.Salario_Neto = Salario_Neto;
        this.Edad = Edad;
    }

    //Los getter and setter
    public String getUsuario_Asignado() {
        return Usuario_Asignado;
    }

    public void setUsuario_Asignado(String Usuario_Asignado) {
        this.Usuario_Asignado = Usuario_Asignado;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public float getDeduccion_INS() {
        return Deduccion_INS;
    }

    public void setDeduccion_INS(float Deduccion_INS) {
        this.Deduccion_INS = Deduccion_INS;
    }

    public float getDeduccion_IR() {
        return Deduccion_IR;
    }

    public void setDeduccion_IR(float Deduccion_IR) {
        this.Deduccion_IR = Deduccion_IR;
    }

    public float getSalario_Bruto() {
        return Salario_Bruto;
    }

    public void setSalario_Bruto(float Salario_Bruto) {
        this.Salario_Bruto = Salario_Bruto;
    }

    public float getSalario_Neto() {
        return Salario_Neto;
    }

    public void setSalario_Neto(float Salario_Neto) {
        this.Salario_Neto = Salario_Neto;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    
}