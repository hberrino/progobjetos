package EmpresaAvicola;

import java.time.LocalDate;

public class CongeladoNitrogeno extends Congelado{

    private String metodoCongelacion;
    private int segundosEnNitrogeno;


    public CongeladoNitrogeno (String nombreProducto,String tipoProducto ,LocalDate fechaVto, int numLote, LocalDate fechaEnvasado, String granjaOrigen, int codigoOSA, double tempMantenimiento, String metodoCongelacion, int segundosEnNitrogeno){
        super(nombreProducto,tipoProducto,fechaVto,numLote,fechaEnvasado,granjaOrigen,codigoOSA,tempMantenimiento);
        this.metodoCongelacion=metodoCongelacion;
        this.segundosEnNitrogeno=segundosEnNitrogeno;
    }
    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }
    public int getSegundosEnNitrogeno(){
        return segundosEnNitrogeno;
    }
    public String toString(){
        return super.toString()+
                " | Metodo Congelacion: "+metodoCongelacion+
                " | Segundos en nitrogeno: "+segundosEnNitrogeno;
    }
}
