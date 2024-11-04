package com.pluralsight.finance;

import java.awt.*;
import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> assets = new ArrayList<>();


    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
    public void add(Valuable asset) {
        assets.add(asset);
    }
    public double getValue() {
        double totalValue = 0;
        for (Valuable asset : assets) {
            totalValue += asset.getValue();
        }
        return totalValue;
    }
    public Valuable getMostValuable() {
        if (assets.isEmpty())
        return null;

        Valuable mostValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() > mostValuable.getValue()) {
                mostValuable = asset;
            }
        }
        return mostValuable;
    }
    public Valuable getLeastValuable() {
        if (assets.isEmpty())
            return null;

        Valuable leastValuable = assets.get(0);
        for (Valuable asset : assets) {
            if (asset.getValue() < leastValuable.getValue()) {
                leastValuable = asset;
            }
        }
        return leastValuable;
    }
}
