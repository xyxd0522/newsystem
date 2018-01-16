package com.news.linglian.factoryImpl;

import com.news.linglian.entity.Comment;
import com.news.linglian.entity.Email;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.ServletUtil;
import com.news.linglian.entity.News;
import com.news.linglian.entity.Newstype;
import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import static com.news.linglian.factoryImpl.IUserFactoryImpl.speed;
import static com.news.linglian.factoryImpl.IUserFactoryImpl.time;
import com.news.linglian.service.ICommentService;
import com.news.linglian.service.IEmailService;
import com.news.linglian.service.INewsService;
import com.news.linglian.service.INewstypeService;
import com.news.linglian.service.IUserService;
import com.news.linglian.serviceImpl.ICommentServiceImpl;
import com.news.linglian.serviceImpl.IEmailServiceImpl;
import com.news.linglian.serviceImpl.INewsServiceImpl;
import com.news.linglian.serviceImpl.INewstypeServiceImpl;
import com.news.linglian.serviceImpl.IUserServiceImpl;
import db.DBUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import util.MapUtil;
import util.ServletCheckBuilder;
import util.StringUtil;

/**
 *
 * INewsFactoryImpl.java
 *
 * @author wcx
 *
 * @Date: 2018年1月13日 上午9:33:48
 *
 */
public class INewsFactoryImpl implements IServletFactory {

    private INewsService ias = null;
    private INewstypeService its = null;
    private IUserService ius = null;
    private ICommentService ics = null;
    private IEmailService ies = null;

    public INewsFactoryImpl() {
        ias = new INewsServiceImpl();
        its = new INewstypeServiceImpl();
        ius = new IUserServiceImpl();
        ics = new ICommentServiceImpl();
        ies = new IEmailServiceImpl();
    }

    /**
     * 接受页面请求
     */
    @Override
    public void doThing(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet,
            String method) throws ServletException, IOException {
        // TODO Auto-generated method stub
        getAll(request, response);
        switch (method) {
            case "remove":
                doRemove(request, response, servlet);
                break;
            case "insert":
                doInsert(request, response, servlet);
                break;
            case "update":
                doUpdate(request, response, servlet);
                break;
            case "queryOfId":
                doQueryOfId(request, response, servlet);
                break;
            case "queryAll":
                doQueryAll(request, response, servlet);
                break;
            case "readyPost":
                doReadyPost(request, response, servlet);
                break;
            case "readyUpdate":
                doReadyUpdate(request, response, servlet);
                break;
            case "pushComment":
                doPushComment(request, response, servlet);
                break;
        }
    }

    protected void doPushComment(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("content", "内容不可以为空")
                .addNp("newsId", "新闻内容不能为空")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            Map<String, String> m = MapUtil.soss(tMap);
            News news = ias.getNewsOfNewsId(m.get("par_newsId"));
            Comment c = new Comment();
            c.setTime(new Date().toLocaleString());
            c.setNewsId(news.getNewsId());
            c.setUserId(user.getUserId());
            c.setBody(m.get("par_content"));
            ics.insert(c);
            Email e = new Email();
            e.setFromUserId(user.getUserId());
            e.setNewsId(news.getNewsId());
            e.setToUserId(news.getUserId());
            e.setTime(new Date().toLocaleString());
            e.setBody(m.get("par_content"));
            ies.insert(e);
            request.getSession().setAttribute("info", "评论成功");
            ServletUtil.redirect(request, response, request.getContextPath() + "NewsAction.do?method=queryOfId&newsId=" + news.getNewsId());
        }
    }

    protected void doReadyPost(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            List<Newstype> list = its.getNewstypes(new Newstype());
            request.getSession().setAttribute("newstypeList", list);
            ServletUtil.forward(request, response, request.getContextPath() + "news/newsPost.jsp");
        }
    }

    protected void doReadyUpdate(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "login_to")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("newsId", "请输入要修改的新闻编号")
                .build();
        if (tMap != null) {
            News news = ias.getNewsOfNewsId(tMap.get("par_newsId").toString());
            request.getSession().setAttribute("newsBody", news.getBody());
            request.getSession().setAttribute("newsTitle", news.getTitle());
            request.getSession().setAttribute("newsId", news.getNewsId());
            List<Newstype> list = its.getNewstypes(new Newstype());
            request.getSession().setAttribute("newstypeList", list);
            ServletUtil.forward(request, response, request.getContextPath() + "news/newsPost.jsp");
        }
    }
    /*
     * 根据id查询新闻详情
     */

    protected void doQueryOfId(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("newsId", "新闻编号不能为空")
                .build();
        if (tMap != null) {
            News news = ias.getNewsOfNewsId(tMap.get("par_newsId").toString());

            // 获取评论列表
            List<Comment> commentList = ics.getCommentsOfNewsId(news.getNewsId());
            if (commentList != null) {
                String[] strs = new String[commentList.size()];
                DateFormat dateFormat = new SimpleDateFormat();
                for (int i = 0; i < commentList.size(); i++) {
                    Comment n = commentList.get(i);
                    try {
                        Date date = dateFormat.parse(n.getTime());
                        long time = new Date().getTime() - date.getTime();
                        if (time <= 1000 * 60) {
                            n.setTime("刚刚");
                        } else if (time <= 1000 * 60 * 60) {
                            n.setTime(String.valueOf(new Date(time).getMinutes()) + "分前");
                        }
                        strs[i] = n.getNewsId();
                    } catch (ParseException ex) {
                        System.out.println(ex.getMessage());
                        strs[i] = n.getNewsId();
                    }
                }
            }
            request.getSession().setAttribute("commentList", commentList);
            request.getSession().setAttribute("user", ius.getUserOfUserId(news.getUserId()));
            ServletUtil.dataOfSetSesForward(request, response, servlet,
                    "queryOfId_to", "queryOfId_from", "获取",
                    news, "news");
        }
    }

    /**
     * 列出所有新闻
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doQueryAll(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // 配置新闻类型
        List<Newstype> list = its.getNewstypes(new Newstype());
        request.getSession().setAttribute("newstypeList", list);
        // 获得新闻列表
        int page = 1;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page"));
        }
        // 设置新闻类型
        String typeId = request.getParameter("newsTypeId");
        News news = new News();
        news.setStatus("通过");
        news.setNewsTypeId(typeId);
        request.getSession().setAttribute("newsTypeId", typeId);
        // 获取新闻条数
        List<News> tList = ias.getNewss(news);
        if (tList != null) {
            request.getSession().setAttribute("newsSize", tList.size());
            if (tList.isEmpty()) {
                request.getSession().setAttribute("info", "当前类别没有新闻");
                request.getSession().setAttribute("newsSize", 0);
                request.removeAttribute("newsList");
            } else {
                if (page * 15 >= tList.size()) {
                    page = tList.size() / 15 + 1;
                }
                String orderBy = "time";
                if (request.getParameter("orderBy") != null) {
                    orderBy = request.getParameter("orderBy");
                } else if (request.getSession().getAttribute("orderBy") != null) {
                    orderBy = (String) request.getSession().getAttribute("orderBy");
                }
                request.getSession().setAttribute("orderBy", orderBy);
                request.getSession().setAttribute("newsPage", page);
                // 配置新闻列表
                List<News> pageNews = DBUtil.getObjectLimit("news", orderBy, news, (page - 1) * 15, 15);
                request.getSession().setAttribute("newsList", pageNews);
                // 获得置顶新闻列表
                List<News> zdlist = DBUtil.getObjectLikeLimit("news", orderBy, "buff", "DESC", news, "%置顶%", 0, 6);
                request.getSession().setAttribute("zdNewsList", zdlist);
            }
        } else {
            request.getSession().setAttribute("info", "当前类别没有新闻");
            request.getSession().setAttribute("newsSize", 0);
            request.removeAttribute("newsList");
        }
        ServletUtil.forward(request, response, "index.jsp");
    }
    /*
     * 根据新闻id删除新闻
     * 
     */

    protected void doRemove(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("newsId", "新闻编号不能为空")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            News news = ias.getNewsOfNewsId(tMap.get("par_newsId").toString());
            if (user.getUserId().endsWith(news.getUserId())) {
                news.setStatus("已删除");
                request.getSession().setAttribute("info", "删除成功");
                ias.updateOfNewsId(news, news.getNewsId());
                ServletUtil.redirect(request, response, servlet, "remove_to");
            } else {
                request.getSession().setAttribute("info", "权限不足");
                ServletUtil.redirect(request, response, servlet, "remove_from");
            }
        }
    }

    /**
     * 发布新闻
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doInsert(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        if (request.getParameter("newsId") != null) {
            doUpdate(request, response, servlet);
        }
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "insert_from")
                .addNp("title", "新闻标题不能为空")
                .addNp("body", "新闻内容不能为空")
                .addNp("newsTypeId", "新闻类型不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String insertNewDate = new Date().toLocaleString();
            User user = (User) tMap.get("ses_identity");
            Map<String, String> m = MapUtil.soss(tMap);
            News news = new News();
            news.setTitle(m.get("par_title"));
            news.setBody(m.get("par_body"));
            news.setNewsTypeId(m.get("par_newsTypeId"));
            if (request.getParameter("money") != null) {
                if (StringUtil.isBigInt(user.getMoney(), request.getParameter("money"))) {
                    news.setMoney(request.getParameter("money"));
                    user.setMoney(StringUtil.subInt(user.getMoney(), request.getParameter("money")));
                    ius.updateOfUserId(user, user.getUserId());
                } else {
                    request.getSession().setAttribute("newsBody", tMap.get("par_body").toString());
                    request.getSession().setAttribute("newsTitle", tMap.get("par_title").toString());
                    request.getSession().setAttribute("info", "阳光值不足" + request.getParameter("money") + "你当前拥有" + user.getMoney() + "阳光值");
                    ServletUtil.redirect(request, response, servlet, "insert_from");
                    return;
                }
            }
            request.getSession().removeAttribute("newsBody");
            request.getSession().removeAttribute("newsTitle");
            news.setTime(insertNewDate);
            news.setUserId(user.getUserId());
            news.setPath(user.getPath());
            ServletUtil.dataOfSetReqRedirect(request, response, servlet, "insert_to", "insert_from", "插入", ias.insert(news), "news");
        }

    }

    /**
     * 修改新闻
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doUpdate(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNp("title", "新闻标题不能为空")
                .addNp("body", "新闻内容不能为空")
                .addNp("newsTypeId", "新闻类型不能为空")
                .addNp("newsId", "新闻id不能为空")
                .addNs("identity", "请重新登录", "login_from")
                .build();
        if (tMap != null) {
            String insertNewDate = new Date().toLocaleString();
            User user = (User) tMap.get("ses_identity");
            Map<String, String> m = MapUtil.soss(tMap);
            News news = new News();
            news.setTitle(m.get("par_title"));
            news.setBody(m.get("par_body"));
            news.setNewsTypeId(m.get("par_newsTypeId"));
            news.setTime(insertNewDate);
            news.setNewsId(m.get("par_newsId"));
            news.setUserId(user.getUserId());
            ServletUtil.dataOfSetReqRedirect(request, response, servlet, "update_to", "update_from", "修改", ias.updateOfNewsIdAndUserId(news, m.get("par_newsId"), user.getUserId()), "news");
        }
    }

    /**
     * 获得全部信息
     *
     * @param request
     * @param response
     */
    protected synchronized void getAll(HttpServletRequest request,
            HttpServletResponse response) {
        if (new Date().getTime() - time >= speed) {
            time = new Date().getTime();
            getAllComment(request, response);
            getAllUser(request, response);
            getAllNews(request, response);
            getAllNewstypes(request, response);
        }
    }

    private synchronized void getAllComment(HttpServletRequest request,
            HttpServletResponse response) {
        Map<String, Comment> m = new HashMap();
        List<Comment> list = ics.getComments(new Comment());
        if (list != null) {
            for (Comment c : list) {
                m.put(c.getCommentId(), c);
            }
        }
        request.getServletContext().setAttribute("allComments", m);
    }

    private synchronized void getAllUser(HttpServletRequest request,
            HttpServletResponse response) {
        Map<String, User> m = new HashMap();
        List<User> list = ius.getUsers(new User());
        if (list != null) {
            for (User c : list) {
                m.put(c.getUserId(), c);
            }
        }
        request.getServletContext().setAttribute("allUsers", m);
    }

    private synchronized void getAllNews(HttpServletRequest request,
            HttpServletResponse response) {
        Map<String, News> m = new HashMap();
        List<News> list = ias.getNewss(new News());
        if (list != null) {
            for (News c : list) {
                m.put(c.getNewsId(), c);
            }
        }
        request.getServletContext().setAttribute("allNews", m);
    }

    private synchronized void getAllNewstypes(HttpServletRequest request,
            HttpServletResponse response) {
        Map<String, Newstype> m = new HashMap();
        List<Newstype> list = its.getNewstypes(new Newstype());
        if (list != null) {
            for (Newstype c : list) {
                m.put(c.getNewsTypeId(), c);
            }
        }
        request.getServletContext().setAttribute("allNewstypes", m);
    }
}
