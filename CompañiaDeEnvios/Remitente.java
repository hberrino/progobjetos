package CompañiaDeEnvios;

public class Remitente {
    private String nombre;
    private String direccion;

    public Remitente (String nombre,String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
    }
    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }
}
