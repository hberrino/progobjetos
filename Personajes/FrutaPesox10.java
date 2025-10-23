package Personajes;

public class FrutaPesox10 extends Fruta {

    public FrutaPesox10 (Personaje personaje){
        super(personaje);
    }
    public double buffFuerza (){
        return personaje.getPeso()*10;
    }
}
