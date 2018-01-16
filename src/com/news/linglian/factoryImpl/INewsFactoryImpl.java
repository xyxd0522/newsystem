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
import com.news.linglian.serviceN.IUserServiceN;
import com.news.linglian.serviceNImpl.IUserServiceNImpl;
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
		case "queryUnNew":
			doQueryUnNew(request, response, servlet);
			break;
		case "queryAuNew":
			doQueryAuNew(request, response, servlet);
			break;
		case "reviewNews":
			doReviewNews(request, response, servlet);
			break;
		case "adminRemove":
			doAdminRemove(request, response, servlet);
			break;
		case "adminRemoves":
			doAdminRemoves(request, response, servlet);
			break;
		}
	}
	/**
	 * 查看新闻详情
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
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
	/**
	 * 普通用户删除自身发布新闻
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doRemove(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "remove_from")
		.addNp("newsId", "新闻id不能为空")
		.addNs("identity", "请重新登录", "login_from")
		.build();
		if (tMap != null) {
			User user = (User) tMap.get("ses_identity");
			System.out.println(user.getUserId());
			Map<String, String> m = MapUtil.soss(tMap);
			ServletUtil.dataOfSetReqRedirect(request, response, servlet, "remove_to", "remove_from", "删除", ias.removeOfNewsIdAndUserId(m.get("par_newsId"), user.getUserId()), "news");
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
		.addNs("identity", "请重新登录", "login_from")
		.build();
		if (tMap != null) {
			SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String insertNewDate = tempDate.format(new Date(System.currentTimeMillis()));
			System.out.println(insertNewDate);
			User user = (User) tMap.get("ses_identity");
			System.out.println(user.getPath());
			System.out.println(user.getUserId());
			Map<String, String> m = MapUtil.soss(tMap);
			News news =new News();
			news.setTitle(m.get("par_title"));
			news.setBody(m.get("par_body"));
			news.setNewsTypeId(m.get("par_newsTypeId"));
			news.setTime(insertNewDate);
			news.setUserId(user.getUserId());
			news.setPath(user.getPath());
			System.out.println(news);
			ServletUtil.dataOfSetReqRedirect(request, response, servlet, "insert_to", "insert_from", "插入", ias.insert(news), "news");
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
		Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "update_from")
		.addNp("title","新闻标题不能为空")
		.addNp("body", "新闻内容不能为空")
		.addNp("newsTypeId", "新闻类型不能为空")
		.addNp("newsId", "新闻id不能为空")
		.addNs("identity", "请重新登录", "login_from")
		.build();
		if (tMap != null) {
			SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String insertNewDate = tempDate.format(new Date(System.currentTimeMillis()));
			System.out.println(insertNewDate);
			User user = (User) tMap.get("ses_identity");
			System.out.println(user.getUserId());
			Map<String, String> m = MapUtil.soss(tMap);
			News news =new News();
			news.setTitle(m.get("par_title"));
			news.setBody(m.get("par_body"));
			news.setNewsTypeId(m.get("par_newsTypeId"));
			news.setTime(insertNewDate);
			news.setNewsId(m.get("par_newsId"));
			news.setUserId(user.getUserId());
			System.out.println(news);
			ServletUtil.dataOfSetReqRedirect(request, response, servlet, "update_to", "update_from", "修改", ias.updateOfNewsIdAndUserId(news, m.get("par_newsId"), user.getUserId()), "news");
		}
	}
	/**
	 * 显示所有待审核的新闻(8条为一页)
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doQueryUnNew(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub	
		List<News> allUnNews = new ArrayList<News>();
		allUnNews=ias.getNewssOfStatus("待审核");
		System.out.println(allUnNews);
		if(allUnNews==null){
			request.getSession().setAttribute("info", "获取失败");
			ServletUtil.forward(request, response, servlet, "queryUnNew_from");
		}else{
		String page = request.getParameter("page");
		if (ServletUtil.equalOfObject(page, null)) {
			page = "1";
		}
		List<News> pageUnNews = new ArrayList<News>();
		for(int i =0; i<8 && i < allUnNews.size(); i++)
		{
			pageUnNews.add(allUnNews.get(((Integer.parseInt(page)-1)*8)+i));
		}
		request.getSession().setAttribute("info", "获取成功");
		request.setAttribute("pageUnNews", pageUnNews);
		ServletUtil.forward(request, response, servlet, "queryUnNew_to");
		}
	}
	/**
	 * 显示所有已审核的新闻(8条为一页)
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doQueryAuNew(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub	
		List<News> allAuNews = new ArrayList<News>();
		allAuNews=ias.getNewssOfStatus("已审核");
		System.out.println(allAuNews);
		if(allAuNews==null){
			request.getSession().setAttribute("info", "获取失败");
			ServletUtil.forward(request, response, servlet, "queryAuNew_from");
		}else{
		String page = request.getParameter("page");
		if (ServletUtil.equalOfObject(page, null)) {
			page = "1";
		}
		List<News> pageAuNews = new ArrayList<News>();
		for(int i =0; i<8 && i < allAuNews.size(); i++)
		{
			pageAuNews.add(allAuNews.get(((Integer.parseInt(page)-1)*8)+i));
		}
		request.getSession().setAttribute("info", "获取成功");
		request.setAttribute("pageAuNews", pageAuNews);
		ServletUtil.forward(request, response, servlet, "queryAuNew_to");
		}
	}
	/**
	 * 审核新闻
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doReviewNews(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "reviewNews_from")
	.addNp("newsId", "新闻id不能为空")
	//.addNs("identity", "请重新登录", "login_from")
	.build();
	if (tMap != null) {
		Map<String, String> m = MapUtil.soss(tMap);
		News news =new News();
		news.setStatus("已审核");
		ServletUtil.dataOfSetReqRedirect(request, response, servlet, "reviewNews_to", "reviewNews_from", "审核", ias.updateOfNewsId(news,m.get("par_newsId")), "news");
		
	}
		
	}
	
	/**
	 * 管理员删除单个新闻
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doAdminRemove(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "adminRemove_from")
		.addNp("newsId", "新闻id不能为空")
		//.addNs("identity", "请重新登录", "login_from")
		.build();
		if (tMap != null) {
			Map<String, String> m = MapUtil.soss(tMap);
			ServletUtil.dataOfSetReqRedirect(request, response, servlet, "adminRemove_to", "adminRemove_from", "删除", ias.removeOfNewsId(m.get("par_newsId")), "news");
		}
	}
	/**
	 * 管理员批量删除新闻
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doAdminRemoves(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] newsIds =request.getParameterValues("newsIds");
		for(int i=0;i<newsIds.length;i++){
			int isRemove=ias.removeOfNewsId(newsIds[i]);
			if(isRemove==0){
				request.getSession().setAttribute("info", "删除失败");
	            ServletUtil.redirect(request, response, servlet,"adminRemoves_from");
			}
		}
		request.getSession().setAttribute("info", "删除成功");
        ServletUtil.redirect(request, response, servlet,"adminRemoves_to");
	}
}
