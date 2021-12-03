//package com.nazarov.database;
//
//import com.mysql.cj.jdbc.Driver;
//import java.sql.*;
//
//public class JDBCconnect {
//
////    private static final String URL = "jdbc:postgresql://localhost:5432/postgres"; не находит драйер...
//    private static final String USERNAME = "admin";
//    private static final String PASSWORD = "sqrt";
//
//    public static void main(String[] args) {
//
//
//        try {
//            Driver driver = new Driver();
//            DriverManager.registerDriver(driver);
//
//
//        } catch (SQLException e) {
//            System.err.println("Driver class loading failure!");
//        }
//
//        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement()) {
//
//            if (!connection.isClosed()) {
//                System.out.println("Connected to database");
//            }else{
//                System.out.println("Connection closed");
//            }
//
//            //for insert update delete
////____________________________________________________________________________
////               statement.executeUpdate("UPDATE users SET age=32 WHERE name ='Tolik';");
////___________________________________________________________________________
////             statement.executeQuery("SELECT * FROM users;");   //ничего не произошло,а почему?
////____________________________________________________________________________
////            //пакетная обработка нескольких запросов
//            statement.addBatch("INSERT INTO users(name, age, email) VALUES ('Stepan', 23, 'kokoko@mail.com');");
//            statement.addBatch("INSERT INTO users(name, age, email) VALUES ('Dima', 21, 'HoHO@mail.com');");
//            statement.addBatch("INSERT INTO users(name, age, email) VALUES ('Kostik', 29, 'azaza@mail.com');");
////____________________________________________________________________________
//            statement.executeBatch();
////            statement.clearBatch();   //хзхз чо он там очищает?
////            statement.execute("DELETE FROM users;");
////            statement.isClosed();
//
////            statement.getConnection();
//
////            statement.close();
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//}
