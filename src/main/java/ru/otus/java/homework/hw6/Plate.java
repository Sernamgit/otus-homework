package ru.otus.java.homework.hw6;

public class Plate {
    private final int maxVolume;
    private int currentVolume;

    Plate(int volume){
        maxVolume = volume;
        this.currentVolume = volume;
    }

    public void addFood(int amount){
        currentVolume += amount;
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        //System.out.println("добавили еду в тарелку");
    }

    public boolean isEmpty(int amount){
        currentVolume -= amount;
        if (currentVolume <= 0){
            //System.out.println("тарелка пустая");
            currentVolume = 0;
            return true;
        }
        return false;
    }

}
