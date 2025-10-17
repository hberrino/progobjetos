package SistemaDeAlquiler;

public class Pelicula extends AlquilerItem {

    private String nombre;
    private String info;
    private int copias;

    public Pelicula (String nombre, String info, int copias){
        this.nombre=nombre;
        this.info=info;
        this.copias=copias;
    }
    public boolean alquilerDisponible (){
        return this.copias>0;
    }
    public void alquilar() {
        if (alquilerDisponible()) {
            this.copias--;  // usamos el atributo del objeto
        }
    }
    public int getCopias() {
        return this.copias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInfo() {
        return info;
    }
}
