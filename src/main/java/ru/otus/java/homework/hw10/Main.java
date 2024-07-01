package ru.otus.java.homework.hw10;

public class Main {

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        pb.add("Ivanov Ivan", 77777);
        pb.add("Ivanov Ivan", 88888);
        pb.add("Vasil'ev Vasilii", 99999);

        System.out.println(pb.find("Ivanov Ivan"));
        System.out.println(pb.containsPhoneNumber(99999));
        System.out.println(pb.containsPhoneNumber(999));

    }


}
