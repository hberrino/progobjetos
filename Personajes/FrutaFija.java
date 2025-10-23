package Personajes;

public class FrutaFija extends Fruta {
    private double valorFijo;

    public FrutaFija(Personaje personaje, double valorFijo) {
        super(personaje);
        this.valorFijo = valorFijo;
    }

    @Override
    public double buffFuerza() {
        return valorFijo;
    }
}