package com.example.springcore.dependencyinjection;

public class DB2DAO implements AbstractDAO {
    @Override
    public void insert() {
        System.out.println("DB2 insert");
    }

    @Override
    public void delete() {
        System.out.println("DB2 delete");
    }

    @Override
    public void update() {
        System.out.println("DB2 update");
    }
}
