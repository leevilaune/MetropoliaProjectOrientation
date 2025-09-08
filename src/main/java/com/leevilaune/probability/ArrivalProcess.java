package com.leevilaune.probability;

import com.leevilaune.threephase.Event;
import com.leevilaune.threephase.EventList;
import com.leevilaune.threephase.EventType;
import eduni.distributions.Normal;


public class ArrivalProcess {

    private Normal dist;
    private EventType eventType;
    private long currentTime;

    public ArrivalProcess(){
        this.dist = new Normal(100,1000,69);
        this.eventType = EventType.ARRIVAL;
        this.currentTime = 0;
    }

    public void generateNew(EventList list){
        //System.out.println(timeAdded);
        this.currentTime += (long)dist.sample();
        list.addEvent(new Event(this.eventType,this.currentTime));
    }

    public Normal getDist() {
        return dist;
    }

    public void setDist(Normal dist) {
        this.dist = dist;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "ArrivalProcess{" +
                "dist=" + dist +
                ", eventType=" + eventType +
                '}';
    }

    public static void main(String[] args) {
        ArrivalProcess ap = new ArrivalProcess();
        System.out.println(Clock.getInstance().getTime());
        EventList el = new EventList();
        for(int i = 0; i<10;i++){
            ap.generateNew(el);
        }
        System.out.println(Clock.getInstance().getTime());

        el.printEvents();
    }
}
