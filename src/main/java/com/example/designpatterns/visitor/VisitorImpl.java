package com.example.designpatterns.visitor;

public class VisitorImpl implements Visitor {

    @Override
    public void visit(BussinessBook a) {
        System.out.println(a.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook w) {
        System.out.println(w.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook g) {
        System.out.println(g.getFavoriteBook());
    }
}
