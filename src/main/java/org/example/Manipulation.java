package org.example;

import java.util.List;
import java.util.Iterator;

public class Manipulation {
    private Manipulation(){}

    public static void Question1(List<Ticket> l){
        for(Iterator<Ticket> it = l.iterator() ; ; it.hasNext()) {
            if(it.next().getPriority() == Ticket.Priority.LOW)
                it.remove();
        }
    }

    public static void Question2(List<Ticket> l){
        for(Iterator<Ticket> it = l.iterator() ; ; it.hasNext()) {
            if(it.next().getPriority() == Ticket.Priority.LOW)
                it.remove();
        }
    }
}
