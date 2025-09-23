package EmpresaAvicola;

import java.util.ArrayList;

public class Avicola {
    private String nombreEmpresa;
    private ArrayList<Producto> productos;

    public Avicola (String nombreEmpresa){
        this.nombreEmpresa=nombreEmpresa;
        this.productos=new ArrayList<>();
    }
    public void agregarProducto (Producto p){
        productos.add(p);
    }
    public void mostrarProducto (){
        for (Producto p : productos){
            System.out.println(p);
        }
    }
}
