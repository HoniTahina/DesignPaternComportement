package com.groupeisi.state;

public class SelectDrinkState implements State{
    private DrinkMachine machine;

    public SelectDrinkState(DrinkMachine machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void selectDrink() {
        System.out.println("Drink selected.");
        machine.setState(machine.getDispenseDrinkState());
    }

    @Override
    public void dispenseDrink() {
        System.out.println("Select drink first.");
    }
}
