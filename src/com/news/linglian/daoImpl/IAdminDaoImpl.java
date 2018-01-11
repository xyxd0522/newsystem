package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Admin;

import com.news.linglian.dao.IAdminDao;
import db.DBMan;

public class IAdminDaoImpl implements IAdminDao {
    public int update(Admin admin, Admin keyAdmin) {
        return DBMan.getInstance().updateWithoutThrow(admin, keyAdmin, "admin");
    }
    public int updateOfAdminid(Admin admin, String adminid) {
        Admin kAdmin = new Admin();
        kAdmin.setAdminid(adminid);
        return update(admin, kAdmin);
    }
    public int updateOfAdminname(Admin admin, String adminname) {
        Admin kAdmin = new Admin();
        kAdmin.setAdminname(adminname);
        return update(admin, kAdmin);
    }
    public int updateOfPassword(Admin admin, String password) {
        Admin kAdmin = new Admin();
        kAdmin.setPassword(password);
        return update(admin, kAdmin);
    }
    public int updateOfAdminidAndAdminname(Admin admin, String adminid, String adminname) {
        Admin kAdmin = new Admin();
        kAdmin.setAdminid(adminid);
        kAdmin.setAdminname(adminname);
        return update(admin, kAdmin);
    }
    public int updateOfAdminidAndPassword(Admin admin, String adminid, String password) {
        Admin kAdmin = new Admin();
        kAdmin.setAdminid(adminid);
        kAdmin.setPassword(password);
        return update(admin, kAdmin);
    }
    public int updateOfAdminnameAndPassword(Admin admin, String adminname, String password) {
        Admin kAdmin = new Admin();
        kAdmin.setAdminname(adminname);
        kAdmin.setPassword(password);
        return update(admin, kAdmin);
    }
    public int updateOfAdminidAndAdminnameAndPassword(Admin admin, String adminid, String adminname, String password) {
        Admin kAdmin = new Admin();
        kAdmin.setAdminid(adminid);
        kAdmin.setAdminname(adminname);
        kAdmin.setPassword(password);
        return update(admin, kAdmin);
    }
    public int remove(Admin admin) {
        return DBMan.getInstance().deleteWithoutThrow(admin, "admin");
    }
    public int removeOfAdminid(String adminid) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        return remove(admin);
    }
    public int removeOfAdminname(String adminname) {
        Admin admin = new Admin();
        admin.setAdminname(adminname);
        return remove(admin);
    }
    public int removeOfPassword(String password) {
        Admin admin = new Admin();
        admin.setPassword(password);
        return remove(admin);
    }
    public int removeOfAdminidAndAdminname(String adminid, String adminname) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setAdminname(adminname);
        return remove(admin);
    }
    public int removeOfAdminidAndPassword(String adminid, String password) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setPassword(password);
        return remove(admin);
    }
    public int removeOfAdminnameAndPassword(String adminname, String password) {
        Admin admin = new Admin();
        admin.setAdminname(adminname);
        admin.setPassword(password);
        return remove(admin);
    }
    public int removeOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setAdminname(adminname);
        admin.setPassword(password);
        return remove(admin);
    }
    public int insert(Admin admin) {
        return DBMan.getInstance().insertWithoutThrow(admin, "admin");
    }
    public int insertOfAdminid(String adminid) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        return insert(admin);
    }
    public int insertOfAdminname(String adminname) {
        Admin admin = new Admin();
        admin.setAdminname(adminname);
        return insert(admin);
    }
    public int insertOfPassword(String password) {
        Admin admin = new Admin();
        admin.setPassword(password);
        return insert(admin);
    }
    public int insertOfAdminidAndAdminname(String adminid, String adminname) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setAdminname(adminname);
        return insert(admin);
    }
    public int insertOfAdminidAndPassword(String adminid, String password) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setPassword(password);
        return insert(admin);
    }
    public int insertOfAdminnameAndPassword(String adminname, String password) {
        Admin admin = new Admin();
        admin.setAdminname(adminname);
        admin.setPassword(password);
        return insert(admin);
    }
    public int insertOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setAdminname(adminname);
        admin.setPassword(password);
        return insert(admin);
    }
    public Admin getAdmin(Admin admin) {
        return DBMan.getInstance().queryByIdWithoutThrow(admin, "admin");
    }
    public Admin getAdminOfAdminid(String adminid) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        return getAdmin(admin);
    }
    public Admin getAdminOfAdminname(String adminname) {
        Admin admin = new Admin();
        admin.setAdminname(adminname);
        return getAdmin(admin);
    }
    public Admin getAdminOfPassword(String password) {
        Admin admin = new Admin();
        admin.setPassword(password);
        return getAdmin(admin);
    }
    public Admin getAdminOfAdminidAndAdminname(String adminid, String adminname) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setAdminname(adminname);
        return getAdmin(admin);
    }
    public Admin getAdminOfAdminidAndPassword(String adminid, String password) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setPassword(password);
        return getAdmin(admin);
    }
    public Admin getAdminOfAdminnameAndPassword(String adminname, String password) {
        Admin admin = new Admin();
        admin.setAdminname(adminname);
        admin.setPassword(password);
        return getAdmin(admin);
    }
    public Admin getAdminOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setAdminname(adminname);
        admin.setPassword(password);
        return getAdmin(admin);
    }
    public List<Admin> getAdmins(Admin admin) {
        return DBMan.getInstance().queryWithoutThrow(admin, "admin");
    }
    public List<Admin> getAdminsOfAdminid(String adminid) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        return getAdmins(admin);
    }
    public List<Admin> getAdminsOfAdminname(String adminname) {
        Admin admin = new Admin();
        admin.setAdminname(adminname);
        return getAdmins(admin);
    }
    public List<Admin> getAdminsOfPassword(String password) {
        Admin admin = new Admin();
        admin.setPassword(password);
        return getAdmins(admin);
    }
    public List<Admin> getAdminsOfAdminidAndAdminname(String adminid, String adminname) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setAdminname(adminname);
        return getAdmins(admin);
    }
    public List<Admin> getAdminsOfAdminidAndPassword(String adminid, String password) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setPassword(password);
        return getAdmins(admin);
    }
    public List<Admin> getAdminsOfAdminnameAndPassword(String adminname, String password) {
        Admin admin = new Admin();
        admin.setAdminname(adminname);
        admin.setPassword(password);
        return getAdmins(admin);
    }
    public List<Admin> getAdminsOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password) {
        Admin admin = new Admin();
        admin.setAdminid(adminid);
        admin.setAdminname(adminname);
        admin.setPassword(password);
        return getAdmins(admin);
    }
}
