package SombreroHogwarts;

import java.util.Objects;

public class Cualidad {
    private String cualidad;

    public Cualidad (String cualidad){
        this.cualidad=cualidad;
    }
    public String getCualidad() {
        return cualidad;
    }
    public boolean equals (Object o){
        if (this == o) return true;
        Cualidad otraCualidad = (Cualidad) o;
        return Objects.equals(this.cualidad, otraCualidad.cualidad);
    }
}
