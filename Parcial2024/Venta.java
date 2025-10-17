package Parcial2024;

import java.time.LocalDate;

public class Venta {

    private LocalDate fecha;
    private String codigoProducto;
    private String dniComprador;
    private double montoVenta;
    private int cantVendidos;

    public Venta (LocalDate fecha, String codigoProducto, String dniComprador, double montoVenta, int cantVendidos){
        this.fecha=fecha;
        this.codigoProducto=codigoProducto;
        this.dniComprador=dniComprador;
        this.montoVenta=montoVenta;
        this.cantVendidos=cantVendidos;
    }
    public LocalDate getFecha (){
        return fecha;
    }
    public String getCodigoProducto (){
        return codigoProducto;
    }
    public String getDniComprador(){
        return dniComprador;
    }
    public double getMontoVenta (){
        return montoVenta;
    }
    public int getCantVendidos (){
        return cantVendidos;
    }
    public double gananciaPorVenta (){
        return montoVenta*cantVendidos;
    }



}
