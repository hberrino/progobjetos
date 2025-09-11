package Electrodomesticos;

public class Electrodomestico {

    private String nombre;
    private double precio_base;
    private String color;
    private double consumo;
    private double peso;

    public Electrodomestico (String nombre){
        this.nombre = nombre;
        this.precio_base = 100;
        this.consumo = 10;
        this.color = "gris plata";
        this.peso = 2;
    }
    public Electrodomestico (String nombre, double precio_base){
        this(nombre);
        this.precio_base=precio_base;
    }
    public Electrodomestico (String nombre, double precio_base, double consumo){
        this(nombre, precio_base);
        this.consumo=consumo;
    }
    public Electrodomestico (String nombre, double precio_base, double consumo, String color){
        this(nombre, precio_base, consumo);
        this.color=color;
    }
    public Electrodomestico (String nombre, double precio_base, double consumo, String color, double peso){
        this(nombre, precio_base, consumo, color);
        this.peso=peso;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return nombre;
    }
    public void setPrecio_base (double precio_base){
        this.precio_base=precio_base;
    }
    public double getPrecio_base (){
        return precio_base;
    }
    public void setPeso (double peso){
        this.peso = peso;
    }
    public double getPeso (){
        return peso;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor (){
        return color;
    }
    public void setConsumo (double consumo){
        this.consumo = consumo;
    }
    public double getConsumo (){
        return consumo;
    }
    public boolean esBajoConsumo (){
        return getConsumo()<45;
    }
    public double balance (){
        return getPrecio_base()/getPeso();
    }
    public boolean esAltaGama(){
        return balance()>3;
    }
}
