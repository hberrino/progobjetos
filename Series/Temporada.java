package Series;

import java.util.ArrayList;

public class Temporada {
    private int numero;
    private ArrayList<Episodeo> episodeos;

    public Temporada (int numero){
        this.numero = numero;
        this.episodeos = new ArrayList<>();
    }
    public void agregarEpisodeo (Episodeo episodeo){
        episodeos.add(episodeo);
    }
    public ArrayList<Episodeo> getEpisodios() {
        return episodeos;
    }
    public int totalVistos (){
        int contador=0;
        for (Episodeo e : episodeos){
            if(e.isVisto()){
                contador++;
            }
        }
        return contador;
    }
    private double promedioCalificaciones (){
        double suma=0;
        double cont=0;
        for (Episodeo e : episodeos){
            if (e.isVisto()){
                suma+= e.getCalificacion();
                cont++;
            }
        }
        return cont > 0 ? suma/cont : 0;
    }
    public boolean seVioCompleta() {
        for (Episodeo e : episodeos) {
            if (!e.isVisto()) return false;
        }
        return true;
    }

}
