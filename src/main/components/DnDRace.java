package main.components;

import java.util.Arrays;

public class DnDRace {
    private String name;
    private String[] dissalowedAlignment;
    private String[] dissalowedClass;
    private String[] specials;
    private String size;
    private String speed;
    private String[] skills;
    private String[] stats;

    public DnDRace(String name,
                   String[] dissalowedAlignment,
                   String[] dissalowedClass,
                   String[] specials,
                   String size,
                   String speed,
                   String[] skills,
                   String[] stats) {
        this.name = name;
        this.dissalowedAlignment = dissalowedAlignment;
        this.dissalowedClass = dissalowedClass;
        this.specials = specials;
        this.size = size;
        this.speed = speed;
        this.skills = skills;
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", dissalowedAlignment=" + Arrays.toString(dissalowedAlignment) +
                ", dissalowedClass=" + Arrays.toString(dissalowedClass) +
                ", specials=" + Arrays.toString(specials) +
                ", size='" + size + '\'' +
                ", speed='" + speed + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", stats=" + Arrays.toString(stats) +
                '}';
    }
}
