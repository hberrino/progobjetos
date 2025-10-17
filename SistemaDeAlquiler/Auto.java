package SistemaDeAlquiler;

public class Auto extends AlquilerItem{

    private String marca;
    private int km;
    private String patente;
    private String tipoMotor;
    private boolean alquilado=false;

    public Auto (String marca, int km, String patente, String tipoMotor){
        this.marca=marca;
        this.km=km;
        this.patente=patente;
        this.tipoMotor=tipoMotor;
    }
    public boolean alquilerDisponible (){
        return !this.alquilado;
    }
    public void alquilar (){
        if(alquilerDisponible()){
            this.alquilado=true;
        }
    }
    public void devolverAuto (){
        this.alquilado=false;
    }

    public int getKm() {
        return km;
    }

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }
}
