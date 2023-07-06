package com.epam.mjc.stage0;

public class Animal {

    String color;
    int numberOfPaws;
    boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        return "This animal is mostly " + color + ". " + "It has " + (numberOfPaws == 1 ? "1 paw": numberOfPaws + " paws") + " and " + (hasFur ? "a": "no") + " fur.";
    }

}
