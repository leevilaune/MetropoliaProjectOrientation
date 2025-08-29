package com.leevilaune.threephase;

public class Main {

    public static void main(String[] args) {
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
    }
}
