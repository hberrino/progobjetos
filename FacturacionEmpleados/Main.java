package FacturacionEmpleados;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Abbibas");
        Empleado e1 = new Empleado("Franco", "Cindor", "43256895", 1200000);
        Empleado e2 = new Empleado("Estefi", "Negrochea", "45698523", 800000);
        Empleado e3 = new EmpleadoVentas("Federico", "Naik", "43256895", 1500000, 10.0, 8);
        Empleado e4 = new EmpleadoVentas("Agustin", "Equis", "43432595", 1325000, 5.0, 8);

        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);
        empresa.agregarEmpleado(e4);

        empresa.mostrarEmpleados();


    }

}
