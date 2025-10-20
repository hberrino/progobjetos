package PruebaObjetosFull2;

import java.util.ArrayList;

public class CompuestaRapida extends PiezaCompuesta{

    public CompuestaRapida(String nombre, String descripcion, int PLAbase, int tiempoDePieza){
        super(nombre, descripcion, PLAbase, tiempoDePieza);
    }
    public int tiempoEstimado (){
        int tiempo=0;
        for (Pieza p : piezas){
            tiempo+=p.tiempoEstimado();
        }
        return tiempo+5;
    }
}
