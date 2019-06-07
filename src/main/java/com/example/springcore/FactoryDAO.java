package com.example.springcore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FactoryDAO {

    public static AbstractDAO getDAO() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("./config.properties");
            prop.load(input);

            String database = prop.getProperty("database");

            if (database.equals("1")) {
                return new MySQLDAO();
            }

            if (database.equals("2")) {
                return new PostgresDAO();
            }

            if (database.equals("3")) {
                return new MSSQLDAO();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
