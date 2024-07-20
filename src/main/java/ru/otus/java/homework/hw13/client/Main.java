package ru.otus.java.homework.hw13.client;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 9999)){
            MyClient client = new MyClient(socket);
            Scanner input = new Scanner(System.in);
            String userInput;

            System.out.println("Для выхода введите \"выход\"");

            while(true){
                System.out.println(client.readData());
                userInput = input.nextLine();
                if (userInput.equalsIgnoreCase("выход")) {
                    break;
                }

                client.sendData(userInput);
                System.out.println(client.readData());
            }



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
