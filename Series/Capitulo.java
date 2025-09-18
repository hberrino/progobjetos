package Series;

public class Capitulo {
    private String nombre;
    private String descripcion;
    private boolean seVio=false;
    private int calificacion=-1;

    public Capitulo (String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion (int calificacion){
        if(calificacion<=5 && calificacion>=0){
            this.calificacion=calificacion;
            seVio=true;
        }else System.out.println("calificacion invalida");
    }
    public boolean isSeVio() {
        return seVio;
    }
}
