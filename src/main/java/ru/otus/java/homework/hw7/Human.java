package ru.otus.java.homework.hw7;

public class Human implements Traverse{
    private final String name;

    static int energy = 100;

    public static Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean move(Terrain terrain, int dist) {
        if (currentTransport == null) {
            System.out.println("идем пешком");
            switch (terrain) {
                case FOREST -> {
                    if ((dist * 2) > energy){
                        System.out.println("Нет сил на поездку");
                        return false;
                    }
                    energy -= dist * 2;
                    System.out.println("Успешно прошли " + dist + " по " + terrain.getTitle());
                    return true;
                }
                case PLAIN -> {
                    if (dist > energy){
                        System.out.println("Нет сил на поездку");
                        return false;
                    }
                    energy -= dist;
                    System.out.println("Успешно прошли " + dist + " по " + terrain.getTitle());
                    return true;
                }
                case SWAMP -> {
                    if ((dist * 3) > energy){
                        System.out.println("Нет сил на поездку");
                        return false;
                    }
                    energy -= dist * 3;
                    System.out.println("Успешно прошли " + dist + " по " + terrain.getTitle());
                    return true;

                }
            }
        }
        return currentTransport.move(terrain, dist);
    }
}
