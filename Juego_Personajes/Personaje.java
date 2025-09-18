package Juego_Personajes;

public class Personaje {

    private String nombre;
    private boolean vision_nocturna;
    private double velocidad;
    private double fuerza;
    private double peso;
    private double altura;
    private int edad;

    public Personaje (String nombre, boolean vision_nocturna, double velocidad, double fuerza, double peso, double altura, int edad){
        this.nombre=nombre;
        this.vision_nocturna=vision_nocturna;
        this.velocidad=velocidad;
        this.fuerza=fuerza;
        this.peso=peso;
        this.altura=altura;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getFuerza() {
        return fuerza;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }
    public boolean isVision_nocturna() {
        return vision_nocturna;
    }
    public String toString (){
        return  " Nombre: "+nombre+
                " | Vision nocturna: "+(vision_nocturna? "Si" : "No")+
                " | Velocidad: "+velocidad+
                " | Fuerza: "+fuerza+
                " | Peso: "+peso+
                " | Altura: "+altura+
                " | Edad: "+edad;
    }
}
