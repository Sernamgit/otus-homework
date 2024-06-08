package ru.otus.java.homework.hw7;

public interface Transport extends Traverse {
    void getIn();
    default void getOut(){
        Human.currentTransport = null;
    }
}
