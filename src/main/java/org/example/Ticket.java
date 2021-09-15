package org.example;

public class Ticket implements Comparable<Ticket> {
    @Override
    public int compareTo(Ticket o) {
        if(priority == o.priority) return 0;

        return o.priority.getWeight() - this.priority.getWeight();
    }

    public enum Priority{
        LOW(0),
        MEDIUM(1),
        HIGH(2);

        private int weight;
        private Priority(int weight) {this.weight = weight;}
        public int getWeight(){return weight;}
    }

    public Ticket(Priority p, String d) {
        this.priority = p;
        this.description = d;
    }

    private static <T> T r(T[] elements){
        int idx = (int)(Math.random() * elements.length);
        return elements[idx];
    }

    public static Ticket randomize() {
        final Priority[] priorities = Priority.values();
        final String[] sujets = {
                "Le quadriporteur central",
                "Le boulanger de service",
                "L'archimage de la viande",
                "Le gérant des caisses",
                "L'ondulateur para-strata",
                "Le gars qui ramasse les paniers",
                "Bob Morane",
                "Le client à la caisse 1",
                "Le client à la caisse 2",
                "Le client à la caisse 3",
                "Le gérant d'estrade",
                "Mike Tyson",
                "Le commis de soir",
                "Le boucher",
                "Le panier bleu",
                "Le beurre d'arachide"
        };

        final String[] problemes = {
                "a rendu l'âme",
                "se bat contre Kali Jones",
                "est disparu",
                "n'a pas sa carte air-miles",
                "est dans la mauvaise rangée",
                "est introuvable",
                "est absent",
                "est hors fonction",
                "pense qu'il travail de jour mais il a un chiffre de soir",
                "fait du ski-nautique",
                "a gagné un voyage de pêche",
                "est terrorisé par la Manicouagan",
                "prêche les mérite de la simplicité volontaire",
                "distribue des tracts communistes",
                "a perdu son violon",
                "a perdu sa perruche",
                "a perdu son porte-clés",
                "a perdo son porte-feuille"
        };

        return new Ticket( r(priorities), r(sujets) + " " + r(problemes) );
    }

    public static void main(String... args) {
        int i = 50;
        while(i-- > 0) {
            System.out.println(Ticket.randomize());
        }
    }

    @Override
    public String toString() {
        return String.format("%s : %s", priority.name(), description);
    }

    public Priority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    private Priority priority;
    private String description;
}
