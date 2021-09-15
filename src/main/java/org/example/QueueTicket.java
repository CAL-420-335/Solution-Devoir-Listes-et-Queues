package org.example;

import java.util.*;

public class QueueTicket {

    public static void Question1(){
        Queue<Ticket> tq = new LinkedList<>();
        for(int nb = 0; nb < 100; nb++) {
            tq.add(Ticket.randomize());
        }

        while(!tq.isEmpty()) System.out.println(tq.poll().toString());
    }

    public static void Question2(){
        Deque<Ticket> tq = new LinkedList<>();
        for(int nb = 0; nb < 100; nb++) {
            tq.addFirst(Ticket.randomize());
        }

        while(!tq.isEmpty()) System.out.println(tq.pollFirst().toString());
    }

    public static void Question3(){
        PriorityQueue<Ticket> tq = new PriorityQueue<>(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o2.getPriority().compareTo(o1.getPriority());
            }
        });

        for(int nb = 0; nb < 100; nb++) {
            tq.add(Ticket.randomize());
        }

        while(!tq.isEmpty()) System.out.println(tq.poll().toString());
    }

    public static void main(String... args) {
        Question3();
    }
}
