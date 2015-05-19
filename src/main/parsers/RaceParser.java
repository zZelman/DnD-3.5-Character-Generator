package main.parsers;

import main.components.Race;
import org.ini4j.Ini;

import java.io.File;
import java.io.IOException;

public class RaceParser extends Parser {
    public Race parse(String fileName) throws IOException {
        Ini ini = new Ini(new File(fileName));

        String name = "Human";

        String getAlignment = ini.get("Human", "DissalowedAlignment");
        String getClasses = ini.get("Human", "DissalowedClasses");
        String getSpecials = ini.get("Human", "Specials");

        String[] dissalowedAlignment = getAlignment.split(delimiter);
        String[] dissalowedClasses = getClasses.split(delimiter);
        String[] specials = getSpecials.split(delimiter);

        return new Race(name, dissalowedAlignment, dissalowedClasses, specials);
    }
}
