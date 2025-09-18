package Encuestas;

import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String dni;
    private ArrayList<Encuesta> encuestasRealizadas; // opcional, para saber cuántas hizo

    public Empleado (){
        this.nombre=nombre;
        this.dni=dni;
        encuestasRealizadas = new ArrayList<>();
    }
}
