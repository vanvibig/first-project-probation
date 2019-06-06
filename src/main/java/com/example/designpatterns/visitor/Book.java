package com.example.designpatterns.visitor;

public interface Book {
    void accept(Visitor v);
}
