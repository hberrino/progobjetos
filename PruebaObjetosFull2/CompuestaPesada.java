package PruebaObjetosFull2;

public class CompuestaPesada extends PiezaCompuesta{

    public CompuestaPesada(String nombre, String descripcion, int PLAbase, int tiempoDePieza){
        super(nombre, descripcion, PLAbase, tiempoDePieza);
    }
    public int PLAnecesario(){
        int suma=0;
        for (Pieza p : piezas){
            suma+=p.PLAnecesario();
            if(p instanceof PiezaSimple){
                suma+=12;
            }
        }
        return suma;
    }
}
