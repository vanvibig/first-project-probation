package com.example.designpatterns.decorator;

public class Manager extends EmployeeDecorator {

    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is creating requirements");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is asigning tasks");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
