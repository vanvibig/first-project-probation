package com.example.designpatterns.visitor;

public interface Visitor {

    void visit(BussinessBook b);

    void visit(DesignPatternBook b);

    void visit(JavaCoreBook b);
}
