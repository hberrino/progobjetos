package PruebaObjetosFull2;

public class PiezaSimple extends Pieza {

    private String color;

    public PiezaSimple (String nombre, String descripcion,int PLAbase, int tiempoDePieza, String color){
        super(nombre,descripcion, PLAbase, tiempoDePieza);
        this.color=color;
    }
    public String getColor() {
        return color;
    }
    public int PLAnecesario(){
        return getPLAbase();
    }
    public int tiempoEstimado (){
        return getTiempoDePieza();
    }
    public int cantPiezasSimples() {
        return 1;
    }

}
