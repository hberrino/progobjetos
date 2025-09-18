package Fabrica_muebles;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Silla",12, 2500, "roble", "blanco");
        Producto p2 = new Producto("Mesa",70.5, 4325, "roble", "negro");
        Producto p3 = new Producto("Banco",23.1, 3200, "roble", "gris");

        Fabrica f1 = new Fabrica("Mueblesitos");

        f1.agregarProducto(p1);
        f1.agregarProducto(p2);
        p2.setPorcentaje_ganancia(10);
        f1.agregarProducto(p3);

        f1.precioFabricacion_Stock();
        f1.precioVentas_Stock();
        f1.verDisponibles();

    }
}
