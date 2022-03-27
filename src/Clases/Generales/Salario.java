
package Clases.Generales;


public class Salario {
    
    //Atributos
    String Nombre, tipo; 
    float  monto, Ingreso_Horas_Extras;

    //Constructor
    public Salario(String Nombre, String tipo, float monto, float Ingreso_Horas_Extras) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.monto = monto;
        this.Ingreso_Horas_Extras = Ingreso_Horas_Extras;
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
    
    
    
}
