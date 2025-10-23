package CompañiaDeEnvios;

public abstract class Envio {

    private String direccionDestino;
    private Remitente remitente;
    private String tipoEnvio;
    private double peso;
    private int tracking;

    public Envio(String direccionDestino, Remitente remitente, String tipoEnvio, double peso, int tracking){
        this.direccionDestino=direccionDestino;
        this.remitente=remitente;
        this.tipoEnvio=tipoEnvio;
        this.peso=peso;
        this.tracking=tracking;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public int getTracking() {
        return tracking;
    }

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }

    public double getPeso() {
        return peso;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }
}
