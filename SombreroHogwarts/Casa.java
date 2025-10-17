package SombreroHogwarts;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int capacidad;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Cualidad> cualidades;
    private boolean requiereFamiliar = false;
    private boolean requiereTodasLasCualidades = false;

    public Casa (String nombre, int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.alumnos = new ArrayList<>();
        this.cualidades= new ArrayList<>();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<Cualidad> getCualidades() {
        return cualidades;
    }

    public void setRequiereTodasLasCualidades(boolean requiereTodasLasCualidades) {
        this.requiereTodasLasCualidades = requiereTodasLasCualidades;
    }

    public void setRequiereFamiliar(boolean requiereFamiliar) {
        this.requiereFamiliar = requiereFamiliar;
    }
    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public boolean buscarFamiliar(Alumno a) {
        for (Alumno alumno : alumnos) {   // recorro los alumnos de esta casa
            if (alumno.getApellido().equals(a.getApellido())) {
                return true; // encontré un familiar
            }
        }
        return false; // nadie con ese apellido
    }
    public int tieneCualidades (Alumno a){
        int contador = 0;
        for (Cualidad c : cualidades){
            if (a.getCualidades().contains(c)){
                contador++;
            }
        }
        return contador;
    }
    public boolean todasLasCualidades (Alumno a){
        return tieneCualidades(a)==cualidades.size();
    }
    public void agregarAlumno(Alumno a){
        if (capacidad>0 && !a.isYaSeleccionado()) {
            if (requiereFamiliar && buscarFamiliar(a) && requiereTodasLasCualidades && todasLasCualidades(a)) {
                alumnos.add(a);
                capacidad--;
                a.setYaSeleccionado(true);
            }else if (requiereFamiliar && buscarFamiliar(a) && !requiereTodasLasCualidades && (tieneCualidades(a)>0)){
                alumnos.add(a);
                capacidad--;
                a.setYaSeleccionado(true);
            }else if (!requiereFamiliar && !requiereTodasLasCualidades && (tieneCualidades(a)>0)){
                alumnos.add(a);
                capacidad--;
                a.setYaSeleccionado(true);
            }else if (!requiereFamiliar && requiereTodasLasCualidades && todasLasCualidades(a)){
                alumnos.add(a);
                capacidad--;
                a.setYaSeleccionado(true);
            }else System.out.println("Alumno no admitido en la casa");
        }
    }

}
