package edu.cheezelovers.firstweb.servlet;

import edu.cheezelovers.firstweb.db.PostDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: kristina
 * Date: 3/28/15
 * Time: 11:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class PostSevlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String subject = req.getParameter("subject");
        String text = req.getParameter("text");
        PostDao dao = new PostDao();
        dao.addPost(name, text, subject);
        resp.sendRedirect("posts.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("posts.jsp");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if (id == null || id.equals("")) {
            return;
        }
        Integer intId = Integer.valueOf(id);
        // delete logic
        PostDao dao = new PostDao();
        dao.deletePost(intId);
//        resp.sendRedirect("posts.jsp");
    }
}
