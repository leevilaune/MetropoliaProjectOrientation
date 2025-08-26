package com.leevilaune.introtosim;

import java.util.LinkedList;
import java.util.List;

public class ServicePoint {

    private LinkedList<Customer> queue;
    private long avgServingTime;

    public ServicePoint(){
        this.queue = new LinkedList<>();
    }

    public List<Customer> getQueue() {
        return queue;
    }

    public void setQueue(LinkedList<Customer> queue) {
        this.queue = queue;
    }

    public void addToQueue(Customer customer){
        customer.setStartTime(System.currentTimeMillis());
        this.queue.addFirst(customer);
    }

    public void removeFromQueue(Customer customer){
        customer.setEndTime(System.currentTimeMillis());
        this.queue.removeLast();
    }

    public long getAvgServingTime() {
        return avgServingTime;
    }

    public void setAvgServingTime(long avgServingTime) {
        this.avgServingTime = avgServingTime;
    }

    public void serve() throws InterruptedException {
        long totalServiceTime = 0;
        int served = 0;
        while(!this.queue.isEmpty()){
            Customer customer = this.queue.getLast();
            System.out.println("Serving customer " + customer.getId());
            long serviceTime = (long) (Math.random()*5000);
            totalServiceTime += serviceTime;
            Thread.sleep(serviceTime);
            removeFromQueue(customer);
            System.out.println("Customer " + customer.getId() + " served. Time spent: " + customer.timeSpent() + " ms");
            served++;
        }
        if(served == 0){
            return;
        }
        //takes the average of old and new average
        if(this.avgServingTime > 0){
            this.avgServingTime = (this.avgServingTime+(totalServiceTime/served))/2;

        }else{
            this.avgServingTime = totalServiceTime/served;
        }
    }
}
