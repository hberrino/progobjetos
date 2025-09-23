package EmpresaAvicola;

import java.time.LocalDate;

public class Refrigerado extends Producto{
     private int codigoOSA;
     private double tempMantenimiento;

     public Refrigerado (String nombreProducto,String tipoProducto, LocalDate fechaVto, int numLote, LocalDate fechaEnvasado, String granjaOrigen, int codigoOSA, double tempMantenimiento){
         super(nombreProducto,tipoProducto,fechaVto,numLote,fechaEnvasado,granjaOrigen);
         this.codigoOSA=codigoOSA;
         this.tempMantenimiento=tempMantenimiento;
     }
    public int getCodigoOSA() {
        return codigoOSA;
    }
    public double getTempMantenimiento (){
         return tempMantenimiento;
    }
    public String toString(){
        return super.toString()+
                " | Codigo O.S.A: "+codigoOSA+
                " | Temperatura a mantener: "+tempMantenimiento;
    }
}
