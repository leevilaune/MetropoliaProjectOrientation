package com.leevilaune.probability;

public class Clock {
    private static Clock instance;
    private long time;

    private Clock() {
        this.time = 0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long newTime) {
        this.time = newTime;
    }

    public void tick(long step) {
        this.time += step;
    }

    public static void main(String[] args){
        System.out.println("Clock.getInstance().getTime(): "+Clock.getInstance().getTime());
        System.out.println("Progressing 2 ticks");
        Clock.getInstance().tick(2);
        System.out.println("Clock.getInstance().getTime(): "+Clock.getInstance().getTime());
        System.out.println();
    }
}