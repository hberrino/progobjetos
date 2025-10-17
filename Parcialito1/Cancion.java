package Parcialito1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cancion {

    private String titulo;
    private String interprete;
    private LocalDate fechaLanzamiento;
    private ArrayList<Genero> generos;

    public Cancion (String titulo, String interprete, LocalDate fechaLanzamiento){
        this.titulo=titulo;
        this.fechaLanzamiento=fechaLanzamiento;
        this.interprete=interprete;
        this.generos = new ArrayList<>();
    }
    public void agregarGenero (Genero g){
        generos.add(g);
    }
    public String getTitulo (){
        return titulo;
    }
    public String getInterprete() {
        return interprete;
    }
    public LocalDate getFechaLanzamiento (){
        return fechaLanzamiento;
    }
    public ArrayList<Genero> getGeneros (){
        return generos;
    }

    public String toString (){
        return " Titulo: "+titulo+
                " | Interprete: "+interprete+
                " | Fecha lanzamiento: "+fechaLanzamiento+
                " | Genero: "+generos;
    }
}
