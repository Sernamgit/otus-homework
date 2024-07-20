package ru.otus.java.homework.hw14;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        long time = System.currentTimeMillis();

        arrayFill(100_000_000);
        System.out.println(System.currentTimeMillis() - time);

        long time2 = System.currentTimeMillis();
        arrayMultiFill(100_000_000, 4);
        System.out.println(System.currentTimeMillis() - time2);
    }
    public static void  arrayFill(int size){
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
    public static void arrayMultiFill(int size, int parts) throws InterruptedException   {
        double[] array = new double[size];
        int partSize = (array.length + parts - 1) / parts;
        Thread[] threads = new Thread[parts];

        for (int i = 0; i < threads.length; i++) {
            int start = i * partSize;
            int end = Math.min(start + partSize, array.length);

            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = start; j < end; j++) {
                        array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                    }
                }
            });

            threads[i].start();
        }

//        for (Thread thread : threads) {
//            thread.join();
//        }


    }


}
