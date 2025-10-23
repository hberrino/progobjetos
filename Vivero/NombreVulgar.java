package Vivero;

public class NombreVulgar {
    private String nombreVulgar;

    public NombreVulgar (String nombreVulgar){
        this.nombreVulgar=nombreVulgar;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    @Override
    public String toString() {
        return nombreVulgar;
    }
}
