package Series;

public class Episodeo {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodeo (String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;
        this.calificacion=-1;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo (){
        return titulo;
    }
    public void setDescripcion (String descripcion){
        this.descripcion=descripcion;
    }
    public String getDescripcion (){
        return descripcion;
    }
    public void setCalificacion (int calificacion){
        if(calificacion<=5 && calificacion>=0){
            this.calificacion=calificacion;
            visto=true;
        }else System.out.println("calificacion invalida");
    }
    public int getCalificacion (){
        return calificacion;
    }
    public boolean isVisto (){
        return visto;
    }
}
