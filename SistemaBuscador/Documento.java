package SistemaBuscador;

import java.util.ArrayList;

public class Documento {

    private String titulo;
    private ArrayList<Autor> autores;
    private ArrayList<Clave> palabrasClave;
    private String contenido;

    public Documento (String titulo, String contenido){
        this.titulo=titulo;
        this.contenido=contenido;
        this.autores=new ArrayList<>();
        this.palabrasClave=new ArrayList<>();
    }
    public void agregarAutor (Autor a){
        autores.add(a);
    }
    public void agregarPalabras (Clave c){
        palabrasClave.add(c);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public ArrayList<Autor> getAutores (){
        return autores;
    }
    public ArrayList<Clave> getPalabrasClave() {
        return palabrasClave;
    }
}
