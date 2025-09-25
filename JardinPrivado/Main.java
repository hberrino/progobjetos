package JardinPrivado;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Planta p1 = new Planta("Rosa rubiginosa", "Rosa", "España", LocalDate.of(2023, 5, 12));
        Planta p2 = new Planta("Cactus echinopsis", "Cactus", "México", LocalDate.of(2024, 3, 8));
        Planta p3 = new Planta("Tulipa gesneriana", "Tulipán", "Holanda", LocalDate.of(2022, 9, 30));
        Planta p4 = new Planta("Lilium candidum", "Lirio", "Grecia", LocalDate.of(2025, 1, 15));

        Jardin j1 = new Jardin();

        j1.agregarPlanta(p1);
        j1.agregarPlanta(p2);
        j1.agregarPlanta(p3);
        j1.agregarPlanta(p4);

        j1.mostrarPlantas();
    }
}
