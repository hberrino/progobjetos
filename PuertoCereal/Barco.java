package PuertoCereal;

public class Barco extends PrioridadTransporte {
    private int capacidad;

    public Barco (int capacidad){
        this.capacidad=capacidad;
    }
    public Comparable getPrioridad (){
        return capacidad;
    }
}
