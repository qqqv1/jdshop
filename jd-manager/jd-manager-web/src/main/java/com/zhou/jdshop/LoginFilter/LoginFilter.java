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

        if (req.getSession().getAttribute("sessionUser") != null) {
            filterChain.doFilter(req, res);
        }
        else{
            req.getRequestDispatcher("login").forward(req, res);
        }
    }

    @Override
    public void destroy() {

    }
}