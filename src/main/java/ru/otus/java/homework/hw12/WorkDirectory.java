package ru.otus.java.homework.hw12;

import java.io.File;

public class WorkDirectory {
    //выводим только файлы
    public static void printFiles(File directory) {
        System.out.format("Содержимое каталога \"%s!\":\n", directory.toString());
        int i = 0;
        for (File files : directory.listFiles()) {
            if (!files.isDirectory()) {
                System.out.print(i + ": ");
                System.out.println(files.getName());
                i++;
            }
        }
    }

    public static boolean existst(File file) {
        return file.exists();
    }

}
