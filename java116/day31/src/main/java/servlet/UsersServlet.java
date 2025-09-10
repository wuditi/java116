package servlet;

import util.UserUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UsersServlet")
public class UsersServlet extends UserUtil {

    public void login(HttpServletRequest req, HttpServletResponse resp) {

        System.out.println("login");
    }


    public void addL(HttpServletRequest req, HttpServletResponse resp) {

        System.out.println("addL");
    }

    public void selectA(HttpServletRequest req, HttpServletResponse resp) {

        System.out.println("selectA");
    }


}
