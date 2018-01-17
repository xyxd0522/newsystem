/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.factoryImpl;

import com.news.linglian.entity.News;
import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.MapUtil;
import util.ServletCheckBuilder;

public class IAdminFactoryImpl implements IServletFactory {

    private INewsService ias = null;
    private INewstypeService its = null;
    private IUserService ius = null;
    private ICommentService ics = null;
    private IEmailService ies = null;

    public IAdminFactoryImpl() {
        ias = new INewsServiceImpl();
        its = new INewstypeServiceImpl();
        ius = new IUserServiceImpl();
        ics = new ICommentServiceImpl();
        ies = new IEmailServiceImpl();
    }

    @Override
    public void doThing(HttpServletRequest request, HttpServletResponse response,
            HttpServlet servlet, String method) throws ServletException, IOException {
        // TODO Auto-generated method stub
        switch (method) {
            case "change":
                doChange(request, response, servlet);
                break;
            case "add":
                doAdd(request, response, servlet);
                break;
            case "del":
                doDel(request, response, servlet);
                break;
        }
    }

    /**
     * 删除属性
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doDel(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("par", "请选择要删除的属性")
                .addNp("parVal", "请选择要删除的值")
                .addNp("newsId", "请选择要删除的新闻编号")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                String par = m.get("par_par");
                if ("buff".equals(par)) {
                    String newsId = m.get("par_newsId");
                    String val = m.get("par_parVal");
                    News news = ias.getNewsOfNewsId(newsId);
                    String strs = news.getBuff();
                    if (strs != null) {
                        news.setBuff("");
                        List<String> tStrList = new ArrayList();
                        String[] stra = strs.split(",");
                        for (String s : stra) {
                            if (!val.equals(s)) {
                                tStrList.add(s);
                            }
                        }
                        System.out.println(tStrList);
                        for (String s : tStrList) {
                            news.setBuff(news.getBuff() + "," + s);
                        }
                    }
                    ias.updateOfNewsId(news, newsId);
                }
            }
        }
    }

    /**
     * 追加属性
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doAdd(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("par", "请选择要追加的属性")
                .addNp("parVal", "请选择要追加的值")
                .addNp("newsId", "请选择要追加的新闻编号")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                String par = m.get("par_par");
                if ("buff".equals(par)) {
                    String newsId = m.get("par_newsId");
                    String val = m.get("par_parVal");
                    News news = ias.getNewsOfNewsId(newsId);
                    String strs = news.getBuff();
                    if (strs != null && !"".equals(strs)) {
                        String[] stra = strs.split(",");
                        boolean flag = true;
                        for (String s : stra) {
                            if (val.equals(s)) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) { // 不存在此buff的时候
                            news.setBuff(strs + "," + val);
                        }
                    } else { // 没有buff是的时候
                        news.setBuff(val);
                    }
                    ias.updateOfNewsId(news, newsId);
                }
            }
        }
    }

    /**
     * 更改属性
     *
     * @param request
     * @param response
     * @param servlet
     * @throws ServletException
     * @throws IOException
     */
    protected void doChange(HttpServletRequest request,
            HttpServletResponse response, HttpServlet servlet)
            throws ServletException, IOException {
        Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
                .addNs("identity", "请重新登录", "login_from")
                .addNp("par", "请选择要修改的属性")
                .addNp("parVal", "请选择要修改的值")
                .addNp("newsId", "请选择要修改的新闻编号")
                .build();
        if (tMap != null) {
            User user = (User) tMap.get("ses_identity");
            if ("-99".equals(user.getLvl())) {
                Map<String, String> m = MapUtil.soss(tMap);
                String par = m.get("par_par");
                if ("status".equals(par)) {
                    String newsId = m.get("par_newsId");
                    String val = m.get("par_parVal");
                    News news = new News();
                    news.setStatus(val);
                    ias.updateOfNewsId(news, newsId);
                }
            }
        }
    }

}
