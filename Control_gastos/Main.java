package Control_gastos;

public class Main {
    public static void main(String[] args) {
        Ciudad c1 = new Ciudad("Cordoba", 400000, 100, 200, 300, 400, 500, 2000);
        Ciudad c2 = new Ciudad("Villa Carlos Paz", 90000, 50, 50, 50, 50, 50, 1000);
        Ciudad c3 = new Ciudad("Necochea", 120000, 400, 300, 50, 200, 100, 1000);

        Pais pais = new Pais();

        pais.agregarCiudad(c1);
        pais.agregarCiudad(c2);
        pais.agregarCiudad(c3);

        for (Ciudad c : pais.getCiudades()) {  // necesitás crear un getter para el ArrayList
            System.out.println(c.getNombre() + " está " + (pais.gastanMas(c) ? "en déficit" : "en rentabilidad"));
        }
    }
}
