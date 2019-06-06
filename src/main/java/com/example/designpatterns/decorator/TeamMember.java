package com.example.designpatterns.decorator;

public class TeamMember extends EmployeeDecorator {

    protected TeamMember(EmployeeComponent employee) {
        super(employee);
    }

    public void reportTask() {
        System.out.println(this.employee.getName() + " is reporting");
    }

    public void coordinateWithOthers() {
        System.out.println(this.employee.getName() + " is coordinating with other members of his team");
    }

    @Override
    public void doTask() {
        employee.doTask();
        reportTask();
        coordinateWithOthers();
    }
}
