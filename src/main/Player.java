package main;

import main.components.Race;

public class Player {
    // things that make up this player
    int level;
    Race race;

    public Player(int level) {
        this.level = level;

        this.chooseRace();
    }

    private void chooseRace() {
        race = new Race();
    }
}
