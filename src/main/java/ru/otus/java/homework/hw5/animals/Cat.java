package ru.otus.java.homework.hw5.animals;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.stamina = stamina;
        this.runStaminaDrain = 1;
    }

    @Override
    public double swim(int distance){
        System.out.println(name + " не умеет плавать");
        return -1;
    }
}
