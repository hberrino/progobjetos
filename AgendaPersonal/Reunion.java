package AgendaPersonal;

import java.util.ArrayList;

public class Reunion {

    //atributos
    private double duracion;
    private String temaReunion;
    private ArrayList<Asistente> participantes;

    //setters y gettes
    public void setDuracion (double duracion){
        this.duracion=duracion;
    }
    public double getDuracion (){
        return duracion;
    }
    public void setTemaReunion (String temaReunion){
        this.temaReunion=temaReunion;
    }
    public String getTemaReunion (){
        return temaReunion;
    }
    public void agregarParticipante(Asistente asistente) {
        participantes.add(asistente);
    }

    public ArrayList<Asistente> getParticipantes() {
        return participantes;
    }
    //constructores
    public Reunion() {
        participantes = new ArrayList<>();
    }

}
