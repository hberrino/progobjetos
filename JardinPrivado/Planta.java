package JardinPrivado;

import java.time.LocalDate;

public class Planta {
    public static int idcontador=0;

    private int ID;
    private String nombreCientifico;
    private String nombreComun;
    private String paisOrigen;
    private LocalDate fechaCompra;

    public Planta (String nombreCientifico, String nombreComun, String paisOrigen, LocalDate fechaCompra){
        this.ID=++idcontador;
        this.nombreCientifico=nombreCientifico;
        this.nombreComun=nombreComun;
        this.paisOrigen=paisOrigen;
        this.fechaCompra=fechaCompra;
    }

    public int getID() {
        return ID;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public String toString(){
        return "Nombre Cientifico: "+nombreCientifico+
                " | Nombre Comun: "+nombreComun+
                " | Pais Origen: "+paisOrigen+
                " | Fecha de Compra: "+fechaCompra+
                " | ID: "+ID;
    }
}
