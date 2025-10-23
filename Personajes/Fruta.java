package Personajes;

public abstract class Fruta {

    protected Personaje personaje;

    public Fruta (Personaje personaje){
        this.personaje=personaje;
    }
    public abstract double buffFuerza ();
}
