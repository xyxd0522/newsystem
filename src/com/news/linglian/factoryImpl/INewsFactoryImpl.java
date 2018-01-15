package com.news.linglian.factoryImpl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.MapUtil;
import util.ServletCheckBuilder;
import util.ServletUtil;
import util.StringArrayListBuilder;

import com.news.linglian.action.NewsAction;
import com.news.linglian.entity.News;
import com.news.linglian.entity.Newstype;
import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.INewsService;
import com.news.linglian.service.IUserService;
import com.news.linglian.serviceImpl.INewsServiceImpl;
import com.news.linglian.serviceImpl.IUserServiceImpl;
/**
 * 
 * INewsFactoryImpl.java
 * @author wcx
 *
 * @Date: 2018年1月13日 上午9:33:48
 *
 */
public class INewsFactoryImpl implements IServletFactory {

	private INewsService ias = null;
	
	
	public INewsFactoryImpl() {
		ias = new INewsServiceImpl();	
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
		}
	}
	/*
	 * 根据id查询新闻详情
	 */
	protected void doQueryOfId(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub		
		String newsId =request.getParameter("newsId");
		List<String[] > list = new StringArrayListBuilder()
		.addString(newsId,"新闻id")
		.build();
		if(ServletUtil.isNull(request, response, servlet, "queryOfId_from", list)){
		if((ias.getNewsOfNewsId(newsId))==null){
			request.getSession().setAttribute("info", "获取失败");
			ServletUtil.redirect(request, response, servlet, "queryOfId_from");
		}else{
			request.getSession().setAttribute("info", "获取成功");
			request.getSession().setAttribute("news", ias.getNewsOfNewsId(newsId));
			ServletUtil.forward(request, response, servlet, "queryOfId_to");
			
		}
	}
	}
	/**
	 * 列出所有新闻
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doQueryAll(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<News> allNews = new ArrayList<News>();
		allNews=ias.getNewss(new News());
		System.out.println(allNews);
		String page = request.getParameter("page");
		if (ServletUtil.equalOfObject(page, null)) {
			page = "1";
		}
		List<News> pageNews = new ArrayList<News>();
		for(int i =0; i<10 && i < allNews.size(); i++)
		{
			pageNews.add(allNews.get(((Integer.parseInt(page)-1)*10)+i));
		}
		request.getSession().setAttribute("info", "获取成功");
		request.setAttribute("pageNews", pageNews);
		ServletUtil.forward(request, response, servlet, "queryAll_to");
		
	}
	/*
	 * 根据新闻id删除新闻
	 * 
	 */
	protected void doRemove(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String newsId =request.getParameter("newsId");
		if(ServletUtil.checkIdentity(request, response, servlet, "remove_from")){
			List<String[] > list = new StringArrayListBuilder()
			.addString(newsId,"新闻id")
			.build();
			if(ServletUtil.isNull(request, response, servlet, "remove_from", list)){
				ServletUtil.checkdata(request, response, servlet, "remove_from", "删除", ias.removeOfNewsId(newsId));	
			}
		}		
	}
	/**
	 * 发布新闻
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doInsert(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "insert_from")
		.addNp("title","新闻标题不能为空")
		.addNp("body", "新闻内容不能为空")
		.addNp("newsTypeId", "新闻类型不能为空")
		.addNp("userId", "用户id不能为空")
		.build();
		if (tMap != null) {
			SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String insertNewDate = tempDate.format(new Date(System.currentTimeMillis()));
			System.out.println(insertNewDate);
			Map<String, String> m = MapUtil.soss(tMap);
			News news =new News();
			news.setTitle(m.get("par_title"));
			news.setBody(m.get("par_body"));
			news.setNewsTypeId(m.get("par_newsTypeId"));
			news.setUserId(m.get("userId"));
			news.setTime(insertNewDate);
			System.out.println(news);
			ServletUtil.checkdata(request, response, servlet, "insert_from", "插入", ias.insert(news));
			
		}
		
	}
	
	/**
	 * 修改新闻
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
		String title = request.getParameter("title");
		String body=request.getParameter("body");
		String newsTypeId =request.getParameter("newsTypeId");
		String money =request.getParameter("money");
		String newsId =request.getParameter("newsId");
		List<String[] > list = new StringArrayListBuilder()
		.addString(title,"标题")
		.addString(body,"内容")
		.addString(newsTypeId,"新闻类型")
		.addString(money,"阳光值")
		.addString(newsId,"新闻编号")
		.build();
		if(ServletUtil.isNull(request, response, servlet, "update_from", list)){
			News news =new News();
			news.setNewsTypeId(newsTypeId);
			news.setBody(body);
			news.setTitle(title);
			news.setNewsId(newsId);
			ServletUtil.checkdata(request, response, servlet, "update_from", "修改", ias.updateOfNewsId(news, newsId));
		}
	}
	
}
