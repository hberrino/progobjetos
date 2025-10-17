package Parcial2024;

import java.util.ArrayList;

public class Vendedor extends Miembro {

    private String apellido;
    private int edad;
    private ArrayList<Venta> ventas;

    public Vendedor (String nombre, String apellido, int edad){
        super(nombre);
        this.apellido=apellido;
        this.edad=edad;
        this.ventas = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public void agregarVenta (Venta v){
        ventas.add(v);
    }
    public double gananciaPorProducto (){
        double total=0;
        for (Venta v : ventas){
            total+=v.gananciaPorVenta();
        }
        return total;
    }
    public int cantidadTotalVentas (){
        return ventas.size();
    }
    public int cantidadTotalProductosVendidos(){
        int total=0;
        for (Venta v : ventas){
            total+=v.getCantVendidos();
        }
        return total;
    }

}
