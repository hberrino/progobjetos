package AgendaCelular;

import java.util.ArrayList;

public class Celular {

    private ArrayList<Contacto> contactos;
    private ArrayList<Contacto> repetidos;

    public Celular(){
        this.contactos = new ArrayList<>();
        this.repetidos = new ArrayList<>();
    }
    public void agregarContacto (Contacto c){
        contactos.add(c);
    }
    public void agregarRepetidos() {
        repetidos.clear(); // Limpiamos antes de recalcular
        for (int i = 0; i < contactos.size(); i++) {
            for (int j = i + 1; j < contactos.size(); j++) {
                Contacto c1 = contactos.get(i);
                Contacto c2 = contactos.get(j);
                // Se considera repetido si coinciden nombre y teléfono
                if (c1.getNombre_apellido().equals(c2.getNombre_apellido()) &&
                        c1.getTelefono().equals(c2.getTelefono())) {

                    // Agregamos a la lista de repetidos si no está ya
                    if (!repetidos.contains(c1)) {
                        repetidos.add(c1);
                    }
                    if (!repetidos.contains(c2)) {
                        repetidos.add(c2);
                    }
                }
            }
        }
    }
    public void listaContactos (){
        for (Contacto c : contactos){
            System.out.println(c);
        }
    }
    public void mostrarRepetidos (){
        for (Contacto r : repetidos){
            System.out.println(r);
        }
    }
    public double promedioEdad (){
        double promedio=0;
        for (Contacto c : contactos){
            promedio+=c.getEdad();
        }
        return promedio/contactos.size();
    }

    //metodo mostrar todos los contactos
    //metodo contactos repetidos (unicamente mismo nombre apellido y num de tel)
    //metodo promedio edad de contactos
    //metodo add los repetidos a la arraylist repetidos.

}
