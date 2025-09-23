package EmpresaAvicola;

import java.time.LocalDate;

public class CongeladoAire extends Congelado{
    private String composicionAire;

    public CongeladoAire (String nombreProducto,String tipoProducto, LocalDate fechaVto, int numLote, LocalDate fechaEnvasado, String granjaOrigen, int codigoOSA, double tempMantenimiento, String composicionAire){
        super(nombreProducto,tipoProducto,fechaVto,numLote,fechaEnvasado,granjaOrigen,codigoOSA,tempMantenimiento);
        this.composicionAire=composicionAire;
    }
    public void setComposicionAire(String composicionAire) {
        this.composicionAire = composicionAire;
    }
    public String getComposicionAire(){
        return composicionAire;
    }
    public String toString(){
        return super.toString()+
                " | Composicion del aire: "+composicionAire;
    }
}
