package AgendaPersonal;

import java.util.ArrayList;

public class Agenda {

    //atributos
    private String usuario;
    private String lugarEvento;
    private ArrayList<Reunion> reuniones; // lista de reuniones

    //constructor
    public Agenda(String usuario, String lugarEvento) {
        this.usuario = usuario;
        this.lugarEvento = lugarEvento;
        this.reuniones = new ArrayList<>();
    }
    //setters y getters
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }
    public String getLugarEvento() {
        return lugarEvento;
    }
    // métodos para manejar reuniones
    public void agregarReunion(Reunion reunion) {
        reuniones.add(reunion);
    }
    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }
}
