package CompañiaDeEnvios;

public class Paquete extends Envio{

    public Paquete (String direccionDestino, Remitente remitente, String tipoEnvio, double peso, int tracking){
        super(direccionDestino,remitente,tipoEnvio,peso, tracking);
    }
}
