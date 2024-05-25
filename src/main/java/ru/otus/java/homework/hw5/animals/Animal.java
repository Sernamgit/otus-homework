package ru.otus.java.homework.hw5.animals;

public abstract class Animal {
    protected String name;
    protected  int runSpeed;
    protected  int swimSpeed;
    protected  int stamina;

    protected  int runStaminaDrain;

    protected  int swimStaminaDrain;


    public void info(){
        if (stamina <= 0){
            System.out.println("Животное устало");
        } else {
            System.out.println(name + ", " + " выносливость: " + stamina);
        }
    }

    public double run(int distance){
        double time = (double) distance / runSpeed;
        stamina -= distance * runStaminaDrain;
        if (stamina < 0){
            stamina = 0;
            System.out.println(name + " устало");
            return -1;
        }
        System.out.println("Животное " + name + " пробежало дистанцию " + distance + " метров за "  + time + " секунд");
        return time;
    }
    public double swim(int distance){
        double time = (double) distance / swimSpeed;
        stamina  -= distance * swimStaminaDrain;
        if (stamina < 0){
            stamina = 0;
            System.out.println(name + " устало");
            return -1;
        }
        System.out.println("Животное " + name + " проплыло дистанцию " + distance + " метров за " + time + " секунд");
        return time;
    }


}
