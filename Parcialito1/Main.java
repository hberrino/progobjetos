package Parcialito1;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Plataforma p1 = new Plataforma();

        // Creo algunos objetos de prueba
        Usuario juan1 = new Usuario("juan", LocalDate.of(2000,12,25));
        Cancion c1 = new Cancion("Deep", "August", LocalDate.of(2022,12,22));
        Cancion c2 = new Cancion("Love Song", "Maria", LocalDate.of(2023,5,10));
        Cancion c3 = new Cancion("Dance Pop", "August", LocalDate.of(2021,7,3));

        Genero g1 = new Genero("pop");
        Genero g2 = new Genero("rock");

        // Agrego géneros a canciones
        c1.agregarGenero(g1); // Deep es pop
        c2.agregarGenero(g2); // Love Song es rock
        c3.agregarGenero(g1); // Dance Pop es pop

        // Cargo en la plataforma
        p1.agregarCancion(c1);
        p1.agregarCancion(c2);
        p1.agregarCancion(c3);
        p1.agregarGenero(g1);
        p1.agregarGenero(g2);
        p1.agregarUsuario(juan1);

        // Creo buscador
        Busqueda buscador = new Busqueda(p1);

        //busqueda
        System.out.println(buscador.cancionPorInterprete("August"));
        System.out.println("posterior");
        System.out.println(buscador.cancionFechaPosteriorA(LocalDate.of(2020,5,26)));

    }
}
