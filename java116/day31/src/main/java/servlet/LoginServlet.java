package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String method = req.getParameter("method");
        if (method.equals("login")) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            if (username.equals("zs") && password.equals("123") || username.equals("ls") && password.equals("456") || username.equals("ww") && password.equals("789") || username.equals("zl") && password.equals("012")) {
                //登录成功之后创建Session，用于Filter中判断是否通过
                req.getSession().setAttribute("user", username);

            }


        }

    }
}
