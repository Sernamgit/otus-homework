package ru.otus.java.homework.hw8;

public class Main {
    public static void main(String[] args) {

        String[][] testArr = new String[4][4];

        for (int i = 0; i < testArr.length; i++) {
            for (int j = 0; j < testArr[i].length; j++) {
                //testArr[i][j] = String.valueOf(j);
                testArr[i][j] = "a";
            }

        }


        try{
            System.out.println(matrixSum(testArr));
        } catch (AppArrayDataException | AppArraySizeException e){
            System.out.println(e);
        }


    }

    public static int matrixSum(String[][] stringArr) throws AppArrayDataException, AppArraySizeException {
        int sum = 0;
        if (stringArr.length != 4) {
            throw new AppArraySizeException("Некорректный размер массива");
        }
        for (int i = 0 ; i < stringArr.length; i++) {
            if (    stringArr[i].length != 4){
                throw new AppArraySizeException("Некорректный размер массива");
            }
        }

        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < stringArr[i].length; j++) {
                try{
                    sum += Integer.parseInt(stringArr[i][j]);
                } catch (NumberFormatException e){
                    throw new  AppArrayDataException("Некорректные данные в массиве: ", i, j);
                }
            }
        }

        return sum;
    }
}
