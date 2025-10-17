package AgroquimicosTP7;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Quimico> listaDeQuimicos;
    private ArrayList<Cultivo> listaDeCultivos;

    public Sistema () {
        this.listaDeQuimicos=new ArrayList<>();
        this.listaDeCultivos=new ArrayList<>();
    }
    public void agregarQuimico (Quimico q){
        listaDeQuimicos.add(q);
    }
    public void agregarCultivo (Cultivo c){
        listaDeCultivos.add(c);
    }
    public ArrayList<Quimico> quimicosQueCuranEnfermedad(Enfermedad e) {
        ArrayList<Quimico> resultado = new ArrayList<>();
        for (Quimico q : listaDeQuimicos) {
            // Pasamos null como cultivo porque solo nos interesa la enfermedad
            if (q.lograCurar(null, e)) {
                resultado.add(q);
            }
        }
        return resultado;
    }

    // Devuelve los químicos que pueden tratar una enfermedad en un cultivo específico
    public ArrayList<Quimico> quimicosQueCuran(Cultivo c, Enfermedad e) {
        ArrayList<Quimico> resultado = new ArrayList<>();
        for (Quimico q : listaDeQuimicos) {
            if (q.lograCurar(c, e)) {
                resultado.add(q);
            }
        }
        return resultado;
    }

}
