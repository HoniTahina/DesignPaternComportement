package com.groupeisi;

import com.groupeisi.observer.Subscriber;
import com.groupeisi.observer.YouTubeChannel;
import com.groupeisi.state.DrinkMachine;

public class Main {
    public static void main(String[] args) {
    //  Observer
//        YouTubeChannel channel = new YouTubeChannel();
//
//        Subscriber sub1 = new Subscriber("Alice");
//        Subscriber sub2 = new Subscriber("Bob");
//
//        channel.registerObserver(sub1);
//        channel.registerObserver(sub2);
//
//        channel.uploadVideo("Design Patterns in Java");

    //State
        DrinkMachine machine = new DrinkMachine();

        machine.insertCoin();
        machine.selectDrink();
        machine.dispenseDrink();
    }
}