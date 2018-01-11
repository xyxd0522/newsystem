package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Admin;

import com.news.linglian.dao.IAdminDao;
import com.news.linglian.daoImpl.IAdminDaoImpl;
import com.news.linglian.service.IAdminService;

public class IAdminServiceImpl implements IAdminService {
	IAdminDao dao = null;

	public IAdminServiceImpl() {
		dao = new IAdminDaoImpl();
	}
    public int update(Admin admin, Admin keyAdmin) {
        return dao.update(admin, keyAdmin);
    }
    public int updateOfAdminid(Admin admin, String adminid) {
        return dao.updateOfAdminid(admin, adminid);
    }
    public int updateOfAdminname(Admin admin, String adminname) {
        return dao.updateOfAdminname(admin, adminname);
    }
    public int updateOfPassword(Admin admin, String password) {
        return dao.updateOfPassword(admin, password);
    }
    public int updateOfAdminidAndAdminname(Admin admin, String adminid, String adminname) {
        return dao.updateOfAdminidAndAdminname(admin, adminid, adminname);
    }
    public int updateOfAdminidAndPassword(Admin admin, String adminid, String password) {
        return dao.updateOfAdminidAndPassword(admin, adminid, password);
    }
    public int updateOfAdminnameAndPassword(Admin admin, String adminname, String password) {
        return dao.updateOfAdminnameAndPassword(admin, adminname, password);
    }
    public int updateOfAdminidAndAdminnameAndPassword(Admin admin, String adminid, String adminname, String password) {
        return dao.updateOfAdminidAndAdminnameAndPassword(admin, adminid, adminname, password);
    }
    public int remove(Admin admin) {
        return dao.remove(admin);
    }
    public int removeOfAdminid(String adminid) {
        return dao.removeOfAdminid(adminid);
    }
    public int removeOfAdminname(String adminname) {
        return dao.removeOfAdminname(adminname);
    }
    public int removeOfPassword(String password) {
        return dao.removeOfPassword(password);
    }
    public int removeOfAdminidAndAdminname(String adminid, String adminname) {
        return dao.removeOfAdminidAndAdminname(adminid, adminname);
    }
    public int removeOfAdminidAndPassword(String adminid, String password) {
        return dao.removeOfAdminidAndPassword(adminid, password);
    }
    public int removeOfAdminnameAndPassword(String adminname, String password) {
        return dao.removeOfAdminnameAndPassword(adminname, password);
    }
    public int removeOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password) {
        return dao.removeOfAdminidAndAdminnameAndPassword(adminid, adminname, password);
    }
    public int insert(Admin admin) {
        return dao.insert(admin);
    }
    public int insertOfAdminid(String adminid) {
        return dao.insertOfAdminid(adminid);
    }
    public int insertOfAdminname(String adminname) {
        return dao.insertOfAdminname(adminname);
    }
    public int insertOfPassword(String password) {
        return dao.insertOfPassword(password);
    }
    public int insertOfAdminidAndAdminname(String adminid, String adminname) {
        return dao.insertOfAdminidAndAdminname(adminid, adminname);
    }
    public int insertOfAdminidAndPassword(String adminid, String password) {
        return dao.insertOfAdminidAndPassword(adminid, password);
    }
    public int insertOfAdminnameAndPassword(String adminname, String password) {
        return dao.insertOfAdminnameAndPassword(adminname, password);
    }
    public int insertOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password) {
        return dao.insertOfAdminidAndAdminnameAndPassword(adminid, adminname, password);
    }
    public Admin getAdmin(Admin admin) {
        return dao.getAdmin(admin);
    }
    public Admin getAdminOfAdminid(String adminid) {
        return dao.getAdminOfAdminid(adminid);
    }
    public Admin getAdminOfAdminname(String adminname) {
        return dao.getAdminOfAdminname(adminname);
    }
    public Admin getAdminOfPassword(String password) {
        return dao.getAdminOfPassword(password);
    }
    public Admin getAdminOfAdminidAndAdminname(String adminid, String adminname) {
        return dao.getAdminOfAdminidAndAdminname(adminid, adminname);
    }
    public Admin getAdminOfAdminidAndPassword(String adminid, String password) {
        return dao.getAdminOfAdminidAndPassword(adminid, password);
    }
    public Admin getAdminOfAdminnameAndPassword(String adminname, String password) {
        return dao.getAdminOfAdminnameAndPassword(adminname, password);
    }
    public Admin getAdminOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password) {
        return dao.getAdminOfAdminidAndAdminnameAndPassword(adminid, adminname, password);
    }
    public List<Admin> getAdmins(Admin admin) {
        return dao.getAdmins(admin);
    }
    public List<Admin> getAdminsOfAdminid(String adminid) {
        return dao.getAdminsOfAdminid(adminid);
    }
    public List<Admin> getAdminsOfAdminname(String adminname) {
        return dao.getAdminsOfAdminname(adminname);
    }
    public List<Admin> getAdminsOfPassword(String password) {
        return dao.getAdminsOfPassword(password);
    }
    public List<Admin> getAdminsOfAdminidAndAdminname(String adminid, String adminname) {
        return dao.getAdminsOfAdminidAndAdminname(adminid, adminname);
    }
    public List<Admin> getAdminsOfAdminidAndPassword(String adminid, String password) {
        return dao.getAdminsOfAdminidAndPassword(adminid, password);
    }
    public List<Admin> getAdminsOfAdminnameAndPassword(String adminname, String password) {
        return dao.getAdminsOfAdminnameAndPassword(adminname, password);
    }
    public List<Admin> getAdminsOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password) {
        return dao.getAdminsOfAdminidAndAdminnameAndPassword(adminid, adminname, password);
    }
}
