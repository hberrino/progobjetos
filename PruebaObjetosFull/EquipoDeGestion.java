package PruebaObjetosFull;

import java.util.ArrayList;

public class EquipoDeGestion extends Equipo{

    private ArrayList<Vendedor> vendedores;
    private ArrayList<Equipo> equipos;

    public EquipoDeGestion (String nombre){
        super(nombre);
        this.vendedores=new ArrayList<>();
        this.equipos=new ArrayList<>();
    }
    public void agregarVendedor(Vendedor v) {
        vendedores.add(v);
    }

    public void agregarEquipo(Equipo e) {
        equipos.add(e);
    }
}
