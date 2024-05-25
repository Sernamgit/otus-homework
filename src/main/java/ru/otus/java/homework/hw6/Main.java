package ru.otus.java.homework.hw6;

public class Main {
    public static void main(String[] args) {
        Plate tarelka = new Plate(10);

        Cat[] catArray =  new Cat[5];

        for (int i = 0; i < catArray.length ; i++) {
            catArray[i] = new Cat(("CatName" + i), (int) (Math.random() * 10 ));
        }

        for (int i = 0; i < catArray.length ; i++) {
            if(!tarelka.isEmpty(catArray[i].getAppetite())){
                catArray[i].setFed(true);
            }
        }

        for (int i = 0; i < catArray.length; i++) {
            if (catArray[i].isFed()){
                System.out.println("Кошка " + catArray[i].getName() + " сытая");
            } else {
                System.out.println("Кошка " + catArray[i].getName() + " голодная");
            }

        }
    }
}
