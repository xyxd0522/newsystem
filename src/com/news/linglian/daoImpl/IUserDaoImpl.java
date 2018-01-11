package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.User;

import com.news.linglian.dao.IUserDao;
import db.DBMan;

public class IUserDaoImpl implements IUserDao {
    public int update(User user, User keyUser) {
        return DBMan.getInstance().updateWithoutThrow(user, keyUser, "user");
    }
    public int updateOfUserId(User user, String userId) {
        User kUser = new User();
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfPassword(User user, String password) {
        User kUser = new User();
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfQid(User user, String qid) {
        User kUser = new User();
        kUser.setQid(qid);
        return update(user, kUser);
    }
    public int updateOfAnswer(User user, String answer) {
        User kUser = new User();
        kUser.setAnswer(answer);
        return update(user, kUser);
    }
    public int updateOfScore(User user, String score) {
        User kUser = new User();
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPassword(User user, String userId, String password) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfUserIdAndQid(User user, String userId, String qid) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setQid(qid);
        return update(user, kUser);
    }
    public int updateOfUserIdAndAnswer(User user, String userId, String answer) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setAnswer(answer);
        return update(user, kUser);
    }
    public int updateOfUserIdAndScore(User user, String userId, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPasswordAndQid(User user, String password, String qid) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setQid(qid);
        return update(user, kUser);
    }
    public int updateOfPasswordAndAnswer(User user, String password, String answer) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setAnswer(answer);
        return update(user, kUser);
    }
    public int updateOfPasswordAndScore(User user, String password, String score) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfQidAndAnswer(User user, String qid, String answer) {
        User kUser = new User();
        kUser.setQid(qid);
        kUser.setAnswer(answer);
        return update(user, kUser);
    }
    public int updateOfQidAndScore(User user, String qid, String score) {
        User kUser = new User();
        kUser.setQid(qid);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfAnswerAndScore(User user, String answer, String score) {
        User kUser = new User();
        kUser.setAnswer(answer);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPasswordAndQid(User user, String userId, String password, String qid) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        kUser.setQid(qid);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPasswordAndAnswer(User user, String userId, String password, String answer) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        kUser.setAnswer(answer);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPasswordAndScore(User user, String userId, String password, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndQidAndAnswer(User user, String userId, String qid, String answer) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setQid(qid);
        kUser.setAnswer(answer);
        return update(user, kUser);
    }
    public int updateOfUserIdAndQidAndScore(User user, String userId, String qid, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setQid(qid);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndAnswerAndScore(User user, String userId, String answer, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setAnswer(answer);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPasswordAndQidAndAnswer(User user, String password, String qid, String answer) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setQid(qid);
        kUser.setAnswer(answer);
        return update(user, kUser);
    }
    public int updateOfPasswordAndQidAndScore(User user, String password, String qid, String score) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setQid(qid);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPasswordAndAnswerAndScore(User user, String password, String answer, String score) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setAnswer(answer);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfQidAndAnswerAndScore(User user, String qid, String answer, String score) {
        User kUser = new User();
        kUser.setQid(qid);
        kUser.setAnswer(answer);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPasswordAndQidAndAnswer(User user, String userId, String password, String qid, String answer) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        kUser.setQid(qid);
        kUser.setAnswer(answer);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPasswordAndQidAndScore(User user, String userId, String password, String qid, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        kUser.setQid(qid);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPasswordAndAnswerAndScore(User user, String userId, String password, String answer, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        kUser.setAnswer(answer);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndQidAndAnswerAndScore(User user, String userId, String qid, String answer, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setQid(qid);
        kUser.setAnswer(answer);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPasswordAndQidAndAnswerAndScore(User user, String password, String qid, String answer, String score) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setQid(qid);
        kUser.setAnswer(answer);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPasswordAndQidAndAnswerAndScore(User user, String userId, String password, String qid, String answer, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        kUser.setQid(qid);
        kUser.setAnswer(answer);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int remove(User user) {
        return DBMan.getInstance().deleteWithoutThrow(user, "user");
    }
    public int removeOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfQid(String qid) {
        User user = new User();
        user.setQid(qid);
        return remove(user);
    }
    public int removeOfAnswer(String answer) {
        User user = new User();
        user.setAnswer(answer);
        return remove(user);
    }
    public int removeOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfUserIdAndQid(String userId, String qid) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        return remove(user);
    }
    public int removeOfUserIdAndAnswer(String userId, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setAnswer(answer);
        return remove(user);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPasswordAndQid(String password, String qid) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        return remove(user);
    }
    public int removeOfPasswordAndAnswer(String password, String answer) {
        User user = new User();
        user.setPassword(password);
        user.setAnswer(answer);
        return remove(user);
    }
    public int removeOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfQidAndAnswer(String qid, String answer) {
        User user = new User();
        user.setQid(qid);
        user.setAnswer(answer);
        return remove(user);
    }
    public int removeOfQidAndScore(String qid, String score) {
        User user = new User();
        user.setQid(qid);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfAnswerAndScore(String answer, String score) {
        User user = new User();
        user.setAnswer(answer);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndPasswordAndQid(String userId, String password, String qid) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        return remove(user);
    }
    public int removeOfUserIdAndPasswordAndAnswer(String userId, String password, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setAnswer(answer);
        return remove(user);
    }
    public int removeOfUserIdAndPasswordAndScore(String userId, String password, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndQidAndAnswer(String userId, String qid, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setAnswer(answer);
        return remove(user);
    }
    public int removeOfUserIdAndQidAndScore(String userId, String qid, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndAnswerAndScore(String userId, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setAnswer(answer);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPasswordAndQidAndAnswer(String password, String qid, String answer) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        return remove(user);
    }
    public int removeOfPasswordAndQidAndScore(String password, String qid, String score) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPasswordAndAnswerAndScore(String password, String answer, String score) {
        User user = new User();
        user.setPassword(password);
        user.setAnswer(answer);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfQidAndAnswerAndScore(String qid, String answer, String score) {
        User user = new User();
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndPasswordAndQidAndAnswer(String userId, String password, String qid, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        return remove(user);
    }
    public int removeOfUserIdAndPasswordAndQidAndScore(String userId, String password, String qid, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndPasswordAndAnswerAndScore(String userId, String password, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setAnswer(answer);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndQidAndAnswerAndScore(String userId, String qid, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPasswordAndQidAndAnswerAndScore(String password, String qid, String answer, String score) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndPasswordAndQidAndAnswerAndScore(String userId, String password, String qid, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return remove(user);
    }
    public int insert(User user) {
        return DBMan.getInstance().insertWithoutThrow(user, "user");
    }
    public int insertOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfQid(String qid) {
        User user = new User();
        user.setQid(qid);
        return insert(user);
    }
    public int insertOfAnswer(String answer) {
        User user = new User();
        user.setAnswer(answer);
        return insert(user);
    }
    public int insertOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfUserIdAndQid(String userId, String qid) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        return insert(user);
    }
    public int insertOfUserIdAndAnswer(String userId, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setAnswer(answer);
        return insert(user);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPasswordAndQid(String password, String qid) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        return insert(user);
    }
    public int insertOfPasswordAndAnswer(String password, String answer) {
        User user = new User();
        user.setPassword(password);
        user.setAnswer(answer);
        return insert(user);
    }
    public int insertOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfQidAndAnswer(String qid, String answer) {
        User user = new User();
        user.setQid(qid);
        user.setAnswer(answer);
        return insert(user);
    }
    public int insertOfQidAndScore(String qid, String score) {
        User user = new User();
        user.setQid(qid);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfAnswerAndScore(String answer, String score) {
        User user = new User();
        user.setAnswer(answer);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndPasswordAndQid(String userId, String password, String qid) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        return insert(user);
    }
    public int insertOfUserIdAndPasswordAndAnswer(String userId, String password, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setAnswer(answer);
        return insert(user);
    }
    public int insertOfUserIdAndPasswordAndScore(String userId, String password, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndQidAndAnswer(String userId, String qid, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setAnswer(answer);
        return insert(user);
    }
    public int insertOfUserIdAndQidAndScore(String userId, String qid, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndAnswerAndScore(String userId, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setAnswer(answer);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPasswordAndQidAndAnswer(String password, String qid, String answer) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        return insert(user);
    }
    public int insertOfPasswordAndQidAndScore(String password, String qid, String score) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPasswordAndAnswerAndScore(String password, String answer, String score) {
        User user = new User();
        user.setPassword(password);
        user.setAnswer(answer);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfQidAndAnswerAndScore(String qid, String answer, String score) {
        User user = new User();
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndPasswordAndQidAndAnswer(String userId, String password, String qid, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        return insert(user);
    }
    public int insertOfUserIdAndPasswordAndQidAndScore(String userId, String password, String qid, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndPasswordAndAnswerAndScore(String userId, String password, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setAnswer(answer);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndQidAndAnswerAndScore(String userId, String qid, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPasswordAndQidAndAnswerAndScore(String password, String qid, String answer, String score) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndPasswordAndQidAndAnswerAndScore(String userId, String password, String qid, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return insert(user);
    }
    public User getUser(User user) {
        return DBMan.getInstance().queryByIdWithoutThrow(user, "user");
    }
    public User getUserOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfQid(String qid) {
        User user = new User();
        user.setQid(qid);
        return getUser(user);
    }
    public User getUserOfAnswer(String answer) {
        User user = new User();
        user.setAnswer(answer);
        return getUser(user);
    }
    public User getUserOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfUserIdAndQid(String userId, String qid) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        return getUser(user);
    }
    public User getUserOfUserIdAndAnswer(String userId, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setAnswer(answer);
        return getUser(user);
    }
    public User getUserOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPasswordAndQid(String password, String qid) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        return getUser(user);
    }
    public User getUserOfPasswordAndAnswer(String password, String answer) {
        User user = new User();
        user.setPassword(password);
        user.setAnswer(answer);
        return getUser(user);
    }
    public User getUserOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfQidAndAnswer(String qid, String answer) {
        User user = new User();
        user.setQid(qid);
        user.setAnswer(answer);
        return getUser(user);
    }
    public User getUserOfQidAndScore(String qid, String score) {
        User user = new User();
        user.setQid(qid);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfAnswerAndScore(String answer, String score) {
        User user = new User();
        user.setAnswer(answer);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndPasswordAndQid(String userId, String password, String qid) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        return getUser(user);
    }
    public User getUserOfUserIdAndPasswordAndAnswer(String userId, String password, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setAnswer(answer);
        return getUser(user);
    }
    public User getUserOfUserIdAndPasswordAndScore(String userId, String password, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndQidAndAnswer(String userId, String qid, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setAnswer(answer);
        return getUser(user);
    }
    public User getUserOfUserIdAndQidAndScore(String userId, String qid, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndAnswerAndScore(String userId, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setAnswer(answer);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPasswordAndQidAndAnswer(String password, String qid, String answer) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        return getUser(user);
    }
    public User getUserOfPasswordAndQidAndScore(String password, String qid, String score) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPasswordAndAnswerAndScore(String password, String answer, String score) {
        User user = new User();
        user.setPassword(password);
        user.setAnswer(answer);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfQidAndAnswerAndScore(String qid, String answer, String score) {
        User user = new User();
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndPasswordAndQidAndAnswer(String userId, String password, String qid, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        return getUser(user);
    }
    public User getUserOfUserIdAndPasswordAndQidAndScore(String userId, String password, String qid, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndPasswordAndAnswerAndScore(String userId, String password, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setAnswer(answer);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndQidAndAnswerAndScore(String userId, String qid, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPasswordAndQidAndAnswerAndScore(String password, String qid, String answer, String score) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndPasswordAndQidAndAnswerAndScore(String userId, String password, String qid, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return getUser(user);
    }
    public List<User> getUsers(User user) {
        return DBMan.getInstance().queryWithoutThrow(user, "user");
    }
    public List<User> getUsersOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfQid(String qid) {
        User user = new User();
        user.setQid(qid);
        return getUsers(user);
    }
    public List<User> getUsersOfAnswer(String answer) {
        User user = new User();
        user.setAnswer(answer);
        return getUsers(user);
    }
    public List<User> getUsersOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndQid(String userId, String qid) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndAnswer(String userId, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setAnswer(answer);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndQid(String password, String qid) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndAnswer(String password, String answer) {
        User user = new User();
        user.setPassword(password);
        user.setAnswer(answer);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfQidAndAnswer(String qid, String answer) {
        User user = new User();
        user.setQid(qid);
        user.setAnswer(answer);
        return getUsers(user);
    }
    public List<User> getUsersOfQidAndScore(String qid, String score) {
        User user = new User();
        user.setQid(qid);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfAnswerAndScore(String answer, String score) {
        User user = new User();
        user.setAnswer(answer);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPasswordAndQid(String userId, String password, String qid) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPasswordAndAnswer(String userId, String password, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setAnswer(answer);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPasswordAndScore(String userId, String password, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndQidAndAnswer(String userId, String qid, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setAnswer(answer);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndQidAndScore(String userId, String qid, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndAnswerAndScore(String userId, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setAnswer(answer);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndQidAndAnswer(String password, String qid, String answer) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndQidAndScore(String password, String qid, String score) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndAnswerAndScore(String password, String answer, String score) {
        User user = new User();
        user.setPassword(password);
        user.setAnswer(answer);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfQidAndAnswerAndScore(String qid, String answer, String score) {
        User user = new User();
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPasswordAndQidAndAnswer(String userId, String password, String qid, String answer) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPasswordAndQidAndScore(String userId, String password, String qid, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPasswordAndAnswerAndScore(String userId, String password, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setAnswer(answer);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndQidAndAnswerAndScore(String userId, String qid, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndQidAndAnswerAndScore(String password, String qid, String answer, String score) {
        User user = new User();
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPasswordAndQidAndAnswerAndScore(String userId, String password, String qid, String answer, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        user.setQid(qid);
        user.setAnswer(answer);
        user.setScore(score);
        return getUsers(user);
    }
}
