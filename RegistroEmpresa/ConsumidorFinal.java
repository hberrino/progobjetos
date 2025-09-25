package RegistroEmpresa;

public class ConsumidorFinal extends Asociado {

    private String nombreUsuario;
    private String password;

    public ConsumidorFinal(String nombre, String apellido, String cargo, int edad, String nombreUsuario, String password) {
        super(nombre, apellido, cargo, edad);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public String getPassword (){
        return password;
    }
    public String toString (){
        return super.toString()+
                " | Usuario: "+nombreUsuario+
                " | Contraseña: "+password;
    }
}
