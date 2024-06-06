package ru.otus.java.homework.hw7;

public enum Terrain { FOREST ("Густой лес"), PLAIN ("Равнина"), SWAMP("Болото");

    private final String title;

    Terrain(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
