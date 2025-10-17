package SombreroHogwarts;

import java.util.ArrayList;
import java.util.Objects;

public class Alumno {

    private String nombre;
    private String apellido;
    private ArrayList<Cualidad> cualidades;
    private boolean yaSeleccionado = false;

    public Alumno (String nombre, String apellido, boolean yaSeleccionado){
        this.nombre=nombre;
        this.apellido=apellido;
        this.yaSeleccionado=yaSeleccionado;
        this.cualidades = new ArrayList<>();
    }

    public boolean isYaSeleccionado() {
        return yaSeleccionado;
    }
    public void setYaSeleccionado(boolean yaSeleccionado) {
        this.yaSeleccionado = yaSeleccionado;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void agregarCualidades (Cualidad c){
        cualidades.add(c);
    }
    public ArrayList<Cualidad> getCualidades() {
        return cualidades;
    }
    public boolean equals (Object o){
        if(this == o){
            return true;
        }
        Alumno otro = (Alumno) o;
        return Objects.equals(this.nombre, otro.nombre) && Objects.equals(this.apellido, otro.apellido);
    }
}
