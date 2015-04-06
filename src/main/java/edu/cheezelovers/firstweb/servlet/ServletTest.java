package edu.cheezelovers.firstweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: kristina
 * Date: 2/10/15
 * Time: 12:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class ServletTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.print("<html><h1>Hi!</h1></html>");
        writer.close();

    }
}
