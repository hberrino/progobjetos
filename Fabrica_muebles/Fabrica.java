package Fabrica_muebles;

import java.util.ArrayList;

public class Fabrica {


    private String nombre;
    private ArrayList<Producto> productos;

    public Fabrica (String nombre){
        this.nombre=nombre;
        this.productos = new ArrayList<>();
    }
    public void agregarProducto (Producto p){
        productos.add(p);
    }
    public void verDisponibles() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
    public double precioFabricacion_Stock(){
        double precio=0;
        for (Producto p : productos){
            precio+=p.getCosto_fabricacion();
        }
        return precio;
    }
    public double precioVentas_Stock (){
        double precio=0;
        for (Producto p : productos){
            precio+=p.getValor_venta();
        }
        return precio;
    }

}
