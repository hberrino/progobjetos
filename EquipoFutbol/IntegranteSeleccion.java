package EquipoFutbol;

import java.time.LocalDate;

public class IntegranteSeleccion {

    private String nombre;
    private String apellido;
    private int numPasaporte;
    private LocalDate fechaNacimiento;
    private String estado;

    public IntegranteSeleccion(String nombre, String apellido, int numPasaporte, LocalDate fechaNacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numPasaporte=numPasaporte;
        this.fechaNacimiento=fechaNacimiento;
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    public String getEstado (){
        return estado;
    }
    public String getNombre (){
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getNumPasaporte() {
        return numPasaporte;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String toString() {
        return "Nombre: " + nombre +
                " " + apellido +
                " | Pasaporte: " + numPasaporte +
                " | Nacimiento: " + fechaNacimiento;
    }
    public boolean estaDisponible (){
        return estado.equals("En pais de origen");
    }
}
