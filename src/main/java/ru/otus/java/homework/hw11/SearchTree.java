package ru.otus.java.homework.hw11;

import java.util.List;

public interface SearchTree {
    /**
     * @param element to find
     * @return element if exists, otherwise - null
     */
    Integer find(int element);

    List<Integer> getSortedList();
}
