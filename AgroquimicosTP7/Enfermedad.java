package AgroquimicosTP7;

import java.util.ArrayList;

public class Enfermedad {

    private String nombre;
    private ArrayList<Patologia> patologias;

    public Enfermedad (String nombre){
        this.nombre=nombre;
        this.patologias=new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarPatologias (Patologia p){
        patologias.add(p);
    }
    public ArrayList<Patologia> getPatologias() {
        return patologias;
    }
}
