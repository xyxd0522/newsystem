/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.news.linglian.daoNImpl;

import com.news.linglian.dao.IUserDao;
import com.news.linglian.daoN.IUserDaoN;
import com.news.linglian.daoImpl.IUserDaoImpl;
import com.news.linglian.entity.User;
import db.DBMan;
import java.util.List;
import util.ClassUtil;
import util.SqlUtil;

/**
 *
 * @author lol
 */
public class IUserDaoNImpl extends IUserDaoImpl implements IUserDaoN {

    @Override
    public List<User> getUsersLimit(int start, int size) {
        String sql = new SqlUtil()
                .addDataName("user")
                .setStatus(SqlUtil.SQL_SELECT)
                .addBeforeWheres(ClassUtil.getName(User.class))
                .addLast("limit ?, ?")
                .build();
        return DBMan.getInstance().queryWithoutThrow(User.class, sql, start, size);
    }

    public static void main(String[] args) {
        IUserDaoNImpl u = new IUserDaoNImpl();
        System.out.println(u.getUsersLimit(1, 1));
    }
}
