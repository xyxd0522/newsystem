package com.news.linglian.factoryImpl;

import java.io.IOException;
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
			HttpServletResponse response, HttpServlet serlvet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String adminid = request.getParameter("adminid");
		if (request.getSession().getAttribute("identity") == null) {
			request.getSession().setAttribute("info", "请重新登录");
			ServletUtil.redirect(request, response, serlvet, "login_from");
			return;
		}
		if (!(request.getSession().getAttribute("identity") instanceof Admin)) {
			request.getSession().setAttribute("info", "权限不足");
			ServletUtil.redirect(request, response, serlvet, "query_from");
			return;
		}
		if("".equals(adminid)){
			request.getSession().setAttribute("info", "管理员id不能为空");
			ServletUtil.redirect(request, response, "query_from");
		}else{
			if(ias.getAdmin(adminid)==null){
				request.getSession().setAttribute("info", "获取失败");
				ServletUtil.redirect(request, response, serlvet, "query_from");
			}else{
				request.getSession().setAttribute("info", "获取成功");
				ServletUtil.forward(request, response, serlvet, "query_to");
			}
		}
		
	}
	
	/**
	 * 修改
	 * 
	 */
	
	protected void doUpdate(HttpServletRequest request,
			HttpServletResponse response, HttpServlet serlvet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String adminid =request.getParameter("adminid");
		String adminname =request.getParameter("adminname");
		String password =request.getParameter("password");
		System.out.println(adminid);
		if (request.getSession().getAttribute("identity") == null) {
			request.getSession().setAttribute("info", "请重新登录");
			ServletUtil.redirect(request, response, serlvet, "login_from");
			return;
		}
		if (!(request.getSession().getAttribute("identity") instanceof Admin)) {
			request.getSession().setAttribute("info", "权限不足");
			ServletUtil.redirect(request, response, serlvet, "update_from");
			return;
		}
		if("".equals(adminid)){
			request.getSession().setAttribute("info", "管理员id不能为空");
			ServletUtil.redirect(request, response, "update_from");
		}else if("".equals(adminname)){
			request.getSession().setAttribute("info", "管理员姓名不能为空");
			ServletUtil.redirect(request, response, "update_from");
		}else if("".equals(password)){
			request.getSession().setAttribute("info", "密码不能为空!");
			ServletUtil.redirect(request, response, serlvet, "update_from");
		}else{
			Admin admin =new Admin();
			admin.setAdminid(adminid);
			admin.setAdminname(adminname);
			admin.setPassword(password);
			if(ias.updateAdmin(admin)==0){
				request.getSession().setAttribute("info", "修改失败");
				ServletUtil.redirect(request, response, serlvet, "update_from");
			} else {
				request.getSession().setAttribute("info", "修改成功");
				ServletUtil.redirect(request, response, serlvet, "update_to");
			}
		}
	}
	
	/**
	 * 插入
	 * 
	 */
	protected void doInsert(HttpServletRequest request,
			HttpServletResponse response, HttpServlet serlvet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String adminid =request.getParameter("adminid");
		String adminname =request.getParameter("adminname");
		String password =request.getParameter("password");
		if (request.getSession().getAttribute("identity") == null) {
			request.getSession().setAttribute("info", "请重新登录");
			ServletUtil.redirect(request, response, serlvet, "login_from");
			return;
		}
		if (!(request.getSession().getAttribute("identity") instanceof Admin)) {
			request.getSession().setAttribute("info", "权限不足");
			ServletUtil.redirect(request, response, serlvet, "insert_from");
			return;
		}
		if("".equals(adminid)){
			request.getSession().setAttribute("info", "管理员id不能为空");
			ServletUtil.redirect(request, response, "insert_from");
		}else if("".equals(adminname)){
			request.getSession().setAttribute("info", "管理员姓名不能为空");
			ServletUtil.redirect(request, response, "insert_from");
		}else if("".equals(password)){
			request.getSession().setAttribute("info", "密码不能为空!");
			ServletUtil.redirect(request, response, serlvet, "insert_from");
		}else{
			Admin admin =new Admin();
			admin.setAdminid(adminid);
			admin.setAdminname(adminname);
			admin.setPassword(password);
			if(ias.insert(admin)==0){
				request.getSession().setAttribute("info", "插入失败");
				ServletUtil.redirect(request, response, serlvet, "insert_from");
			}else{
				request.getSession().setAttribute("info", "插入成功");
				ServletUtil.redirect(request, response, serlvet, "insert_to");
				
			}
		}
		
	}
	/**
	 * 删除
	 * 
	 */
	protected void doRemove(HttpServletRequest request,
			HttpServletResponse response, HttpServlet serlvet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String adminid =request.getParameter("adminid");
		if (request.getSession().getAttribute("identity") == null) {
			request.getSession().setAttribute("info", "请重新登录");
			ServletUtil.redirect(request, response, serlvet, "login_from");
			return;
		}
		if (!(request.getSession().getAttribute("identity") instanceof Admin)) {
			request.getSession().setAttribute("info", "权限不足");
			ServletUtil.redirect(request, response, serlvet, "remove_from");
			return;
		}
		if("".equals(adminid)){
			request.getSession().setAttribute("info", "管理员id不能为空");
			ServletUtil.redirect(request, response, "remove_from");
		}else{
			Admin admin =new Admin();
			admin.setAdminid(adminid);
			if(ias.removeAdmin(admin)==0){
				request.getSession().setAttribute("info", "删除失败");
				ServletUtil.redirect(request, response, serlvet, "remove_from");
			}else{
				request.getSession().setAttribute("info", "删除成功");
				ServletUtil.redirect(request, response, serlvet, "remove_to");
			}	
		}
	}
	
	/**
	 * 登录
	 * 
	 */
	protected void doLogin(HttpServletRequest request,
			HttpServletResponse response, HttpServlet serlvet)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String adminid = request.getParameter("adminid");
		String password = request.getParameter("password");
		if ("".equals(adminid)) {
			request.getSession().setAttribute("info", "管理员id不能为空!");
			ServletUtil.forward(request, response, serlvet, "login_from");
		} else if ("".equals(password)) {
			request.getSession().setAttribute("info", "密码不能为空!");
			ServletUtil.redirect(request, response, serlvet, "login_from");
		} else {
			Admin admin = ias.getAdmin(adminid, password);
			if (admin == null) {
				request.getSession().setAttribute("info", "账号或者密码错误!");
				ServletUtil.redirect(request, response, serlvet, "login_from");
			} else {
				request.getSession().setAttribute("identity", admin);
				request.getSession().setAttribute("info", "登录成功!");
				ServletUtil.redirect(request, response, serlvet, "login_to");
			}
		}
	}

}
