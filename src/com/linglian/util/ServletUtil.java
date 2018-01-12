package com.linglian.util;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.linglian.entity.Admin;
import com.news.linglian.entity.User;

public class ServletUtil {

    private ServletUtil() {
    	
    }

    /**
     * 转发（forward）给指定页面
     *
     * @param request
     * @param response
     * @param page
     * @throws ServletException
     * @throws IOException
     */
    public static void forward(HttpServletRequest request,
            HttpServletResponse response, String page) throws ServletException,
            IOException {
        System.out.println(request.getServletPath() + "转发到" + page);
        request.getRequestDispatcher(page).forward(request, response);
    }

    public static void forward(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName) throws ServletException, IOException {
        forward(request, response,
                servlet.getServletConfig().getInitParameter(parameterName));
    }

    /**
     * 跳转（red）给指定页面
     *
     * @param request
     * @param response
     * @param page
     * @throws ServletException
     * @throws IOException
     */
    public static void redirect(HttpServletRequest request,
            HttpServletResponse response, String page) throws ServletException,
            IOException {
        System.out.println(request.getServletPath() + "跳转到" + page);
        response.sendRedirect(page);
    }

    public static void redirect(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName) throws ServletException, IOException {
        redirect(request, response,
                servlet.getServletConfig().getInitParameter(parameterName));
    }
    
    /**
     * 验证登录
     * 
     */
    public static boolean checkIdentity(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName) throws ServletException, IOException {
    	if (request.getSession().getAttribute("identity") == null) {
    		request.getSession().setAttribute("info", "请重新登录");
    		ServletUtil.redirect(request, response,servlet, "login_from");
    		return false;
    	}
    	if (!(request.getSession().getAttribute("identity") instanceof User)) {
    		request.getSession().setAttribute("info", "权限不足");
    		ServletUtil.redirect(request, response, servlet, parameterName);
    		return false;
    	}
    	return true;
    }

    /**
     * 判空函数
     */
    public static boolean isNull(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
             String parameterName ,List<String []>list) throws ServletException, IOException {
    	for(int i=0;i<list.size();i++){    		
	    	if(list.get(i)[0]==null||"".equals(list.get(i)[0])){
	    		request.getSession().setAttribute("info", list.get(i)[1]+"不能为空");
	    		ServletUtil.redirect(request, response,servlet,parameterName);
	    		return false;
	    	}
    	}
    	return true;
    }
    /**
     * 
     * 数据库增、删、改操作验证
     */
    public static void checkdata(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName,String responsename, int ispass) throws ServletException, IOException {
        	if(ispass==0) {
    			request.getSession().setAttribute("info", responsename+"失败");
    			ServletUtil.redirect(request, response, servlet, parameterName );
    		} else {
    			request.getSession().setAttribute("info", responsename+"成功");
    			ServletUtil.redirect(request, response, servlet,  parameterName);
    		}
    }
    
}
