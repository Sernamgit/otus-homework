package ru.otus.java.homework.hw4;

public class User {
    private String lastName;
    private String name;
    private String patronymic;
    private int yearOfBirth;

    String email;

    public User(String lastName, String name, String patronymic, int yearOfBirth, String email) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void userInfo(){
        System.out.println("ФИО: " + lastName + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " + email);
    }
}
