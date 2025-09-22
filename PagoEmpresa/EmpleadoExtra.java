package PagoEmpresa;

public class EmpleadoExtra extends Empleado{
    private int horasExtras;
    private double valorHoraExtra;

    public EmpleadoExtra (double pagofijo, int horasTrabajo, int horasExtras, double valorHoraExtra){
        super(pagofijo, horasTrabajo);
        this.horasExtras=horasExtras;
        this.valorHoraExtra=valorHoraExtra;
    }
    public double getPagoEmpleado(){
        return super.getPagoEmpleado() + horasExtras*valorHoraExtra;
    }





}
