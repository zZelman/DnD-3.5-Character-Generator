package test;

import main.components.DnDRace;
import main.parsers.Parser;
import main.parsers.DnDRaceParser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class TestRace {

    @Test
    public void testParse() {
        DnDRaceParser rp = new DnDRaceParser();
        DnDRace r = null;
        try {
            r = rp.parse(Parser.ROOT_PATH + Parser.RACE_FILE);
        } catch (IOException e) {
            e.printStackTrace();
            assertTrue("Could not find race file", false);
        }
        System.out.println(r);
    }
}
