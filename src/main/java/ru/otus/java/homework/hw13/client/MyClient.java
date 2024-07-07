package ru.otus.java.homework.hw13.client;

import java.io.*;
import java.net.Socket;


public class MyClient {
    private BufferedReader in;
    private BufferedWriter out;

    public MyClient(Socket socket) throws IOException {
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }

    public void sendData(String input) throws IOException {
        out.write(input + "\r\n");
        out.flush();
    }

    public String readData() throws IOException {
        return in.readLine();
    }

}
