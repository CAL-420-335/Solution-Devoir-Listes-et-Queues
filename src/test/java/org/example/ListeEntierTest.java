package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListeEntierTest extends TestCase {

    public void runListTest(List<Integer> l) {
        assertEquals(0, l.size());
        ListeEntier.remplirListe(l);
        assertEquals(100, l.size());

        int nbPair = ListeEntier.nbPair(l);
        assertTrue(nbPair <= l.size());

        ListeEntier.enleveEntierPair(l);
        assertEquals(100 - nbPair, l.size());
    }

    @Test
    public void testLinkedList(){
        runListTest(new LinkedList<Integer>());
    }

    @Test
    public void testArrayList(){
        runListTest(new ArrayList<Integer>());
    }

    /* Pas demande pour le devoir mais devrait etre present dans un vrai codebase */
    @Test
    public void testNbPair(){
        assertEquals(0, ListeEntier.nbPair(List.of()));
        assertEquals(0, ListeEntier.nbPair(List.of(1)));
        assertEquals(0, ListeEntier.nbPair(List.of(1,3,5,7,9)));
        assertEquals(1, ListeEntier.nbPair(List.of(0, 1,3,5,7,9)));
        assertEquals(1, ListeEntier.nbPair(List.of(1,0,3,5,7,9)));
        assertEquals(1, ListeEntier.nbPair(List.of(1,3,5,7,9,0)));
        assertEquals(3, ListeEntier.nbPair(List.of(1,0,3,2,5,4,7,9)));
        assertEquals(5, ListeEntier.nbPair(List.of(8,1,0,3,2,5,4,7,9,100)));

    }
}