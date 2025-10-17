package SistemaBuscador;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Documento> documentos;

    public Sistema (){
        this.documentos=new ArrayList<>();
    }
    public void agregarDoc (Documento d){
        documentos.add(d);
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }
}
