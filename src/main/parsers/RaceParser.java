package main.parsers;

import main.components.Race;
import org.ini4j.Ini;

import java.io.File;
import java.io.IOException;

public class RaceParser extends Parser {
    public static Race parse(String fileName) throws IOException {
        Ini ini = new Ini(new File(fileName));

        String name = "Dwarf";

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

        Race r = new Race(name,
                dissalowedAlignment,
                dissalowedClasses,
                specials,
                size,
                speed,
                skills,
                stats);

        return r;
    }
}
