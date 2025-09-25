package Pila;

public class Main {
    public static void main(String[] args) {
        Pila p1 = new Pila();
        Objeto o1 = new Objeto();
        Objeto o2 = new Objeto();
        Objeto o3 = new Objeto();
        Objeto o4 = new Objeto();

        // Agregamos los objetos a la pila
        p1.push(o1);
        p1.push(o2);
        p1.push(o3);
        p1.push(o4);

        // Consultamos el tope
        System.out.println("Tope de la pila: " + p1.top().getNumero());

        // Sacamos un elemento
        Objeto sacado = p1.pop();
        System.out.println("Elemento sacado: " + sacado.getNumero());

        // Consultamos el nuevo tope
        System.out.println("Nuevo tope: " + p1.top().getNumero());

        // Cantidad de elementos
        System.out.println("Cantidad de elementos en la pila: " + p1.size());

        // Creamos copia
        Pila copia = p1.copy();
        System.out.println("Tope de la copia: " + copia.top().getNumero());

        // Creamos pila invertida
        Pila invertida = p1.reverse();
        System.out.println("Tope de la pila invertida: " + invertida.top().getNumero());
    }
}
