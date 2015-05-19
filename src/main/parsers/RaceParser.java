package main.parsers;

import main.components.DnDRace;
import org.ini4j.Ini;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RaceParser extends Parser {
    public static DnDRace parse(String fileName) throws IOException {
        Ini ini = new Ini(new File(fileName));

        // build a list of race names
        ArrayList<String> raceNames = new ArrayList<String>();
        for (String sectionName : ini.keySet()) {
            raceNames.add(sectionName);
        }

        // choose random race
        String name = chooseRandomRace(raceNames);

        // get data from choosen race name
        String getAlignment = ini.get(name, "DissalowedAlignment");
        String getClasses = ini.get(name, "DissalowedClasses");
        String getSpecials = ini.get(name, "Specials");
        String getSize = ini.get(name, "Size");
        String getSpeed = ini.get(name, "Speed");
        String getSkills = ini.get(name, "Skills");
        String getStats = ini.get(name, "Stats");

        String[] dissalowedAlignment = getAlignment.split(DELIMITER_COMPOUND_VALUE);
        String[] dissalowedClasses = getClasses.split(DELIMITER_COMPOUND_VALUE);
        String[] specials = getSpecials.split(DELIMITER_COMPOUND_VALUE);
        String size = getSize;
        String speed = getSpeed;
        String[] skills = getSkills.split(DELIMITER_COMPOUND_VALUE);
        String[] stats = getStats.split(DELIMITER_COMPOUND_VALUE);

        // construct race object
        DnDRace r = new DnDRace(name,
                dissalowedAlignment,
                dissalowedClasses,
                specials,
                size,
                speed,
                skills,
                stats);

        return r;
    }

    private static String chooseRandomRace(ArrayList<String> raceNames) {
        int low = 0;
        int high = raceNames.size();

        Random r = new Random();
        int chooice = r.nextInt(high - low) + low;

        return raceNames.get(chooice);
    }
}
