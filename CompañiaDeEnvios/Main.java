package CompañiaDeEnvios;

public class Main {
    public static void main(String[] args) {
        // Crear remitentes
        Remitente r1 = new Remitente("Juan Pérez", "Av. Colón 123");
        Remitente r2 = new Remitente("María López", "Rivadavia 456");
        Remitente r3 = new Remitente("Carlos Díaz", "Belgrano 789");

        // Crear envíos simples
        Carta c1 = new Carta("Tandil", r1, "Carta simple", 0.3, 111);
        Carta c2 = new Carta("Tandil", r2, "Carta express", 0.4, 222);
        Paquete p1 = new Paquete("Tandil", r3, "Paquete", 1.2, 333);

        // Crear combo interno
        ComboPostal comboInterno = new ComboPostal("Tandil", r2, "Combo Interno", 0, 444);
        comboInterno.agregarCombo(c2);
        comboInterno.agregarCombo(p1);

        // Crear combo principal
        ComboPostal comboPrincipal = new ComboPostal("Tandil", r1, "Combo Principal", 0, 999);
        comboPrincipal.agregarCombo(c1);
        comboPrincipal.agregarCombo(comboInterno); // combo dentro de combo

        // Mostrar información general
        System.out.println("===== TEST COMPAÑÍA DE ENVÍOS =====");
        System.out.println("Remitente del combo principal: " + comboPrincipal.getRemitente().getNombre());
        System.out.println("Dirección del combo principal: " + comboPrincipal.getDireccionDestino());
        System.out.println("Tracking del combo principal: " + comboPrincipal.getTracking());
        System.out.println("Peso total del combo principal: " + comboPrincipal.getPeso());

        // Verificar propagación de tracking
        System.out.println("\n=== Verificación de tracking ===");
        System.out.println("Carta c1 tracking: " + c1.getTracking());
        System.out.println("Combo interno tracking: " + comboInterno.getTracking());
        System.out.println("Carta c2 tracking: " + c2.getTracking());
        System.out.println("Paquete p1 tracking: " + p1.getTracking());

        // Mostrar pesos individuales para corroborar la suma
        System.out.println("\n=== Pesos individuales ===");
        System.out.println("Carta c1: " + c1.getPeso());
        System.out.println("Carta c2: " + c2.getPeso());
        System.out.println("Paquete p1: " + p1.getPeso());
        System.out.println("Peso combo interno: " + comboInterno.getPeso());
        System.out.println("Peso combo principal: " + comboPrincipal.getPeso());
    }
}
