package com.groupeisi.strategy;

public class LivraisonStandard implements StrategieLivraison{
    @Override
    public double calculerFrais() {
        return 1000.0;
    }
}
