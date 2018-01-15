package com.news.linglian.daoNImpl;

import java.util.List;

import com.news.linglian.daoN.INewsdateDaoN;
import com.news.linglian.entity.News;

import db.DBMan;

public class INewsdateDaoNImpl implements INewsdateDaoN {

	@Override
	public List<News> queryByNewsdate() {
		String sql = "SELECT title,n.newsid,ns.typename,n.newsdate FROM news n,USER u,newstype ns WHERE n.userid = u.userid AND n.typeid = ns.typeid LIMIT 0, 1000";
		DBMan.getInstance();
		return null;
	}

}
