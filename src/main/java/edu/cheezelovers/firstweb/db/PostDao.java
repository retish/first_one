package edu.cheezelovers.firstweb.db;

import edu.cheezelovers.firstweb.vo.Post;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: kristina
 * Date: 3/28/15
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PostDao {
    public List<Post> getPosts() {
        List<Post> result = null;
        Connection connection = DbUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from posts");
            if (result == null) {
                result = new ArrayList<Post>();
            }
            while (resultSet.next()) {
                Post post = new Post();
                post.id = resultSet.getInt("id posts");
                post.name = resultSet.getString("name");
                post.text = resultSet.getString("text");
                post.subject = resultSet.getString("subject");
                post.date = resultSet.getDate("data");
                result.add(post);

            }
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        }


        return result;
    }

    public void addPost(String name, String text, String subject) {
        Connection connection = DbUtils.getConnection();
        try {
            Statement statement = connection.createStatement();

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String dateString = sdf.format(date);
            statement.executeUpdate("INSERT INTO posts(name,subject,text,data) VALUES ('" + name + "','" + subject + "','" + text + "','" + dateString + "')");

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }


    }
    public void deletePost(Integer id) {
        Connection connection = DbUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            //тут еще должна быть умная логика, наверное
            statement.executeUpdate("DELETE from posts WHERE \"id posts\" = " + id );
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }

}
