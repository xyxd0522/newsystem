package com.news.linglian.serviceImpl;

import java.util.Date;

import com.news.linglian.entity.Admin;
import com.news.linglian.service.IAdminService;

/**
 * 
 * IAdminServiceImplOfBad.java
 * @author wcx
 *
 * @Date: 2018年1月10日 下午10:30:58
 *
 */
public class IAdminServiceImplOfBad implements IAdminService {

	@Override
	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeAdmin(String adminid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Admin admin) {
		// TODO Auto-generated method stub
		return 1 ;
	}

	@Override
	public Admin getAdmin(String adminid) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		admin.setAdminid(adminid);
		admin.setAdminname(new Date().toLocaleString());
		return admin;
	}

	@Override
	public Admin getAdmin(String adminid, String password) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		admin.setAdminid(adminid);
		admin.setPassword(password);
		admin.setAdminname(new Date().toLocaleString());
		return admin;
	}

}
