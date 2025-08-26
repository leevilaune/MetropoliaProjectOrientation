package com.leevilaune.introtosim;

public class Customer {

    private static int customerCount = 0;
    private int id;
    private long startTime;
    private long endTime;

    public Customer() {
        customerCount++;
        this.id = customerCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long timeSpent() {
        if(this.endTime == 0){
            return System.currentTimeMillis()-this.startTime;
        }
        return endTime - startTime;
    }

}
