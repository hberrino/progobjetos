package PruebaObjetosFull2;

import java.util.ArrayList;

public class PiezaCompuesta extends Pieza{

    protected ArrayList<Pieza> piezas;

    public PiezaCompuesta (String nombre, String descripcion, int PLAbase, int tiempoDePieza){
        super(nombre, descripcion, PLAbase, tiempoDePieza);
        this.piezas=new ArrayList<>();
    }
    public ArrayList<Pieza> getPiezas (){
        return piezas;
    }
    public int PLAnecesario(){
        int suma=0;
        for (Pieza p : piezas){
            suma+=p.PLAnecesario();
            if(p instanceof PiezaSimple){
                suma++;
            }
        }
        return suma;
    }
    public int tiempoEstimado(){
        int tiempototal=0;
        for (Pieza p : piezas){
            tiempototal+=p.tiempoEstimado();
        }
        return tiempototal+45;
    }
    private ArrayList<String> coloresDePiezas (){
        ArrayList<String> colores = new ArrayList<>();
        for(Pieza p : piezas){
            if(p instanceof PiezaSimple){
                PiezaSimple v = (PiezaSimple) p;
                if(!colores.contains(v.getColor())){
                    colores.add(v.getColor());
                }else if (p instanceof PiezaCompuesta) {
                    for (String c : ((PiezaCompuesta)p).coloresDePiezas()) {
                        if (!colores.contains(c)) {
                            colores.add(c);
                        }
                    }
                }
            }
        }
        return colores;
    }

    @Override
    public int cantPiezasSimples() {
        int pieza = 0;
        for (Pieza p : piezas) {
            if (p instanceof PiezaSimple) {
                pieza++;
            }else if (p instanceof PiezaCompuesta){
                pieza+=p.cantPiezasSimples();
            }
        }
        return pieza;
    }
}
