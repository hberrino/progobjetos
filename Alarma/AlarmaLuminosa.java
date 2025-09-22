package Alarma;

public class AlarmaLuminosa extends Alarma {


    public boolean comprobar(Timbre t){
        boolean hayAlarma = super.comprobar(t); // suena el timbre
        if (hayAlarma) {
            System.out.println("💡 Luz parpadeante");
        }
        return hayAlarma;
    }
}
