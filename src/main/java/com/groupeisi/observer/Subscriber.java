package com.groupeisi.observer;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println("Hello " + name + ", a new video titled '" + videoTitle + "' has been uploaded!");
    }
}
