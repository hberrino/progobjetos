package CentroComputos;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Agregar computadoras
        sistema.agregarComputadora(new Computador(3.2)); // velocidad GHz
        sistema.agregarComputadora(new Computador(2.8));
        sistema.agregarComputadora(new Computador(4.0));

        // Agregar procesos
        sistema.agregarProceso(new Proceso(8, 1));  // memoria GB, id proceso
        sistema.agregarProceso(new Proceso(4, 2));
        sistema.agregarProceso(new Proceso(16, 3));

        // Ejecutar asignación
        sistema.ejecutar();
    }
}