package servlet;

import com.alibaba.fastjson.JSONObject;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/ServletE")
public class ServletE extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        Student student = new Student(001, "张三", 11, "男");
        String student1 = JSONObject.toJSONString(student);
        //  System.out.println(student1);
//        Map map = new HashMap();
//        map.put("id", 111);
//        map.put("name", "student1");
//        map.put("age", 111);
//        map.put("gender", "男");
        // String json = JSONObject.toJSONString(map);
//        System.out.println(json);
        resp.getWriter().write(student1);


    }
}
