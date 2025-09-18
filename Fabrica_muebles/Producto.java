package Fabrica_muebles;

public class Producto {

    private String tipo;
    private double peso;
    private double costo_fabricacion;
    private String madera;
    private String color;
    private double porcentaje_ganancia = 35;

    public Producto (String tipo, double peso, double costo_fabricacion, String madera, String color){
        this.tipo=tipo;
        this.peso=peso;
        this.costo_fabricacion=costo_fabricacion;
        this.madera=madera;
        this.color=color;
    }

    public double getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor_venta() {
        return costo_fabricacion * (1 + porcentaje_ganancia / 100);
    }
    public void setPorcentaje_ganancia(double porcentaje_ganancia){
        this.porcentaje_ganancia=porcentaje_ganancia;
    }
    public double getCosto_fabricacion() {
        return costo_fabricacion;
    }

    public String getMadera() {
        return madera;
    }

    public String getColor() {
        return color;
    }
    public String toString() {
        return "Producto: " + tipo +
                ", Peso: " + peso +
                ", Costo fabricación: $" + costo_fabricacion +
                ", Precio venta: $" + getValor_venta() +
                ", Madera: " + madera +
                ", Color: " + color;
    }
}
