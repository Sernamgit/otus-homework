package ru.otus.java.homework.hw5.animals;

public class Horse extends Animal{
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        this.runStaminaDrain = 1;
        this.swimStaminaDrain = 4;
    }
}
