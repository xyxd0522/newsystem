package com.news.linglian.dao;

import java.util.List;

import com.news.linglian.entity.Admin;

public interface IAdminDao {
	public int updateAdmin(Admin admin);

	public int removeAdmin(Admin admin);

	public int removeAdmin(String adminid);

	public int insert(Admin admin);

	public Admin getAdmin(String adminid);

	public Admin getAdmin(String adminid, String password);

	public List<Admin> getAdmins(Admin admin);
}
