package com.example.designpatterns.observer;

public class Protector implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.INVALID) {
            System.out.println("Protecte: User " + user.getEmail()
                    + " is invalid. " + "IP " + user.getIp() + " is blocked");
        }
    }
}
