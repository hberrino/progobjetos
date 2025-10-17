package PuertoCereal;

import java.util.ArrayList;

public class Puerto {

    private ArrayList<Camion> camiones;
    private ArrayList<Barco> barcos;

    public Puerto (){
        this.camiones=new ArrayList<>();
        this.barcos=new ArrayList<>();
    }
    public void agregarCamion(Camion c){
        camiones.add(c);
    }
    public void agregarBarco (Barco c){
        barcos.add(c);
    }
    public Camion asignarPrioridadCamion() {
        if (camiones.isEmpty()) {
            return null;
        }
        Camion prioridad = camiones.get(0);
        for (Camion c : camiones) {
            if (c.getPrioridad().isBefore(prioridad.getPrioridad())) {
                prioridad = c;
            }
        }
        return prioridad;
    }
    public Barco asignarPrioridadBarco() {
        if (barcos.isEmpty()) {
            return null;
        }
        Barco prioridad = barcos.get(0);
        for (Barco b : barcos) {
            if (b.getPrioridad().compareTo(prioridad.getPrioridad()) > 0) {
                prioridad = b;
            }
        }
        return prioridad;
    }
    public void cargar (){
        while(!barcos.isEmpty() && !camiones.isEmpty()){
            Barco b = asignarPrioridadBarco();
            Camion c = asignarPrioridadCamion();

            barcos.remove(b);
            camiones.remove(c);

            System.out.println("Barco de capacidad: "+b.getPrioridad()+
                    " | Camion de fecha: "+c.getPrioridad());

        }
    }
}
