package ru.otus.java.homework.hw7;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Ivan");

        human.move(Terrain.FOREST, 20);
        System.out.println();

        Transport[] transports = new Transport[]{new Rover(), new Car(), new Horse(), new Bicycle()};

        for (Transport transport : transports){
            transport.getIn();
            System.out.println(human.move(Terrain.FOREST, 30));
            transport.getOut();
            System.out.println();
        }

    }
}
