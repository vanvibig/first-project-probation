package com.example.designpatterns.visitor;

public class BussinessBook implements Book {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "The publisher of bussiness book";
    }
}
