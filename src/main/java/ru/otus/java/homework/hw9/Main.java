package ru.otus.java.homework.hw9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> testList;
//        testList = fill(4,7);
//        System.out.println(testList);
//
//        System.out.println(sumGraterThanFive(testList));
//
//        fillWithNumber(1, testList);
//        System.out.println(testList);
//
//        increaseBy(5, testList);
//        System.out.println(testList);

        List<Employee> testList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            testList.add(new Employee("Ivan" + i, i + 2000));
        }

        for (Employee employee : testList) {
            System.out.println(employee.getName() + " : " + employee.getAge());
        }


        System.out.println(Employee.getNames(testList));
        System.out.println(Employee.olderThan(testList, 22));
        System.out.println(Employee.minAverage(testList, 22));
        System.out.println(Employee.getMinAgeEmployee(testList));


    }

    public static List<Integer> fill(int min, int max) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            integerList.add(i);
        }
        return integerList;
    }

    public static int sumGraterThanFive(List<Integer> sumList) {
        int sum = 0;
        for (Integer element : sumList) {
            if (element > 5) {
                sum += element;
            }
        }
        return sum;
    }

    public static void fillWithNumber(int target, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, target);
        }
    }

    public static void increaseBy(int increase, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + increase);
        }
    }


}
