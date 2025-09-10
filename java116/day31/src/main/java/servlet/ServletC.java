package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/ServletC")
public class ServletC extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration<String> a = req.getSession().getAttributeNames();
//        while (a.hasMoreElements()) {
//            System.out.println(a.nextElement());
//        }

        resp.setContentType("text/plain;charset=utf-8");

        resp.getWriter().println("国庆");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
