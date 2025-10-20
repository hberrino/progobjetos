package PruebaObjetosFull2;

public abstract class Pieza {
    private String nombre;
    private String descripcion;
    private int PLAbase;
    private int tiempoDePieza;

    public Pieza (String nombre, String descripcion, int PLAbase, int tiempoDePieza){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.PLAbase=PLAbase;
        this.tiempoDePieza=tiempoDePieza;
    }
    public int getTiempoDePieza() {
        return tiempoDePieza;
    }
    public int getPLAbase() {
        return PLAbase;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public abstract int PLAnecesario();
    public abstract int tiempoEstimado();
    public abstract int cantPiezasSimples();

}
