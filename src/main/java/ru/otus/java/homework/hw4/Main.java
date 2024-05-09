package ru.otus.java.homework.hw4;

public class Main {
    public static void main(String[] args) {
//        User[] users = new User[10];
//        users[0] = new User("Ivanov", "Ivan", "Ivanovich", 1909, "ivanov@mail.ru");
//        users[1] = new User("Ivanov1", "Ivan", "Ivanovich", 1919, "ivanov@mail1.ru");
//        users[2] = new User("Ivanov2", "Ivan", "Ivanovich", 1929, "ivanov@mail2.ru");
//        users[3] = new User("Ivanov3", "Ivan", "Ivanovich", 1939, "ivanov@mail3.ru");
//        users[4] = new User("Ivanov4", "Ivan", "Ivanovich", 1949, "ivanov@mail4.ru");
//        users[5] = new User("Ivanov5", "Ivan", "Ivanovich", 1959, "ivanov@mail5.ru");
//        users[6] = new User("Ivanov6", "Ivan", "Ivanovich", 1969, "ivanov@mail6.ru");
//        users[7] = new User("Ivanov7", "Ivan", "Ivanovich", 1979, "ivanov@mail7.ru");
//        users[8] = new User("Ivanov8", "Ivan", "Ivanovich", 1989, "ivanov@mail8.ru");
//        users[9] = new User("Ivanov9", "Ivan", "Ivanovich", 1999, "ivanov@mail9.ru");
//
//        for (int i = 0; i < users.length; i++) {
//            if (users[i].yearOfBirth < 1984){
//                users[i].userInfo();
//            }
//        }

        Box box1 = new Box(1,1,1, "blue");
        box1.setColour("red");
        box1.putItem("predmet");
        box1.openBox();
        box1.putItem("predmet");
        box1.closeBox();
        box1.removeItem();
        box1.openBox();
        box1.putItem("predmet2");
        box1.removeItem();
        box1.putItem("predmet2");
        box1.putItem("predmet3");
        box1.boxInfo();

    }
}
