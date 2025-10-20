package PruebaObjetosFull2;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Impresion> impresiones;

    public Empresa(String nombre){
        this.nombre=nombre;
        this.impresiones=new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Impresion> getImpresiones() {
        return impresiones;
    }

}
