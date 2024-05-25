package ru.otus.java.homework.hw4;

public class Box {
    private final int length;
    private final int width;
    private final int height;
    private String colour;
    private boolean isOpen = false;
    private String content;

    public Box(int length, int width, int height, String colour){
        this.length = length;
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public void openBox(){
        if (isOpen){
            System.out.println("коробка уже открыта");
        } else {
            isOpen = true;
            System.out.println("Вы открыли коробку");
        }

    }

    public void closeBox(){
        if (isOpen){
            isOpen = false;
            System.out.println("Вы закрыли коробку");
        } else {
            System.out.println("коробка закрыта");
        }
    }

    public void setColour(String colour){
        this.colour = colour;
        System.out.println("цвет коробки теперь " + colour);
    }

    public void boxInfo(){
        System.out.println( "длинна: " + length + " " + "ширина: " + width + " " + "высота: " + height + " " + "цвет: " + colour);
        if (isOpen){
            System.out.println("коробка открыта");
        } else {
            System.out.println("коробка закрыта");
        }
        if (content != null){
            System.out.println("В коробке лежит " + content);
        } else {
            System.out.println("В коробке пусто");
        }
    }


    public void putItem(String item){
        if (content == null && isOpen){
            System.out.println("Вы положили в коробку " + item);
            content = item;
        } else if (content != null){
            System.out.println("коробка полная");
        } else if (!isOpen){
            System.out.println("коробка закрыта");
        }

    }

    public void removeItem(){
        if (content != null && isOpen){
            System.out.println("Вы убрали из коробки " + content);
            content = null;
        } else if (content == null){
            System.out.println("коробка пуста");
        } else if (!isOpen) {
            System.out.println("коробка закрыта");
        }


    }
}