package com.news.linglian.daoImpl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

import com.news.linglian.dao.IAdminDao;
import com.news.linglian.entity.Admin;

import db.DBMan;

public class IAdminDaoImpl implements IAdminDao {
	/**
	 * 更新数据库中的对应的Admin对象
	 * 
	 * @param admin
	 *            （传入password为空时，不改变password）
	 * @return 返回1则删除成功，返回0则失败
	 */
	public int updateAdmin(Admin admin) {
		if (admin.getPassword() != null) {
			return DBMan
					.getInstance()
					.updateWithoutThrow(
							"UPDATE admin SET adminname = ?, password = ? WHERE adminid = ?",
							admin.getAdminname(), admin.getPassword(),
							admin.getAdminid());
		} else {
			return DBMan.getInstance().updateWithoutThrow(
					"UPDATE admin SET adminname = ? WHERE adminid = ?",
					admin.getAdminname(), admin.getAdminid());
		}
	}

	/**
	 * 删除Admin实例，根据传入的adminid
	 * 
	 * @param admin
	 * @return 返回1则删除成功，返回0则失败
	 */
	public int removeAdmin(Admin admin) {
		return removeAdmin(admin.getAdminid());
	}

	public int removeAdmin(String adminid) {
		DBMan.getInstance().updateWithoutThrow(
				"DELETE FROM LOG WHERE adminid = ?", adminid);
		return DBMan.getInstance().updateWithoutThrow(
				"DELETE FROM ADMIN WHERE adminid = ?", adminid);
	}

	/**
	 * 插入Admin实例
	 * 
	 * @param admin
	 * @return 返回1则插入成功，0为失败。
	 */
	public int insert(Admin admin) {
		return DBMan
				.getInstance()
				.updateWithoutThrow(
						"INSERT INTO admin (adminid, adminname, password) VALUES (?, ?, ?)",
						admin.getAdminid(), admin.getAdminname(),
						admin.getPassword());
	}

	/**
	 * 获得admin信息
	 * 
	 * @param id
	 * @return 存在则返回实例，不存在则返回空。
	 */
	public Admin getAdmin(String adminid) {
		return DBMan.getInstance().queryByIdWithoutThrow(Admin.class,
				"SELECT adminid, adminname FROM admin where adminid = ?",
				adminid);
	}

	/**
	 * 获得admin信息
	 * 
	 * @param id
	 * @param password
	 * @return 存在则返回实例，不存在则返回空。
	 */
	public Admin getAdmin(String adminid, String password) {
		return DBMan
				.getInstance()
				.queryByIdWithoutThrow(
						Admin.class,
						"SELECT adminid, adminname FROM admin where adminid = ? and password = ?",
						adminid, password);
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException, IOException {
		Admin admin = new Admin();
		admin.setAdminid("temp");
		admin.setAdminname("临时变量");
		admin.setPassword("123456");
		System.out.println("插入操作: " + new IAdminDaoImpl().insert(admin));
		System.out.println("查询操作: "
				+ new IAdminDaoImpl().getAdmin(admin.getAdminid()));
		admin.setAdminname("临时变量222");
		System.out.println("更新操作: " + new IAdminDaoImpl().updateAdmin(admin));
		System.out.println("查询操作: "
				+ new IAdminDaoImpl().getAdmin(admin.getAdminid()));
		System.out.println("删除操作: " + new IAdminDaoImpl().removeAdmin(admin));
		System.out.println("查询操作: "
				+ new IAdminDaoImpl().getAdmin(admin.getAdminid()));
	}
}
