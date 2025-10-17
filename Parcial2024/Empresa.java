package Parcial2024;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Miembro> miembros;

    public Empresa (){
        this.miembros=new ArrayList<>();
    }
    public void agregarMiembro (Miembro m){
        miembros.add(m);
    }

    public ArrayList<Miembro> getMiembros() {
        return miembros;
    }
}
