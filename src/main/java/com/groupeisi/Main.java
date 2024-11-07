package com.groupeisi;

import com.groupeisi.observer.Subscriber;
import com.groupeisi.observer.YouTubeChannel;
import com.groupeisi.state.DrinkMachine;
import com.groupeisi.strategy.Commande;
import com.groupeisi.strategy.LivraisonExpress;
import com.groupeisi.strategy.LivraisonInternational;
import com.groupeisi.strategy.LivraisonStandard;

public class Main {
    public static void main(String[] args) {
    //  Observer
        YouTubeChannel channel = new YouTubeChannel();

        Subscriber sub1 = new Subscriber("Alice");
        Subscriber sub2 = new Subscriber("Bob");

        channel.registerObserver(sub1);
        channel.registerObserver(sub2);

        channel.uploadVideo("Design Patterns in Java");

    //State
//        DrinkMachine machine = new DrinkMachine();
//
//        machine.insertCoin();
//        machine.selectDrink();
//        machine.dispenseDrink();

    //Strategy
        Commande commande = new Commande();

        // Utiliser la livraison standard
//        commande.setStrategieLivraison(new LivraisonStandard());
//        System.out.println("Frais de livraison standard: " + commande.calculerFraisLivraison());
//
//        // Utiliser la livraison expresse
//        commande.setStrategieLivraison(new LivraisonExpress());
//        System.out.println("Frais de livraison expresse: " + commande.calculerFraisLivraison());
//
//        // Utiliser la livraison internationale
//        commande.setStrategieLivraison(new LivraisonInternational());
//        System.out.println("Frais de livraison international: " + commande.calculerFraisLivraison());

    }

}