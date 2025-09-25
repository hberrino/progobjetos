package RegistroEmpresa;

public class Asociado {

    private String nombre;
    private String apellido;
    private String cargo;
    private int edad;

    public Asociado (String nombre, String apellido, String cargo, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cargo=cargo;
        this.edad=edad;
    }
    public String getNombre (){
        return nombre;
    }
    public String getApellido (){
        return apellido;
    }
    public String getCargo(){
        return cargo;
    }
    public int GetEdad (){
        return edad;
    }
    public String toString (){
        return "Nombre: "+nombre+
                " | Apellido: "+apellido+
                " | Cargo: "+cargo+
                " | Edad: "+edad;
    }

}
