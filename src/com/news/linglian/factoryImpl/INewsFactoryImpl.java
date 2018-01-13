package com.news.linglian.factoryImpl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ServletUtil;
import util.StringListBuilder;

import com.news.linglian.entity.News;
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
		case "query":
			doQuery(request, response, servlet);
			break;
		}
	}
	/*
	 * 根据id查询新闻详情
	 */
	protected void doQuery(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String newsId =request.getParameter("newsId");
		List<String[] > list = new StringListBuilder()
		.addString(newsId,"新闻id")
		.build();
		if(ServletUtil.isNull(request, response, servlet, "query_from", list)){
		if((ias.getNewsOfNewsId(newsId))==null){
			request.getSession().setAttribute("info", "获取失败");
			ServletUtil.redirect(request, response, servlet, "query_from");
		}else{
			request.getSession().setAttribute("info", "获取成功");
			request.getSession().setAttribute("news", ias.getNewsOfNewsId(newsId));
			ServletUtil.forward(request, response, servlet, "query_to");
		}
	}
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
			List<String[] > list = new StringListBuilder()
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
		String title = request.getParameter("title");
		String body=request.getParameter("body");
		String newsTypeId =request.getParameter("newsTypeId");
		String UserId =request.getParameter("UserId");
		String money =request.getParameter("money");
		List<String[] > list = new StringListBuilder()
		.addString(title,"标题")
		.addString(body,"内容")
		.addString(newsTypeId,"新闻类型")
		.addString("UserId","发布人编号")
		.addString(money,"阳光值")
		.build();
		if(ServletUtil.isNull(request, response, servlet, "insert_from", list)){
			private IUserService ius =new IUserServiceImpl();
			
		}
		
	}
}
