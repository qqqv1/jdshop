package com.zhou.jdshop.LoginFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        if(req.getRequestURI().lastIndexOf("login") >= 0 ||
                req.getRequestURI().lastIndexOf("userLogin") >= 0||
                req.getRequestURI().lastIndexOf("userAdd") >= 0||
                req.getRequestURI().lastIndexOf("addUser") >= 0||
                req.getRequestURI().indexOf(".")>=0||
                req.getSession().getAttribute("sessionUser") != null) {
            filterChain.doFilter(req, res);
        } else {
            req.getRequestDispatcher("login").forward(req, res);
        }
    }

    @Override
    public void destroy() {

    }
}
