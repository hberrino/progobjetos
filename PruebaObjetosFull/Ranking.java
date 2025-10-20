package PruebaObjetosFull;

import java.util.ArrayList;

public class Ranking {

    //por equipo e individual
    //segun ganancias totales x ventas
    private Empresa empresa;
    public Ranking (Empresa empresa){
        this.empresa=empresa;
    }
    //ranking ganancias
    public ArrayList<Miembro> rankingPorGanancias() {
        ArrayList<Miembro> resultado = new ArrayList<>(empresa.getMiembros());
        int n = resultado.size();
        Miembro temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (resultado.get(j).gananciaPorProducto() < resultado.get(j + 1).gananciaPorProducto()) {
                    // intercambio
                    temp = resultado.get(j);
                    resultado.set(j, resultado.get(j + 1));
                    resultado.set(j + 1, temp);
                }
            }
        }
        return resultado;
    }
    //total ventas
    public ArrayList<Miembro> rankingCantidadVentas (){
        ArrayList<Miembro> resultado = new ArrayList<>(empresa.getMiembros());
        Miembro temp;
        int n = resultado.size();
        for (int i =0; i<n-1; i++){
            for (int j=0; j<n-i-1;j++){
                if(resultado.get(j).cantidadTotalVentas() < resultado.get(j+1).cantidadTotalVentas()){
                    temp=resultado.get(j);
                    resultado.set(j, resultado.get(j+1));
                    resultado.set(j+1, temp);
                }
            }
        }
        return resultado;
    }
    //ranking por edad
    public ArrayList<Miembro> rankingPorEdad (){
        ArrayList<Miembro> resultado = new ArrayList<>(empresa.getMiembros());
        Miembro temp;
        int n = resultado.size();
        for (int i=0; i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(resultado.get(j).edadRank()<resultado.get(j+1).edadRank()){
                    temp=resultado.get(j);
                    resultado.set(j, resultado.get(j+1));
                    resultado.set(j+1, temp);
                }
            }
        }
        return resultado;
    }


}
