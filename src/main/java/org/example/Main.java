package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

       Conn conn = new Conn();
       try(Connection connect = conn.getConnection()) {
           System.out.println("Conectado");
       } catch (Exception e) {
           System.out.println("Algo salió mal");
           System.out.println(e);
       }
    }
}