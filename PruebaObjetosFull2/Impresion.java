package PruebaObjetosFull2;

import java.util.ArrayList;

public class Impresion {

    private ArrayList<Pieza> piezas;
    private String nombre;
    private String descripcion;
    private String color;
    private int tiempoEstimadoProduccion;

    public Impresion (String nombre, String descripcion, String color, int tiempoEstimadoProduccion){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.color=color;
        this.tiempoEstimadoProduccion=tiempoEstimadoProduccion;
        this.piezas=new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public int getTiempoEstimadoProduccion() {
        return tiempoEstimadoProduccion;
    }
}
