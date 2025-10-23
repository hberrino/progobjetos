package CompañiaDeEnvios;

import java.util.ArrayList;

public class ComboPostal extends Envio{

    private ArrayList<Envio> envios;

    public ComboPostal (String direccionDestino, Remitente remitente, String tipoEnvio, double peso, int tracking){
        super(direccionDestino,remitente,tipoEnvio,peso, tracking);
        this.envios=new ArrayList<>();
    }
    public void agregarCombo (Envio e){
        if(envios.isEmpty()){
            this.setTracking(e.getTracking());
            this.setRemitente(e.getRemitente());
            this.setDireccionDestino(e.getDireccionDestino());
        }
        if (e.getDireccionDestino().toLowerCase().contains(getDireccionDestino().toLowerCase())) {
            envios.add(e);
            e.setTracking(this.getTracking());
        }
        if (e instanceof ComboPostal){
            ComboPostal x = (ComboPostal) e;
            for(Envio z : x.getEnvios()){
                z.setTracking(this.getTracking());
            }
        }
    }
    public ArrayList<Envio> getEnvios (){
        return new ArrayList<>(envios);
    }
    public double getPeso() {
        double suma = 0;
        for (Envio e : envios) {
            if (e instanceof ComboPostal) {
                ComboPostal combo = (ComboPostal) e;
                suma += combo.getPeso(); // llamada recursiva
            } else {
                suma += e.getPeso(); // carta o paquete
            }
        }
        return suma;
    }

}
