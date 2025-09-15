package Control_gastos;

import java.util.ArrayList;

public class Pais {


    private ArrayList<Ciudad> ciudades;

    public Pais (){
        ciudades = new ArrayList<>();
    }
    public void agregarCiudad (Ciudad c){
        if (c.getHabitantes()>=100000){
            ciudades.add(c);
        }
    }
    public boolean gastanMas(Ciudad c) {
        return c.getGasto_mantenimiento() > c.getTotalImp();
    }
    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
}
