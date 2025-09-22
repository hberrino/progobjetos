package EquipoFutbol;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Masajista m1 = new Masajista("Juan","Ferdinan", 41255325, LocalDate.of(1990, 5, 12),"Kinesiologo", 8);
        Entrenador e1 = new Entrenador("Matias", "Riño", 32545887, LocalDate.of(1982,7,10),12555662);
        Futbolista f1 = new Futbolista("Federico", "Mastantouno", 44021223, LocalDate.of(2004,12,5), "Delantero", "Zurdo",32);
        Futbolista f2 = new Futbolista("Benjamin", "Zarate", 42321553, LocalDate.of(2005,11,12), "Defensor", "Derecho",3);

        Seleccion Angola1 = new Seleccion("Angola");
        Angola1.agregarIntegrante(m1);
        Angola1.agregarIntegrante(e1);
        Angola1.agregarIntegrante(f1);
        Angola1.agregarIntegrante(f2);

        Angola1.mostrarIntegrantes();

        f1.setEstado("En pais de origen");
        if (f1.estaDisponible()){
            System.out.println(f1+" se encuentra disponible");
        }else System.out.println("Jugador no disponible");


    }
}
