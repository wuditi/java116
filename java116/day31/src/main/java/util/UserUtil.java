package util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;


public class UserUtil extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String method = req.getParameter("method");
        if (method != null && !method.trim().isEmpty()) {

            try {
                Method m = this.getClass().getMethod(method, HttpServletRequest.class, HttpServletResponse.class);
                if (m != null) {
                    m.invoke(this, req, resp);
                }

            } catch (Exception e) {
                throw new RuntimeException("出现错误，方法名传输错误，或者不存在该方法");
            }

        }

    }
}
