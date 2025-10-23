package CompañiaDeEnvios;

public class Carta extends Envio{

    public Carta (String direccionDestino, Remitente remitente, String tipoEnvio, double peso, int tracking){
        super(direccionDestino,remitente,tipoEnvio,peso, tracking);
    }
}
