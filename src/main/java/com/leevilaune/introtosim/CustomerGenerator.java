package com.leevilaune.introtosim;

public class CustomerGenerator {

    private ServicePoint servicePoint;

    public CustomerGenerator(ServicePoint servicePoint){
        this.servicePoint = servicePoint;
    }

    public void generateCustomers(int amount){
        for(int i = 0; i<amount;i++){
            this.servicePoint.addToQueue(new Customer());
        }

    }
}
