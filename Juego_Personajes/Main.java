package Juego_Personajes;

public class Main {
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Mistico", true, 500,200,75.6,1.70,32);
        Personaje p2 = new Personaje("Fugaz", false, 1200,10,42,1.56,18);
        Personaje p3 = new Personaje("Destructor", true, 450,700,92,1.92,55);

        Juego j1 = new Juego("Hero Combat 3");

        j1.agregarPersonaje(p1);
        j1.agregarPersonaje(p2);
        j1.agregarPersonaje(p3);

        //metodo ver estadisticas

        j1.mostrarEstadisticas();

        Personaje ganador = j1.versus(p2, p3);
        if (ganador != null) {
            System.out.println("El ganador es: " + ganador.getNombre());
        } else {
            System.out.println("Empate total entre " + p1.getNombre() + " y " + p2.getNombre());
        }





    }
}
