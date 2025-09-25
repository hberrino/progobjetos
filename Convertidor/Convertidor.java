package Convertidor;

public class Convertidor {

    private static final double galon_a_litro= 3.78541;
    private static final double libra_a_kilo=0.453592;
    private static final double pulgada_a_cm=2.54;

    public Convertidor (){
    }

    public static double cm_a_pulgada (double cm){
        return cm/pulgada_a_cm;
    }
    public static double pulgada_a_cm (double pulgada){
        return pulgada*pulgada_a_cm;
    }
    public static double kilo_a_libra (double kg){
        return kg/libra_a_kilo;
    }
    public static double libra_a_kilo (double libra){
        return libra*libra_a_kilo;
    }
    public static double litro_a_galon (double litro){
        return litro/galon_a_litro;
    }
    public static double galon_a_litro (double galon){
        return galon*galon_a_litro;
    }
}
