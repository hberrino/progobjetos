package AlarmaSensores;

public class Main {
    public static void main(String[] args) {
        Timbre t = new Timbre();

        // Creo sensores
        Sensor patio = new Sensor("Patio");
        Sensor cocina = new Sensor("Cocina");
        Sensor habitacion = new Sensor("Habitación");

        // Creo alarma normal
        Alarma a = new Alarma();
        a.agregarSensor(patio);
        a.agregarSensor(cocina);
        a.agregarSensor(habitacion);

        // Activo algunos sensores
        patio.setActivado(true);
        habitacion.setActivado(true);

        System.out.println("---- Comprobando Alarma Normal ----");
        a.comprobar(t);

        // Creo alarma luminosa
        AlarmaLuminosa al = new AlarmaLuminosa();
        al.agregarSensor(patio);
        al.agregarSensor(cocina);
        al.agregarSensor(habitacion);

        // Activo otros sensores
        cocina.setActivado(true);

        System.out.println("---- Comprobando Alarma Luminosa ----");
        al.comprobar(t);
    }
}