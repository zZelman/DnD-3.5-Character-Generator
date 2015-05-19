package main;

import com.sun.org.apache.bcel.internal.classfile.ClassParser;
import main.components.DnDClass;
import main.components.DnDRace;
import main.parsers.DnDClassParser;
import main.parsers.Parser;
import main.parsers.DnDRaceParser;

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
            dndRace = DnDRaceParser.parse(Parser.ROOT_PATH + Parser.RACE_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void chooseClass() {
        try {
            dndClass = DnDClassParser.parse(Parser.ROOT_PATH + Parser.RACE_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", dndRace=" + dndRace +
                '}';
    }
}
