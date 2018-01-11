package com.news.linglian.service;

import java.util.List;

import com.news.linglian.entity.Admin;

public interface IAdminService {
    public int update(Admin admin, Admin keyAdmin);
    public int updateOfAdminid(Admin admin, String adminid);
    public int updateOfAdminname(Admin admin, String adminname);
    public int updateOfPassword(Admin admin, String password);
    public int updateOfAdminidAndAdminname(Admin admin, String adminid, String adminname);
    public int updateOfAdminidAndPassword(Admin admin, String adminid, String password);
    public int updateOfAdminnameAndPassword(Admin admin, String adminname, String password);
    public int updateOfAdminidAndAdminnameAndPassword(Admin admin, String adminid, String adminname, String password);
    public int remove(Admin admin);
    public int removeOfAdminid(String adminid);
    public int removeOfAdminname(String adminname);
    public int removeOfPassword(String password);
    public int removeOfAdminidAndAdminname(String adminid, String adminname);
    public int removeOfAdminidAndPassword(String adminid, String password);
    public int removeOfAdminnameAndPassword(String adminname, String password);
    public int removeOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password);
    public int insert(Admin admin);
    public int insertOfAdminid(String adminid);
    public int insertOfAdminname(String adminname);
    public int insertOfPassword(String password);
    public int insertOfAdminidAndAdminname(String adminid, String adminname);
    public int insertOfAdminidAndPassword(String adminid, String password);
    public int insertOfAdminnameAndPassword(String adminname, String password);
    public int insertOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password);
    public Admin getAdmin(Admin admin);
    public Admin getAdminOfAdminid(String adminid);
    public Admin getAdminOfAdminname(String adminname);
    public Admin getAdminOfPassword(String password);
    public Admin getAdminOfAdminidAndAdminname(String adminid, String adminname);
    public Admin getAdminOfAdminidAndPassword(String adminid, String password);
    public Admin getAdminOfAdminnameAndPassword(String adminname, String password);
    public Admin getAdminOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password);
    public List<Admin> getAdmins(Admin admin);
    public List<Admin> getAdminsOfAdminid(String adminid);
    public List<Admin> getAdminsOfAdminname(String adminname);
    public List<Admin> getAdminsOfPassword(String password);
    public List<Admin> getAdminsOfAdminidAndAdminname(String adminid, String adminname);
    public List<Admin> getAdminsOfAdminidAndPassword(String adminid, String password);
    public List<Admin> getAdminsOfAdminnameAndPassword(String adminname, String password);
    public List<Admin> getAdminsOfAdminidAndAdminnameAndPassword(String adminid, String adminname, String password);
}
