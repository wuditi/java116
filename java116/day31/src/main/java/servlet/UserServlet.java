package servlet;

import com.alibaba.fastjson.JSONObject;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("application/json;charset=utf-8");

        User user1 = new User(1, "zs", "123", "asasas");
        User user2 = new User(2, "ls", "456", "asasas");
        User user3 = new User(3, "ww", "789", "asasas");
        User user4 = new User(4, "zl;", "012", "asasas");

        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        String userList = JSONObject.toJSONString(users);
        resp.getWriter().write(userList);


    }
}
