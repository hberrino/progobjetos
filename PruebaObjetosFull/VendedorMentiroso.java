package PruebaObjetosFull;

public class VendedorMentiroso extends Vendedor {

    public VendedorMentiroso (String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    @Override
    public double gananciaPorProducto() {
        return super.gananciaPorProducto()*2;
    }
}
