package Parcialito1;

import java.util.ArrayList;

public class Plataforma {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Cancion> canciones;
    private ArrayList<Genero> generos;

    public Plataforma (){
        this.usuarios=new ArrayList<>();
        this.canciones=new ArrayList<>();
        this.generos=new ArrayList<>();
    }
    public void agregarUsuario (Usuario u){
        usuarios.add(u);
    }
    public void agregarCancion (Cancion c){
        canciones.add(c);
    }
    public void agregarGenero (Genero g){
        generos.add(g);
    }

    public ArrayList<Usuario> getUsuarios (){
        return usuarios;
    }
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }
    public ArrayList<Genero> getGeneros (){
        return generos;
    }

}
