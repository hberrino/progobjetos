package PagoEmpresa;

public class Empleado {
    private double pagofijo;
    private int horasTrabajo;

    public Empleado (double pagofijo, int horasTrabajo){
        this.pagofijo=pagofijo;
        this.horasTrabajo=horasTrabajo;
    }

    public double getPagofijo() {
        return pagofijo;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public double getPagoEmpleado (){
        return pagofijo*horasTrabajo;
    }
}
