package edu.cheezelovers.firstweb.db;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created with IntelliJ IDEA.
 * User: kristina
 * Date: 3/28/15
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class DbUtils {
    public static Connection getConnection(){
        Connection connection = null;
        //URL к базе состоит из протокола:подпротокола://[хоста]:[порта_СУБД]/[БД] и других_сведений
        String url = "jdbc:mysql://localhost:3306/blog";
        //Имя пользователя БД
        String name = "root";
        //Пароль
        String password = "placebo666";
        try {
            //Загружаем драйвер
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Драйвер подключен");
            //Создаём соединение
            connection = DriverManager.getConnection(url, name, password);

        } catch (Exception ex) {
           ex.printStackTrace(); //выводим наиболее значимые сообщения
        }
        return connection;
    }
}
