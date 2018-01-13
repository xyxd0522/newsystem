package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.User;

import com.news.linglian.dao.IUserDao;
import db.DBMan;

public class IUserDaoImpl implements IUserDao {
    public int update(User user, User keyUser) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(user, keyUser, "newsystem");
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
    public int updateOfName(User user, String name) {
        User kUser = new User();
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfSex(User user, String sex) {
        User kUser = new User();
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfRegisterDate(User user, String registerDate) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        return update(user, kUser);
    }
    public int updateOfLoginDate(User user, String loginDate) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfPhone(User user, String phone) {
        User kUser = new User();
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfEmail(User user, String email) {
        User kUser = new User();
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfMoney(User user, String money) {
        User kUser = new User();
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfScore(User user, String score) {
        User kUser = new User();
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPath(User user, String path) {
        User kUser = new User();
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfParam(User user, String param) {
        User kUser = new User();
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfLvl(User user, String lvl) {
        User kUser = new User();
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfNewIds(User user, String newIds) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfUserIds(User user, String userIds) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfDesc(User user, String desc) {
        User kUser = new User();
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfImage(User user, String image) {
        User kUser = new User();
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfFamous(User user, String famous) {
        User kUser = new User();
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfBUserIds(User user, String bUserIds) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPassword(User user, String userId, String password) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfUserIdAndName(User user, String userId, String name) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfUserIdAndSex(User user, String userId, String sex) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfUserIdAndRegisterDate(User user, String userId, String registerDate) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setRegisterDate(registerDate);
        return update(user, kUser);
    }
    public int updateOfUserIdAndLoginDate(User user, String userId, String loginDate) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPhone(User user, String userId, String phone) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfUserIdAndEmail(User user, String userId, String email) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfUserIdAndMoney(User user, String userId, String money) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfUserIdAndScore(User user, String userId, String score) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPath(User user, String userId, String path) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfUserIdAndParam(User user, String userId, String param) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfUserIdAndLvl(User user, String userId, String lvl) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfUserIdAndNewIds(User user, String userId, String newIds) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfUserIdAndUserIds(User user, String userId, String userIds) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfUserIdAndDesc(User user, String userId, String desc) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfUserIdAndImage(User user, String userId, String image) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfUserIdAndFamous(User user, String userId, String famous) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfUserIdAndBUserIds(User user, String userId, String bUserIds) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfPasswordAndName(User user, String password, String name) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfPasswordAndSex(User user, String password, String sex) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfPasswordAndRegisterDate(User user, String password, String registerDate) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setRegisterDate(registerDate);
        return update(user, kUser);
    }
    public int updateOfPasswordAndLoginDate(User user, String password, String loginDate) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfPasswordAndPhone(User user, String password, String phone) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfPasswordAndEmail(User user, String password, String email) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfPasswordAndMoney(User user, String password, String money) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfPasswordAndScore(User user, String password, String score) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPasswordAndPath(User user, String password, String path) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfPasswordAndParam(User user, String password, String param) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPasswordAndLvl(User user, String password, String lvl) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfPasswordAndNewIds(User user, String password, String newIds) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfPasswordAndUserIds(User user, String password, String userIds) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfPasswordAndDesc(User user, String password, String desc) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfPasswordAndImage(User user, String password, String image) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfPasswordAndFamous(User user, String password, String famous) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfPasswordAndBUserIds(User user, String password, String bUserIds) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfNameAndSex(User user, String name, String sex) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfNameAndRegisterDate(User user, String name, String registerDate) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setRegisterDate(registerDate);
        return update(user, kUser);
    }
    public int updateOfNameAndLoginDate(User user, String name, String loginDate) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfNameAndPhone(User user, String name, String phone) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfNameAndEmail(User user, String name, String email) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfNameAndMoney(User user, String name, String money) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfNameAndScore(User user, String name, String score) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfNameAndPath(User user, String name, String path) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfNameAndParam(User user, String name, String param) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfNameAndLvl(User user, String name, String lvl) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfNameAndNewIds(User user, String name, String newIds) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfNameAndUserIds(User user, String name, String userIds) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfNameAndDesc(User user, String name, String desc) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfNameAndImage(User user, String name, String image) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfNameAndFamous(User user, String name, String famous) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfNameAndBUserIds(User user, String name, String bUserIds) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfSexAndRegisterDate(User user, String sex, String registerDate) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setRegisterDate(registerDate);
        return update(user, kUser);
    }
    public int updateOfSexAndLoginDate(User user, String sex, String loginDate) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfSexAndPhone(User user, String sex, String phone) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfSexAndEmail(User user, String sex, String email) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfSexAndMoney(User user, String sex, String money) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfSexAndScore(User user, String sex, String score) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfSexAndPath(User user, String sex, String path) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfSexAndParam(User user, String sex, String param) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfSexAndLvl(User user, String sex, String lvl) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfSexAndNewIds(User user, String sex, String newIds) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfSexAndUserIds(User user, String sex, String userIds) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfSexAndDesc(User user, String sex, String desc) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfSexAndImage(User user, String sex, String image) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfSexAndFamous(User user, String sex, String famous) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfSexAndBUserIds(User user, String sex, String bUserIds) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndLoginDate(User user, String registerDate, String loginDate) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndPhone(User user, String registerDate, String phone) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndEmail(User user, String registerDate, String email) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndMoney(User user, String registerDate, String money) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndScore(User user, String registerDate, String score) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndPath(User user, String registerDate, String path) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndParam(User user, String registerDate, String param) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndLvl(User user, String registerDate, String lvl) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndNewIds(User user, String registerDate, String newIds) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndUserIds(User user, String registerDate, String userIds) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndDesc(User user, String registerDate, String desc) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndImage(User user, String registerDate, String image) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndFamous(User user, String registerDate, String famous) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfRegisterDateAndBUserIds(User user, String registerDate, String bUserIds) {
        User kUser = new User();
        kUser.setRegisterDate(registerDate);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndPhone(User user, String loginDate, String phone) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndEmail(User user, String loginDate, String email) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndMoney(User user, String loginDate, String money) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndScore(User user, String loginDate, String score) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndPath(User user, String loginDate, String path) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndParam(User user, String loginDate, String param) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndLvl(User user, String loginDate, String lvl) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndNewIds(User user, String loginDate, String newIds) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndUserIds(User user, String loginDate, String userIds) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndDesc(User user, String loginDate, String desc) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndImage(User user, String loginDate, String image) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndFamous(User user, String loginDate, String famous) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndBUserIds(User user, String loginDate, String bUserIds) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfPhoneAndEmail(User user, String phone, String email) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfPhoneAndMoney(User user, String phone, String money) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfPhoneAndScore(User user, String phone, String score) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfPhoneAndPath(User user, String phone, String path) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfPhoneAndParam(User user, String phone, String param) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPhoneAndLvl(User user, String phone, String lvl) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfPhoneAndNewIds(User user, String phone, String newIds) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfPhoneAndUserIds(User user, String phone, String userIds) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfPhoneAndDesc(User user, String phone, String desc) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfPhoneAndImage(User user, String phone, String image) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfPhoneAndFamous(User user, String phone, String famous) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfPhoneAndBUserIds(User user, String phone, String bUserIds) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfEmailAndMoney(User user, String email, String money) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfEmailAndScore(User user, String email, String score) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfEmailAndPath(User user, String email, String path) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfEmailAndParam(User user, String email, String param) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfEmailAndLvl(User user, String email, String lvl) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfEmailAndNewIds(User user, String email, String newIds) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfEmailAndUserIds(User user, String email, String userIds) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfEmailAndDesc(User user, String email, String desc) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfEmailAndImage(User user, String email, String image) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfEmailAndFamous(User user, String email, String famous) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfEmailAndBUserIds(User user, String email, String bUserIds) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfMoneyAndScore(User user, String money, String score) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfMoneyAndPath(User user, String money, String path) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfMoneyAndParam(User user, String money, String param) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfMoneyAndLvl(User user, String money, String lvl) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfMoneyAndNewIds(User user, String money, String newIds) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfMoneyAndUserIds(User user, String money, String userIds) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfMoneyAndDesc(User user, String money, String desc) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfMoneyAndImage(User user, String money, String image) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfMoneyAndFamous(User user, String money, String famous) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfMoneyAndBUserIds(User user, String money, String bUserIds) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfScoreAndPath(User user, String score, String path) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfScoreAndParam(User user, String score, String param) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfScoreAndLvl(User user, String score, String lvl) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfScoreAndNewIds(User user, String score, String newIds) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfScoreAndUserIds(User user, String score, String userIds) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfScoreAndDesc(User user, String score, String desc) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfScoreAndImage(User user, String score, String image) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfScoreAndFamous(User user, String score, String famous) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfScoreAndBUserIds(User user, String score, String bUserIds) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfPathAndParam(User user, String path, String param) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPathAndLvl(User user, String path, String lvl) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfPathAndNewIds(User user, String path, String newIds) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfPathAndUserIds(User user, String path, String userIds) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfPathAndDesc(User user, String path, String desc) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfPathAndImage(User user, String path, String image) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfPathAndFamous(User user, String path, String famous) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfPathAndBUserIds(User user, String path, String bUserIds) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfParamAndLvl(User user, String param, String lvl) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfParamAndNewIds(User user, String param, String newIds) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfParamAndUserIds(User user, String param, String userIds) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfParamAndDesc(User user, String param, String desc) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfParamAndImage(User user, String param, String image) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfParamAndFamous(User user, String param, String famous) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfParamAndBUserIds(User user, String param, String bUserIds) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfLvlAndNewIds(User user, String lvl, String newIds) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfLvlAndUserIds(User user, String lvl, String userIds) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfLvlAndDesc(User user, String lvl, String desc) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfLvlAndImage(User user, String lvl, String image) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfLvlAndFamous(User user, String lvl, String famous) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfLvlAndBUserIds(User user, String lvl, String bUserIds) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndUserIds(User user, String newIds, String userIds) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndDesc(User user, String newIds, String desc) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndImage(User user, String newIds, String image) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndFamous(User user, String newIds, String famous) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndBUserIds(User user, String newIds, String bUserIds) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfUserIdsAndDesc(User user, String userIds, String desc) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfUserIdsAndImage(User user, String userIds, String image) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfUserIdsAndFamous(User user, String userIds, String famous) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfUserIdsAndBUserIds(User user, String userIds, String bUserIds) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfDescAndImage(User user, String desc, String image) {
        User kUser = new User();
        kUser.setDesc(desc);
        kUser.setImage(image);
        return update(user, kUser);
    }
    public int updateOfDescAndFamous(User user, String desc, String famous) {
        User kUser = new User();
        kUser.setDesc(desc);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfDescAndBUserIds(User user, String desc, String bUserIds) {
        User kUser = new User();
        kUser.setDesc(desc);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfImageAndFamous(User user, String image, String famous) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfImageAndBUserIds(User user, String image, String bUserIds) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfFamousAndBUserIds(User user, String famous, String bUserIds) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int remove(User user) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(user, "newsystem");
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
    public int removeOfName(String name) {
        User user = new User();
        user.setName(name);
        return remove(user);
    }
    public int removeOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfRegisterDate(String registerDate) {
        User user = new User();
        user.setRegisterDate(registerDate);
        return remove(user);
    }
    public int removeOfLoginDate(String loginDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfMoney(String money) {
        User user = new User();
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPath(String path) {
        User user = new User();
        user.setPath(path);
        return remove(user);
    }
    public int removeOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return remove(user);
    }
    public int removeOfLvl(String lvl) {
        User user = new User();
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfNewIds(String newIds) {
        User user = new User();
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfUserIds(String userIds) {
        User user = new User();
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfDesc(String desc) {
        User user = new User();
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfImage(String image) {
        User user = new User();
        user.setImage(image);
        return remove(user);
    }
    public int removeOfFamous(String famous) {
        User user = new User();
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfBUserIds(String bUserIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return remove(user);
    }
    public int removeOfUserIdAndSex(String userId, String sex) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfUserIdAndRegisterDate(String userId, String registerDate) {
        User user = new User();
        user.setUserId(userId);
        user.setRegisterDate(registerDate);
        return remove(user);
    }
    public int removeOfUserIdAndLoginDate(String userId, String loginDate) {
        User user = new User();
        user.setUserId(userId);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfUserIdAndMoney(String userId, String money) {
        User user = new User();
        user.setUserId(userId);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfUserIdAndPath(String userId, String path) {
        User user = new User();
        user.setUserId(userId);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfUserIdAndLvl(String userId, String lvl) {
        User user = new User();
        user.setUserId(userId);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfUserIdAndNewIds(String userId, String newIds) {
        User user = new User();
        user.setUserId(userId);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfUserIdAndUserIds(String userId, String userIds) {
        User user = new User();
        user.setUserId(userId);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfUserIdAndDesc(String userId, String desc) {
        User user = new User();
        user.setUserId(userId);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfUserIdAndImage(String userId, String image) {
        User user = new User();
        user.setUserId(userId);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfUserIdAndFamous(String userId, String famous) {
        User user = new User();
        user.setUserId(userId);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfUserIdAndBUserIds(String userId, String bUserIds) {
        User user = new User();
        user.setUserId(userId);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return remove(user);
    }
    public int removeOfPasswordAndSex(String password, String sex) {
        User user = new User();
        user.setPassword(password);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfPasswordAndRegisterDate(String password, String registerDate) {
        User user = new User();
        user.setPassword(password);
        user.setRegisterDate(registerDate);
        return remove(user);
    }
    public int removeOfPasswordAndLoginDate(String password, String loginDate) {
        User user = new User();
        user.setPassword(password);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfPasswordAndMoney(String password, String money) {
        User user = new User();
        user.setPassword(password);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPasswordAndPath(String password, String path) {
        User user = new User();
        user.setPassword(password);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPasswordAndLvl(String password, String lvl) {
        User user = new User();
        user.setPassword(password);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfPasswordAndNewIds(String password, String newIds) {
        User user = new User();
        user.setPassword(password);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfPasswordAndUserIds(String password, String userIds) {
        User user = new User();
        user.setPassword(password);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfPasswordAndDesc(String password, String desc) {
        User user = new User();
        user.setPassword(password);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfPasswordAndImage(String password, String image) {
        User user = new User();
        user.setPassword(password);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfPasswordAndFamous(String password, String famous) {
        User user = new User();
        user.setPassword(password);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfPasswordAndBUserIds(String password, String bUserIds) {
        User user = new User();
        user.setPassword(password);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfNameAndSex(String name, String sex) {
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfNameAndRegisterDate(String name, String registerDate) {
        User user = new User();
        user.setName(name);
        user.setRegisterDate(registerDate);
        return remove(user);
    }
    public int removeOfNameAndLoginDate(String name, String loginDate) {
        User user = new User();
        user.setName(name);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfNameAndPhone(String name, String phone) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfNameAndEmail(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfNameAndMoney(String name, String money) {
        User user = new User();
        user.setName(name);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfNameAndScore(String name, String score) {
        User user = new User();
        user.setName(name);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfNameAndPath(String name, String path) {
        User user = new User();
        user.setName(name);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfNameAndParam(String name, String param) {
        User user = new User();
        user.setName(name);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfNameAndLvl(String name, String lvl) {
        User user = new User();
        user.setName(name);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfNameAndNewIds(String name, String newIds) {
        User user = new User();
        user.setName(name);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfNameAndUserIds(String name, String userIds) {
        User user = new User();
        user.setName(name);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfNameAndDesc(String name, String desc) {
        User user = new User();
        user.setName(name);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfNameAndImage(String name, String image) {
        User user = new User();
        user.setName(name);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfNameAndFamous(String name, String famous) {
        User user = new User();
        user.setName(name);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfNameAndBUserIds(String name, String bUserIds) {
        User user = new User();
        user.setName(name);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfSexAndRegisterDate(String sex, String registerDate) {
        User user = new User();
        user.setSex(sex);
        user.setRegisterDate(registerDate);
        return remove(user);
    }
    public int removeOfSexAndLoginDate(String sex, String loginDate) {
        User user = new User();
        user.setSex(sex);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfSexAndPhone(String sex, String phone) {
        User user = new User();
        user.setSex(sex);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfSexAndEmail(String sex, String email) {
        User user = new User();
        user.setSex(sex);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfSexAndMoney(String sex, String money) {
        User user = new User();
        user.setSex(sex);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfSexAndScore(String sex, String score) {
        User user = new User();
        user.setSex(sex);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfSexAndPath(String sex, String path) {
        User user = new User();
        user.setSex(sex);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfSexAndLvl(String sex, String lvl) {
        User user = new User();
        user.setSex(sex);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfSexAndNewIds(String sex, String newIds) {
        User user = new User();
        user.setSex(sex);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfSexAndUserIds(String sex, String userIds) {
        User user = new User();
        user.setSex(sex);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfSexAndDesc(String sex, String desc) {
        User user = new User();
        user.setSex(sex);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfSexAndImage(String sex, String image) {
        User user = new User();
        user.setSex(sex);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfSexAndFamous(String sex, String famous) {
        User user = new User();
        user.setSex(sex);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfSexAndBUserIds(String sex, String bUserIds) {
        User user = new User();
        user.setSex(sex);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfRegisterDateAndLoginDate(String registerDate, String loginDate) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfRegisterDateAndPhone(String registerDate, String phone) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfRegisterDateAndEmail(String registerDate, String email) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfRegisterDateAndMoney(String registerDate, String money) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfRegisterDateAndScore(String registerDate, String score) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfRegisterDateAndPath(String registerDate, String path) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfRegisterDateAndParam(String registerDate, String param) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfRegisterDateAndLvl(String registerDate, String lvl) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfRegisterDateAndNewIds(String registerDate, String newIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfRegisterDateAndUserIds(String registerDate, String userIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfRegisterDateAndDesc(String registerDate, String desc) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfRegisterDateAndImage(String registerDate, String image) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfRegisterDateAndFamous(String registerDate, String famous) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfRegisterDateAndBUserIds(String registerDate, String bUserIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfLoginDateAndPhone(String loginDate, String phone) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfLoginDateAndEmail(String loginDate, String email) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfLoginDateAndMoney(String loginDate, String money) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfLoginDateAndScore(String loginDate, String score) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfLoginDateAndPath(String loginDate, String path) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfLoginDateAndParam(String loginDate, String param) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfLoginDateAndLvl(String loginDate, String lvl) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfLoginDateAndNewIds(String loginDate, String newIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfLoginDateAndUserIds(String loginDate, String userIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfLoginDateAndDesc(String loginDate, String desc) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfLoginDateAndImage(String loginDate, String image) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfLoginDateAndFamous(String loginDate, String famous) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfPhoneAndEmail(String phone, String email) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfPhoneAndMoney(String phone, String money) {
        User user = new User();
        user.setPhone(phone);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfPhoneAndScore(String phone, String score) {
        User user = new User();
        user.setPhone(phone);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfPhoneAndPath(String phone, String path) {
        User user = new User();
        user.setPhone(phone);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPhoneAndLvl(String phone, String lvl) {
        User user = new User();
        user.setPhone(phone);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfPhoneAndNewIds(String phone, String newIds) {
        User user = new User();
        user.setPhone(phone);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfPhoneAndUserIds(String phone, String userIds) {
        User user = new User();
        user.setPhone(phone);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfPhoneAndDesc(String phone, String desc) {
        User user = new User();
        user.setPhone(phone);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfPhoneAndImage(String phone, String image) {
        User user = new User();
        user.setPhone(phone);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfPhoneAndFamous(String phone, String famous) {
        User user = new User();
        user.setPhone(phone);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfPhoneAndBUserIds(String phone, String bUserIds) {
        User user = new User();
        user.setPhone(phone);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfEmailAndMoney(String email, String money) {
        User user = new User();
        user.setEmail(email);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfEmailAndScore(String email, String score) {
        User user = new User();
        user.setEmail(email);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfEmailAndPath(String email, String path) {
        User user = new User();
        user.setEmail(email);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfEmailAndParam(String email, String param) {
        User user = new User();
        user.setEmail(email);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfEmailAndLvl(String email, String lvl) {
        User user = new User();
        user.setEmail(email);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfEmailAndNewIds(String email, String newIds) {
        User user = new User();
        user.setEmail(email);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfEmailAndUserIds(String email, String userIds) {
        User user = new User();
        user.setEmail(email);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfEmailAndDesc(String email, String desc) {
        User user = new User();
        user.setEmail(email);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfEmailAndImage(String email, String image) {
        User user = new User();
        user.setEmail(email);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfEmailAndFamous(String email, String famous) {
        User user = new User();
        user.setEmail(email);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfEmailAndBUserIds(String email, String bUserIds) {
        User user = new User();
        user.setEmail(email);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfMoneyAndScore(String money, String score) {
        User user = new User();
        user.setMoney(money);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfMoneyAndPath(String money, String path) {
        User user = new User();
        user.setMoney(money);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfMoneyAndParam(String money, String param) {
        User user = new User();
        user.setMoney(money);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfMoneyAndLvl(String money, String lvl) {
        User user = new User();
        user.setMoney(money);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfMoneyAndNewIds(String money, String newIds) {
        User user = new User();
        user.setMoney(money);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfMoneyAndUserIds(String money, String userIds) {
        User user = new User();
        user.setMoney(money);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfMoneyAndDesc(String money, String desc) {
        User user = new User();
        user.setMoney(money);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfMoneyAndImage(String money, String image) {
        User user = new User();
        user.setMoney(money);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfMoneyAndFamous(String money, String famous) {
        User user = new User();
        user.setMoney(money);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfMoneyAndBUserIds(String money, String bUserIds) {
        User user = new User();
        user.setMoney(money);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfScoreAndPath(String score, String path) {
        User user = new User();
        user.setScore(score);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfScoreAndLvl(String score, String lvl) {
        User user = new User();
        user.setScore(score);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfScoreAndNewIds(String score, String newIds) {
        User user = new User();
        user.setScore(score);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfScoreAndUserIds(String score, String userIds) {
        User user = new User();
        user.setScore(score);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfScoreAndDesc(String score, String desc) {
        User user = new User();
        user.setScore(score);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfScoreAndImage(String score, String image) {
        User user = new User();
        user.setScore(score);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfScoreAndFamous(String score, String famous) {
        User user = new User();
        user.setScore(score);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfScoreAndBUserIds(String score, String bUserIds) {
        User user = new User();
        user.setScore(score);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfPathAndParam(String path, String param) {
        User user = new User();
        user.setPath(path);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPathAndLvl(String path, String lvl) {
        User user = new User();
        user.setPath(path);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfPathAndNewIds(String path, String newIds) {
        User user = new User();
        user.setPath(path);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfPathAndUserIds(String path, String userIds) {
        User user = new User();
        user.setPath(path);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfPathAndDesc(String path, String desc) {
        User user = new User();
        user.setPath(path);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfPathAndImage(String path, String image) {
        User user = new User();
        user.setPath(path);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfPathAndFamous(String path, String famous) {
        User user = new User();
        user.setPath(path);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfPathAndBUserIds(String path, String bUserIds) {
        User user = new User();
        user.setPath(path);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfParamAndLvl(String param, String lvl) {
        User user = new User();
        user.setParam(param);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfParamAndNewIds(String param, String newIds) {
        User user = new User();
        user.setParam(param);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfParamAndUserIds(String param, String userIds) {
        User user = new User();
        user.setParam(param);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfParamAndDesc(String param, String desc) {
        User user = new User();
        user.setParam(param);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfParamAndImage(String param, String image) {
        User user = new User();
        user.setParam(param);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfParamAndFamous(String param, String famous) {
        User user = new User();
        user.setParam(param);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfParamAndBUserIds(String param, String bUserIds) {
        User user = new User();
        user.setParam(param);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfLvlAndNewIds(String lvl, String newIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfLvlAndUserIds(String lvl, String userIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfLvlAndDesc(String lvl, String desc) {
        User user = new User();
        user.setLvl(lvl);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfLvlAndImage(String lvl, String image) {
        User user = new User();
        user.setLvl(lvl);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfLvlAndFamous(String lvl, String famous) {
        User user = new User();
        user.setLvl(lvl);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfLvlAndBUserIds(String lvl, String bUserIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfNewIdsAndUserIds(String newIds, String userIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfNewIdsAndDesc(String newIds, String desc) {
        User user = new User();
        user.setNewIds(newIds);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfNewIdsAndImage(String newIds, String image) {
        User user = new User();
        user.setNewIds(newIds);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfNewIdsAndFamous(String newIds, String famous) {
        User user = new User();
        user.setNewIds(newIds);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfUserIdsAndDesc(String userIds, String desc) {
        User user = new User();
        user.setUserIds(userIds);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfUserIdsAndImage(String userIds, String image) {
        User user = new User();
        user.setUserIds(userIds);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfUserIdsAndFamous(String userIds, String famous) {
        User user = new User();
        user.setUserIds(userIds);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfUserIdsAndBUserIds(String userIds, String bUserIds) {
        User user = new User();
        user.setUserIds(userIds);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfDescAndImage(String desc, String image) {
        User user = new User();
        user.setDesc(desc);
        user.setImage(image);
        return remove(user);
    }
    public int removeOfDescAndFamous(String desc, String famous) {
        User user = new User();
        user.setDesc(desc);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfDescAndBUserIds(String desc, String bUserIds) {
        User user = new User();
        user.setDesc(desc);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfImageAndFamous(String image, String famous) {
        User user = new User();
        user.setImage(image);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfImageAndBUserIds(String image, String bUserIds) {
        User user = new User();
        user.setImage(image);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfFamousAndBUserIds(String famous, String bUserIds) {
        User user = new User();
        user.setFamous(famous);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int insert(User user) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(user, "newsystem");
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
    public int insertOfName(String name) {
        User user = new User();
        user.setName(name);
        return insert(user);
    }
    public int insertOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfRegisterDate(String registerDate) {
        User user = new User();
        user.setRegisterDate(registerDate);
        return insert(user);
    }
    public int insertOfLoginDate(String loginDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfMoney(String money) {
        User user = new User();
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPath(String path) {
        User user = new User();
        user.setPath(path);
        return insert(user);
    }
    public int insertOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return insert(user);
    }
    public int insertOfLvl(String lvl) {
        User user = new User();
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfNewIds(String newIds) {
        User user = new User();
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfUserIds(String userIds) {
        User user = new User();
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfDesc(String desc) {
        User user = new User();
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfImage(String image) {
        User user = new User();
        user.setImage(image);
        return insert(user);
    }
    public int insertOfFamous(String famous) {
        User user = new User();
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfBUserIds(String bUserIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return insert(user);
    }
    public int insertOfUserIdAndSex(String userId, String sex) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfUserIdAndRegisterDate(String userId, String registerDate) {
        User user = new User();
        user.setUserId(userId);
        user.setRegisterDate(registerDate);
        return insert(user);
    }
    public int insertOfUserIdAndLoginDate(String userId, String loginDate) {
        User user = new User();
        user.setUserId(userId);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfUserIdAndMoney(String userId, String money) {
        User user = new User();
        user.setUserId(userId);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfUserIdAndPath(String userId, String path) {
        User user = new User();
        user.setUserId(userId);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfUserIdAndLvl(String userId, String lvl) {
        User user = new User();
        user.setUserId(userId);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfUserIdAndNewIds(String userId, String newIds) {
        User user = new User();
        user.setUserId(userId);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfUserIdAndUserIds(String userId, String userIds) {
        User user = new User();
        user.setUserId(userId);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfUserIdAndDesc(String userId, String desc) {
        User user = new User();
        user.setUserId(userId);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfUserIdAndImage(String userId, String image) {
        User user = new User();
        user.setUserId(userId);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfUserIdAndFamous(String userId, String famous) {
        User user = new User();
        user.setUserId(userId);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfUserIdAndBUserIds(String userId, String bUserIds) {
        User user = new User();
        user.setUserId(userId);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return insert(user);
    }
    public int insertOfPasswordAndSex(String password, String sex) {
        User user = new User();
        user.setPassword(password);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfPasswordAndRegisterDate(String password, String registerDate) {
        User user = new User();
        user.setPassword(password);
        user.setRegisterDate(registerDate);
        return insert(user);
    }
    public int insertOfPasswordAndLoginDate(String password, String loginDate) {
        User user = new User();
        user.setPassword(password);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfPasswordAndMoney(String password, String money) {
        User user = new User();
        user.setPassword(password);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPasswordAndPath(String password, String path) {
        User user = new User();
        user.setPassword(password);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPasswordAndLvl(String password, String lvl) {
        User user = new User();
        user.setPassword(password);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfPasswordAndNewIds(String password, String newIds) {
        User user = new User();
        user.setPassword(password);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfPasswordAndUserIds(String password, String userIds) {
        User user = new User();
        user.setPassword(password);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfPasswordAndDesc(String password, String desc) {
        User user = new User();
        user.setPassword(password);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfPasswordAndImage(String password, String image) {
        User user = new User();
        user.setPassword(password);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfPasswordAndFamous(String password, String famous) {
        User user = new User();
        user.setPassword(password);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfPasswordAndBUserIds(String password, String bUserIds) {
        User user = new User();
        user.setPassword(password);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfNameAndSex(String name, String sex) {
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfNameAndRegisterDate(String name, String registerDate) {
        User user = new User();
        user.setName(name);
        user.setRegisterDate(registerDate);
        return insert(user);
    }
    public int insertOfNameAndLoginDate(String name, String loginDate) {
        User user = new User();
        user.setName(name);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfNameAndPhone(String name, String phone) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfNameAndEmail(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfNameAndMoney(String name, String money) {
        User user = new User();
        user.setName(name);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfNameAndScore(String name, String score) {
        User user = new User();
        user.setName(name);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfNameAndPath(String name, String path) {
        User user = new User();
        user.setName(name);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfNameAndParam(String name, String param) {
        User user = new User();
        user.setName(name);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfNameAndLvl(String name, String lvl) {
        User user = new User();
        user.setName(name);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfNameAndNewIds(String name, String newIds) {
        User user = new User();
        user.setName(name);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfNameAndUserIds(String name, String userIds) {
        User user = new User();
        user.setName(name);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfNameAndDesc(String name, String desc) {
        User user = new User();
        user.setName(name);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfNameAndImage(String name, String image) {
        User user = new User();
        user.setName(name);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfNameAndFamous(String name, String famous) {
        User user = new User();
        user.setName(name);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfNameAndBUserIds(String name, String bUserIds) {
        User user = new User();
        user.setName(name);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfSexAndRegisterDate(String sex, String registerDate) {
        User user = new User();
        user.setSex(sex);
        user.setRegisterDate(registerDate);
        return insert(user);
    }
    public int insertOfSexAndLoginDate(String sex, String loginDate) {
        User user = new User();
        user.setSex(sex);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfSexAndPhone(String sex, String phone) {
        User user = new User();
        user.setSex(sex);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfSexAndEmail(String sex, String email) {
        User user = new User();
        user.setSex(sex);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfSexAndMoney(String sex, String money) {
        User user = new User();
        user.setSex(sex);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfSexAndScore(String sex, String score) {
        User user = new User();
        user.setSex(sex);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfSexAndPath(String sex, String path) {
        User user = new User();
        user.setSex(sex);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfSexAndLvl(String sex, String lvl) {
        User user = new User();
        user.setSex(sex);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfSexAndNewIds(String sex, String newIds) {
        User user = new User();
        user.setSex(sex);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfSexAndUserIds(String sex, String userIds) {
        User user = new User();
        user.setSex(sex);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfSexAndDesc(String sex, String desc) {
        User user = new User();
        user.setSex(sex);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfSexAndImage(String sex, String image) {
        User user = new User();
        user.setSex(sex);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfSexAndFamous(String sex, String famous) {
        User user = new User();
        user.setSex(sex);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfSexAndBUserIds(String sex, String bUserIds) {
        User user = new User();
        user.setSex(sex);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfRegisterDateAndLoginDate(String registerDate, String loginDate) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfRegisterDateAndPhone(String registerDate, String phone) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfRegisterDateAndEmail(String registerDate, String email) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfRegisterDateAndMoney(String registerDate, String money) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfRegisterDateAndScore(String registerDate, String score) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfRegisterDateAndPath(String registerDate, String path) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfRegisterDateAndParam(String registerDate, String param) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfRegisterDateAndLvl(String registerDate, String lvl) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfRegisterDateAndNewIds(String registerDate, String newIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfRegisterDateAndUserIds(String registerDate, String userIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfRegisterDateAndDesc(String registerDate, String desc) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfRegisterDateAndImage(String registerDate, String image) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfRegisterDateAndFamous(String registerDate, String famous) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfRegisterDateAndBUserIds(String registerDate, String bUserIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfLoginDateAndPhone(String loginDate, String phone) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfLoginDateAndEmail(String loginDate, String email) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfLoginDateAndMoney(String loginDate, String money) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfLoginDateAndScore(String loginDate, String score) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfLoginDateAndPath(String loginDate, String path) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfLoginDateAndParam(String loginDate, String param) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfLoginDateAndLvl(String loginDate, String lvl) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfLoginDateAndNewIds(String loginDate, String newIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfLoginDateAndUserIds(String loginDate, String userIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfLoginDateAndDesc(String loginDate, String desc) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfLoginDateAndImage(String loginDate, String image) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfLoginDateAndFamous(String loginDate, String famous) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfPhoneAndEmail(String phone, String email) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfPhoneAndMoney(String phone, String money) {
        User user = new User();
        user.setPhone(phone);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfPhoneAndScore(String phone, String score) {
        User user = new User();
        user.setPhone(phone);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfPhoneAndPath(String phone, String path) {
        User user = new User();
        user.setPhone(phone);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPhoneAndLvl(String phone, String lvl) {
        User user = new User();
        user.setPhone(phone);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfPhoneAndNewIds(String phone, String newIds) {
        User user = new User();
        user.setPhone(phone);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfPhoneAndUserIds(String phone, String userIds) {
        User user = new User();
        user.setPhone(phone);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfPhoneAndDesc(String phone, String desc) {
        User user = new User();
        user.setPhone(phone);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfPhoneAndImage(String phone, String image) {
        User user = new User();
        user.setPhone(phone);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfPhoneAndFamous(String phone, String famous) {
        User user = new User();
        user.setPhone(phone);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfPhoneAndBUserIds(String phone, String bUserIds) {
        User user = new User();
        user.setPhone(phone);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfEmailAndMoney(String email, String money) {
        User user = new User();
        user.setEmail(email);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfEmailAndScore(String email, String score) {
        User user = new User();
        user.setEmail(email);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfEmailAndPath(String email, String path) {
        User user = new User();
        user.setEmail(email);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfEmailAndParam(String email, String param) {
        User user = new User();
        user.setEmail(email);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfEmailAndLvl(String email, String lvl) {
        User user = new User();
        user.setEmail(email);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfEmailAndNewIds(String email, String newIds) {
        User user = new User();
        user.setEmail(email);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfEmailAndUserIds(String email, String userIds) {
        User user = new User();
        user.setEmail(email);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfEmailAndDesc(String email, String desc) {
        User user = new User();
        user.setEmail(email);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfEmailAndImage(String email, String image) {
        User user = new User();
        user.setEmail(email);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfEmailAndFamous(String email, String famous) {
        User user = new User();
        user.setEmail(email);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfEmailAndBUserIds(String email, String bUserIds) {
        User user = new User();
        user.setEmail(email);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfMoneyAndScore(String money, String score) {
        User user = new User();
        user.setMoney(money);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfMoneyAndPath(String money, String path) {
        User user = new User();
        user.setMoney(money);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfMoneyAndParam(String money, String param) {
        User user = new User();
        user.setMoney(money);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfMoneyAndLvl(String money, String lvl) {
        User user = new User();
        user.setMoney(money);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfMoneyAndNewIds(String money, String newIds) {
        User user = new User();
        user.setMoney(money);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfMoneyAndUserIds(String money, String userIds) {
        User user = new User();
        user.setMoney(money);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfMoneyAndDesc(String money, String desc) {
        User user = new User();
        user.setMoney(money);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfMoneyAndImage(String money, String image) {
        User user = new User();
        user.setMoney(money);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfMoneyAndFamous(String money, String famous) {
        User user = new User();
        user.setMoney(money);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfMoneyAndBUserIds(String money, String bUserIds) {
        User user = new User();
        user.setMoney(money);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfScoreAndPath(String score, String path) {
        User user = new User();
        user.setScore(score);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfScoreAndLvl(String score, String lvl) {
        User user = new User();
        user.setScore(score);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfScoreAndNewIds(String score, String newIds) {
        User user = new User();
        user.setScore(score);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfScoreAndUserIds(String score, String userIds) {
        User user = new User();
        user.setScore(score);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfScoreAndDesc(String score, String desc) {
        User user = new User();
        user.setScore(score);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfScoreAndImage(String score, String image) {
        User user = new User();
        user.setScore(score);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfScoreAndFamous(String score, String famous) {
        User user = new User();
        user.setScore(score);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfScoreAndBUserIds(String score, String bUserIds) {
        User user = new User();
        user.setScore(score);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfPathAndParam(String path, String param) {
        User user = new User();
        user.setPath(path);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPathAndLvl(String path, String lvl) {
        User user = new User();
        user.setPath(path);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfPathAndNewIds(String path, String newIds) {
        User user = new User();
        user.setPath(path);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfPathAndUserIds(String path, String userIds) {
        User user = new User();
        user.setPath(path);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfPathAndDesc(String path, String desc) {
        User user = new User();
        user.setPath(path);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfPathAndImage(String path, String image) {
        User user = new User();
        user.setPath(path);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfPathAndFamous(String path, String famous) {
        User user = new User();
        user.setPath(path);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfPathAndBUserIds(String path, String bUserIds) {
        User user = new User();
        user.setPath(path);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfParamAndLvl(String param, String lvl) {
        User user = new User();
        user.setParam(param);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfParamAndNewIds(String param, String newIds) {
        User user = new User();
        user.setParam(param);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfParamAndUserIds(String param, String userIds) {
        User user = new User();
        user.setParam(param);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfParamAndDesc(String param, String desc) {
        User user = new User();
        user.setParam(param);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfParamAndImage(String param, String image) {
        User user = new User();
        user.setParam(param);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfParamAndFamous(String param, String famous) {
        User user = new User();
        user.setParam(param);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfParamAndBUserIds(String param, String bUserIds) {
        User user = new User();
        user.setParam(param);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfLvlAndNewIds(String lvl, String newIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfLvlAndUserIds(String lvl, String userIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfLvlAndDesc(String lvl, String desc) {
        User user = new User();
        user.setLvl(lvl);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfLvlAndImage(String lvl, String image) {
        User user = new User();
        user.setLvl(lvl);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfLvlAndFamous(String lvl, String famous) {
        User user = new User();
        user.setLvl(lvl);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfLvlAndBUserIds(String lvl, String bUserIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfNewIdsAndUserIds(String newIds, String userIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfNewIdsAndDesc(String newIds, String desc) {
        User user = new User();
        user.setNewIds(newIds);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfNewIdsAndImage(String newIds, String image) {
        User user = new User();
        user.setNewIds(newIds);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfNewIdsAndFamous(String newIds, String famous) {
        User user = new User();
        user.setNewIds(newIds);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfUserIdsAndDesc(String userIds, String desc) {
        User user = new User();
        user.setUserIds(userIds);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfUserIdsAndImage(String userIds, String image) {
        User user = new User();
        user.setUserIds(userIds);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfUserIdsAndFamous(String userIds, String famous) {
        User user = new User();
        user.setUserIds(userIds);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfUserIdsAndBUserIds(String userIds, String bUserIds) {
        User user = new User();
        user.setUserIds(userIds);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfDescAndImage(String desc, String image) {
        User user = new User();
        user.setDesc(desc);
        user.setImage(image);
        return insert(user);
    }
    public int insertOfDescAndFamous(String desc, String famous) {
        User user = new User();
        user.setDesc(desc);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfDescAndBUserIds(String desc, String bUserIds) {
        User user = new User();
        user.setDesc(desc);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfImageAndFamous(String image, String famous) {
        User user = new User();
        user.setImage(image);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfImageAndBUserIds(String image, String bUserIds) {
        User user = new User();
        user.setImage(image);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfFamousAndBUserIds(String famous, String bUserIds) {
        User user = new User();
        user.setFamous(famous);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public User getUser(User user) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(user, "newsystem");
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
    public User getUserOfName(String name) {
        User user = new User();
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfRegisterDate(String registerDate) {
        User user = new User();
        user.setRegisterDate(registerDate);
        return getUser(user);
    }
    public User getUserOfLoginDate(String loginDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfMoney(String money) {
        User user = new User();
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPath(String path) {
        User user = new User();
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfLvl(String lvl) {
        User user = new User();
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfNewIds(String newIds) {
        User user = new User();
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfUserIds(String userIds) {
        User user = new User();
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfDesc(String desc) {
        User user = new User();
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfImage(String image) {
        User user = new User();
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfFamous(String famous) {
        User user = new User();
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfBUserIds(String bUserIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfUserIdAndSex(String userId, String sex) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfUserIdAndRegisterDate(String userId, String registerDate) {
        User user = new User();
        user.setUserId(userId);
        user.setRegisterDate(registerDate);
        return getUser(user);
    }
    public User getUserOfUserIdAndLoginDate(String userId, String loginDate) {
        User user = new User();
        user.setUserId(userId);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfUserIdAndMoney(String userId, String money) {
        User user = new User();
        user.setUserId(userId);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfUserIdAndPath(String userId, String path) {
        User user = new User();
        user.setUserId(userId);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfUserIdAndLvl(String userId, String lvl) {
        User user = new User();
        user.setUserId(userId);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfUserIdAndNewIds(String userId, String newIds) {
        User user = new User();
        user.setUserId(userId);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfUserIdAndUserIds(String userId, String userIds) {
        User user = new User();
        user.setUserId(userId);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfUserIdAndDesc(String userId, String desc) {
        User user = new User();
        user.setUserId(userId);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfUserIdAndImage(String userId, String image) {
        User user = new User();
        user.setUserId(userId);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfUserIdAndFamous(String userId, String famous) {
        User user = new User();
        user.setUserId(userId);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfUserIdAndBUserIds(String userId, String bUserIds) {
        User user = new User();
        user.setUserId(userId);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfPasswordAndSex(String password, String sex) {
        User user = new User();
        user.setPassword(password);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfPasswordAndRegisterDate(String password, String registerDate) {
        User user = new User();
        user.setPassword(password);
        user.setRegisterDate(registerDate);
        return getUser(user);
    }
    public User getUserOfPasswordAndLoginDate(String password, String loginDate) {
        User user = new User();
        user.setPassword(password);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfPasswordAndMoney(String password, String money) {
        User user = new User();
        user.setPassword(password);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPasswordAndPath(String password, String path) {
        User user = new User();
        user.setPassword(password);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPasswordAndLvl(String password, String lvl) {
        User user = new User();
        user.setPassword(password);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfPasswordAndNewIds(String password, String newIds) {
        User user = new User();
        user.setPassword(password);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfPasswordAndUserIds(String password, String userIds) {
        User user = new User();
        user.setPassword(password);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfPasswordAndDesc(String password, String desc) {
        User user = new User();
        user.setPassword(password);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfPasswordAndImage(String password, String image) {
        User user = new User();
        user.setPassword(password);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfPasswordAndFamous(String password, String famous) {
        User user = new User();
        user.setPassword(password);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfPasswordAndBUserIds(String password, String bUserIds) {
        User user = new User();
        user.setPassword(password);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfNameAndSex(String name, String sex) {
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfNameAndRegisterDate(String name, String registerDate) {
        User user = new User();
        user.setName(name);
        user.setRegisterDate(registerDate);
        return getUser(user);
    }
    public User getUserOfNameAndLoginDate(String name, String loginDate) {
        User user = new User();
        user.setName(name);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfNameAndPhone(String name, String phone) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfNameAndEmail(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfNameAndMoney(String name, String money) {
        User user = new User();
        user.setName(name);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfNameAndScore(String name, String score) {
        User user = new User();
        user.setName(name);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfNameAndPath(String name, String path) {
        User user = new User();
        user.setName(name);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfNameAndParam(String name, String param) {
        User user = new User();
        user.setName(name);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfNameAndLvl(String name, String lvl) {
        User user = new User();
        user.setName(name);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfNameAndNewIds(String name, String newIds) {
        User user = new User();
        user.setName(name);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfNameAndUserIds(String name, String userIds) {
        User user = new User();
        user.setName(name);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfNameAndDesc(String name, String desc) {
        User user = new User();
        user.setName(name);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfNameAndImage(String name, String image) {
        User user = new User();
        user.setName(name);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfNameAndFamous(String name, String famous) {
        User user = new User();
        user.setName(name);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfNameAndBUserIds(String name, String bUserIds) {
        User user = new User();
        user.setName(name);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfSexAndRegisterDate(String sex, String registerDate) {
        User user = new User();
        user.setSex(sex);
        user.setRegisterDate(registerDate);
        return getUser(user);
    }
    public User getUserOfSexAndLoginDate(String sex, String loginDate) {
        User user = new User();
        user.setSex(sex);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfSexAndPhone(String sex, String phone) {
        User user = new User();
        user.setSex(sex);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfSexAndEmail(String sex, String email) {
        User user = new User();
        user.setSex(sex);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfSexAndMoney(String sex, String money) {
        User user = new User();
        user.setSex(sex);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfSexAndScore(String sex, String score) {
        User user = new User();
        user.setSex(sex);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfSexAndPath(String sex, String path) {
        User user = new User();
        user.setSex(sex);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfSexAndLvl(String sex, String lvl) {
        User user = new User();
        user.setSex(sex);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfSexAndNewIds(String sex, String newIds) {
        User user = new User();
        user.setSex(sex);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfSexAndUserIds(String sex, String userIds) {
        User user = new User();
        user.setSex(sex);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfSexAndDesc(String sex, String desc) {
        User user = new User();
        user.setSex(sex);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfSexAndImage(String sex, String image) {
        User user = new User();
        user.setSex(sex);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfSexAndFamous(String sex, String famous) {
        User user = new User();
        user.setSex(sex);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfSexAndBUserIds(String sex, String bUserIds) {
        User user = new User();
        user.setSex(sex);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndLoginDate(String registerDate, String loginDate) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndPhone(String registerDate, String phone) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndEmail(String registerDate, String email) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndMoney(String registerDate, String money) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndScore(String registerDate, String score) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndPath(String registerDate, String path) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndParam(String registerDate, String param) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndLvl(String registerDate, String lvl) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndNewIds(String registerDate, String newIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndUserIds(String registerDate, String userIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndDesc(String registerDate, String desc) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndImage(String registerDate, String image) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndFamous(String registerDate, String famous) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfRegisterDateAndBUserIds(String registerDate, String bUserIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfLoginDateAndPhone(String loginDate, String phone) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfLoginDateAndEmail(String loginDate, String email) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfLoginDateAndMoney(String loginDate, String money) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfLoginDateAndScore(String loginDate, String score) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfLoginDateAndPath(String loginDate, String path) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfLoginDateAndParam(String loginDate, String param) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfLoginDateAndLvl(String loginDate, String lvl) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfLoginDateAndNewIds(String loginDate, String newIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfLoginDateAndUserIds(String loginDate, String userIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfLoginDateAndDesc(String loginDate, String desc) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfLoginDateAndImage(String loginDate, String image) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfLoginDateAndFamous(String loginDate, String famous) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfPhoneAndEmail(String phone, String email) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfPhoneAndMoney(String phone, String money) {
        User user = new User();
        user.setPhone(phone);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfPhoneAndScore(String phone, String score) {
        User user = new User();
        user.setPhone(phone);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfPhoneAndPath(String phone, String path) {
        User user = new User();
        user.setPhone(phone);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPhoneAndLvl(String phone, String lvl) {
        User user = new User();
        user.setPhone(phone);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfPhoneAndNewIds(String phone, String newIds) {
        User user = new User();
        user.setPhone(phone);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfPhoneAndUserIds(String phone, String userIds) {
        User user = new User();
        user.setPhone(phone);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfPhoneAndDesc(String phone, String desc) {
        User user = new User();
        user.setPhone(phone);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfPhoneAndImage(String phone, String image) {
        User user = new User();
        user.setPhone(phone);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfPhoneAndFamous(String phone, String famous) {
        User user = new User();
        user.setPhone(phone);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfPhoneAndBUserIds(String phone, String bUserIds) {
        User user = new User();
        user.setPhone(phone);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfEmailAndMoney(String email, String money) {
        User user = new User();
        user.setEmail(email);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfEmailAndScore(String email, String score) {
        User user = new User();
        user.setEmail(email);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfEmailAndPath(String email, String path) {
        User user = new User();
        user.setEmail(email);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfEmailAndParam(String email, String param) {
        User user = new User();
        user.setEmail(email);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfEmailAndLvl(String email, String lvl) {
        User user = new User();
        user.setEmail(email);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfEmailAndNewIds(String email, String newIds) {
        User user = new User();
        user.setEmail(email);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfEmailAndUserIds(String email, String userIds) {
        User user = new User();
        user.setEmail(email);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfEmailAndDesc(String email, String desc) {
        User user = new User();
        user.setEmail(email);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfEmailAndImage(String email, String image) {
        User user = new User();
        user.setEmail(email);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfEmailAndFamous(String email, String famous) {
        User user = new User();
        user.setEmail(email);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfEmailAndBUserIds(String email, String bUserIds) {
        User user = new User();
        user.setEmail(email);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfMoneyAndScore(String money, String score) {
        User user = new User();
        user.setMoney(money);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfMoneyAndPath(String money, String path) {
        User user = new User();
        user.setMoney(money);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfMoneyAndParam(String money, String param) {
        User user = new User();
        user.setMoney(money);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfMoneyAndLvl(String money, String lvl) {
        User user = new User();
        user.setMoney(money);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfMoneyAndNewIds(String money, String newIds) {
        User user = new User();
        user.setMoney(money);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfMoneyAndUserIds(String money, String userIds) {
        User user = new User();
        user.setMoney(money);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfMoneyAndDesc(String money, String desc) {
        User user = new User();
        user.setMoney(money);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfMoneyAndImage(String money, String image) {
        User user = new User();
        user.setMoney(money);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfMoneyAndFamous(String money, String famous) {
        User user = new User();
        user.setMoney(money);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfMoneyAndBUserIds(String money, String bUserIds) {
        User user = new User();
        user.setMoney(money);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfScoreAndPath(String score, String path) {
        User user = new User();
        user.setScore(score);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfScoreAndLvl(String score, String lvl) {
        User user = new User();
        user.setScore(score);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfScoreAndNewIds(String score, String newIds) {
        User user = new User();
        user.setScore(score);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfScoreAndUserIds(String score, String userIds) {
        User user = new User();
        user.setScore(score);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfScoreAndDesc(String score, String desc) {
        User user = new User();
        user.setScore(score);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfScoreAndImage(String score, String image) {
        User user = new User();
        user.setScore(score);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfScoreAndFamous(String score, String famous) {
        User user = new User();
        user.setScore(score);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfScoreAndBUserIds(String score, String bUserIds) {
        User user = new User();
        user.setScore(score);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfPathAndParam(String path, String param) {
        User user = new User();
        user.setPath(path);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPathAndLvl(String path, String lvl) {
        User user = new User();
        user.setPath(path);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfPathAndNewIds(String path, String newIds) {
        User user = new User();
        user.setPath(path);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfPathAndUserIds(String path, String userIds) {
        User user = new User();
        user.setPath(path);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfPathAndDesc(String path, String desc) {
        User user = new User();
        user.setPath(path);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfPathAndImage(String path, String image) {
        User user = new User();
        user.setPath(path);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfPathAndFamous(String path, String famous) {
        User user = new User();
        user.setPath(path);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfPathAndBUserIds(String path, String bUserIds) {
        User user = new User();
        user.setPath(path);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfParamAndLvl(String param, String lvl) {
        User user = new User();
        user.setParam(param);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfParamAndNewIds(String param, String newIds) {
        User user = new User();
        user.setParam(param);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfParamAndUserIds(String param, String userIds) {
        User user = new User();
        user.setParam(param);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfParamAndDesc(String param, String desc) {
        User user = new User();
        user.setParam(param);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfParamAndImage(String param, String image) {
        User user = new User();
        user.setParam(param);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfParamAndFamous(String param, String famous) {
        User user = new User();
        user.setParam(param);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfParamAndBUserIds(String param, String bUserIds) {
        User user = new User();
        user.setParam(param);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfLvlAndNewIds(String lvl, String newIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfLvlAndUserIds(String lvl, String userIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfLvlAndDesc(String lvl, String desc) {
        User user = new User();
        user.setLvl(lvl);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfLvlAndImage(String lvl, String image) {
        User user = new User();
        user.setLvl(lvl);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfLvlAndFamous(String lvl, String famous) {
        User user = new User();
        user.setLvl(lvl);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfLvlAndBUserIds(String lvl, String bUserIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfNewIdsAndUserIds(String newIds, String userIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfNewIdsAndDesc(String newIds, String desc) {
        User user = new User();
        user.setNewIds(newIds);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfNewIdsAndImage(String newIds, String image) {
        User user = new User();
        user.setNewIds(newIds);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfNewIdsAndFamous(String newIds, String famous) {
        User user = new User();
        user.setNewIds(newIds);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfUserIdsAndDesc(String userIds, String desc) {
        User user = new User();
        user.setUserIds(userIds);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfUserIdsAndImage(String userIds, String image) {
        User user = new User();
        user.setUserIds(userIds);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfUserIdsAndFamous(String userIds, String famous) {
        User user = new User();
        user.setUserIds(userIds);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfUserIdsAndBUserIds(String userIds, String bUserIds) {
        User user = new User();
        user.setUserIds(userIds);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfDescAndImage(String desc, String image) {
        User user = new User();
        user.setDesc(desc);
        user.setImage(image);
        return getUser(user);
    }
    public User getUserOfDescAndFamous(String desc, String famous) {
        User user = new User();
        user.setDesc(desc);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfDescAndBUserIds(String desc, String bUserIds) {
        User user = new User();
        user.setDesc(desc);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfImageAndFamous(String image, String famous) {
        User user = new User();
        user.setImage(image);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfImageAndBUserIds(String image, String bUserIds) {
        User user = new User();
        user.setImage(image);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfFamousAndBUserIds(String famous, String bUserIds) {
        User user = new User();
        user.setFamous(famous);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public List<User> getUsers(User user) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(user, "newsystem");
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
    public List<User> getUsersOfName(String name) {
        User user = new User();
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDate(String registerDate) {
        User user = new User();
        user.setRegisterDate(registerDate);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDate(String loginDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfMoney(String money) {
        User user = new User();
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfScore(String score) {
        User user = new User();
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPath(String path) {
        User user = new User();
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfLvl(String lvl) {
        User user = new User();
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIds(String newIds) {
        User user = new User();
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIds(String userIds) {
        User user = new User();
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfDesc(String desc) {
        User user = new User();
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfImage(String image) {
        User user = new User();
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfFamous(String famous) {
        User user = new User();
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIds(String bUserIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndSex(String userId, String sex) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndRegisterDate(String userId, String registerDate) {
        User user = new User();
        user.setUserId(userId);
        user.setRegisterDate(registerDate);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndLoginDate(String userId, String loginDate) {
        User user = new User();
        user.setUserId(userId);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndMoney(String userId, String money) {
        User user = new User();
        user.setUserId(userId);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndScore(String userId, String score) {
        User user = new User();
        user.setUserId(userId);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPath(String userId, String path) {
        User user = new User();
        user.setUserId(userId);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndLvl(String userId, String lvl) {
        User user = new User();
        user.setUserId(userId);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndNewIds(String userId, String newIds) {
        User user = new User();
        user.setUserId(userId);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndUserIds(String userId, String userIds) {
        User user = new User();
        user.setUserId(userId);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndDesc(String userId, String desc) {
        User user = new User();
        user.setUserId(userId);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndImage(String userId, String image) {
        User user = new User();
        user.setUserId(userId);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndFamous(String userId, String famous) {
        User user = new User();
        user.setUserId(userId);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndBUserIds(String userId, String bUserIds) {
        User user = new User();
        user.setUserId(userId);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndSex(String password, String sex) {
        User user = new User();
        user.setPassword(password);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndRegisterDate(String password, String registerDate) {
        User user = new User();
        user.setPassword(password);
        user.setRegisterDate(registerDate);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndLoginDate(String password, String loginDate) {
        User user = new User();
        user.setPassword(password);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndMoney(String password, String money) {
        User user = new User();
        user.setPassword(password);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndScore(String password, String score) {
        User user = new User();
        user.setPassword(password);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndPath(String password, String path) {
        User user = new User();
        user.setPassword(password);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndLvl(String password, String lvl) {
        User user = new User();
        user.setPassword(password);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndNewIds(String password, String newIds) {
        User user = new User();
        user.setPassword(password);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndUserIds(String password, String userIds) {
        User user = new User();
        user.setPassword(password);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndDesc(String password, String desc) {
        User user = new User();
        user.setPassword(password);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndImage(String password, String image) {
        User user = new User();
        user.setPassword(password);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndFamous(String password, String famous) {
        User user = new User();
        user.setPassword(password);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndBUserIds(String password, String bUserIds) {
        User user = new User();
        user.setPassword(password);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndSex(String name, String sex) {
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndRegisterDate(String name, String registerDate) {
        User user = new User();
        user.setName(name);
        user.setRegisterDate(registerDate);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndLoginDate(String name, String loginDate) {
        User user = new User();
        user.setName(name);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndPhone(String name, String phone) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndEmail(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndMoney(String name, String money) {
        User user = new User();
        user.setName(name);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndScore(String name, String score) {
        User user = new User();
        user.setName(name);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndPath(String name, String path) {
        User user = new User();
        user.setName(name);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndParam(String name, String param) {
        User user = new User();
        user.setName(name);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndLvl(String name, String lvl) {
        User user = new User();
        user.setName(name);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndNewIds(String name, String newIds) {
        User user = new User();
        user.setName(name);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndUserIds(String name, String userIds) {
        User user = new User();
        user.setName(name);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndDesc(String name, String desc) {
        User user = new User();
        user.setName(name);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndImage(String name, String image) {
        User user = new User();
        user.setName(name);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndFamous(String name, String famous) {
        User user = new User();
        user.setName(name);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndBUserIds(String name, String bUserIds) {
        User user = new User();
        user.setName(name);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndRegisterDate(String sex, String registerDate) {
        User user = new User();
        user.setSex(sex);
        user.setRegisterDate(registerDate);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndLoginDate(String sex, String loginDate) {
        User user = new User();
        user.setSex(sex);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndPhone(String sex, String phone) {
        User user = new User();
        user.setSex(sex);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndEmail(String sex, String email) {
        User user = new User();
        user.setSex(sex);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndMoney(String sex, String money) {
        User user = new User();
        user.setSex(sex);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndScore(String sex, String score) {
        User user = new User();
        user.setSex(sex);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndPath(String sex, String path) {
        User user = new User();
        user.setSex(sex);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndLvl(String sex, String lvl) {
        User user = new User();
        user.setSex(sex);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndNewIds(String sex, String newIds) {
        User user = new User();
        user.setSex(sex);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndUserIds(String sex, String userIds) {
        User user = new User();
        user.setSex(sex);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndDesc(String sex, String desc) {
        User user = new User();
        user.setSex(sex);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndImage(String sex, String image) {
        User user = new User();
        user.setSex(sex);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndFamous(String sex, String famous) {
        User user = new User();
        user.setSex(sex);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndBUserIds(String sex, String bUserIds) {
        User user = new User();
        user.setSex(sex);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndLoginDate(String registerDate, String loginDate) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndPhone(String registerDate, String phone) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndEmail(String registerDate, String email) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndMoney(String registerDate, String money) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndScore(String registerDate, String score) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndPath(String registerDate, String path) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndParam(String registerDate, String param) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndLvl(String registerDate, String lvl) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndNewIds(String registerDate, String newIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndUserIds(String registerDate, String userIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndDesc(String registerDate, String desc) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndImage(String registerDate, String image) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndFamous(String registerDate, String famous) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfRegisterDateAndBUserIds(String registerDate, String bUserIds) {
        User user = new User();
        user.setRegisterDate(registerDate);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndPhone(String loginDate, String phone) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndEmail(String loginDate, String email) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndMoney(String loginDate, String money) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndScore(String loginDate, String score) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndPath(String loginDate, String path) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndParam(String loginDate, String param) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndLvl(String loginDate, String lvl) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndNewIds(String loginDate, String newIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndUserIds(String loginDate, String userIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndDesc(String loginDate, String desc) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndImage(String loginDate, String image) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndFamous(String loginDate, String famous) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndEmail(String phone, String email) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndMoney(String phone, String money) {
        User user = new User();
        user.setPhone(phone);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndScore(String phone, String score) {
        User user = new User();
        user.setPhone(phone);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndPath(String phone, String path) {
        User user = new User();
        user.setPhone(phone);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndLvl(String phone, String lvl) {
        User user = new User();
        user.setPhone(phone);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndNewIds(String phone, String newIds) {
        User user = new User();
        user.setPhone(phone);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndUserIds(String phone, String userIds) {
        User user = new User();
        user.setPhone(phone);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndDesc(String phone, String desc) {
        User user = new User();
        user.setPhone(phone);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndImage(String phone, String image) {
        User user = new User();
        user.setPhone(phone);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndFamous(String phone, String famous) {
        User user = new User();
        user.setPhone(phone);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndBUserIds(String phone, String bUserIds) {
        User user = new User();
        user.setPhone(phone);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndMoney(String email, String money) {
        User user = new User();
        user.setEmail(email);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndScore(String email, String score) {
        User user = new User();
        user.setEmail(email);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndPath(String email, String path) {
        User user = new User();
        user.setEmail(email);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndParam(String email, String param) {
        User user = new User();
        user.setEmail(email);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndLvl(String email, String lvl) {
        User user = new User();
        user.setEmail(email);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndNewIds(String email, String newIds) {
        User user = new User();
        user.setEmail(email);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndUserIds(String email, String userIds) {
        User user = new User();
        user.setEmail(email);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndDesc(String email, String desc) {
        User user = new User();
        user.setEmail(email);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndImage(String email, String image) {
        User user = new User();
        user.setEmail(email);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndFamous(String email, String famous) {
        User user = new User();
        user.setEmail(email);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndBUserIds(String email, String bUserIds) {
        User user = new User();
        user.setEmail(email);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndScore(String money, String score) {
        User user = new User();
        user.setMoney(money);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndPath(String money, String path) {
        User user = new User();
        user.setMoney(money);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndParam(String money, String param) {
        User user = new User();
        user.setMoney(money);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndLvl(String money, String lvl) {
        User user = new User();
        user.setMoney(money);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndNewIds(String money, String newIds) {
        User user = new User();
        user.setMoney(money);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndUserIds(String money, String userIds) {
        User user = new User();
        user.setMoney(money);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndDesc(String money, String desc) {
        User user = new User();
        user.setMoney(money);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndImage(String money, String image) {
        User user = new User();
        user.setMoney(money);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndFamous(String money, String famous) {
        User user = new User();
        user.setMoney(money);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndBUserIds(String money, String bUserIds) {
        User user = new User();
        user.setMoney(money);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndPath(String score, String path) {
        User user = new User();
        user.setScore(score);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndLvl(String score, String lvl) {
        User user = new User();
        user.setScore(score);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndNewIds(String score, String newIds) {
        User user = new User();
        user.setScore(score);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndUserIds(String score, String userIds) {
        User user = new User();
        user.setScore(score);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndDesc(String score, String desc) {
        User user = new User();
        user.setScore(score);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndImage(String score, String image) {
        User user = new User();
        user.setScore(score);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndFamous(String score, String famous) {
        User user = new User();
        user.setScore(score);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndBUserIds(String score, String bUserIds) {
        User user = new User();
        user.setScore(score);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndParam(String path, String param) {
        User user = new User();
        user.setPath(path);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndLvl(String path, String lvl) {
        User user = new User();
        user.setPath(path);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndNewIds(String path, String newIds) {
        User user = new User();
        user.setPath(path);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndUserIds(String path, String userIds) {
        User user = new User();
        user.setPath(path);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndDesc(String path, String desc) {
        User user = new User();
        user.setPath(path);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndImage(String path, String image) {
        User user = new User();
        user.setPath(path);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndFamous(String path, String famous) {
        User user = new User();
        user.setPath(path);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndBUserIds(String path, String bUserIds) {
        User user = new User();
        user.setPath(path);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndLvl(String param, String lvl) {
        User user = new User();
        user.setParam(param);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndNewIds(String param, String newIds) {
        User user = new User();
        user.setParam(param);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndUserIds(String param, String userIds) {
        User user = new User();
        user.setParam(param);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndDesc(String param, String desc) {
        User user = new User();
        user.setParam(param);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndImage(String param, String image) {
        User user = new User();
        user.setParam(param);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndFamous(String param, String famous) {
        User user = new User();
        user.setParam(param);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndBUserIds(String param, String bUserIds) {
        User user = new User();
        user.setParam(param);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndNewIds(String lvl, String newIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndUserIds(String lvl, String userIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndDesc(String lvl, String desc) {
        User user = new User();
        user.setLvl(lvl);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndImage(String lvl, String image) {
        User user = new User();
        user.setLvl(lvl);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndFamous(String lvl, String famous) {
        User user = new User();
        user.setLvl(lvl);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndBUserIds(String lvl, String bUserIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndUserIds(String newIds, String userIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndDesc(String newIds, String desc) {
        User user = new User();
        user.setNewIds(newIds);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndImage(String newIds, String image) {
        User user = new User();
        user.setNewIds(newIds);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndFamous(String newIds, String famous) {
        User user = new User();
        user.setNewIds(newIds);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdsAndDesc(String userIds, String desc) {
        User user = new User();
        user.setUserIds(userIds);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdsAndImage(String userIds, String image) {
        User user = new User();
        user.setUserIds(userIds);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdsAndFamous(String userIds, String famous) {
        User user = new User();
        user.setUserIds(userIds);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdsAndBUserIds(String userIds, String bUserIds) {
        User user = new User();
        user.setUserIds(userIds);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfDescAndImage(String desc, String image) {
        User user = new User();
        user.setDesc(desc);
        user.setImage(image);
        return getUsers(user);
    }
    public List<User> getUsersOfDescAndFamous(String desc, String famous) {
        User user = new User();
        user.setDesc(desc);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfDescAndBUserIds(String desc, String bUserIds) {
        User user = new User();
        user.setDesc(desc);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndFamous(String image, String famous) {
        User user = new User();
        user.setImage(image);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndBUserIds(String image, String bUserIds) {
        User user = new User();
        user.setImage(image);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndBUserIds(String famous, String bUserIds) {
        User user = new User();
        user.setFamous(famous);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
}