package com.groupeisi.state;

public class DrinkMachine {
    private State waitingForCoinState;
    private State selectDrinkState;
    private State dispenseDrinkState;

    private State currentState;

    public DrinkMachine() {
        waitingForCoinState = new WaitingForCoinState(this);
        selectDrinkState = new SelectDrinkState(this);
        dispenseDrinkState = new DispenseDrinkState(this);

        currentState = waitingForCoinState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectDrink() {
        currentState.selectDrink();
    }

    public void dispenseDrink() {
        currentState.dispenseDrink();
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getWaitingForCoinState() {
        return waitingForCoinState;
    }

    public State getSelectDrinkState() {
        return selectDrinkState;
    }

    public State getDispenseDrinkState() {
        return dispenseDrinkState;
    }
}
