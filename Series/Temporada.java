package Series;

import java.util.ArrayList;

public class Temporada {

    private ArrayList<Capitulo> capitulos;

    public Temporada (){
        this.capitulos = new ArrayList<>();
    }
    public void agregarCapitulo (Capitulo c){
        capitulos.add(c);
    }
    public int getCantidadVistos() {
        int contador = 0;
        for (Capitulo cap : capitulos) {
            if (cap.isSeVio()) {
                contador++;
            }
        }
        return contador;
    }
    public double getCalificacionPromedio (){
        double suma = 0;
        double vistos = getCantidadVistos();
        if (vistos==0){
            return -1;
        }
        for (Capitulo cap : capitulos){
            if (cap.isSeVio()){
                suma+=cap.getCalificacion();
            }
        }
        return suma/vistos;
    }
    public int getCantidadCapitulos() {
        return capitulos.size();
    }

}
