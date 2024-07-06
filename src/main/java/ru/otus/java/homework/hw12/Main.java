package ru.otus.java.homework.hw12;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String directory = "src\\main";
        String fileName;

        //вывод файлов в директории
        WorkDirectory.printFiles(new File(directory));

        //выбор файла + проверка на существование файла
        while (true) {
            fileName = directory + "\\" + userInput.nextLine();
            if (WorkDirectory.existst(new File(fileName))) {
                break;
            } else {
                System.out.println("Файл не существует, введине правильно имя файла");
            }
        }

        //вывод содержимого + запись
        while (true) {
            EditFile.readFromFile(new File(fileName));
            System.out.println("\nВведите данные для записи в файл или \"Выход\" для завершения\n");
            String data = userInput.nextLine();
            if (data.equals("Выход")) {
                break;
            }
            EditFile.writeToFile(data, new File(fileName));
        }

        userInput.close();

    }
}