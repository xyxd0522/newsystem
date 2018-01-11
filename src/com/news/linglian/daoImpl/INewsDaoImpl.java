package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.News;

import com.news.linglian.dao.INewsDao;
import db.DBMan;

public class INewsDaoImpl implements INewsDao {
    public int update(News news, News keyNews) {
        return DBMan.getInstance().updateWithoutThrow(news, keyNews, "news");
    }
    public int updateOfNewsid(News news, String newsid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        return update(news, kNews);
    }
    public int updateOfTitle(News news, String title) {
        News kNews = new News();
        kNews.setTitle(title);
        return update(news, kNews);
    }
    public int updateOfBody(News news, String body) {
        News kNews = new News();
        kNews.setBody(body);
        return update(news, kNews);
    }
    public int updateOfTypeid(News news, String typeid) {
        News kNews = new News();
        kNews.setTypeid(typeid);
        return update(news, kNews);
    }
    public int updateOfNewsdate(News news, String newsdate) {
        News kNews = new News();
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfUserid(News news, String userid) {
        News kNews = new News();
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfStatus(News news, String status) {
        News kNews = new News();
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitle(News news, String newsid, String title) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBody(News news, String newsid, String body) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTypeid(News news, String newsid, String typeid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTypeid(typeid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndNewsdate(News news, String newsid, String newsdate) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfNewsidAndUserid(News news, String newsid, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndStatus(News news, String newsid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBody(News news, String title, String body) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        return update(news, kNews);
    }
    public int updateOfTitleAndTypeid(News news, String title, String typeid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        return update(news, kNews);
    }
    public int updateOfTitleAndNewsdate(News news, String title, String newsdate) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfTitleAndUserid(News news, String title, String userid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTitleAndStatus(News news, String title, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndTypeid(News news, String body, String typeid) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        return update(news, kNews);
    }
    public int updateOfBodyAndNewsdate(News news, String body, String newsdate) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfBodyAndUserid(News news, String body, String userid) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfBodyAndStatus(News news, String body, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTypeidAndNewsdate(News news, String typeid, String newsdate) {
        News kNews = new News();
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfTypeidAndUserid(News news, String typeid, String userid) {
        News kNews = new News();
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTypeidAndStatus(News news, String typeid, String status) {
        News kNews = new News();
        kNews.setTypeid(typeid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsdateAndUserid(News news, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsdateAndStatus(News news, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfUseridAndStatus(News news, String userid, String status) {
        News kNews = new News();
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBody(News news, String newsid, String title, String body) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndTypeid(News news, String newsid, String title, String typeid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndNewsdate(News news, String newsid, String title, String newsdate) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndUserid(News news, String newsid, String title, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndStatus(News news, String newsid, String title, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndTypeid(News news, String newsid, String body, String typeid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndNewsdate(News news, String newsid, String body, String newsdate) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndUserid(News news, String newsid, String body, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndStatus(News news, String newsid, String body, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTypeidAndNewsdate(News news, String newsid, String typeid, String newsdate) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTypeidAndUserid(News news, String newsid, String typeid, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTypeidAndStatus(News news, String newsid, String typeid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTypeid(typeid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndNewsdateAndUserid(News news, String newsid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndNewsdateAndStatus(News news, String newsid, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndUseridAndStatus(News news, String newsid, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndTypeid(News news, String title, String body, String typeid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndNewsdate(News news, String title, String body, String newsdate) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndUserid(News news, String title, String body, String userid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndStatus(News news, String title, String body, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndTypeidAndNewsdate(News news, String title, String typeid, String newsdate) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfTitleAndTypeidAndUserid(News news, String title, String typeid, String userid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTitleAndTypeidAndStatus(News news, String title, String typeid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndNewsdateAndUserid(News news, String title, String newsdate, String userid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTitleAndNewsdateAndStatus(News news, String title, String newsdate, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndUseridAndStatus(News news, String title, String userid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndTypeidAndNewsdate(News news, String body, String typeid, String newsdate) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfBodyAndTypeidAndUserid(News news, String body, String typeid, String userid) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfBodyAndTypeidAndStatus(News news, String body, String typeid, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndNewsdateAndUserid(News news, String body, String newsdate, String userid) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfBodyAndNewsdateAndStatus(News news, String body, String newsdate, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndUseridAndStatus(News news, String body, String userid, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTypeidAndNewsdateAndUserid(News news, String typeid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTypeidAndNewsdateAndStatus(News news, String typeid, String newsdate, String status) {
        News kNews = new News();
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTypeidAndUseridAndStatus(News news, String typeid, String userid, String status) {
        News kNews = new News();
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsdateAndUseridAndStatus(News news, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeid(News news, String newsid, String title, String body, String typeid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndNewsdate(News news, String newsid, String title, String body, String newsdate) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndUserid(News news, String newsid, String title, String body, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndStatus(News news, String newsid, String title, String body, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndTypeidAndNewsdate(News news, String newsid, String title, String typeid, String newsdate) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndTypeidAndUserid(News news, String newsid, String title, String typeid, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndTypeidAndStatus(News news, String newsid, String title, String typeid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndNewsdateAndUserid(News news, String newsid, String title, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndNewsdateAndStatus(News news, String newsid, String title, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndUseridAndStatus(News news, String newsid, String title, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndTypeidAndNewsdate(News news, String newsid, String body, String typeid, String newsdate) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndTypeidAndUserid(News news, String newsid, String body, String typeid, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndTypeidAndStatus(News news, String newsid, String body, String typeid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndNewsdateAndUserid(News news, String newsid, String body, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndNewsdateAndStatus(News news, String newsid, String body, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndUseridAndStatus(News news, String newsid, String body, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTypeidAndNewsdateAndUserid(News news, String newsid, String typeid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTypeidAndNewsdateAndStatus(News news, String newsid, String typeid, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTypeidAndUseridAndStatus(News news, String newsid, String typeid, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndNewsdateAndUseridAndStatus(News news, String newsid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndTypeidAndNewsdate(News news, String title, String body, String typeid, String newsdate) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndTypeidAndUserid(News news, String title, String body, String typeid, String userid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndTypeidAndStatus(News news, String title, String body, String typeid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndNewsdateAndUserid(News news, String title, String body, String newsdate, String userid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndNewsdateAndStatus(News news, String title, String body, String newsdate, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndUseridAndStatus(News news, String title, String body, String userid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndTypeidAndNewsdateAndUserid(News news, String title, String typeid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTitleAndTypeidAndNewsdateAndStatus(News news, String title, String typeid, String newsdate, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndTypeidAndUseridAndStatus(News news, String title, String typeid, String userid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndNewsdateAndUseridAndStatus(News news, String title, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndTypeidAndNewsdateAndUserid(News news, String body, String typeid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfBodyAndTypeidAndNewsdateAndStatus(News news, String body, String typeid, String newsdate, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndTypeidAndUseridAndStatus(News news, String body, String typeid, String userid, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndNewsdateAndUseridAndStatus(News news, String body, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTypeidAndNewsdateAndUseridAndStatus(News news, String typeid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(News news, String newsid, String title, String body, String typeid, String newsdate) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndUserid(News news, String newsid, String title, String body, String typeid, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndStatus(News news, String newsid, String title, String body, String typeid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndNewsdateAndUserid(News news, String newsid, String title, String body, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndNewsdateAndStatus(News news, String newsid, String title, String body, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndUseridAndStatus(News news, String newsid, String title, String body, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(News news, String newsid, String title, String typeid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(News news, String newsid, String title, String typeid, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndTypeidAndUseridAndStatus(News news, String newsid, String title, String typeid, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndNewsdateAndUseridAndStatus(News news, String newsid, String title, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(News news, String newsid, String body, String typeid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(News news, String newsid, String body, String typeid, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndTypeidAndUseridAndStatus(News news, String newsid, String body, String typeid, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndNewsdateAndUseridAndStatus(News news, String newsid, String body, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(News news, String newsid, String typeid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndTypeidAndNewsdateAndUserid(News news, String title, String body, String typeid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndTypeidAndNewsdateAndStatus(News news, String title, String body, String typeid, String newsdate, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndTypeidAndUseridAndStatus(News news, String title, String body, String typeid, String userid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndNewsdateAndUseridAndStatus(News news, String title, String body, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndTypeidAndNewsdateAndUseridAndStatus(News news, String title, String typeid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfBodyAndTypeidAndNewsdateAndUseridAndStatus(News news, String body, String typeid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(News news, String newsid, String title, String body, String typeid, String newsdate, String userid) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(News news, String newsid, String title, String body, String typeid, String newsdate, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(News news, String newsid, String title, String body, String typeid, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(News news, String newsid, String title, String body, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(News news, String newsid, String title, String typeid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(News news, String newsid, String body, String typeid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(News news, String title, String body, String typeid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int updateOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(News news, String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        News kNews = new News();
        kNews.setNewsid(newsid);
        kNews.setTitle(title);
        kNews.setBody(body);
        kNews.setTypeid(typeid);
        kNews.setNewsdate(newsdate);
        kNews.setUserid(userid);
        kNews.setStatus(status);
        return update(news, kNews);
    }
    public int remove(News news) {
        return DBMan.getInstance().deleteWithoutThrow(news, "news");
    }
    public int removeOfNewsid(String newsid) {
        News news = new News();
        news.setNewsid(newsid);
        return remove(news);
    }
    public int removeOfTitle(String title) {
        News news = new News();
        news.setTitle(title);
        return remove(news);
    }
    public int removeOfBody(String body) {
        News news = new News();
        news.setBody(body);
        return remove(news);
    }
    public int removeOfTypeid(String typeid) {
        News news = new News();
        news.setTypeid(typeid);
        return remove(news);
    }
    public int removeOfNewsdate(String newsdate) {
        News news = new News();
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfUserid(String userid) {
        News news = new News();
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfStatus(String status) {
        News news = new News();
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitle(String newsid, String title) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        return remove(news);
    }
    public int removeOfNewsidAndBody(String newsid, String body) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        return remove(news);
    }
    public int removeOfNewsidAndTypeid(String newsid, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        return remove(news);
    }
    public int removeOfNewsidAndNewsdate(String newsid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfNewsidAndUserid(String newsid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndStatus(String newsid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBody(String title, String body) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        return remove(news);
    }
    public int removeOfTitleAndTypeid(String title, String typeid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        return remove(news);
    }
    public int removeOfTitleAndNewsdate(String title, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfTitleAndUserid(String title, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTitleAndStatus(String title, String status) {
        News news = new News();
        news.setTitle(title);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndTypeid(String body, String typeid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        return remove(news);
    }
    public int removeOfBodyAndNewsdate(String body, String newsdate) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfBodyAndUserid(String body, String userid) {
        News news = new News();
        news.setBody(body);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfBodyAndStatus(String body, String status) {
        News news = new News();
        news.setBody(body);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTypeidAndNewsdate(String typeid, String newsdate) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfTypeidAndUserid(String typeid, String userid) {
        News news = new News();
        news.setTypeid(typeid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTypeidAndStatus(String typeid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsdateAndUserid(String newsdate, String userid) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsdateAndStatus(String newsdate, String status) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfUseridAndStatus(String userid, String status) {
        News news = new News();
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBody(String newsid, String title, String body) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndTypeid(String newsid, String title, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndNewsdate(String newsid, String title, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndUserid(String newsid, String title, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndStatus(String newsid, String title, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndTypeid(String newsid, String body, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndNewsdate(String newsid, String body, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndUserid(String newsid, String body, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndStatus(String newsid, String body, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTypeidAndNewsdate(String newsid, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfNewsidAndTypeidAndUserid(String newsid, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTypeidAndStatus(String newsid, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndNewsdateAndUserid(String newsid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndNewsdateAndStatus(String newsid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndUseridAndStatus(String newsid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndTypeid(String title, String body, String typeid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndNewsdate(String title, String body, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndUserid(String title, String body, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndStatus(String title, String body, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndTypeidAndNewsdate(String title, String typeid, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfTitleAndTypeidAndUserid(String title, String typeid, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTitleAndTypeidAndStatus(String title, String typeid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndNewsdateAndUserid(String title, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTitleAndNewsdateAndStatus(String title, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndUseridAndStatus(String title, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndTypeidAndNewsdate(String body, String typeid, String newsdate) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfBodyAndTypeidAndUserid(String body, String typeid, String userid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfBodyAndTypeidAndStatus(String body, String typeid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndNewsdateAndUserid(String body, String newsdate, String userid) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfBodyAndNewsdateAndStatus(String body, String newsdate, String status) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndUseridAndStatus(String body, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTypeidAndNewsdateAndUserid(String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTypeidAndNewsdateAndStatus(String typeid, String newsdate, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTypeidAndUseridAndStatus(String typeid, String userid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsdateAndUseridAndStatus(String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeid(String newsid, String title, String body, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndNewsdate(String newsid, String title, String body, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndUserid(String newsid, String title, String body, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndStatus(String newsid, String title, String body, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndTypeidAndNewsdate(String newsid, String title, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndTypeidAndUserid(String newsid, String title, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndTypeidAndStatus(String newsid, String title, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndNewsdateAndUserid(String newsid, String title, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndNewsdateAndStatus(String newsid, String title, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndUseridAndStatus(String newsid, String title, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndTypeidAndNewsdate(String newsid, String body, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndTypeidAndUserid(String newsid, String body, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndTypeidAndStatus(String newsid, String body, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndNewsdateAndUserid(String newsid, String body, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndNewsdateAndStatus(String newsid, String body, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndUseridAndStatus(String newsid, String body, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTypeidAndNewsdateAndUserid(String newsid, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTypeidAndNewsdateAndStatus(String newsid, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTypeidAndUseridAndStatus(String newsid, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndNewsdateAndUseridAndStatus(String newsid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndTypeidAndNewsdate(String title, String body, String typeid, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndTypeidAndUserid(String title, String body, String typeid, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndTypeidAndStatus(String title, String body, String typeid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndNewsdateAndUserid(String title, String body, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndNewsdateAndStatus(String title, String body, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndUseridAndStatus(String title, String body, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndTypeidAndNewsdateAndUserid(String title, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTitleAndTypeidAndNewsdateAndStatus(String title, String typeid, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndTypeidAndUseridAndStatus(String title, String typeid, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndNewsdateAndUseridAndStatus(String title, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndTypeidAndNewsdateAndUserid(String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfBodyAndTypeidAndNewsdateAndStatus(String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndTypeidAndUseridAndStatus(String body, String typeid, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndNewsdateAndUseridAndStatus(String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTypeidAndNewsdateAndUseridAndStatus(String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(String newsid, String title, String body, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndUserid(String newsid, String title, String body, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndStatus(String newsid, String title, String body, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndNewsdateAndUserid(String newsid, String title, String body, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndNewsdateAndStatus(String newsid, String title, String body, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndUseridAndStatus(String newsid, String title, String body, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(String newsid, String title, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(String newsid, String title, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndTypeidAndUseridAndStatus(String newsid, String title, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndNewsdateAndUseridAndStatus(String newsid, String title, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndTypeidAndUseridAndStatus(String newsid, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndNewsdateAndUseridAndStatus(String newsid, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndTypeidAndNewsdateAndUserid(String title, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndTypeidAndNewsdateAndStatus(String title, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndTypeidAndUseridAndStatus(String title, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndNewsdateAndUseridAndStatus(String title, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndTypeidAndNewsdateAndUseridAndStatus(String title, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfBodyAndTypeidAndNewsdateAndUseridAndStatus(String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String title, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String title, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(String newsid, String title, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String title, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int removeOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return remove(news);
    }
    public int insert(News news) {
        return DBMan.getInstance().insertWithoutThrow(news, "news");
    }
    public int insertOfNewsid(String newsid) {
        News news = new News();
        news.setNewsid(newsid);
        return insert(news);
    }
    public int insertOfTitle(String title) {
        News news = new News();
        news.setTitle(title);
        return insert(news);
    }
    public int insertOfBody(String body) {
        News news = new News();
        news.setBody(body);
        return insert(news);
    }
    public int insertOfTypeid(String typeid) {
        News news = new News();
        news.setTypeid(typeid);
        return insert(news);
    }
    public int insertOfNewsdate(String newsdate) {
        News news = new News();
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfUserid(String userid) {
        News news = new News();
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfStatus(String status) {
        News news = new News();
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitle(String newsid, String title) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        return insert(news);
    }
    public int insertOfNewsidAndBody(String newsid, String body) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        return insert(news);
    }
    public int insertOfNewsidAndTypeid(String newsid, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        return insert(news);
    }
    public int insertOfNewsidAndNewsdate(String newsid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfNewsidAndUserid(String newsid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndStatus(String newsid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBody(String title, String body) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        return insert(news);
    }
    public int insertOfTitleAndTypeid(String title, String typeid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        return insert(news);
    }
    public int insertOfTitleAndNewsdate(String title, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfTitleAndUserid(String title, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTitleAndStatus(String title, String status) {
        News news = new News();
        news.setTitle(title);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndTypeid(String body, String typeid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        return insert(news);
    }
    public int insertOfBodyAndNewsdate(String body, String newsdate) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfBodyAndUserid(String body, String userid) {
        News news = new News();
        news.setBody(body);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfBodyAndStatus(String body, String status) {
        News news = new News();
        news.setBody(body);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTypeidAndNewsdate(String typeid, String newsdate) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfTypeidAndUserid(String typeid, String userid) {
        News news = new News();
        news.setTypeid(typeid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTypeidAndStatus(String typeid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsdateAndUserid(String newsdate, String userid) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsdateAndStatus(String newsdate, String status) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfUseridAndStatus(String userid, String status) {
        News news = new News();
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBody(String newsid, String title, String body) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndTypeid(String newsid, String title, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndNewsdate(String newsid, String title, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndUserid(String newsid, String title, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndStatus(String newsid, String title, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndTypeid(String newsid, String body, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndNewsdate(String newsid, String body, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndUserid(String newsid, String body, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndStatus(String newsid, String body, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTypeidAndNewsdate(String newsid, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfNewsidAndTypeidAndUserid(String newsid, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTypeidAndStatus(String newsid, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndNewsdateAndUserid(String newsid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndNewsdateAndStatus(String newsid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndUseridAndStatus(String newsid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndTypeid(String title, String body, String typeid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndNewsdate(String title, String body, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndUserid(String title, String body, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndStatus(String title, String body, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndTypeidAndNewsdate(String title, String typeid, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfTitleAndTypeidAndUserid(String title, String typeid, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTitleAndTypeidAndStatus(String title, String typeid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndNewsdateAndUserid(String title, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTitleAndNewsdateAndStatus(String title, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndUseridAndStatus(String title, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndTypeidAndNewsdate(String body, String typeid, String newsdate) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfBodyAndTypeidAndUserid(String body, String typeid, String userid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfBodyAndTypeidAndStatus(String body, String typeid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndNewsdateAndUserid(String body, String newsdate, String userid) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfBodyAndNewsdateAndStatus(String body, String newsdate, String status) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndUseridAndStatus(String body, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTypeidAndNewsdateAndUserid(String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTypeidAndNewsdateAndStatus(String typeid, String newsdate, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTypeidAndUseridAndStatus(String typeid, String userid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsdateAndUseridAndStatus(String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeid(String newsid, String title, String body, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndNewsdate(String newsid, String title, String body, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndUserid(String newsid, String title, String body, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndStatus(String newsid, String title, String body, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndTypeidAndNewsdate(String newsid, String title, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndTypeidAndUserid(String newsid, String title, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndTypeidAndStatus(String newsid, String title, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndNewsdateAndUserid(String newsid, String title, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndNewsdateAndStatus(String newsid, String title, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndUseridAndStatus(String newsid, String title, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndTypeidAndNewsdate(String newsid, String body, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndTypeidAndUserid(String newsid, String body, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndTypeidAndStatus(String newsid, String body, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndNewsdateAndUserid(String newsid, String body, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndNewsdateAndStatus(String newsid, String body, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndUseridAndStatus(String newsid, String body, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTypeidAndNewsdateAndUserid(String newsid, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTypeidAndNewsdateAndStatus(String newsid, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTypeidAndUseridAndStatus(String newsid, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndNewsdateAndUseridAndStatus(String newsid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndTypeidAndNewsdate(String title, String body, String typeid, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndTypeidAndUserid(String title, String body, String typeid, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndTypeidAndStatus(String title, String body, String typeid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndNewsdateAndUserid(String title, String body, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndNewsdateAndStatus(String title, String body, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndUseridAndStatus(String title, String body, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndTypeidAndNewsdateAndUserid(String title, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTitleAndTypeidAndNewsdateAndStatus(String title, String typeid, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndTypeidAndUseridAndStatus(String title, String typeid, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndNewsdateAndUseridAndStatus(String title, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndTypeidAndNewsdateAndUserid(String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfBodyAndTypeidAndNewsdateAndStatus(String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndTypeidAndUseridAndStatus(String body, String typeid, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndNewsdateAndUseridAndStatus(String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTypeidAndNewsdateAndUseridAndStatus(String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(String newsid, String title, String body, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndUserid(String newsid, String title, String body, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndStatus(String newsid, String title, String body, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndNewsdateAndUserid(String newsid, String title, String body, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndNewsdateAndStatus(String newsid, String title, String body, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndUseridAndStatus(String newsid, String title, String body, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(String newsid, String title, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(String newsid, String title, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndTypeidAndUseridAndStatus(String newsid, String title, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndNewsdateAndUseridAndStatus(String newsid, String title, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndTypeidAndUseridAndStatus(String newsid, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndNewsdateAndUseridAndStatus(String newsid, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndTypeidAndNewsdateAndUserid(String title, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndTypeidAndNewsdateAndStatus(String title, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndTypeidAndUseridAndStatus(String title, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndNewsdateAndUseridAndStatus(String title, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndTypeidAndNewsdateAndUseridAndStatus(String title, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfBodyAndTypeidAndNewsdateAndUseridAndStatus(String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String title, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String title, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(String newsid, String title, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String title, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public int insertOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return insert(news);
    }
    public News getNews(News news) {
        return DBMan.getInstance().queryByIdWithoutThrow(news, "news");
    }
    public News getNewsOfNewsid(String newsid) {
        News news = new News();
        news.setNewsid(newsid);
        return getNews(news);
    }
    public News getNewsOfTitle(String title) {
        News news = new News();
        news.setTitle(title);
        return getNews(news);
    }
    public News getNewsOfBody(String body) {
        News news = new News();
        news.setBody(body);
        return getNews(news);
    }
    public News getNewsOfTypeid(String typeid) {
        News news = new News();
        news.setTypeid(typeid);
        return getNews(news);
    }
    public News getNewsOfNewsdate(String newsdate) {
        News news = new News();
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfUserid(String userid) {
        News news = new News();
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfStatus(String status) {
        News news = new News();
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitle(String newsid, String title) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBody(String newsid, String body) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTypeid(String newsid, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndNewsdate(String newsid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfNewsidAndUserid(String newsid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndStatus(String newsid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBody(String title, String body) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        return getNews(news);
    }
    public News getNewsOfTitleAndTypeid(String title, String typeid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        return getNews(news);
    }
    public News getNewsOfTitleAndNewsdate(String title, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfTitleAndUserid(String title, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTitleAndStatus(String title, String status) {
        News news = new News();
        news.setTitle(title);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndTypeid(String body, String typeid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        return getNews(news);
    }
    public News getNewsOfBodyAndNewsdate(String body, String newsdate) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfBodyAndUserid(String body, String userid) {
        News news = new News();
        news.setBody(body);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfBodyAndStatus(String body, String status) {
        News news = new News();
        news.setBody(body);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTypeidAndNewsdate(String typeid, String newsdate) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfTypeidAndUserid(String typeid, String userid) {
        News news = new News();
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTypeidAndStatus(String typeid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsdateAndUserid(String newsdate, String userid) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsdateAndStatus(String newsdate, String status) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfUseridAndStatus(String userid, String status) {
        News news = new News();
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBody(String newsid, String title, String body) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndTypeid(String newsid, String title, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndNewsdate(String newsid, String title, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndUserid(String newsid, String title, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndStatus(String newsid, String title, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndTypeid(String newsid, String body, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndNewsdate(String newsid, String body, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndUserid(String newsid, String body, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndStatus(String newsid, String body, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTypeidAndNewsdate(String newsid, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTypeidAndUserid(String newsid, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTypeidAndStatus(String newsid, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndNewsdateAndUserid(String newsid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndNewsdateAndStatus(String newsid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndUseridAndStatus(String newsid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndTypeid(String title, String body, String typeid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndNewsdate(String title, String body, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndUserid(String title, String body, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndStatus(String title, String body, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndTypeidAndNewsdate(String title, String typeid, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfTitleAndTypeidAndUserid(String title, String typeid, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTitleAndTypeidAndStatus(String title, String typeid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndNewsdateAndUserid(String title, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTitleAndNewsdateAndStatus(String title, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndUseridAndStatus(String title, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndTypeidAndNewsdate(String body, String typeid, String newsdate) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfBodyAndTypeidAndUserid(String body, String typeid, String userid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfBodyAndTypeidAndStatus(String body, String typeid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndNewsdateAndUserid(String body, String newsdate, String userid) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfBodyAndNewsdateAndStatus(String body, String newsdate, String status) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndUseridAndStatus(String body, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTypeidAndNewsdateAndUserid(String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTypeidAndNewsdateAndStatus(String typeid, String newsdate, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTypeidAndUseridAndStatus(String typeid, String userid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsdateAndUseridAndStatus(String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeid(String newsid, String title, String body, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndNewsdate(String newsid, String title, String body, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndUserid(String newsid, String title, String body, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndStatus(String newsid, String title, String body, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndNewsdate(String newsid, String title, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndUserid(String newsid, String title, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndStatus(String newsid, String title, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndNewsdateAndUserid(String newsid, String title, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndNewsdateAndStatus(String newsid, String title, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndUseridAndStatus(String newsid, String title, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndNewsdate(String newsid, String body, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndUserid(String newsid, String body, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndStatus(String newsid, String body, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndNewsdateAndUserid(String newsid, String body, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndNewsdateAndStatus(String newsid, String body, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndUseridAndStatus(String newsid, String body, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTypeidAndNewsdateAndUserid(String newsid, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTypeidAndNewsdateAndStatus(String newsid, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTypeidAndUseridAndStatus(String newsid, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndNewsdateAndUseridAndStatus(String newsid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndNewsdate(String title, String body, String typeid, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndUserid(String title, String body, String typeid, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndStatus(String title, String body, String typeid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndNewsdateAndUserid(String title, String body, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndNewsdateAndStatus(String title, String body, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndUseridAndStatus(String title, String body, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndTypeidAndNewsdateAndUserid(String title, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTitleAndTypeidAndNewsdateAndStatus(String title, String typeid, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndTypeidAndUseridAndStatus(String title, String typeid, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndNewsdateAndUseridAndStatus(String title, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndTypeidAndNewsdateAndUserid(String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfBodyAndTypeidAndNewsdateAndStatus(String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndTypeidAndUseridAndStatus(String body, String typeid, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndNewsdateAndUseridAndStatus(String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTypeidAndNewsdateAndUseridAndStatus(String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(String newsid, String title, String body, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndUserid(String newsid, String title, String body, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndStatus(String newsid, String title, String body, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndNewsdateAndUserid(String newsid, String title, String body, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndNewsdateAndStatus(String newsid, String title, String body, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndUseridAndStatus(String newsid, String title, String body, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(String newsid, String title, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(String newsid, String title, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndUseridAndStatus(String newsid, String title, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndNewsdateAndUseridAndStatus(String newsid, String title, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndUseridAndStatus(String newsid, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndNewsdateAndUseridAndStatus(String newsid, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndNewsdateAndUserid(String title, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndNewsdateAndStatus(String title, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndUseridAndStatus(String title, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndNewsdateAndUseridAndStatus(String title, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndTypeidAndNewsdateAndUseridAndStatus(String title, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfBodyAndTypeidAndNewsdateAndUseridAndStatus(String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String title, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String title, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(String newsid, String title, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String title, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public News getNewsOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNews(news);
    }
    public List<News> getNewss(News news) {
        return DBMan.getInstance().queryWithoutThrow(news, "news");
    }
    public List<News> getNewssOfNewsid(String newsid) {
        News news = new News();
        news.setNewsid(newsid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitle(String title) {
        News news = new News();
        news.setTitle(title);
        return getNewss(news);
    }
    public List<News> getNewssOfBody(String body) {
        News news = new News();
        news.setBody(body);
        return getNewss(news);
    }
    public List<News> getNewssOfTypeid(String typeid) {
        News news = new News();
        news.setTypeid(typeid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsdate(String newsdate) {
        News news = new News();
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfUserid(String userid) {
        News news = new News();
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfStatus(String status) {
        News news = new News();
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitle(String newsid, String title) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBody(String newsid, String body) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTypeid(String newsid, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndNewsdate(String newsid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndUserid(String newsid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndStatus(String newsid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBody(String title, String body) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTypeid(String title, String typeid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndNewsdate(String title, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndUserid(String title, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndStatus(String title, String status) {
        News news = new News();
        news.setTitle(title);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTypeid(String body, String typeid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndNewsdate(String body, String newsdate) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndUserid(String body, String userid) {
        News news = new News();
        news.setBody(body);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndStatus(String body, String status) {
        News news = new News();
        news.setBody(body);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTypeidAndNewsdate(String typeid, String newsdate) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfTypeidAndUserid(String typeid, String userid) {
        News news = new News();
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTypeidAndStatus(String typeid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsdateAndUserid(String newsdate, String userid) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsdateAndStatus(String newsdate, String status) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfUseridAndStatus(String userid, String status) {
        News news = new News();
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBody(String newsid, String title, String body) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeid(String newsid, String title, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndNewsdate(String newsid, String title, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndUserid(String newsid, String title, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndStatus(String newsid, String title, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeid(String newsid, String body, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndNewsdate(String newsid, String body, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndUserid(String newsid, String body, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndStatus(String newsid, String body, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTypeidAndNewsdate(String newsid, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTypeidAndUserid(String newsid, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTypeidAndStatus(String newsid, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndNewsdateAndUserid(String newsid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndNewsdateAndStatus(String newsid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndUseridAndStatus(String newsid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeid(String title, String body, String typeid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndNewsdate(String title, String body, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndUserid(String title, String body, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndStatus(String title, String body, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTypeidAndNewsdate(String title, String typeid, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTypeidAndUserid(String title, String typeid, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTypeidAndStatus(String title, String typeid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndNewsdateAndUserid(String title, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndNewsdateAndStatus(String title, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndUseridAndStatus(String title, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTypeidAndNewsdate(String body, String typeid, String newsdate) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTypeidAndUserid(String body, String typeid, String userid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTypeidAndStatus(String body, String typeid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndNewsdateAndUserid(String body, String newsdate, String userid) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndNewsdateAndStatus(String body, String newsdate, String status) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndUseridAndStatus(String body, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTypeidAndNewsdateAndUserid(String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTypeidAndNewsdateAndStatus(String typeid, String newsdate, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTypeidAndUseridAndStatus(String typeid, String userid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsdateAndUseridAndStatus(String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeid(String newsid, String title, String body, String typeid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndNewsdate(String newsid, String title, String body, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndUserid(String newsid, String title, String body, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndStatus(String newsid, String title, String body, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndNewsdate(String newsid, String title, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndUserid(String newsid, String title, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndStatus(String newsid, String title, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndNewsdateAndUserid(String newsid, String title, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndNewsdateAndStatus(String newsid, String title, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndUseridAndStatus(String newsid, String title, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndNewsdate(String newsid, String body, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndUserid(String newsid, String body, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndStatus(String newsid, String body, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndNewsdateAndUserid(String newsid, String body, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndNewsdateAndStatus(String newsid, String body, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndUseridAndStatus(String newsid, String body, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTypeidAndNewsdateAndUserid(String newsid, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTypeidAndNewsdateAndStatus(String newsid, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTypeidAndUseridAndStatus(String newsid, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndNewsdateAndUseridAndStatus(String newsid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndNewsdate(String title, String body, String typeid, String newsdate) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndUserid(String title, String body, String typeid, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndStatus(String title, String body, String typeid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndNewsdateAndUserid(String title, String body, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndNewsdateAndStatus(String title, String body, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndUseridAndStatus(String title, String body, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTypeidAndNewsdateAndUserid(String title, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTypeidAndNewsdateAndStatus(String title, String typeid, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTypeidAndUseridAndStatus(String title, String typeid, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndNewsdateAndUseridAndStatus(String title, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTypeidAndNewsdateAndUserid(String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTypeidAndNewsdateAndStatus(String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTypeidAndUseridAndStatus(String body, String typeid, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndNewsdateAndUseridAndStatus(String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTypeidAndNewsdateAndUseridAndStatus(String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdate(String newsid, String title, String body, String typeid, String newsdate) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndUserid(String newsid, String title, String body, String typeid, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndStatus(String newsid, String title, String body, String typeid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndNewsdateAndUserid(String newsid, String title, String body, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndNewsdateAndStatus(String newsid, String title, String body, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndUseridAndStatus(String newsid, String title, String body, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndUserid(String newsid, String title, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndStatus(String newsid, String title, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndUseridAndStatus(String newsid, String title, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndNewsdateAndUseridAndStatus(String newsid, String title, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndUseridAndStatus(String newsid, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndNewsdateAndUseridAndStatus(String newsid, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndNewsdateAndUserid(String title, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndNewsdateAndStatus(String title, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndUseridAndStatus(String title, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndNewsdateAndUseridAndStatus(String title, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndTypeidAndNewsdateAndUseridAndStatus(String title, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfBodyAndTypeidAndNewsdateAndUseridAndStatus(String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUserid(String newsid, String title, String body, String typeid, String newsdate, String userid) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndStatus(String newsid, String title, String body, String typeid, String newsdate, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndUseridAndStatus(String newsid, String title, String body, String typeid, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String title, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
    public List<News> getNewssOfNewsidAndTitleAndBodyAndTypeidAndNewsdateAndUseridAndStatus(String newsid, String title, String body, String typeid, String newsdate, String userid, String status) {
        News news = new News();
        news.setNewsid(newsid);
        news.setTitle(title);
        news.setBody(body);
        news.setTypeid(typeid);
        news.setNewsdate(newsdate);
        news.setUserid(userid);
        news.setStatus(status);
        return getNewss(news);
    }
}
