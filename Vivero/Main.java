package Vivero;

import java.util.ArrayList;
    public class Main {
    public static void main(String[] args) {

        // 🪴 1. Crear la ficha general del vivero
        Ficha ficha = new Ficha();

        // 🪴 2. Crear algunas plantas
        Planta p1 = new Planta("Sansevieria trifasciata", "Angiospermas", "Asparagaceae", "Liliopsida", "Interior");
        p1.agregarNombreVulgar(new NombreVulgar("Lengua de suegra"));
        p1.agregarNombreVulgar(new NombreVulgar("Espada de San Jorge"));
        p1.setSolRequired(3);
        p1.setRiegoRequired(2);

        Planta p2 = new Planta("Monstera deliciosa", "Angiospermas", "Araceae", "Liliopsida", "Interior");
        p2.agregarNombreVulgar(new NombreVulgar("Costilla de Adán"));
        p2.setSolRequired(5);
        p2.setRiegoRequired(6);

        Planta p3 = new Planta("Lavandula angustifolia", "Angiospermas", "Lamiaceae", "Magnoliopsida", "Exterior");
        p3.agregarNombreVulgar(new NombreVulgar("Lavanda"));
        p3.setSolRequired(8);
        p3.setRiegoRequired(4);

        Planta p4 = new Planta("Cactus echinopsis", "Cactaceae", "Cactaceae", "Magnoliopsida", "Exterior");
        p4.agregarNombreVulgar(new NombreVulgar("Cactus bola"));
        p4.setSolRequired(9);
        p4.setRiegoRequired(1);

        // 🪴 3. Agregar las plantas a la ficha
        ficha.agregarPlantas(p1);
        ficha.agregarPlantas(p2);
        ficha.agregarPlantas(p3);
        ficha.agregarPlantas(p4);

        // 🌿 4. Test de los métodos de búsqueda
        System.out.println("===== BUSQUEDAS =====");

        System.out.println("\n➡️ Plantas cuyo nombre científico contiene 'Lavandula':");
        mostrar(Busqueda.busquedaPorNombreCientifico(ficha, "Lavandula"));

        System.out.println("\n➡️ Plantas conocidas vulgarmente como 'suegra':");
        mostrar(Busqueda.busquedaPorNombreVulgar(ficha, "suegra"));

        System.out.println("\n➡️ Plantas con clasificación superior que incluye 'Cactaceae':");
        mostrar(Busqueda.busquedaPorClasificacion(ficha, "Cactaceae"));

        System.out.println("\n➡️ Plantas con riego > 3 y sol < 6:");
        mostrar(Busqueda.busquedaPorRiegoMayorYSolMenor(ficha, 6, 3));

        System.out.println("\n➡️ Plantas con riego < 4 y sol > 6:");
        mostrar(Busqueda.busquedaPorRiegoMenorYSolMayor(ficha, 6, 4));

        System.out.println("\n➡️ Plantas de poco riego (menor a 3):");
        mostrar(Busqueda.busquedaPorPlantaPocoRiego(ficha));

        System.out.println("\n➡️ Plantas de poco sol (menor a 3):");
        mostrar(Busqueda.busquedaPorPlantaPocoSol(ficha));

        System.out.println("\n===== FIN DEL TEST =====");
    }

    // 🌱 Método auxiliar para imprimir los resultados de manera limpia
    public static void mostrar(ArrayList<Planta> lista) {
        if (lista.isEmpty()) {
            System.out.println("   (No se encontraron resultados)");
        } else {
            for (Planta p : lista) {
                System.out.println("   - " + p);
            }
        }
    }
}
