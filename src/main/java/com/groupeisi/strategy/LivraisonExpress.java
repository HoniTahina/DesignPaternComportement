package com.groupeisi.strategy;

public class LivraisonExpress implements StrategieLivraison{
    @Override
    public double calculerFrais() {
        return 3000.0;
    }
}
