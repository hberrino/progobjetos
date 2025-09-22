package PagoEmpresa;

public class Main {
    public static void main(String[] args) {
        Empresa google = new Empresa();
        Empleado e1 = new Empleado(6500, 8);
        Empleado e2 = new Empleado(7200.50, 9);
        EmpleadoExtra e3 = new EmpleadoExtra(8251.12, 8,2,11.520);
        EmpleadoComision e4 = new EmpleadoComision(4261.21, 5, 0.10,70250);

        google.agregarEmpleado(e1);
        google.agregarEmpleado(e2);
        google.agregarEmpleado(e3);
        google.agregarEmpleado(e4);

        google.emitirPagos();


    }
}
