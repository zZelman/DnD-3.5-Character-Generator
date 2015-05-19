package main;

import main.components.Race;
import main.parsers.Parser;
import main.parsers.RaceParser;

import java.io.IOException;

public class Player {
    // things that make up this player
    private int level;
    private Race race;

    public Player(int level) {
        this.level = level;

        this.chooseRace();
    }

    private void chooseRace() {
        try {
            race = RaceParser.parse(Parser.ROOT_PATH + Parser.RACE_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", race=" + race +
                '}';
    }
}
