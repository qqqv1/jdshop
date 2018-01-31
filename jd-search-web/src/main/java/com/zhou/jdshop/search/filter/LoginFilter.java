package com.zhou.jdshop.search.filter;

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
        if((req.getRequestURI().lastIndexOf("order-cart") < 0 &&
                req.getRequestURI().lastIndexOf("pay") < 0 &&
                req.getRequestURI().lastIndexOf("success") < 0 &&
                req.getRequestURI().lastIndexOf("client-information") < 0 )||
                req.getSession().getAttribute("sessionUser") != null) {
            filterChain.doFilter(req, res);
        } else {
            req.getRequestDispatcher("client-login").forward(req, res);
        }
    }

    @Override
    public void destroy() {

    }
}
