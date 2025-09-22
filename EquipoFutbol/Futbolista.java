package EquipoFutbol;

import java.time.LocalDate;

public class Futbolista extends IntegranteSeleccion {

    private String posicion;
    private String piernaHabil;
    private int golesConvertidos;

    public Futbolista (String nombre, String apellido, int numPasaporte, LocalDate fechaNacimiento, String posicion, String piernaHabil, int golesConvertidos){
        super(nombre,apellido,numPasaporte,fechaNacimiento);
        this.posicion=posicion;
        this.piernaHabil=piernaHabil;
        this.golesConvertidos=golesConvertidos;
    }
    public String getPosicion (){
        return posicion;
    }
    public String getPiernaHabil (){
        return piernaHabil;
    }
    public int getGolesConvertidos(){
        return golesConvertidos;
    }
    public String toString() {
        return super.toString() +
                " | Posición: " + posicion +
                " | Pierna hábil: " + piernaHabil +
                " | Goles: " + golesConvertidos;
    }
}
