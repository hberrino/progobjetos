package EmpresaAvicola;

import java.time.LocalDate;

public class Fresco extends Producto{

    public Fresco (String nombreProducto,String tipoProducto,LocalDate fechaVto, int numLote, LocalDate fechaEnvasado, String granjaOrigen){
        super(nombreProducto,tipoProducto,fechaVto, numLote,fechaEnvasado,granjaOrigen);
    }
    public String toString(){
        return super.toString();
    }


}
