package AgendaCelular;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Contacto c1 = new Contacto("Juan Gabriel", LocalDate.of(2003,5,7),"2914708124", "laprida 245", "juanga@gmail.com", "tandil");
        Contacto c2 = new Contacto("Juan Gabriel", LocalDate.of(2003,5,7),"2914708124", "laprida 245", "juanga@gmail.com", "tandil");
        Contacto c3 = new Contacto("Agustin Rich", LocalDate.of(2004,8,27),"2914734344", "fushl 25", "agusrich@gmail.com", "caba");

        Celular iphone25348 = new Celular();
        iphone25348.agregarContacto(c1);
        iphone25348.agregarContacto(c2);
        iphone25348.agregarContacto(c3);

        System.out.println("contactos: ");
        iphone25348.listaContactos();
        iphone25348.agregarRepetidos();
        System.out.println("lista repetidos: ");
        iphone25348.mostrarRepetidos();
        System.out.println("promedio edad de contactos: "+iphone25348.promedioEdad());

    }
}
