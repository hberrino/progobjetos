package EmpresaAvicola;

import java.time.LocalDate;

public class Congelado extends Refrigerado{
    public Congelado (String nombreProducto,String tipoProducto, LocalDate fechaVto, int numLote, LocalDate fechaEnvasado, String granjaOrigen, int codigoOSA, double tempMantenimiento){
        super(nombreProducto,tipoProducto,fechaVto,numLote,fechaEnvasado,granjaOrigen,codigoOSA,tempMantenimiento);
    }
    public String toString(){
        return super.toString();
    }
}
