package ru.otus.java.homework.hw7;

public class Rover implements Transport{

    private int fuel = 1000;
    @Override
    public void getIn() {
        Human.currentTransport = new Rover();
        System.out.println("Сел в вездеход");
    }


    @Override
    public boolean move(Terrain terrain, int dist) {
        switch (terrain) {
            case FOREST -> {
                if ((dist * 2) > fuel){
                    System.out.println("Нет сил на поездку");
                    return false;
                }
                fuel -= dist * 2;
                System.out.println("Успешно проехали " + dist + " по " + terrain.getTitle());
                return true;
            }
            case PLAIN -> {
                if (dist > fuel){
                    System.out.println("Нет сил на поездку");
                    return false;
                }
                fuel -= dist;
                System.out.println("Успешно проехали " + dist + " по " + terrain.getTitle());
                return true;
            }
            case SWAMP -> {
                if ((dist * 3) > fuel){
                    System.out.println("Нет сил на поездку");
                    return false;
                }
                fuel -= dist * 3;
                System.out.println("Успешно проехали " + dist + " по " + terrain.getTitle());
                return true;

            }
            default -> {
                return  false;
            }
        }
    }
}
