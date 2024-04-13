package ru.otus.java.homework.hw1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0.Выход");
        System.out.println("1.greetings");
        System.out.println("2.checkSign");
        System.out.println("3.selectColor");
        System.out.println("4.compareNumbers");
        System.out.println("5.addOrSubtractAndPrint");
        int choise = scanner.nextInt();

        if (choise == 1) {
            greetings();
        }
        if (choise == 2) {
            checkSign((int) (Math.random() * 10), (int) (Math.random() * 10), (int) (Math.random() * 10));
        }
        if (choise == 3) {
            selectColor();
        }
        if (choise == 4) {
            compareNumbers();
        }
        if (choise == 5) {
            addOrSubtractAndPrint((int) (Math.random() * 10), (int) (Math.random() * 10), (Math.random() < 0.5));
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("From");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        //System.out.println(a  + " + " + b + " + " + c );
        if ((a + b + c) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void selectColor() {
        int data = (int) (Math.random() * 30);
        //System.out.println(data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else if (data <= 30) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        //System.out.println(a + " " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + " + " + delta + " = " + (initValue + delta));
        } else {
            System.out.println(initValue + " - " + delta + " = " + (initValue - delta));
        }
    }

}
