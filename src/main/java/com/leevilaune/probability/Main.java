package com.leevilaune.probability;

import com.leevilaune.introtosim.Customer;
import com.leevilaune.introtosim.ServicePoint;
import com.leevilaune.threephase.Event;
import com.leevilaune.threephase.EventList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrivalProcess ap = new ArrivalProcess();
        EventList el = new EventList();
        ServicePoint sp = new ServicePoint();
        for(int i = 0; i<10;i++){
            ap.generateNew(el);
        }
        el.printEvents();
        System.out.println("Last event is at: "+ el.getLast().getTs());

        for (Event e :el.getEvents()){
            sp.addToQueue(new Customer(e.getTs()));
        }
        Clock.getInstance().tick(5);

        for(int i = 0; i<sp.getQueue().size();i++){
            sp.serve();
        }

    }
}
