package PruebaObjetosFull;

import java.time.LocalDate;
import java.util.ArrayList;

public class Busqueda {
    private Empresa empresa;

    public Busqueda (Empresa empresa){
        this.empresa=empresa;
    }

    //listado de vendedores que generaron ganancias por menos de 550.000
    public ArrayList<Miembro> vendedoresBajaGanancia (double ganancia){
        ArrayList<Miembro> resultado = new ArrayList<>();
        for (Miembro m : empresa.getMiembros()){
            if(m instanceof Vendedor){
                Vendedor v = (Vendedor) m;
                if(v.gananciaPorProducto()<ganancia){
                    resultado.add(m);
                }
            }
        }
        return resultado;
    }
    //listado que vendieron menos de 150 productos.
    public ArrayList<Miembro> vendedoresBajaVentaProductos (int productos){
        ArrayList<Miembro> resultado = new ArrayList<>();
        for (Miembro m : empresa.getMiembros()){
            if (m instanceof Vendedor){
                Vendedor v = (Vendedor) m;
                if(v.cantidadTotalProductosVendidos()<productos){
                    resultado.add(m);
                }
            }
        }
        return resultado;
    }
    //Si realizaron ventas entre 2024/3/10 y 2024/4/3
    public ArrayList<Miembro> porFecha(LocalDate fecha1, LocalDate fecha2){
        ArrayList<Miembro> resultado = new ArrayList<>();
        for (Miembro m : empresa.getMiembros()) {
            if (m instanceof Vendedor) {
                Vendedor v = (Vendedor) m;
                for (Venta x : v.getVentas()) {
                    if (!x.getFecha().isBefore(fecha1) && !x.getFecha().isAfter(fecha2)) {
                        resultado.add(m);
                    }
                }
            }
        }
        return resultado;
    }
    //ventas por codigo de producto
    public ArrayList<Miembro> ventaPorCodigoP(String codigo){
        ArrayList<Miembro>resultado = new ArrayList<>();
        for (Miembro m : empresa.getMiembros()){
            if(m instanceof Vendedor){
                Vendedor v = (Vendedor) m;
                for (Venta x : v.getVentas()){
                    if(x.getCodigoProducto().contains(codigo)){
                        resultado.add(m);
                    }
                }
            }
        }
        return resultado;
    }
    //Vendedor por codigo de producto y que generaron ganancias menores a 1palo
    public ArrayList<Miembro> ventaPorCodigoP_BajaGanancia (String codigo, double gananciasLimit){
        ArrayList<Miembro> resultado = new ArrayList<>();
        for (Miembro m : empresa.getMiembros()){
            if(m instanceof Vendedor){
                Vendedor v = (Vendedor) m;
                for (Venta x : v.getVentas()){
                    if (x.getCodigoProducto().contains(codigo) && v.gananciaPorProducto()<gananciasLimit){
                        resultado.add(m);
                    }
                }
            }
        }
        return resultado;
    }


}
