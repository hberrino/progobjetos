package Personajes;

import java.util.ArrayList;

public class Barco extends UniversoOnePiece{

    private ArrayList<UniversoOnePiece> miembros;

    public Barco (String nombre){
        super(nombre);
        this.miembros=new ArrayList<>();
    }
    public void agregarMiembro(UniversoOnePiece m){
        miembros.add(m);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public ArrayList<UniversoOnePiece> getMiembros() {
        return miembros;
    }

    public double getFuerza(){
        double suma=0;
        for (UniversoOnePiece m : miembros) {
         suma+=m.getFuerza();
        }
        return suma;
    }
    public double getPeso (){
        return miembros.get(0).getPeso();
    }
    public int getEdad() {
        int edadMayor = 0;

        for (UniversoOnePiece m : miembros) {
            if (m.getEdad() > edadMayor) {
                edadMayor = m.getEdad();
            }
        }
        return edadMayor;
    }
}
