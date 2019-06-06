package com.example.designpatterns.decorator;

public class TeamLeader extends EmployeeDecorator{


    protected TeamLeader(EmployeeComponent employee) {
        super(employee);
    }

    public void planing() {
        System.out.println(this.employee.getName() + " is planing");
    }

    public void motivate() {
        System.out.println(this.employee.getName() + " is motivating");
    }

    public void monitor() {
        System.out.println(this.employee.getName() + " is monitoring");
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        motivate();
        monitor();
    }
}
