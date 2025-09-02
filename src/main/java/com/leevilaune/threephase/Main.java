package com.leevilaune.threephase;

import eduni.distributions.Negexp;

public class Main {

    public static void main(String[] args) {
        /*
        EventList eventList = new EventList();
        for(int i = 0; i<10;i++){
            Event e = new Event(EventType.fromCode((int) (Math.random()*2)));
            eventList.addEvent(e);
        }
        System.out.println("Events by ts:");
        eventList.printEvents();

        System.out.println("\nRemoving first");
        eventList.removeEvent();

        System.out.println("\nEvents by ts:");
        eventList.printEvents();
        */
        long s = System.nanoTime();
        long noNaN = 456639451366375L;
        long causesNan = 456654760181000L;
        for(int i = 0; i<100;i++){
            long nano = System.nanoTime();
            long a = 742938285;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%d * %d = %d\n", nano,a,(nano*a));
        }
        Negexp negexp = new Negexp(10, causesNan);
        for (int i = 0; i<10; i++){
            System.out.println(negexp.sample());
        }
    }
}
