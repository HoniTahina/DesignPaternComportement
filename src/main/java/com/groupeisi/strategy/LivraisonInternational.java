package com.groupeisi.strategy;

public class LivraisonInternational implements StrategieLivraison{
    @Override
    public double calculerFrais() {
        return 5000.0;
    }
}
