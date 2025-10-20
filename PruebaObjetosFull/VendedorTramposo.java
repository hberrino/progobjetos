package PruebaObjetosFull;

public class VendedorTramposo extends Vendedor{

    public VendedorTramposo (String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    @Override
    public double gananciaPorProducto() {
        if (Math.random() < 0.5){
            return super.gananciaPorProducto()*3;
        }else {
            return super.gananciaPorProducto()*4;
        }
    }
}
