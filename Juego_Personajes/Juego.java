package Juego_Personajes;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Personaje> personajes;
    private String nombre;

    public Juego (String nombre){
        this.personajes = new ArrayList<>();
        this.nombre=nombre;
    }
    public void agregarPersonaje(Personaje p){
        personajes.add(p);
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }
    public void mostrarEstadisticas (){
        for (Personaje p : personajes){
            System.out.println(p);
        }
    }
    // metodo versus
    public Personaje versus(Personaje a, Personaje b) {
        // Mostrar quién se enfrenta
        System.out.println(a.getNombre() + " vs " + b.getNombre());

        // Inicializar contadores
        int contadorA = 0;
        int contadorB = 0;

        // Comparar fuerza
        if (a.getFuerza() > b.getFuerza()) contadorA++;
        else if (b.getFuerza() > a.getFuerza()) contadorB++;

        // Comparar velocidad
        if (a.getVelocidad() > b.getVelocidad()) contadorA++;
        else if (b.getVelocidad() > a.getVelocidad()) contadorB++;

        // Comparar visión nocturna (si uno tiene y el otro no)
        if (a.isVision_nocturna() && !b.isVision_nocturna()) contadorA++;
        else if (!a.isVision_nocturna() && b.isVision_nocturna()) contadorB++;

        // Decidir ganador
        if (contadorA > contadorB) return a;
        else if (contadorB > contadorA) return b;
        else return null; // empate total
    }

}

