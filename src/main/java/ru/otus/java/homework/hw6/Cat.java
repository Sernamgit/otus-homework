package ru.otus.java.homework.hw6;

public class Cat {
    private String name;

    private int appetite;

    private boolean isFed;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        isFed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isFed() {
        return isFed;
    }

    public void eat(Plate tarelka){
        if(!tarelka.reduceFood(appetite)){
            isFed = true;
        }
    }
}
