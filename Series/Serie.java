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
    public String getTitulo() {
        return titulo;
    }
    public String getCreador() {
        return creador;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getGenero() {
        return genero;
    }
    public void agregarTemporada (Temporada t){
        temporadas.add(t);
    }
    public int getVistosSerie (){
        int suma = 0;
        for (Temporada season : temporadas){
            suma+=season.getCantidadVistos();
        }
        return suma;
    }
    public boolean seVioTodaSerie() {
        for (Temporada season : temporadas) {
            if (season.getCantidadVistos() < season.getCantidadCapitulos()) {
                return false;
            }
        }
        return true;
    }
}
