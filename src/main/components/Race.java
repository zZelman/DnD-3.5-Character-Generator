package main.components;

import java.util.Arrays;

public class Race {
    private String name;
    private String[] dissalowedAlignment;
    private String[] dissalowedClass;
    private String[] specials;

    public Race(String name,
                String[] dissalowedAlignment,
                String[] dissalowedClass,
                String[] specials) {
        this.name = name;
        this.dissalowedAlignment = dissalowedAlignment;
        this.dissalowedClass = dissalowedClass;
        this.specials = specials;
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", dissalowedAlignment=" + Arrays.toString(dissalowedAlignment) +
                ", dissalowedClass=" + Arrays.toString(dissalowedClass) +
                ", specials=" + Arrays.toString(specials) +
                '}';
    }
}
