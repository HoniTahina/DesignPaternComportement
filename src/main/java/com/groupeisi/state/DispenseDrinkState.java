package com.groupeisi.state;

public class DispenseDrinkState implements State{
    private DrinkMachine machine;

    public DispenseDrinkState(DrinkMachine machine) {
        this.machine = machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Wait, dispensing drink.");
    }

    @Override
    public void selectDrink() {
        System.out.println("Wait, dispensing drink.");
    }

    @Override
    public void dispenseDrink() {
        System.out.println("Dispensing drink. Thank you!");
        machine.setState(machine.getWaitingForCoinState());
    }
}
