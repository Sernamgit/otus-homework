package ru.otus.java.homework.hw13.server;

import java.io.*;
import java.net.Socket;

public class RequestProcessor {
    private BufferedReader in;
    private BufferedWriter out;

    public RequestProcessor(Socket client) throws IOException {
        this.in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        this.out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
    }

    public void sendData(String input) throws IOException {
        out.write(input + "\r\n");
        out.flush();
    }

    public String readData() throws IOException {
        return in.readLine().trim();
    }

    public String calculator(String input) {
        String[] operation = input.trim().split("\\s+");
        String error = "Неверный формат ввода. Используйте формат: число операция число";
        String error2 = "Ошибка разбора операции: ";
        if (operation.length != 3) {
            return error;
        }

        double num1;
        double num2;
        char operator;

        try {
            num1 = Double.parseDouble(operation[0]);
            operator = operation[1].charAt(0);
            num2 = Double.parseDouble(operation[2]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            return error2 + e.getMessage();
        }
        return input + " = " + calculate(num1, num2, operator);
    }

    private String calculate(double num1, double num2, char operator) {
        String error = "Ошибка: неизвестная операция.";
        switch (operator) {
            case '+':
                return String.valueOf(num1 + num2);
            case '*':
                return String.valueOf(num1 * num2);
            case '-':
                return String.valueOf(num1 - num2);
            case '/':
                return String.valueOf(num1 / num2);

            default:
                return error;
        }
    }

}
