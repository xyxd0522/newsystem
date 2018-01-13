package util;

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

    private static boolean checkNullOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj, String alert) throws ServletException, IOException {
    	if (obj == null || "".equals(obj.toString())) {
    		request.getSession().setAttribute("info", alert);
    		ServletUtil.redirect(request, response, servlet, parameterName);
    		return false;
    	}
    	return true;
    }

    private static boolean checkNullOfObject(HttpServletRequest request,
            HttpServletResponse response, String page,
            Object obj, String alert) throws ServletException, IOException {
    	if (obj == null || "".equals(obj.toString())) {
    		request.getSession().setAttribute("info", alert);
    		ServletUtil.redirect(request, response, page);
    		return false;
    	}
    	return true;
    }
    
    /**
     * 判断Session是否为空（根据Servlet初始化参数跳转页面）
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfSession(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert) throws ServletException, IOException {
    	return checkNullOfObject(request, response, servlet, parameterName, request.getSession().getAttribute(paramName), alert);
    }
    /**
     * 判断Parameter是否为空（根据Servlet初始化参数跳转页面）
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfParameter(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert) throws ServletException, IOException {
    	return checkNullOfObject(request, response, servlet, parameterName, request.getParameter(paramName), alert);
    }

    /**
     * 判断session是否为空（根据绝对路径跳转）
     * @param request
     * @param response
     * @param page
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfSession(HttpServletRequest request,
            HttpServletResponse response, String page,
            String paramName, String alert) throws ServletException, IOException {
    	return checkNullOfObject(request, response, page, request.getSession().getAttribute(paramName), alert);
    }
    /**
     * 判断Parameter是否为空（根据绝对路径跳转）
     * @param request
     * @param response
     * @param page
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfParameter(HttpServletRequest request,
            HttpServletResponse response, String page,
            String paramName, String alert) throws ServletException, IOException {
    	return checkNullOfObject(request, response, page, request.getParameter(paramName), alert);
    }
    
    private static  <T> boolean checkClassOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj, String alert, Class<T> clazz) throws ServletException, IOException {
    	if (!(clazz.isInstance(obj))) {
    		request.getSession().setAttribute("info", alert);
    		ServletUtil.redirect(request, response, servlet, parameterName);
    		return false;
    	}
    	return true;
    }

    private static  <T> boolean checkClassOfObject(HttpServletRequest request,
            HttpServletResponse response, String page,
            Object obj, String alert, Class<T> clazz) throws ServletException, IOException {
    	if (!(clazz.isInstance(obj))) {
    		request.getSession().setAttribute("info", alert);
    		ServletUtil.redirect(request, response, page);
    		return false;
    	}
    	return true;
    }

    /**
     * 判断Session是否为Class（根据Servlet初始化参数跳转页面）
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static <T> boolean checkClassOfSession(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert,
            Class<T> clazz) throws ServletException, IOException {
    	return checkClassOfObject(request, response, servlet, parameterName, request.getSession().getAttribute(paramName), alert, clazz);
    }

    /**
     * 判断Session是否为Class（根据绝对路径跳转）
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static <T> boolean checkClassOfSession(HttpServletRequest request,
            HttpServletResponse response, String page,
            String paramName, String alert,
            Class<T> clazz) throws ServletException, IOException {
    	return checkClassOfObject(request, response, page,
    			request.getSession().getAttribute(paramName), alert, clazz);
    }

    /**
     * 判断Parameter是否为Class（根据绝对路径跳转）
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static <T> boolean checkClassOfParameter(HttpServletRequest request,
            HttpServletResponse response, String page,
            String paramName, String alert,
            Class<T> clazz) throws ServletException, IOException {
    	return checkClassOfObject(request, response, page,
    			request.getParameter(paramName), alert, clazz);
    }

    /**
     * 判断Parameter是否为Class（根据Servlet初始化参数跳转页面）
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static <T> boolean checkClassOfParameter(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert,
            Class<T> clazz) throws ServletException, IOException {
    	return checkClassOfObject(request, response, servlet, parameterName,
    			request.getParameter(paramName), alert, clazz);
    }

    /**
     * 验证登录
     * 
     */
    public static boolean checkIdentity(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName) throws ServletException, IOException {
    	if (checkNullOfSession(request, response, servlet, "login_from", "identity", "请重新登录")) {
    		return checkClassOfSession(request, response, servlet, parameterName, "identity", "权限不足", User.class);
    	}
    	return false;
    }

    /**
     * 判空函数
     */
    public static boolean isNull(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
             String parameterName ,List<String []>list) throws ServletException, IOException {
    	for(int i=0;i<list.size();i++) {
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
