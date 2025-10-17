package SistemaDeAlquiler;

import java.time.LocalDate;

public class Alquiler {

    private Cliente cliente;
    private AlquilerItem item;
    private LocalDate fechaDevolucion;

    public Alquiler (Cliente c, AlquilerItem i, LocalDate fechaDevolucion){
        this.cliente=cliente;
        this.item=item;
        this.fechaDevolucion=fechaDevolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public AlquilerItem getItem() {
        return item;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    public boolean vencioFecha (){
        return LocalDate.now().isAfter(fechaDevolucion);
    }
}
