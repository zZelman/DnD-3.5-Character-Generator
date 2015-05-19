package main;

import main.components.DnDClass;
import main.components.DnDRace;
import main.parsers.Parser;
import main.parsers.RaceParser;

import java.io.IOException;

public class Player {
    // things that make up this player
    private int level;
    private DnDRace dndRace;
    private DnDClass dndClass;

    public Player(int level) {
        this.level = level;

        this.chooseRace();
        this.chooseClass();
    }

    private void chooseRace() {
        try {
            dndRace = RaceParser.parse(Parser.ROOT_PATH + Parser.RACE_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void chooseClass() {

    }

    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", dndRace=" + dndRace +
                '}';
    }
}
