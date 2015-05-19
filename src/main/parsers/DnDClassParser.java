package main.parsers;

import main.components.DnDClass;
import main.components.DnDRace;
import org.ini4j.Ini;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class DnDClassParser extends Parser {
    public static DnDClass parse(String fileName, DnDRace race) throws IOException {
        Ini ini = openIni(fileName);

        // build a list of race names
        ArrayList<String> classNames = new ArrayList<String>();
        for (String sectionName : ini.keySet()) {
            classNames.add(sectionName);
        }

        // choose random race
        String name = chooseRandomClass(classNames, race);

        // get data from choosen class name
        String getAlignment = ini.get(name, "DissalowedAlignment");
        String getStatorder = ini.get(name, "Statorder");
        String getHitDie = ini.get(name, "hitDie");
        String getBaseAttackBonus = ini.get(name, "baseAttackBonus");
        String getSaves = ini.get(name, "Saves");
        String getSkills = ini.get(name, "Skills");
        String getSpecial = ini.get(name, "Special");
        String getSkillpoints = ini.get(name, "Skillpoints");
        String getSkillpointsLevel = ini.get(name, "SkillpointsLevel");
        String getGold = ini.get(name, "Gold");
        String getSpellsPerDay = ini.get(name, "SpellsPerDay");
        String getSpellsKnown = ini.get(name, "SpellsKnown");
        String getWeaponProficiency = ini.get(name, "WeaponProficiency");
        String getArmorProficiency = ini.get(name, "ArmorProficiency");

        String[] dissalowedAlignment = getAlignment.split(DELIMITER_COMPOUND_VALUE);
        String[] statorder = getStatorder.split(DELIMITER_COMPOUND_VALUE);
        String hitDie = getHitDie;
        String[] baseAttackBonus = getBaseAttackBonus.split(DELIMITER_COMPOUND_VALUE);
        String[] saves = getSaves.split(DELIMITER_COMPOUND_VALUE);
        String[] skills = getSkills.split(DELIMITER_COMPOUND_VALUE);
        String[] special = getSpecial.split(DELIMITER_COMPOUND_VALUE);
        String skillpoints = getSkillpoints;
        String skillpointsLevel = getSkillpointsLevel;
        String gold = getGold;
        String[] spellsPerDay = getSpellsPerDay.split(DELIMITER_COMPOUND_VALUE);
        String[] spellsKnown = getSpellsKnown.split(DELIMITER_COMPOUND_VALUE);
        String[] weaponProficiency = getWeaponProficiency.split(DELIMITER_COMPOUND_VALUE);
        String[] armorProficiency = getArmorProficiency.split(DELIMITER_COMPOUND_VALUE);

        DnDClass c = new DnDClass(name,
                dissalowedAlignment,
                statorder,
                hitDie,
                baseAttackBonus,
                saves,
                skills,
                special,
                skillpoints,
                skillpointsLevel,
                gold,
                spellsPerDay,
                spellsKnown,
                weaponProficiency,
                armorProficiency);

        return c;
    }

    private static String chooseRandomClass(ArrayList<String> classNames, DnDRace race) {
        int low = 0;
        int high = classNames.size();

        Random r = new Random();
        int choice = r.nextInt(high - low) + low;

        return classNames.get(choice);
    }
}
