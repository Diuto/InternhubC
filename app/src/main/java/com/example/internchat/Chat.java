package com.example.internchat;

public class Chat {
    private String name;
    private long time;
    private String message;


    public Chat(String name, long time, String message) {
        this.name = name;
        this.time = time;
        this.message = message;
    }

    public Chat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

