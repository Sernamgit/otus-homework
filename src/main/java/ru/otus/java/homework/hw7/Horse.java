package ru.otus.java.homework.hw7;

public class Horse implements Transport{

    private int energy = 200;

    @Override
    public void getIn() {
        Human.currentTransport = new Horse();
        System.out.println("Сел на лошадь");
    }


    @Override
    public boolean move(Terrain terrain, int dist) {
        switch (terrain) {
            case FOREST -> {
                if ((dist * 2) > energy){
                    System.out.println("Нет сил на поездку");
                    return false;
                }
                energy -= dist * 2;
                System.out.println("Успешно проехали " + dist + " по " + terrain.getTitle());
                return true;
            }
            case PLAIN -> {
                if (dist > energy){
                    System.out.println("Нет сил на поездку");
                    return false;
                }
                energy -= dist;
                System.out.println("Успешно проехали " + dist + " по " + terrain.getTitle());
                return true;
            }
            case SWAMP -> {
                System.out.println("На коне через" + terrain.getTitle() + " не проехать");
                return false;
            }
            default ->
            {
                return false;
            }
        }
    }
}
