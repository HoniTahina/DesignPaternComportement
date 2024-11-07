package com.groupeisi.strategy;

public class Commande {
    private StrategieLivraison strategieLivraison;

    // Méthode pour définir la stratégie de livraison
    public void setStrategieLivraison(StrategieLivraison strategieLivraison) {
        this.strategieLivraison = strategieLivraison;
    }

    // Méthode pour calculer les frais en fonction de la stratégie choisie
    public double calculerFraisLivraison() {
        return strategieLivraison.calculerFrais();
    }
}
