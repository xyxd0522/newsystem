package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.User;

import com.news.linglian.dao.IUserDao;
import com.news.linglian.daoImpl.IUserDaoImpl;
import com.news.linglian.service.IUserService;

public class IUserServiceImpl implements IUserService {
	IUserDao dao = null;

	public IUserServiceImpl() {
		dao = new IUserDaoImpl();
	}
    public int update(User user, User keyUser) {
        return dao.update(user, keyUser);
    }
    public int updateOfUserId(User user, String userId) {
        return dao.updateOfUserId(user, userId);
    }
    public int updateOfPassword(User user, String password) {
        return dao.updateOfPassword(user, password);
    }
    public int updateOfQid(User user, String qid) {
        return dao.updateOfQid(user, qid);
    }
    public int updateOfAnswer(User user, String answer) {
        return dao.updateOfAnswer(user, answer);
    }
    public int updateOfScore(User user, String score) {
        return dao.updateOfScore(user, score);
    }
    public int updateOfUserIdAndPassword(User user, String userId, String password) {
        return dao.updateOfUserIdAndPassword(user, userId, password);
    }
    public int updateOfUserIdAndQid(User user, String userId, String qid) {
        return dao.updateOfUserIdAndQid(user, userId, qid);
    }
    public int updateOfUserIdAndAnswer(User user, String userId, String answer) {
        return dao.updateOfUserIdAndAnswer(user, userId, answer);
    }
    public int updateOfUserIdAndScore(User user, String userId, String score) {
        return dao.updateOfUserIdAndScore(user, userId, score);
    }
    public int updateOfPasswordAndQid(User user, String password, String qid) {
        return dao.updateOfPasswordAndQid(user, password, qid);
    }
    public int updateOfPasswordAndAnswer(User user, String password, String answer) {
        return dao.updateOfPasswordAndAnswer(user, password, answer);
    }
    public int updateOfPasswordAndScore(User user, String password, String score) {
        return dao.updateOfPasswordAndScore(user, password, score);
    }
    public int updateOfQidAndAnswer(User user, String qid, String answer) {
        return dao.updateOfQidAndAnswer(user, qid, answer);
    }
    public int updateOfQidAndScore(User user, String qid, String score) {
        return dao.updateOfQidAndScore(user, qid, score);
    }
    public int updateOfAnswerAndScore(User user, String answer, String score) {
        return dao.updateOfAnswerAndScore(user, answer, score);
    }
    public int updateOfUserIdAndPasswordAndQid(User user, String userId, String password, String qid) {
        return dao.updateOfUserIdAndPasswordAndQid(user, userId, password, qid);
    }
    public int updateOfUserIdAndPasswordAndAnswer(User user, String userId, String password, String answer) {
        return dao.updateOfUserIdAndPasswordAndAnswer(user, userId, password, answer);
    }
    public int updateOfUserIdAndPasswordAndScore(User user, String userId, String password, String score) {
        return dao.updateOfUserIdAndPasswordAndScore(user, userId, password, score);
    }
    public int updateOfUserIdAndQidAndAnswer(User user, String userId, String qid, String answer) {
        return dao.updateOfUserIdAndQidAndAnswer(user, userId, qid, answer);
    }
    public int updateOfUserIdAndQidAndScore(User user, String userId, String qid, String score) {
        return dao.updateOfUserIdAndQidAndScore(user, userId, qid, score);
    }
    public int updateOfUserIdAndAnswerAndScore(User user, String userId, String answer, String score) {
        return dao.updateOfUserIdAndAnswerAndScore(user, userId, answer, score);
    }
    public int updateOfPasswordAndQidAndAnswer(User user, String password, String qid, String answer) {
        return dao.updateOfPasswordAndQidAndAnswer(user, password, qid, answer);
    }
    public int updateOfPasswordAndQidAndScore(User user, String password, String qid, String score) {
        return dao.updateOfPasswordAndQidAndScore(user, password, qid, score);
    }
    public int updateOfPasswordAndAnswerAndScore(User user, String password, String answer, String score) {
        return dao.updateOfPasswordAndAnswerAndScore(user, password, answer, score);
    }
    public int updateOfQidAndAnswerAndScore(User user, String qid, String answer, String score) {
        return dao.updateOfQidAndAnswerAndScore(user, qid, answer, score);
    }
    public int updateOfUserIdAndPasswordAndQidAndAnswer(User user, String userId, String password, String qid, String answer) {
        return dao.updateOfUserIdAndPasswordAndQidAndAnswer(user, userId, password, qid, answer);
    }
    public int updateOfUserIdAndPasswordAndQidAndScore(User user, String userId, String password, String qid, String score) {
        return dao.updateOfUserIdAndPasswordAndQidAndScore(user, userId, password, qid, score);
    }
    public int updateOfUserIdAndPasswordAndAnswerAndScore(User user, String userId, String password, String answer, String score) {
        return dao.updateOfUserIdAndPasswordAndAnswerAndScore(user, userId, password, answer, score);
    }
    public int updateOfUserIdAndQidAndAnswerAndScore(User user, String userId, String qid, String answer, String score) {
        return dao.updateOfUserIdAndQidAndAnswerAndScore(user, userId, qid, answer, score);
    }
    public int updateOfPasswordAndQidAndAnswerAndScore(User user, String password, String qid, String answer, String score) {
        return dao.updateOfPasswordAndQidAndAnswerAndScore(user, password, qid, answer, score);
    }
    public int updateOfUserIdAndPasswordAndQidAndAnswerAndScore(User user, String userId, String password, String qid, String answer, String score) {
        return dao.updateOfUserIdAndPasswordAndQidAndAnswerAndScore(user, userId, password, qid, answer, score);
    }
    public int remove(User user) {
        return dao.remove(user);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfPassword(String password) {
        return dao.removeOfPassword(password);
    }
    public int removeOfQid(String qid) {
        return dao.removeOfQid(qid);
    }
    public int removeOfAnswer(String answer) {
        return dao.removeOfAnswer(answer);
    }
    public int removeOfScore(String score) {
        return dao.removeOfScore(score);
    }
    public int removeOfUserIdAndPassword(String userId, String password) {
        return dao.removeOfUserIdAndPassword(userId, password);
    }
    public int removeOfUserIdAndQid(String userId, String qid) {
        return dao.removeOfUserIdAndQid(userId, qid);
    }
    public int removeOfUserIdAndAnswer(String userId, String answer) {
        return dao.removeOfUserIdAndAnswer(userId, answer);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        return dao.removeOfUserIdAndScore(userId, score);
    }
    public int removeOfPasswordAndQid(String password, String qid) {
        return dao.removeOfPasswordAndQid(password, qid);
    }
    public int removeOfPasswordAndAnswer(String password, String answer) {
        return dao.removeOfPasswordAndAnswer(password, answer);
    }
    public int removeOfPasswordAndScore(String password, String score) {
        return dao.removeOfPasswordAndScore(password, score);
    }
    public int removeOfQidAndAnswer(String qid, String answer) {
        return dao.removeOfQidAndAnswer(qid, answer);
    }
    public int removeOfQidAndScore(String qid, String score) {
        return dao.removeOfQidAndScore(qid, score);
    }
    public int removeOfAnswerAndScore(String answer, String score) {
        return dao.removeOfAnswerAndScore(answer, score);
    }
    public int removeOfUserIdAndPasswordAndQid(String userId, String password, String qid) {
        return dao.removeOfUserIdAndPasswordAndQid(userId, password, qid);
    }
    public int removeOfUserIdAndPasswordAndAnswer(String userId, String password, String answer) {
        return dao.removeOfUserIdAndPasswordAndAnswer(userId, password, answer);
    }
    public int removeOfUserIdAndPasswordAndScore(String userId, String password, String score) {
        return dao.removeOfUserIdAndPasswordAndScore(userId, password, score);
    }
    public int removeOfUserIdAndQidAndAnswer(String userId, String qid, String answer) {
        return dao.removeOfUserIdAndQidAndAnswer(userId, qid, answer);
    }
    public int removeOfUserIdAndQidAndScore(String userId, String qid, String score) {
        return dao.removeOfUserIdAndQidAndScore(userId, qid, score);
    }
    public int removeOfUserIdAndAnswerAndScore(String userId, String answer, String score) {
        return dao.removeOfUserIdAndAnswerAndScore(userId, answer, score);
    }
    public int removeOfPasswordAndQidAndAnswer(String password, String qid, String answer) {
        return dao.removeOfPasswordAndQidAndAnswer(password, qid, answer);
    }
    public int removeOfPasswordAndQidAndScore(String password, String qid, String score) {
        return dao.removeOfPasswordAndQidAndScore(password, qid, score);
    }
    public int removeOfPasswordAndAnswerAndScore(String password, String answer, String score) {
        return dao.removeOfPasswordAndAnswerAndScore(password, answer, score);
    }
    public int removeOfQidAndAnswerAndScore(String qid, String answer, String score) {
        return dao.removeOfQidAndAnswerAndScore(qid, answer, score);
    }
    public int removeOfUserIdAndPasswordAndQidAndAnswer(String userId, String password, String qid, String answer) {
        return dao.removeOfUserIdAndPasswordAndQidAndAnswer(userId, password, qid, answer);
    }
    public int removeOfUserIdAndPasswordAndQidAndScore(String userId, String password, String qid, String score) {
        return dao.removeOfUserIdAndPasswordAndQidAndScore(userId, password, qid, score);
    }
    public int removeOfUserIdAndPasswordAndAnswerAndScore(String userId, String password, String answer, String score) {
        return dao.removeOfUserIdAndPasswordAndAnswerAndScore(userId, password, answer, score);
    }
    public int removeOfUserIdAndQidAndAnswerAndScore(String userId, String qid, String answer, String score) {
        return dao.removeOfUserIdAndQidAndAnswerAndScore(userId, qid, answer, score);
    }
    public int removeOfPasswordAndQidAndAnswerAndScore(String password, String qid, String answer, String score) {
        return dao.removeOfPasswordAndQidAndAnswerAndScore(password, qid, answer, score);
    }
    public int removeOfUserIdAndPasswordAndQidAndAnswerAndScore(String userId, String password, String qid, String answer, String score) {
        return dao.removeOfUserIdAndPasswordAndQidAndAnswerAndScore(userId, password, qid, answer, score);
    }
    public int insert(User user) {
        return dao.insert(user);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfPassword(String password) {
        return dao.insertOfPassword(password);
    }
    public int insertOfQid(String qid) {
        return dao.insertOfQid(qid);
    }
    public int insertOfAnswer(String answer) {
        return dao.insertOfAnswer(answer);
    }
    public int insertOfScore(String score) {
        return dao.insertOfScore(score);
    }
    public int insertOfUserIdAndPassword(String userId, String password) {
        return dao.insertOfUserIdAndPassword(userId, password);
    }
    public int insertOfUserIdAndQid(String userId, String qid) {
        return dao.insertOfUserIdAndQid(userId, qid);
    }
    public int insertOfUserIdAndAnswer(String userId, String answer) {
        return dao.insertOfUserIdAndAnswer(userId, answer);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        return dao.insertOfUserIdAndScore(userId, score);
    }
    public int insertOfPasswordAndQid(String password, String qid) {
        return dao.insertOfPasswordAndQid(password, qid);
    }
    public int insertOfPasswordAndAnswer(String password, String answer) {
        return dao.insertOfPasswordAndAnswer(password, answer);
    }
    public int insertOfPasswordAndScore(String password, String score) {
        return dao.insertOfPasswordAndScore(password, score);
    }
    public int insertOfQidAndAnswer(String qid, String answer) {
        return dao.insertOfQidAndAnswer(qid, answer);
    }
    public int insertOfQidAndScore(String qid, String score) {
        return dao.insertOfQidAndScore(qid, score);
    }
    public int insertOfAnswerAndScore(String answer, String score) {
        return dao.insertOfAnswerAndScore(answer, score);
    }
    public int insertOfUserIdAndPasswordAndQid(String userId, String password, String qid) {
        return dao.insertOfUserIdAndPasswordAndQid(userId, password, qid);
    }
    public int insertOfUserIdAndPasswordAndAnswer(String userId, String password, String answer) {
        return dao.insertOfUserIdAndPasswordAndAnswer(userId, password, answer);
    }
    public int insertOfUserIdAndPasswordAndScore(String userId, String password, String score) {
        return dao.insertOfUserIdAndPasswordAndScore(userId, password, score);
    }
    public int insertOfUserIdAndQidAndAnswer(String userId, String qid, String answer) {
        return dao.insertOfUserIdAndQidAndAnswer(userId, qid, answer);
    }
    public int insertOfUserIdAndQidAndScore(String userId, String qid, String score) {
        return dao.insertOfUserIdAndQidAndScore(userId, qid, score);
    }
    public int insertOfUserIdAndAnswerAndScore(String userId, String answer, String score) {
        return dao.insertOfUserIdAndAnswerAndScore(userId, answer, score);
    }
    public int insertOfPasswordAndQidAndAnswer(String password, String qid, String answer) {
        return dao.insertOfPasswordAndQidAndAnswer(password, qid, answer);
    }
    public int insertOfPasswordAndQidAndScore(String password, String qid, String score) {
        return dao.insertOfPasswordAndQidAndScore(password, qid, score);
    }
    public int insertOfPasswordAndAnswerAndScore(String password, String answer, String score) {
        return dao.insertOfPasswordAndAnswerAndScore(password, answer, score);
    }
    public int insertOfQidAndAnswerAndScore(String qid, String answer, String score) {
        return dao.insertOfQidAndAnswerAndScore(qid, answer, score);
    }
    public int insertOfUserIdAndPasswordAndQidAndAnswer(String userId, String password, String qid, String answer) {
        return dao.insertOfUserIdAndPasswordAndQidAndAnswer(userId, password, qid, answer);
    }
    public int insertOfUserIdAndPasswordAndQidAndScore(String userId, String password, String qid, String score) {
        return dao.insertOfUserIdAndPasswordAndQidAndScore(userId, password, qid, score);
    }
    public int insertOfUserIdAndPasswordAndAnswerAndScore(String userId, String password, String answer, String score) {
        return dao.insertOfUserIdAndPasswordAndAnswerAndScore(userId, password, answer, score);
    }
    public int insertOfUserIdAndQidAndAnswerAndScore(String userId, String qid, String answer, String score) {
        return dao.insertOfUserIdAndQidAndAnswerAndScore(userId, qid, answer, score);
    }
    public int insertOfPasswordAndQidAndAnswerAndScore(String password, String qid, String answer, String score) {
        return dao.insertOfPasswordAndQidAndAnswerAndScore(password, qid, answer, score);
    }
    public int insertOfUserIdAndPasswordAndQidAndAnswerAndScore(String userId, String password, String qid, String answer, String score) {
        return dao.insertOfUserIdAndPasswordAndQidAndAnswerAndScore(userId, password, qid, answer, score);
    }
    public User getUser(User user) {
        return dao.getUser(user);
    }
    public User getUserOfUserId(String userId) {
        return dao.getUserOfUserId(userId);
    }
    public User getUserOfPassword(String password) {
        return dao.getUserOfPassword(password);
    }
    public User getUserOfQid(String qid) {
        return dao.getUserOfQid(qid);
    }
    public User getUserOfAnswer(String answer) {
        return dao.getUserOfAnswer(answer);
    }
    public User getUserOfScore(String score) {
        return dao.getUserOfScore(score);
    }
    public User getUserOfUserIdAndPassword(String userId, String password) {
        return dao.getUserOfUserIdAndPassword(userId, password);
    }
    public User getUserOfUserIdAndQid(String userId, String qid) {
        return dao.getUserOfUserIdAndQid(userId, qid);
    }
    public User getUserOfUserIdAndAnswer(String userId, String answer) {
        return dao.getUserOfUserIdAndAnswer(userId, answer);
    }
    public User getUserOfUserIdAndScore(String userId, String score) {
        return dao.getUserOfUserIdAndScore(userId, score);
    }
    public User getUserOfPasswordAndQid(String password, String qid) {
        return dao.getUserOfPasswordAndQid(password, qid);
    }
    public User getUserOfPasswordAndAnswer(String password, String answer) {
        return dao.getUserOfPasswordAndAnswer(password, answer);
    }
    public User getUserOfPasswordAndScore(String password, String score) {
        return dao.getUserOfPasswordAndScore(password, score);
    }
    public User getUserOfQidAndAnswer(String qid, String answer) {
        return dao.getUserOfQidAndAnswer(qid, answer);
    }
    public User getUserOfQidAndScore(String qid, String score) {
        return dao.getUserOfQidAndScore(qid, score);
    }
    public User getUserOfAnswerAndScore(String answer, String score) {
        return dao.getUserOfAnswerAndScore(answer, score);
    }
    public User getUserOfUserIdAndPasswordAndQid(String userId, String password, String qid) {
        return dao.getUserOfUserIdAndPasswordAndQid(userId, password, qid);
    }
    public User getUserOfUserIdAndPasswordAndAnswer(String userId, String password, String answer) {
        return dao.getUserOfUserIdAndPasswordAndAnswer(userId, password, answer);
    }
    public User getUserOfUserIdAndPasswordAndScore(String userId, String password, String score) {
        return dao.getUserOfUserIdAndPasswordAndScore(userId, password, score);
    }
    public User getUserOfUserIdAndQidAndAnswer(String userId, String qid, String answer) {
        return dao.getUserOfUserIdAndQidAndAnswer(userId, qid, answer);
    }
    public User getUserOfUserIdAndQidAndScore(String userId, String qid, String score) {
        return dao.getUserOfUserIdAndQidAndScore(userId, qid, score);
    }
    public User getUserOfUserIdAndAnswerAndScore(String userId, String answer, String score) {
        return dao.getUserOfUserIdAndAnswerAndScore(userId, answer, score);
    }
    public User getUserOfPasswordAndQidAndAnswer(String password, String qid, String answer) {
        return dao.getUserOfPasswordAndQidAndAnswer(password, qid, answer);
    }
    public User getUserOfPasswordAndQidAndScore(String password, String qid, String score) {
        return dao.getUserOfPasswordAndQidAndScore(password, qid, score);
    }
    public User getUserOfPasswordAndAnswerAndScore(String password, String answer, String score) {
        return dao.getUserOfPasswordAndAnswerAndScore(password, answer, score);
    }
    public User getUserOfQidAndAnswerAndScore(String qid, String answer, String score) {
        return dao.getUserOfQidAndAnswerAndScore(qid, answer, score);
    }
    public User getUserOfUserIdAndPasswordAndQidAndAnswer(String userId, String password, String qid, String answer) {
        return dao.getUserOfUserIdAndPasswordAndQidAndAnswer(userId, password, qid, answer);
    }
    public User getUserOfUserIdAndPasswordAndQidAndScore(String userId, String password, String qid, String score) {
        return dao.getUserOfUserIdAndPasswordAndQidAndScore(userId, password, qid, score);
    }
    public User getUserOfUserIdAndPasswordAndAnswerAndScore(String userId, String password, String answer, String score) {
        return dao.getUserOfUserIdAndPasswordAndAnswerAndScore(userId, password, answer, score);
    }
    public User getUserOfUserIdAndQidAndAnswerAndScore(String userId, String qid, String answer, String score) {
        return dao.getUserOfUserIdAndQidAndAnswerAndScore(userId, qid, answer, score);
    }
    public User getUserOfPasswordAndQidAndAnswerAndScore(String password, String qid, String answer, String score) {
        return dao.getUserOfPasswordAndQidAndAnswerAndScore(password, qid, answer, score);
    }
    public User getUserOfUserIdAndPasswordAndQidAndAnswerAndScore(String userId, String password, String qid, String answer, String score) {
        return dao.getUserOfUserIdAndPasswordAndQidAndAnswerAndScore(userId, password, qid, answer, score);
    }
    public List<User> getUsers(User user) {
        return dao.getUsers(user);
    }
    public List<User> getUsersOfUserId(String userId) {
        return dao.getUsersOfUserId(userId);
    }
    public List<User> getUsersOfPassword(String password) {
        return dao.getUsersOfPassword(password);
    }
    public List<User> getUsersOfQid(String qid) {
        return dao.getUsersOfQid(qid);
    }
    public List<User> getUsersOfAnswer(String answer) {
        return dao.getUsersOfAnswer(answer);
    }
    public List<User> getUsersOfScore(String score) {
        return dao.getUsersOfScore(score);
    }
    public List<User> getUsersOfUserIdAndPassword(String userId, String password) {
        return dao.getUsersOfUserIdAndPassword(userId, password);
    }
    public List<User> getUsersOfUserIdAndQid(String userId, String qid) {
        return dao.getUsersOfUserIdAndQid(userId, qid);
    }
    public List<User> getUsersOfUserIdAndAnswer(String userId, String answer) {
        return dao.getUsersOfUserIdAndAnswer(userId, answer);
    }
    public List<User> getUsersOfUserIdAndScore(String userId, String score) {
        return dao.getUsersOfUserIdAndScore(userId, score);
    }
    public List<User> getUsersOfPasswordAndQid(String password, String qid) {
        return dao.getUsersOfPasswordAndQid(password, qid);
    }
    public List<User> getUsersOfPasswordAndAnswer(String password, String answer) {
        return dao.getUsersOfPasswordAndAnswer(password, answer);
    }
    public List<User> getUsersOfPasswordAndScore(String password, String score) {
        return dao.getUsersOfPasswordAndScore(password, score);
    }
    public List<User> getUsersOfQidAndAnswer(String qid, String answer) {
        return dao.getUsersOfQidAndAnswer(qid, answer);
    }
    public List<User> getUsersOfQidAndScore(String qid, String score) {
        return dao.getUsersOfQidAndScore(qid, score);
    }
    public List<User> getUsersOfAnswerAndScore(String answer, String score) {
        return dao.getUsersOfAnswerAndScore(answer, score);
    }
    public List<User> getUsersOfUserIdAndPasswordAndQid(String userId, String password, String qid) {
        return dao.getUsersOfUserIdAndPasswordAndQid(userId, password, qid);
    }
    public List<User> getUsersOfUserIdAndPasswordAndAnswer(String userId, String password, String answer) {
        return dao.getUsersOfUserIdAndPasswordAndAnswer(userId, password, answer);
    }
    public List<User> getUsersOfUserIdAndPasswordAndScore(String userId, String password, String score) {
        return dao.getUsersOfUserIdAndPasswordAndScore(userId, password, score);
    }
    public List<User> getUsersOfUserIdAndQidAndAnswer(String userId, String qid, String answer) {
        return dao.getUsersOfUserIdAndQidAndAnswer(userId, qid, answer);
    }
    public List<User> getUsersOfUserIdAndQidAndScore(String userId, String qid, String score) {
        return dao.getUsersOfUserIdAndQidAndScore(userId, qid, score);
    }
    public List<User> getUsersOfUserIdAndAnswerAndScore(String userId, String answer, String score) {
        return dao.getUsersOfUserIdAndAnswerAndScore(userId, answer, score);
    }
    public List<User> getUsersOfPasswordAndQidAndAnswer(String password, String qid, String answer) {
        return dao.getUsersOfPasswordAndQidAndAnswer(password, qid, answer);
    }
    public List<User> getUsersOfPasswordAndQidAndScore(String password, String qid, String score) {
        return dao.getUsersOfPasswordAndQidAndScore(password, qid, score);
    }
    public List<User> getUsersOfPasswordAndAnswerAndScore(String password, String answer, String score) {
        return dao.getUsersOfPasswordAndAnswerAndScore(password, answer, score);
    }
    public List<User> getUsersOfQidAndAnswerAndScore(String qid, String answer, String score) {
        return dao.getUsersOfQidAndAnswerAndScore(qid, answer, score);
    }
    public List<User> getUsersOfUserIdAndPasswordAndQidAndAnswer(String userId, String password, String qid, String answer) {
        return dao.getUsersOfUserIdAndPasswordAndQidAndAnswer(userId, password, qid, answer);
    }
    public List<User> getUsersOfUserIdAndPasswordAndQidAndScore(String userId, String password, String qid, String score) {
        return dao.getUsersOfUserIdAndPasswordAndQidAndScore(userId, password, qid, score);
    }
    public List<User> getUsersOfUserIdAndPasswordAndAnswerAndScore(String userId, String password, String answer, String score) {
        return dao.getUsersOfUserIdAndPasswordAndAnswerAndScore(userId, password, answer, score);
    }
    public List<User> getUsersOfUserIdAndQidAndAnswerAndScore(String userId, String qid, String answer, String score) {
        return dao.getUsersOfUserIdAndQidAndAnswerAndScore(userId, qid, answer, score);
    }
    public List<User> getUsersOfPasswordAndQidAndAnswerAndScore(String password, String qid, String answer, String score) {
        return dao.getUsersOfPasswordAndQidAndAnswerAndScore(password, qid, answer, score);
    }
    public List<User> getUsersOfUserIdAndPasswordAndQidAndAnswerAndScore(String userId, String password, String qid, String answer, String score) {
        return dao.getUsersOfUserIdAndPasswordAndQidAndAnswerAndScore(userId, password, qid, answer, score);
    }
}
