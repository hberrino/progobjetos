package AlarmaSensores;

public class AlarmaLuminosa extends Alarma {

    @Override
    public void comprobar(Timbre t) {
        super.comprobar(t); // suena el timbre y muestra las zonas
        System.out.println("💡 Luz parpadeante");
    }
}