package Personajes;

public class FrutaFijaPesox7 extends Fruta{

    private double valorFijo;

    public FrutaFijaPesox7 (Personaje personaje, double valorFijo){
        super(personaje);
        this.valorFijo=valorFijo;
    }

    public double buffFuerza (){
        return valorFijo+(personaje.getPeso()*7);
    }
}
