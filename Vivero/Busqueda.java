package Vivero;

import java.util.ArrayList;

public class Busqueda {
    private Busqueda (){};

    public static ArrayList<Planta> busquedaPorNombreCientifico (Ficha ficha, String nombreCientifico){
        ArrayList<Planta> resultado = new ArrayList<>();
        for(Planta p : ficha.getPlantas()){
            if(p.getNombreCientifico().contains(nombreCientifico)){
                resultado.add(p);
            }
        }
        return resultado;
    }
    public static ArrayList<Planta> busquedaPorNombreVulgar (Ficha ficha, String nombreVulgar){
        ArrayList<Planta> resultado = new ArrayList<>();
        for (Planta p : ficha.getPlantas()){
            for(NombreVulgar nv : p.getNombresVulgares()){
                if(nv.getNombreVulgar().toLowerCase().contains(nombreVulgar.toLowerCase())){
                    resultado.add(p);
                    break;
                }
            }
        }
        return resultado;
    }
    public static ArrayList<Planta> busquedaPorClasificacion (Ficha ficha, String clasificacion){
        ArrayList<Planta> resultado = new ArrayList<>();
        for (Planta p : ficha.getPlantas()){
            if(p.getClasificacionSuperior().toLowerCase().contains(clasificacion.toLowerCase())){
                resultado.add(p);
            }
        }
        return resultado;
    }
    public static ArrayList<Planta> busquedaPorRiegoMayorYSolMenor (Ficha ficha, int sol, int riego){
        ArrayList<Planta> resultado = new ArrayList<>();
        for(Planta p : ficha.getPlantas()){
            if(p.getRiegoRequired()>riego && p.getSolRequired()<sol){
                resultado.add(p);
            }
        }
        return resultado;
    }
    public static ArrayList<Planta> busquedaPorRiegoMenorYSolMayor (Ficha ficha, int sol, int riego){
        ArrayList<Planta> resultado = new ArrayList<>();
        for(Planta p : ficha.getPlantas()){
            if(p.getRiegoRequired()<riego && p.getSolRequired()>sol){
                resultado.add(p);
            }
        }
        return resultado;
    }
    public static ArrayList<Planta> busquedaPorPlantaPocoRiego (Ficha ficha){
        int riego = 3;
        ArrayList<Planta> resultado = new ArrayList<>();
        for(Planta p : ficha.getPlantas()){
            if(p.getRiegoRequired()<riego){
                resultado.add(p);
            }
        }
        return resultado;
    }
    public static ArrayList<Planta> busquedaPorPlantaPocoSol (Ficha ficha){
        int sol = 3;
        ArrayList<Planta> resultado = new ArrayList<>();
        for(Planta p : ficha.getPlantas()){
            if(p.getSolRequired()<sol){
                resultado.add(p);
            }
        }
        return resultado;
    }

}
