package PuertoCereal;

import java.time.LocalDate;

public class Camion extends PrioridadTransporte{

    private LocalDate fechaDeCarga;

    public Camion (LocalDate fechaDeCarga){
        this.fechaDeCarga=fechaDeCarga;
    }

    @Override
    public LocalDate getPrioridad() {
        return fechaDeCarga;
    }
}
