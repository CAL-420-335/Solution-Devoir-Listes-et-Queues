package org.example;

import java.util.Iterator;
import java.util.List;

public class ListeEntier {
    private ListeEntier(){}

    public static void remplirListe(List<Integer> list) {
        for(int i = 0; i < 100; i++) {
            list.add(
                    (int)(Math.random() * 16000 + 1)
            );
        }
    }

    public static int nbPair(List<Integer> list) {
        int compteur = 0;
        for(Integer i : list) {
            if(i % 2 == 0) compteur++;
        }

        return compteur;
    }

    public static void enleveEntierPair(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            if(it.next() % 2 == 0) it.remove();
        }
    }

}
