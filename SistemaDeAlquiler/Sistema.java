package SistemaDeAlquiler;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {

    private ArrayList<AlquilerItem> items;
    private ArrayList<Alquiler> alquileres;

    public Sistema (){
        this.items=new ArrayList<>();
        this.alquileres=new ArrayList<>();
    }
    public void agregarItem (AlquilerItem i){
        items.add(i);
    }
    public void registrarAlquiler(Cliente c, AlquilerItem item, String fechaLimite) {
        if (item.alquilerDisponible()) {
            item.alquilar(); // polimorfismo: cada ítem se alquila según su tipo
            Alquiler nuevo = new Alquiler(c, item, LocalDate.parse(fechaLimite));
            alquileres.add(nuevo);
        } else {
            System.out.println("El ítem no está disponible para alquilar.");
        }
    }

    public ArrayList<Cliente> clientesConAlquileresVencidos() {
        ArrayList<Cliente> vencidos = new ArrayList<>();
        for (Alquiler a : alquileres) {
            if (a.vencioFecha()) {
                vencidos.add(a.getCliente());
            }
        }
        return vencidos;
    }

}
