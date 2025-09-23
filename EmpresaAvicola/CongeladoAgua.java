package EmpresaAvicola;

import java.time.LocalDate;

public class CongeladoAgua extends Congelado{

    private double grSal;
    private double litroAgua;

    public CongeladoAgua (String nombreProducto,String tipoProducto, LocalDate fechaVto, int numLote, LocalDate fechaEnvasado, String granjaOrigen, int codigoOSA, double tempMantenimiento, double grSal, double litroAgua){
        super(nombreProducto,tipoProducto,fechaVto,numLote,fechaEnvasado,granjaOrigen,codigoOSA,tempMantenimiento);
        this.grSal=grSal;
        this.litroAgua=litroAgua;
    }
    public double getSalinidad (double grSal, double litroAgua){
        return grSal*litroAgua;
    }
    public String toString(){
        return super.toString()+
                " | Gramos de sal: "+grSal+
                " | Litros de agua: "+litroAgua+
                " | Salinidad: "+getSalinidad(grSal, litroAgua);
    }

}
