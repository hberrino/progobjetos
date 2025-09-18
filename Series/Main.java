package Series;

public class Main {
    public static void main(String[] args) {

        Serie s1 = new Serie("Viaje espacial", "Serie sobre viajes", "Juan August", "Ciencia ficción");

        Capitulo c1 = new Capitulo("Comienza el viaje", "Comienza la aventura");
        Capitulo c2 = new Capitulo("Llegada a la luna", "Pisando el satélite Luna");
        Capitulo c3 = new Capitulo("Exploración lunar", "Primeras muestras");

        c1.setCalificacion(4);
        c2.setCalificacion(5);
        c3.setCalificacion(-2);


        Temporada t1 = new Temporada();
        t1.agregarCapitulo(c1);
        t1.agregarCapitulo(c2);
        t1.agregarCapitulo(c3);


        s1.agregarTemporada(t1);

        System.out.println("Total capítulos vistos de la temporada: " + t1.getCantidadVistos());
        System.out.println("Promedio de calificaciones de la temporada: " + t1.getCalificacionPromedio());
        System.out.println("Total capítulos vistos de la serie: " + s1.getVistosSerie());
        System.out.println("Se vio toda la serie? " + ((s1.seVioTodaSerie())?"Si":"No"));
    }
}