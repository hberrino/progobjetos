package JardinPrivado;


import java.util.ArrayList;

public class Jardin {

    private ArrayList<Planta> plantas;

    public Jardin (){
        this.plantas=new ArrayList<>();
    }
    public ArrayList<Planta> getPlantas (){
        return plantas;
    }
    public void agregarPlanta(Planta p){
        plantas.add(p);
    }
    public void mostrarPlantas (){
        for (Planta p : plantas){
            System.out.println(p);
        }
    }


}
