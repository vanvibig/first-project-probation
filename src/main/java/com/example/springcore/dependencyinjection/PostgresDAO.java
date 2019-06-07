package com.example.springcore.dependencyinjection;

public class PostgresDAO implements AbstractDAO {
    @Override
    public void insert() {
        System.out.println("Postgres insert");
    }

    @Override
    public void delete() {
        System.out.println("Postgres delete");
    }

    @Override
    public void update() {
        System.out.println("Postgres update");
    }
}
