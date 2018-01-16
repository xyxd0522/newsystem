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

import com.news.linglian.entity.News;
import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.serviceN.IUserServiceN;
import com.news.linglian.serviceNImpl.IUserServiceNImpl;

public class IAdminFactoryImpl implements IServletFactory {
	
	private IUserServiceN ias = null;

	   

    public IAdminFactoryImpl() {

        ias = new IUserServiceNImpl();

    }
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
            case "queryAll":
            	doQueryAll(request, response, servlet);

        }

    }

	private void doInsert(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet) {
		// TODO Auto-generated method stub
		
	}
	private void doUpdate(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet) {
		// TODO Auto-generated method stub
		
	}
	private void doQuery(HttpServletRequest request,
			HttpServletResponse response, HttpServlet servlet) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 获取所有用户
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

        // TODO Auto-generated method stub
    	List<User> allUser = new ArrayList<User>();
		allUser=ias.getUsers(new User());
		System.out.println(allUser.get(0));
		if(allUser==null){
			request.getSession().setAttribute("info", "获取失败");
			ServletUtil.forward(request, response, servlet, "queryAll_from");
		}else{
    	String page = request.getParameter("page");
		if (ServletUtil.equalOfObject(page, null)) {
			page = "1";
		}
		List<User> pageUser = new ArrayList<User>();
		for(int i =0; i<8 && i < allUser.size(); i++)
		{
			pageUser.add(allUser.get(((Integer.parseInt(page)-1)*8)+i));
		}
		request.getSession().setAttribute("info", "获取成功");
		request.setAttribute("pageUser", pageUser);
		ServletUtil.forward(request, response, servlet, "queryAll_to");
		}
	}
	/**
	 * 删除用户
	 * @param request
	 * @param response
	 * @param servlet
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doRemove(HttpServletRequest request,

            HttpServletResponse response, HttpServlet servlet)

            throws ServletException, IOException {
	}


}
