package com.news.linglian.factoryImpl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.IAdminService;
import com.news.linglian.service.IUserService;
import com.news.linglian.serviceImpl.IAdminServiceImpl;
import com.news.linglian.serviceImpl.IUserServiceImpl;

public class IUserFactoryImpl implements IServletFactory {
	private IUserService ias = null;
	
	
	public IUserFactoryImpl() {
		ias = new IUserServiceImpl();
		
	}
	@Override
	public void doThing(HttpServletRequest request,
			HttpServletResponse response, HttpServlet serlvet,
			String factoryName) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
