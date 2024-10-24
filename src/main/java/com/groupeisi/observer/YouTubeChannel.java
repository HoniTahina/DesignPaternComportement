package com.groupeisi.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    private List<Observer> subscribers = new ArrayList<>();
    private String videoTitle;

    public void uploadVideo(String videoTitle) {
        this.videoTitle = videoTitle;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(videoTitle);
        }
    }
}
