package com.adaptionsoft.games;

public class Player {

    private final String name;
    private int goldCoins = 0;

    public Player(String playerName) {
        this.name = playerName;
    }

    public String getName() {
        return name;
    }

    public void increaseGoldCoin() {
        goldCoins += 1;
    }
}
