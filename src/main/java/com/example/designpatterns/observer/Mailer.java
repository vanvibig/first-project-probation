package com.example.designpatterns.observer;

public class Mailer implements Observer {
    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.EXPIRE) {
            System.out.println("Mailer: User " + user.getEmail() + "is expired. An email was sent");
        }
    }
}
