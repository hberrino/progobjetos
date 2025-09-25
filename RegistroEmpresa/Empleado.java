package RegistroEmpresa;

public class Empleado extends Asociado{
    private int numLegajo;
    private double sueldo;

    public Empleado (String nombre, String apellido, String cargo, int edad, int numLegajo, double sueldo){
        super(nombre, apellido, cargo, edad);
        this.numLegajo=numLegajo;
        this.sueldo=sueldo;
    }
    public int getNumLegajo(){
        return numLegajo;
    }
    public double getSueldo(){
        return sueldo;
    }
    public String toString (){
        return super.toString()+
                " | Numero de legajo: "+numLegajo+
                " | Sueldo: "+sueldo;
    }

}
