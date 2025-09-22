package PagoEmpresa;

public class EmpleadoComision extends Empleado{
    private double porcentajeComision;
    private double dineroVentasRealizadas;

    public EmpleadoComision (double pagofijo, int horastrabajo, double porcentajeComision, double dineroVentasRealizadas){
        super(pagofijo, horastrabajo);
        this.porcentajeComision=porcentajeComision;
        this.dineroVentasRealizadas=dineroVentasRealizadas;
    }

    @Override
    public double getPagoEmpleado() {
        return super.getPagoEmpleado()+dineroVentasRealizadas*porcentajeComision;
    }
}
