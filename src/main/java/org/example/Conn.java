package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

    private  String url = "jdbc:mysql://localhost:3306/book_store";
    private String user = "root";
    private String pass = "lopestegui1985";

    public Connection getConnection(){
        Connection myConn = null;
        try{
            myConn = DriverManager.getConnection(url, user, pass);
            if(myConn != null) {
                System.out.println("Base de datos conectada");
            }
        } catch (SQLException e) {
            System.out.println("Algo salió mal");
            throw new RuntimeException(e);
        }
        return myConn;
    }

}
