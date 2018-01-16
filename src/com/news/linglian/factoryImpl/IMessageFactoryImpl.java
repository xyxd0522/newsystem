package com.news.linglian.factoryImpl;

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
import util.ServletUtil;

import com.news.linglian.entity.Email;
import com.news.linglian.entity.News;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.IEmailService;
import com.news.linglian.serviceImpl.IEmailServiceImpl;
import com.news.linglian.serviceNImpl.IUserServiceNImpl;

public class IMessageFactoryImpl implements IServletFactory {
	private IEmailService ias =null;
	 public IMessageFactoryImpl() {

	        ias = new IEmailServiceImpl();

	    }
	@Override
	public void doThing(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet,
			String factoryName) throws ServletException, IOException {
		// TODO Auto-generated method stub
		switch (factoryName) {
		case "query":
			doQuery(request, response, servlet);
			break;
		case "remove":
			doRemove(request, response, servlet);
			break;
		case "queryDetails":
			doQueryDetails(request, response, servlet);
			break;
		}

	}
	/**
	 * 显示所有留言
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doQuery(HttpServletRequest request,

            HttpServletResponse response, HttpServlet servlet)

            throws ServletException, IOException {

        // TODO Auto-generated method stub
		Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "query_from")
		//.addNs("identity", "请重新登录", "login_from")
		.build();
		if (tMap != null) {
			List<Email> allMessages = new ArrayList<Email>();
			allMessages=ias.getEmailsOfToUserId("1");
			System.out.println(allMessages);
			if(allMessages==null){
				request.getSession().setAttribute("info", "获取失败");
				ServletUtil.forward(request, response, servlet, "query_from");
			}else{
			String page = request.getParameter("page");
			if (ServletUtil.equalOfObject(page, null)) {
				page = "1";
			}
			List<Email> pageMessages = new ArrayList<Email>();
			for(int i =0; i<10 && i < allMessages.size(); i++)
			{
				pageMessages.add(allMessages.get(((Integer.parseInt(page)-1)*10)+i));
			}
			request.getSession().setAttribute("info", "获取成功");
			request.setAttribute("pageMessages", pageMessages);
			ServletUtil.forward(request, response, servlet, "query_to");
		}
		}
		
	}
	/**
	 * 管理员删除单个留言
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
		.addNp("emailId", "邮箱id不能为空")
		//.addNs("identity", "请重新登录", "login_from")
		.build();
		if (tMap != null) {
			Map<String, String> m = MapUtil.soss(tMap);
			ServletUtil.dataOfSetReqRedirect(request, response, servlet, "remove_to", "remove_from", "删除", ias.removeOfEmailId(m.get("par_emailId")), "email");
		}
		
	}
	/**
	 * 获取留言详情
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doQueryDetails(HttpServletRequest request,

            HttpServletResponse response, HttpServlet servlet)

            throws ServletException, IOException {

        // TODO Auto-generated method stub
		Map<String, Object> tMap = new ServletCheckBuilder(request, response, servlet, "queryDetails_from")
		.addNp("emailId", "邮箱id不能为空")
		//.addNs("identity", "请重新登录", "login_from")
		.build();
		if (tMap != null) {
			Map<String, String> m = MapUtil.soss(tMap);
			ServletUtil.dataOfSetReqRedirect(request, response, servlet, "queryDetails_to", "queryDetails_from", "查询", ias.getEmailOfEmailId(m.get("par_emailId")), "email");
		}
	}
	
	

}	
