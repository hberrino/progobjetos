package CentroComputos;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Computador> computadoras;
    private ArrayList<Proceso> procesos;

    public Sistema (){
        this.computadoras=new ArrayList<>();
        this.procesos=new ArrayList<>();
    }
    public void agregarComputadora (Computador pc){
        computadoras.add(pc);
    }
    public void agregarProceso (Proceso p){
        procesos.add(p);
    }
    private Proceso obtenerProcesoPrioritario() {
        if (procesos.isEmpty()) return null;
        Proceso mayor = procesos.get(0);
        for (Proceso p : procesos) {
            if (p.getPrioridad() > mayor.getPrioridad()) {
                mayor = p;
            }
        }
        return mayor;
    }
    private Computador obtenerComputadoraPrioritaria() {
        if (computadoras.isEmpty()) return null;
        Computador masRapida = computadoras.get(0);
        for (Computador c : computadoras) {
            if (c.getPrioridad() > masRapida.getPrioridad()) {
                masRapida = c;
            }
        }
        return masRapida;
    }

    public void ejecutar() {
        while (!procesos.isEmpty() && !computadoras.isEmpty()) {
            Proceso p = obtenerProcesoPrioritario();
            Computador c = obtenerComputadoraPrioritaria();

            procesos.remove(p);
            computadoras.remove(c);

            System.out.println("Proceso " + p.getNumProceso() +
                    " (memoria " + p.getMemoria() + ")" +
                    " asignado a Computador (velocidad " + c.getVelocidad() + ")");
        }
    }

}
