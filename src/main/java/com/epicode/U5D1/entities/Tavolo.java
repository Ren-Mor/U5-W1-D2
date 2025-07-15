package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.StatoTavolo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {

    private int numero;
    private int numeroMaxCoperti;
    private StatoTavolo stato;

    public Tavolo(int numero, int numeroMaxCoperti, StatoTavolo stato) {
        this.numero = numero;
        this.numeroMaxCoperti = numeroMaxCoperti;
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", numeroMaxCoperti=" + numeroMaxCoperti +
                ", stato=" + stato +
                '}';
    }
}
