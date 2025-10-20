package PruebaObjetosFull;

public class EquipoPeterPan extends Equipo{

    public EquipoPeterPan (String nombre){
        super(nombre);
    }
    @Override
    public double edadRank() {
        int edadMenor=0;
        boolean primero=true;
        for (Miembro m : getMiembro()){
            if(m instanceof Vendedor){
                Vendedor v = (Vendedor) m;
                if (primero){
                    edadMenor=v.getEdad();
                    primero=false;
                }else if (v.getEdad()<edadMenor){
                    edadMenor=v.getEdad();
                }
            }
        }
        return edadMenor;
    }
}
