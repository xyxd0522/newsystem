package com.news.linglian.serviceNImpl;

import java.util.List;

import com.news.linglian.daoN.INewsdateDaoN;
import com.news.linglian.daoNImpl.INewsdateDaoNImpl;
import com.news.linglian.entity.News;

import cn.newsw.linglian.serviceN.INewsdateServiceN;

public class INewsdateServiceNImpl implements INewsdateServiceN {

	@Override
	public List<News> queryByNewsdate() {
		INewsdateDaoN dao = new INewsdateDaoNImpl();
		return dao.queryByNewsdate();
	}

}
