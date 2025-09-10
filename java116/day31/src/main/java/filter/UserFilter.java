package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter({"/UserServlet", "/Useinfo.html"})
public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("UserFilter doFilter");
        //把servletRequest类型转化为 HttpServletRequest
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        String name = (String) request.getSession().getAttribute("user");
        if (name != null) {
            filterChain.doFilter(request, response);
        } else {

            response.sendRedirect("/day31/login.html");

        }


    }

    @Override
    public void destroy() {
        System.out.println("UserFilter destroy");

    }
}
