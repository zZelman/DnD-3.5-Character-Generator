package main;

import main.components.Race;

public class Player {
    // things that make up this player
    private int level;
    private Race race;

    public Player(int level) {
        this.level = level;

        this.chooseRace();
    }

    private void chooseRace() {
//        race = new Race();
    }

    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", race=" + race +
                '}';
    }
}
