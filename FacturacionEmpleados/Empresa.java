package FacturacionEmpleados;


import java.util.ArrayList;

public class Empresa {

    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    public Empresa (String nombreEmpresa){
        this.nombreEmpresa=nombreEmpresa;
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado (Empleado e){
        empleados.add(e);
    }
    public void mostrarEmpleados (){
        for (Empleado e : empleados){
            System.out.println(e);
        }
    }
}
