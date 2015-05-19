package test;

import main.components.Race;
import main.parsers.Parser;
import main.parsers.RaceParser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class TestRace {

    @Test
    public void testParse() {
        RaceParser rp = new RaceParser();
        Race r = null;
        try {
            r = rp.parse(Parser.ROOT_PATH + Parser.RACE_FILE);
        } catch (IOException e) {
            e.printStackTrace();
            assertTrue("Could not find race file", false);
        }
        System.out.println(r);
    }
}
