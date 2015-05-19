package main.components;

import java.util.Arrays;

public class DnDClass {
    private String name;
    private String[] dissalowedAlignment;
    private String[] statorder;
    private String hitDie;
    private String[] baseAttackBonus;
    private String[] saves;
    private String[] skills;
    private String[] special;
    private String skillpoints;
    private String skillpointsLevel;
    private String gold;
    private String[] spellsPerDay;
    private String[] spellsKnown;
    private String[] weaponProficiency;
    private String[] armorProficiency;

    public DnDClass(String name,
                    String[] dissalowedAlignment,
                    String[] statorder,
                    String hitDie,
                    String[] baseAttackBonus,
                    String[] saves,
                    String[] skills,
                    String[] special,
                    String skillpoints,
                    String skillpointsLevel,
                    String gold,
                    String[] spellsPerDay,
                    String[] spellsKnown,
                    String[] weaponProficiency,
                    String[] armorProficiency) {
        this.name = name;
        this.dissalowedAlignment = dissalowedAlignment;
        this.statorder = statorder;
        this.hitDie = hitDie;
        this.baseAttackBonus = baseAttackBonus;
        this.saves = saves;
        this.skills = skills;
        this.special = special;
        this.skillpoints = skillpoints;
        this.skillpointsLevel = skillpointsLevel;
        this.gold = gold;
        this.spellsPerDay = spellsPerDay;
        this.spellsKnown = spellsKnown;
        this.weaponProficiency = weaponProficiency;
        this.armorProficiency = armorProficiency;
    }

    @Override
    public String toString() {
        return "DnDClass{" +
                "name='" + name + '\'' +
                ", dissalowedAlignment=" + Arrays.toString(dissalowedAlignment) +
                ", statorder=" + Arrays.toString(statorder) +
                ", hitDie='" + hitDie + '\'' +
                ", baseAttackBonus=" + Arrays.toString(baseAttackBonus) +
                ", saves=" + Arrays.toString(saves) +
                ", skills=" + Arrays.toString(skills) +
                ", special=" + Arrays.toString(special) +
                ", skillpoints='" + skillpoints + '\'' +
                ", skillpointsLevel='" + skillpointsLevel + '\'' +
                ", gold='" + gold + '\'' +
                ", spellsPerDay=" + Arrays.toString(spellsPerDay) +
                ", spellsKnown=" + Arrays.toString(spellsKnown) +
                ", weaponProficiency=" + Arrays.toString(weaponProficiency) +
                ", armorProficiency=" + Arrays.toString(armorProficiency) +
                '}';
    }
}
