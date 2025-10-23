package Personajes;

public abstract class UniversoOnePiece {
    protected String nombre;

    public UniversoOnePiece(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double getFuerza();
    public abstract double getPeso();
    public abstract int getEdad();
}