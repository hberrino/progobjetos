package Parcial2024;

import java.util.ArrayList;

public class Equipo extends Miembro{

    private ArrayList<Miembro> miembros;

    public Equipo (String nombre){
        super(nombre);
        this.miembros=new ArrayList<>();
    }

    public ArrayList<Miembro> getMiembro() {
        return miembros;
    }
    public void agregarMiembro (Miembro m){
        miembros.add(m);
    }
    @Override
    public double gananciaPorProducto() {
        double suma=0;
        for (Miembro m : miembros){
            suma+=m.gananciaPorProducto();
        }
        return suma;
    }
    public int cantidadTotalVentas (){
        int total=0;
        for (Miembro m : miembros){
            total+= m.cantidadTotalVentas();
        }
        return total;
    }
    public int cantidadTotalProductosVendidos() {
        int total = 0;
        for (Miembro m : miembros) {
            total += m.cantidadTotalProductosVendidos();
        }
        return total;
    }
}
