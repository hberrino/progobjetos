package Vivero;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<NombreVulgar> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private int solRequired;
    private int riegoRequired;
    private String tipoPlanta;

    public Planta (String nombreCientifico, String clasificacionSuperior, String familia, String clase, String tipoPlanta){
        this.nombreCientifico=nombreCientifico;
        this.clasificacionSuperior=clasificacionSuperior;
        this.familia=familia;
        this.clase=clase;
        this.nombresVulgares=new ArrayList<>();
        this.tipoPlanta=tipoPlanta;
    }
    public String getTipoPlanta() {
        return tipoPlanta;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public String getClase() {
        return clase;
    }
    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }
    public String getFamilia() {
        return familia;
    }
    public void agregarNombreVulgar(NombreVulgar nombre){
        nombresVulgares.add(nombre);
    }
    public ArrayList<NombreVulgar> getNombresVulgares() {
        return nombresVulgares;
    }
    public void setSolRequired(int solRequired){
        if(solRequired <= 10 && solRequired >0){
            this.solRequired=solRequired;
        }
    }
    public void setRiegoRequired (int riegoRequired){
        if(riegoRequired <= 10 && riegoRequired >0){
            this.riegoRequired=riegoRequired;
        }
    }
    public int getRiegoRequired() {
        return riegoRequired;
    }
    public int getSolRequired() {
        return solRequired;
    }

    public String toString (){
        return "Nombre Cientifico: "+nombreCientifico+
                " | Nombres Vulgares: "+nombresVulgares+
                " | Clasificacion superior: "+clasificacionSuperior+
                " | Familia: "+familia+
                " | Clase: "+clase+
                " | "+tipoPlanta+
                " | Riego: "+riegoRequired+
                " | Sol: "+solRequired;
    }


}
