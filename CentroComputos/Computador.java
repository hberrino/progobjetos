package CentroComputos;

public class Computador extends ElementoPrioritario {
    private double velocidad;

    public Computador(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public double getPrioridad() {
        return velocidad; // prioridad = más velocidad
    }
}
