package com.adaptionsoft.games;

import java.util.ArrayList;

public class Players {
    private final ArrayList<Player> players = new ArrayList<>();

    public void add(Player player) {
        players.add(player);
        System.out.println("They are player number " + this.players.size());
    }
}
