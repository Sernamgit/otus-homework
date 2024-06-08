package ru.otus.java.homework.hw8;

public class AppArrayDataException extends NumberFormatException{
    public AppArrayDataException(String message, int first, int second) {
        super(message + first + " , " + second);
    }

}
