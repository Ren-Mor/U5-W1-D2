package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private List<Item> elementi;
    private Tavolo tavolo;
    private double costoCoperto;

    public Ordine(int numeroOrdine, StatoOrdine stato, int numeroCoperti,
                  LocalDateTime oraAcquisizione, List<Item> elementi, Tavolo tavolo, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.elementi = elementi;
        this.tavolo = tavolo;
        this.costoCoperto = costoCoperto;
    }

    public double calcolaImportoTotale() {
        double totale = 0.0;
        if (elementi != null) {
            for (Item item : elementi) {
                totale += item.getPrice();
            }
        }
        totale += costoCoperto * numeroCoperti;
        return totale;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numeroOrdine=" + numeroOrdine +
                ", stato=" + stato +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", elementi=" + elementi +
                ", tavolo=" + tavolo +
                ", costoCoperto=" + costoCoperto +
                ", importoTotale=" + calcolaImportoTotale() +
                '}';
    }
}
