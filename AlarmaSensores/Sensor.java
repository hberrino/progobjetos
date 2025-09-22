package AlarmaSensores;

public class Sensor {
    private String zona;
    private boolean activado;

    public Sensor(String zona) {
        this.zona = zona;
        this.activado = false;
    }

    public String getZona() {
        return zona;
    }

    public boolean estaActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }
}
