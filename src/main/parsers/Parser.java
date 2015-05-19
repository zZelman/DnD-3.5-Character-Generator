package main.parsers;

import org.ini4j.Ini;

import java.io.File;
import java.io.IOException;

public class Parser {
    public static final String DELIMITER_COMPOUND_VALUE = ",";
    public static final String DELIMITER_STATS = " ";

    public static final String ROOT_PATH = "res/";

    public static final String RACE_FILE = "Races.ini";
    public static final String CLASS_FILE = "Classes.ini";

    public static Ini openIni(String fileName) throws IOException {
        return new Ini(new File(fileName));
    }
}
