package com.news.linglian.factoryImpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ServletCheckBuilder;
import util.ServletUtil;
import util.StringArrayListBuilder;

import com.news.linglian.entity.User;
import com.news.linglian.factory.IServletFactory;
import com.news.linglian.service.IUserService;
import com.news.linglian.serviceImpl.IUserServiceImpl;

import util.MapUtil;

/**
 *
 * IUserFactoryImpl.java
 *
 * @author wcx
 *
 * @Date: 2018年1月12日 下午12:53:55
 *
 */
public class IUserFactoryImpl implements IServletFactory {

	@Override
	public void doThing(HttpServletRequest request,
			HttpServletResponse response, HttpServlet serlvet,
			String factoryName) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
