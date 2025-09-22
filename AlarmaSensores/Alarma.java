package AlarmaSensores;

import java.util.ArrayList;

public class Alarma {

    private ArrayList<Sensor> sensores;

    public Alarma() {
        sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor s) {
        sensores.add(s);
    }

    public void comprobar(Timbre t) {
        boolean hayAlarma = false;
        for (Sensor s : sensores) {
            if (s.estaActivado()) {
                hayAlarma = true;
                System.out.println("Alarma en zona: " + s.getZona());
            }
        }
        if (hayAlarma) {
            t.hacersonar();
        }
    }
}
