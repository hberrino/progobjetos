package SistemaBuscador;

import java.util.ArrayList;

public class Busqueda extends Documento{

    public Busqueda (String titulo, String contenido){
        super(titulo, contenido);
    }
    //metodos busqueda
    //por titulo.
    public static ArrayList<Documento> porTitulo (ArrayList<Documento> doc, String titulo){
        ArrayList<Documento> resultado = new ArrayList<>();
        for (Documento d : doc){
            if(d.getTitulo().equals(titulo)){
                resultado.add(d);
            }
        }
        return resultado;
    }
    public static ArrayList<Documento> porTituloYClave(ArrayList<Documento>doc, String Clave){
        ArrayList<Documento> resultado = new ArrayList<>();
        for (Documento d : doc){
            if(d.getTitulo().contains(Clave)){
                resultado.add(d);
            }
        }
        return resultado;
    }
    //Documentos que contengan palabra clave
    public static ArrayList<Documento> porClave (ArrayList<Documento>doc, String Clave){
        ArrayList<Documento> resultado = new ArrayList<>();
        for (Documento d : doc){
            for(Clave c : d.getPalabrasClave()){
                if(c.getPalabraclave().equals(Clave)){
                    resultado.add(d);
                    break;
                }
            }
        }
        return resultado;
    }





}
