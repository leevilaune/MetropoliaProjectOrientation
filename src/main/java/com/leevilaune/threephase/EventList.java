package com.leevilaune.threephase;

import java.util.PriorityQueue;

public class EventList {

    private PriorityQueue<Event> events;

    public EventList(){
        this.events = new PriorityQueue<>();
    }

    public void addEvent(Event e){
        this.events.add(e);
    }

    public void removeEvent(){
        this.events.remove();
    }

    public void printEvents(){
        this.events.stream().sorted().forEach(System.out::println);
    }

    public Event getLast(){
        return this.events.stream().sorted().toList().get(events.size()-1);
    }

    public PriorityQueue<Event> getEvents() {
        return events;
    }
}
