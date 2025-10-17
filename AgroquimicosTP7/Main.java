package AgroquimicosTP7;

public class Main {
    public static void main(String[] args) {

        Enfermedad e1 = new Enfermedad("Chinchilla");
        Patologia p1 = new Patologia("Hojas amarillas");
        Patologia p2 = new Patologia("Raiz seca");
        Cultivo c1 = new Cultivo("Maiz");
        Cultivo c2 = new Cultivo("Granola");
        Quimico q1 = new Quimico("Lavandina");

        //Enfermedad chinchilla tiene esas 2 patologias
        e1.agregarPatologias(p1);
        e1.agregarPatologias(p2);

        //quimico registrado
        q1.agregarCultivos(c1); //c1 es un cultivo q no se le recomienda ese quimico. c2 no tiene problema.
        q1.agregarPatologias(p1);
        q1.agregarPatologias(p2);//tiene estas dos patologias q cura.

        //al cultivo c2, le doy la enfermedad e1. A granola le doy Chinchilla.
        //procede a tener p1 y p2 tambien como patologia.
        c2.agregarEnfermedades(e1);
        Sistema sistema = new Sistema();

        //registrar en sistema
        sistema.agregarQuimico(q1);
        sistema.agregarCultivo(c1);
        sistema.agregarCultivo(c2);

        System.out.println("Químicos que curan la enfermedad " + e1.getNombre() + ":");
        for (Quimico q : sistema.quimicosQueCuranEnfermedad(e1)) {
            System.out.println("- " + q.getNombre());
        }

        System.out.println("\nQuímicos que curan la enfermedad " + e1.getNombre() + " en el cultivo " + c2.getNombre() + ":");
        for (Quimico q : sistema.quimicosQueCuran(c2, e1)) {
            System.out.println("- " + q.getNombre());
        }




    }
}
