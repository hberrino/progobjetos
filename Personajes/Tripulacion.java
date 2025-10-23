package Personajes;

public class Tripulacion extends Barco {

    private String tipoPj; // "pirata" o "militar"

    public Tripulacion(String nombre, String tipoPj) {
        super(nombre);
        this.tipoPj = tipoPj;
    }
    public String getTipoPj() {
        return tipoPj;
    }
}