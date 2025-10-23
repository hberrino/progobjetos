package Personajes;

public class Servicio {

    public Servicio (){};

    public static String nombrePersonaje (UniversoOnePiece miembro){
        return miembro.getNombre();
    }
    public static double pesoPersonaje (UniversoOnePiece miembro){
        return miembro.getPeso();
    }
    public static int cantidadPersonajes(UniversoOnePiece miembro) {
        if (miembro instanceof Personaje) {
            return 1;
        } else if (miembro instanceof Barco) {
            Barco b = (Barco) miembro;
            int suma = 0;
            for (UniversoOnePiece m : b.getMiembros()) {
                suma += cantidadPersonajes(m); // 👈 recursivo
            }
            return suma;
        }
        return 0;
    }
    public static int edadPersonaje (UniversoOnePiece miembro){
        return miembro.getEdad();
    }

}
