package AgendaPersonal;

public class Main {
    public static void main(String[] args) {

        // 1️⃣ Crear agenda
        Agenda agenda = new Agenda("Hernán", "Oficina Central");

        // 2️⃣ Crear reunión
        Reunion reunion = new Reunion();
        reunion.setTemaReunion("Proyecto Final");
        reunion.setDuracion(2.5); // duración en horas

        // 3️⃣ Crear asistentes
        Asistente a1 = new Asistente();
        a1.setNombre("Juan");
        a1.setTelefono("123456");
        a1.setEmail("juan@mail.com");

        Asistente a2 = new Asistente();
        a2.setNombre("María");
        a2.setTelefono("7891011");
        a2.setEmail("maria@mail.com");

        // 4️⃣ Agregar asistentes a la reunión
        reunion.agregarParticipante(a1);
        reunion.agregarParticipante(a2);

        // 5️⃣ Agregar la reunión a la agenda
        agenda.agregarReunion(reunion);

        // 6️⃣ Mostrar información
        System.out.println("Agenda de " + agenda.getUsuario() + " en " + agenda.getLugarEvento());
        System.out.println("Reuniones:");

        for (Reunion r : agenda.getReuniones()) {
            System.out.println("- Tema: " + r.getTemaReunion());
            System.out.println("  Duración: " + r.getDuracion() + " horas");
            System.out.println("  Participantes:");
            for (Asistente asistente : r.getParticipantes()) {
                System.out.println("    * " + asistente.getNombre() + " (" + asistente.getEmail() + ")");
            }
        }
    }
}
