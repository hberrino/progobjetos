package AgendaCelular;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {
    private String nombre_apellido;
    private LocalDate fecha_nacimiento;
    private String telefono;
    private String direccion;
    private String mail;
    private String ciudad;

    public Contacto (String nombre_apellido, LocalDate fecha_nacimiento, String telefono, String direccion, String mail, String ciudad){
        this.nombre_apellido=nombre_apellido;
        this.fecha_nacimiento=fecha_nacimiento;
        this.telefono=telefono;
        this.direccion=direccion;
        this.mail=mail;
        this.ciudad=ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMail() {
        return mail;
    }
    public int getEdad() {
        return Period.between(fecha_nacimiento, LocalDate.now()).getYears();
    }
    public String toString(){
        return "nombre y apellido: "+nombre_apellido+
                " fecha de nacimiento: "+fecha_nacimiento+
                " telefono: "+telefono+
                " direccion: "+direccion+
                " mail: "+mail+
                " ciudad: "+ciudad;
    }

}
