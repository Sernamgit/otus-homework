package ru.otus.java.homework.hw9;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Employee {
    public static List<String> getNames(List<Employee> list) {
        List<String> result = new ArrayList<>();
        for (Employee employee : list) {
            result.add(employee.getName());
        }
        return result;
    }

    public static List<Employee> olderThan(List<Employee> list, int age) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : list) {
            if (new GregorianCalendar().getWeekYear() - employee.getAge() >= age) {
                result.add(employee);
            }
        }
        return result;
    }

    public static boolean minAverage(List<Employee> list, int averageAge) {
        int ageAll = 0;
        for (Employee employee : list) {
            ageAll += new GregorianCalendar().getWeekYear() - employee.getAge();
        }
        return ageAll / list.size() > averageAge;
    }

    public static Employee getMinAgeEmployee(List<Employee> list) {
        int minAge = list.get(0).getAge();
        int position = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < minAge) {
                minAge = list.get(i).getAge();
                position = i;
            }
        }
        return list.get(position);
    }


    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
