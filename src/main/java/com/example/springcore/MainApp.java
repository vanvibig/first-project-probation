package com.example.springcore;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("pwd: " + System.getProperty("user.dir"));

        Client client = new Client();
        client.execute();
    }
}
