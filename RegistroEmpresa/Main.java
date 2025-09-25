package RegistroEmpresa;

public class Main {
    public static void main(String[] args) {
        Empresa TC = new Empresa("TechCorp");
        Empleado e1 = new Empleado("Juan", "Agust", "Empleado", 23, 1234, 2152334.03);
        Empleado e2 = new Empleado("Federico", "Mitico", "Empleado", 25, 1235, 2156656.23);
        ConsumidorFinal c1 = new ConsumidorFinal("Martin", "Rikis", "Consumidor", 32, "martin2020", "martinsitogamer2");
        Jerarquico Jefe = new Jerarquico("Eren", "Jager", "Jefe", 40, 5652, 7523269.50);
        TC.agregarAsociado(e1);
        TC.agregarAsociado(e2);
        TC.agregarAsociado(c1);
        TC.agregarAsociado(Jefe);
        Jefe.agregarEmpleado(e1);
        Jefe.agregarEmpleado(e2);


        System.out.println("Asociados Empresa: ");
        TC.mostrarAsociados();
    }
}
