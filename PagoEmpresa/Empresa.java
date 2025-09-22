package PagoEmpresa;

import java.util.ArrayList;

public class Empresa {

    private double emitirPagos;
    private ArrayList<Empleado> empleados;

    public Empresa (){
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
    public void emitirPagos() {
        for (Empleado e : empleados) {
            double pago = e.getPagoEmpleado();
            System.out.println("Pago a empleado: " + pago);
        }
    }



}
