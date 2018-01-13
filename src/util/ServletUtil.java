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
        redirect(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName));
    }

    // <editor-fold defaultstate="collapsed" desc="私有函数">         

    /**
     * 判断二个对象是否相等
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean equalOfObject(Object a, Object b) {
        if (a == b) {
            return true;
        }
        if (b == null) {
            b = "";
        }
        if (b.equals(a.toString())) {
            return true;
        }
        return false;
    }

    /**
     * 判断a是否大于b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean isBigOfObject(Object a, Object b) {
        if (a == null) {
            a = "0";
        }
        if (b == null) {
            b = "0";
        }
        if (StringUtil.isBigInt(a.toString(), b.toString())) {
            return true;
        }
        return false;
    }

    /**
     * 判断a是否小于b
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean isSmallOfObject(Object a, Object b) {
        if (a == null) {
            a = "0";
        }
        if (b == null) {
            b = "0";
        }
        if (StringUtil.isSmallInt(a.toString(), b.toString())) {
            return true;
        }
        return false;
    }

    /**
     * 判断二个对象是否为一种类
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean equalOfClass(Object a, Object b) {
        return equalOfClass(a, b.getClass());
    }

    /**
     * 判断二个对象是否为一种类
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean equalOfClass(Object a, Class b) {
        if (b == null) {
            return false;
        }
        if (b.isInstance(a)) {
            return true;
        }
        return false;
    }

    /**
     * 判断对象是否为另一个对象的类、子类（根据Servlet初始化参数跳转页面）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param obj
     * @param alert
     * @param clazz
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private static <T> boolean checkClassOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj, String alert, Class<T> clazz)
            throws ServletException, IOException {
        return checkClassOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj, alert, clazz);
    }

    /**
     * 判断对象是否为另一个对象的类、子类（根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param page
     * @param obj
     * @param alert
     * @param clazz
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private static <T> boolean checkClassOfObject(HttpServletRequest request,
            HttpServletResponse response, String page, Object obj,
            String alert, Class<T> clazz) throws ServletException, IOException {
        if (!equalOfClass(obj, clazz)) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return false;
        }
        return true;
    }

    /**
     * 判断对象是否为空（null、""，根据Servlet初始化参数跳转页面）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param obj
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private static boolean checkNullOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj, String alert)
            throws ServletException, IOException {
        return checkNullOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj, alert);
    }

    /**
     * 判断对象是否为空（null、""，根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param servlet
     * @param parameterName
     * @param obj
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    private static boolean checkNullOfObject(HttpServletRequest request,
            HttpServletResponse response, String page, Object obj, String alert)
            throws ServletException, IOException {
        if (equalOfObject(obj, null)) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return false;
        }
        return true;
    }

    private static boolean checkEqualOfObject(HttpServletRequest request,
            HttpServletResponse response, String page,
            Object obj1, Object obj2, String alert,
            boolean flag) throws ServletException, IOException {
        // 相等，且选择相等时执行跳转，执行跳转成功
        if (equalOfObject(obj1, obj2) && flag) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return true;
        } else if (flag) { //不相等，且选择相等时执行跳转的时候，执行跳转失败，返回false
            return false;
        } else { // 不相等，且选择不相等时执行跳转，执行跳转成功
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return true;
        }
    }

    private static boolean checkEqualOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        return checkEqualOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj1, obj2, alert, flag);
    }

    private static boolean checkEqualOfClass(HttpServletRequest request,
            HttpServletResponse response, String page,
            Object obj1, Object obj2, String alert,
            boolean flag) throws ServletException, IOException {
        // 相等，且选择相等时执行跳转，执行跳转成功
        if (equalOfClass(obj1, obj2.getClass()) && flag) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return true;
        } else if (flag) { //不相等，且选择相等时执行跳转的时候，执行跳转失败，返回false
            return false;
        } else { // 不相等，且选择不相等时执行跳转，执行跳转成功
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return true;
        }
    }

    private static boolean checkEqualOfClass(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        return checkEqualOfClass(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj1, obj2, alert, flag);
    }

    private static boolean checkIsBigOfObject(HttpServletRequest request,
            HttpServletResponse response, String page,
            Object obj1, Object obj2, String alert,
            boolean flag) throws ServletException, IOException {
        // 相等，且选择相等时执行跳转，执行跳转成功
        if (isBigOfObject(obj1, obj2) && flag) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return true;
        } else if (flag) { //不相等，且选择相等时执行跳转的时候，执行跳转失败，返回false
            return false;
        } else { // 不相等，且选择不相等时执行跳转，执行跳转成功
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return true;
        }
    }

    private static boolean checkIsBigOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        return checkIsBigOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj1, obj2, alert, flag);
    }

    private static boolean checkIsSmallOfObject(HttpServletRequest request,
            HttpServletResponse response, String page, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        // 相等，且选择相等时执行跳转，执行跳转成功
        if (isSmallOfObject(obj1, obj2.getClass()) && flag) {
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return true;
        } else if (flag) { //不相等，且选择相等时执行跳转的时候，执行跳转失败，返回false
            return false;
        } else { // 不相等，且选择不相等时执行跳转，执行跳转成功
            request.getSession().setAttribute("info", alert);
            ServletUtil.redirect(request, response, page);
            return true;
        }
    }

    private static boolean checkIsSmallOfObject(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, Object obj1, Object obj2,
            String alert, boolean flag) throws ServletException, IOException {
        return checkIsSmallOfObject(request, response, servlet.getServletConfig()
                .getInitParameter(parameterName), obj1, obj2, alert, flag);
    }

    // </editor-fold>  
    // <editor-fold defaultstate="collapsed" desc="公有函数">      
    /**
     * 判断Session是否为空（根据Servlet初始化参数跳转页面）
     *
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
    public static boolean checkNullOfSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert)
            throws ServletException, IOException {
        return checkNullOfObject(request, response, servlet, parameterName,
                request.getSession().getAttribute(paramName), alert);
    }

    /**
     * 判断session是否为空（根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param page
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfSes(HttpServletRequest request,
            HttpServletResponse response, String page, String paramName,
            String alert) throws ServletException, IOException {
        return checkNullOfObject(request, response, page, request.getSession()
                .getAttribute(paramName), alert);
    }

    /**
     * 判断Parameter是否为空（根据Servlet初始化参数跳转页面）
     *
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
    public static boolean checkNullOfPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert)
            throws ServletException, IOException {
        return checkNullOfObject(request, response, servlet, parameterName,
                request.getParameter(paramName), alert);
    }

    /**
     * 判断Parameter是否为空（根据绝对路径跳转）
     *
     * @param request
     * @param response
     * @param page
     * @param paramName
     * @param alert
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public static boolean checkNullOfPar(HttpServletRequest request,
            HttpServletResponse response, String page, String paramName,
            String alert) throws ServletException, IOException {
        return checkNullOfObject(request, response, page,
                request.getParameter(paramName), alert);
    }

    /**
     * 判断Session是否为Class（根据Servlet初始化参数跳转页面）
     *
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
    public static <T> boolean checkClassOfSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert, Class<T> clazz)
            throws ServletException, IOException {
        return checkClassOfObject(request, response, servlet, parameterName,
                request.getSession().getAttribute(paramName), alert, clazz);
    }

    /**
     * 判断Session是否为Class（根据绝对路径跳转）
     *
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
    public static <T> boolean checkClassOfSes(HttpServletRequest request,
            HttpServletResponse response, String page, String paramName,
            String alert, Class<T> clazz) throws ServletException, IOException {
        return checkClassOfObject(request, response, page, request.getSession()
                .getAttribute(paramName), alert, clazz);
    }

    /**
     * 判断Parameter是否为Class（根据绝对路径跳转）
     *
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
    public static <T> boolean checkClassOfPar(HttpServletRequest request,
            HttpServletResponse response, String page, String paramName,
            String alert, Class<T> clazz) throws ServletException, IOException {
        return checkClassOfObject(request, response, page,
                request.getParameter(paramName), alert, clazz);
    }

    /**
     * 判断Parameter是否为Class（根据Servlet初始化参数跳转页面）
     *
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
    public static <T> boolean checkClassOfPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String paramName, String alert, Class<T> clazz)
            throws ServletException, IOException {
        return checkClassOfObject(request, response, servlet, parameterName,
                request.getParameter(paramName), alert, clazz);
    }

    public static boolean equalObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, servlet, parameterName, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean equalObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, page, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean equalClassOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, page, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean equalClassOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, servlet, parameterName, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean equalObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, page, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean equalObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, servlet, parameterName, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean equalClassOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, page, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean equalClassOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, servlet, parameterName, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean equalObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, page, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean equalObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfObject(request,
                response, servlet, parameterName, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean equalClassOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, page, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean equalClassOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkEqualOfClass(request,
                response, servlet, parameterName, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean isBigObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, servlet, parameterName, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isBigObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, servlet, parameterName, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean isBigObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, servlet, parameterName, request.getSession().getAttribute(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isBigObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, page, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isBigObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, page, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean isBigObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsBigOfObject(request,
                response, page, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean isSmallObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, servlet, parameterName, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isSmallObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, servlet, parameterName, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean isSmallObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, servlet, parameterName, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    public static boolean isSmallObjectOfParAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par, String ses, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, page, request.getParameter(par),
                request.getSession().getAttribute(ses), alert, flag);
    }

    public static boolean isSmallObjectOfParAndPar(HttpServletRequest request,
            HttpServletResponse response, String page,
            String par1, String par2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, page, request.getParameter(par1),
                request.getParameter(par2), alert, flag);
    }

    public static boolean isSmallObjectOfSesAndSes(HttpServletRequest request,
            HttpServletResponse response, String page,
            String ses1, String ses2, String alert, boolean flag)
            throws ServletException, IOException {
        return checkIsSmallOfObject(request,
                response, page, request.getSession().getAttribute(ses1),
                request.getSession().getAttribute(ses2), alert, flag);
    }

    // </editor-fold>   
    
    /**
     * 验证登录
     *
     */
    public static boolean checkIdentity(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName) throws ServletException, IOException {
        if (checkNullOfSes(request, response, servlet, "login_from",
                "identity", "请重新登录")) {
            return checkClassOfSes(request, response, servlet,
                    parameterName, "identity", "权限不足", User.class);
        }
        return false;
    }

    /**
     * 判空函数
     */
    public static boolean isNull(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String parameterName, List<String[]> list) throws ServletException,
            IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[0] == null || "".equals(list.get(i)[0])) {
                request.getSession().setAttribute("info",
                        list.get(i)[1] + "不能为空");
                ServletUtil.redirect(request, response, servlet, parameterName);
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
            String parameterName, String responsename, int ispass)
            throws ServletException, IOException {
        if (ispass == 0) {
            request.getSession().setAttribute("info", responsename + "失败");
            ServletUtil.redirect(request, response, servlet, parameterName);
        } else {
            request.getSession().setAttribute("info", responsename + "成功");
            ServletUtil.redirect(request, response, servlet, parameterName);
        }
    }

}
