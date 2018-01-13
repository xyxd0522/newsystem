package com.news.linglian.factoryImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ServletUtil;
import util.StringListBuilder;

import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.IUserService;
import com.news.linglian.serviceImpl.IUserServiceImpl;
/**
 * 
 * IUserFactoryImpl.java
 * @author wcx
 *
 * @Date: 2018年1月12日 下午12:53:55
 *
 */
public class IUserFactoryImpl implements IServletFactory {
	private IUserService ias = null;
	
	
	public IUserFactoryImpl() {
		ias = new IUserServiceImpl();	
	}
	/**
	 * 接受页面请求
	 */
	@Override
	public void doThing(HttpServletRequest request,
			HttpServletResponse response, HttpServlet serlvet,
			String factoryName) throws ServletException, IOException {
		// TODO Auto-generated method stub
		switch (factoryName) {
		case "login":
			doLogin(request, response, serlvet);
			break;
		case "remove":
			doRemove(request, response, serlvet);
			break;
		case "insert":
			doInsert(request, response, serlvet);
			break;
		case "update":
			doUpdate(request, response, serlvet);
			break;
		case "query":
			doQuery(request, response, serlvet);
			break;
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
		String userId = request.getParameter("userId");
		if(ServletUtil.checkIdentity(request, response, servlet, "query_from")){
			String[] a={userId,"用户id"};
			List<String[] > list= new ArrayList<String[] >();
			list.add(a);
			if(ServletUtil.isNull(request, response, servlet, "query_from", list)){
			if((ias.getUserOfUserId(userId))==null){
				request.getSession().setAttribute("info", "获取失败");
				ServletUtil.redirect(request, response, servlet, "query_from");
			}else{
				request.getSession().setAttribute("info", "获取成功");
				request.getSession().setAttribute("user", ias.getUserOfUserId(userId));
				ServletUtil.forward(request, response, servlet, "query_to");
			}
		}
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
		String email =request.getParameter("email");
		String username =request.getParameter("username");
		String password =request.getParameter("pass");
		String repassword =request.getParameter("repass");
		String quiz1 =request.getParameter("quiz1");
		String quiz2 =request.getParameter("quiz2");
		String quiz3 =request.getParameter("quiz3");
		String vercode = request.getParameter("vercode");
		List<String[] > list = new StringListBuilder()
				.addString(email, "邮箱")
				.addString(username, "昵称")
				.addString(password, "密码")
				.addString(repassword, "重复密码")
				.addString(quiz1, "省份")
				.addString(quiz2, "城市")
				.addString(quiz3, "区/县")
				.addString(vercode, "验证码")
				.build();
		if(ServletUtil.isNull(request, response, servlet, "insert_from", list)){
			if(!request.getSession().getAttribute("token").toString().equals(vercode)){
				request.getSession().setAttribute("info", "验证码错误");
	    		ServletUtil.redirect(request, response,servlet,"insert_from");					
			} else if (password.equals(repassword)) {
				User user =new User();
				user.setName(username);
				user.setEmail(email);
				user.setPassword(password);
				user.setPath(quiz1+","+quiz2+","+quiz3);
				System.out.println(user.getPath());
				ServletUtil.checkdata(request, response, servlet, "insert_from", "插入", ias.insert(user));
			} else {
				request.getSession().setAttribute("info", "二次密码不相同");
	    		ServletUtil.redirect(request, response,servlet,"insert_from");			
			}
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
			String userid = request.getParameter("userid");
		if(ServletUtil.checkIdentity(request, response, servlet, "remove_from")){
			String[] a={userid,"用户id"};
			List<String[] > list= new ArrayList<String[] >();
			list.add(a);
			if(ServletUtil.isNull(request, response, servlet, "remove_from", list)){
				User user=new User();
				user.setUserId(userid);
				ServletUtil.checkdata(request, response, servlet, "remove_from", "删除", ias.removeOfBUserIds(userid));	
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
		// TODO Auto-generated method stub		
		String email =request.getParameter("email");
		String password = request.getParameter("pass");
		String vercode = request.getParameter("vercode");
		String[] a={email,"邮箱"};
		String[] b={password,"密码"};
		String[] c={vercode,"验证码"};
		List<String[] > list= new ArrayList<String[] >();
		list.add(a);
		list.add(b);
		list.add(c);
		if(ServletUtil.isNull(request, response, servlet, "login_from", list)){
			if(request.getSession().getAttribute("token").equals(vercode)){
				request.getSession().setAttribute("info", "验证码错误");
	    		ServletUtil.redirect(request, response,servlet,"login_from");					
			}else{
			User user= ias.getUserOfPasswordAndEmail(password, email);
			if (user == null) {
				request.getSession().setAttribute("info", "邮箱或者密码错误!");
				ServletUtil.redirect(request, response, servlet, "login_from");
			} else {
				request.getSession().setAttribute("identity", user);
				request.getSession().setAttribute("info", "登录成功!");
				ServletUtil.redirect(request, response, servlet, "login_to");
			}
		}
		}
	}

}

















