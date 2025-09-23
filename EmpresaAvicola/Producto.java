package EmpresaAvicola;

import java.time.LocalDate;

public class Producto {
    private String nombreProducto;
    private String tipoProducto;
    private LocalDate fechaVto;
    private int numLote;
    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    public Producto (String nombreProducto, String tipoProducto, LocalDate fechaVto, int numLote, LocalDate fechaEnvasado, String granjaOrigen){
        this.nombreProducto=nombreProducto;
        this.tipoProducto=tipoProducto;
        this.fechaVto=fechaVto;
        this.numLote=numLote;
        this.fechaEnvasado=fechaEnvasado;
        this.granjaOrigen=granjaOrigen;
    }
    public LocalDate getFechaVto (){
        return fechaVto;
    }
    public int getNumLote (){
        return numLote;
    }
    public LocalDate getFechaEnvasado (){
        return fechaEnvasado;
    }
    public String getGranjaOrigen (){
        return granjaOrigen;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public String getTipoProducto() {
        return tipoProducto;
    }
    public String toString(){
        return "Producto: "+nombreProducto+
                " | Tipo: "+tipoProducto+
                " | Vencimiento: "+fechaVto+
                " | Lote: "+numLote+
                " | Envasado: "+fechaEnvasado+
                " | Granja: "+granjaOrigen;
    }
}
