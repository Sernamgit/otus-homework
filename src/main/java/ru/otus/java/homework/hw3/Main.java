package ru.otus.java.homework.hw3;

public class Main {
    public static void main(String[] args) {
        int[][] test = {{1,2,3,4}, {1,2,3,9}, {1,2,3,4}, {1,2,3,4}};
        int[][] test1 = {{1,2}};


        System.out.println(sumOfPositiveElements(test));
        printSquare(3);
        zeroDiagonals(test);

        System.out.println(findMax(test));

        System.out.println(sumOfSecondColumn(test1));
        System.out.println(sumOfSecondRow(test1));

    }

    public static int sumOfPositiveElements(int[][] input){
        int positiveSum = 0;
        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[i].length; j++){
                if (input[i][j] > 0 ){
                    positiveSum += input[i][j];
                }
            }
        }
        return positiveSum;
    }

    public static void printSquare(int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zeroDiagonals(int[][] input){
        int leftDiag = 0;
        int rightDiag = input.length - 1;
        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[i].length; j++){
                if(j == leftDiag){
                    input[i][j] = 0;
                }
                if(j == rightDiag){
                    input[i][j] = 0;
                }
                System.out.print(input[i][j]);
            }
            leftDiag++;
            rightDiag--;
            System.out.println();
        }
    }

    //Тут не понял задание, нужно значение или "адрес" в массиве?
    public static int findMax(int[][] input){
        int max = input[0][0];
        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[i].length; j++){
                if (input[i][j] > max) {
                    max = input[i][j];
                }
            }
        }
        return max;
    }

    public static int sumOfSecondColumn(int[][] input){
        int sum = 0;
        for (int i = 0; i < input.length; i++){
            if (input[i].length < 2){
                return -1;
            }
              sum += input[i][1];
        }
        return sum;
    }

    public static int sumOfSecondRow(int[][] input){
        int sum = 0;
        if (input.length < 2){
            return -1;
        }
        for (int i = 0; i < input[1].length; i++){
            sum += input[1][i];
        }
        return sum;
    }


}
