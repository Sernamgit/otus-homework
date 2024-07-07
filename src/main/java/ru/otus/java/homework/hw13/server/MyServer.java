package ru.otus.java.homework.hw13.server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(9999)) {
            while (true){
                Socket clientSocket = server.accept();
                RequestProcessor clientRequest = new RequestProcessor(clientSocket);

                while (true){
                    clientRequest.sendData("Введите выражение в формате число операция число. Доступные операций: \"+, -, *, /\"");
                    String userInput = clientRequest.readData();
                    System.out.println(userInput);
                    String output = clientRequest.calculator(userInput);
                    clientRequest.sendData(output);
                }
            }



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
