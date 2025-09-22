package Alarma;

public class Alarma {

    private boolean vidrioRoto = false;
    private boolean puertaAbierta = false;
    private boolean ventanaAbierta = false;
    private boolean movimientoDetectado = false;

    public Alarma (){}

    public void setMovimientoDetectado(boolean movimientoDetectado) {
        this.movimientoDetectado = movimientoDetectado;
    }
    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public void setVentanaAbierta(boolean ventanaAbierta) {
        this.ventanaAbierta = ventanaAbierta;
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public boolean comprobar (Timbre t){
        if (vidrioRoto || puertaAbierta || ventanaAbierta || movimientoDetectado){
            t.hacersonar();
            return true;
        }
        return false;
    }
}
