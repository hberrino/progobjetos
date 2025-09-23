package EmpresaAvicola;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Avicola Avicola1 = new Avicola("Juansin Avicola");
        CongeladoNitrogeno p1 = new CongeladoNitrogeno("Patitas de pollo", "Congelado por Nitrogeno", LocalDate.of(2026,12,5),56441, LocalDate.of(2025,9,23),"NASHE", 56921514, 20, "Nitrogeno", 250);
        CongeladoAire p2 = new CongeladoAire("Burguesa", "Congelado por Aire",LocalDate.of(2026,4,1),46491, LocalDate.of(2022,2,25),"NASHE", 55551514, 14, "10% nitrogeno, 10% oxigeno, 15% dioxido de carbono, 85% vapor de agua");
        CongeladoAgua p3 = new CongeladoAgua("Chimichanga", "Congelado por Agua",LocalDate.of(2024,11,15),33341, LocalDate.of(2017,1,4),"NASHE", 98956514, 10, 20, 12);
        Fresco p5 = new Fresco("Huevos de gallina", "Fresco", LocalDate.of(2025, 3, 15), 11223, LocalDate.of(2025, 3, 1), "Granja Don Pepe");
        Refrigerado p4 = new Refrigerado("Milanesa de pollo", "Refrigerado", LocalDate.of(2025, 6, 30), 44556, LocalDate.of(2025, 6, 1), "Granja Don Pepe", 99988877, 4);

        Avicola1.agregarProducto(p1);
        Avicola1.agregarProducto(p2);
        Avicola1.agregarProducto(p3);
        Avicola1.agregarProducto(p4);
        Avicola1.agregarProducto(p5);

        Avicola1.mostrarProducto();
    }
}
