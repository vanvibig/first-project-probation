package com.example.springcore;

public class Client {

    AbstractDAO dao;

    public Client() {
        dao = FactoryDAO.getDAO();
    }

    public AbstractDAO getDAO() {
        return dao;
    }

    public void setDao(AbstractDAO dao) {
        this.dao = dao;
    }

    public void execute() {
        dao.insert();
        dao.update();
        dao.delete();
    }
}
