package ru.otus.java.homework.hw10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<Integer, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, int number) {
        phoneBook.put(number, name);
    }

    public Set find(String name) {
        Set<Integer> result = new HashSet<>();
        for (Map.Entry<Integer, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(name)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public boolean containsPhoneNumber(int number) {
        return phoneBook.containsKey(number);
    }
}
