package AgroquimicosTP7;

import java.util.ArrayList;

public class Quimico {

    private String nombre;
    private ArrayList<Cultivo> cultivos;
    private ArrayList<Patologia> patologias;

    public Quimico (String nombre){
        this.nombre=nombre;
        this.cultivos=new ArrayList<>();
        this.patologias=new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void agregarCultivos (Cultivo c){
        cultivos.add(c);
    }
    public void agregarPatologias (Patologia p){
        patologias.add(p);
    }
    public boolean seRecomienda(Cultivo c) {
        return !cultivos.contains(c);
    }
    public boolean lograCurar(Cultivo c, Enfermedad e) {
        if (!seRecomienda(c)) {
            return false;  // químico no recomendado para el cultivo
        }

        for (Patologia p : e.getPatologias()) {
            if (!patologias.contains(p)) {  // usa equals de Patologia
                return false;               // falta alguna patología
            }
        }
        return true; // todas las patologías de la enfermedad están cubiertas
    }
}
