package Parcial2024;

import java.util.ArrayList;

public class Ranking {

    //por equipo e individual
    //segun ganancias totales x ventas
    private Empresa empresa;

    public ArrayList<Miembro> rankingPorVentas() {
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

}
