package EquipoFutbol;

import java.util.ArrayList;

public class Seleccion {
    private String paisSeleccion;
    private ArrayList<IntegranteSeleccion> integrantes;

    public Seleccion(String paisSeleccion) {
        this.paisSeleccion = paisSeleccion;
        this.integrantes = new ArrayList<>();
    }
    public void agregarIntegrante (IntegranteSeleccion i){
        integrantes.add(i);
    }
    public String getPaisSeleccion() {
        return paisSeleccion;
    }
    public void mostrarIntegrantes(){
        for (IntegranteSeleccion i : integrantes){
            System.out.println(i);
        }
    }
}
