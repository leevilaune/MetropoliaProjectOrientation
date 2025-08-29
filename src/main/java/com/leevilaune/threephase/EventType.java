package com.leevilaune.threephase;

public enum EventType {
    ARRIVAL(0),
    EXIT(1);

    private final int code;

    EventType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static EventType fromCode(int code) {
        for (EventType e : EventType.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}