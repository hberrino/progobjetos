package Vivero;

import java.util.ArrayList;

public class Ficha {
    private ArrayList<Planta> plantas;

    public Ficha (){
        this.plantas=new ArrayList<>();
    }
    public void agregarPlantas (Planta p){
        plantas.add(p);
    }

    public ArrayList<Planta> getPlantas() {
        return new ArrayList<>(plantas);
    }

}
