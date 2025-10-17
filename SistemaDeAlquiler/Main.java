package SistemaDeAlquiler;

public class Main {
    public static void main(String[] args) {
        // Crear sistema
        Sistema sistema = new Sistema();

        // Crear ítems
        Pelicula peli1 = new Pelicula("Matrix", "Sci-Fi 1999", 3);
        Auto auto1 = new Auto("Toyota", 50000, "ABC123", "Nafta");

        // Agregar ítems al sistema
        sistema.agregarItem(peli1);
        sistema.agregarItem(auto1);

        // Crear clientes
        Cliente cliente1 = new Cliente("Hernan", "12345678");
        Cliente cliente2 = new Cliente("Lucia", "87654321");

        // Registrar alquileres
        sistema.registrarAlquiler(cliente1, peli1, "2025-10-10");
        sistema.registrarAlquiler(cliente2, auto1, "2025-10-05");

        // Probar disponibilidad después de alquilar
        System.out.println("Matrix disponible: " + peli1.alquilerDisponible()); // true (quedan copias)
        System.out.println("Toyota disponible: " + auto1.alquilerDisponible()); // false (ya alquilado)
    }
}
