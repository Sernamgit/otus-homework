package ru.otus.java.homework.hw7;

public class Car implements Transport{
    private int fuel = 500;

    @Override
    public void getIn() {
        Human.currentTransport = new Car();
        System.out.println("Сел в машину");
    }


    @Override
    public boolean move(Terrain terrain, int dist) {
        switch (terrain) {
            case FOREST -> {
                System.out.println("На машине через " + terrain.getTitle() + " не проехать");
                return false;
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
