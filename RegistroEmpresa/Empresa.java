package RegistroEmpresa;

import java.util.ArrayList;

public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Asociado> asociados;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.asociados = new ArrayList<>();
    }

    public void agregarAsociado(Asociado a) {
        asociados.add(a);
    }

    public ArrayList<Asociado> getAsociados() {
        return asociados;
    }

    public void mostrarAsociados() {
        for (Asociado a : asociados) {
            System.out.println(a);
        }
    }
}
