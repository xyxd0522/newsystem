package com.news.linglian.factoryImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.linglian.util.ServletUtil;
import com.news.linglian.entity.Admin;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.IAdminService;
import com.news.linglian.serviceImpl.IAdminServiceImpl;
import com.news.linglian.serviceImpl.IAdminServiceImplOfBad;
/**
 * 
 * IAdminFactoryImpl.java
 * @author wcx
 *
 * @Date: 2018年1月11日 上午8:59:23
 *
 */


public class IAdminFactoryImpl implements IServletFactory {

	private IAdminService ias = null;
	
	
	public IAdminFactoryImpl() {
		ias = new IAdminServiceImplOfBad();
		
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
		String adminid = request.getParameter("adminid");
		if(ServletUtil.checkIdentity(request, response, servlet, "query_from")){
			String[] a={adminid,"管理员的id"};
			List<String[] > list= new ArrayList<String[] >();
			list.add(a);
			if(ServletUtil.isNull(request, response, servlet, "query_from", list)){
			if(ias.getAdmin(adminid)==null){
				request.getSession().setAttribute("info", "获取失败");
				ServletUtil.redirect(request, response, servlet, "query_from");
			}else{
				request.getSession().setAttribute("info", "获取成功");
				Admin admin=new Admin();
				admin=ias.getAdmin(adminid);
				request.getSession().setAttribute("admin", admin);
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
		String adminid =request.getParameter("adminid");
		String adminname =request.getParameter("adminname");
		String password =request.getParameter("password");
		if(ServletUtil.checkIdentity(request, response, servlet, "update_from")){
			String[] a={adminid,"管理员的id"};
			String[] b={adminname,"管理员的名字"};
			String[] c={password,"密码"};
			List<String[] > list= new ArrayList<String[] >();
			list.add(a);
			list.add(b);
			list.add(c);
			if(ServletUtil.isNull(request, response, servlet, "update_from", list)){
			Admin admin =new Admin();
			admin.setAdminid(adminid);
			admin.setAdminname(adminname);
			admin.setPassword(password);
			ServletUtil.checkdata(request, response, servlet, "update_from", "修改", ias.updateAdmin(admin));
		}
		}
	}
	
	
	/**
	 * 插入
	 * 
	 */
	protected void doInsert(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String adminid =request.getParameter("adminid");
		String adminname =request.getParameter("adminname");
		String password =request.getParameter("password");
		if(ServletUtil.checkIdentity(request, response, servlet, "insert_from")){
			String[] a={adminid,"管理员的id"};
			String[] b={adminname,"管理员的名字"};
			String[] c={password,"密码"};
			List<String[] > list= new ArrayList<String[] >();
			list.add(a);
			list.add(b);
			list.add(c);
			if(ServletUtil.isNull(request, response, servlet, "insert_from", list)){
			Admin admin =new Admin();
			admin.setAdminid(adminid);
			admin.setAdminname(adminname);
			admin.setPassword(password);
			ServletUtil.checkdata(request, response, servlet, "insert_from", "插入", ias.insert(admin));
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
		String adminid =request.getParameter("adminid");
		if(ServletUtil.checkIdentity(request, response, servlet, "remove_from")){
			String[] a={adminid,"管理员id"};
			List<String[] > list= new ArrayList<String[] >();
			list.add(a);
			if(ServletUtil.isNull(request, response, servlet, "remove_from", list)){
				Admin admin =new Admin();
				admin.setAdminid(adminid);
				ServletUtil.checkdata(request, response, servlet, "remove_from", "删除", ias.removeAdmin(admin));	
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
		String adminid = request.getParameter("adminid");
		String password = request.getParameter("password");
		String[] a={adminid,"管理员的id"};
		String[] b={password,"密码"};
		List<String[] > list= new ArrayList<String[] >();
		list.add(a);
		list.add(b);
		if(ServletUtil.isNull(request, response, servlet, "login_from", list)){
			Admin admin = ias.getAdmin(adminid, password);
			if (admin == null) {
				request.getSession().setAttribute("info", "账号或者密码错误!");
				ServletUtil.redirect(request, response, servlet, "login_from");
			} else {
				request.getSession().setAttribute("identity", admin);
				request.getSession().setAttribute("info", "登录成功!");
				ServletUtil.redirect(request, response, servlet, "login_to");
			}
		}
	}

}
