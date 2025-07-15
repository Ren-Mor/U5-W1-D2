package com.epicode.U5D1.entities;

import com.epicode.U5D1.enums.StatoOrdine;
import com.epicode.U5D1.enums.StatoTavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class RunnerOrdine implements CommandLineRunner {

    private final Menu menu;

    @Value("${costo.coperto}")
    private double costoCoperto;

    public RunnerOrdine(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void run(String... args) throws Exception {
        // Creo un tavolo
        Tavolo tavolo = new Tavolo(1, 4, StatoTavolo.OCCUPATO);

        // Prendo la prima pizza e la prima bevanda dal menu
        List<Item> elementiOrdine = new ArrayList<>();
        elementiOrdine.add(menu.getPizzaList().get(0));  // Supponiamo sia Pizza Margherita
        elementiOrdine.add(menu.getDrinkList().get(0));  // Supponiamo sia Lemonade

        // Creo l'ordine
        Ordine ordine = new Ordine(
                1,                      // numero ordine
                StatoOrdine.IN_CORSO,   // stato ordine
                2,                      // numero coperti
                LocalDateTime.now(),     // ora acquisizione
                elementiOrdine,         // elementi dell’ordine
                tavolo,                 // tavolo associato
                costoCoperto            // costo coperto preso da properties
        );

        // Stampo i dettagli dell’ordine
        System.out.println("Ordine creato: " + ordine);
        System.out.println("Importo totale ordine: €" + ordine.calcolaImportoTotale());
    }
}
