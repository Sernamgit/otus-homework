package ru.otus.java.homework.hw11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonDataBase {
    private Map<Long, Person> personList;
    private Set<Position> managerPositions;


    public PersonDataBase() {
        personList = new HashMap<Long, Person>();
        managerPositions = new HashSet<>();
        managerPositions.add(Position.DIRECTOR);
        managerPositions.add(Position.MANAGER);
        managerPositions.add(Position.BRANCH_DIRECTOR);
        managerPositions.add(Position.SENIOR_MANAGER);
    }

    public Person findById(Long id) {
        return personList.get(id);
    }

    public void add(Person person) {
        personList.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        return managerPositions.contains(person.getPosition());
    }

    public boolean isEmployee(Long id) {
        return !isManager(personList.get(id));
    }

}
