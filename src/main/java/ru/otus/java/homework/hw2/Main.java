package ru.otus.java.homework.hw2;


public class Main {
    public static void main(String[] args) {
        printNTimes(5, "Строка");
        int[] test = {1, 5 ,6 ,7, 8 ,9};
        sumOfElements(test);
        changeElements(2, test);
        addToElements(11, test);
        greaterHalf(test);



    }

    public static void printNTimes(int in, String str){
        for (int i = 0 ; i < in; i++){
            System.out.println(str);
        }
     }

     public static void sumOfElements(int[] input){
        int sum = 0;
        for (int i = 0; i < input.length; i++){
            if (input[i] > 5){
                sum += input[i];
            }
        }
         System.out.println(sum);
     }

     public static void changeElements(int change, int[] input){
        for (int i =  0; i < input.length; i++){
            input[i] = change;
        }
         //System.out.println(Arrays.toString(input));
     }

     public static void addToElements(int add, int[] input){
        for (int i = 0; i < input.length; i++){
            input[i] += add;
        }
         //System.out.println(Arrays.toString(input));
     }

     public static void greaterHalf(int[] input){
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < input.length / 2; i++){
            sumLeft += input[i];
        }
        for (int i = input.length / 2; i < input.length; i++){
            sumRight += input[i];
        }
        if (sumLeft > sumRight){
            System.out.println("Первая половина больше");
        } else if (sumLeft < sumRight){
            System.out.println("Вторая половина больше");
        } else System.out.println("Суммы равны");
     }


}
