package com.news.linglian.entity;

/**
 * 
 * @project newsystem
 *
 * @class com.news.linglian.entity Admin.java
 *
 * @author linglian
 *
 * @date 2018年1月11日 上午9:46:58
 *
 */
public class Admin {
	private String adminid;
	private String adminname;
	public String password;

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname
				+ ", password=" + password + "]";
	}

}
