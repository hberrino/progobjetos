package Personajes;

public class Personaje extends UniversoOnePiece {
    private int edad;
    private double peso;
    private double fuerzaBase = 125;
    private Fruta fruta;
    private boolean buffFruta=false;

    public Personaje(String nombre, int edad, double peso) {
        super(nombre);
        this.edad = edad;
        this.peso = peso;
    }

    public void comerFruta(Fruta fruta) {
        this.fruta = fruta;
        buffFruta=true;
    }

    @Override
    public double getFuerza() {
        if (buffFruta) {
            return fruta.buffFuerza();
        }
        return fuerzaBase;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public int getEdad() {
        return edad;
    }
}
