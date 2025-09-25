package RegistroEmpresa;

import java.util.ArrayList;

public class Jerarquico extends Asociado {

    private int numLegajo;
    private double sueldo;
    private ArrayList<Empleado> empleados;

    public Jerarquico (String nombre, String apellido, String cargo, int edad, int numLegajo, double sueldo){
        super(nombre, apellido, cargo, edad);
        this.numLegajo=numLegajo;
        this.sueldo=sueldo;
        this.empleados=new ArrayList<>();
    }
    public void agregarEmpleado (Empleado e){
        empleados.add(e);
    }
    public ArrayList<Empleado> getEmpleados (){
        return empleados;
    }
    public void mostrarEmpleados (){
        for (Empleado e : empleados){
            System.out.println(e);
        }
    }
    public String toString(){
        return super.toString()+
                " | Numero de legajo: "+numLegajo+
                " | Sueldo: "+sueldo+
                " Empleados: "+empleados;
    }
}
