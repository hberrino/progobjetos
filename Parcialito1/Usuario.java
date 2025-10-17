package Parcialito1;

import java.time.LocalDate;

public class Usuario {

    private String username;
    private LocalDate fechaNacimiento;

    public Usuario (String username, LocalDate fechaNacimiento){
        this.username=username;
        this.fechaNacimiento=fechaNacimiento;
    }
    public String getUsername() {
        return username;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

}
