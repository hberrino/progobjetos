package Alarma;

public class Main {
    public static void main(String[] args) {
        Timbre t = new Timbre();
        Alarma a = new Alarma();
        AlarmaLuminosa al = new AlarmaLuminosa();
        a.setPuertaAbierta(true);
        a.comprobar(t);
        al.setPuertaAbierta(true);
        al.comprobar(t);
    }
}
