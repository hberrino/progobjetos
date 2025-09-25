package Convertidor;

public class Main {
    public static void main(String[] args) {
        double cm = 10;
        double pulgadas = Convertidor.cm_a_pulgada(cm);
        System.out.println(cm + " cm son " + pulgadas + " pulgadas");

        double kg = 5;
        double libras = Convertidor.kilo_a_libra(kg);
        System.out.println(kg + " kg son " + libras + " libras");

        double galones = 2;
        double litros = Convertidor.galon_a_litro(galones);
        System.out.println(galones + " galones son " + litros + " litros");
    }
}
