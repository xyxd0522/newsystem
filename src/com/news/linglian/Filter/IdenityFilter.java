/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.Filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lol
 */
public class IdenityFilter implements Filter {

    private String excludedPage;
    private String[] excludedPages;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        excludedPage = filterConfig.getInitParameter("excludedPages");
        System.out.println(excludedPage);
        if (excludedPage != null && excludedPage.length() > 0) {
            excludedPages = excludedPage.split(",");
        }
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 获取 resquest、response、session
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();

        // 定义表示变量 并验证用户请求URL 是否包含不过滤路径
        boolean flag = false;
        for (String page : excludedPages) {
            if (request.getServletPath().equals(page)) {
                flag = true;
            }
        }

        // 验证用户登录
        if (flag) {
            filterChain.doFilter(request, response);
        } else {
            if (session.getAttribute("identity") != null) {
                filterChain.doFilter(request, response);
            } else {
                request.getRequestDispatcher("/" + request.getContextPath() + "user/login.jsp").forward(request, response);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
