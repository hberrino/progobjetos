package Parcialito1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Busqueda {

    private Plataforma plataforma; // paso plataforma sin un extends.

    public Busqueda (Plataforma plataforma){
        this.plataforma=plataforma;
    }

    //por interprete
    public ArrayList<Cancion> cancionPorInterprete (String interprete){
        ArrayList<Cancion> resultado = new ArrayList<>();
        String buscado = interprete.toLowerCase();
        for (Cancion c : plataforma.getCanciones()){
            if (c.getInterprete()!= null && c.getInterprete().toLowerCase().contains(buscado)){
                resultado.add(c);
            }
        }
        return resultado;
    }
    //por titulo
    public ArrayList<Cancion> cancionPorTitulo (String titulo){
        ArrayList<Cancion> resultado = new ArrayList<>();
        String buscado = titulo.toLowerCase();
        for (Cancion c : plataforma.getCanciones()){
            if (c.getTitulo() != null && c.getTitulo().toLowerCase().contains(buscado)){
                resultado.add(c);
            }
        }
        return resultado;
    }
    //la lista de genero tenga pop, y que el interprete no sea el de parametro
    public ArrayList<Cancion> cancionPorGeneroDistintoInterprete (String genero, String interprete){
        ArrayList<Cancion> resultado = new ArrayList<>();
        String buscado = interprete.toLowerCase();
        String generoBuscado = genero.toLowerCase();
        for (Cancion c : plataforma.getCanciones()){
            if (c.getGeneros()!=null){
                for(Genero g : c.getGeneros()){
                    if(g.getTipoGenero().toLowerCase().equals(generoBuscado) && !c.getInterprete().toLowerCase().equals(buscado)){
                        resultado.add(c);
                    }
                }
            }
        }
        return resultado;
    }
    //busco por fecha de lanzamiento posterior a una.
    public ArrayList<Cancion> cancionFechaPosteriorA (LocalDate fecha){
        ArrayList<Cancion> resultado = new ArrayList<>();
        if(fecha == null){
            return resultado;
        }
        for (Cancion c : plataforma.getCanciones()){
            if (c.getFechaLanzamiento().isAfter(fecha)){
                resultado.add(c);
            }
        }
        return resultado;
    }




}
