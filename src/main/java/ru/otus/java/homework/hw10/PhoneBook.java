package ru.otus.java.homework.hw10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<Integer, String> pb;

    public PhoneBook() {
        pb = new HashMap<>();
    }

    public void add(String name, int number) {
        pb.put(number, name);
    }

    public Set find(String name) {
        Set<Integer> result = new HashSet<>();
        for (Map.Entry<Integer, String> entry : pb.entrySet()) {
            if (entry.getValue().equals(name)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public boolean containsPhoneNumber(int number) {
        return pb.containsKey(number);
    }
}
