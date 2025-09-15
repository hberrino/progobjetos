package Control_gastos;


public class Ciudad {

    private String nombre;
    private int habitantes;
    private double imp1, imp2, imp3, imp4, imp5;
    private double gasto_mantenimiento;

    public Ciudad (String nombre, int habitantes, double imp1, double imp2, double imp3, double imp4, double imp5, double gasto_mantenimiento){
        this.nombre=nombre;
        this.habitantes=habitantes;
        this.imp1=imp1;
        this.imp2=imp2;
        this.imp3=imp3;
        this.imp4=imp4;
        this.imp5=imp5;
        this.gasto_mantenimiento=gasto_mantenimiento;
    }
    public double getImp1 (){
        return imp1;
    }
    public double getImp2 (){
        return imp2;
    }
    public double getImp3 (){
        return imp3;
    }
    public double getImp4 (){
        return imp4;
    }
    public double getImp5 (){
        return imp5;
    }
    public double getGasto_mantenimiento(){
        return gasto_mantenimiento;
    }
    public String getNombre (){
        return nombre;
    }
    public int getHabitantes (){
        return habitantes;
    }
    public double getTotalImp(){
        return imp1+imp2+imp3+imp4+imp5;
    }
}
