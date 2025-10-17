package PuertoCereal;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        // Creo camiones con distintas fechas
        Camion c1 = new Camion(LocalDate.of(2025, 10, 1));
        Camion c2 = new Camion(LocalDate.of(2025, 9, 28));
        Camion c3 = new Camion(LocalDate.of(2025, 10, 3));

        // Creo barcos con distintas capacidades
        Barco b1 = new Barco(500);
        Barco b2 = new Barco(800);
        Barco b3 = new Barco(600);

        // Agrego al puerto
        puerto.agregarCamion(c1);
        puerto.agregarCamion(c2);
        puerto.agregarCamion(c3);

        puerto.agregarBarco(b1);
        puerto.agregarBarco(b2);
        puerto.agregarBarco(b3);

        // Busco prioridades
        Camion camionPrioritario = puerto.asignarPrioridadCamion();
        Barco barcoPrioritario = puerto.asignarPrioridadBarco();

        puerto.cargar();
    }
}