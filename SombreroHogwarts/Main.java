package SombreroHogwarts;

public class Main {
    public static void main(String[] args) {
        // Creo algunas cualidades
        Cualidad valiente = new Cualidad("Valiente");
        Cualidad leal = new Cualidad("Leal");
        Cualidad sabio = new Cualidad("Sabio");
        Cualidad ambicioso = new Cualidad("Ambicioso");

        // Creo casas
        Casa gryffindor = new Casa("Gryffindor", 2);
        gryffindor.getCualidades().add(valiente);

        Casa hufflepuff = new Casa("Hufflepuff", 2);
        hufflepuff.getCualidades().add(leal);

        Casa ravenclaw = new Casa("Ravenclaw", 2);
        ravenclaw.getCualidades().add(sabio);

        Casa slytherin = new Casa("Slytherin", 2);
        slytherin.getCualidades().add(ambicioso);

        // Configuro algunas reglas
        gryffindor.setRequiereFamiliar(false);
        gryffindor.setRequiereTodasLasCualidades(true);

        // Creo alumnos
        Alumno harry = new Alumno("Harry", "Potter", false);
        harry.agregarCualidades(valiente);

        Alumno hermione = new Alumno("Hermione", "Granger", false);
        hermione.agregarCualidades(valiente);
        hermione.agregarCualidades(sabio);

        Alumno draco = new Alumno("Draco", "Malfoy", false);
        draco.agregarCualidades(ambicioso);

        Alumno cedric = new Alumno("Cedric", "Diggory", false);
        cedric.agregarCualidades(leal);

        // Intento asignar alumnos
        gryffindor.agregarAlumno(harry);     // debería entrar
        gryffindor.agregarAlumno(hermione);  // debería entrar
        gryffindor.agregarAlumno(cedric);    // no debería entrar (capacidad llena)

        hufflepuff.agregarAlumno(cedric);    // debería entrar
        slytherin.agregarAlumno(draco);      // debería entrar

        // Muestro resultados
        System.out.println("Alumnos en Gryffindor:");
        for (Alumno a : gryffindor.getAlumnos()) {
            System.out.println(a.getNombre() + " " + a.getApellido());
        }

        System.out.println("\nAlumnos en Hufflepuff:");
        for (Alumno a : hufflepuff.getAlumnos()) {
            System.out.println(a.getNombre() + " " + a.getApellido());
        }

        System.out.println("\nAlumnos en Slytherin:");
        for (Alumno a : slytherin.getAlumnos()) {
            System.out.println(a.getNombre() + " " + a.getApellido());
        }
    }
}
