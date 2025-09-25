package Pila;

public class Objeto {
    private static int contador;
    private int numero;

    public Objeto (){
        this.numero=++contador;
    }

    public int getNumero() {
        return numero;
    }
}
