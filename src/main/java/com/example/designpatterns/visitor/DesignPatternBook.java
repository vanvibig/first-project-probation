package com.example.designpatterns.visitor;

public class DesignPatternBook implements ProgrammingBook {
    @Override
    public String getResource() {
        return "https://github.com/gpcodervn/Design-Pattern-Tutorial/";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBestSeller() {
        return "The best Seller of desgin pattern book";
    }
}
