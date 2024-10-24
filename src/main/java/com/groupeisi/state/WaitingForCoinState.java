package com.groupeisi.state;

public class WaitingForCoinState implements State{
    private DrinkMachine machine;

    public WaitingForCoinState(DrinkMachine machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        machine.setState(machine.getSelectDrinkState());
    }

    @Override
    public void selectDrink() {
        System.out.println("Insert coin first.");
    }

    @Override
    public void dispenseDrink() {
        System.out.println("Insert coin first.");
    }
}
