package ru.otus.java.homework.hw12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class EditFile {
    public static void writeToFile(String data, File file) {
        try (
                BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(file, true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            bout.write(buffer);
        } catch (
                IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

    }

    public static void readFromFile(File file) {
        System.out.format("Содержимое файла \"%s!\":\n", file.toString() );
        try (
                InputStreamReader bis = new InputStreamReader(new FileInputStream(file))) {
            int n = bis.read();
            while (n != -1) {
                System.out.print((char) n);
                n = bis.read();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }


}
