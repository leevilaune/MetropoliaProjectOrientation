package com.leevilaune.threephase;

public class Event implements Comparable<Event> {

    private long ts;
    private EventType type;

    public Event(EventType type){
        this.type = type;
        this.ts = (long) (Math.random()*100);
    }

    public Event(EventType type,long ts){
        this.type = type;
        this.ts = ts;
    }


    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public int compareTo(Event o) {
        return (int) (this.ts-o.getTs());
    }

    @Override
    public String toString() {
        return "Event{" +
                "ts=" + ts +
                ", type=" + type +
                '}';
    }
}
