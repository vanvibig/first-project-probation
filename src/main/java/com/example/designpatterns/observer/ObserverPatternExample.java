package com.example.designpatterns.observer;

public class ObserverPatternExample {

    public static void main(String[] args) {
        AccountService accountService1 = createAccount("contact@gpcoder", "127.0.0.1");
        accountService1.login();
        accountService1.changeStatus(LoginStatus.EXPIRE);

        System.out.println("------");
        AccountService accountService2 = createAccount("contact@gpcoder.com", "116.108.77.231");
        accountService2.login();
    }

    private static AccountService createAccount(String email, String ip) {
        AccountService accountService = new AccountService(email, ip);
        accountService.attach(new Logger());
        accountService.attach(new Mailer());
        accountService.attach(new Protector());
        return accountService;

    }
}
