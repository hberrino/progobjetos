package EquipoFutbol;


import java.time.LocalDate;

public class Masajista extends IntegranteSeleccion {

    private String tituloProfesional;
    private int aniosEjerciendo;

    public Masajista (String nombre, String apellido, int numPasaporte, LocalDate fechaNacimiento, String tituloProfesional, int aniosEjerciendo){
        super(nombre, apellido, numPasaporte, fechaNacimiento);
        this.tituloProfesional=tituloProfesional;
        this.aniosEjerciendo=aniosEjerciendo;
    }
    public String getTituloProfesional(){
        return tituloProfesional;
    }
    public int getaniosEjerciendo(){
        return aniosEjerciendo;
    }
    public String toString(){
        return super.toString()+
                " | Titulo profesional: "+tituloProfesional+
                " | Años Ejerciendo: "+aniosEjerciendo;
    }

}
