package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.User;

import com.news.linglian.dao.IUserDao;
import db.DBMan;

public class IUserDaoImpl implements IUserDao {
    public int update(User user, User keyUser) {
        return DBMan.getInstance().updateWithoutThrow(user, keyUser, "user");
    }
    public int updateOfImage(User user, String image) {
        User kUser = new User();
        kUser.setImage(image);
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
    public int updateOfFamous(User user, String famous) {
        User kUser = new User();
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfSex(User user, String sex) {
        User kUser = new User();
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfLoginDate(User user, String loginDate) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfUserId(User user, String userId) {
        User kUser = new User();
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfBUserIds(User user, String bUserIds) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
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
    public int updateOfPassword(User user, String password) {
        User kUser = new User();
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfMoney(User user, String money) {
        User kUser = new User();
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfPhone(User user, String phone) {
        User kUser = new User();
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfParam(User user, String param) {
        User kUser = new User();
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfUserIds(User user, String userIds) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfName(User user, String name) {
        User kUser = new User();
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfResgisterDate(User user, String resgisterDate) {
        User kUser = new User();
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfEmail(User user, String email) {
        User kUser = new User();
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfDesc(User user, String desc) {
        User kUser = new User();
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfImageAndLvl(User user, String image, String lvl) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setLvl(lvl);
        return update(user, kUser);
    }
    public int updateOfImageAndNewIds(User user, String image, String newIds) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfImageAndFamous(User user, String image, String famous) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfImageAndSex(User user, String image, String sex) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfImageAndLoginDate(User user, String image, String loginDate) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfImageAndUserId(User user, String image, String userId) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfImageAndBUserIds(User user, String image, String bUserIds) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfImageAndScore(User user, String image, String score) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfImageAndPath(User user, String image, String path) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfImageAndPassword(User user, String image, String password) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfImageAndMoney(User user, String image, String money) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfImageAndPhone(User user, String image, String phone) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfImageAndParam(User user, String image, String param) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfImageAndUserIds(User user, String image, String userIds) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfImageAndName(User user, String image, String name) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfImageAndResgisterDate(User user, String image, String resgisterDate) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfImageAndEmail(User user, String image, String email) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfImageAndDesc(User user, String image, String desc) {
        User kUser = new User();
        kUser.setImage(image);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfLvlAndNewIds(User user, String lvl, String newIds) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setNewIds(newIds);
        return update(user, kUser);
    }
    public int updateOfLvlAndFamous(User user, String lvl, String famous) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfLvlAndSex(User user, String lvl, String sex) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfLvlAndLoginDate(User user, String lvl, String loginDate) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfLvlAndUserId(User user, String lvl, String userId) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfLvlAndBUserIds(User user, String lvl, String bUserIds) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfLvlAndScore(User user, String lvl, String score) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfLvlAndPath(User user, String lvl, String path) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfLvlAndPassword(User user, String lvl, String password) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfLvlAndMoney(User user, String lvl, String money) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfLvlAndPhone(User user, String lvl, String phone) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfLvlAndParam(User user, String lvl, String param) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfLvlAndUserIds(User user, String lvl, String userIds) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfLvlAndName(User user, String lvl, String name) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfLvlAndResgisterDate(User user, String lvl, String resgisterDate) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfLvlAndEmail(User user, String lvl, String email) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfLvlAndDesc(User user, String lvl, String desc) {
        User kUser = new User();
        kUser.setLvl(lvl);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndFamous(User user, String newIds, String famous) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setFamous(famous);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndSex(User user, String newIds, String sex) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndLoginDate(User user, String newIds, String loginDate) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndUserId(User user, String newIds, String userId) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndBUserIds(User user, String newIds, String bUserIds) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndScore(User user, String newIds, String score) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndPath(User user, String newIds, String path) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndPassword(User user, String newIds, String password) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndMoney(User user, String newIds, String money) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndPhone(User user, String newIds, String phone) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndParam(User user, String newIds, String param) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndUserIds(User user, String newIds, String userIds) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndName(User user, String newIds, String name) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndResgisterDate(User user, String newIds, String resgisterDate) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndEmail(User user, String newIds, String email) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfNewIdsAndDesc(User user, String newIds, String desc) {
        User kUser = new User();
        kUser.setNewIds(newIds);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfFamousAndSex(User user, String famous, String sex) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setSex(sex);
        return update(user, kUser);
    }
    public int updateOfFamousAndLoginDate(User user, String famous, String loginDate) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfFamousAndUserId(User user, String famous, String userId) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfFamousAndBUserIds(User user, String famous, String bUserIds) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setBUserIds(bUserIds);
        return update(user, kUser);
    }
    public int updateOfFamousAndScore(User user, String famous, String score) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfFamousAndPath(User user, String famous, String path) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfFamousAndPassword(User user, String famous, String password) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfFamousAndMoney(User user, String famous, String money) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfFamousAndPhone(User user, String famous, String phone) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfFamousAndParam(User user, String famous, String param) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfFamousAndUserIds(User user, String famous, String userIds) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfFamousAndName(User user, String famous, String name) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfFamousAndResgisterDate(User user, String famous, String resgisterDate) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfFamousAndEmail(User user, String famous, String email) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfFamousAndDesc(User user, String famous, String desc) {
        User kUser = new User();
        kUser.setFamous(famous);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfSexAndLoginDate(User user, String sex, String loginDate) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setLoginDate(loginDate);
        return update(user, kUser);
    }
    public int updateOfSexAndUserId(User user, String sex, String userId) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfSexAndBUserIds(User user, String sex, String bUserIds) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setBUserIds(bUserIds);
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
    public int updateOfSexAndPassword(User user, String sex, String password) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfSexAndMoney(User user, String sex, String money) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfSexAndPhone(User user, String sex, String phone) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfSexAndParam(User user, String sex, String param) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfSexAndUserIds(User user, String sex, String userIds) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfSexAndName(User user, String sex, String name) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfSexAndResgisterDate(User user, String sex, String resgisterDate) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfSexAndEmail(User user, String sex, String email) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfSexAndDesc(User user, String sex, String desc) {
        User kUser = new User();
        kUser.setSex(sex);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndUserId(User user, String loginDate, String userId) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setUserId(userId);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndBUserIds(User user, String loginDate, String bUserIds) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setBUserIds(bUserIds);
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
    public int updateOfLoginDateAndPassword(User user, String loginDate, String password) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndMoney(User user, String loginDate, String money) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndPhone(User user, String loginDate, String phone) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndParam(User user, String loginDate, String param) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndUserIds(User user, String loginDate, String userIds) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndName(User user, String loginDate, String name) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndResgisterDate(User user, String loginDate, String resgisterDate) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndEmail(User user, String loginDate, String email) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfLoginDateAndDesc(User user, String loginDate, String desc) {
        User kUser = new User();
        kUser.setLoginDate(loginDate);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfUserIdAndBUserIds(User user, String userId, String bUserIds) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setBUserIds(bUserIds);
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
    public int updateOfUserIdAndPassword(User user, String userId, String password) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfUserIdAndMoney(User user, String userId, String money) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfUserIdAndPhone(User user, String userId, String phone) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfUserIdAndParam(User user, String userId, String param) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfUserIdAndUserIds(User user, String userId, String userIds) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfUserIdAndName(User user, String userId, String name) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfUserIdAndResgisterDate(User user, String userId, String resgisterDate) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfUserIdAndEmail(User user, String userId, String email) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfUserIdAndDesc(User user, String userId, String desc) {
        User kUser = new User();
        kUser.setUserId(userId);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndScore(User user, String bUserIds, String score) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setScore(score);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndPath(User user, String bUserIds, String path) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndPassword(User user, String bUserIds, String password) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndMoney(User user, String bUserIds, String money) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndPhone(User user, String bUserIds, String phone) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndParam(User user, String bUserIds, String param) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndUserIds(User user, String bUserIds, String userIds) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndName(User user, String bUserIds, String name) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndResgisterDate(User user, String bUserIds, String resgisterDate) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndEmail(User user, String bUserIds, String email) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfBUserIdsAndDesc(User user, String bUserIds, String desc) {
        User kUser = new User();
        kUser.setBUserIds(bUserIds);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfScoreAndPath(User user, String score, String path) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setPath(path);
        return update(user, kUser);
    }
    public int updateOfScoreAndPassword(User user, String score, String password) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfScoreAndMoney(User user, String score, String money) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfScoreAndPhone(User user, String score, String phone) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfScoreAndParam(User user, String score, String param) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfScoreAndUserIds(User user, String score, String userIds) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfScoreAndName(User user, String score, String name) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfScoreAndResgisterDate(User user, String score, String resgisterDate) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfScoreAndEmail(User user, String score, String email) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfScoreAndDesc(User user, String score, String desc) {
        User kUser = new User();
        kUser.setScore(score);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfPathAndPassword(User user, String path, String password) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setPassword(password);
        return update(user, kUser);
    }
    public int updateOfPathAndMoney(User user, String path, String money) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfPathAndPhone(User user, String path, String phone) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfPathAndParam(User user, String path, String param) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPathAndUserIds(User user, String path, String userIds) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfPathAndName(User user, String path, String name) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfPathAndResgisterDate(User user, String path, String resgisterDate) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfPathAndEmail(User user, String path, String email) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfPathAndDesc(User user, String path, String desc) {
        User kUser = new User();
        kUser.setPath(path);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfPasswordAndMoney(User user, String password, String money) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setMoney(money);
        return update(user, kUser);
    }
    public int updateOfPasswordAndPhone(User user, String password, String phone) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfPasswordAndParam(User user, String password, String param) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPasswordAndUserIds(User user, String password, String userIds) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfPasswordAndName(User user, String password, String name) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfPasswordAndResgisterDate(User user, String password, String resgisterDate) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfPasswordAndEmail(User user, String password, String email) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfPasswordAndDesc(User user, String password, String desc) {
        User kUser = new User();
        kUser.setPassword(password);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfMoneyAndPhone(User user, String money, String phone) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setPhone(phone);
        return update(user, kUser);
    }
    public int updateOfMoneyAndParam(User user, String money, String param) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfMoneyAndUserIds(User user, String money, String userIds) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfMoneyAndName(User user, String money, String name) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfMoneyAndResgisterDate(User user, String money, String resgisterDate) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfMoneyAndEmail(User user, String money, String email) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfMoneyAndDesc(User user, String money, String desc) {
        User kUser = new User();
        kUser.setMoney(money);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfPhoneAndParam(User user, String phone, String param) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setParam(param);
        return update(user, kUser);
    }
    public int updateOfPhoneAndUserIds(User user, String phone, String userIds) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfPhoneAndName(User user, String phone, String name) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfPhoneAndResgisterDate(User user, String phone, String resgisterDate) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfPhoneAndEmail(User user, String phone, String email) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfPhoneAndDesc(User user, String phone, String desc) {
        User kUser = new User();
        kUser.setPhone(phone);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfParamAndUserIds(User user, String param, String userIds) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setUserIds(userIds);
        return update(user, kUser);
    }
    public int updateOfParamAndName(User user, String param, String name) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfParamAndResgisterDate(User user, String param, String resgisterDate) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfParamAndEmail(User user, String param, String email) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfParamAndDesc(User user, String param, String desc) {
        User kUser = new User();
        kUser.setParam(param);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfUserIdsAndName(User user, String userIds, String name) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        kUser.setName(name);
        return update(user, kUser);
    }
    public int updateOfUserIdsAndResgisterDate(User user, String userIds, String resgisterDate) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfUserIdsAndEmail(User user, String userIds, String email) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfUserIdsAndDesc(User user, String userIds, String desc) {
        User kUser = new User();
        kUser.setUserIds(userIds);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfNameAndResgisterDate(User user, String name, String resgisterDate) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setResgisterDate(resgisterDate);
        return update(user, kUser);
    }
    public int updateOfNameAndEmail(User user, String name, String email) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfNameAndDesc(User user, String name, String desc) {
        User kUser = new User();
        kUser.setName(name);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfResgisterDateAndEmail(User user, String resgisterDate, String email) {
        User kUser = new User();
        kUser.setResgisterDate(resgisterDate);
        kUser.setEmail(email);
        return update(user, kUser);
    }
    public int updateOfResgisterDateAndDesc(User user, String resgisterDate, String desc) {
        User kUser = new User();
        kUser.setResgisterDate(resgisterDate);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int updateOfEmailAndDesc(User user, String email, String desc) {
        User kUser = new User();
        kUser.setEmail(email);
        kUser.setDesc(desc);
        return update(user, kUser);
    }
    public int remove(User user) {
        return DBMan.getInstance().deleteWithoutThrow(user, "user");
    }
    public int removeOfImage(String image) {
        User user = new User();
        user.setImage(image);
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
    public int removeOfFamous(String famous) {
        User user = new User();
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfLoginDate(String loginDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfBUserIds(String bUserIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
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
    public int removeOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfMoney(String money) {
        User user = new User();
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return remove(user);
    }
    public int removeOfUserIds(String userIds) {
        User user = new User();
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfName(String name) {
        User user = new User();
        user.setName(name);
        return remove(user);
    }
    public int removeOfResgisterDate(String resgisterDate) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfDesc(String desc) {
        User user = new User();
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfImageAndLvl(String image, String lvl) {
        User user = new User();
        user.setImage(image);
        user.setLvl(lvl);
        return remove(user);
    }
    public int removeOfImageAndNewIds(String image, String newIds) {
        User user = new User();
        user.setImage(image);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfImageAndFamous(String image, String famous) {
        User user = new User();
        user.setImage(image);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfImageAndSex(String image, String sex) {
        User user = new User();
        user.setImage(image);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfImageAndLoginDate(String image, String loginDate) {
        User user = new User();
        user.setImage(image);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfImageAndUserId(String image, String userId) {
        User user = new User();
        user.setImage(image);
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfImageAndBUserIds(String image, String bUserIds) {
        User user = new User();
        user.setImage(image);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfImageAndScore(String image, String score) {
        User user = new User();
        user.setImage(image);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfImageAndPath(String image, String path) {
        User user = new User();
        user.setImage(image);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfImageAndPassword(String image, String password) {
        User user = new User();
        user.setImage(image);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfImageAndMoney(String image, String money) {
        User user = new User();
        user.setImage(image);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfImageAndPhone(String image, String phone) {
        User user = new User();
        user.setImage(image);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfImageAndParam(String image, String param) {
        User user = new User();
        user.setImage(image);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfImageAndUserIds(String image, String userIds) {
        User user = new User();
        user.setImage(image);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfImageAndName(String image, String name) {
        User user = new User();
        user.setImage(image);
        user.setName(name);
        return remove(user);
    }
    public int removeOfImageAndResgisterDate(String image, String resgisterDate) {
        User user = new User();
        user.setImage(image);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfImageAndEmail(String image, String email) {
        User user = new User();
        user.setImage(image);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfImageAndDesc(String image, String desc) {
        User user = new User();
        user.setImage(image);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfLvlAndNewIds(String lvl, String newIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setNewIds(newIds);
        return remove(user);
    }
    public int removeOfLvlAndFamous(String lvl, String famous) {
        User user = new User();
        user.setLvl(lvl);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfLvlAndSex(String lvl, String sex) {
        User user = new User();
        user.setLvl(lvl);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfLvlAndLoginDate(String lvl, String loginDate) {
        User user = new User();
        user.setLvl(lvl);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfLvlAndUserId(String lvl, String userId) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfLvlAndBUserIds(String lvl, String bUserIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfLvlAndScore(String lvl, String score) {
        User user = new User();
        user.setLvl(lvl);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfLvlAndPath(String lvl, String path) {
        User user = new User();
        user.setLvl(lvl);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfLvlAndPassword(String lvl, String password) {
        User user = new User();
        user.setLvl(lvl);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfLvlAndMoney(String lvl, String money) {
        User user = new User();
        user.setLvl(lvl);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfLvlAndPhone(String lvl, String phone) {
        User user = new User();
        user.setLvl(lvl);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfLvlAndParam(String lvl, String param) {
        User user = new User();
        user.setLvl(lvl);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfLvlAndUserIds(String lvl, String userIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfLvlAndName(String lvl, String name) {
        User user = new User();
        user.setLvl(lvl);
        user.setName(name);
        return remove(user);
    }
    public int removeOfLvlAndResgisterDate(String lvl, String resgisterDate) {
        User user = new User();
        user.setLvl(lvl);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfLvlAndEmail(String lvl, String email) {
        User user = new User();
        user.setLvl(lvl);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfLvlAndDesc(String lvl, String desc) {
        User user = new User();
        user.setLvl(lvl);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfNewIdsAndFamous(String newIds, String famous) {
        User user = new User();
        user.setNewIds(newIds);
        user.setFamous(famous);
        return remove(user);
    }
    public int removeOfNewIdsAndSex(String newIds, String sex) {
        User user = new User();
        user.setNewIds(newIds);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfNewIdsAndLoginDate(String newIds, String loginDate) {
        User user = new User();
        user.setNewIds(newIds);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfNewIdsAndUserId(String newIds, String userId) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfNewIdsAndScore(String newIds, String score) {
        User user = new User();
        user.setNewIds(newIds);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfNewIdsAndPath(String newIds, String path) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfNewIdsAndPassword(String newIds, String password) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfNewIdsAndMoney(String newIds, String money) {
        User user = new User();
        user.setNewIds(newIds);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfNewIdsAndPhone(String newIds, String phone) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfNewIdsAndParam(String newIds, String param) {
        User user = new User();
        user.setNewIds(newIds);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfNewIdsAndUserIds(String newIds, String userIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfNewIdsAndName(String newIds, String name) {
        User user = new User();
        user.setNewIds(newIds);
        user.setName(name);
        return remove(user);
    }
    public int removeOfNewIdsAndResgisterDate(String newIds, String resgisterDate) {
        User user = new User();
        user.setNewIds(newIds);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfNewIdsAndEmail(String newIds, String email) {
        User user = new User();
        user.setNewIds(newIds);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfNewIdsAndDesc(String newIds, String desc) {
        User user = new User();
        user.setNewIds(newIds);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfFamousAndSex(String famous, String sex) {
        User user = new User();
        user.setFamous(famous);
        user.setSex(sex);
        return remove(user);
    }
    public int removeOfFamousAndLoginDate(String famous, String loginDate) {
        User user = new User();
        user.setFamous(famous);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfFamousAndUserId(String famous, String userId) {
        User user = new User();
        user.setFamous(famous);
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfFamousAndBUserIds(String famous, String bUserIds) {
        User user = new User();
        user.setFamous(famous);
        user.setBUserIds(bUserIds);
        return remove(user);
    }
    public int removeOfFamousAndScore(String famous, String score) {
        User user = new User();
        user.setFamous(famous);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfFamousAndPath(String famous, String path) {
        User user = new User();
        user.setFamous(famous);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfFamousAndPassword(String famous, String password) {
        User user = new User();
        user.setFamous(famous);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfFamousAndMoney(String famous, String money) {
        User user = new User();
        user.setFamous(famous);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfFamousAndPhone(String famous, String phone) {
        User user = new User();
        user.setFamous(famous);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfFamousAndParam(String famous, String param) {
        User user = new User();
        user.setFamous(famous);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfFamousAndUserIds(String famous, String userIds) {
        User user = new User();
        user.setFamous(famous);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfFamousAndName(String famous, String name) {
        User user = new User();
        user.setFamous(famous);
        user.setName(name);
        return remove(user);
    }
    public int removeOfFamousAndResgisterDate(String famous, String resgisterDate) {
        User user = new User();
        user.setFamous(famous);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfFamousAndEmail(String famous, String email) {
        User user = new User();
        user.setFamous(famous);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfFamousAndDesc(String famous, String desc) {
        User user = new User();
        user.setFamous(famous);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfSexAndLoginDate(String sex, String loginDate) {
        User user = new User();
        user.setSex(sex);
        user.setLoginDate(loginDate);
        return remove(user);
    }
    public int removeOfSexAndUserId(String sex, String userId) {
        User user = new User();
        user.setSex(sex);
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfSexAndBUserIds(String sex, String bUserIds) {
        User user = new User();
        user.setSex(sex);
        user.setBUserIds(bUserIds);
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
    public int removeOfSexAndPassword(String sex, String password) {
        User user = new User();
        user.setSex(sex);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfSexAndMoney(String sex, String money) {
        User user = new User();
        user.setSex(sex);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfSexAndPhone(String sex, String phone) {
        User user = new User();
        user.setSex(sex);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfSexAndUserIds(String sex, String userIds) {
        User user = new User();
        user.setSex(sex);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfSexAndName(String sex, String name) {
        User user = new User();
        user.setSex(sex);
        user.setName(name);
        return remove(user);
    }
    public int removeOfSexAndResgisterDate(String sex, String resgisterDate) {
        User user = new User();
        user.setSex(sex);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfSexAndEmail(String sex, String email) {
        User user = new User();
        user.setSex(sex);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfSexAndDesc(String sex, String desc) {
        User user = new User();
        user.setSex(sex);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfLoginDateAndUserId(String loginDate, String userId) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserId(userId);
        return remove(user);
    }
    public int removeOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setBUserIds(bUserIds);
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
    public int removeOfLoginDateAndPassword(String loginDate, String password) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfLoginDateAndMoney(String loginDate, String money) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfLoginDateAndPhone(String loginDate, String phone) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfLoginDateAndParam(String loginDate, String param) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfLoginDateAndUserIds(String loginDate, String userIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfLoginDateAndName(String loginDate, String name) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setName(name);
        return remove(user);
    }
    public int removeOfLoginDateAndResgisterDate(String loginDate, String resgisterDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfLoginDateAndEmail(String loginDate, String email) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfLoginDateAndDesc(String loginDate, String desc) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfUserIdAndBUserIds(String userId, String bUserIds) {
        User user = new User();
        user.setUserId(userId);
        user.setBUserIds(bUserIds);
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
    public int removeOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfUserIdAndMoney(String userId, String money) {
        User user = new User();
        user.setUserId(userId);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfUserIdAndUserIds(String userId, String userIds) {
        User user = new User();
        user.setUserId(userId);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return remove(user);
    }
    public int removeOfUserIdAndResgisterDate(String userId, String resgisterDate) {
        User user = new User();
        user.setUserId(userId);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfUserIdAndDesc(String userId, String desc) {
        User user = new User();
        user.setUserId(userId);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfBUserIdsAndScore(String bUserIds, String score) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setScore(score);
        return remove(user);
    }
    public int removeOfBUserIdsAndPath(String bUserIds, String path) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfBUserIdsAndPassword(String bUserIds, String password) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfBUserIdsAndMoney(String bUserIds, String money) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfBUserIdsAndPhone(String bUserIds, String phone) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfBUserIdsAndParam(String bUserIds, String param) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfBUserIdsAndUserIds(String bUserIds, String userIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfBUserIdsAndName(String bUserIds, String name) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setName(name);
        return remove(user);
    }
    public int removeOfBUserIdsAndResgisterDate(String bUserIds, String resgisterDate) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfBUserIdsAndEmail(String bUserIds, String email) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfBUserIdsAndDesc(String bUserIds, String desc) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfScoreAndPath(String score, String path) {
        User user = new User();
        user.setScore(score);
        user.setPath(path);
        return remove(user);
    }
    public int removeOfScoreAndPassword(String score, String password) {
        User user = new User();
        user.setScore(score);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfScoreAndMoney(String score, String money) {
        User user = new User();
        user.setScore(score);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfScoreAndPhone(String score, String phone) {
        User user = new User();
        user.setScore(score);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfScoreAndUserIds(String score, String userIds) {
        User user = new User();
        user.setScore(score);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfScoreAndName(String score, String name) {
        User user = new User();
        user.setScore(score);
        user.setName(name);
        return remove(user);
    }
    public int removeOfScoreAndResgisterDate(String score, String resgisterDate) {
        User user = new User();
        user.setScore(score);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfScoreAndEmail(String score, String email) {
        User user = new User();
        user.setScore(score);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfScoreAndDesc(String score, String desc) {
        User user = new User();
        user.setScore(score);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfPathAndPassword(String path, String password) {
        User user = new User();
        user.setPath(path);
        user.setPassword(password);
        return remove(user);
    }
    public int removeOfPathAndMoney(String path, String money) {
        User user = new User();
        user.setPath(path);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfPathAndPhone(String path, String phone) {
        User user = new User();
        user.setPath(path);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfPathAndParam(String path, String param) {
        User user = new User();
        user.setPath(path);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPathAndUserIds(String path, String userIds) {
        User user = new User();
        user.setPath(path);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfPathAndName(String path, String name) {
        User user = new User();
        user.setPath(path);
        user.setName(name);
        return remove(user);
    }
    public int removeOfPathAndResgisterDate(String path, String resgisterDate) {
        User user = new User();
        user.setPath(path);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfPathAndEmail(String path, String email) {
        User user = new User();
        user.setPath(path);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfPathAndDesc(String path, String desc) {
        User user = new User();
        user.setPath(path);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfPasswordAndMoney(String password, String money) {
        User user = new User();
        user.setPassword(password);
        user.setMoney(money);
        return remove(user);
    }
    public int removeOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPasswordAndUserIds(String password, String userIds) {
        User user = new User();
        user.setPassword(password);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return remove(user);
    }
    public int removeOfPasswordAndResgisterDate(String password, String resgisterDate) {
        User user = new User();
        user.setPassword(password);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfPasswordAndDesc(String password, String desc) {
        User user = new User();
        user.setPassword(password);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfMoneyAndPhone(String money, String phone) {
        User user = new User();
        user.setMoney(money);
        user.setPhone(phone);
        return remove(user);
    }
    public int removeOfMoneyAndParam(String money, String param) {
        User user = new User();
        user.setMoney(money);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfMoneyAndUserIds(String money, String userIds) {
        User user = new User();
        user.setMoney(money);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfMoneyAndName(String money, String name) {
        User user = new User();
        user.setMoney(money);
        user.setName(name);
        return remove(user);
    }
    public int removeOfMoneyAndResgisterDate(String money, String resgisterDate) {
        User user = new User();
        user.setMoney(money);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfMoneyAndEmail(String money, String email) {
        User user = new User();
        user.setMoney(money);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfMoneyAndDesc(String money, String desc) {
        User user = new User();
        user.setMoney(money);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return remove(user);
    }
    public int removeOfPhoneAndUserIds(String phone, String userIds) {
        User user = new User();
        user.setPhone(phone);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfPhoneAndName(String phone, String name) {
        User user = new User();
        user.setPhone(phone);
        user.setName(name);
        return remove(user);
    }
    public int removeOfPhoneAndResgisterDate(String phone, String resgisterDate) {
        User user = new User();
        user.setPhone(phone);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfPhoneAndEmail(String phone, String email) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfPhoneAndDesc(String phone, String desc) {
        User user = new User();
        user.setPhone(phone);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfParamAndUserIds(String param, String userIds) {
        User user = new User();
        user.setParam(param);
        user.setUserIds(userIds);
        return remove(user);
    }
    public int removeOfParamAndName(String param, String name) {
        User user = new User();
        user.setParam(param);
        user.setName(name);
        return remove(user);
    }
    public int removeOfParamAndResgisterDate(String param, String resgisterDate) {
        User user = new User();
        user.setParam(param);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfParamAndEmail(String param, String email) {
        User user = new User();
        user.setParam(param);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfParamAndDesc(String param, String desc) {
        User user = new User();
        user.setParam(param);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfUserIdsAndName(String userIds, String name) {
        User user = new User();
        user.setUserIds(userIds);
        user.setName(name);
        return remove(user);
    }
    public int removeOfUserIdsAndResgisterDate(String userIds, String resgisterDate) {
        User user = new User();
        user.setUserIds(userIds);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfUserIdsAndEmail(String userIds, String email) {
        User user = new User();
        user.setUserIds(userIds);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfUserIdsAndDesc(String userIds, String desc) {
        User user = new User();
        user.setUserIds(userIds);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfNameAndResgisterDate(String name, String resgisterDate) {
        User user = new User();
        user.setName(name);
        user.setResgisterDate(resgisterDate);
        return remove(user);
    }
    public int removeOfNameAndEmail(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfNameAndDesc(String name, String desc) {
        User user = new User();
        user.setName(name);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfResgisterDateAndEmail(String resgisterDate, String email) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        user.setEmail(email);
        return remove(user);
    }
    public int removeOfResgisterDateAndDesc(String resgisterDate, String desc) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        user.setDesc(desc);
        return remove(user);
    }
    public int removeOfEmailAndDesc(String email, String desc) {
        User user = new User();
        user.setEmail(email);
        user.setDesc(desc);
        return remove(user);
    }
    public int insert(User user) {
        return DBMan.getInstance().insertWithoutThrow(user, "user");
    }
    public int insertOfImage(String image) {
        User user = new User();
        user.setImage(image);
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
    public int insertOfFamous(String famous) {
        User user = new User();
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfLoginDate(String loginDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfBUserIds(String bUserIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
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
    public int insertOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfMoney(String money) {
        User user = new User();
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return insert(user);
    }
    public int insertOfUserIds(String userIds) {
        User user = new User();
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfName(String name) {
        User user = new User();
        user.setName(name);
        return insert(user);
    }
    public int insertOfResgisterDate(String resgisterDate) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfDesc(String desc) {
        User user = new User();
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfImageAndLvl(String image, String lvl) {
        User user = new User();
        user.setImage(image);
        user.setLvl(lvl);
        return insert(user);
    }
    public int insertOfImageAndNewIds(String image, String newIds) {
        User user = new User();
        user.setImage(image);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfImageAndFamous(String image, String famous) {
        User user = new User();
        user.setImage(image);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfImageAndSex(String image, String sex) {
        User user = new User();
        user.setImage(image);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfImageAndLoginDate(String image, String loginDate) {
        User user = new User();
        user.setImage(image);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfImageAndUserId(String image, String userId) {
        User user = new User();
        user.setImage(image);
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfImageAndBUserIds(String image, String bUserIds) {
        User user = new User();
        user.setImage(image);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfImageAndScore(String image, String score) {
        User user = new User();
        user.setImage(image);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfImageAndPath(String image, String path) {
        User user = new User();
        user.setImage(image);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfImageAndPassword(String image, String password) {
        User user = new User();
        user.setImage(image);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfImageAndMoney(String image, String money) {
        User user = new User();
        user.setImage(image);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfImageAndPhone(String image, String phone) {
        User user = new User();
        user.setImage(image);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfImageAndParam(String image, String param) {
        User user = new User();
        user.setImage(image);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfImageAndUserIds(String image, String userIds) {
        User user = new User();
        user.setImage(image);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfImageAndName(String image, String name) {
        User user = new User();
        user.setImage(image);
        user.setName(name);
        return insert(user);
    }
    public int insertOfImageAndResgisterDate(String image, String resgisterDate) {
        User user = new User();
        user.setImage(image);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfImageAndEmail(String image, String email) {
        User user = new User();
        user.setImage(image);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfImageAndDesc(String image, String desc) {
        User user = new User();
        user.setImage(image);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfLvlAndNewIds(String lvl, String newIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setNewIds(newIds);
        return insert(user);
    }
    public int insertOfLvlAndFamous(String lvl, String famous) {
        User user = new User();
        user.setLvl(lvl);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfLvlAndSex(String lvl, String sex) {
        User user = new User();
        user.setLvl(lvl);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfLvlAndLoginDate(String lvl, String loginDate) {
        User user = new User();
        user.setLvl(lvl);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfLvlAndUserId(String lvl, String userId) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfLvlAndBUserIds(String lvl, String bUserIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfLvlAndScore(String lvl, String score) {
        User user = new User();
        user.setLvl(lvl);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfLvlAndPath(String lvl, String path) {
        User user = new User();
        user.setLvl(lvl);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfLvlAndPassword(String lvl, String password) {
        User user = new User();
        user.setLvl(lvl);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfLvlAndMoney(String lvl, String money) {
        User user = new User();
        user.setLvl(lvl);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfLvlAndPhone(String lvl, String phone) {
        User user = new User();
        user.setLvl(lvl);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfLvlAndParam(String lvl, String param) {
        User user = new User();
        user.setLvl(lvl);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfLvlAndUserIds(String lvl, String userIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfLvlAndName(String lvl, String name) {
        User user = new User();
        user.setLvl(lvl);
        user.setName(name);
        return insert(user);
    }
    public int insertOfLvlAndResgisterDate(String lvl, String resgisterDate) {
        User user = new User();
        user.setLvl(lvl);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfLvlAndEmail(String lvl, String email) {
        User user = new User();
        user.setLvl(lvl);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfLvlAndDesc(String lvl, String desc) {
        User user = new User();
        user.setLvl(lvl);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfNewIdsAndFamous(String newIds, String famous) {
        User user = new User();
        user.setNewIds(newIds);
        user.setFamous(famous);
        return insert(user);
    }
    public int insertOfNewIdsAndSex(String newIds, String sex) {
        User user = new User();
        user.setNewIds(newIds);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfNewIdsAndLoginDate(String newIds, String loginDate) {
        User user = new User();
        user.setNewIds(newIds);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfNewIdsAndUserId(String newIds, String userId) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfNewIdsAndScore(String newIds, String score) {
        User user = new User();
        user.setNewIds(newIds);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfNewIdsAndPath(String newIds, String path) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfNewIdsAndPassword(String newIds, String password) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfNewIdsAndMoney(String newIds, String money) {
        User user = new User();
        user.setNewIds(newIds);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfNewIdsAndPhone(String newIds, String phone) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfNewIdsAndParam(String newIds, String param) {
        User user = new User();
        user.setNewIds(newIds);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfNewIdsAndUserIds(String newIds, String userIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfNewIdsAndName(String newIds, String name) {
        User user = new User();
        user.setNewIds(newIds);
        user.setName(name);
        return insert(user);
    }
    public int insertOfNewIdsAndResgisterDate(String newIds, String resgisterDate) {
        User user = new User();
        user.setNewIds(newIds);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfNewIdsAndEmail(String newIds, String email) {
        User user = new User();
        user.setNewIds(newIds);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfNewIdsAndDesc(String newIds, String desc) {
        User user = new User();
        user.setNewIds(newIds);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfFamousAndSex(String famous, String sex) {
        User user = new User();
        user.setFamous(famous);
        user.setSex(sex);
        return insert(user);
    }
    public int insertOfFamousAndLoginDate(String famous, String loginDate) {
        User user = new User();
        user.setFamous(famous);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfFamousAndUserId(String famous, String userId) {
        User user = new User();
        user.setFamous(famous);
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfFamousAndBUserIds(String famous, String bUserIds) {
        User user = new User();
        user.setFamous(famous);
        user.setBUserIds(bUserIds);
        return insert(user);
    }
    public int insertOfFamousAndScore(String famous, String score) {
        User user = new User();
        user.setFamous(famous);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfFamousAndPath(String famous, String path) {
        User user = new User();
        user.setFamous(famous);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfFamousAndPassword(String famous, String password) {
        User user = new User();
        user.setFamous(famous);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfFamousAndMoney(String famous, String money) {
        User user = new User();
        user.setFamous(famous);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfFamousAndPhone(String famous, String phone) {
        User user = new User();
        user.setFamous(famous);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfFamousAndParam(String famous, String param) {
        User user = new User();
        user.setFamous(famous);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfFamousAndUserIds(String famous, String userIds) {
        User user = new User();
        user.setFamous(famous);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfFamousAndName(String famous, String name) {
        User user = new User();
        user.setFamous(famous);
        user.setName(name);
        return insert(user);
    }
    public int insertOfFamousAndResgisterDate(String famous, String resgisterDate) {
        User user = new User();
        user.setFamous(famous);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfFamousAndEmail(String famous, String email) {
        User user = new User();
        user.setFamous(famous);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfFamousAndDesc(String famous, String desc) {
        User user = new User();
        user.setFamous(famous);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfSexAndLoginDate(String sex, String loginDate) {
        User user = new User();
        user.setSex(sex);
        user.setLoginDate(loginDate);
        return insert(user);
    }
    public int insertOfSexAndUserId(String sex, String userId) {
        User user = new User();
        user.setSex(sex);
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfSexAndBUserIds(String sex, String bUserIds) {
        User user = new User();
        user.setSex(sex);
        user.setBUserIds(bUserIds);
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
    public int insertOfSexAndPassword(String sex, String password) {
        User user = new User();
        user.setSex(sex);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfSexAndMoney(String sex, String money) {
        User user = new User();
        user.setSex(sex);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfSexAndPhone(String sex, String phone) {
        User user = new User();
        user.setSex(sex);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfSexAndUserIds(String sex, String userIds) {
        User user = new User();
        user.setSex(sex);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfSexAndName(String sex, String name) {
        User user = new User();
        user.setSex(sex);
        user.setName(name);
        return insert(user);
    }
    public int insertOfSexAndResgisterDate(String sex, String resgisterDate) {
        User user = new User();
        user.setSex(sex);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfSexAndEmail(String sex, String email) {
        User user = new User();
        user.setSex(sex);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfSexAndDesc(String sex, String desc) {
        User user = new User();
        user.setSex(sex);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfLoginDateAndUserId(String loginDate, String userId) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserId(userId);
        return insert(user);
    }
    public int insertOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setBUserIds(bUserIds);
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
    public int insertOfLoginDateAndPassword(String loginDate, String password) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfLoginDateAndMoney(String loginDate, String money) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfLoginDateAndPhone(String loginDate, String phone) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfLoginDateAndParam(String loginDate, String param) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfLoginDateAndUserIds(String loginDate, String userIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfLoginDateAndName(String loginDate, String name) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setName(name);
        return insert(user);
    }
    public int insertOfLoginDateAndResgisterDate(String loginDate, String resgisterDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfLoginDateAndEmail(String loginDate, String email) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfLoginDateAndDesc(String loginDate, String desc) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfUserIdAndBUserIds(String userId, String bUserIds) {
        User user = new User();
        user.setUserId(userId);
        user.setBUserIds(bUserIds);
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
    public int insertOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfUserIdAndMoney(String userId, String money) {
        User user = new User();
        user.setUserId(userId);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfUserIdAndUserIds(String userId, String userIds) {
        User user = new User();
        user.setUserId(userId);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return insert(user);
    }
    public int insertOfUserIdAndResgisterDate(String userId, String resgisterDate) {
        User user = new User();
        user.setUserId(userId);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfUserIdAndDesc(String userId, String desc) {
        User user = new User();
        user.setUserId(userId);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfBUserIdsAndScore(String bUserIds, String score) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setScore(score);
        return insert(user);
    }
    public int insertOfBUserIdsAndPath(String bUserIds, String path) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfBUserIdsAndPassword(String bUserIds, String password) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfBUserIdsAndMoney(String bUserIds, String money) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfBUserIdsAndPhone(String bUserIds, String phone) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfBUserIdsAndParam(String bUserIds, String param) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfBUserIdsAndUserIds(String bUserIds, String userIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfBUserIdsAndName(String bUserIds, String name) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setName(name);
        return insert(user);
    }
    public int insertOfBUserIdsAndResgisterDate(String bUserIds, String resgisterDate) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfBUserIdsAndEmail(String bUserIds, String email) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfBUserIdsAndDesc(String bUserIds, String desc) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfScoreAndPath(String score, String path) {
        User user = new User();
        user.setScore(score);
        user.setPath(path);
        return insert(user);
    }
    public int insertOfScoreAndPassword(String score, String password) {
        User user = new User();
        user.setScore(score);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfScoreAndMoney(String score, String money) {
        User user = new User();
        user.setScore(score);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfScoreAndPhone(String score, String phone) {
        User user = new User();
        user.setScore(score);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfScoreAndUserIds(String score, String userIds) {
        User user = new User();
        user.setScore(score);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfScoreAndName(String score, String name) {
        User user = new User();
        user.setScore(score);
        user.setName(name);
        return insert(user);
    }
    public int insertOfScoreAndResgisterDate(String score, String resgisterDate) {
        User user = new User();
        user.setScore(score);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfScoreAndEmail(String score, String email) {
        User user = new User();
        user.setScore(score);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfScoreAndDesc(String score, String desc) {
        User user = new User();
        user.setScore(score);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfPathAndPassword(String path, String password) {
        User user = new User();
        user.setPath(path);
        user.setPassword(password);
        return insert(user);
    }
    public int insertOfPathAndMoney(String path, String money) {
        User user = new User();
        user.setPath(path);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfPathAndPhone(String path, String phone) {
        User user = new User();
        user.setPath(path);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfPathAndParam(String path, String param) {
        User user = new User();
        user.setPath(path);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPathAndUserIds(String path, String userIds) {
        User user = new User();
        user.setPath(path);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfPathAndName(String path, String name) {
        User user = new User();
        user.setPath(path);
        user.setName(name);
        return insert(user);
    }
    public int insertOfPathAndResgisterDate(String path, String resgisterDate) {
        User user = new User();
        user.setPath(path);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfPathAndEmail(String path, String email) {
        User user = new User();
        user.setPath(path);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfPathAndDesc(String path, String desc) {
        User user = new User();
        user.setPath(path);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfPasswordAndMoney(String password, String money) {
        User user = new User();
        user.setPassword(password);
        user.setMoney(money);
        return insert(user);
    }
    public int insertOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPasswordAndUserIds(String password, String userIds) {
        User user = new User();
        user.setPassword(password);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return insert(user);
    }
    public int insertOfPasswordAndResgisterDate(String password, String resgisterDate) {
        User user = new User();
        user.setPassword(password);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfPasswordAndDesc(String password, String desc) {
        User user = new User();
        user.setPassword(password);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfMoneyAndPhone(String money, String phone) {
        User user = new User();
        user.setMoney(money);
        user.setPhone(phone);
        return insert(user);
    }
    public int insertOfMoneyAndParam(String money, String param) {
        User user = new User();
        user.setMoney(money);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfMoneyAndUserIds(String money, String userIds) {
        User user = new User();
        user.setMoney(money);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfMoneyAndName(String money, String name) {
        User user = new User();
        user.setMoney(money);
        user.setName(name);
        return insert(user);
    }
    public int insertOfMoneyAndResgisterDate(String money, String resgisterDate) {
        User user = new User();
        user.setMoney(money);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfMoneyAndEmail(String money, String email) {
        User user = new User();
        user.setMoney(money);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfMoneyAndDesc(String money, String desc) {
        User user = new User();
        user.setMoney(money);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return insert(user);
    }
    public int insertOfPhoneAndUserIds(String phone, String userIds) {
        User user = new User();
        user.setPhone(phone);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfPhoneAndName(String phone, String name) {
        User user = new User();
        user.setPhone(phone);
        user.setName(name);
        return insert(user);
    }
    public int insertOfPhoneAndResgisterDate(String phone, String resgisterDate) {
        User user = new User();
        user.setPhone(phone);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfPhoneAndEmail(String phone, String email) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfPhoneAndDesc(String phone, String desc) {
        User user = new User();
        user.setPhone(phone);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfParamAndUserIds(String param, String userIds) {
        User user = new User();
        user.setParam(param);
        user.setUserIds(userIds);
        return insert(user);
    }
    public int insertOfParamAndName(String param, String name) {
        User user = new User();
        user.setParam(param);
        user.setName(name);
        return insert(user);
    }
    public int insertOfParamAndResgisterDate(String param, String resgisterDate) {
        User user = new User();
        user.setParam(param);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfParamAndEmail(String param, String email) {
        User user = new User();
        user.setParam(param);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfParamAndDesc(String param, String desc) {
        User user = new User();
        user.setParam(param);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfUserIdsAndName(String userIds, String name) {
        User user = new User();
        user.setUserIds(userIds);
        user.setName(name);
        return insert(user);
    }
    public int insertOfUserIdsAndResgisterDate(String userIds, String resgisterDate) {
        User user = new User();
        user.setUserIds(userIds);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfUserIdsAndEmail(String userIds, String email) {
        User user = new User();
        user.setUserIds(userIds);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfUserIdsAndDesc(String userIds, String desc) {
        User user = new User();
        user.setUserIds(userIds);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfNameAndResgisterDate(String name, String resgisterDate) {
        User user = new User();
        user.setName(name);
        user.setResgisterDate(resgisterDate);
        return insert(user);
    }
    public int insertOfNameAndEmail(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfNameAndDesc(String name, String desc) {
        User user = new User();
        user.setName(name);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfResgisterDateAndEmail(String resgisterDate, String email) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        user.setEmail(email);
        return insert(user);
    }
    public int insertOfResgisterDateAndDesc(String resgisterDate, String desc) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        user.setDesc(desc);
        return insert(user);
    }
    public int insertOfEmailAndDesc(String email, String desc) {
        User user = new User();
        user.setEmail(email);
        user.setDesc(desc);
        return insert(user);
    }
    public User getUser(User user) {
        return DBMan.getInstance().queryByIdWithoutThrow(user, "user");
    }
    public User getUserOfImage(String image) {
        User user = new User();
        user.setImage(image);
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
    public User getUserOfFamous(String famous) {
        User user = new User();
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfLoginDate(String loginDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfBUserIds(String bUserIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
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
    public User getUserOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfMoney(String money) {
        User user = new User();
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfUserIds(String userIds) {
        User user = new User();
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfName(String name) {
        User user = new User();
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfResgisterDate(String resgisterDate) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfDesc(String desc) {
        User user = new User();
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfImageAndLvl(String image, String lvl) {
        User user = new User();
        user.setImage(image);
        user.setLvl(lvl);
        return getUser(user);
    }
    public User getUserOfImageAndNewIds(String image, String newIds) {
        User user = new User();
        user.setImage(image);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfImageAndFamous(String image, String famous) {
        User user = new User();
        user.setImage(image);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfImageAndSex(String image, String sex) {
        User user = new User();
        user.setImage(image);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfImageAndLoginDate(String image, String loginDate) {
        User user = new User();
        user.setImage(image);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfImageAndUserId(String image, String userId) {
        User user = new User();
        user.setImage(image);
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfImageAndBUserIds(String image, String bUserIds) {
        User user = new User();
        user.setImage(image);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfImageAndScore(String image, String score) {
        User user = new User();
        user.setImage(image);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfImageAndPath(String image, String path) {
        User user = new User();
        user.setImage(image);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfImageAndPassword(String image, String password) {
        User user = new User();
        user.setImage(image);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfImageAndMoney(String image, String money) {
        User user = new User();
        user.setImage(image);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfImageAndPhone(String image, String phone) {
        User user = new User();
        user.setImage(image);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfImageAndParam(String image, String param) {
        User user = new User();
        user.setImage(image);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfImageAndUserIds(String image, String userIds) {
        User user = new User();
        user.setImage(image);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfImageAndName(String image, String name) {
        User user = new User();
        user.setImage(image);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfImageAndResgisterDate(String image, String resgisterDate) {
        User user = new User();
        user.setImage(image);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfImageAndEmail(String image, String email) {
        User user = new User();
        user.setImage(image);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfImageAndDesc(String image, String desc) {
        User user = new User();
        user.setImage(image);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfLvlAndNewIds(String lvl, String newIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setNewIds(newIds);
        return getUser(user);
    }
    public User getUserOfLvlAndFamous(String lvl, String famous) {
        User user = new User();
        user.setLvl(lvl);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfLvlAndSex(String lvl, String sex) {
        User user = new User();
        user.setLvl(lvl);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfLvlAndLoginDate(String lvl, String loginDate) {
        User user = new User();
        user.setLvl(lvl);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfLvlAndUserId(String lvl, String userId) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfLvlAndBUserIds(String lvl, String bUserIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfLvlAndScore(String lvl, String score) {
        User user = new User();
        user.setLvl(lvl);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfLvlAndPath(String lvl, String path) {
        User user = new User();
        user.setLvl(lvl);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfLvlAndPassword(String lvl, String password) {
        User user = new User();
        user.setLvl(lvl);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfLvlAndMoney(String lvl, String money) {
        User user = new User();
        user.setLvl(lvl);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfLvlAndPhone(String lvl, String phone) {
        User user = new User();
        user.setLvl(lvl);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfLvlAndParam(String lvl, String param) {
        User user = new User();
        user.setLvl(lvl);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfLvlAndUserIds(String lvl, String userIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfLvlAndName(String lvl, String name) {
        User user = new User();
        user.setLvl(lvl);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfLvlAndResgisterDate(String lvl, String resgisterDate) {
        User user = new User();
        user.setLvl(lvl);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfLvlAndEmail(String lvl, String email) {
        User user = new User();
        user.setLvl(lvl);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfLvlAndDesc(String lvl, String desc) {
        User user = new User();
        user.setLvl(lvl);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfNewIdsAndFamous(String newIds, String famous) {
        User user = new User();
        user.setNewIds(newIds);
        user.setFamous(famous);
        return getUser(user);
    }
    public User getUserOfNewIdsAndSex(String newIds, String sex) {
        User user = new User();
        user.setNewIds(newIds);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfNewIdsAndLoginDate(String newIds, String loginDate) {
        User user = new User();
        user.setNewIds(newIds);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfNewIdsAndUserId(String newIds, String userId) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfNewIdsAndScore(String newIds, String score) {
        User user = new User();
        user.setNewIds(newIds);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfNewIdsAndPath(String newIds, String path) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfNewIdsAndPassword(String newIds, String password) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfNewIdsAndMoney(String newIds, String money) {
        User user = new User();
        user.setNewIds(newIds);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfNewIdsAndPhone(String newIds, String phone) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfNewIdsAndParam(String newIds, String param) {
        User user = new User();
        user.setNewIds(newIds);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfNewIdsAndUserIds(String newIds, String userIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfNewIdsAndName(String newIds, String name) {
        User user = new User();
        user.setNewIds(newIds);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfNewIdsAndResgisterDate(String newIds, String resgisterDate) {
        User user = new User();
        user.setNewIds(newIds);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfNewIdsAndEmail(String newIds, String email) {
        User user = new User();
        user.setNewIds(newIds);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfNewIdsAndDesc(String newIds, String desc) {
        User user = new User();
        user.setNewIds(newIds);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfFamousAndSex(String famous, String sex) {
        User user = new User();
        user.setFamous(famous);
        user.setSex(sex);
        return getUser(user);
    }
    public User getUserOfFamousAndLoginDate(String famous, String loginDate) {
        User user = new User();
        user.setFamous(famous);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfFamousAndUserId(String famous, String userId) {
        User user = new User();
        user.setFamous(famous);
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfFamousAndBUserIds(String famous, String bUserIds) {
        User user = new User();
        user.setFamous(famous);
        user.setBUserIds(bUserIds);
        return getUser(user);
    }
    public User getUserOfFamousAndScore(String famous, String score) {
        User user = new User();
        user.setFamous(famous);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfFamousAndPath(String famous, String path) {
        User user = new User();
        user.setFamous(famous);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfFamousAndPassword(String famous, String password) {
        User user = new User();
        user.setFamous(famous);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfFamousAndMoney(String famous, String money) {
        User user = new User();
        user.setFamous(famous);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfFamousAndPhone(String famous, String phone) {
        User user = new User();
        user.setFamous(famous);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfFamousAndParam(String famous, String param) {
        User user = new User();
        user.setFamous(famous);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfFamousAndUserIds(String famous, String userIds) {
        User user = new User();
        user.setFamous(famous);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfFamousAndName(String famous, String name) {
        User user = new User();
        user.setFamous(famous);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfFamousAndResgisterDate(String famous, String resgisterDate) {
        User user = new User();
        user.setFamous(famous);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfFamousAndEmail(String famous, String email) {
        User user = new User();
        user.setFamous(famous);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfFamousAndDesc(String famous, String desc) {
        User user = new User();
        user.setFamous(famous);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfSexAndLoginDate(String sex, String loginDate) {
        User user = new User();
        user.setSex(sex);
        user.setLoginDate(loginDate);
        return getUser(user);
    }
    public User getUserOfSexAndUserId(String sex, String userId) {
        User user = new User();
        user.setSex(sex);
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfSexAndBUserIds(String sex, String bUserIds) {
        User user = new User();
        user.setSex(sex);
        user.setBUserIds(bUserIds);
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
    public User getUserOfSexAndPassword(String sex, String password) {
        User user = new User();
        user.setSex(sex);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfSexAndMoney(String sex, String money) {
        User user = new User();
        user.setSex(sex);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfSexAndPhone(String sex, String phone) {
        User user = new User();
        user.setSex(sex);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfSexAndUserIds(String sex, String userIds) {
        User user = new User();
        user.setSex(sex);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfSexAndName(String sex, String name) {
        User user = new User();
        user.setSex(sex);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfSexAndResgisterDate(String sex, String resgisterDate) {
        User user = new User();
        user.setSex(sex);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfSexAndEmail(String sex, String email) {
        User user = new User();
        user.setSex(sex);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfSexAndDesc(String sex, String desc) {
        User user = new User();
        user.setSex(sex);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfLoginDateAndUserId(String loginDate, String userId) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserId(userId);
        return getUser(user);
    }
    public User getUserOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setBUserIds(bUserIds);
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
    public User getUserOfLoginDateAndPassword(String loginDate, String password) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfLoginDateAndMoney(String loginDate, String money) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfLoginDateAndPhone(String loginDate, String phone) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfLoginDateAndParam(String loginDate, String param) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfLoginDateAndUserIds(String loginDate, String userIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfLoginDateAndName(String loginDate, String name) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfLoginDateAndResgisterDate(String loginDate, String resgisterDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfLoginDateAndEmail(String loginDate, String email) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfLoginDateAndDesc(String loginDate, String desc) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfUserIdAndBUserIds(String userId, String bUserIds) {
        User user = new User();
        user.setUserId(userId);
        user.setBUserIds(bUserIds);
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
    public User getUserOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfUserIdAndMoney(String userId, String money) {
        User user = new User();
        user.setUserId(userId);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfUserIdAndUserIds(String userId, String userIds) {
        User user = new User();
        user.setUserId(userId);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfUserIdAndResgisterDate(String userId, String resgisterDate) {
        User user = new User();
        user.setUserId(userId);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfUserIdAndDesc(String userId, String desc) {
        User user = new User();
        user.setUserId(userId);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndScore(String bUserIds, String score) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setScore(score);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndPath(String bUserIds, String path) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndPassword(String bUserIds, String password) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndMoney(String bUserIds, String money) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndPhone(String bUserIds, String phone) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndParam(String bUserIds, String param) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndUserIds(String bUserIds, String userIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndName(String bUserIds, String name) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndResgisterDate(String bUserIds, String resgisterDate) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndEmail(String bUserIds, String email) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfBUserIdsAndDesc(String bUserIds, String desc) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfScoreAndPath(String score, String path) {
        User user = new User();
        user.setScore(score);
        user.setPath(path);
        return getUser(user);
    }
    public User getUserOfScoreAndPassword(String score, String password) {
        User user = new User();
        user.setScore(score);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfScoreAndMoney(String score, String money) {
        User user = new User();
        user.setScore(score);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfScoreAndPhone(String score, String phone) {
        User user = new User();
        user.setScore(score);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfScoreAndUserIds(String score, String userIds) {
        User user = new User();
        user.setScore(score);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfScoreAndName(String score, String name) {
        User user = new User();
        user.setScore(score);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfScoreAndResgisterDate(String score, String resgisterDate) {
        User user = new User();
        user.setScore(score);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfScoreAndEmail(String score, String email) {
        User user = new User();
        user.setScore(score);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfScoreAndDesc(String score, String desc) {
        User user = new User();
        user.setScore(score);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfPathAndPassword(String path, String password) {
        User user = new User();
        user.setPath(path);
        user.setPassword(password);
        return getUser(user);
    }
    public User getUserOfPathAndMoney(String path, String money) {
        User user = new User();
        user.setPath(path);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfPathAndPhone(String path, String phone) {
        User user = new User();
        user.setPath(path);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfPathAndParam(String path, String param) {
        User user = new User();
        user.setPath(path);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPathAndUserIds(String path, String userIds) {
        User user = new User();
        user.setPath(path);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfPathAndName(String path, String name) {
        User user = new User();
        user.setPath(path);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfPathAndResgisterDate(String path, String resgisterDate) {
        User user = new User();
        user.setPath(path);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfPathAndEmail(String path, String email) {
        User user = new User();
        user.setPath(path);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfPathAndDesc(String path, String desc) {
        User user = new User();
        user.setPath(path);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfPasswordAndMoney(String password, String money) {
        User user = new User();
        user.setPassword(password);
        user.setMoney(money);
        return getUser(user);
    }
    public User getUserOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPasswordAndUserIds(String password, String userIds) {
        User user = new User();
        user.setPassword(password);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfPasswordAndResgisterDate(String password, String resgisterDate) {
        User user = new User();
        user.setPassword(password);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfPasswordAndDesc(String password, String desc) {
        User user = new User();
        user.setPassword(password);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfMoneyAndPhone(String money, String phone) {
        User user = new User();
        user.setMoney(money);
        user.setPhone(phone);
        return getUser(user);
    }
    public User getUserOfMoneyAndParam(String money, String param) {
        User user = new User();
        user.setMoney(money);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfMoneyAndUserIds(String money, String userIds) {
        User user = new User();
        user.setMoney(money);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfMoneyAndName(String money, String name) {
        User user = new User();
        user.setMoney(money);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfMoneyAndResgisterDate(String money, String resgisterDate) {
        User user = new User();
        user.setMoney(money);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfMoneyAndEmail(String money, String email) {
        User user = new User();
        user.setMoney(money);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfMoneyAndDesc(String money, String desc) {
        User user = new User();
        user.setMoney(money);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return getUser(user);
    }
    public User getUserOfPhoneAndUserIds(String phone, String userIds) {
        User user = new User();
        user.setPhone(phone);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfPhoneAndName(String phone, String name) {
        User user = new User();
        user.setPhone(phone);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfPhoneAndResgisterDate(String phone, String resgisterDate) {
        User user = new User();
        user.setPhone(phone);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfPhoneAndEmail(String phone, String email) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfPhoneAndDesc(String phone, String desc) {
        User user = new User();
        user.setPhone(phone);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfParamAndUserIds(String param, String userIds) {
        User user = new User();
        user.setParam(param);
        user.setUserIds(userIds);
        return getUser(user);
    }
    public User getUserOfParamAndName(String param, String name) {
        User user = new User();
        user.setParam(param);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfParamAndResgisterDate(String param, String resgisterDate) {
        User user = new User();
        user.setParam(param);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfParamAndEmail(String param, String email) {
        User user = new User();
        user.setParam(param);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfParamAndDesc(String param, String desc) {
        User user = new User();
        user.setParam(param);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfUserIdsAndName(String userIds, String name) {
        User user = new User();
        user.setUserIds(userIds);
        user.setName(name);
        return getUser(user);
    }
    public User getUserOfUserIdsAndResgisterDate(String userIds, String resgisterDate) {
        User user = new User();
        user.setUserIds(userIds);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfUserIdsAndEmail(String userIds, String email) {
        User user = new User();
        user.setUserIds(userIds);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfUserIdsAndDesc(String userIds, String desc) {
        User user = new User();
        user.setUserIds(userIds);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfNameAndResgisterDate(String name, String resgisterDate) {
        User user = new User();
        user.setName(name);
        user.setResgisterDate(resgisterDate);
        return getUser(user);
    }
    public User getUserOfNameAndEmail(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfNameAndDesc(String name, String desc) {
        User user = new User();
        user.setName(name);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfResgisterDateAndEmail(String resgisterDate, String email) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        user.setEmail(email);
        return getUser(user);
    }
    public User getUserOfResgisterDateAndDesc(String resgisterDate, String desc) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        user.setDesc(desc);
        return getUser(user);
    }
    public User getUserOfEmailAndDesc(String email, String desc) {
        User user = new User();
        user.setEmail(email);
        user.setDesc(desc);
        return getUser(user);
    }
    public List<User> getUsers(User user) {
        return DBMan.getInstance().queryWithoutThrow(user, "user");
    }
    public List<User> getUsersOfImage(String image) {
        User user = new User();
        user.setImage(image);
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
    public List<User> getUsersOfFamous(String famous) {
        User user = new User();
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfSex(String sex) {
        User user = new User();
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDate(String loginDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfUserId(String userId) {
        User user = new User();
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIds(String bUserIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
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
    public List<User> getUsersOfPassword(String password) {
        User user = new User();
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfMoney(String money) {
        User user = new User();
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfPhone(String phone) {
        User user = new User();
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfParam(String param) {
        User user = new User();
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIds(String userIds) {
        User user = new User();
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfName(String name) {
        User user = new User();
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfResgisterDate(String resgisterDate) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfEmail(String email) {
        User user = new User();
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfDesc(String desc) {
        User user = new User();
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndLvl(String image, String lvl) {
        User user = new User();
        user.setImage(image);
        user.setLvl(lvl);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndNewIds(String image, String newIds) {
        User user = new User();
        user.setImage(image);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndFamous(String image, String famous) {
        User user = new User();
        user.setImage(image);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndSex(String image, String sex) {
        User user = new User();
        user.setImage(image);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndLoginDate(String image, String loginDate) {
        User user = new User();
        user.setImage(image);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndUserId(String image, String userId) {
        User user = new User();
        user.setImage(image);
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndBUserIds(String image, String bUserIds) {
        User user = new User();
        user.setImage(image);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndScore(String image, String score) {
        User user = new User();
        user.setImage(image);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndPath(String image, String path) {
        User user = new User();
        user.setImage(image);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndPassword(String image, String password) {
        User user = new User();
        user.setImage(image);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndMoney(String image, String money) {
        User user = new User();
        user.setImage(image);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndPhone(String image, String phone) {
        User user = new User();
        user.setImage(image);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndParam(String image, String param) {
        User user = new User();
        user.setImage(image);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndUserIds(String image, String userIds) {
        User user = new User();
        user.setImage(image);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndName(String image, String name) {
        User user = new User();
        user.setImage(image);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndResgisterDate(String image, String resgisterDate) {
        User user = new User();
        user.setImage(image);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndEmail(String image, String email) {
        User user = new User();
        user.setImage(image);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfImageAndDesc(String image, String desc) {
        User user = new User();
        user.setImage(image);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndNewIds(String lvl, String newIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setNewIds(newIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndFamous(String lvl, String famous) {
        User user = new User();
        user.setLvl(lvl);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndSex(String lvl, String sex) {
        User user = new User();
        user.setLvl(lvl);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndLoginDate(String lvl, String loginDate) {
        User user = new User();
        user.setLvl(lvl);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndUserId(String lvl, String userId) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndBUserIds(String lvl, String bUserIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndScore(String lvl, String score) {
        User user = new User();
        user.setLvl(lvl);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndPath(String lvl, String path) {
        User user = new User();
        user.setLvl(lvl);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndPassword(String lvl, String password) {
        User user = new User();
        user.setLvl(lvl);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndMoney(String lvl, String money) {
        User user = new User();
        user.setLvl(lvl);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndPhone(String lvl, String phone) {
        User user = new User();
        user.setLvl(lvl);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndParam(String lvl, String param) {
        User user = new User();
        user.setLvl(lvl);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndUserIds(String lvl, String userIds) {
        User user = new User();
        user.setLvl(lvl);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndName(String lvl, String name) {
        User user = new User();
        user.setLvl(lvl);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndResgisterDate(String lvl, String resgisterDate) {
        User user = new User();
        user.setLvl(lvl);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndEmail(String lvl, String email) {
        User user = new User();
        user.setLvl(lvl);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfLvlAndDesc(String lvl, String desc) {
        User user = new User();
        user.setLvl(lvl);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndFamous(String newIds, String famous) {
        User user = new User();
        user.setNewIds(newIds);
        user.setFamous(famous);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndSex(String newIds, String sex) {
        User user = new User();
        user.setNewIds(newIds);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndLoginDate(String newIds, String loginDate) {
        User user = new User();
        user.setNewIds(newIds);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndUserId(String newIds, String userId) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndScore(String newIds, String score) {
        User user = new User();
        user.setNewIds(newIds);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndPath(String newIds, String path) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndPassword(String newIds, String password) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndMoney(String newIds, String money) {
        User user = new User();
        user.setNewIds(newIds);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndPhone(String newIds, String phone) {
        User user = new User();
        user.setNewIds(newIds);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndParam(String newIds, String param) {
        User user = new User();
        user.setNewIds(newIds);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndUserIds(String newIds, String userIds) {
        User user = new User();
        user.setNewIds(newIds);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndName(String newIds, String name) {
        User user = new User();
        user.setNewIds(newIds);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndResgisterDate(String newIds, String resgisterDate) {
        User user = new User();
        user.setNewIds(newIds);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndEmail(String newIds, String email) {
        User user = new User();
        user.setNewIds(newIds);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfNewIdsAndDesc(String newIds, String desc) {
        User user = new User();
        user.setNewIds(newIds);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndSex(String famous, String sex) {
        User user = new User();
        user.setFamous(famous);
        user.setSex(sex);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndLoginDate(String famous, String loginDate) {
        User user = new User();
        user.setFamous(famous);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndUserId(String famous, String userId) {
        User user = new User();
        user.setFamous(famous);
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndBUserIds(String famous, String bUserIds) {
        User user = new User();
        user.setFamous(famous);
        user.setBUserIds(bUserIds);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndScore(String famous, String score) {
        User user = new User();
        user.setFamous(famous);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndPath(String famous, String path) {
        User user = new User();
        user.setFamous(famous);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndPassword(String famous, String password) {
        User user = new User();
        user.setFamous(famous);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndMoney(String famous, String money) {
        User user = new User();
        user.setFamous(famous);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndPhone(String famous, String phone) {
        User user = new User();
        user.setFamous(famous);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndParam(String famous, String param) {
        User user = new User();
        user.setFamous(famous);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndUserIds(String famous, String userIds) {
        User user = new User();
        user.setFamous(famous);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndName(String famous, String name) {
        User user = new User();
        user.setFamous(famous);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndResgisterDate(String famous, String resgisterDate) {
        User user = new User();
        user.setFamous(famous);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndEmail(String famous, String email) {
        User user = new User();
        user.setFamous(famous);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfFamousAndDesc(String famous, String desc) {
        User user = new User();
        user.setFamous(famous);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndLoginDate(String sex, String loginDate) {
        User user = new User();
        user.setSex(sex);
        user.setLoginDate(loginDate);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndUserId(String sex, String userId) {
        User user = new User();
        user.setSex(sex);
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndBUserIds(String sex, String bUserIds) {
        User user = new User();
        user.setSex(sex);
        user.setBUserIds(bUserIds);
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
    public List<User> getUsersOfSexAndPassword(String sex, String password) {
        User user = new User();
        user.setSex(sex);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndMoney(String sex, String money) {
        User user = new User();
        user.setSex(sex);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndPhone(String sex, String phone) {
        User user = new User();
        user.setSex(sex);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndParam(String sex, String param) {
        User user = new User();
        user.setSex(sex);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndUserIds(String sex, String userIds) {
        User user = new User();
        user.setSex(sex);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndName(String sex, String name) {
        User user = new User();
        user.setSex(sex);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndResgisterDate(String sex, String resgisterDate) {
        User user = new User();
        user.setSex(sex);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndEmail(String sex, String email) {
        User user = new User();
        user.setSex(sex);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfSexAndDesc(String sex, String desc) {
        User user = new User();
        user.setSex(sex);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndUserId(String loginDate, String userId) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserId(userId);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setBUserIds(bUserIds);
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
    public List<User> getUsersOfLoginDateAndPassword(String loginDate, String password) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndMoney(String loginDate, String money) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndPhone(String loginDate, String phone) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndParam(String loginDate, String param) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndUserIds(String loginDate, String userIds) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndName(String loginDate, String name) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndResgisterDate(String loginDate, String resgisterDate) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndEmail(String loginDate, String email) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfLoginDateAndDesc(String loginDate, String desc) {
        User user = new User();
        user.setLoginDate(loginDate);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndBUserIds(String userId, String bUserIds) {
        User user = new User();
        user.setUserId(userId);
        user.setBUserIds(bUserIds);
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
    public List<User> getUsersOfUserIdAndPassword(String userId, String password) {
        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndMoney(String userId, String money) {
        User user = new User();
        user.setUserId(userId);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndPhone(String userId, String phone) {
        User user = new User();
        user.setUserId(userId);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndParam(String userId, String param) {
        User user = new User();
        user.setUserId(userId);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndUserIds(String userId, String userIds) {
        User user = new User();
        user.setUserId(userId);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndName(String userId, String name) {
        User user = new User();
        user.setUserId(userId);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndResgisterDate(String userId, String resgisterDate) {
        User user = new User();
        user.setUserId(userId);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndEmail(String userId, String email) {
        User user = new User();
        user.setUserId(userId);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdAndDesc(String userId, String desc) {
        User user = new User();
        user.setUserId(userId);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndScore(String bUserIds, String score) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setScore(score);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndPath(String bUserIds, String path) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndPassword(String bUserIds, String password) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndMoney(String bUserIds, String money) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndPhone(String bUserIds, String phone) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndParam(String bUserIds, String param) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndUserIds(String bUserIds, String userIds) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndName(String bUserIds, String name) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndResgisterDate(String bUserIds, String resgisterDate) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndEmail(String bUserIds, String email) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfBUserIdsAndDesc(String bUserIds, String desc) {
        User user = new User();
        user.setBUserIds(bUserIds);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndPath(String score, String path) {
        User user = new User();
        user.setScore(score);
        user.setPath(path);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndPassword(String score, String password) {
        User user = new User();
        user.setScore(score);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndMoney(String score, String money) {
        User user = new User();
        user.setScore(score);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndPhone(String score, String phone) {
        User user = new User();
        user.setScore(score);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndParam(String score, String param) {
        User user = new User();
        user.setScore(score);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndUserIds(String score, String userIds) {
        User user = new User();
        user.setScore(score);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndName(String score, String name) {
        User user = new User();
        user.setScore(score);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndResgisterDate(String score, String resgisterDate) {
        User user = new User();
        user.setScore(score);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndEmail(String score, String email) {
        User user = new User();
        user.setScore(score);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfScoreAndDesc(String score, String desc) {
        User user = new User();
        user.setScore(score);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndPassword(String path, String password) {
        User user = new User();
        user.setPath(path);
        user.setPassword(password);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndMoney(String path, String money) {
        User user = new User();
        user.setPath(path);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndPhone(String path, String phone) {
        User user = new User();
        user.setPath(path);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndParam(String path, String param) {
        User user = new User();
        user.setPath(path);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndUserIds(String path, String userIds) {
        User user = new User();
        user.setPath(path);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndName(String path, String name) {
        User user = new User();
        user.setPath(path);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndResgisterDate(String path, String resgisterDate) {
        User user = new User();
        user.setPath(path);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndEmail(String path, String email) {
        User user = new User();
        user.setPath(path);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfPathAndDesc(String path, String desc) {
        User user = new User();
        user.setPath(path);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndMoney(String password, String money) {
        User user = new User();
        user.setPassword(password);
        user.setMoney(money);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndPhone(String password, String phone) {
        User user = new User();
        user.setPassword(password);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndParam(String password, String param) {
        User user = new User();
        user.setPassword(password);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndUserIds(String password, String userIds) {
        User user = new User();
        user.setPassword(password);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndName(String password, String name) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndResgisterDate(String password, String resgisterDate) {
        User user = new User();
        user.setPassword(password);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndEmail(String password, String email) {
        User user = new User();
        user.setPassword(password);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfPasswordAndDesc(String password, String desc) {
        User user = new User();
        user.setPassword(password);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndPhone(String money, String phone) {
        User user = new User();
        user.setMoney(money);
        user.setPhone(phone);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndParam(String money, String param) {
        User user = new User();
        user.setMoney(money);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndUserIds(String money, String userIds) {
        User user = new User();
        user.setMoney(money);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndName(String money, String name) {
        User user = new User();
        user.setMoney(money);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndResgisterDate(String money, String resgisterDate) {
        User user = new User();
        user.setMoney(money);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndEmail(String money, String email) {
        User user = new User();
        user.setMoney(money);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfMoneyAndDesc(String money, String desc) {
        User user = new User();
        user.setMoney(money);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndParam(String phone, String param) {
        User user = new User();
        user.setPhone(phone);
        user.setParam(param);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndUserIds(String phone, String userIds) {
        User user = new User();
        user.setPhone(phone);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndName(String phone, String name) {
        User user = new User();
        user.setPhone(phone);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndResgisterDate(String phone, String resgisterDate) {
        User user = new User();
        user.setPhone(phone);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndEmail(String phone, String email) {
        User user = new User();
        user.setPhone(phone);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfPhoneAndDesc(String phone, String desc) {
        User user = new User();
        user.setPhone(phone);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndUserIds(String param, String userIds) {
        User user = new User();
        user.setParam(param);
        user.setUserIds(userIds);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndName(String param, String name) {
        User user = new User();
        user.setParam(param);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndResgisterDate(String param, String resgisterDate) {
        User user = new User();
        user.setParam(param);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndEmail(String param, String email) {
        User user = new User();
        user.setParam(param);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfParamAndDesc(String param, String desc) {
        User user = new User();
        user.setParam(param);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdsAndName(String userIds, String name) {
        User user = new User();
        user.setUserIds(userIds);
        user.setName(name);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdsAndResgisterDate(String userIds, String resgisterDate) {
        User user = new User();
        user.setUserIds(userIds);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdsAndEmail(String userIds, String email) {
        User user = new User();
        user.setUserIds(userIds);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfUserIdsAndDesc(String userIds, String desc) {
        User user = new User();
        user.setUserIds(userIds);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndResgisterDate(String name, String resgisterDate) {
        User user = new User();
        user.setName(name);
        user.setResgisterDate(resgisterDate);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndEmail(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfNameAndDesc(String name, String desc) {
        User user = new User();
        user.setName(name);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfResgisterDateAndEmail(String resgisterDate, String email) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        user.setEmail(email);
        return getUsers(user);
    }
    public List<User> getUsersOfResgisterDateAndDesc(String resgisterDate, String desc) {
        User user = new User();
        user.setResgisterDate(resgisterDate);
        user.setDesc(desc);
        return getUsers(user);
    }
    public List<User> getUsersOfEmailAndDesc(String email, String desc) {
        User user = new User();
        user.setEmail(email);
        user.setDesc(desc);
        return getUsers(user);
    }
}
