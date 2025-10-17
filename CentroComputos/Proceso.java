package CentroComputos;

public class Proceso extends ElementoPrioritario {
    private double memoria;
    private int numProceso;

    public Proceso(double memoria, int numProceso) {
        this.memoria = memoria;
        this.numProceso = numProceso;
    }

    public double getMemoria() {
        return memoria;
    }

    public int getNumProceso() {
        return numProceso;
    }

    @Override
    public double getPrioridad() {
        return memoria; // prioridad = más memoria
    }
}
