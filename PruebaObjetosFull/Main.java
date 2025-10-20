package PruebaObjetosFull;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crear empresa
        Empresa empresa = new Empresa();

        // Crear vendedores
        Vendedor v1 = new Vendedor("Juan", "Perez", 30);
        VendedorNovato v2 = new VendedorNovato("Lucas", "Lopez", 22);
        VendedorMentiroso v3 = new VendedorMentiroso("Maria", "Diaz", 28);
        VendedorTramposo v4 = new VendedorTramposo("Sofia", "Gomez", 25);

        // Crear ventas
        Venta venta1 = new Venta(LocalDate.of(2024, 3, 15), "P001", "30111222", 50000, 3);
        Venta venta2 = new Venta(LocalDate.of(2024, 3, 20), "P002", "30222333", 20000, 2);
        Venta venta3 = new Venta(LocalDate.of(2024, 4, 2), "P001", "30333444", 70000, 1);
        Venta venta4 = new Venta(LocalDate.of(2024, 5, 5), "P003", "30444555", 30000, 4);

        // Asignar ventas a vendedores
        v1.agregarVenta(venta1);
        v2.agregarVenta(venta2);
        v3.agregarVenta(venta3);
        v4.agregarVenta(venta4);

        // Crear equipos
        Equipo equipoA = new Equipo("Equipo A");
        EquipoPeterPan equipoB = new EquipoPeterPan("Equipo B");
        EquipoDeGestion equipoC = new EquipoDeGestion("Equipo Gestión");

        // Agregar miembros a equipos
        equipoA.agregarMiembro(v1);
        equipoA.agregarMiembro(v2);

        equipoB.agregarMiembro(v3);
        equipoB.agregarMiembro(v4);

        equipoC.agregarVendedor(v1);
        equipoC.agregarVendedor(v2);
        equipoC.agregarEquipo(equipoA);
        equipoC.agregarEquipo(equipoB);

        // Agregar equipos y vendedores a la empresa

        empresa.agregarMiembro(v1);
        empresa.agregarMiembro(v2);
        empresa.agregarMiembro(v3);
        empresa.agregarMiembro(v4);
        empresa.agregarMiembro(equipoA);
        empresa.agregarMiembro(equipoB);
        empresa.agregarMiembro(equipoC);

        // Pruebas de ranking
        Ranking ranking = new Ranking(empresa);
        ArrayList<Miembro> rankingEdad = ranking.rankingPorEdad();
        System.out.println("=== Ranking por edad ===");
        for (Miembro m : rankingEdad) {
            System.out.println(m.getNombre() + " → " + m.edadRank());
        }

        // Pruebas de búsqueda
        Busqueda busqueda = new Busqueda(empresa);
        System.out.println("\n=== Vendedores con ganancias menores a 550.000 ===");
        for (Miembro m : busqueda.vendedoresBajaGanancia(550000)) {
            System.out.println(m.getNombre());
        }

        System.out.println("\n=== Ventas entre 10/03/2024 y 03/04/2024 ===");
        for (Miembro m : busqueda.porFecha(LocalDate.of(2024,3,10), LocalDate.of(2024,4,3))) {
            System.out.println(m.getNombre());
        }

        System.out.println("\n=== Venta por código P001 y ganancia < 600.000 ===");
        for (Miembro m : busqueda.ventaPorCodigoP_BajaGanancia("P001", 600000)) {
            System.out.println(m.getNombre());
        }

        // Prueba de equipo Peter Pan
        System.out.println("\n=== Edad más joven del Equipo Peter Pan ===");
        System.out.println(equipoB.edadRank());
    }
}
