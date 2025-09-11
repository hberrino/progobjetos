package Establecimiento_Deportivo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Registro> historialRegistro;

    public Usuario (String nombre){
        this.nombre=nombre;
        this.historialRegistro = new ArrayList<>();
    }

    //public void agregarTurno (Registro registro){
     //   historialRegistro.add(Registro);
    //}

    public List<Registro> getHistorialRegistro() {
        return historialRegistro;
    }
}
