package AgroquimicosTP7;

public class Patologia {
    private String sintoma;

    public Patologia (String sintoma){
        this.sintoma=sintoma;
    }
    public String getSintoma (){
        return sintoma;
    }



    public boolean equals(Object o) {
        if (this == o) return true;
        Patologia p = (Patologia) o;                   // casteo seguro
        return this.sintoma.equals(p.sintoma);         // compara contenido
    }

}
