package ru.otus.java.homework.hw5;

import ru.otus.java.homework.hw5.animals.Cat;
import ru.otus.java.homework.hw5.animals.Dog;
import ru.otus.java.homework.hw5.animals.Horse;

public class Main {
    public static void main(String[] args) {
    //Dog test = new Dog("Pes", 10, 4, 100);
    Cat test = new Cat("Kot", 14, 100);
    //Horse test = new Horse("Plotva", 40, 6, 100);


    test.info();

    test.run(10);

    test.info();

    test.swim(40);

    test.info();


    }

}
