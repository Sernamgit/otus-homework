package ru.otus.java.homework.hw7;

public class Bicycle implements Transport{
    @Override
    public void getIn() {
        Human.currentTransport = new Bicycle();
        System.out.println("Сел на велосипед");
    }


    @Override

    public boolean move(Terrain terrain, int dist) {
        switch (terrain) {
            case FOREST -> {
                if ((dist * 2) > Human.energy){
                    System.out.println("Нет сил на поездку");
                    return false;
                }
                Human.energy -= dist * 2;
                System.out.println("Успешно проехали " + dist + " по " + terrain.getTitle());
                return true;
            }
            case PLAIN -> {
                if (dist > Human.energy){
                    System.out.println("Нет сил на поездку");
                    return false;
                }
                Human.energy -= dist;
                System.out.println("Успешно проехали " + dist + " по " + terrain.getTitle());
                return true;
            }
            case SWAMP -> {
                System.out.println("На велосипеде через" + terrain.getTitle() + " не проехать");
                return false;
            }
            default ->
            {
                return false;
            }
        }
    }
}
