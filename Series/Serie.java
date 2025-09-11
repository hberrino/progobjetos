package Series;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie (String titulo, String descripcion, String creador, String genero){
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.creador=creador;
        this.genero=genero;
        this.temporadas = new ArrayList<>();
    }


    public void agregarTemporada (Temporada temporada){
        temporadas.add(temporada);
    }
    public String getTitulo () {
        return titulo;
    }
    public String getDescripcion (){
        return descripcion;
    }

    public String getCreador (){
        return creador;
    }
    public String getGenero (){
        return genero;
    }

}
