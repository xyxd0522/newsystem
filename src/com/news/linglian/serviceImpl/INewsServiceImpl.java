package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.News;

import com.news.linglian.dao.INewsDao;
import com.news.linglian.daoImpl.INewsDaoImpl;
import com.news.linglian.service.INewsService;

public class INewsServiceImpl implements INewsService {
	INewsDao dao = null;

	public INewsServiceImpl() {
		dao = new INewsDaoImpl();
	}
    public int update(News news, News keyNews) {
        return dao.update(news, keyNews);
    }
    public int updateOfNewsid(News news, String newsid) {
        return dao.updateOfNewsid(news, newsid);
    }
    public int updateOfTitle(News news, String title) {
        return dao.updateOfTitle(news, title);
    }
    public int updateOfBody(News news, String body) {
        return dao.updateOfBody(news, body);
    }
    public int updateOfTypeid(News news, String typeid) {
        return dao.updateOfTypeid(news, typeid);
    }
    public int updateOfNewsdate(News news, String newsdate) {
        return dao.updateOfNewsdate(news, newsdate);
    }
    public int updateOfUserid(News news, String userid) {
        return dao.updateOfUserid(news, userid);
    }
    public int updateOfStatus(News news, String status) {
        return dao.updateOfStatus(news, status);
    }
    public int updateOfNewsidAndTitle(News news, String newsid, String title) {
        return dao.updateOfNewsidAndTitle(news, newsid, title);
    }
    public int updateOfNewsidAndBody(News news, String newsid, String body) {
        return dao.updateOfNewsidAndBody(news, newsid, body);
    }
    public int updateOfNewsidAndTypeid(News news, String newsid, String typeid) {
        return dao.updateOfNewsidAndTypeid(news, newsid, typeid);
    }
    public int updateOfNewsidAndNewsdate(News news, String newsid, String newsdate) {
        return dao.updateOfNewsidAndNewsdate(news, newsid, newsdate);
    }
    public int updateOfNewsidAndUserid(News news, String newsid, String userid) {
        return dao.updateOfNewsidAndUserid(news, newsid, userid);
    }
    public int updateOfNewsidAndStatus(News news, String newsid, String status) {
        return dao.updateOfNewsidAndStatus(news, newsid, status);
    }
    public int updateOfTitleAndBody(News news, String title, String body) {
        return dao.updateOfTitleAndBody(news, title, body);
    }
    public int updateOfTitleAndTypeid(News news, String title, String typeid) {
        return dao.updateOfTitleAndTypeid(news, title, typeid);
    }
    public int updateOfTitleAndNewsdate(News news, String title, String newsdate) {
        return dao.updateOfTitleAndNewsdate(news, title, newsdate);
    }
    public int updateOfTitleAndUserid(News news, String title, String userid) {
        return dao.updateOfTitleAndUserid(news, title, userid);
    }
    public int updateOfTitleAndStatus(News news, String title, String status) {
        return dao.updateOfTitleAndStatus(news, title, status);
    }
    public int updateOfBodyAndTypeid(News news, String body, String typeid) {
        return dao.updateOfBodyAndTypeid(news, body, typeid);
    }
    public int updateOfBodyAndNewsdate(News news, String body, String newsdate) {
        return dao.updateOfBodyAndNewsdate(news, body, newsdate);
    }
    public int updateOfBodyAndUserid(News news, String body, String userid) {
        return dao.updateOfBodyAndUserid(news, body, userid);
    }
    public int updateOfBodyAndStatus(News news, String body, String status) {
        return dao.updateOfBodyAndStatus(news, body, status);
    }
    public int updateOfTypeidAndNewsdate(News news, String typeid, String newsdate) {
        return dao.updateOfTypeidAndNewsdate(news, typeid, newsdate);
    }
    public int updateOfTypeidAndUserid(News news, String typeid, String userid) {
        return dao.updateOfTypeidAndUserid(news, typeid, userid);
    }
    public int updateOfTypeidAndStatus(News news, String typeid, String status) {
        return dao.updateOfTypeidAndStatus(news, typeid, status);
    }
    public int updateOfNewsdateAndUserid(News news, String newsdate, String userid) {
        return dao.updateOfNewsdateAndUserid(news, newsdate, userid);
    }
    public int updateOfNewsdateAndStatus(News news, String newsdate, String status) {
        return dao.updateOfNewsdateAndStatus(news, newsdate, status);
    }
    public int updateOfUseridAndStatus(News news, String userid, String status) {
        return dao.updateOfUseridAndStatus(news, userid, status);
    }
    public int updateOfNewsidAndTitleAndBody(News news, String newsid, String title, String body) {
        return dao.updateOfNewsidAndTitleAndBody(news, newsid, title, body);
    }
    public int updateOfNewsidAndTitleAndTypeid(News news, String newsid, String title, String typeid) {
        return dao.updateOfNewsidAndTitleAndTypeid(news, newsid, title, typeid);
    }
    public int updateOfNewsidAndTitleAndNewsdate(News news, String newsid, String title, String newsdate) {
        return dao.updateOfNewsidAndTitleAndNewsdate(news, newsid, title, newsdate);
    }
    public int updateOfNewsidAndTitleAndUserid(News news, String newsid, String title, String userid) {
        return dao.updateOfNewsidAndTitleAndUserid(news, newsid, title, userid);
    }
    public int updateOfNewsidAndTitleAndStatus(News news, String newsid, String title, String status) {
        return dao.updateOfNewsidAndTitleAndStatus(news, newsid, title, status);
    }
    public int updateOfNewsidAndBodyAndTypeid(News news, String newsid, String body, String typeid) {
        return dao.updateOfNewsidAndBodyAndTypeid(news, newsid, body, typeid);
    }
    public int updateOfNewsidAndBodyAndNewsdate(News news, String newsid, String body, String newsdate) {
        return dao.updateOfNewsidAndBodyAndNewsdate(news, newsid, body, newsdate);
    }
    public int updateOfNewsidAndBodyAndUserid(News news, String newsid, String body, String userid) {
        return dao.updateOfNewsidAndBodyAndUserid(news, newsid, body, userid);
    }
    public int updateOfNewsidAndBodyAndStatus(News news, String newsid, String body, String status) {
        return dao.updateOfNewsidAndBodyAndStatus(news, newsid, body, status);
    }
    public int updateOfNewsidAndTypeidAndNewsdate(News news, String newsid, String typeid, String newsdate) {
        return dao.updateOfNewsidAndTypeidAndNewsdate(news, newsid, typeid, newsdate);
    }
    public int updateOfNewsidAndTypeidAndUserid(News news, String newsid, String typeid, String userid) {
        return dao.updateOfNewsidAndTypeidAndUserid(news, newsid, typeid, userid);
    }
    public int updateOfNewsidAndTypeidAndStatus(News news, String newsid, String typeid, String status) {
        return dao.updateOfNewsidAndTypeidAndStatus(news, newsid, typeid, status);
    }
    public int updateOfNewsidAndNewsdateAndUserid(News news, String newsid, String newsdate, String userid) {
        return dao.updateOfNewsidAndNewsdateAndUserid(news, newsid, newsdate, userid);
    }
    public int updateOfNewsidAndNewsdateAndStatus(News news, String newsid, String newsdate, String status) {
        return dao.updateOfNewsidAndNewsdateAndStatus(news, newsid, newsdate, status);
    }
    public int updateOfNewsidAndUseridAndStatus(News news, String newsid, String userid, String status) {
        return dao.updateOfNewsidAndUseridAndStatus(news, newsid, userid, status);
    }
    public int updateOfTitleAndBodyAndTypeid(News news, String title, String body, String typeid) {
        return dao.updateOfTitleAndBodyAndTypeid(news, title, body, typeid);
    }
    public int updateOfTitleAndBodyAndNewsdate(News news, String title, String body, String newsdate) {
        return dao.updateOfTitleAndBodyAndNewsdate(news, title, body, newsdate);
    }
    public int updateOfTitleAndBodyAndUserid(News news, String title, String body, String userid) {
        return dao.updateOfTitleAndBodyAndUserid(news, title, body, userid);
    }
    public int updateOfTitleAndBodyAndStatus(News news, String title, String body, String status) {
        return dao.updateOfTitleAndBodyAndStatus(news, title, body, status);
    }
    public int updateOfTitleAndTypeidAndNewsdate(News news, String title, String typeid, String newsdate) {
        return dao.updateOfTitleAndTypeidAndNewsdate(news, title, typeid, newsdate);
    }
    public int updateOfTitleAndTypeidAndUserid(News news, String title, String typeid, String userid) {
        return dao.updateOfTitleAndTypeidAndUserid(news, title, typeid, userid);
    }
    public int updateOfTitleAndTypeidAndStatus(News news, String title, String typeid, String status) {
        return dao.updateOfTitleAndTypeidAndStatus(news, title, typeid, status);
    }
    public int updateOfTitleAndNewsdateAndUserid(News news, String title, String newsdate, String userid) {
        return dao.updateOfTitleAndNewsdateAndUserid(news, title, newsdate, userid);
    }
    public int updateOfTitleAndNewsdateAndStatus(News news, String title, String newsdate, String status) {
        return dao.updateOfTitleAndNewsdateAndStatus(news, title, newsdate, status);
    }
    public int updateOfTitleAndUseridAndStatus(News news, String title, String userid, String status) {
        return dao.updateOfTitleAndUseridAndStatus(news, title, userid, status);
    }
    public int updateOfBodyAndTypeidAndNewsdate(News news, String body, String typeid, String newsdate) {
        return dao.updateOfBodyAndTypeidAndNewsdate(news, body, typeid, newsdate);
    }
    public int updateOfBodyAndTypeidAndUserid(News news, String body, String typeid, String userid) {
        return dao.updateOfBodyAndTypeidAndUserid(news, body, typeid, userid);
    }
    public int updateOfBodyAndTypeidAndStatus(News news, String body, String typeid, String status) {
        return dao.updateOfBodyAndTypeidAndStatus(news, body, typeid, status);
    }
    public int updateOfBodyAndNewsdateAndUserid(News news, String body, String newsdate, String userid) {
        return dao.updateOfBodyAndNewsdateAndUserid(news, body, newsdate, userid);
    }
    public int updateOfBodyAndNewsdateAndStatus(News news, String body, String newsdate, String status) {
        return dao.updateOfBodyAndNewsdateAndStatus(news, body, newsdate, status);
    }
    public int updateOfBodyAndUseridAndStatus(News news, String body, String userid, String status) {
        return dao.updateOfBodyAndUseridAndStatus(news, body, userid, status);
    }
    public int updateOfTypeidAndNewsdateAndUserid(News news, String typeid, String newsdate, String userid) {
        return dao.updateOfTypeidAndNewsdateAndUserid(news, typeid, newsdate, userid);
    }
    public int updateOfTypeidAndNewsdateAndStatus(News news, String typeid, String newsdate, String status) {
        return dao.updateOfTypeidAndNewsdateAndStatus(news, typeid, newsdate, status);
    }
    public int updateOfTypeidAndUseridAndStatus(News news, String typeid, String userid, String status) {
        return dao.updateOfTypeidAndUseridAndStatus(news, typeid, userid, status);
    }
    public int updateOfNewsdateAndUseridAndStatus(News news, String newsdate, String userid, String status) {
        return dao.updateOfNewsdateAndUseridAndStatus(news, newsdate, userid, status);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeid(News news, String newsid, String title, String body, String typeid) {
        return dao.updateOfNewsidAndTitleAndBodyAndTypeid(news, newsid, title, body, typeid);
    }
    public int updateOfNewsidAndTitleAndBodyAndNewsdate(News news, String newsid, String title, String body, String newsdate) {
        return dao.updateOfNewsidAndTitleAndBodyAndNewsdate(news, newsid, title, body, newsdate);
    }
    public int updateOfNewsidAndTitleAndBodyAndUserid(News news, String newsid, String title, String body, String userid) {
        return dao.updateOfNewsidAndTitleAndBodyAndUserid(news, newsid, title, body, userid);
    }
    public int updateOfNewsidAndTitleAndBodyAndStatus(News news, String newsid, String title, String body, String status) {
        return dao.updateOfNewsidAndTitleAndBodyAndStatus(news, newsid, title, body, status);
    }
    public int updateOfNewsidAndTitleAndTypeidAndNewsdate(News news, String newsid, String title, String typeid, String newsdate) {
        return dao.updateOfNewsidAndTitleAndTypeidAndNewsdate(news, newsid, title, typeid, newsdate);
    }
    public int updateOfNewsidAndTitleAndTypeidAndUserid(News news, String newsid, String title, String typeid, String userid) {
        return dao.updateOfNewsidAndTitleAndTypeidAndUserid(news, newsid, title, typeid, userid);
    }
    public int updateOfNewsidAndTitleAndTypeidAndStatus(News news, String newsid, String title, String typeid, String status) {
        return dao.updateOfNewsidAndTitleAndTypeidAndStatus(news, newsid, title, typeid, status);
    }
    public int updateOfNewsidAndTitleAndNewsdateAndUserid(News news, String newsid, String title, String newsdate, String userid) {
        return dao.updateOfNewsidAndTitleAndNewsdateAndUserid(news, newsid, title, newsdate, userid);
    }
    public int updateOfNewsidAndTitleAndNewsdateAndStatus(News news, String newsid, String title, String newsdate, String status) {
        return dao.updateOfNewsidAndTitleAndNewsdateAndStatus(news, newsid, title, newsdate, status);
    }
    public int updateOfNewsidAndTitleAndUseridAndStatus(News news, String newsid, String title, String userid, String status) {
        return dao.updateOfNewsidAndTitleAndUseridAndStatus(news, newsid, title, userid, status);
    }
    public int updateOfNewsidAndBodyAndTypeidAndNewsdate(News news, String newsid, String body, String typeid, String newsdate) {
        return dao.updateOfNewsidAndBodyAndTypeidAndNewsdate(news, newsid, body, typeid, newsdate);
    }
    public int updateOfNewsidAndBodyAndTypeidAndUserid(News news, String newsid, String body, String typeid, String userid) {
        return dao.updateOfNewsidAndBodyAndTypeidAndUserid(news, newsid, body, typeid, userid);
    }
    public int updateOfNewsidAndBodyAndTypeidAndStatus(News news, String newsid, String body, String typeid, String status) {
        return dao.updateOfNewsidAndBodyAndTypeidAndStatus(news, newsid, body, typeid, status);
    }
    public int updateOfNewsidAndBodyAndNewsdateAndUserid(News news, String newsid, String body, String newsdate, String userid) {
        return dao.updateOfNewsidAndBodyAndNewsdateAndUserid(news, newsid, body, newsdate, userid);
    }
    public int updateOfNewsidAndBodyAndNewsdateAndStatus(News news, String newsid, String body, String newsdate, String status) {
        return dao.updateOfNewsidAndBodyAndNewsdateAndStatus(news, newsid, body, newsdate, status);
    }
    public int updateOfNewsidAndBodyAndUseridAndStatus(News news, String newsid, String body, String userid, String status) {
        return dao.updateOfNewsidAndBodyAndUseridAndStatus(news, newsid, body, userid, status);
    }
    public int updateOfNewsidAndTypeidAndNewsdateAndUserid(News news, String newsid, String typeid, String newsdate, String userid) {
        return dao.updateOfNewsidAndTypeidAndNewsdateAndUserid(news, newsid, typeid, newsdate, userid);
    }
    public int updateOfNewsidAndTypeidAndNewsdateAndStatus(News news, String newsid, String typeid, String newsdate, String status) {
        return dao.updateOfNewsidAndTypeidAndNewsdateAndStatus(news, newsid, typeid, newsdate, status);
    }
    public int updateOfNewsidAndTypeidAndUseridAndStatus(News news, String newsid, String typeid, String userid, String status) {
        return dao.updateOfNewsidAndTypeidAndUseridAndStatus(news, newsid, typeid, userid, status);
    }
    public int updateOfNewsidAndNewsdateAndUseridAndStatus(News news, String newsid, String newsdate, String userid, String status) {
        return dao.updateOfNewsidAndNewsdateAndUseridAndStatus(news, newsid, newsdate, userid, status);
    }
    public int updateOfTitleAndBodyAndTypeidAndNewsdate(News news, String title, String body, String typeid, String newsdate) {
        return dao.updateOfTitleAndBodyAndTypeidAndNewsdate(news, title, body, typeid, newsdate);
    }
    public int updateOfTitleAndBodyAndTypeidAndUserid(News news, String title, String body, String typeid, String userid) {
        return dao.updateOfTitleAndBodyAndTypeidAndUserid(news, title, body, typeid, userid);
    }
    public int updateOfTitleAndBodyAndTypeidAndStatus(News news, String title, String body, String typeid, String status) {
        return dao.updateOfTitleAndBodyAndTypeidAndStatus(news, title, body, typeid, status);
    }
    public int updateOfTitleAndBodyAndNewsdateAndUserid(News news, String title, String body, String newsdate, String userid) {
        return dao.updateOfTitleAndBodyAndNewsdateAndUserid(news, title, body, newsdate, userid);
    }
    public int updateOfTitleAndBodyAndNewsdateAndStatus(News news, String title, String body, String newsdate, String status) {
        return dao.updateOfTitleAndBodyAndNewsdateAndStatus(news, title, body, newsdate, status);
    }
    public int updateOfTitleAndBodyAndUseridAndStatus(News news, String title, String body, String userid, String status) {
        return dao.updateOfTitleAndBodyAndUseridAndStatus(news, title, body, userid, status);
    }
    public int updateOfTitleAndTypeidAndNewsdateAndUserid(News news, String title, String typeid, String newsdate, String userid) {
        return dao.updateOfTitleAndTypeidAndNewsdateAndUserid(news, title, typeid, newsdate, userid);
    }
    public int updateOfTitleAndTypeidAndNewsdateAndStatus(News news, String title, String typeid, String newsdate, String status) {
        return dao.updateOfTitleAndTypeidAndNewsdateAndStatus(news, title, typeid, newsdate, status);
    }
    public int updateOfTitleAndTypeidAndUseridAndStatus(News news, String title, String typeid, String userid, String status) {
        return dao.updateOfTitleAndTypeidAndUseridAndStatus(news, title, typeid, userid, status);
    }
    public int updateOfTitleAndNewsdateAndUseridAndStatus(News news, String title, String newsdate, String userid, String status) {
        return dao.updateOfTitleAndNewsdateAndUseridAndStatus(news, title, newsdate, userid, status);
    }
    public int updateOfBodyAndTypeidAndNewsdateAndUserid(News news, String body, String typeid, String newsdate, String userid) {
        return dao.updateOfBodyAndTypeidAndNewsdateAndUserid(news, body, typeid, newsdate, userid);
    }
    public int updateOfBodyAndTypeidAndNewsdateAndStatus(News news, String body, String typeid, String newsdate, String status) {
        return dao.updateOfBodyAndTypeidAndNewsdateAndStatus(news, body, typeid, newsdate, status);
    }
    public int updateOfBodyAndTypeidAndUseridAndStatus(News news, String body, String typeid, String userid, String status) {
        return dao.updateOfBodyAndTypeidAndUseridAndStatus(news, body, typeid, userid, status);
    }
    public int updateOfBodyAndNewsdateAndUseridAndStatus(News news, String body, String newsdate, String userid, String status) {
        return dao.updateOfBodyAndNewsdateAndUseridAndStatus(news, body, newsdate, userid, status);
    }
    public int updateOfTypeidAndNewsdateAndUseridAndStatus(News news, String typeid, String newsdate, String userid, String status) {
        return dao.updateOfTypeidAndNewsdateAndUseridAndStatus(news, typeid, newsdate, userid, status);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(News news, String newsid, String title, String body, String typeid, String newsdate) {
        return dao.updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(news, newsid, title, body, typeid, newsdate);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndUserid(News news, String newsid, String title, String body, String typeid, String userid) {
        return dao.updateOfNewsidAndTitleAndBodyAndTypeidAndUserid(news, newsid, title, body, typeid, userid);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndStatus(News news, String newsid, String title, String body, String typeid, String status) {
        return dao.updateOfNewsidAndTitleAndBodyAndTypeidAndStatus(news, newsid, title, body, typeid, status);
    }
    public int updateOfNewsidAndTitleAndBodyAndNewsdateAndUserid(News news, String newsid, String title, String body, String newsdate, String userid) {
        return dao.updateOfNewsidAndTitleAndBodyAndNewsdateAndUserid(news, newsid, title, body, newsdate, userid);
    }
    public int updateOfNewsidAndTitleAndBodyAndNewsdateAndStatus(News news, String newsid, String title, String body, String newsdate, String status) {
        return dao.updateOfNewsidAndTitleAndBodyAndNewsdateAndStatus(news, newsid, title, body, newsdate, status);
    }
    public int updateOfNewsidAndTitleAndBodyAndUseridAndStatus(News news, String newsid, String title, String body, String userid, String status) {
        return dao.updateOfNewsidAndTitleAndBodyAndUseridAndStatus(news, newsid, title, body, userid, status);
    }
    public int updateOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(News news, String newsid, String title, String typeid, String newsdate, String userid) {
        return dao.updateOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(news, newsid, title, typeid, newsdate, userid);
    }
    public int updateOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(News news, String newsid, String title, String typeid, String newsdate, String status) {
        return dao.updateOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(news, newsid, title, typeid, newsdate, status);
    }
    public int updateOfNewsidAndTitleAndTypeidAndUseridAndStatus(News news, String newsid, String title, String typeid, String userid, String status) {
        return dao.updateOfNewsidAndTitleAndTypeidAndUseridAndStatus(news, newsid, title, typeid, userid, status);
    }
    public int updateOfNewsidAndTitleAndNewsdateAndUseridAndStatus(News news, String newsid, String title, String newsdate, String userid, String status) {
        return dao.updateOfNewsidAndTitleAndNewsdateAndUseridAndStatus(news, newsid, title, newsdate, userid, status);
    }
    public int updateOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(News news, String newsid, String body, String typeid, String newsdate, String userid) {
        return dao.updateOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(news, newsid, body, typeid, newsdate, userid);
    }
    public int updateOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(News news, String newsid, String body, String typeid, String newsdate, String status) {
        return dao.updateOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(news, newsid, body, typeid, newsdate, status);
    }
    public int updateOfNewsidAndBodyAndTypeidAndUseridAndStatus(News news, String newsid, String body, String typeid, String userid, String status) {
        return dao.updateOfNewsidAndBodyAndTypeidAndUseridAndStatus(news, newsid, body, typeid, userid, status);
    }
    public int updateOfNewsidAndBodyAndNewsdateAndUseridAndStatus(News news, String newsid, String body, String newsdate, String userid, String status) {
        return dao.updateOfNewsidAndBodyAndNewsdateAndUseridAndStatus(news, newsid, body, newsdate, userid, status);
    }
    public int updateOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(News news, String newsid, String typeid, String newsdate, String userid, String status) {
        return dao.updateOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(news, newsid, typeid, newsdate, userid, status);
    }
    public int updateOfTitleAndBodyAndTypeidAndNewsdateAndUserid(News news, String title, String body, String typeid, String newsdate, String userid) {
        return dao.updateOfTitleAndBodyAndTypeidAndNewsdateAndUserid(news, title, body, typeid, newsdate, userid);
    }
    public int updateOfTitleAndBodyAndTypeidAndNewsdateAndStatus(News news, String title, String body, String typeid, String newsdate, String status) {
        return dao.updateOfTitleAndBodyAndTypeidAndNewsdateAndStatus(news, title, body, typeid, newsdate, status);
    }
    public int updateOfTitleAndBodyAndTypeidAndUseridAndStatus(News news, String title, String body, String typeid, String userid, String status) {
        return dao.updateOfTitleAndBodyAndTypeidAndUseridAndStatus(news, title, body, typeid, userid, status);
    }
    public int updateOfTitleAndBodyAndNewsdateAndUseridAndStatus(News news, String title, String body, String newsdate, String userid, String status) {
        return dao.updateOfTitleAndBodyAndNewsdateAndUseridAndStatus(news, title, body, newsdate, userid, status);
    }
    public int updateOfTitleAndTypeidAndNewsdateAndUseridAndStatus(News news, String title, String typeid, String newsdate, String userid, String status) {
        return dao.updateOfTitleAndTypeidAndNewsdateAndUseridAndStatus(news, title, typeid, newsdate, userid, status);
    }
    public int updateOfBodyAndTypeidAndNewsdateAndUseridAndStatus(News news, String body, String typeid, String newsdate, String userid, String status) {
        return dao.updateOfBodyAndTypeidAndNewsdateAndUseridAndStatus(news, body, typeid, newsdate, userid, status);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(News news, String newsid, String title, String body, String typeid, String newsdate, String userid) {
        return dao.updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(news, newsid, title, body, typeid, newsdate, userid);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(News news, String newsid, String title, String body, String typeid, String newsdate, String status) {
        return dao.updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(news, newsid, title, body, typeid, newsdate, status);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(News news, String newsid, String title, String body, String typeid, String userid, String status) {
        return dao.updateOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(news, newsid, title, body, typeid, userid, status);
    }
    public int updateOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(News news, String newsid, String title, String body, String newsdate, String userid, String status) {
        return dao.updateOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(news, newsid, title, body, newsdate, userid, status);
    }
    public int updateOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(News news, String newsid, String title, String typeid, String newsdate, String userid, String status) {
        return dao.updateOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(news, newsid, title, typeid, newsdate, userid, status);
    }
    public int updateOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(News news, String newsid, String body, String typeid, String newsdate, String userid, String status) {
        return dao.updateOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(news, newsid, body, typeid, newsdate, userid, status);
    }
    public int updateOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(News news, String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.updateOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(news, title, body, typeid, newsdate, userid, status);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(News news, String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(news, newsid, title, body, typeid, newsdate, userid, status);
    }
    public int remove(News news) {
        return dao.remove(news);
    }
    public int removeOfNewsid(String newsid) {
        return dao.removeOfNewsid(newsid);
    }
    public int removeOfTitle(String title) {
        return dao.removeOfTitle(title);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfTypeid(String typeid) {
        return dao.removeOfTypeid(typeid);
    }
    public int removeOfNewsdate(String newsdate) {
        return dao.removeOfNewsdate(newsdate);
    }
    public int removeOfUserid(String userid) {
        return dao.removeOfUserid(userid);
    }
    public int removeOfStatus(String status) {
        return dao.removeOfStatus(status);
    }
    public int removeOfNewsidAndTitle(String newsid, String title) {
        return dao.removeOfNewsidAndTitle(newsid, title);
    }
    public int removeOfNewsidAndBody(String newsid, String body) {
        return dao.removeOfNewsidAndBody(newsid, body);
    }
    public int removeOfNewsidAndTypeid(String newsid, String typeid) {
        return dao.removeOfNewsidAndTypeid(newsid, typeid);
    }
    public int removeOfNewsidAndNewsdate(String newsid, String newsdate) {
        return dao.removeOfNewsidAndNewsdate(newsid, newsdate);
    }
    public int removeOfNewsidAndUserid(String newsid, String userid) {
        return dao.removeOfNewsidAndUserid(newsid, userid);
    }
    public int removeOfNewsidAndStatus(String newsid, String status) {
        return dao.removeOfNewsidAndStatus(newsid, status);
    }
    public int removeOfTitleAndBody(String title, String body) {
        return dao.removeOfTitleAndBody(title, body);
    }
    public int removeOfTitleAndTypeid(String title, String typeid) {
        return dao.removeOfTitleAndTypeid(title, typeid);
    }
    public int removeOfTitleAndNewsdate(String title, String newsdate) {
        return dao.removeOfTitleAndNewsdate(title, newsdate);
    }
    public int removeOfTitleAndUserid(String title, String userid) {
        return dao.removeOfTitleAndUserid(title, userid);
    }
    public int removeOfTitleAndStatus(String title, String status) {
        return dao.removeOfTitleAndStatus(title, status);
    }
    public int removeOfBodyAndTypeid(String body, String typeid) {
        return dao.removeOfBodyAndTypeid(body, typeid);
    }
    public int removeOfBodyAndNewsdate(String body, String newsdate) {
        return dao.removeOfBodyAndNewsdate(body, newsdate);
    }
    public int removeOfBodyAndUserid(String body, String userid) {
        return dao.removeOfBodyAndUserid(body, userid);
    }
    public int removeOfBodyAndStatus(String body, String status) {
        return dao.removeOfBodyAndStatus(body, status);
    }
    public int removeOfTypeidAndNewsdate(String typeid, String newsdate) {
        return dao.removeOfTypeidAndNewsdate(typeid, newsdate);
    }
    public int removeOfTypeidAndUserid(String typeid, String userid) {
        return dao.removeOfTypeidAndUserid(typeid, userid);
    }
    public int removeOfTypeidAndStatus(String typeid, String status) {
        return dao.removeOfTypeidAndStatus(typeid, status);
    }
    public int removeOfNewsdateAndUserid(String newsdate, String userid) {
        return dao.removeOfNewsdateAndUserid(newsdate, userid);
    }
    public int removeOfNewsdateAndStatus(String newsdate, String status) {
        return dao.removeOfNewsdateAndStatus(newsdate, status);
    }
    public int removeOfUseridAndStatus(String userid, String status) {
        return dao.removeOfUseridAndStatus(userid, status);
    }
    public int removeOfNewsidAndTitleAndBody(String newsid, String title, String body) {
        return dao.removeOfNewsidAndTitleAndBody(newsid, title, body);
    }
    public int removeOfNewsidAndTitleAndTypeid(String newsid, String title, String typeid) {
        return dao.removeOfNewsidAndTitleAndTypeid(newsid, title, typeid);
    }
    public int removeOfNewsidAndTitleAndNewsdate(String newsid, String title, String newsdate) {
        return dao.removeOfNewsidAndTitleAndNewsdate(newsid, title, newsdate);
    }
    public int removeOfNewsidAndTitleAndUserid(String newsid, String title, String userid) {
        return dao.removeOfNewsidAndTitleAndUserid(newsid, title, userid);
    }
    public int removeOfNewsidAndTitleAndStatus(String newsid, String title, String status) {
        return dao.removeOfNewsidAndTitleAndStatus(newsid, title, status);
    }
    public int removeOfNewsidAndBodyAndTypeid(String newsid, String body, String typeid) {
        return dao.removeOfNewsidAndBodyAndTypeid(newsid, body, typeid);
    }
    public int removeOfNewsidAndBodyAndNewsdate(String newsid, String body, String newsdate) {
        return dao.removeOfNewsidAndBodyAndNewsdate(newsid, body, newsdate);
    }
    public int removeOfNewsidAndBodyAndUserid(String newsid, String body, String userid) {
        return dao.removeOfNewsidAndBodyAndUserid(newsid, body, userid);
    }
    public int removeOfNewsidAndBodyAndStatus(String newsid, String body, String status) {
        return dao.removeOfNewsidAndBodyAndStatus(newsid, body, status);
    }
    public int removeOfNewsidAndTypeidAndNewsdate(String newsid, String typeid, String newsdate) {
        return dao.removeOfNewsidAndTypeidAndNewsdate(newsid, typeid, newsdate);
    }
    public int removeOfNewsidAndTypeidAndUserid(String newsid, String typeid, String userid) {
        return dao.removeOfNewsidAndTypeidAndUserid(newsid, typeid, userid);
    }
    public int removeOfNewsidAndTypeidAndStatus(String newsid, String typeid, String status) {
        return dao.removeOfNewsidAndTypeidAndStatus(newsid, typeid, status);
    }
    public int removeOfNewsidAndNewsdateAndUserid(String newsid, String newsdate, String userid) {
        return dao.removeOfNewsidAndNewsdateAndUserid(newsid, newsdate, userid);
    }
    public int removeOfNewsidAndNewsdateAndStatus(String newsid, String newsdate, String status) {
        return dao.removeOfNewsidAndNewsdateAndStatus(newsid, newsdate, status);
    }
    public int removeOfNewsidAndUseridAndStatus(String newsid, String userid, String status) {
        return dao.removeOfNewsidAndUseridAndStatus(newsid, userid, status);
    }
    public int removeOfTitleAndBodyAndTypeid(String title, String body, String typeid) {
        return dao.removeOfTitleAndBodyAndTypeid(title, body, typeid);
    }
    public int removeOfTitleAndBodyAndNewsdate(String title, String body, String newsdate) {
        return dao.removeOfTitleAndBodyAndNewsdate(title, body, newsdate);
    }
    public int removeOfTitleAndBodyAndUserid(String title, String body, String userid) {
        return dao.removeOfTitleAndBodyAndUserid(title, body, userid);
    }
    public int removeOfTitleAndBodyAndStatus(String title, String body, String status) {
        return dao.removeOfTitleAndBodyAndStatus(title, body, status);
    }
    public int removeOfTitleAndTypeidAndNewsdate(String title, String typeid, String newsdate) {
        return dao.removeOfTitleAndTypeidAndNewsdate(title, typeid, newsdate);
    }
    public int removeOfTitleAndTypeidAndUserid(String title, String typeid, String userid) {
        return dao.removeOfTitleAndTypeidAndUserid(title, typeid, userid);
    }
    public int removeOfTitleAndTypeidAndStatus(String title, String typeid, String status) {
        return dao.removeOfTitleAndTypeidAndStatus(title, typeid, status);
    }
    public int removeOfTitleAndNewsdateAndUserid(String title, String newsdate, String userid) {
        return dao.removeOfTitleAndNewsdateAndUserid(title, newsdate, userid);
    }
    public int removeOfTitleAndNewsdateAndStatus(String title, String newsdate, String status) {
        return dao.removeOfTitleAndNewsdateAndStatus(title, newsdate, status);
    }
    public int removeOfTitleAndUseridAndStatus(String title, String userid, String status) {
        return dao.removeOfTitleAndUseridAndStatus(title, userid, status);
    }
    public int removeOfBodyAndTypeidAndNewsdate(String body, String typeid, String newsdate) {
        return dao.removeOfBodyAndTypeidAndNewsdate(body, typeid, newsdate);
    }
    public int removeOfBodyAndTypeidAndUserid(String body, String typeid, String userid) {
        return dao.removeOfBodyAndTypeidAndUserid(body, typeid, userid);
    }
    public int removeOfBodyAndTypeidAndStatus(String body, String typeid, String status) {
        return dao.removeOfBodyAndTypeidAndStatus(body, typeid, status);
    }
    public int removeOfBodyAndNewsdateAndUserid(String body, String newsdate, String userid) {
        return dao.removeOfBodyAndNewsdateAndUserid(body, newsdate, userid);
    }
    public int removeOfBodyAndNewsdateAndStatus(String body, String newsdate, String status) {
        return dao.removeOfBodyAndNewsdateAndStatus(body, newsdate, status);
    }
    public int removeOfBodyAndUseridAndStatus(String body, String userid, String status) {
        return dao.removeOfBodyAndUseridAndStatus(body, userid, status);
    }
    public int removeOfTypeidAndNewsdateAndUserid(String typeid, String newsdate, String userid) {
        return dao.removeOfTypeidAndNewsdateAndUserid(typeid, newsdate, userid);
    }
    public int removeOfTypeidAndNewsdateAndStatus(String typeid, String newsdate, String status) {
        return dao.removeOfTypeidAndNewsdateAndStatus(typeid, newsdate, status);
    }
    public int removeOfTypeidAndUseridAndStatus(String typeid, String userid, String status) {
        return dao.removeOfTypeidAndUseridAndStatus(typeid, userid, status);
    }
    public int removeOfNewsdateAndUseridAndStatus(String newsdate, String userid, String status) {
        return dao.removeOfNewsdateAndUseridAndStatus(newsdate, userid, status);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeid(String newsid, String title, String body, String typeid) {
        return dao.removeOfNewsidAndTitleAndBodyAndTypeid(newsid, title, body, typeid);
    }
    public int removeOfNewsidAndTitleAndBodyAndNewsdate(String newsid, String title, String body, String newsdate) {
        return dao.removeOfNewsidAndTitleAndBodyAndNewsdate(newsid, title, body, newsdate);
    }
    public int removeOfNewsidAndTitleAndBodyAndUserid(String newsid, String title, String body, String userid) {
        return dao.removeOfNewsidAndTitleAndBodyAndUserid(newsid, title, body, userid);
    }
    public int removeOfNewsidAndTitleAndBodyAndStatus(String newsid, String title, String body, String status) {
        return dao.removeOfNewsidAndTitleAndBodyAndStatus(newsid, title, body, status);
    }
    public int removeOfNewsidAndTitleAndTypeidAndNewsdate(String newsid, String title, String typeid, String newsdate) {
        return dao.removeOfNewsidAndTitleAndTypeidAndNewsdate(newsid, title, typeid, newsdate);
    }
    public int removeOfNewsidAndTitleAndTypeidAndUserid(String newsid, String title, String typeid, String userid) {
        return dao.removeOfNewsidAndTitleAndTypeidAndUserid(newsid, title, typeid, userid);
    }
    public int removeOfNewsidAndTitleAndTypeidAndStatus(String newsid, String title, String typeid, String status) {
        return dao.removeOfNewsidAndTitleAndTypeidAndStatus(newsid, title, typeid, status);
    }
    public int removeOfNewsidAndTitleAndNewsdateAndUserid(String newsid, String title, String newsdate, String userid) {
        return dao.removeOfNewsidAndTitleAndNewsdateAndUserid(newsid, title, newsdate, userid);
    }
    public int removeOfNewsidAndTitleAndNewsdateAndStatus(String newsid, String title, String newsdate, String status) {
        return dao.removeOfNewsidAndTitleAndNewsdateAndStatus(newsid, title, newsdate, status);
    }
    public int removeOfNewsidAndTitleAndUseridAndStatus(String newsid, String title, String userid, String status) {
        return dao.removeOfNewsidAndTitleAndUseridAndStatus(newsid, title, userid, status);
    }
    public int removeOfNewsidAndBodyAndTypeidAndNewsdate(String newsid, String body, String typeid, String newsdate) {
        return dao.removeOfNewsidAndBodyAndTypeidAndNewsdate(newsid, body, typeid, newsdate);
    }
    public int removeOfNewsidAndBodyAndTypeidAndUserid(String newsid, String body, String typeid, String userid) {
        return dao.removeOfNewsidAndBodyAndTypeidAndUserid(newsid, body, typeid, userid);
    }
    public int removeOfNewsidAndBodyAndTypeidAndStatus(String newsid, String body, String typeid, String status) {
        return dao.removeOfNewsidAndBodyAndTypeidAndStatus(newsid, body, typeid, status);
    }
    public int removeOfNewsidAndBodyAndNewsdateAndUserid(String newsid, String body, String newsdate, String userid) {
        return dao.removeOfNewsidAndBodyAndNewsdateAndUserid(newsid, body, newsdate, userid);
    }
    public int removeOfNewsidAndBodyAndNewsdateAndStatus(String newsid, String body, String newsdate, String status) {
        return dao.removeOfNewsidAndBodyAndNewsdateAndStatus(newsid, body, newsdate, status);
    }
    public int removeOfNewsidAndBodyAndUseridAndStatus(String newsid, String body, String userid, String status) {
        return dao.removeOfNewsidAndBodyAndUseridAndStatus(newsid, body, userid, status);
    }
    public int removeOfNewsidAndTypeidAndNewsdateAndUserid(String newsid, String typeid, String newsdate, String userid) {
        return dao.removeOfNewsidAndTypeidAndNewsdateAndUserid(newsid, typeid, newsdate, userid);
    }
    public int removeOfNewsidAndTypeidAndNewsdateAndStatus(String newsid, String typeid, String newsdate, String status) {
        return dao.removeOfNewsidAndTypeidAndNewsdateAndStatus(newsid, typeid, newsdate, status);
    }
    public int removeOfNewsidAndTypeidAndUseridAndStatus(String newsid, String typeid, String userid, String status) {
        return dao.removeOfNewsidAndTypeidAndUseridAndStatus(newsid, typeid, userid, status);
    }
    public int removeOfNewsidAndNewsdateAndUseridAndStatus(String newsid, String newsdate, String userid, String status) {
        return dao.removeOfNewsidAndNewsdateAndUseridAndStatus(newsid, newsdate, userid, status);
    }
    public int removeOfTitleAndBodyAndTypeidAndNewsdate(String title, String body, String typeid, String newsdate) {
        return dao.removeOfTitleAndBodyAndTypeidAndNewsdate(title, body, typeid, newsdate);
    }
    public int removeOfTitleAndBodyAndTypeidAndUserid(String title, String body, String typeid, String userid) {
        return dao.removeOfTitleAndBodyAndTypeidAndUserid(title, body, typeid, userid);
    }
    public int removeOfTitleAndBodyAndTypeidAndStatus(String title, String body, String typeid, String status) {
        return dao.removeOfTitleAndBodyAndTypeidAndStatus(title, body, typeid, status);
    }
    public int removeOfTitleAndBodyAndNewsdateAndUserid(String title, String body, String newsdate, String userid) {
        return dao.removeOfTitleAndBodyAndNewsdateAndUserid(title, body, newsdate, userid);
    }
    public int removeOfTitleAndBodyAndNewsdateAndStatus(String title, String body, String newsdate, String status) {
        return dao.removeOfTitleAndBodyAndNewsdateAndStatus(title, body, newsdate, status);
    }
    public int removeOfTitleAndBodyAndUseridAndStatus(String title, String body, String userid, String status) {
        return dao.removeOfTitleAndBodyAndUseridAndStatus(title, body, userid, status);
    }
    public int removeOfTitleAndTypeidAndNewsdateAndUserid(String title, String typeid, String newsdate, String userid) {
        return dao.removeOfTitleAndTypeidAndNewsdateAndUserid(title, typeid, newsdate, userid);
    }
    public int removeOfTitleAndTypeidAndNewsdateAndStatus(String title, String typeid, String newsdate, String status) {
        return dao.removeOfTitleAndTypeidAndNewsdateAndStatus(title, typeid, newsdate, status);
    }
    public int removeOfTitleAndTypeidAndUseridAndStatus(String title, String typeid, String userid, String status) {
        return dao.removeOfTitleAndTypeidAndUseridAndStatus(title, typeid, userid, status);
    }
    public int removeOfTitleAndNewsdateAndUseridAndStatus(String title, String newsdate, String userid, String status) {
        return dao.removeOfTitleAndNewsdateAndUseridAndStatus(title, newsdate, userid, status);
    }
    public int removeOfBodyAndTypeidAndNewsdateAndUserid(String body, String typeid, String newsdate, String userid) {
        return dao.removeOfBodyAndTypeidAndNewsdateAndUserid(body, typeid, newsdate, userid);
    }
    public int removeOfBodyAndTypeidAndNewsdateAndStatus(String body, String typeid, String newsdate, String status) {
        return dao.removeOfBodyAndTypeidAndNewsdateAndStatus(body, typeid, newsdate, status);
    }
    public int removeOfBodyAndTypeidAndUseridAndStatus(String body, String typeid, String userid, String status) {
        return dao.removeOfBodyAndTypeidAndUseridAndStatus(body, typeid, userid, status);
    }
    public int removeOfBodyAndNewsdateAndUseridAndStatus(String body, String newsdate, String userid, String status) {
        return dao.removeOfBodyAndNewsdateAndUseridAndStatus(body, newsdate, userid, status);
    }
    public int removeOfTypeidAndNewsdateAndUseridAndStatus(String typeid, String newsdate, String userid, String status) {
        return dao.removeOfTypeidAndNewsdateAndUseridAndStatus(typeid, newsdate, userid, status);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(String newsid, String title, String body, String typeid, String newsdate) {
        return dao.removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(newsid, title, body, typeid, newsdate);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndUserid(String newsid, String title, String body, String typeid, String userid) {
        return dao.removeOfNewsidAndTitleAndBodyAndTypeidAndUserid(newsid, title, body, typeid, userid);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndStatus(String newsid, String title, String body, String typeid, String status) {
        return dao.removeOfNewsidAndTitleAndBodyAndTypeidAndStatus(newsid, title, body, typeid, status);
    }
    public int removeOfNewsidAndTitleAndBodyAndNewsdateAndUserid(String newsid, String title, String body, String newsdate, String userid) {
        return dao.removeOfNewsidAndTitleAndBodyAndNewsdateAndUserid(newsid, title, body, newsdate, userid);
    }
    public int removeOfNewsidAndTitleAndBodyAndNewsdateAndStatus(String newsid, String title, String body, String newsdate, String status) {
        return dao.removeOfNewsidAndTitleAndBodyAndNewsdateAndStatus(newsid, title, body, newsdate, status);
    }
    public int removeOfNewsidAndTitleAndBodyAndUseridAndStatus(String newsid, String title, String body, String userid, String status) {
        return dao.removeOfNewsidAndTitleAndBodyAndUseridAndStatus(newsid, title, body, userid, status);
    }
    public int removeOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(String newsid, String title, String typeid, String newsdate, String userid) {
        return dao.removeOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(newsid, title, typeid, newsdate, userid);
    }
    public int removeOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(String newsid, String title, String typeid, String newsdate, String status) {
        return dao.removeOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(newsid, title, typeid, newsdate, status);
    }
    public int removeOfNewsidAndTitleAndTypeidAndUseridAndStatus(String newsid, String title, String typeid, String userid, String status) {
        return dao.removeOfNewsidAndTitleAndTypeidAndUseridAndStatus(newsid, title, typeid, userid, status);
    }
    public int removeOfNewsidAndTitleAndNewsdateAndUseridAndStatus(String newsid, String title, String newsdate, String userid, String status) {
        return dao.removeOfNewsidAndTitleAndNewsdateAndUseridAndStatus(newsid, title, newsdate, userid, status);
    }
    public int removeOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String body, String typeid, String newsdate, String userid) {
        return dao.removeOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(newsid, body, typeid, newsdate, userid);
    }
    public int removeOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String body, String typeid, String newsdate, String status) {
        return dao.removeOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(newsid, body, typeid, newsdate, status);
    }
    public int removeOfNewsidAndBodyAndTypeidAndUseridAndStatus(String newsid, String body, String typeid, String userid, String status) {
        return dao.removeOfNewsidAndBodyAndTypeidAndUseridAndStatus(newsid, body, typeid, userid, status);
    }
    public int removeOfNewsidAndBodyAndNewsdateAndUseridAndStatus(String newsid, String body, String newsdate, String userid, String status) {
        return dao.removeOfNewsidAndBodyAndNewsdateAndUseridAndStatus(newsid, body, newsdate, userid, status);
    }
    public int removeOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String typeid, String newsdate, String userid, String status) {
        return dao.removeOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(newsid, typeid, newsdate, userid, status);
    }
    public int removeOfTitleAndBodyAndTypeidAndNewsdateAndUserid(String title, String body, String typeid, String newsdate, String userid) {
        return dao.removeOfTitleAndBodyAndTypeidAndNewsdateAndUserid(title, body, typeid, newsdate, userid);
    }
    public int removeOfTitleAndBodyAndTypeidAndNewsdateAndStatus(String title, String body, String typeid, String newsdate, String status) {
        return dao.removeOfTitleAndBodyAndTypeidAndNewsdateAndStatus(title, body, typeid, newsdate, status);
    }
    public int removeOfTitleAndBodyAndTypeidAndUseridAndStatus(String title, String body, String typeid, String userid, String status) {
        return dao.removeOfTitleAndBodyAndTypeidAndUseridAndStatus(title, body, typeid, userid, status);
    }
    public int removeOfTitleAndBodyAndNewsdateAndUseridAndStatus(String title, String body, String newsdate, String userid, String status) {
        return dao.removeOfTitleAndBodyAndNewsdateAndUseridAndStatus(title, body, newsdate, userid, status);
    }
    public int removeOfTitleAndTypeidAndNewsdateAndUseridAndStatus(String title, String typeid, String newsdate, String userid, String status) {
        return dao.removeOfTitleAndTypeidAndNewsdateAndUseridAndStatus(title, typeid, newsdate, userid, status);
    }
    public int removeOfBodyAndTypeidAndNewsdateAndUseridAndStatus(String body, String typeid, String newsdate, String userid, String status) {
        return dao.removeOfBodyAndTypeidAndNewsdateAndUseridAndStatus(body, typeid, newsdate, userid, status);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String title, String body, String typeid, String newsdate, String userid) {
        return dao.removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(newsid, title, body, typeid, newsdate, userid);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String title, String body, String typeid, String newsdate, String status) {
        return dao.removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(newsid, title, body, typeid, newsdate, status);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(String newsid, String title, String body, String typeid, String userid, String status) {
        return dao.removeOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(newsid, title, body, typeid, userid, status);
    }
    public int removeOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String newsdate, String userid, String status) {
        return dao.removeOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(newsid, title, body, newsdate, userid, status);
    }
    public int removeOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String typeid, String newsdate, String userid, String status) {
        return dao.removeOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(newsid, title, typeid, newsdate, userid, status);
    }
    public int removeOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String body, String typeid, String newsdate, String userid, String status) {
        return dao.removeOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(newsid, body, typeid, newsdate, userid, status);
    }
    public int removeOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.removeOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(title, body, typeid, newsdate, userid, status);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(newsid, title, body, typeid, newsdate, userid, status);
    }
    public int insert(News news) {
        return dao.insert(news);
    }
    public int insertOfNewsid(String newsid) {
        return dao.insertOfNewsid(newsid);
    }
    public int insertOfTitle(String title) {
        return dao.insertOfTitle(title);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfTypeid(String typeid) {
        return dao.insertOfTypeid(typeid);
    }
    public int insertOfNewsdate(String newsdate) {
        return dao.insertOfNewsdate(newsdate);
    }
    public int insertOfUserid(String userid) {
        return dao.insertOfUserid(userid);
    }
    public int insertOfStatus(String status) {
        return dao.insertOfStatus(status);
    }
    public int insertOfNewsidAndTitle(String newsid, String title) {
        return dao.insertOfNewsidAndTitle(newsid, title);
    }
    public int insertOfNewsidAndBody(String newsid, String body) {
        return dao.insertOfNewsidAndBody(newsid, body);
    }
    public int insertOfNewsidAndTypeid(String newsid, String typeid) {
        return dao.insertOfNewsidAndTypeid(newsid, typeid);
    }
    public int insertOfNewsidAndNewsdate(String newsid, String newsdate) {
        return dao.insertOfNewsidAndNewsdate(newsid, newsdate);
    }
    public int insertOfNewsidAndUserid(String newsid, String userid) {
        return dao.insertOfNewsidAndUserid(newsid, userid);
    }
    public int insertOfNewsidAndStatus(String newsid, String status) {
        return dao.insertOfNewsidAndStatus(newsid, status);
    }
    public int insertOfTitleAndBody(String title, String body) {
        return dao.insertOfTitleAndBody(title, body);
    }
    public int insertOfTitleAndTypeid(String title, String typeid) {
        return dao.insertOfTitleAndTypeid(title, typeid);
    }
    public int insertOfTitleAndNewsdate(String title, String newsdate) {
        return dao.insertOfTitleAndNewsdate(title, newsdate);
    }
    public int insertOfTitleAndUserid(String title, String userid) {
        return dao.insertOfTitleAndUserid(title, userid);
    }
    public int insertOfTitleAndStatus(String title, String status) {
        return dao.insertOfTitleAndStatus(title, status);
    }
    public int insertOfBodyAndTypeid(String body, String typeid) {
        return dao.insertOfBodyAndTypeid(body, typeid);
    }
    public int insertOfBodyAndNewsdate(String body, String newsdate) {
        return dao.insertOfBodyAndNewsdate(body, newsdate);
    }
    public int insertOfBodyAndUserid(String body, String userid) {
        return dao.insertOfBodyAndUserid(body, userid);
    }
    public int insertOfBodyAndStatus(String body, String status) {
        return dao.insertOfBodyAndStatus(body, status);
    }
    public int insertOfTypeidAndNewsdate(String typeid, String newsdate) {
        return dao.insertOfTypeidAndNewsdate(typeid, newsdate);
    }
    public int insertOfTypeidAndUserid(String typeid, String userid) {
        return dao.insertOfTypeidAndUserid(typeid, userid);
    }
    public int insertOfTypeidAndStatus(String typeid, String status) {
        return dao.insertOfTypeidAndStatus(typeid, status);
    }
    public int insertOfNewsdateAndUserid(String newsdate, String userid) {
        return dao.insertOfNewsdateAndUserid(newsdate, userid);
    }
    public int insertOfNewsdateAndStatus(String newsdate, String status) {
        return dao.insertOfNewsdateAndStatus(newsdate, status);
    }
    public int insertOfUseridAndStatus(String userid, String status) {
        return dao.insertOfUseridAndStatus(userid, status);
    }
    public int insertOfNewsidAndTitleAndBody(String newsid, String title, String body) {
        return dao.insertOfNewsidAndTitleAndBody(newsid, title, body);
    }
    public int insertOfNewsidAndTitleAndTypeid(String newsid, String title, String typeid) {
        return dao.insertOfNewsidAndTitleAndTypeid(newsid, title, typeid);
    }
    public int insertOfNewsidAndTitleAndNewsdate(String newsid, String title, String newsdate) {
        return dao.insertOfNewsidAndTitleAndNewsdate(newsid, title, newsdate);
    }
    public int insertOfNewsidAndTitleAndUserid(String newsid, String title, String userid) {
        return dao.insertOfNewsidAndTitleAndUserid(newsid, title, userid);
    }
    public int insertOfNewsidAndTitleAndStatus(String newsid, String title, String status) {
        return dao.insertOfNewsidAndTitleAndStatus(newsid, title, status);
    }
    public int insertOfNewsidAndBodyAndTypeid(String newsid, String body, String typeid) {
        return dao.insertOfNewsidAndBodyAndTypeid(newsid, body, typeid);
    }
    public int insertOfNewsidAndBodyAndNewsdate(String newsid, String body, String newsdate) {
        return dao.insertOfNewsidAndBodyAndNewsdate(newsid, body, newsdate);
    }
    public int insertOfNewsidAndBodyAndUserid(String newsid, String body, String userid) {
        return dao.insertOfNewsidAndBodyAndUserid(newsid, body, userid);
    }
    public int insertOfNewsidAndBodyAndStatus(String newsid, String body, String status) {
        return dao.insertOfNewsidAndBodyAndStatus(newsid, body, status);
    }
    public int insertOfNewsidAndTypeidAndNewsdate(String newsid, String typeid, String newsdate) {
        return dao.insertOfNewsidAndTypeidAndNewsdate(newsid, typeid, newsdate);
    }
    public int insertOfNewsidAndTypeidAndUserid(String newsid, String typeid, String userid) {
        return dao.insertOfNewsidAndTypeidAndUserid(newsid, typeid, userid);
    }
    public int insertOfNewsidAndTypeidAndStatus(String newsid, String typeid, String status) {
        return dao.insertOfNewsidAndTypeidAndStatus(newsid, typeid, status);
    }
    public int insertOfNewsidAndNewsdateAndUserid(String newsid, String newsdate, String userid) {
        return dao.insertOfNewsidAndNewsdateAndUserid(newsid, newsdate, userid);
    }
    public int insertOfNewsidAndNewsdateAndStatus(String newsid, String newsdate, String status) {
        return dao.insertOfNewsidAndNewsdateAndStatus(newsid, newsdate, status);
    }
    public int insertOfNewsidAndUseridAndStatus(String newsid, String userid, String status) {
        return dao.insertOfNewsidAndUseridAndStatus(newsid, userid, status);
    }
    public int insertOfTitleAndBodyAndTypeid(String title, String body, String typeid) {
        return dao.insertOfTitleAndBodyAndTypeid(title, body, typeid);
    }
    public int insertOfTitleAndBodyAndNewsdate(String title, String body, String newsdate) {
        return dao.insertOfTitleAndBodyAndNewsdate(title, body, newsdate);
    }
    public int insertOfTitleAndBodyAndUserid(String title, String body, String userid) {
        return dao.insertOfTitleAndBodyAndUserid(title, body, userid);
    }
    public int insertOfTitleAndBodyAndStatus(String title, String body, String status) {
        return dao.insertOfTitleAndBodyAndStatus(title, body, status);
    }
    public int insertOfTitleAndTypeidAndNewsdate(String title, String typeid, String newsdate) {
        return dao.insertOfTitleAndTypeidAndNewsdate(title, typeid, newsdate);
    }
    public int insertOfTitleAndTypeidAndUserid(String title, String typeid, String userid) {
        return dao.insertOfTitleAndTypeidAndUserid(title, typeid, userid);
    }
    public int insertOfTitleAndTypeidAndStatus(String title, String typeid, String status) {
        return dao.insertOfTitleAndTypeidAndStatus(title, typeid, status);
    }
    public int insertOfTitleAndNewsdateAndUserid(String title, String newsdate, String userid) {
        return dao.insertOfTitleAndNewsdateAndUserid(title, newsdate, userid);
    }
    public int insertOfTitleAndNewsdateAndStatus(String title, String newsdate, String status) {
        return dao.insertOfTitleAndNewsdateAndStatus(title, newsdate, status);
    }
    public int insertOfTitleAndUseridAndStatus(String title, String userid, String status) {
        return dao.insertOfTitleAndUseridAndStatus(title, userid, status);
    }
    public int insertOfBodyAndTypeidAndNewsdate(String body, String typeid, String newsdate) {
        return dao.insertOfBodyAndTypeidAndNewsdate(body, typeid, newsdate);
    }
    public int insertOfBodyAndTypeidAndUserid(String body, String typeid, String userid) {
        return dao.insertOfBodyAndTypeidAndUserid(body, typeid, userid);
    }
    public int insertOfBodyAndTypeidAndStatus(String body, String typeid, String status) {
        return dao.insertOfBodyAndTypeidAndStatus(body, typeid, status);
    }
    public int insertOfBodyAndNewsdateAndUserid(String body, String newsdate, String userid) {
        return dao.insertOfBodyAndNewsdateAndUserid(body, newsdate, userid);
    }
    public int insertOfBodyAndNewsdateAndStatus(String body, String newsdate, String status) {
        return dao.insertOfBodyAndNewsdateAndStatus(body, newsdate, status);
    }
    public int insertOfBodyAndUseridAndStatus(String body, String userid, String status) {
        return dao.insertOfBodyAndUseridAndStatus(body, userid, status);
    }
    public int insertOfTypeidAndNewsdateAndUserid(String typeid, String newsdate, String userid) {
        return dao.insertOfTypeidAndNewsdateAndUserid(typeid, newsdate, userid);
    }
    public int insertOfTypeidAndNewsdateAndStatus(String typeid, String newsdate, String status) {
        return dao.insertOfTypeidAndNewsdateAndStatus(typeid, newsdate, status);
    }
    public int insertOfTypeidAndUseridAndStatus(String typeid, String userid, String status) {
        return dao.insertOfTypeidAndUseridAndStatus(typeid, userid, status);
    }
    public int insertOfNewsdateAndUseridAndStatus(String newsdate, String userid, String status) {
        return dao.insertOfNewsdateAndUseridAndStatus(newsdate, userid, status);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeid(String newsid, String title, String body, String typeid) {
        return dao.insertOfNewsidAndTitleAndBodyAndTypeid(newsid, title, body, typeid);
    }
    public int insertOfNewsidAndTitleAndBodyAndNewsdate(String newsid, String title, String body, String newsdate) {
        return dao.insertOfNewsidAndTitleAndBodyAndNewsdate(newsid, title, body, newsdate);
    }
    public int insertOfNewsidAndTitleAndBodyAndUserid(String newsid, String title, String body, String userid) {
        return dao.insertOfNewsidAndTitleAndBodyAndUserid(newsid, title, body, userid);
    }
    public int insertOfNewsidAndTitleAndBodyAndStatus(String newsid, String title, String body, String status) {
        return dao.insertOfNewsidAndTitleAndBodyAndStatus(newsid, title, body, status);
    }
    public int insertOfNewsidAndTitleAndTypeidAndNewsdate(String newsid, String title, String typeid, String newsdate) {
        return dao.insertOfNewsidAndTitleAndTypeidAndNewsdate(newsid, title, typeid, newsdate);
    }
    public int insertOfNewsidAndTitleAndTypeidAndUserid(String newsid, String title, String typeid, String userid) {
        return dao.insertOfNewsidAndTitleAndTypeidAndUserid(newsid, title, typeid, userid);
    }
    public int insertOfNewsidAndTitleAndTypeidAndStatus(String newsid, String title, String typeid, String status) {
        return dao.insertOfNewsidAndTitleAndTypeidAndStatus(newsid, title, typeid, status);
    }
    public int insertOfNewsidAndTitleAndNewsdateAndUserid(String newsid, String title, String newsdate, String userid) {
        return dao.insertOfNewsidAndTitleAndNewsdateAndUserid(newsid, title, newsdate, userid);
    }
    public int insertOfNewsidAndTitleAndNewsdateAndStatus(String newsid, String title, String newsdate, String status) {
        return dao.insertOfNewsidAndTitleAndNewsdateAndStatus(newsid, title, newsdate, status);
    }
    public int insertOfNewsidAndTitleAndUseridAndStatus(String newsid, String title, String userid, String status) {
        return dao.insertOfNewsidAndTitleAndUseridAndStatus(newsid, title, userid, status);
    }
    public int insertOfNewsidAndBodyAndTypeidAndNewsdate(String newsid, String body, String typeid, String newsdate) {
        return dao.insertOfNewsidAndBodyAndTypeidAndNewsdate(newsid, body, typeid, newsdate);
    }
    public int insertOfNewsidAndBodyAndTypeidAndUserid(String newsid, String body, String typeid, String userid) {
        return dao.insertOfNewsidAndBodyAndTypeidAndUserid(newsid, body, typeid, userid);
    }
    public int insertOfNewsidAndBodyAndTypeidAndStatus(String newsid, String body, String typeid, String status) {
        return dao.insertOfNewsidAndBodyAndTypeidAndStatus(newsid, body, typeid, status);
    }
    public int insertOfNewsidAndBodyAndNewsdateAndUserid(String newsid, String body, String newsdate, String userid) {
        return dao.insertOfNewsidAndBodyAndNewsdateAndUserid(newsid, body, newsdate, userid);
    }
    public int insertOfNewsidAndBodyAndNewsdateAndStatus(String newsid, String body, String newsdate, String status) {
        return dao.insertOfNewsidAndBodyAndNewsdateAndStatus(newsid, body, newsdate, status);
    }
    public int insertOfNewsidAndBodyAndUseridAndStatus(String newsid, String body, String userid, String status) {
        return dao.insertOfNewsidAndBodyAndUseridAndStatus(newsid, body, userid, status);
    }
    public int insertOfNewsidAndTypeidAndNewsdateAndUserid(String newsid, String typeid, String newsdate, String userid) {
        return dao.insertOfNewsidAndTypeidAndNewsdateAndUserid(newsid, typeid, newsdate, userid);
    }
    public int insertOfNewsidAndTypeidAndNewsdateAndStatus(String newsid, String typeid, String newsdate, String status) {
        return dao.insertOfNewsidAndTypeidAndNewsdateAndStatus(newsid, typeid, newsdate, status);
    }
    public int insertOfNewsidAndTypeidAndUseridAndStatus(String newsid, String typeid, String userid, String status) {
        return dao.insertOfNewsidAndTypeidAndUseridAndStatus(newsid, typeid, userid, status);
    }
    public int insertOfNewsidAndNewsdateAndUseridAndStatus(String newsid, String newsdate, String userid, String status) {
        return dao.insertOfNewsidAndNewsdateAndUseridAndStatus(newsid, newsdate, userid, status);
    }
    public int insertOfTitleAndBodyAndTypeidAndNewsdate(String title, String body, String typeid, String newsdate) {
        return dao.insertOfTitleAndBodyAndTypeidAndNewsdate(title, body, typeid, newsdate);
    }
    public int insertOfTitleAndBodyAndTypeidAndUserid(String title, String body, String typeid, String userid) {
        return dao.insertOfTitleAndBodyAndTypeidAndUserid(title, body, typeid, userid);
    }
    public int insertOfTitleAndBodyAndTypeidAndStatus(String title, String body, String typeid, String status) {
        return dao.insertOfTitleAndBodyAndTypeidAndStatus(title, body, typeid, status);
    }
    public int insertOfTitleAndBodyAndNewsdateAndUserid(String title, String body, String newsdate, String userid) {
        return dao.insertOfTitleAndBodyAndNewsdateAndUserid(title, body, newsdate, userid);
    }
    public int insertOfTitleAndBodyAndNewsdateAndStatus(String title, String body, String newsdate, String status) {
        return dao.insertOfTitleAndBodyAndNewsdateAndStatus(title, body, newsdate, status);
    }
    public int insertOfTitleAndBodyAndUseridAndStatus(String title, String body, String userid, String status) {
        return dao.insertOfTitleAndBodyAndUseridAndStatus(title, body, userid, status);
    }
    public int insertOfTitleAndTypeidAndNewsdateAndUserid(String title, String typeid, String newsdate, String userid) {
        return dao.insertOfTitleAndTypeidAndNewsdateAndUserid(title, typeid, newsdate, userid);
    }
    public int insertOfTitleAndTypeidAndNewsdateAndStatus(String title, String typeid, String newsdate, String status) {
        return dao.insertOfTitleAndTypeidAndNewsdateAndStatus(title, typeid, newsdate, status);
    }
    public int insertOfTitleAndTypeidAndUseridAndStatus(String title, String typeid, String userid, String status) {
        return dao.insertOfTitleAndTypeidAndUseridAndStatus(title, typeid, userid, status);
    }
    public int insertOfTitleAndNewsdateAndUseridAndStatus(String title, String newsdate, String userid, String status) {
        return dao.insertOfTitleAndNewsdateAndUseridAndStatus(title, newsdate, userid, status);
    }
    public int insertOfBodyAndTypeidAndNewsdateAndUserid(String body, String typeid, String newsdate, String userid) {
        return dao.insertOfBodyAndTypeidAndNewsdateAndUserid(body, typeid, newsdate, userid);
    }
    public int insertOfBodyAndTypeidAndNewsdateAndStatus(String body, String typeid, String newsdate, String status) {
        return dao.insertOfBodyAndTypeidAndNewsdateAndStatus(body, typeid, newsdate, status);
    }
    public int insertOfBodyAndTypeidAndUseridAndStatus(String body, String typeid, String userid, String status) {
        return dao.insertOfBodyAndTypeidAndUseridAndStatus(body, typeid, userid, status);
    }
    public int insertOfBodyAndNewsdateAndUseridAndStatus(String body, String newsdate, String userid, String status) {
        return dao.insertOfBodyAndNewsdateAndUseridAndStatus(body, newsdate, userid, status);
    }
    public int insertOfTypeidAndNewsdateAndUseridAndStatus(String typeid, String newsdate, String userid, String status) {
        return dao.insertOfTypeidAndNewsdateAndUseridAndStatus(typeid, newsdate, userid, status);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(String newsid, String title, String body, String typeid, String newsdate) {
        return dao.insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(newsid, title, body, typeid, newsdate);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndUserid(String newsid, String title, String body, String typeid, String userid) {
        return dao.insertOfNewsidAndTitleAndBodyAndTypeidAndUserid(newsid, title, body, typeid, userid);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndStatus(String newsid, String title, String body, String typeid, String status) {
        return dao.insertOfNewsidAndTitleAndBodyAndTypeidAndStatus(newsid, title, body, typeid, status);
    }
    public int insertOfNewsidAndTitleAndBodyAndNewsdateAndUserid(String newsid, String title, String body, String newsdate, String userid) {
        return dao.insertOfNewsidAndTitleAndBodyAndNewsdateAndUserid(newsid, title, body, newsdate, userid);
    }
    public int insertOfNewsidAndTitleAndBodyAndNewsdateAndStatus(String newsid, String title, String body, String newsdate, String status) {
        return dao.insertOfNewsidAndTitleAndBodyAndNewsdateAndStatus(newsid, title, body, newsdate, status);
    }
    public int insertOfNewsidAndTitleAndBodyAndUseridAndStatus(String newsid, String title, String body, String userid, String status) {
        return dao.insertOfNewsidAndTitleAndBodyAndUseridAndStatus(newsid, title, body, userid, status);
    }
    public int insertOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(String newsid, String title, String typeid, String newsdate, String userid) {
        return dao.insertOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(newsid, title, typeid, newsdate, userid);
    }
    public int insertOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(String newsid, String title, String typeid, String newsdate, String status) {
        return dao.insertOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(newsid, title, typeid, newsdate, status);
    }
    public int insertOfNewsidAndTitleAndTypeidAndUseridAndStatus(String newsid, String title, String typeid, String userid, String status) {
        return dao.insertOfNewsidAndTitleAndTypeidAndUseridAndStatus(newsid, title, typeid, userid, status);
    }
    public int insertOfNewsidAndTitleAndNewsdateAndUseridAndStatus(String newsid, String title, String newsdate, String userid, String status) {
        return dao.insertOfNewsidAndTitleAndNewsdateAndUseridAndStatus(newsid, title, newsdate, userid, status);
    }
    public int insertOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String body, String typeid, String newsdate, String userid) {
        return dao.insertOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(newsid, body, typeid, newsdate, userid);
    }
    public int insertOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String body, String typeid, String newsdate, String status) {
        return dao.insertOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(newsid, body, typeid, newsdate, status);
    }
    public int insertOfNewsidAndBodyAndTypeidAndUseridAndStatus(String newsid, String body, String typeid, String userid, String status) {
        return dao.insertOfNewsidAndBodyAndTypeidAndUseridAndStatus(newsid, body, typeid, userid, status);
    }
    public int insertOfNewsidAndBodyAndNewsdateAndUseridAndStatus(String newsid, String body, String newsdate, String userid, String status) {
        return dao.insertOfNewsidAndBodyAndNewsdateAndUseridAndStatus(newsid, body, newsdate, userid, status);
    }
    public int insertOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String typeid, String newsdate, String userid, String status) {
        return dao.insertOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(newsid, typeid, newsdate, userid, status);
    }
    public int insertOfTitleAndBodyAndTypeidAndNewsdateAndUserid(String title, String body, String typeid, String newsdate, String userid) {
        return dao.insertOfTitleAndBodyAndTypeidAndNewsdateAndUserid(title, body, typeid, newsdate, userid);
    }
    public int insertOfTitleAndBodyAndTypeidAndNewsdateAndStatus(String title, String body, String typeid, String newsdate, String status) {
        return dao.insertOfTitleAndBodyAndTypeidAndNewsdateAndStatus(title, body, typeid, newsdate, status);
    }
    public int insertOfTitleAndBodyAndTypeidAndUseridAndStatus(String title, String body, String typeid, String userid, String status) {
        return dao.insertOfTitleAndBodyAndTypeidAndUseridAndStatus(title, body, typeid, userid, status);
    }
    public int insertOfTitleAndBodyAndNewsdateAndUseridAndStatus(String title, String body, String newsdate, String userid, String status) {
        return dao.insertOfTitleAndBodyAndNewsdateAndUseridAndStatus(title, body, newsdate, userid, status);
    }
    public int insertOfTitleAndTypeidAndNewsdateAndUseridAndStatus(String title, String typeid, String newsdate, String userid, String status) {
        return dao.insertOfTitleAndTypeidAndNewsdateAndUseridAndStatus(title, typeid, newsdate, userid, status);
    }
    public int insertOfBodyAndTypeidAndNewsdateAndUseridAndStatus(String body, String typeid, String newsdate, String userid, String status) {
        return dao.insertOfBodyAndTypeidAndNewsdateAndUseridAndStatus(body, typeid, newsdate, userid, status);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String title, String body, String typeid, String newsdate, String userid) {
        return dao.insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(newsid, title, body, typeid, newsdate, userid);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String title, String body, String typeid, String newsdate, String status) {
        return dao.insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(newsid, title, body, typeid, newsdate, status);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(String newsid, String title, String body, String typeid, String userid, String status) {
        return dao.insertOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(newsid, title, body, typeid, userid, status);
    }
    public int insertOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String newsdate, String userid, String status) {
        return dao.insertOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(newsid, title, body, newsdate, userid, status);
    }
    public int insertOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String typeid, String newsdate, String userid, String status) {
        return dao.insertOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(newsid, title, typeid, newsdate, userid, status);
    }
    public int insertOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String body, String typeid, String newsdate, String userid, String status) {
        return dao.insertOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(newsid, body, typeid, newsdate, userid, status);
    }
    public int insertOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.insertOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(title, body, typeid, newsdate, userid, status);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(newsid, title, body, typeid, newsdate, userid, status);
    }
    public News getNews(News news) {
        return dao.getNews(news);
    }
    public News getNewsOfNewsid(String newsid) {
        return dao.getNewsOfNewsid(newsid);
    }
    public News getNewsOfTitle(String title) {
        return dao.getNewsOfTitle(title);
    }
    public News getNewsOfBody(String body) {
        return dao.getNewsOfBody(body);
    }
    public News getNewsOfTypeid(String typeid) {
        return dao.getNewsOfTypeid(typeid);
    }
    public News getNewsOfNewsdate(String newsdate) {
        return dao.getNewsOfNewsdate(newsdate);
    }
    public News getNewsOfUserid(String userid) {
        return dao.getNewsOfUserid(userid);
    }
    public News getNewsOfStatus(String status) {
        return dao.getNewsOfStatus(status);
    }
    public News getNewsOfNewsidAndTitle(String newsid, String title) {
        return dao.getNewsOfNewsidAndTitle(newsid, title);
    }
    public News getNewsOfNewsidAndBody(String newsid, String body) {
        return dao.getNewsOfNewsidAndBody(newsid, body);
    }
    public News getNewsOfNewsidAndTypeid(String newsid, String typeid) {
        return dao.getNewsOfNewsidAndTypeid(newsid, typeid);
    }
    public News getNewsOfNewsidAndNewsdate(String newsid, String newsdate) {
        return dao.getNewsOfNewsidAndNewsdate(newsid, newsdate);
    }
    public News getNewsOfNewsidAndUserid(String newsid, String userid) {
        return dao.getNewsOfNewsidAndUserid(newsid, userid);
    }
    public News getNewsOfNewsidAndStatus(String newsid, String status) {
        return dao.getNewsOfNewsidAndStatus(newsid, status);
    }
    public News getNewsOfTitleAndBody(String title, String body) {
        return dao.getNewsOfTitleAndBody(title, body);
    }
    public News getNewsOfTitleAndTypeid(String title, String typeid) {
        return dao.getNewsOfTitleAndTypeid(title, typeid);
    }
    public News getNewsOfTitleAndNewsdate(String title, String newsdate) {
        return dao.getNewsOfTitleAndNewsdate(title, newsdate);
    }
    public News getNewsOfTitleAndUserid(String title, String userid) {
        return dao.getNewsOfTitleAndUserid(title, userid);
    }
    public News getNewsOfTitleAndStatus(String title, String status) {
        return dao.getNewsOfTitleAndStatus(title, status);
    }
    public News getNewsOfBodyAndTypeid(String body, String typeid) {
        return dao.getNewsOfBodyAndTypeid(body, typeid);
    }
    public News getNewsOfBodyAndNewsdate(String body, String newsdate) {
        return dao.getNewsOfBodyAndNewsdate(body, newsdate);
    }
    public News getNewsOfBodyAndUserid(String body, String userid) {
        return dao.getNewsOfBodyAndUserid(body, userid);
    }
    public News getNewsOfBodyAndStatus(String body, String status) {
        return dao.getNewsOfBodyAndStatus(body, status);
    }
    public News getNewsOfTypeidAndNewsdate(String typeid, String newsdate) {
        return dao.getNewsOfTypeidAndNewsdate(typeid, newsdate);
    }
    public News getNewsOfTypeidAndUserid(String typeid, String userid) {
        return dao.getNewsOfTypeidAndUserid(typeid, userid);
    }
    public News getNewsOfTypeidAndStatus(String typeid, String status) {
        return dao.getNewsOfTypeidAndStatus(typeid, status);
    }
    public News getNewsOfNewsdateAndUserid(String newsdate, String userid) {
        return dao.getNewsOfNewsdateAndUserid(newsdate, userid);
    }
    public News getNewsOfNewsdateAndStatus(String newsdate, String status) {
        return dao.getNewsOfNewsdateAndStatus(newsdate, status);
    }
    public News getNewsOfUseridAndStatus(String userid, String status) {
        return dao.getNewsOfUseridAndStatus(userid, status);
    }
    public News getNewsOfNewsidAndTitleAndBody(String newsid, String title, String body) {
        return dao.getNewsOfNewsidAndTitleAndBody(newsid, title, body);
    }
    public News getNewsOfNewsidAndTitleAndTypeid(String newsid, String title, String typeid) {
        return dao.getNewsOfNewsidAndTitleAndTypeid(newsid, title, typeid);
    }
    public News getNewsOfNewsidAndTitleAndNewsdate(String newsid, String title, String newsdate) {
        return dao.getNewsOfNewsidAndTitleAndNewsdate(newsid, title, newsdate);
    }
    public News getNewsOfNewsidAndTitleAndUserid(String newsid, String title, String userid) {
        return dao.getNewsOfNewsidAndTitleAndUserid(newsid, title, userid);
    }
    public News getNewsOfNewsidAndTitleAndStatus(String newsid, String title, String status) {
        return dao.getNewsOfNewsidAndTitleAndStatus(newsid, title, status);
    }
    public News getNewsOfNewsidAndBodyAndTypeid(String newsid, String body, String typeid) {
        return dao.getNewsOfNewsidAndBodyAndTypeid(newsid, body, typeid);
    }
    public News getNewsOfNewsidAndBodyAndNewsdate(String newsid, String body, String newsdate) {
        return dao.getNewsOfNewsidAndBodyAndNewsdate(newsid, body, newsdate);
    }
    public News getNewsOfNewsidAndBodyAndUserid(String newsid, String body, String userid) {
        return dao.getNewsOfNewsidAndBodyAndUserid(newsid, body, userid);
    }
    public News getNewsOfNewsidAndBodyAndStatus(String newsid, String body, String status) {
        return dao.getNewsOfNewsidAndBodyAndStatus(newsid, body, status);
    }
    public News getNewsOfNewsidAndTypeidAndNewsdate(String newsid, String typeid, String newsdate) {
        return dao.getNewsOfNewsidAndTypeidAndNewsdate(newsid, typeid, newsdate);
    }
    public News getNewsOfNewsidAndTypeidAndUserid(String newsid, String typeid, String userid) {
        return dao.getNewsOfNewsidAndTypeidAndUserid(newsid, typeid, userid);
    }
    public News getNewsOfNewsidAndTypeidAndStatus(String newsid, String typeid, String status) {
        return dao.getNewsOfNewsidAndTypeidAndStatus(newsid, typeid, status);
    }
    public News getNewsOfNewsidAndNewsdateAndUserid(String newsid, String newsdate, String userid) {
        return dao.getNewsOfNewsidAndNewsdateAndUserid(newsid, newsdate, userid);
    }
    public News getNewsOfNewsidAndNewsdateAndStatus(String newsid, String newsdate, String status) {
        return dao.getNewsOfNewsidAndNewsdateAndStatus(newsid, newsdate, status);
    }
    public News getNewsOfNewsidAndUseridAndStatus(String newsid, String userid, String status) {
        return dao.getNewsOfNewsidAndUseridAndStatus(newsid, userid, status);
    }
    public News getNewsOfTitleAndBodyAndTypeid(String title, String body, String typeid) {
        return dao.getNewsOfTitleAndBodyAndTypeid(title, body, typeid);
    }
    public News getNewsOfTitleAndBodyAndNewsdate(String title, String body, String newsdate) {
        return dao.getNewsOfTitleAndBodyAndNewsdate(title, body, newsdate);
    }
    public News getNewsOfTitleAndBodyAndUserid(String title, String body, String userid) {
        return dao.getNewsOfTitleAndBodyAndUserid(title, body, userid);
    }
    public News getNewsOfTitleAndBodyAndStatus(String title, String body, String status) {
        return dao.getNewsOfTitleAndBodyAndStatus(title, body, status);
    }
    public News getNewsOfTitleAndTypeidAndNewsdate(String title, String typeid, String newsdate) {
        return dao.getNewsOfTitleAndTypeidAndNewsdate(title, typeid, newsdate);
    }
    public News getNewsOfTitleAndTypeidAndUserid(String title, String typeid, String userid) {
        return dao.getNewsOfTitleAndTypeidAndUserid(title, typeid, userid);
    }
    public News getNewsOfTitleAndTypeidAndStatus(String title, String typeid, String status) {
        return dao.getNewsOfTitleAndTypeidAndStatus(title, typeid, status);
    }
    public News getNewsOfTitleAndNewsdateAndUserid(String title, String newsdate, String userid) {
        return dao.getNewsOfTitleAndNewsdateAndUserid(title, newsdate, userid);
    }
    public News getNewsOfTitleAndNewsdateAndStatus(String title, String newsdate, String status) {
        return dao.getNewsOfTitleAndNewsdateAndStatus(title, newsdate, status);
    }
    public News getNewsOfTitleAndUseridAndStatus(String title, String userid, String status) {
        return dao.getNewsOfTitleAndUseridAndStatus(title, userid, status);
    }
    public News getNewsOfBodyAndTypeidAndNewsdate(String body, String typeid, String newsdate) {
        return dao.getNewsOfBodyAndTypeidAndNewsdate(body, typeid, newsdate);
    }
    public News getNewsOfBodyAndTypeidAndUserid(String body, String typeid, String userid) {
        return dao.getNewsOfBodyAndTypeidAndUserid(body, typeid, userid);
    }
    public News getNewsOfBodyAndTypeidAndStatus(String body, String typeid, String status) {
        return dao.getNewsOfBodyAndTypeidAndStatus(body, typeid, status);
    }
    public News getNewsOfBodyAndNewsdateAndUserid(String body, String newsdate, String userid) {
        return dao.getNewsOfBodyAndNewsdateAndUserid(body, newsdate, userid);
    }
    public News getNewsOfBodyAndNewsdateAndStatus(String body, String newsdate, String status) {
        return dao.getNewsOfBodyAndNewsdateAndStatus(body, newsdate, status);
    }
    public News getNewsOfBodyAndUseridAndStatus(String body, String userid, String status) {
        return dao.getNewsOfBodyAndUseridAndStatus(body, userid, status);
    }
    public News getNewsOfTypeidAndNewsdateAndUserid(String typeid, String newsdate, String userid) {
        return dao.getNewsOfTypeidAndNewsdateAndUserid(typeid, newsdate, userid);
    }
    public News getNewsOfTypeidAndNewsdateAndStatus(String typeid, String newsdate, String status) {
        return dao.getNewsOfTypeidAndNewsdateAndStatus(typeid, newsdate, status);
    }
    public News getNewsOfTypeidAndUseridAndStatus(String typeid, String userid, String status) {
        return dao.getNewsOfTypeidAndUseridAndStatus(typeid, userid, status);
    }
    public News getNewsOfNewsdateAndUseridAndStatus(String newsdate, String userid, String status) {
        return dao.getNewsOfNewsdateAndUseridAndStatus(newsdate, userid, status);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeid(String newsid, String title, String body, String typeid) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndTypeid(newsid, title, body, typeid);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndNewsdate(String newsid, String title, String body, String newsdate) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndNewsdate(newsid, title, body, newsdate);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndUserid(String newsid, String title, String body, String userid) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndUserid(newsid, title, body, userid);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndStatus(String newsid, String title, String body, String status) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndStatus(newsid, title, body, status);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndNewsdate(String newsid, String title, String typeid, String newsdate) {
        return dao.getNewsOfNewsidAndTitleAndTypeidAndNewsdate(newsid, title, typeid, newsdate);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndUserid(String newsid, String title, String typeid, String userid) {
        return dao.getNewsOfNewsidAndTitleAndTypeidAndUserid(newsid, title, typeid, userid);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndStatus(String newsid, String title, String typeid, String status) {
        return dao.getNewsOfNewsidAndTitleAndTypeidAndStatus(newsid, title, typeid, status);
    }
    public News getNewsOfNewsidAndTitleAndNewsdateAndUserid(String newsid, String title, String newsdate, String userid) {
        return dao.getNewsOfNewsidAndTitleAndNewsdateAndUserid(newsid, title, newsdate, userid);
    }
    public News getNewsOfNewsidAndTitleAndNewsdateAndStatus(String newsid, String title, String newsdate, String status) {
        return dao.getNewsOfNewsidAndTitleAndNewsdateAndStatus(newsid, title, newsdate, status);
    }
    public News getNewsOfNewsidAndTitleAndUseridAndStatus(String newsid, String title, String userid, String status) {
        return dao.getNewsOfNewsidAndTitleAndUseridAndStatus(newsid, title, userid, status);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndNewsdate(String newsid, String body, String typeid, String newsdate) {
        return dao.getNewsOfNewsidAndBodyAndTypeidAndNewsdate(newsid, body, typeid, newsdate);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndUserid(String newsid, String body, String typeid, String userid) {
        return dao.getNewsOfNewsidAndBodyAndTypeidAndUserid(newsid, body, typeid, userid);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndStatus(String newsid, String body, String typeid, String status) {
        return dao.getNewsOfNewsidAndBodyAndTypeidAndStatus(newsid, body, typeid, status);
    }
    public News getNewsOfNewsidAndBodyAndNewsdateAndUserid(String newsid, String body, String newsdate, String userid) {
        return dao.getNewsOfNewsidAndBodyAndNewsdateAndUserid(newsid, body, newsdate, userid);
    }
    public News getNewsOfNewsidAndBodyAndNewsdateAndStatus(String newsid, String body, String newsdate, String status) {
        return dao.getNewsOfNewsidAndBodyAndNewsdateAndStatus(newsid, body, newsdate, status);
    }
    public News getNewsOfNewsidAndBodyAndUseridAndStatus(String newsid, String body, String userid, String status) {
        return dao.getNewsOfNewsidAndBodyAndUseridAndStatus(newsid, body, userid, status);
    }
    public News getNewsOfNewsidAndTypeidAndNewsdateAndUserid(String newsid, String typeid, String newsdate, String userid) {
        return dao.getNewsOfNewsidAndTypeidAndNewsdateAndUserid(newsid, typeid, newsdate, userid);
    }
    public News getNewsOfNewsidAndTypeidAndNewsdateAndStatus(String newsid, String typeid, String newsdate, String status) {
        return dao.getNewsOfNewsidAndTypeidAndNewsdateAndStatus(newsid, typeid, newsdate, status);
    }
    public News getNewsOfNewsidAndTypeidAndUseridAndStatus(String newsid, String typeid, String userid, String status) {
        return dao.getNewsOfNewsidAndTypeidAndUseridAndStatus(newsid, typeid, userid, status);
    }
    public News getNewsOfNewsidAndNewsdateAndUseridAndStatus(String newsid, String newsdate, String userid, String status) {
        return dao.getNewsOfNewsidAndNewsdateAndUseridAndStatus(newsid, newsdate, userid, status);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndNewsdate(String title, String body, String typeid, String newsdate) {
        return dao.getNewsOfTitleAndBodyAndTypeidAndNewsdate(title, body, typeid, newsdate);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndUserid(String title, String body, String typeid, String userid) {
        return dao.getNewsOfTitleAndBodyAndTypeidAndUserid(title, body, typeid, userid);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndStatus(String title, String body, String typeid, String status) {
        return dao.getNewsOfTitleAndBodyAndTypeidAndStatus(title, body, typeid, status);
    }
    public News getNewsOfTitleAndBodyAndNewsdateAndUserid(String title, String body, String newsdate, String userid) {
        return dao.getNewsOfTitleAndBodyAndNewsdateAndUserid(title, body, newsdate, userid);
    }
    public News getNewsOfTitleAndBodyAndNewsdateAndStatus(String title, String body, String newsdate, String status) {
        return dao.getNewsOfTitleAndBodyAndNewsdateAndStatus(title, body, newsdate, status);
    }
    public News getNewsOfTitleAndBodyAndUseridAndStatus(String title, String body, String userid, String status) {
        return dao.getNewsOfTitleAndBodyAndUseridAndStatus(title, body, userid, status);
    }
    public News getNewsOfTitleAndTypeidAndNewsdateAndUserid(String title, String typeid, String newsdate, String userid) {
        return dao.getNewsOfTitleAndTypeidAndNewsdateAndUserid(title, typeid, newsdate, userid);
    }
    public News getNewsOfTitleAndTypeidAndNewsdateAndStatus(String title, String typeid, String newsdate, String status) {
        return dao.getNewsOfTitleAndTypeidAndNewsdateAndStatus(title, typeid, newsdate, status);
    }
    public News getNewsOfTitleAndTypeidAndUseridAndStatus(String title, String typeid, String userid, String status) {
        return dao.getNewsOfTitleAndTypeidAndUseridAndStatus(title, typeid, userid, status);
    }
    public News getNewsOfTitleAndNewsdateAndUseridAndStatus(String title, String newsdate, String userid, String status) {
        return dao.getNewsOfTitleAndNewsdateAndUseridAndStatus(title, newsdate, userid, status);
    }
    public News getNewsOfBodyAndTypeidAndNewsdateAndUserid(String body, String typeid, String newsdate, String userid) {
        return dao.getNewsOfBodyAndTypeidAndNewsdateAndUserid(body, typeid, newsdate, userid);
    }
    public News getNewsOfBodyAndTypeidAndNewsdateAndStatus(String body, String typeid, String newsdate, String status) {
        return dao.getNewsOfBodyAndTypeidAndNewsdateAndStatus(body, typeid, newsdate, status);
    }
    public News getNewsOfBodyAndTypeidAndUseridAndStatus(String body, String typeid, String userid, String status) {
        return dao.getNewsOfBodyAndTypeidAndUseridAndStatus(body, typeid, userid, status);
    }
    public News getNewsOfBodyAndNewsdateAndUseridAndStatus(String body, String newsdate, String userid, String status) {
        return dao.getNewsOfBodyAndNewsdateAndUseridAndStatus(body, newsdate, userid, status);
    }
    public News getNewsOfTypeidAndNewsdateAndUseridAndStatus(String typeid, String newsdate, String userid, String status) {
        return dao.getNewsOfTypeidAndNewsdateAndUseridAndStatus(typeid, newsdate, userid, status);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(String newsid, String title, String body, String typeid, String newsdate) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(newsid, title, body, typeid, newsdate);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndUserid(String newsid, String title, String body, String typeid, String userid) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndTypeidAndUserid(newsid, title, body, typeid, userid);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndStatus(String newsid, String title, String body, String typeid, String status) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndTypeidAndStatus(newsid, title, body, typeid, status);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndNewsdateAndUserid(String newsid, String title, String body, String newsdate, String userid) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndNewsdateAndUserid(newsid, title, body, newsdate, userid);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndNewsdateAndStatus(String newsid, String title, String body, String newsdate, String status) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndNewsdateAndStatus(newsid, title, body, newsdate, status);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndUseridAndStatus(String newsid, String title, String body, String userid, String status) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndUseridAndStatus(newsid, title, body, userid, status);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(String newsid, String title, String typeid, String newsdate, String userid) {
        return dao.getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(newsid, title, typeid, newsdate, userid);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(String newsid, String title, String typeid, String newsdate, String status) {
        return dao.getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(newsid, title, typeid, newsdate, status);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndUseridAndStatus(String newsid, String title, String typeid, String userid, String status) {
        return dao.getNewsOfNewsidAndTitleAndTypeidAndUseridAndStatus(newsid, title, typeid, userid, status);
    }
    public News getNewsOfNewsidAndTitleAndNewsdateAndUseridAndStatus(String newsid, String title, String newsdate, String userid, String status) {
        return dao.getNewsOfNewsidAndTitleAndNewsdateAndUseridAndStatus(newsid, title, newsdate, userid, status);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String body, String typeid, String newsdate, String userid) {
        return dao.getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(newsid, body, typeid, newsdate, userid);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String body, String typeid, String newsdate, String status) {
        return dao.getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(newsid, body, typeid, newsdate, status);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndUseridAndStatus(String newsid, String body, String typeid, String userid, String status) {
        return dao.getNewsOfNewsidAndBodyAndTypeidAndUseridAndStatus(newsid, body, typeid, userid, status);
    }
    public News getNewsOfNewsidAndBodyAndNewsdateAndUseridAndStatus(String newsid, String body, String newsdate, String userid, String status) {
        return dao.getNewsOfNewsidAndBodyAndNewsdateAndUseridAndStatus(newsid, body, newsdate, userid, status);
    }
    public News getNewsOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String typeid, String newsdate, String userid, String status) {
        return dao.getNewsOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(newsid, typeid, newsdate, userid, status);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndNewsdateAndUserid(String title, String body, String typeid, String newsdate, String userid) {
        return dao.getNewsOfTitleAndBodyAndTypeidAndNewsdateAndUserid(title, body, typeid, newsdate, userid);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndNewsdateAndStatus(String title, String body, String typeid, String newsdate, String status) {
        return dao.getNewsOfTitleAndBodyAndTypeidAndNewsdateAndStatus(title, body, typeid, newsdate, status);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndUseridAndStatus(String title, String body, String typeid, String userid, String status) {
        return dao.getNewsOfTitleAndBodyAndTypeidAndUseridAndStatus(title, body, typeid, userid, status);
    }
    public News getNewsOfTitleAndBodyAndNewsdateAndUseridAndStatus(String title, String body, String newsdate, String userid, String status) {
        return dao.getNewsOfTitleAndBodyAndNewsdateAndUseridAndStatus(title, body, newsdate, userid, status);
    }
    public News getNewsOfTitleAndTypeidAndNewsdateAndUseridAndStatus(String title, String typeid, String newsdate, String userid, String status) {
        return dao.getNewsOfTitleAndTypeidAndNewsdateAndUseridAndStatus(title, typeid, newsdate, userid, status);
    }
    public News getNewsOfBodyAndTypeidAndNewsdateAndUseridAndStatus(String body, String typeid, String newsdate, String userid, String status) {
        return dao.getNewsOfBodyAndTypeidAndNewsdateAndUseridAndStatus(body, typeid, newsdate, userid, status);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String title, String body, String typeid, String newsdate, String userid) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(newsid, title, body, typeid, newsdate, userid);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String title, String body, String typeid, String newsdate, String status) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(newsid, title, body, typeid, newsdate, status);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(String newsid, String title, String body, String typeid, String userid, String status) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(newsid, title, body, typeid, userid, status);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String newsdate, String userid, String status) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(newsid, title, body, newsdate, userid, status);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String typeid, String newsdate, String userid, String status) {
        return dao.getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(newsid, title, typeid, newsdate, userid, status);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String body, String typeid, String newsdate, String userid, String status) {
        return dao.getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(newsid, body, typeid, newsdate, userid, status);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.getNewsOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(title, body, typeid, newsdate, userid, status);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(newsid, title, body, typeid, newsdate, userid, status);
    }
    public List<News> getNewss(News news) {
        return dao.getNewss(news);
    }
    public List<News> getNewssOfNewsid(String newsid) {
        return dao.getNewssOfNewsid(newsid);
    }
    public List<News> getNewssOfTitle(String title) {
        return dao.getNewssOfTitle(title);
    }
    public List<News> getNewssOfBody(String body) {
        return dao.getNewssOfBody(body);
    }
    public List<News> getNewssOfTypeid(String typeid) {
        return dao.getNewssOfTypeid(typeid);
    }
    public List<News> getNewssOfNewsdate(String newsdate) {
        return dao.getNewssOfNewsdate(newsdate);
    }
    public List<News> getNewssOfUserid(String userid) {
        return dao.getNewssOfUserid(userid);
    }
    public List<News> getNewssOfStatus(String status) {
        return dao.getNewssOfStatus(status);
    }
    public List<News> getNewssOfNewsidAndTitle(String newsid, String title) {
        return dao.getNewssOfNewsidAndTitle(newsid, title);
    }
    public List<News> getNewssOfNewsidAndBody(String newsid, String body) {
        return dao.getNewssOfNewsidAndBody(newsid, body);
    }
    public List<News> getNewssOfNewsidAndTypeid(String newsid, String typeid) {
        return dao.getNewssOfNewsidAndTypeid(newsid, typeid);
    }
    public List<News> getNewssOfNewsidAndNewsdate(String newsid, String newsdate) {
        return dao.getNewssOfNewsidAndNewsdate(newsid, newsdate);
    }
    public List<News> getNewssOfNewsidAndUserid(String newsid, String userid) {
        return dao.getNewssOfNewsidAndUserid(newsid, userid);
    }
    public List<News> getNewssOfNewsidAndStatus(String newsid, String status) {
        return dao.getNewssOfNewsidAndStatus(newsid, status);
    }
    public List<News> getNewssOfTitleAndBody(String title, String body) {
        return dao.getNewssOfTitleAndBody(title, body);
    }
    public List<News> getNewssOfTitleAndTypeid(String title, String typeid) {
        return dao.getNewssOfTitleAndTypeid(title, typeid);
    }
    public List<News> getNewssOfTitleAndNewsdate(String title, String newsdate) {
        return dao.getNewssOfTitleAndNewsdate(title, newsdate);
    }
    public List<News> getNewssOfTitleAndUserid(String title, String userid) {
        return dao.getNewssOfTitleAndUserid(title, userid);
    }
    public List<News> getNewssOfTitleAndStatus(String title, String status) {
        return dao.getNewssOfTitleAndStatus(title, status);
    }
    public List<News> getNewssOfBodyAndTypeid(String body, String typeid) {
        return dao.getNewssOfBodyAndTypeid(body, typeid);
    }
    public List<News> getNewssOfBodyAndNewsdate(String body, String newsdate) {
        return dao.getNewssOfBodyAndNewsdate(body, newsdate);
    }
    public List<News> getNewssOfBodyAndUserid(String body, String userid) {
        return dao.getNewssOfBodyAndUserid(body, userid);
    }
    public List<News> getNewssOfBodyAndStatus(String body, String status) {
        return dao.getNewssOfBodyAndStatus(body, status);
    }
    public List<News> getNewssOfTypeidAndNewsdate(String typeid, String newsdate) {
        return dao.getNewssOfTypeidAndNewsdate(typeid, newsdate);
    }
    public List<News> getNewssOfTypeidAndUserid(String typeid, String userid) {
        return dao.getNewssOfTypeidAndUserid(typeid, userid);
    }
    public List<News> getNewssOfTypeidAndStatus(String typeid, String status) {
        return dao.getNewssOfTypeidAndStatus(typeid, status);
    }
    public List<News> getNewssOfNewsdateAndUserid(String newsdate, String userid) {
        return dao.getNewssOfNewsdateAndUserid(newsdate, userid);
    }
    public List<News> getNewssOfNewsdateAndStatus(String newsdate, String status) {
        return dao.getNewssOfNewsdateAndStatus(newsdate, status);
    }
    public List<News> getNewssOfUseridAndStatus(String userid, String status) {
        return dao.getNewssOfUseridAndStatus(userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBody(String newsid, String title, String body) {
        return dao.getNewssOfNewsidAndTitleAndBody(newsid, title, body);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeid(String newsid, String title, String typeid) {
        return dao.getNewssOfNewsidAndTitleAndTypeid(newsid, title, typeid);
    }
    public List<News> getNewssOfNewsidAndTitleAndNewsdate(String newsid, String title, String newsdate) {
        return dao.getNewssOfNewsidAndTitleAndNewsdate(newsid, title, newsdate);
    }
    public List<News> getNewssOfNewsidAndTitleAndUserid(String newsid, String title, String userid) {
        return dao.getNewssOfNewsidAndTitleAndUserid(newsid, title, userid);
    }
    public List<News> getNewssOfNewsidAndTitleAndStatus(String newsid, String title, String status) {
        return dao.getNewssOfNewsidAndTitleAndStatus(newsid, title, status);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeid(String newsid, String body, String typeid) {
        return dao.getNewssOfNewsidAndBodyAndTypeid(newsid, body, typeid);
    }
    public List<News> getNewssOfNewsidAndBodyAndNewsdate(String newsid, String body, String newsdate) {
        return dao.getNewssOfNewsidAndBodyAndNewsdate(newsid, body, newsdate);
    }
    public List<News> getNewssOfNewsidAndBodyAndUserid(String newsid, String body, String userid) {
        return dao.getNewssOfNewsidAndBodyAndUserid(newsid, body, userid);
    }
    public List<News> getNewssOfNewsidAndBodyAndStatus(String newsid, String body, String status) {
        return dao.getNewssOfNewsidAndBodyAndStatus(newsid, body, status);
    }
    public List<News> getNewssOfNewsidAndTypeidAndNewsdate(String newsid, String typeid, String newsdate) {
        return dao.getNewssOfNewsidAndTypeidAndNewsdate(newsid, typeid, newsdate);
    }
    public List<News> getNewssOfNewsidAndTypeidAndUserid(String newsid, String typeid, String userid) {
        return dao.getNewssOfNewsidAndTypeidAndUserid(newsid, typeid, userid);
    }
    public List<News> getNewssOfNewsidAndTypeidAndStatus(String newsid, String typeid, String status) {
        return dao.getNewssOfNewsidAndTypeidAndStatus(newsid, typeid, status);
    }
    public List<News> getNewssOfNewsidAndNewsdateAndUserid(String newsid, String newsdate, String userid) {
        return dao.getNewssOfNewsidAndNewsdateAndUserid(newsid, newsdate, userid);
    }
    public List<News> getNewssOfNewsidAndNewsdateAndStatus(String newsid, String newsdate, String status) {
        return dao.getNewssOfNewsidAndNewsdateAndStatus(newsid, newsdate, status);
    }
    public List<News> getNewssOfNewsidAndUseridAndStatus(String newsid, String userid, String status) {
        return dao.getNewssOfNewsidAndUseridAndStatus(newsid, userid, status);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeid(String title, String body, String typeid) {
        return dao.getNewssOfTitleAndBodyAndTypeid(title, body, typeid);
    }
    public List<News> getNewssOfTitleAndBodyAndNewsdate(String title, String body, String newsdate) {
        return dao.getNewssOfTitleAndBodyAndNewsdate(title, body, newsdate);
    }
    public List<News> getNewssOfTitleAndBodyAndUserid(String title, String body, String userid) {
        return dao.getNewssOfTitleAndBodyAndUserid(title, body, userid);
    }
    public List<News> getNewssOfTitleAndBodyAndStatus(String title, String body, String status) {
        return dao.getNewssOfTitleAndBodyAndStatus(title, body, status);
    }
    public List<News> getNewssOfTitleAndTypeidAndNewsdate(String title, String typeid, String newsdate) {
        return dao.getNewssOfTitleAndTypeidAndNewsdate(title, typeid, newsdate);
    }
    public List<News> getNewssOfTitleAndTypeidAndUserid(String title, String typeid, String userid) {
        return dao.getNewssOfTitleAndTypeidAndUserid(title, typeid, userid);
    }
    public List<News> getNewssOfTitleAndTypeidAndStatus(String title, String typeid, String status) {
        return dao.getNewssOfTitleAndTypeidAndStatus(title, typeid, status);
    }
    public List<News> getNewssOfTitleAndNewsdateAndUserid(String title, String newsdate, String userid) {
        return dao.getNewssOfTitleAndNewsdateAndUserid(title, newsdate, userid);
    }
    public List<News> getNewssOfTitleAndNewsdateAndStatus(String title, String newsdate, String status) {
        return dao.getNewssOfTitleAndNewsdateAndStatus(title, newsdate, status);
    }
    public List<News> getNewssOfTitleAndUseridAndStatus(String title, String userid, String status) {
        return dao.getNewssOfTitleAndUseridAndStatus(title, userid, status);
    }
    public List<News> getNewssOfBodyAndTypeidAndNewsdate(String body, String typeid, String newsdate) {
        return dao.getNewssOfBodyAndTypeidAndNewsdate(body, typeid, newsdate);
    }
    public List<News> getNewssOfBodyAndTypeidAndUserid(String body, String typeid, String userid) {
        return dao.getNewssOfBodyAndTypeidAndUserid(body, typeid, userid);
    }
    public List<News> getNewssOfBodyAndTypeidAndStatus(String body, String typeid, String status) {
        return dao.getNewssOfBodyAndTypeidAndStatus(body, typeid, status);
    }
    public List<News> getNewssOfBodyAndNewsdateAndUserid(String body, String newsdate, String userid) {
        return dao.getNewssOfBodyAndNewsdateAndUserid(body, newsdate, userid);
    }
    public List<News> getNewssOfBodyAndNewsdateAndStatus(String body, String newsdate, String status) {
        return dao.getNewssOfBodyAndNewsdateAndStatus(body, newsdate, status);
    }
    public List<News> getNewssOfBodyAndUseridAndStatus(String body, String userid, String status) {
        return dao.getNewssOfBodyAndUseridAndStatus(body, userid, status);
    }
    public List<News> getNewssOfTypeidAndNewsdateAndUserid(String typeid, String newsdate, String userid) {
        return dao.getNewssOfTypeidAndNewsdateAndUserid(typeid, newsdate, userid);
    }
    public List<News> getNewssOfTypeidAndNewsdateAndStatus(String typeid, String newsdate, String status) {
        return dao.getNewssOfTypeidAndNewsdateAndStatus(typeid, newsdate, status);
    }
    public List<News> getNewssOfTypeidAndUseridAndStatus(String typeid, String userid, String status) {
        return dao.getNewssOfTypeidAndUseridAndStatus(typeid, userid, status);
    }
    public List<News> getNewssOfNewsdateAndUseridAndStatus(String newsdate, String userid, String status) {
        return dao.getNewssOfNewsdateAndUseridAndStatus(newsdate, userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeid(String newsid, String title, String body, String typeid) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndTypeid(newsid, title, body, typeid);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndNewsdate(String newsid, String title, String body, String newsdate) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndNewsdate(newsid, title, body, newsdate);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndUserid(String newsid, String title, String body, String userid) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndUserid(newsid, title, body, userid);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndStatus(String newsid, String title, String body, String status) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndStatus(newsid, title, body, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndNewsdate(String newsid, String title, String typeid, String newsdate) {
        return dao.getNewssOfNewsidAndTitleAndTypeidAndNewsdate(newsid, title, typeid, newsdate);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndUserid(String newsid, String title, String typeid, String userid) {
        return dao.getNewssOfNewsidAndTitleAndTypeidAndUserid(newsid, title, typeid, userid);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndStatus(String newsid, String title, String typeid, String status) {
        return dao.getNewssOfNewsidAndTitleAndTypeidAndStatus(newsid, title, typeid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndNewsdateAndUserid(String newsid, String title, String newsdate, String userid) {
        return dao.getNewssOfNewsidAndTitleAndNewsdateAndUserid(newsid, title, newsdate, userid);
    }
    public List<News> getNewssOfNewsidAndTitleAndNewsdateAndStatus(String newsid, String title, String newsdate, String status) {
        return dao.getNewssOfNewsidAndTitleAndNewsdateAndStatus(newsid, title, newsdate, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndUseridAndStatus(String newsid, String title, String userid, String status) {
        return dao.getNewssOfNewsidAndTitleAndUseridAndStatus(newsid, title, userid, status);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndNewsdate(String newsid, String body, String typeid, String newsdate) {
        return dao.getNewssOfNewsidAndBodyAndTypeidAndNewsdate(newsid, body, typeid, newsdate);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndUserid(String newsid, String body, String typeid, String userid) {
        return dao.getNewssOfNewsidAndBodyAndTypeidAndUserid(newsid, body, typeid, userid);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndStatus(String newsid, String body, String typeid, String status) {
        return dao.getNewssOfNewsidAndBodyAndTypeidAndStatus(newsid, body, typeid, status);
    }
    public List<News> getNewssOfNewsidAndBodyAndNewsdateAndUserid(String newsid, String body, String newsdate, String userid) {
        return dao.getNewssOfNewsidAndBodyAndNewsdateAndUserid(newsid, body, newsdate, userid);
    }
    public List<News> getNewssOfNewsidAndBodyAndNewsdateAndStatus(String newsid, String body, String newsdate, String status) {
        return dao.getNewssOfNewsidAndBodyAndNewsdateAndStatus(newsid, body, newsdate, status);
    }
    public List<News> getNewssOfNewsidAndBodyAndUseridAndStatus(String newsid, String body, String userid, String status) {
        return dao.getNewssOfNewsidAndBodyAndUseridAndStatus(newsid, body, userid, status);
    }
    public List<News> getNewssOfNewsidAndTypeidAndNewsdateAndUserid(String newsid, String typeid, String newsdate, String userid) {
        return dao.getNewssOfNewsidAndTypeidAndNewsdateAndUserid(newsid, typeid, newsdate, userid);
    }
    public List<News> getNewssOfNewsidAndTypeidAndNewsdateAndStatus(String newsid, String typeid, String newsdate, String status) {
        return dao.getNewssOfNewsidAndTypeidAndNewsdateAndStatus(newsid, typeid, newsdate, status);
    }
    public List<News> getNewssOfNewsidAndTypeidAndUseridAndStatus(String newsid, String typeid, String userid, String status) {
        return dao.getNewssOfNewsidAndTypeidAndUseridAndStatus(newsid, typeid, userid, status);
    }
    public List<News> getNewssOfNewsidAndNewsdateAndUseridAndStatus(String newsid, String newsdate, String userid, String status) {
        return dao.getNewssOfNewsidAndNewsdateAndUseridAndStatus(newsid, newsdate, userid, status);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndNewsdate(String title, String body, String typeid, String newsdate) {
        return dao.getNewssOfTitleAndBodyAndTypeidAndNewsdate(title, body, typeid, newsdate);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndUserid(String title, String body, String typeid, String userid) {
        return dao.getNewssOfTitleAndBodyAndTypeidAndUserid(title, body, typeid, userid);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndStatus(String title, String body, String typeid, String status) {
        return dao.getNewssOfTitleAndBodyAndTypeidAndStatus(title, body, typeid, status);
    }
    public List<News> getNewssOfTitleAndBodyAndNewsdateAndUserid(String title, String body, String newsdate, String userid) {
        return dao.getNewssOfTitleAndBodyAndNewsdateAndUserid(title, body, newsdate, userid);
    }
    public List<News> getNewssOfTitleAndBodyAndNewsdateAndStatus(String title, String body, String newsdate, String status) {
        return dao.getNewssOfTitleAndBodyAndNewsdateAndStatus(title, body, newsdate, status);
    }
    public List<News> getNewssOfTitleAndBodyAndUseridAndStatus(String title, String body, String userid, String status) {
        return dao.getNewssOfTitleAndBodyAndUseridAndStatus(title, body, userid, status);
    }
    public List<News> getNewssOfTitleAndTypeidAndNewsdateAndUserid(String title, String typeid, String newsdate, String userid) {
        return dao.getNewssOfTitleAndTypeidAndNewsdateAndUserid(title, typeid, newsdate, userid);
    }
    public List<News> getNewssOfTitleAndTypeidAndNewsdateAndStatus(String title, String typeid, String newsdate, String status) {
        return dao.getNewssOfTitleAndTypeidAndNewsdateAndStatus(title, typeid, newsdate, status);
    }
    public List<News> getNewssOfTitleAndTypeidAndUseridAndStatus(String title, String typeid, String userid, String status) {
        return dao.getNewssOfTitleAndTypeidAndUseridAndStatus(title, typeid, userid, status);
    }
    public List<News> getNewssOfTitleAndNewsdateAndUseridAndStatus(String title, String newsdate, String userid, String status) {
        return dao.getNewssOfTitleAndNewsdateAndUseridAndStatus(title, newsdate, userid, status);
    }
    public List<News> getNewssOfBodyAndTypeidAndNewsdateAndUserid(String body, String typeid, String newsdate, String userid) {
        return dao.getNewssOfBodyAndTypeidAndNewsdateAndUserid(body, typeid, newsdate, userid);
    }
    public List<News> getNewssOfBodyAndTypeidAndNewsdateAndStatus(String body, String typeid, String newsdate, String status) {
        return dao.getNewssOfBodyAndTypeidAndNewsdateAndStatus(body, typeid, newsdate, status);
    }
    public List<News> getNewssOfBodyAndTypeidAndUseridAndStatus(String body, String typeid, String userid, String status) {
        return dao.getNewssOfBodyAndTypeidAndUseridAndStatus(body, typeid, userid, status);
    }
    public List<News> getNewssOfBodyAndNewsdateAndUseridAndStatus(String body, String newsdate, String userid, String status) {
        return dao.getNewssOfBodyAndNewsdateAndUseridAndStatus(body, newsdate, userid, status);
    }
    public List<News> getNewssOfTypeidAndNewsdateAndUseridAndStatus(String typeid, String newsdate, String userid, String status) {
        return dao.getNewssOfTypeidAndNewsdateAndUseridAndStatus(typeid, newsdate, userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(String newsid, String title, String body, String typeid, String newsdate) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(newsid, title, body, typeid, newsdate);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndUserid(String newsid, String title, String body, String typeid, String userid) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndTypeidAndUserid(newsid, title, body, typeid, userid);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndStatus(String newsid, String title, String body, String typeid, String status) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndTypeidAndStatus(newsid, title, body, typeid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndNewsdateAndUserid(String newsid, String title, String body, String newsdate, String userid) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndNewsdateAndUserid(newsid, title, body, newsdate, userid);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndNewsdateAndStatus(String newsid, String title, String body, String newsdate, String status) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndNewsdateAndStatus(newsid, title, body, newsdate, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndUseridAndStatus(String newsid, String title, String body, String userid, String status) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndUseridAndStatus(newsid, title, body, userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(String newsid, String title, String typeid, String newsdate, String userid) {
        return dao.getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(newsid, title, typeid, newsdate, userid);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(String newsid, String title, String typeid, String newsdate, String status) {
        return dao.getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(newsid, title, typeid, newsdate, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndUseridAndStatus(String newsid, String title, String typeid, String userid, String status) {
        return dao.getNewssOfNewsidAndTitleAndTypeidAndUseridAndStatus(newsid, title, typeid, userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndNewsdateAndUseridAndStatus(String newsid, String title, String newsdate, String userid, String status) {
        return dao.getNewssOfNewsidAndTitleAndNewsdateAndUseridAndStatus(newsid, title, newsdate, userid, status);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String body, String typeid, String newsdate, String userid) {
        return dao.getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(newsid, body, typeid, newsdate, userid);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String body, String typeid, String newsdate, String status) {
        return dao.getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(newsid, body, typeid, newsdate, status);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndUseridAndStatus(String newsid, String body, String typeid, String userid, String status) {
        return dao.getNewssOfNewsidAndBodyAndTypeidAndUseridAndStatus(newsid, body, typeid, userid, status);
    }
    public List<News> getNewssOfNewsidAndBodyAndNewsdateAndUseridAndStatus(String newsid, String body, String newsdate, String userid, String status) {
        return dao.getNewssOfNewsidAndBodyAndNewsdateAndUseridAndStatus(newsid, body, newsdate, userid, status);
    }
    public List<News> getNewssOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String typeid, String newsdate, String userid, String status) {
        return dao.getNewssOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(newsid, typeid, newsdate, userid, status);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndNewsdateAndUserid(String title, String body, String typeid, String newsdate, String userid) {
        return dao.getNewssOfTitleAndBodyAndTypeidAndNewsdateAndUserid(title, body, typeid, newsdate, userid);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndNewsdateAndStatus(String title, String body, String typeid, String newsdate, String status) {
        return dao.getNewssOfTitleAndBodyAndTypeidAndNewsdateAndStatus(title, body, typeid, newsdate, status);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndUseridAndStatus(String title, String body, String typeid, String userid, String status) {
        return dao.getNewssOfTitleAndBodyAndTypeidAndUseridAndStatus(title, body, typeid, userid, status);
    }
    public List<News> getNewssOfTitleAndBodyAndNewsdateAndUseridAndStatus(String title, String body, String newsdate, String userid, String status) {
        return dao.getNewssOfTitleAndBodyAndNewsdateAndUseridAndStatus(title, body, newsdate, userid, status);
    }
    public List<News> getNewssOfTitleAndTypeidAndNewsdateAndUseridAndStatus(String title, String typeid, String newsdate, String userid, String status) {
        return dao.getNewssOfTitleAndTypeidAndNewsdateAndUseridAndStatus(title, typeid, newsdate, userid, status);
    }
    public List<News> getNewssOfBodyAndTypeidAndNewsdateAndUseridAndStatus(String body, String typeid, String newsdate, String userid, String status) {
        return dao.getNewssOfBodyAndTypeidAndNewsdateAndUseridAndStatus(body, typeid, newsdate, userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String title, String body, String typeid, String newsdate, String userid) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(newsid, title, body, typeid, newsdate, userid);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String title, String body, String typeid, String newsdate, String status) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(newsid, title, body, typeid, newsdate, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(String newsid, String title, String body, String typeid, String userid, String status) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(newsid, title, body, typeid, userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String newsdate, String userid, String status) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(newsid, title, body, newsdate, userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String typeid, String newsdate, String userid, String status) {
        return dao.getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(newsid, title, typeid, newsdate, userid, status);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String body, String typeid, String newsdate, String userid, String status) {
        return dao.getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(newsid, body, typeid, newsdate, userid, status);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.getNewssOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(title, body, typeid, newsdate, userid, status);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        return dao.getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(newsid, title, body, typeid, newsdate, userid, status);
    }
}
