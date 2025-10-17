package FacturacionEmpleados;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private double sueldo;

    public Empleado (String nombre, String apellido, String dni, double sueldo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.sueldo=sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String toString (){
        return " | Nombre: "+nombre+
                " | lnApellido: "+apellido+
                " | lnDni: "+dni+
                " | Sueldo: "+sueldo;
    }

}
