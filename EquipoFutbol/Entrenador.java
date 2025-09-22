package EquipoFutbol;

import java.time.LocalDate;

public class Entrenador extends IntegranteSeleccion {

    private int idFederacion;

    public Entrenador (String nombre, String apellido, int numPasaporte, LocalDate fechaNacimiento, int idFederacion){
        super(nombre, apellido, numPasaporte, fechaNacimiento);
        this.idFederacion=idFederacion;
    }
    public int getIdFederacion() {
        return idFederacion;
    }
    public String toString (){
        return super.toString()+
                " | ID federacion: "+idFederacion;
    }
}
