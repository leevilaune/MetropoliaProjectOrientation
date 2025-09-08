package com.leevilaune.introtosim;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator cg = new CustomerGenerator(servicePoint);

        try {
            for(int i = 0; i<10; i++){
                cg.generateCustomers(10);
                servicePoint.serve();
                System.out.printf("Average serving time after %d rounds of customers: %d\n", i, servicePoint.getAvgServingTime());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    //task 4, not used anywhere rn
    public static void queue() throws InterruptedException {
        Customer c1 = new Customer();
        c1.setStartTime(System.currentTimeMillis());
        Thread.sleep(500);
        c1.setEndTime(System.currentTimeMillis());

        Customer c2 = new Customer();
        c2.setStartTime(System.currentTimeMillis());
        Thread.sleep(300);
        c2.setEndTime(System.currentTimeMillis());

        System.out.println("Customer " + c1.getId() + " spent " + c1.timeSpent() + " ms in the queue.");
        System.out.println("Customer " + c2.getId() + " spent " + c2.timeSpent() + " ms in the queue.");

        System.out.printf("Customer %d spent %.6f seconds%n", c1.getId(), c1.timeSpent() / 1000.);
        System.out.printf("Customer %d spent %.6f seconds%n", c2.getId(), c2.timeSpent() / 1000.);
    }
}