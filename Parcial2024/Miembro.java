package Parcial2024;

public abstract class Miembro {
    private String nombre;

    public Miembro (String nombre){
        this.nombre=nombre;
    }
    public String getNombre (){
        return nombre;
    }
    public abstract double gananciaPorProducto();
    public abstract int cantidadTotalVentas();
    public abstract int cantidadTotalProductosVendidos();

}
