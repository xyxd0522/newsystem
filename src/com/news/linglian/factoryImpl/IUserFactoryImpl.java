package com.news.linglian.factoryImpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ServletCheckBuilder;
import util.ServletUtil;
import util.StringArrayListBuilder;

import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.IUserService;
import com.news.linglian.serviceImpl.IUserServiceImpl;
import com.news.linglian.serviceN.IUserServiceN;
import com.news.linglian.serviceNImpl.IUserServiceNImpl;
import java.util.Date;
import util.MapUtil;

/**
 *
 * IUserFactoryImpl.java
 *
 * @author wcx
 *
 * @Date: 2018年1月12日 下午12:53:55
 *
 */
public class IUserFactoryImpl implements IServletFactory {

    private IUserServiceN ias = null;

    public IUserFactoryImpl() {
        ias = new IUserServiceNImpl();
    }

    /**
     * 接受页面请求
     */
    @Override
    public void doThing(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String factoryName) throws ServletException, IOException {
        // TODO Auto-generated method stub
        switch (factoryName) {
            case "login":
                doLogin(request, response, servlet);
                break;
            case "remove":
                doRemove(request, response, servlet);
                break;
            case "insert":
                doInsert(request, response, servlet);
                break;
            case "update":
                doUpdate(request, response, servlet);
                break;
            case "query":
                doQuery(request, response, servlet);
                break;
            case "insertFriend":
                doInsertFriend(request, response, servlet);
                break;
        }
    }

    /**
     * 加为好友（关注）
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doInsertFriend(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "query_to")
                .addNp("userId", "需要填写需要添加的用户id")
                .addNs("identity", "请重新登录")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = (User) tMap.get("ses_identity");
            String str = user.getUserIds();
            boolean isInsert = true;
            if (str != null) {
                String[] userIds = str.split(",");
                for (String id : userIds) {
                    if (id.equals(m.get("par_userId"))) {
                        isInsert = false;
                        break;
                    }
                }
                if (isInsert) {
                    user.setUserIds(str + "," + m.get("par_userId"));
                    ias.updateOfUserId(user, user.getUserId());
                    ServletUtil.dataOfSetSesRredirect(request, response, servlet,
                            "query_to", "query_to", "关注",
                            user, "identity");
                }
            }
            if (!isInsert) {
                request.getSession().setAttribute("info", "你已经关注了该用户");
                ServletUtil.redirect(request, response, servlet, "query_to");
            }
        }
    }

    /**
     * 获取admin信息
     *
     */
    protected void doQuery(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "query_from")
                .addNp("userId", "需要填写需要查看的用户id")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            String userId = m.get("par_userId");
            User user = ias.getUserOfUserId(userId);
            user.setPassword(null);
            ServletUtil.dataOfSetSesForward(request, response, servlet,
                    "query_from", "query_to", "获取",
                    user, "user");
        }
    }

    /**
     * 修改
     *
     */
    protected void doUpdate(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub

    }

    /**
     * 注册页面实现
     *
     */
    protected void doInsert(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "insert_from")
                .addNp("email", "邮箱不能为空")
                .addNp("username", "昵称不能为空")
                .addNp("pass", "密码不能为空")
                .addNp("repass", "确认密码不能为空")
                .addNp("quiz1", "省份不能为空")
                .addNp("quiz2", "城市不能为空")
                .addNp("quiz3", "区/县不能为空")
                .addNp("vercode", "验证码不能为空")
                .addEpp("pass", "repass", "二次密码不相同", false)
                .addEps("vercode", "token", "验证码错误", false)
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = new User();
            user.setName(m.get("par_username"));
            user.setEmail(m.get("par_email"));
            user.setPassword(m.get("par_pass"));
            user.setRegisterDate(new Date().toLocaleString());
            user.setPath(m.get("par_quiz1") + "," + m.get("par_quiz2") + "," + m.get("par_quiz3"));
            ServletUtil.checkdata(request, response, servlet, "insert_from", "插入", ias.insert(user));
        }
    }

    /**
     * 删除
     *
     */
    protected void doRemove(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        String userId = request.getParameter("userId");
        if (ServletUtil.checkIdentity(request, response, servlet, "remove_from")) {
            List<String[]> list = new StringArrayListBuilder()
                    .addString(userId, "用户id")
                    .build();
            if (ServletUtil.isNull(request, response, servlet, "remove_from", list)) {
                ServletUtil.checkdata(request, response, servlet, "remove_from", "删除", ias.removeOfBUserIds(userId));
            }
        }
    }

    /**
     * 登录
     *
     */
    protected void doLogin(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "login_from")
                .addNp("email", "邮箱")
                .addNp("pass", "密码")
                .addNp("vercode", "验证码")
                .addEps("vercode", "token", "验证码错误", false)
                .build();
        if (tMap != null) {
            Map<String, String> m = MapUtil.soss(tMap);
            User user = ias.getUserOfPasswordAndEmail(m.get("par_pass"), m.get("par_email"));
            user.setLoginDate(new Date().toLocaleString());
            ias.updateOfUserId(user, user.getUserId());
            ServletUtil.dataOfSetSesRredirect(request, response, servlet,
                    "login_from", "login_to", "登录",
                    user, "identity");
        }
    }
}
