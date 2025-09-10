package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletD")
public class ServletD extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget");
        resp.setHeader("aaa", "aaa");


        resp.setHeader("Location", "/day31/ServletC");
        resp.sendRedirect("/day31/ServletC");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("dopost");
        resp.getWriter().write("dopost is right ");

        resp.setHeader("Location", "/day31/ServletC");
        resp.sendRedirect("/day31/ServletC");
    }
}
