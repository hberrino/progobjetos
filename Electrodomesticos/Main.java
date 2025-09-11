package Electrodomesticos;

public class Main {
    public static void main (String[] args){
        Electrodomestico ed1 = new Electrodomestico("batidora", 200, 10, "rojo", 3.5);
        Electrodomestico ed2 = new Electrodomestico("microondas", 1200, 62, "amarillo", 9.2);
        Electrodomestico ed3 = new Electrodomestico("horno", 1500, 75, "violeta", 12.7);
        Electrodomestico ed4 = new Electrodomestico("pava", 325, 11, "blanco", 5.0);

        System.out.println("Consumo de "+ed1.getNombre()+": "+ed1.getConsumo()+", por lo tanto es alta gama: "+(ed1.esAltaGama() ? "Si":"No"));
    }
}
