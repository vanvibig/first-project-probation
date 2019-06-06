package com.example.designpatterns.visitor;

public class JavaCoreBook implements ProgrammingBook {
    @Override
    public String getResource() {
        return "https://github.com/gpcodervn/Java-Tutorial/";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFavoriteBook() {
        return "The most favorite book of java core";
    }
}
