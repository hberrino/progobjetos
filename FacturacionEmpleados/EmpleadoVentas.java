package FacturacionEmpleados;

public class EmpleadoVentas extends Empleado{

    private double extraVentas;
    private int ventasRealizadas;

    public EmpleadoVentas (String nombre, String apellido, String dni, double sueldo, double extraVentas, int ventasRealizadas){
        super(nombre, apellido, dni, sueldo);
        this.extraVentas=extraVentas;
        this.ventasRealizadas=ventasRealizadas;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }
    public double getExtraVentas() {
        return extraVentas;
    }
    public double calcularSueldoTotal() {
        return getSueldo() + (getSueldo() * (extraVentas / 100.0) * ventasRealizadas);
    }
    @Override
    public String toString() {
        return super.toString()+
                " | Sueldo total con ventas: "+(calcularSueldoTotal());
    }
}
