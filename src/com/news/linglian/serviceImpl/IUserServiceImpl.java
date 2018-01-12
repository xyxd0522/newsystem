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
    public int updateOfName(User user, String name) {
        return dao.updateOfName(user, name);
    }
    public int updateOfSex(User user, String sex) {
        return dao.updateOfSex(user, sex);
    }
    public int updateOfRegisterDate(User user, String registerDate) {
        return dao.updateOfRegisterDate(user, registerDate);
    }
    public int updateOfLoginDate(User user, String loginDate) {
        return dao.updateOfLoginDate(user, loginDate);
    }
    public int updateOfPhone(User user, String phone) {
        return dao.updateOfPhone(user, phone);
    }
    public int updateOfEmail(User user, String email) {
        return dao.updateOfEmail(user, email);
    }
    public int updateOfMoney(User user, String money) {
        return dao.updateOfMoney(user, money);
    }
    public int updateOfScore(User user, String score) {
        return dao.updateOfScore(user, score);
    }
    public int updateOfPath(User user, String path) {
        return dao.updateOfPath(user, path);
    }
    public int updateOfParam(User user, String param) {
        return dao.updateOfParam(user, param);
    }
    public int updateOfLvl(User user, String lvl) {
        return dao.updateOfLvl(user, lvl);
    }
    public int updateOfNewIds(User user, String newIds) {
        return dao.updateOfNewIds(user, newIds);
    }
    public int updateOfUserIds(User user, String userIds) {
        return dao.updateOfUserIds(user, userIds);
    }
    public int updateOfDesc(User user, String desc) {
        return dao.updateOfDesc(user, desc);
    }
    public int updateOfImage(User user, String image) {
        return dao.updateOfImage(user, image);
    }
    public int updateOfFamous(User user, String famous) {
        return dao.updateOfFamous(user, famous);
    }
    public int updateOfBUserIds(User user, String bUserIds) {
        return dao.updateOfBUserIds(user, bUserIds);
    }
    public int updateOfUserIdAndPassword(User user, String userId, String password) {
        return dao.updateOfUserIdAndPassword(user, userId, password);
    }
    public int updateOfUserIdAndName(User user, String userId, String name) {
        return dao.updateOfUserIdAndName(user, userId, name);
    }
    public int updateOfUserIdAndSex(User user, String userId, String sex) {
        return dao.updateOfUserIdAndSex(user, userId, sex);
    }
    public int updateOfUserIdAndRegisterDate(User user, String userId, String registerDate) {
        return dao.updateOfUserIdAndRegisterDate(user, userId, registerDate);
    }
    public int updateOfUserIdAndLoginDate(User user, String userId, String loginDate) {
        return dao.updateOfUserIdAndLoginDate(user, userId, loginDate);
    }
    public int updateOfUserIdAndPhone(User user, String userId, String phone) {
        return dao.updateOfUserIdAndPhone(user, userId, phone);
    }
    public int updateOfUserIdAndEmail(User user, String userId, String email) {
        return dao.updateOfUserIdAndEmail(user, userId, email);
    }
    public int updateOfUserIdAndMoney(User user, String userId, String money) {
        return dao.updateOfUserIdAndMoney(user, userId, money);
    }
    public int updateOfUserIdAndScore(User user, String userId, String score) {
        return dao.updateOfUserIdAndScore(user, userId, score);
    }
    public int updateOfUserIdAndPath(User user, String userId, String path) {
        return dao.updateOfUserIdAndPath(user, userId, path);
    }
    public int updateOfUserIdAndParam(User user, String userId, String param) {
        return dao.updateOfUserIdAndParam(user, userId, param);
    }
    public int updateOfUserIdAndLvl(User user, String userId, String lvl) {
        return dao.updateOfUserIdAndLvl(user, userId, lvl);
    }
    public int updateOfUserIdAndNewIds(User user, String userId, String newIds) {
        return dao.updateOfUserIdAndNewIds(user, userId, newIds);
    }
    public int updateOfUserIdAndUserIds(User user, String userId, String userIds) {
        return dao.updateOfUserIdAndUserIds(user, userId, userIds);
    }
    public int updateOfUserIdAndDesc(User user, String userId, String desc) {
        return dao.updateOfUserIdAndDesc(user, userId, desc);
    }
    public int updateOfUserIdAndImage(User user, String userId, String image) {
        return dao.updateOfUserIdAndImage(user, userId, image);
    }
    public int updateOfUserIdAndFamous(User user, String userId, String famous) {
        return dao.updateOfUserIdAndFamous(user, userId, famous);
    }
    public int updateOfUserIdAndBUserIds(User user, String userId, String bUserIds) {
        return dao.updateOfUserIdAndBUserIds(user, userId, bUserIds);
    }
    public int updateOfPasswordAndName(User user, String password, String name) {
        return dao.updateOfPasswordAndName(user, password, name);
    }
    public int updateOfPasswordAndSex(User user, String password, String sex) {
        return dao.updateOfPasswordAndSex(user, password, sex);
    }
    public int updateOfPasswordAndRegisterDate(User user, String password, String registerDate) {
        return dao.updateOfPasswordAndRegisterDate(user, password, registerDate);
    }
    public int updateOfPasswordAndLoginDate(User user, String password, String loginDate) {
        return dao.updateOfPasswordAndLoginDate(user, password, loginDate);
    }
    public int updateOfPasswordAndPhone(User user, String password, String phone) {
        return dao.updateOfPasswordAndPhone(user, password, phone);
    }
    public int updateOfPasswordAndEmail(User user, String password, String email) {
        return dao.updateOfPasswordAndEmail(user, password, email);
    }
    public int updateOfPasswordAndMoney(User user, String password, String money) {
        return dao.updateOfPasswordAndMoney(user, password, money);
    }
    public int updateOfPasswordAndScore(User user, String password, String score) {
        return dao.updateOfPasswordAndScore(user, password, score);
    }
    public int updateOfPasswordAndPath(User user, String password, String path) {
        return dao.updateOfPasswordAndPath(user, password, path);
    }
    public int updateOfPasswordAndParam(User user, String password, String param) {
        return dao.updateOfPasswordAndParam(user, password, param);
    }
    public int updateOfPasswordAndLvl(User user, String password, String lvl) {
        return dao.updateOfPasswordAndLvl(user, password, lvl);
    }
    public int updateOfPasswordAndNewIds(User user, String password, String newIds) {
        return dao.updateOfPasswordAndNewIds(user, password, newIds);
    }
    public int updateOfPasswordAndUserIds(User user, String password, String userIds) {
        return dao.updateOfPasswordAndUserIds(user, password, userIds);
    }
    public int updateOfPasswordAndDesc(User user, String password, String desc) {
        return dao.updateOfPasswordAndDesc(user, password, desc);
    }
    public int updateOfPasswordAndImage(User user, String password, String image) {
        return dao.updateOfPasswordAndImage(user, password, image);
    }
    public int updateOfPasswordAndFamous(User user, String password, String famous) {
        return dao.updateOfPasswordAndFamous(user, password, famous);
    }
    public int updateOfPasswordAndBUserIds(User user, String password, String bUserIds) {
        return dao.updateOfPasswordAndBUserIds(user, password, bUserIds);
    }
    public int updateOfNameAndSex(User user, String name, String sex) {
        return dao.updateOfNameAndSex(user, name, sex);
    }
    public int updateOfNameAndRegisterDate(User user, String name, String registerDate) {
        return dao.updateOfNameAndRegisterDate(user, name, registerDate);
    }
    public int updateOfNameAndLoginDate(User user, String name, String loginDate) {
        return dao.updateOfNameAndLoginDate(user, name, loginDate);
    }
    public int updateOfNameAndPhone(User user, String name, String phone) {
        return dao.updateOfNameAndPhone(user, name, phone);
    }
    public int updateOfNameAndEmail(User user, String name, String email) {
        return dao.updateOfNameAndEmail(user, name, email);
    }
    public int updateOfNameAndMoney(User user, String name, String money) {
        return dao.updateOfNameAndMoney(user, name, money);
    }
    public int updateOfNameAndScore(User user, String name, String score) {
        return dao.updateOfNameAndScore(user, name, score);
    }
    public int updateOfNameAndPath(User user, String name, String path) {
        return dao.updateOfNameAndPath(user, name, path);
    }
    public int updateOfNameAndParam(User user, String name, String param) {
        return dao.updateOfNameAndParam(user, name, param);
    }
    public int updateOfNameAndLvl(User user, String name, String lvl) {
        return dao.updateOfNameAndLvl(user, name, lvl);
    }
    public int updateOfNameAndNewIds(User user, String name, String newIds) {
        return dao.updateOfNameAndNewIds(user, name, newIds);
    }
    public int updateOfNameAndUserIds(User user, String name, String userIds) {
        return dao.updateOfNameAndUserIds(user, name, userIds);
    }
    public int updateOfNameAndDesc(User user, String name, String desc) {
        return dao.updateOfNameAndDesc(user, name, desc);
    }
    public int updateOfNameAndImage(User user, String name, String image) {
        return dao.updateOfNameAndImage(user, name, image);
    }
    public int updateOfNameAndFamous(User user, String name, String famous) {
        return dao.updateOfNameAndFamous(user, name, famous);
    }
    public int updateOfNameAndBUserIds(User user, String name, String bUserIds) {
        return dao.updateOfNameAndBUserIds(user, name, bUserIds);
    }
    public int updateOfSexAndRegisterDate(User user, String sex, String registerDate) {
        return dao.updateOfSexAndRegisterDate(user, sex, registerDate);
    }
    public int updateOfSexAndLoginDate(User user, String sex, String loginDate) {
        return dao.updateOfSexAndLoginDate(user, sex, loginDate);
    }
    public int updateOfSexAndPhone(User user, String sex, String phone) {
        return dao.updateOfSexAndPhone(user, sex, phone);
    }
    public int updateOfSexAndEmail(User user, String sex, String email) {
        return dao.updateOfSexAndEmail(user, sex, email);
    }
    public int updateOfSexAndMoney(User user, String sex, String money) {
        return dao.updateOfSexAndMoney(user, sex, money);
    }
    public int updateOfSexAndScore(User user, String sex, String score) {
        return dao.updateOfSexAndScore(user, sex, score);
    }
    public int updateOfSexAndPath(User user, String sex, String path) {
        return dao.updateOfSexAndPath(user, sex, path);
    }
    public int updateOfSexAndParam(User user, String sex, String param) {
        return dao.updateOfSexAndParam(user, sex, param);
    }
    public int updateOfSexAndLvl(User user, String sex, String lvl) {
        return dao.updateOfSexAndLvl(user, sex, lvl);
    }
    public int updateOfSexAndNewIds(User user, String sex, String newIds) {
        return dao.updateOfSexAndNewIds(user, sex, newIds);
    }
    public int updateOfSexAndUserIds(User user, String sex, String userIds) {
        return dao.updateOfSexAndUserIds(user, sex, userIds);
    }
    public int updateOfSexAndDesc(User user, String sex, String desc) {
        return dao.updateOfSexAndDesc(user, sex, desc);
    }
    public int updateOfSexAndImage(User user, String sex, String image) {
        return dao.updateOfSexAndImage(user, sex, image);
    }
    public int updateOfSexAndFamous(User user, String sex, String famous) {
        return dao.updateOfSexAndFamous(user, sex, famous);
    }
    public int updateOfSexAndBUserIds(User user, String sex, String bUserIds) {
        return dao.updateOfSexAndBUserIds(user, sex, bUserIds);
    }
    public int updateOfRegisterDateAndLoginDate(User user, String registerDate, String loginDate) {
        return dao.updateOfRegisterDateAndLoginDate(user, registerDate, loginDate);
    }
    public int updateOfRegisterDateAndPhone(User user, String registerDate, String phone) {
        return dao.updateOfRegisterDateAndPhone(user, registerDate, phone);
    }
    public int updateOfRegisterDateAndEmail(User user, String registerDate, String email) {
        return dao.updateOfRegisterDateAndEmail(user, registerDate, email);
    }
    public int updateOfRegisterDateAndMoney(User user, String registerDate, String money) {
        return dao.updateOfRegisterDateAndMoney(user, registerDate, money);
    }
    public int updateOfRegisterDateAndScore(User user, String registerDate, String score) {
        return dao.updateOfRegisterDateAndScore(user, registerDate, score);
    }
    public int updateOfRegisterDateAndPath(User user, String registerDate, String path) {
        return dao.updateOfRegisterDateAndPath(user, registerDate, path);
    }
    public int updateOfRegisterDateAndParam(User user, String registerDate, String param) {
        return dao.updateOfRegisterDateAndParam(user, registerDate, param);
    }
    public int updateOfRegisterDateAndLvl(User user, String registerDate, String lvl) {
        return dao.updateOfRegisterDateAndLvl(user, registerDate, lvl);
    }
    public int updateOfRegisterDateAndNewIds(User user, String registerDate, String newIds) {
        return dao.updateOfRegisterDateAndNewIds(user, registerDate, newIds);
    }
    public int updateOfRegisterDateAndUserIds(User user, String registerDate, String userIds) {
        return dao.updateOfRegisterDateAndUserIds(user, registerDate, userIds);
    }
    public int updateOfRegisterDateAndDesc(User user, String registerDate, String desc) {
        return dao.updateOfRegisterDateAndDesc(user, registerDate, desc);
    }
    public int updateOfRegisterDateAndImage(User user, String registerDate, String image) {
        return dao.updateOfRegisterDateAndImage(user, registerDate, image);
    }
    public int updateOfRegisterDateAndFamous(User user, String registerDate, String famous) {
        return dao.updateOfRegisterDateAndFamous(user, registerDate, famous);
    }
    public int updateOfRegisterDateAndBUserIds(User user, String registerDate, String bUserIds) {
        return dao.updateOfRegisterDateAndBUserIds(user, registerDate, bUserIds);
    }
    public int updateOfLoginDateAndPhone(User user, String loginDate, String phone) {
        return dao.updateOfLoginDateAndPhone(user, loginDate, phone);
    }
    public int updateOfLoginDateAndEmail(User user, String loginDate, String email) {
        return dao.updateOfLoginDateAndEmail(user, loginDate, email);
    }
    public int updateOfLoginDateAndMoney(User user, String loginDate, String money) {
        return dao.updateOfLoginDateAndMoney(user, loginDate, money);
    }
    public int updateOfLoginDateAndScore(User user, String loginDate, String score) {
        return dao.updateOfLoginDateAndScore(user, loginDate, score);
    }
    public int updateOfLoginDateAndPath(User user, String loginDate, String path) {
        return dao.updateOfLoginDateAndPath(user, loginDate, path);
    }
    public int updateOfLoginDateAndParam(User user, String loginDate, String param) {
        return dao.updateOfLoginDateAndParam(user, loginDate, param);
    }
    public int updateOfLoginDateAndLvl(User user, String loginDate, String lvl) {
        return dao.updateOfLoginDateAndLvl(user, loginDate, lvl);
    }
    public int updateOfLoginDateAndNewIds(User user, String loginDate, String newIds) {
        return dao.updateOfLoginDateAndNewIds(user, loginDate, newIds);
    }
    public int updateOfLoginDateAndUserIds(User user, String loginDate, String userIds) {
        return dao.updateOfLoginDateAndUserIds(user, loginDate, userIds);
    }
    public int updateOfLoginDateAndDesc(User user, String loginDate, String desc) {
        return dao.updateOfLoginDateAndDesc(user, loginDate, desc);
    }
    public int updateOfLoginDateAndImage(User user, String loginDate, String image) {
        return dao.updateOfLoginDateAndImage(user, loginDate, image);
    }
    public int updateOfLoginDateAndFamous(User user, String loginDate, String famous) {
        return dao.updateOfLoginDateAndFamous(user, loginDate, famous);
    }
    public int updateOfLoginDateAndBUserIds(User user, String loginDate, String bUserIds) {
        return dao.updateOfLoginDateAndBUserIds(user, loginDate, bUserIds);
    }
    public int updateOfPhoneAndEmail(User user, String phone, String email) {
        return dao.updateOfPhoneAndEmail(user, phone, email);
    }
    public int updateOfPhoneAndMoney(User user, String phone, String money) {
        return dao.updateOfPhoneAndMoney(user, phone, money);
    }
    public int updateOfPhoneAndScore(User user, String phone, String score) {
        return dao.updateOfPhoneAndScore(user, phone, score);
    }
    public int updateOfPhoneAndPath(User user, String phone, String path) {
        return dao.updateOfPhoneAndPath(user, phone, path);
    }
    public int updateOfPhoneAndParam(User user, String phone, String param) {
        return dao.updateOfPhoneAndParam(user, phone, param);
    }
    public int updateOfPhoneAndLvl(User user, String phone, String lvl) {
        return dao.updateOfPhoneAndLvl(user, phone, lvl);
    }
    public int updateOfPhoneAndNewIds(User user, String phone, String newIds) {
        return dao.updateOfPhoneAndNewIds(user, phone, newIds);
    }
    public int updateOfPhoneAndUserIds(User user, String phone, String userIds) {
        return dao.updateOfPhoneAndUserIds(user, phone, userIds);
    }
    public int updateOfPhoneAndDesc(User user, String phone, String desc) {
        return dao.updateOfPhoneAndDesc(user, phone, desc);
    }
    public int updateOfPhoneAndImage(User user, String phone, String image) {
        return dao.updateOfPhoneAndImage(user, phone, image);
    }
    public int updateOfPhoneAndFamous(User user, String phone, String famous) {
        return dao.updateOfPhoneAndFamous(user, phone, famous);
    }
    public int updateOfPhoneAndBUserIds(User user, String phone, String bUserIds) {
        return dao.updateOfPhoneAndBUserIds(user, phone, bUserIds);
    }
    public int updateOfEmailAndMoney(User user, String email, String money) {
        return dao.updateOfEmailAndMoney(user, email, money);
    }
    public int updateOfEmailAndScore(User user, String email, String score) {
        return dao.updateOfEmailAndScore(user, email, score);
    }
    public int updateOfEmailAndPath(User user, String email, String path) {
        return dao.updateOfEmailAndPath(user, email, path);
    }
    public int updateOfEmailAndParam(User user, String email, String param) {
        return dao.updateOfEmailAndParam(user, email, param);
    }
    public int updateOfEmailAndLvl(User user, String email, String lvl) {
        return dao.updateOfEmailAndLvl(user, email, lvl);
    }
    public int updateOfEmailAndNewIds(User user, String email, String newIds) {
        return dao.updateOfEmailAndNewIds(user, email, newIds);
    }
    public int updateOfEmailAndUserIds(User user, String email, String userIds) {
        return dao.updateOfEmailAndUserIds(user, email, userIds);
    }
    public int updateOfEmailAndDesc(User user, String email, String desc) {
        return dao.updateOfEmailAndDesc(user, email, desc);
    }
    public int updateOfEmailAndImage(User user, String email, String image) {
        return dao.updateOfEmailAndImage(user, email, image);
    }
    public int updateOfEmailAndFamous(User user, String email, String famous) {
        return dao.updateOfEmailAndFamous(user, email, famous);
    }
    public int updateOfEmailAndBUserIds(User user, String email, String bUserIds) {
        return dao.updateOfEmailAndBUserIds(user, email, bUserIds);
    }
    public int updateOfMoneyAndScore(User user, String money, String score) {
        return dao.updateOfMoneyAndScore(user, money, score);
    }
    public int updateOfMoneyAndPath(User user, String money, String path) {
        return dao.updateOfMoneyAndPath(user, money, path);
    }
    public int updateOfMoneyAndParam(User user, String money, String param) {
        return dao.updateOfMoneyAndParam(user, money, param);
    }
    public int updateOfMoneyAndLvl(User user, String money, String lvl) {
        return dao.updateOfMoneyAndLvl(user, money, lvl);
    }
    public int updateOfMoneyAndNewIds(User user, String money, String newIds) {
        return dao.updateOfMoneyAndNewIds(user, money, newIds);
    }
    public int updateOfMoneyAndUserIds(User user, String money, String userIds) {
        return dao.updateOfMoneyAndUserIds(user, money, userIds);
    }
    public int updateOfMoneyAndDesc(User user, String money, String desc) {
        return dao.updateOfMoneyAndDesc(user, money, desc);
    }
    public int updateOfMoneyAndImage(User user, String money, String image) {
        return dao.updateOfMoneyAndImage(user, money, image);
    }
    public int updateOfMoneyAndFamous(User user, String money, String famous) {
        return dao.updateOfMoneyAndFamous(user, money, famous);
    }
    public int updateOfMoneyAndBUserIds(User user, String money, String bUserIds) {
        return dao.updateOfMoneyAndBUserIds(user, money, bUserIds);
    }
    public int updateOfScoreAndPath(User user, String score, String path) {
        return dao.updateOfScoreAndPath(user, score, path);
    }
    public int updateOfScoreAndParam(User user, String score, String param) {
        return dao.updateOfScoreAndParam(user, score, param);
    }
    public int updateOfScoreAndLvl(User user, String score, String lvl) {
        return dao.updateOfScoreAndLvl(user, score, lvl);
    }
    public int updateOfScoreAndNewIds(User user, String score, String newIds) {
        return dao.updateOfScoreAndNewIds(user, score, newIds);
    }
    public int updateOfScoreAndUserIds(User user, String score, String userIds) {
        return dao.updateOfScoreAndUserIds(user, score, userIds);
    }
    public int updateOfScoreAndDesc(User user, String score, String desc) {
        return dao.updateOfScoreAndDesc(user, score, desc);
    }
    public int updateOfScoreAndImage(User user, String score, String image) {
        return dao.updateOfScoreAndImage(user, score, image);
    }
    public int updateOfScoreAndFamous(User user, String score, String famous) {
        return dao.updateOfScoreAndFamous(user, score, famous);
    }
    public int updateOfScoreAndBUserIds(User user, String score, String bUserIds) {
        return dao.updateOfScoreAndBUserIds(user, score, bUserIds);
    }
    public int updateOfPathAndParam(User user, String path, String param) {
        return dao.updateOfPathAndParam(user, path, param);
    }
    public int updateOfPathAndLvl(User user, String path, String lvl) {
        return dao.updateOfPathAndLvl(user, path, lvl);
    }
    public int updateOfPathAndNewIds(User user, String path, String newIds) {
        return dao.updateOfPathAndNewIds(user, path, newIds);
    }
    public int updateOfPathAndUserIds(User user, String path, String userIds) {
        return dao.updateOfPathAndUserIds(user, path, userIds);
    }
    public int updateOfPathAndDesc(User user, String path, String desc) {
        return dao.updateOfPathAndDesc(user, path, desc);
    }
    public int updateOfPathAndImage(User user, String path, String image) {
        return dao.updateOfPathAndImage(user, path, image);
    }
    public int updateOfPathAndFamous(User user, String path, String famous) {
        return dao.updateOfPathAndFamous(user, path, famous);
    }
    public int updateOfPathAndBUserIds(User user, String path, String bUserIds) {
        return dao.updateOfPathAndBUserIds(user, path, bUserIds);
    }
    public int updateOfParamAndLvl(User user, String param, String lvl) {
        return dao.updateOfParamAndLvl(user, param, lvl);
    }
    public int updateOfParamAndNewIds(User user, String param, String newIds) {
        return dao.updateOfParamAndNewIds(user, param, newIds);
    }
    public int updateOfParamAndUserIds(User user, String param, String userIds) {
        return dao.updateOfParamAndUserIds(user, param, userIds);
    }
    public int updateOfParamAndDesc(User user, String param, String desc) {
        return dao.updateOfParamAndDesc(user, param, desc);
    }
    public int updateOfParamAndImage(User user, String param, String image) {
        return dao.updateOfParamAndImage(user, param, image);
    }
    public int updateOfParamAndFamous(User user, String param, String famous) {
        return dao.updateOfParamAndFamous(user, param, famous);
    }
    public int updateOfParamAndBUserIds(User user, String param, String bUserIds) {
        return dao.updateOfParamAndBUserIds(user, param, bUserIds);
    }
    public int updateOfLvlAndNewIds(User user, String lvl, String newIds) {
        return dao.updateOfLvlAndNewIds(user, lvl, newIds);
    }
    public int updateOfLvlAndUserIds(User user, String lvl, String userIds) {
        return dao.updateOfLvlAndUserIds(user, lvl, userIds);
    }
    public int updateOfLvlAndDesc(User user, String lvl, String desc) {
        return dao.updateOfLvlAndDesc(user, lvl, desc);
    }
    public int updateOfLvlAndImage(User user, String lvl, String image) {
        return dao.updateOfLvlAndImage(user, lvl, image);
    }
    public int updateOfLvlAndFamous(User user, String lvl, String famous) {
        return dao.updateOfLvlAndFamous(user, lvl, famous);
    }
    public int updateOfLvlAndBUserIds(User user, String lvl, String bUserIds) {
        return dao.updateOfLvlAndBUserIds(user, lvl, bUserIds);
    }
    public int updateOfNewIdsAndUserIds(User user, String newIds, String userIds) {
        return dao.updateOfNewIdsAndUserIds(user, newIds, userIds);
    }
    public int updateOfNewIdsAndDesc(User user, String newIds, String desc) {
        return dao.updateOfNewIdsAndDesc(user, newIds, desc);
    }
    public int updateOfNewIdsAndImage(User user, String newIds, String image) {
        return dao.updateOfNewIdsAndImage(user, newIds, image);
    }
    public int updateOfNewIdsAndFamous(User user, String newIds, String famous) {
        return dao.updateOfNewIdsAndFamous(user, newIds, famous);
    }
    public int updateOfNewIdsAndBUserIds(User user, String newIds, String bUserIds) {
        return dao.updateOfNewIdsAndBUserIds(user, newIds, bUserIds);
    }
    public int updateOfUserIdsAndDesc(User user, String userIds, String desc) {
        return dao.updateOfUserIdsAndDesc(user, userIds, desc);
    }
    public int updateOfUserIdsAndImage(User user, String userIds, String image) {
        return dao.updateOfUserIdsAndImage(user, userIds, image);
    }
    public int updateOfUserIdsAndFamous(User user, String userIds, String famous) {
        return dao.updateOfUserIdsAndFamous(user, userIds, famous);
    }
    public int updateOfUserIdsAndBUserIds(User user, String userIds, String bUserIds) {
        return dao.updateOfUserIdsAndBUserIds(user, userIds, bUserIds);
    }
    public int updateOfDescAndImage(User user, String desc, String image) {
        return dao.updateOfDescAndImage(user, desc, image);
    }
    public int updateOfDescAndFamous(User user, String desc, String famous) {
        return dao.updateOfDescAndFamous(user, desc, famous);
    }
    public int updateOfDescAndBUserIds(User user, String desc, String bUserIds) {
        return dao.updateOfDescAndBUserIds(user, desc, bUserIds);
    }
    public int updateOfImageAndFamous(User user, String image, String famous) {
        return dao.updateOfImageAndFamous(user, image, famous);
    }
    public int updateOfImageAndBUserIds(User user, String image, String bUserIds) {
        return dao.updateOfImageAndBUserIds(user, image, bUserIds);
    }
    public int updateOfFamousAndBUserIds(User user, String famous, String bUserIds) {
        return dao.updateOfFamousAndBUserIds(user, famous, bUserIds);
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
    public int removeOfName(String name) {
        return dao.removeOfName(name);
    }
    public int removeOfSex(String sex) {
        return dao.removeOfSex(sex);
    }
    public int removeOfRegisterDate(String registerDate) {
        return dao.removeOfRegisterDate(registerDate);
    }
    public int removeOfLoginDate(String loginDate) {
        return dao.removeOfLoginDate(loginDate);
    }
    public int removeOfPhone(String phone) {
        return dao.removeOfPhone(phone);
    }
    public int removeOfEmail(String email) {
        return dao.removeOfEmail(email);
    }
    public int removeOfMoney(String money) {
        return dao.removeOfMoney(money);
    }
    public int removeOfScore(String score) {
        return dao.removeOfScore(score);
    }
    public int removeOfPath(String path) {
        return dao.removeOfPath(path);
    }
    public int removeOfParam(String param) {
        return dao.removeOfParam(param);
    }
    public int removeOfLvl(String lvl) {
        return dao.removeOfLvl(lvl);
    }
    public int removeOfNewIds(String newIds) {
        return dao.removeOfNewIds(newIds);
    }
    public int removeOfUserIds(String userIds) {
        return dao.removeOfUserIds(userIds);
    }
    public int removeOfDesc(String desc) {
        return dao.removeOfDesc(desc);
    }
    public int removeOfImage(String image) {
        return dao.removeOfImage(image);
    }
    public int removeOfFamous(String famous) {
        return dao.removeOfFamous(famous);
    }
    public int removeOfBUserIds(String bUserIds) {
        return dao.removeOfBUserIds(bUserIds);
    }
    public int removeOfUserIdAndPassword(String userId, String password) {
        return dao.removeOfUserIdAndPassword(userId, password);
    }
    public int removeOfUserIdAndName(String userId, String name) {
        return dao.removeOfUserIdAndName(userId, name);
    }
    public int removeOfUserIdAndSex(String userId, String sex) {
        return dao.removeOfUserIdAndSex(userId, sex);
    }
    public int removeOfUserIdAndRegisterDate(String userId, String registerDate) {
        return dao.removeOfUserIdAndRegisterDate(userId, registerDate);
    }
    public int removeOfUserIdAndLoginDate(String userId, String loginDate) {
        return dao.removeOfUserIdAndLoginDate(userId, loginDate);
    }
    public int removeOfUserIdAndPhone(String userId, String phone) {
        return dao.removeOfUserIdAndPhone(userId, phone);
    }
    public int removeOfUserIdAndEmail(String userId, String email) {
        return dao.removeOfUserIdAndEmail(userId, email);
    }
    public int removeOfUserIdAndMoney(String userId, String money) {
        return dao.removeOfUserIdAndMoney(userId, money);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        return dao.removeOfUserIdAndScore(userId, score);
    }
    public int removeOfUserIdAndPath(String userId, String path) {
        return dao.removeOfUserIdAndPath(userId, path);
    }
    public int removeOfUserIdAndParam(String userId, String param) {
        return dao.removeOfUserIdAndParam(userId, param);
    }
    public int removeOfUserIdAndLvl(String userId, String lvl) {
        return dao.removeOfUserIdAndLvl(userId, lvl);
    }
    public int removeOfUserIdAndNewIds(String userId, String newIds) {
        return dao.removeOfUserIdAndNewIds(userId, newIds);
    }
    public int removeOfUserIdAndUserIds(String userId, String userIds) {
        return dao.removeOfUserIdAndUserIds(userId, userIds);
    }
    public int removeOfUserIdAndDesc(String userId, String desc) {
        return dao.removeOfUserIdAndDesc(userId, desc);
    }
    public int removeOfUserIdAndImage(String userId, String image) {
        return dao.removeOfUserIdAndImage(userId, image);
    }
    public int removeOfUserIdAndFamous(String userId, String famous) {
        return dao.removeOfUserIdAndFamous(userId, famous);
    }
    public int removeOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.removeOfUserIdAndBUserIds(userId, bUserIds);
    }
    public int removeOfPasswordAndName(String password, String name) {
        return dao.removeOfPasswordAndName(password, name);
    }
    public int removeOfPasswordAndSex(String password, String sex) {
        return dao.removeOfPasswordAndSex(password, sex);
    }
    public int removeOfPasswordAndRegisterDate(String password, String registerDate) {
        return dao.removeOfPasswordAndRegisterDate(password, registerDate);
    }
    public int removeOfPasswordAndLoginDate(String password, String loginDate) {
        return dao.removeOfPasswordAndLoginDate(password, loginDate);
    }
    public int removeOfPasswordAndPhone(String password, String phone) {
        return dao.removeOfPasswordAndPhone(password, phone);
    }
    public int removeOfPasswordAndEmail(String password, String email) {
        return dao.removeOfPasswordAndEmail(password, email);
    }
    public int removeOfPasswordAndMoney(String password, String money) {
        return dao.removeOfPasswordAndMoney(password, money);
    }
    public int removeOfPasswordAndScore(String password, String score) {
        return dao.removeOfPasswordAndScore(password, score);
    }
    public int removeOfPasswordAndPath(String password, String path) {
        return dao.removeOfPasswordAndPath(password, path);
    }
    public int removeOfPasswordAndParam(String password, String param) {
        return dao.removeOfPasswordAndParam(password, param);
    }
    public int removeOfPasswordAndLvl(String password, String lvl) {
        return dao.removeOfPasswordAndLvl(password, lvl);
    }
    public int removeOfPasswordAndNewIds(String password, String newIds) {
        return dao.removeOfPasswordAndNewIds(password, newIds);
    }
    public int removeOfPasswordAndUserIds(String password, String userIds) {
        return dao.removeOfPasswordAndUserIds(password, userIds);
    }
    public int removeOfPasswordAndDesc(String password, String desc) {
        return dao.removeOfPasswordAndDesc(password, desc);
    }
    public int removeOfPasswordAndImage(String password, String image) {
        return dao.removeOfPasswordAndImage(password, image);
    }
    public int removeOfPasswordAndFamous(String password, String famous) {
        return dao.removeOfPasswordAndFamous(password, famous);
    }
    public int removeOfPasswordAndBUserIds(String password, String bUserIds) {
        return dao.removeOfPasswordAndBUserIds(password, bUserIds);
    }
    public int removeOfNameAndSex(String name, String sex) {
        return dao.removeOfNameAndSex(name, sex);
    }
    public int removeOfNameAndRegisterDate(String name, String registerDate) {
        return dao.removeOfNameAndRegisterDate(name, registerDate);
    }
    public int removeOfNameAndLoginDate(String name, String loginDate) {
        return dao.removeOfNameAndLoginDate(name, loginDate);
    }
    public int removeOfNameAndPhone(String name, String phone) {
        return dao.removeOfNameAndPhone(name, phone);
    }
    public int removeOfNameAndEmail(String name, String email) {
        return dao.removeOfNameAndEmail(name, email);
    }
    public int removeOfNameAndMoney(String name, String money) {
        return dao.removeOfNameAndMoney(name, money);
    }
    public int removeOfNameAndScore(String name, String score) {
        return dao.removeOfNameAndScore(name, score);
    }
    public int removeOfNameAndPath(String name, String path) {
        return dao.removeOfNameAndPath(name, path);
    }
    public int removeOfNameAndParam(String name, String param) {
        return dao.removeOfNameAndParam(name, param);
    }
    public int removeOfNameAndLvl(String name, String lvl) {
        return dao.removeOfNameAndLvl(name, lvl);
    }
    public int removeOfNameAndNewIds(String name, String newIds) {
        return dao.removeOfNameAndNewIds(name, newIds);
    }
    public int removeOfNameAndUserIds(String name, String userIds) {
        return dao.removeOfNameAndUserIds(name, userIds);
    }
    public int removeOfNameAndDesc(String name, String desc) {
        return dao.removeOfNameAndDesc(name, desc);
    }
    public int removeOfNameAndImage(String name, String image) {
        return dao.removeOfNameAndImage(name, image);
    }
    public int removeOfNameAndFamous(String name, String famous) {
        return dao.removeOfNameAndFamous(name, famous);
    }
    public int removeOfNameAndBUserIds(String name, String bUserIds) {
        return dao.removeOfNameAndBUserIds(name, bUserIds);
    }
    public int removeOfSexAndRegisterDate(String sex, String registerDate) {
        return dao.removeOfSexAndRegisterDate(sex, registerDate);
    }
    public int removeOfSexAndLoginDate(String sex, String loginDate) {
        return dao.removeOfSexAndLoginDate(sex, loginDate);
    }
    public int removeOfSexAndPhone(String sex, String phone) {
        return dao.removeOfSexAndPhone(sex, phone);
    }
    public int removeOfSexAndEmail(String sex, String email) {
        return dao.removeOfSexAndEmail(sex, email);
    }
    public int removeOfSexAndMoney(String sex, String money) {
        return dao.removeOfSexAndMoney(sex, money);
    }
    public int removeOfSexAndScore(String sex, String score) {
        return dao.removeOfSexAndScore(sex, score);
    }
    public int removeOfSexAndPath(String sex, String path) {
        return dao.removeOfSexAndPath(sex, path);
    }
    public int removeOfSexAndParam(String sex, String param) {
        return dao.removeOfSexAndParam(sex, param);
    }
    public int removeOfSexAndLvl(String sex, String lvl) {
        return dao.removeOfSexAndLvl(sex, lvl);
    }
    public int removeOfSexAndNewIds(String sex, String newIds) {
        return dao.removeOfSexAndNewIds(sex, newIds);
    }
    public int removeOfSexAndUserIds(String sex, String userIds) {
        return dao.removeOfSexAndUserIds(sex, userIds);
    }
    public int removeOfSexAndDesc(String sex, String desc) {
        return dao.removeOfSexAndDesc(sex, desc);
    }
    public int removeOfSexAndImage(String sex, String image) {
        return dao.removeOfSexAndImage(sex, image);
    }
    public int removeOfSexAndFamous(String sex, String famous) {
        return dao.removeOfSexAndFamous(sex, famous);
    }
    public int removeOfSexAndBUserIds(String sex, String bUserIds) {
        return dao.removeOfSexAndBUserIds(sex, bUserIds);
    }
    public int removeOfRegisterDateAndLoginDate(String registerDate, String loginDate) {
        return dao.removeOfRegisterDateAndLoginDate(registerDate, loginDate);
    }
    public int removeOfRegisterDateAndPhone(String registerDate, String phone) {
        return dao.removeOfRegisterDateAndPhone(registerDate, phone);
    }
    public int removeOfRegisterDateAndEmail(String registerDate, String email) {
        return dao.removeOfRegisterDateAndEmail(registerDate, email);
    }
    public int removeOfRegisterDateAndMoney(String registerDate, String money) {
        return dao.removeOfRegisterDateAndMoney(registerDate, money);
    }
    public int removeOfRegisterDateAndScore(String registerDate, String score) {
        return dao.removeOfRegisterDateAndScore(registerDate, score);
    }
    public int removeOfRegisterDateAndPath(String registerDate, String path) {
        return dao.removeOfRegisterDateAndPath(registerDate, path);
    }
    public int removeOfRegisterDateAndParam(String registerDate, String param) {
        return dao.removeOfRegisterDateAndParam(registerDate, param);
    }
    public int removeOfRegisterDateAndLvl(String registerDate, String lvl) {
        return dao.removeOfRegisterDateAndLvl(registerDate, lvl);
    }
    public int removeOfRegisterDateAndNewIds(String registerDate, String newIds) {
        return dao.removeOfRegisterDateAndNewIds(registerDate, newIds);
    }
    public int removeOfRegisterDateAndUserIds(String registerDate, String userIds) {
        return dao.removeOfRegisterDateAndUserIds(registerDate, userIds);
    }
    public int removeOfRegisterDateAndDesc(String registerDate, String desc) {
        return dao.removeOfRegisterDateAndDesc(registerDate, desc);
    }
    public int removeOfRegisterDateAndImage(String registerDate, String image) {
        return dao.removeOfRegisterDateAndImage(registerDate, image);
    }
    public int removeOfRegisterDateAndFamous(String registerDate, String famous) {
        return dao.removeOfRegisterDateAndFamous(registerDate, famous);
    }
    public int removeOfRegisterDateAndBUserIds(String registerDate, String bUserIds) {
        return dao.removeOfRegisterDateAndBUserIds(registerDate, bUserIds);
    }
    public int removeOfLoginDateAndPhone(String loginDate, String phone) {
        return dao.removeOfLoginDateAndPhone(loginDate, phone);
    }
    public int removeOfLoginDateAndEmail(String loginDate, String email) {
        return dao.removeOfLoginDateAndEmail(loginDate, email);
    }
    public int removeOfLoginDateAndMoney(String loginDate, String money) {
        return dao.removeOfLoginDateAndMoney(loginDate, money);
    }
    public int removeOfLoginDateAndScore(String loginDate, String score) {
        return dao.removeOfLoginDateAndScore(loginDate, score);
    }
    public int removeOfLoginDateAndPath(String loginDate, String path) {
        return dao.removeOfLoginDateAndPath(loginDate, path);
    }
    public int removeOfLoginDateAndParam(String loginDate, String param) {
        return dao.removeOfLoginDateAndParam(loginDate, param);
    }
    public int removeOfLoginDateAndLvl(String loginDate, String lvl) {
        return dao.removeOfLoginDateAndLvl(loginDate, lvl);
    }
    public int removeOfLoginDateAndNewIds(String loginDate, String newIds) {
        return dao.removeOfLoginDateAndNewIds(loginDate, newIds);
    }
    public int removeOfLoginDateAndUserIds(String loginDate, String userIds) {
        return dao.removeOfLoginDateAndUserIds(loginDate, userIds);
    }
    public int removeOfLoginDateAndDesc(String loginDate, String desc) {
        return dao.removeOfLoginDateAndDesc(loginDate, desc);
    }
    public int removeOfLoginDateAndImage(String loginDate, String image) {
        return dao.removeOfLoginDateAndImage(loginDate, image);
    }
    public int removeOfLoginDateAndFamous(String loginDate, String famous) {
        return dao.removeOfLoginDateAndFamous(loginDate, famous);
    }
    public int removeOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        return dao.removeOfLoginDateAndBUserIds(loginDate, bUserIds);
    }
    public int removeOfPhoneAndEmail(String phone, String email) {
        return dao.removeOfPhoneAndEmail(phone, email);
    }
    public int removeOfPhoneAndMoney(String phone, String money) {
        return dao.removeOfPhoneAndMoney(phone, money);
    }
    public int removeOfPhoneAndScore(String phone, String score) {
        return dao.removeOfPhoneAndScore(phone, score);
    }
    public int removeOfPhoneAndPath(String phone, String path) {
        return dao.removeOfPhoneAndPath(phone, path);
    }
    public int removeOfPhoneAndParam(String phone, String param) {
        return dao.removeOfPhoneAndParam(phone, param);
    }
    public int removeOfPhoneAndLvl(String phone, String lvl) {
        return dao.removeOfPhoneAndLvl(phone, lvl);
    }
    public int removeOfPhoneAndNewIds(String phone, String newIds) {
        return dao.removeOfPhoneAndNewIds(phone, newIds);
    }
    public int removeOfPhoneAndUserIds(String phone, String userIds) {
        return dao.removeOfPhoneAndUserIds(phone, userIds);
    }
    public int removeOfPhoneAndDesc(String phone, String desc) {
        return dao.removeOfPhoneAndDesc(phone, desc);
    }
    public int removeOfPhoneAndImage(String phone, String image) {
        return dao.removeOfPhoneAndImage(phone, image);
    }
    public int removeOfPhoneAndFamous(String phone, String famous) {
        return dao.removeOfPhoneAndFamous(phone, famous);
    }
    public int removeOfPhoneAndBUserIds(String phone, String bUserIds) {
        return dao.removeOfPhoneAndBUserIds(phone, bUserIds);
    }
    public int removeOfEmailAndMoney(String email, String money) {
        return dao.removeOfEmailAndMoney(email, money);
    }
    public int removeOfEmailAndScore(String email, String score) {
        return dao.removeOfEmailAndScore(email, score);
    }
    public int removeOfEmailAndPath(String email, String path) {
        return dao.removeOfEmailAndPath(email, path);
    }
    public int removeOfEmailAndParam(String email, String param) {
        return dao.removeOfEmailAndParam(email, param);
    }
    public int removeOfEmailAndLvl(String email, String lvl) {
        return dao.removeOfEmailAndLvl(email, lvl);
    }
    public int removeOfEmailAndNewIds(String email, String newIds) {
        return dao.removeOfEmailAndNewIds(email, newIds);
    }
    public int removeOfEmailAndUserIds(String email, String userIds) {
        return dao.removeOfEmailAndUserIds(email, userIds);
    }
    public int removeOfEmailAndDesc(String email, String desc) {
        return dao.removeOfEmailAndDesc(email, desc);
    }
    public int removeOfEmailAndImage(String email, String image) {
        return dao.removeOfEmailAndImage(email, image);
    }
    public int removeOfEmailAndFamous(String email, String famous) {
        return dao.removeOfEmailAndFamous(email, famous);
    }
    public int removeOfEmailAndBUserIds(String email, String bUserIds) {
        return dao.removeOfEmailAndBUserIds(email, bUserIds);
    }
    public int removeOfMoneyAndScore(String money, String score) {
        return dao.removeOfMoneyAndScore(money, score);
    }
    public int removeOfMoneyAndPath(String money, String path) {
        return dao.removeOfMoneyAndPath(money, path);
    }
    public int removeOfMoneyAndParam(String money, String param) {
        return dao.removeOfMoneyAndParam(money, param);
    }
    public int removeOfMoneyAndLvl(String money, String lvl) {
        return dao.removeOfMoneyAndLvl(money, lvl);
    }
    public int removeOfMoneyAndNewIds(String money, String newIds) {
        return dao.removeOfMoneyAndNewIds(money, newIds);
    }
    public int removeOfMoneyAndUserIds(String money, String userIds) {
        return dao.removeOfMoneyAndUserIds(money, userIds);
    }
    public int removeOfMoneyAndDesc(String money, String desc) {
        return dao.removeOfMoneyAndDesc(money, desc);
    }
    public int removeOfMoneyAndImage(String money, String image) {
        return dao.removeOfMoneyAndImage(money, image);
    }
    public int removeOfMoneyAndFamous(String money, String famous) {
        return dao.removeOfMoneyAndFamous(money, famous);
    }
    public int removeOfMoneyAndBUserIds(String money, String bUserIds) {
        return dao.removeOfMoneyAndBUserIds(money, bUserIds);
    }
    public int removeOfScoreAndPath(String score, String path) {
        return dao.removeOfScoreAndPath(score, path);
    }
    public int removeOfScoreAndParam(String score, String param) {
        return dao.removeOfScoreAndParam(score, param);
    }
    public int removeOfScoreAndLvl(String score, String lvl) {
        return dao.removeOfScoreAndLvl(score, lvl);
    }
    public int removeOfScoreAndNewIds(String score, String newIds) {
        return dao.removeOfScoreAndNewIds(score, newIds);
    }
    public int removeOfScoreAndUserIds(String score, String userIds) {
        return dao.removeOfScoreAndUserIds(score, userIds);
    }
    public int removeOfScoreAndDesc(String score, String desc) {
        return dao.removeOfScoreAndDesc(score, desc);
    }
    public int removeOfScoreAndImage(String score, String image) {
        return dao.removeOfScoreAndImage(score, image);
    }
    public int removeOfScoreAndFamous(String score, String famous) {
        return dao.removeOfScoreAndFamous(score, famous);
    }
    public int removeOfScoreAndBUserIds(String score, String bUserIds) {
        return dao.removeOfScoreAndBUserIds(score, bUserIds);
    }
    public int removeOfPathAndParam(String path, String param) {
        return dao.removeOfPathAndParam(path, param);
    }
    public int removeOfPathAndLvl(String path, String lvl) {
        return dao.removeOfPathAndLvl(path, lvl);
    }
    public int removeOfPathAndNewIds(String path, String newIds) {
        return dao.removeOfPathAndNewIds(path, newIds);
    }
    public int removeOfPathAndUserIds(String path, String userIds) {
        return dao.removeOfPathAndUserIds(path, userIds);
    }
    public int removeOfPathAndDesc(String path, String desc) {
        return dao.removeOfPathAndDesc(path, desc);
    }
    public int removeOfPathAndImage(String path, String image) {
        return dao.removeOfPathAndImage(path, image);
    }
    public int removeOfPathAndFamous(String path, String famous) {
        return dao.removeOfPathAndFamous(path, famous);
    }
    public int removeOfPathAndBUserIds(String path, String bUserIds) {
        return dao.removeOfPathAndBUserIds(path, bUserIds);
    }
    public int removeOfParamAndLvl(String param, String lvl) {
        return dao.removeOfParamAndLvl(param, lvl);
    }
    public int removeOfParamAndNewIds(String param, String newIds) {
        return dao.removeOfParamAndNewIds(param, newIds);
    }
    public int removeOfParamAndUserIds(String param, String userIds) {
        return dao.removeOfParamAndUserIds(param, userIds);
    }
    public int removeOfParamAndDesc(String param, String desc) {
        return dao.removeOfParamAndDesc(param, desc);
    }
    public int removeOfParamAndImage(String param, String image) {
        return dao.removeOfParamAndImage(param, image);
    }
    public int removeOfParamAndFamous(String param, String famous) {
        return dao.removeOfParamAndFamous(param, famous);
    }
    public int removeOfParamAndBUserIds(String param, String bUserIds) {
        return dao.removeOfParamAndBUserIds(param, bUserIds);
    }
    public int removeOfLvlAndNewIds(String lvl, String newIds) {
        return dao.removeOfLvlAndNewIds(lvl, newIds);
    }
    public int removeOfLvlAndUserIds(String lvl, String userIds) {
        return dao.removeOfLvlAndUserIds(lvl, userIds);
    }
    public int removeOfLvlAndDesc(String lvl, String desc) {
        return dao.removeOfLvlAndDesc(lvl, desc);
    }
    public int removeOfLvlAndImage(String lvl, String image) {
        return dao.removeOfLvlAndImage(lvl, image);
    }
    public int removeOfLvlAndFamous(String lvl, String famous) {
        return dao.removeOfLvlAndFamous(lvl, famous);
    }
    public int removeOfLvlAndBUserIds(String lvl, String bUserIds) {
        return dao.removeOfLvlAndBUserIds(lvl, bUserIds);
    }
    public int removeOfNewIdsAndUserIds(String newIds, String userIds) {
        return dao.removeOfNewIdsAndUserIds(newIds, userIds);
    }
    public int removeOfNewIdsAndDesc(String newIds, String desc) {
        return dao.removeOfNewIdsAndDesc(newIds, desc);
    }
    public int removeOfNewIdsAndImage(String newIds, String image) {
        return dao.removeOfNewIdsAndImage(newIds, image);
    }
    public int removeOfNewIdsAndFamous(String newIds, String famous) {
        return dao.removeOfNewIdsAndFamous(newIds, famous);
    }
    public int removeOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        return dao.removeOfNewIdsAndBUserIds(newIds, bUserIds);
    }
    public int removeOfUserIdsAndDesc(String userIds, String desc) {
        return dao.removeOfUserIdsAndDesc(userIds, desc);
    }
    public int removeOfUserIdsAndImage(String userIds, String image) {
        return dao.removeOfUserIdsAndImage(userIds, image);
    }
    public int removeOfUserIdsAndFamous(String userIds, String famous) {
        return dao.removeOfUserIdsAndFamous(userIds, famous);
    }
    public int removeOfUserIdsAndBUserIds(String userIds, String bUserIds) {
        return dao.removeOfUserIdsAndBUserIds(userIds, bUserIds);
    }
    public int removeOfDescAndImage(String desc, String image) {
        return dao.removeOfDescAndImage(desc, image);
    }
    public int removeOfDescAndFamous(String desc, String famous) {
        return dao.removeOfDescAndFamous(desc, famous);
    }
    public int removeOfDescAndBUserIds(String desc, String bUserIds) {
        return dao.removeOfDescAndBUserIds(desc, bUserIds);
    }
    public int removeOfImageAndFamous(String image, String famous) {
        return dao.removeOfImageAndFamous(image, famous);
    }
    public int removeOfImageAndBUserIds(String image, String bUserIds) {
        return dao.removeOfImageAndBUserIds(image, bUserIds);
    }
    public int removeOfFamousAndBUserIds(String famous, String bUserIds) {
        return dao.removeOfFamousAndBUserIds(famous, bUserIds);
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
    public int insertOfName(String name) {
        return dao.insertOfName(name);
    }
    public int insertOfSex(String sex) {
        return dao.insertOfSex(sex);
    }
    public int insertOfRegisterDate(String registerDate) {
        return dao.insertOfRegisterDate(registerDate);
    }
    public int insertOfLoginDate(String loginDate) {
        return dao.insertOfLoginDate(loginDate);
    }
    public int insertOfPhone(String phone) {
        return dao.insertOfPhone(phone);
    }
    public int insertOfEmail(String email) {
        return dao.insertOfEmail(email);
    }
    public int insertOfMoney(String money) {
        return dao.insertOfMoney(money);
    }
    public int insertOfScore(String score) {
        return dao.insertOfScore(score);
    }
    public int insertOfPath(String path) {
        return dao.insertOfPath(path);
    }
    public int insertOfParam(String param) {
        return dao.insertOfParam(param);
    }
    public int insertOfLvl(String lvl) {
        return dao.insertOfLvl(lvl);
    }
    public int insertOfNewIds(String newIds) {
        return dao.insertOfNewIds(newIds);
    }
    public int insertOfUserIds(String userIds) {
        return dao.insertOfUserIds(userIds);
    }
    public int insertOfDesc(String desc) {
        return dao.insertOfDesc(desc);
    }
    public int insertOfImage(String image) {
        return dao.insertOfImage(image);
    }
    public int insertOfFamous(String famous) {
        return dao.insertOfFamous(famous);
    }
    public int insertOfBUserIds(String bUserIds) {
        return dao.insertOfBUserIds(bUserIds);
    }
    public int insertOfUserIdAndPassword(String userId, String password) {
        return dao.insertOfUserIdAndPassword(userId, password);
    }
    public int insertOfUserIdAndName(String userId, String name) {
        return dao.insertOfUserIdAndName(userId, name);
    }
    public int insertOfUserIdAndSex(String userId, String sex) {
        return dao.insertOfUserIdAndSex(userId, sex);
    }
    public int insertOfUserIdAndRegisterDate(String userId, String registerDate) {
        return dao.insertOfUserIdAndRegisterDate(userId, registerDate);
    }
    public int insertOfUserIdAndLoginDate(String userId, String loginDate) {
        return dao.insertOfUserIdAndLoginDate(userId, loginDate);
    }
    public int insertOfUserIdAndPhone(String userId, String phone) {
        return dao.insertOfUserIdAndPhone(userId, phone);
    }
    public int insertOfUserIdAndEmail(String userId, String email) {
        return dao.insertOfUserIdAndEmail(userId, email);
    }
    public int insertOfUserIdAndMoney(String userId, String money) {
        return dao.insertOfUserIdAndMoney(userId, money);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        return dao.insertOfUserIdAndScore(userId, score);
    }
    public int insertOfUserIdAndPath(String userId, String path) {
        return dao.insertOfUserIdAndPath(userId, path);
    }
    public int insertOfUserIdAndParam(String userId, String param) {
        return dao.insertOfUserIdAndParam(userId, param);
    }
    public int insertOfUserIdAndLvl(String userId, String lvl) {
        return dao.insertOfUserIdAndLvl(userId, lvl);
    }
    public int insertOfUserIdAndNewIds(String userId, String newIds) {
        return dao.insertOfUserIdAndNewIds(userId, newIds);
    }
    public int insertOfUserIdAndUserIds(String userId, String userIds) {
        return dao.insertOfUserIdAndUserIds(userId, userIds);
    }
    public int insertOfUserIdAndDesc(String userId, String desc) {
        return dao.insertOfUserIdAndDesc(userId, desc);
    }
    public int insertOfUserIdAndImage(String userId, String image) {
        return dao.insertOfUserIdAndImage(userId, image);
    }
    public int insertOfUserIdAndFamous(String userId, String famous) {
        return dao.insertOfUserIdAndFamous(userId, famous);
    }
    public int insertOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.insertOfUserIdAndBUserIds(userId, bUserIds);
    }
    public int insertOfPasswordAndName(String password, String name) {
        return dao.insertOfPasswordAndName(password, name);
    }
    public int insertOfPasswordAndSex(String password, String sex) {
        return dao.insertOfPasswordAndSex(password, sex);
    }
    public int insertOfPasswordAndRegisterDate(String password, String registerDate) {
        return dao.insertOfPasswordAndRegisterDate(password, registerDate);
    }
    public int insertOfPasswordAndLoginDate(String password, String loginDate) {
        return dao.insertOfPasswordAndLoginDate(password, loginDate);
    }
    public int insertOfPasswordAndPhone(String password, String phone) {
        return dao.insertOfPasswordAndPhone(password, phone);
    }
    public int insertOfPasswordAndEmail(String password, String email) {
        return dao.insertOfPasswordAndEmail(password, email);
    }
    public int insertOfPasswordAndMoney(String password, String money) {
        return dao.insertOfPasswordAndMoney(password, money);
    }
    public int insertOfPasswordAndScore(String password, String score) {
        return dao.insertOfPasswordAndScore(password, score);
    }
    public int insertOfPasswordAndPath(String password, String path) {
        return dao.insertOfPasswordAndPath(password, path);
    }
    public int insertOfPasswordAndParam(String password, String param) {
        return dao.insertOfPasswordAndParam(password, param);
    }
    public int insertOfPasswordAndLvl(String password, String lvl) {
        return dao.insertOfPasswordAndLvl(password, lvl);
    }
    public int insertOfPasswordAndNewIds(String password, String newIds) {
        return dao.insertOfPasswordAndNewIds(password, newIds);
    }
    public int insertOfPasswordAndUserIds(String password, String userIds) {
        return dao.insertOfPasswordAndUserIds(password, userIds);
    }
    public int insertOfPasswordAndDesc(String password, String desc) {
        return dao.insertOfPasswordAndDesc(password, desc);
    }
    public int insertOfPasswordAndImage(String password, String image) {
        return dao.insertOfPasswordAndImage(password, image);
    }
    public int insertOfPasswordAndFamous(String password, String famous) {
        return dao.insertOfPasswordAndFamous(password, famous);
    }
    public int insertOfPasswordAndBUserIds(String password, String bUserIds) {
        return dao.insertOfPasswordAndBUserIds(password, bUserIds);
    }
    public int insertOfNameAndSex(String name, String sex) {
        return dao.insertOfNameAndSex(name, sex);
    }
    public int insertOfNameAndRegisterDate(String name, String registerDate) {
        return dao.insertOfNameAndRegisterDate(name, registerDate);
    }
    public int insertOfNameAndLoginDate(String name, String loginDate) {
        return dao.insertOfNameAndLoginDate(name, loginDate);
    }
    public int insertOfNameAndPhone(String name, String phone) {
        return dao.insertOfNameAndPhone(name, phone);
    }
    public int insertOfNameAndEmail(String name, String email) {
        return dao.insertOfNameAndEmail(name, email);
    }
    public int insertOfNameAndMoney(String name, String money) {
        return dao.insertOfNameAndMoney(name, money);
    }
    public int insertOfNameAndScore(String name, String score) {
        return dao.insertOfNameAndScore(name, score);
    }
    public int insertOfNameAndPath(String name, String path) {
        return dao.insertOfNameAndPath(name, path);
    }
    public int insertOfNameAndParam(String name, String param) {
        return dao.insertOfNameAndParam(name, param);
    }
    public int insertOfNameAndLvl(String name, String lvl) {
        return dao.insertOfNameAndLvl(name, lvl);
    }
    public int insertOfNameAndNewIds(String name, String newIds) {
        return dao.insertOfNameAndNewIds(name, newIds);
    }
    public int insertOfNameAndUserIds(String name, String userIds) {
        return dao.insertOfNameAndUserIds(name, userIds);
    }
    public int insertOfNameAndDesc(String name, String desc) {
        return dao.insertOfNameAndDesc(name, desc);
    }
    public int insertOfNameAndImage(String name, String image) {
        return dao.insertOfNameAndImage(name, image);
    }
    public int insertOfNameAndFamous(String name, String famous) {
        return dao.insertOfNameAndFamous(name, famous);
    }
    public int insertOfNameAndBUserIds(String name, String bUserIds) {
        return dao.insertOfNameAndBUserIds(name, bUserIds);
    }
    public int insertOfSexAndRegisterDate(String sex, String registerDate) {
        return dao.insertOfSexAndRegisterDate(sex, registerDate);
    }
    public int insertOfSexAndLoginDate(String sex, String loginDate) {
        return dao.insertOfSexAndLoginDate(sex, loginDate);
    }
    public int insertOfSexAndPhone(String sex, String phone) {
        return dao.insertOfSexAndPhone(sex, phone);
    }
    public int insertOfSexAndEmail(String sex, String email) {
        return dao.insertOfSexAndEmail(sex, email);
    }
    public int insertOfSexAndMoney(String sex, String money) {
        return dao.insertOfSexAndMoney(sex, money);
    }
    public int insertOfSexAndScore(String sex, String score) {
        return dao.insertOfSexAndScore(sex, score);
    }
    public int insertOfSexAndPath(String sex, String path) {
        return dao.insertOfSexAndPath(sex, path);
    }
    public int insertOfSexAndParam(String sex, String param) {
        return dao.insertOfSexAndParam(sex, param);
    }
    public int insertOfSexAndLvl(String sex, String lvl) {
        return dao.insertOfSexAndLvl(sex, lvl);
    }
    public int insertOfSexAndNewIds(String sex, String newIds) {
        return dao.insertOfSexAndNewIds(sex, newIds);
    }
    public int insertOfSexAndUserIds(String sex, String userIds) {
        return dao.insertOfSexAndUserIds(sex, userIds);
    }
    public int insertOfSexAndDesc(String sex, String desc) {
        return dao.insertOfSexAndDesc(sex, desc);
    }
    public int insertOfSexAndImage(String sex, String image) {
        return dao.insertOfSexAndImage(sex, image);
    }
    public int insertOfSexAndFamous(String sex, String famous) {
        return dao.insertOfSexAndFamous(sex, famous);
    }
    public int insertOfSexAndBUserIds(String sex, String bUserIds) {
        return dao.insertOfSexAndBUserIds(sex, bUserIds);
    }
    public int insertOfRegisterDateAndLoginDate(String registerDate, String loginDate) {
        return dao.insertOfRegisterDateAndLoginDate(registerDate, loginDate);
    }
    public int insertOfRegisterDateAndPhone(String registerDate, String phone) {
        return dao.insertOfRegisterDateAndPhone(registerDate, phone);
    }
    public int insertOfRegisterDateAndEmail(String registerDate, String email) {
        return dao.insertOfRegisterDateAndEmail(registerDate, email);
    }
    public int insertOfRegisterDateAndMoney(String registerDate, String money) {
        return dao.insertOfRegisterDateAndMoney(registerDate, money);
    }
    public int insertOfRegisterDateAndScore(String registerDate, String score) {
        return dao.insertOfRegisterDateAndScore(registerDate, score);
    }
    public int insertOfRegisterDateAndPath(String registerDate, String path) {
        return dao.insertOfRegisterDateAndPath(registerDate, path);
    }
    public int insertOfRegisterDateAndParam(String registerDate, String param) {
        return dao.insertOfRegisterDateAndParam(registerDate, param);
    }
    public int insertOfRegisterDateAndLvl(String registerDate, String lvl) {
        return dao.insertOfRegisterDateAndLvl(registerDate, lvl);
    }
    public int insertOfRegisterDateAndNewIds(String registerDate, String newIds) {
        return dao.insertOfRegisterDateAndNewIds(registerDate, newIds);
    }
    public int insertOfRegisterDateAndUserIds(String registerDate, String userIds) {
        return dao.insertOfRegisterDateAndUserIds(registerDate, userIds);
    }
    public int insertOfRegisterDateAndDesc(String registerDate, String desc) {
        return dao.insertOfRegisterDateAndDesc(registerDate, desc);
    }
    public int insertOfRegisterDateAndImage(String registerDate, String image) {
        return dao.insertOfRegisterDateAndImage(registerDate, image);
    }
    public int insertOfRegisterDateAndFamous(String registerDate, String famous) {
        return dao.insertOfRegisterDateAndFamous(registerDate, famous);
    }
    public int insertOfRegisterDateAndBUserIds(String registerDate, String bUserIds) {
        return dao.insertOfRegisterDateAndBUserIds(registerDate, bUserIds);
    }
    public int insertOfLoginDateAndPhone(String loginDate, String phone) {
        return dao.insertOfLoginDateAndPhone(loginDate, phone);
    }
    public int insertOfLoginDateAndEmail(String loginDate, String email) {
        return dao.insertOfLoginDateAndEmail(loginDate, email);
    }
    public int insertOfLoginDateAndMoney(String loginDate, String money) {
        return dao.insertOfLoginDateAndMoney(loginDate, money);
    }
    public int insertOfLoginDateAndScore(String loginDate, String score) {
        return dao.insertOfLoginDateAndScore(loginDate, score);
    }
    public int insertOfLoginDateAndPath(String loginDate, String path) {
        return dao.insertOfLoginDateAndPath(loginDate, path);
    }
    public int insertOfLoginDateAndParam(String loginDate, String param) {
        return dao.insertOfLoginDateAndParam(loginDate, param);
    }
    public int insertOfLoginDateAndLvl(String loginDate, String lvl) {
        return dao.insertOfLoginDateAndLvl(loginDate, lvl);
    }
    public int insertOfLoginDateAndNewIds(String loginDate, String newIds) {
        return dao.insertOfLoginDateAndNewIds(loginDate, newIds);
    }
    public int insertOfLoginDateAndUserIds(String loginDate, String userIds) {
        return dao.insertOfLoginDateAndUserIds(loginDate, userIds);
    }
    public int insertOfLoginDateAndDesc(String loginDate, String desc) {
        return dao.insertOfLoginDateAndDesc(loginDate, desc);
    }
    public int insertOfLoginDateAndImage(String loginDate, String image) {
        return dao.insertOfLoginDateAndImage(loginDate, image);
    }
    public int insertOfLoginDateAndFamous(String loginDate, String famous) {
        return dao.insertOfLoginDateAndFamous(loginDate, famous);
    }
    public int insertOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        return dao.insertOfLoginDateAndBUserIds(loginDate, bUserIds);
    }
    public int insertOfPhoneAndEmail(String phone, String email) {
        return dao.insertOfPhoneAndEmail(phone, email);
    }
    public int insertOfPhoneAndMoney(String phone, String money) {
        return dao.insertOfPhoneAndMoney(phone, money);
    }
    public int insertOfPhoneAndScore(String phone, String score) {
        return dao.insertOfPhoneAndScore(phone, score);
    }
    public int insertOfPhoneAndPath(String phone, String path) {
        return dao.insertOfPhoneAndPath(phone, path);
    }
    public int insertOfPhoneAndParam(String phone, String param) {
        return dao.insertOfPhoneAndParam(phone, param);
    }
    public int insertOfPhoneAndLvl(String phone, String lvl) {
        return dao.insertOfPhoneAndLvl(phone, lvl);
    }
    public int insertOfPhoneAndNewIds(String phone, String newIds) {
        return dao.insertOfPhoneAndNewIds(phone, newIds);
    }
    public int insertOfPhoneAndUserIds(String phone, String userIds) {
        return dao.insertOfPhoneAndUserIds(phone, userIds);
    }
    public int insertOfPhoneAndDesc(String phone, String desc) {
        return dao.insertOfPhoneAndDesc(phone, desc);
    }
    public int insertOfPhoneAndImage(String phone, String image) {
        return dao.insertOfPhoneAndImage(phone, image);
    }
    public int insertOfPhoneAndFamous(String phone, String famous) {
        return dao.insertOfPhoneAndFamous(phone, famous);
    }
    public int insertOfPhoneAndBUserIds(String phone, String bUserIds) {
        return dao.insertOfPhoneAndBUserIds(phone, bUserIds);
    }
    public int insertOfEmailAndMoney(String email, String money) {
        return dao.insertOfEmailAndMoney(email, money);
    }
    public int insertOfEmailAndScore(String email, String score) {
        return dao.insertOfEmailAndScore(email, score);
    }
    public int insertOfEmailAndPath(String email, String path) {
        return dao.insertOfEmailAndPath(email, path);
    }
    public int insertOfEmailAndParam(String email, String param) {
        return dao.insertOfEmailAndParam(email, param);
    }
    public int insertOfEmailAndLvl(String email, String lvl) {
        return dao.insertOfEmailAndLvl(email, lvl);
    }
    public int insertOfEmailAndNewIds(String email, String newIds) {
        return dao.insertOfEmailAndNewIds(email, newIds);
    }
    public int insertOfEmailAndUserIds(String email, String userIds) {
        return dao.insertOfEmailAndUserIds(email, userIds);
    }
    public int insertOfEmailAndDesc(String email, String desc) {
        return dao.insertOfEmailAndDesc(email, desc);
    }
    public int insertOfEmailAndImage(String email, String image) {
        return dao.insertOfEmailAndImage(email, image);
    }
    public int insertOfEmailAndFamous(String email, String famous) {
        return dao.insertOfEmailAndFamous(email, famous);
    }
    public int insertOfEmailAndBUserIds(String email, String bUserIds) {
        return dao.insertOfEmailAndBUserIds(email, bUserIds);
    }
    public int insertOfMoneyAndScore(String money, String score) {
        return dao.insertOfMoneyAndScore(money, score);
    }
    public int insertOfMoneyAndPath(String money, String path) {
        return dao.insertOfMoneyAndPath(money, path);
    }
    public int insertOfMoneyAndParam(String money, String param) {
        return dao.insertOfMoneyAndParam(money, param);
    }
    public int insertOfMoneyAndLvl(String money, String lvl) {
        return dao.insertOfMoneyAndLvl(money, lvl);
    }
    public int insertOfMoneyAndNewIds(String money, String newIds) {
        return dao.insertOfMoneyAndNewIds(money, newIds);
    }
    public int insertOfMoneyAndUserIds(String money, String userIds) {
        return dao.insertOfMoneyAndUserIds(money, userIds);
    }
    public int insertOfMoneyAndDesc(String money, String desc) {
        return dao.insertOfMoneyAndDesc(money, desc);
    }
    public int insertOfMoneyAndImage(String money, String image) {
        return dao.insertOfMoneyAndImage(money, image);
    }
    public int insertOfMoneyAndFamous(String money, String famous) {
        return dao.insertOfMoneyAndFamous(money, famous);
    }
    public int insertOfMoneyAndBUserIds(String money, String bUserIds) {
        return dao.insertOfMoneyAndBUserIds(money, bUserIds);
    }
    public int insertOfScoreAndPath(String score, String path) {
        return dao.insertOfScoreAndPath(score, path);
    }
    public int insertOfScoreAndParam(String score, String param) {
        return dao.insertOfScoreAndParam(score, param);
    }
    public int insertOfScoreAndLvl(String score, String lvl) {
        return dao.insertOfScoreAndLvl(score, lvl);
    }
    public int insertOfScoreAndNewIds(String score, String newIds) {
        return dao.insertOfScoreAndNewIds(score, newIds);
    }
    public int insertOfScoreAndUserIds(String score, String userIds) {
        return dao.insertOfScoreAndUserIds(score, userIds);
    }
    public int insertOfScoreAndDesc(String score, String desc) {
        return dao.insertOfScoreAndDesc(score, desc);
    }
    public int insertOfScoreAndImage(String score, String image) {
        return dao.insertOfScoreAndImage(score, image);
    }
    public int insertOfScoreAndFamous(String score, String famous) {
        return dao.insertOfScoreAndFamous(score, famous);
    }
    public int insertOfScoreAndBUserIds(String score, String bUserIds) {
        return dao.insertOfScoreAndBUserIds(score, bUserIds);
    }
    public int insertOfPathAndParam(String path, String param) {
        return dao.insertOfPathAndParam(path, param);
    }
    public int insertOfPathAndLvl(String path, String lvl) {
        return dao.insertOfPathAndLvl(path, lvl);
    }
    public int insertOfPathAndNewIds(String path, String newIds) {
        return dao.insertOfPathAndNewIds(path, newIds);
    }
    public int insertOfPathAndUserIds(String path, String userIds) {
        return dao.insertOfPathAndUserIds(path, userIds);
    }
    public int insertOfPathAndDesc(String path, String desc) {
        return dao.insertOfPathAndDesc(path, desc);
    }
    public int insertOfPathAndImage(String path, String image) {
        return dao.insertOfPathAndImage(path, image);
    }
    public int insertOfPathAndFamous(String path, String famous) {
        return dao.insertOfPathAndFamous(path, famous);
    }
    public int insertOfPathAndBUserIds(String path, String bUserIds) {
        return dao.insertOfPathAndBUserIds(path, bUserIds);
    }
    public int insertOfParamAndLvl(String param, String lvl) {
        return dao.insertOfParamAndLvl(param, lvl);
    }
    public int insertOfParamAndNewIds(String param, String newIds) {
        return dao.insertOfParamAndNewIds(param, newIds);
    }
    public int insertOfParamAndUserIds(String param, String userIds) {
        return dao.insertOfParamAndUserIds(param, userIds);
    }
    public int insertOfParamAndDesc(String param, String desc) {
        return dao.insertOfParamAndDesc(param, desc);
    }
    public int insertOfParamAndImage(String param, String image) {
        return dao.insertOfParamAndImage(param, image);
    }
    public int insertOfParamAndFamous(String param, String famous) {
        return dao.insertOfParamAndFamous(param, famous);
    }
    public int insertOfParamAndBUserIds(String param, String bUserIds) {
        return dao.insertOfParamAndBUserIds(param, bUserIds);
    }
    public int insertOfLvlAndNewIds(String lvl, String newIds) {
        return dao.insertOfLvlAndNewIds(lvl, newIds);
    }
    public int insertOfLvlAndUserIds(String lvl, String userIds) {
        return dao.insertOfLvlAndUserIds(lvl, userIds);
    }
    public int insertOfLvlAndDesc(String lvl, String desc) {
        return dao.insertOfLvlAndDesc(lvl, desc);
    }
    public int insertOfLvlAndImage(String lvl, String image) {
        return dao.insertOfLvlAndImage(lvl, image);
    }
    public int insertOfLvlAndFamous(String lvl, String famous) {
        return dao.insertOfLvlAndFamous(lvl, famous);
    }
    public int insertOfLvlAndBUserIds(String lvl, String bUserIds) {
        return dao.insertOfLvlAndBUserIds(lvl, bUserIds);
    }
    public int insertOfNewIdsAndUserIds(String newIds, String userIds) {
        return dao.insertOfNewIdsAndUserIds(newIds, userIds);
    }
    public int insertOfNewIdsAndDesc(String newIds, String desc) {
        return dao.insertOfNewIdsAndDesc(newIds, desc);
    }
    public int insertOfNewIdsAndImage(String newIds, String image) {
        return dao.insertOfNewIdsAndImage(newIds, image);
    }
    public int insertOfNewIdsAndFamous(String newIds, String famous) {
        return dao.insertOfNewIdsAndFamous(newIds, famous);
    }
    public int insertOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        return dao.insertOfNewIdsAndBUserIds(newIds, bUserIds);
    }
    public int insertOfUserIdsAndDesc(String userIds, String desc) {
        return dao.insertOfUserIdsAndDesc(userIds, desc);
    }
    public int insertOfUserIdsAndImage(String userIds, String image) {
        return dao.insertOfUserIdsAndImage(userIds, image);
    }
    public int insertOfUserIdsAndFamous(String userIds, String famous) {
        return dao.insertOfUserIdsAndFamous(userIds, famous);
    }
    public int insertOfUserIdsAndBUserIds(String userIds, String bUserIds) {
        return dao.insertOfUserIdsAndBUserIds(userIds, bUserIds);
    }
    public int insertOfDescAndImage(String desc, String image) {
        return dao.insertOfDescAndImage(desc, image);
    }
    public int insertOfDescAndFamous(String desc, String famous) {
        return dao.insertOfDescAndFamous(desc, famous);
    }
    public int insertOfDescAndBUserIds(String desc, String bUserIds) {
        return dao.insertOfDescAndBUserIds(desc, bUserIds);
    }
    public int insertOfImageAndFamous(String image, String famous) {
        return dao.insertOfImageAndFamous(image, famous);
    }
    public int insertOfImageAndBUserIds(String image, String bUserIds) {
        return dao.insertOfImageAndBUserIds(image, bUserIds);
    }
    public int insertOfFamousAndBUserIds(String famous, String bUserIds) {
        return dao.insertOfFamousAndBUserIds(famous, bUserIds);
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
    public User getUserOfName(String name) {
        return dao.getUserOfName(name);
    }
    public User getUserOfSex(String sex) {
        return dao.getUserOfSex(sex);
    }
    public User getUserOfRegisterDate(String registerDate) {
        return dao.getUserOfRegisterDate(registerDate);
    }
    public User getUserOfLoginDate(String loginDate) {
        return dao.getUserOfLoginDate(loginDate);
    }
    public User getUserOfPhone(String phone) {
        return dao.getUserOfPhone(phone);
    }
    public User getUserOfEmail(String email) {
        return dao.getUserOfEmail(email);
    }
    public User getUserOfMoney(String money) {
        return dao.getUserOfMoney(money);
    }
    public User getUserOfScore(String score) {
        return dao.getUserOfScore(score);
    }
    public User getUserOfPath(String path) {
        return dao.getUserOfPath(path);
    }
    public User getUserOfParam(String param) {
        return dao.getUserOfParam(param);
    }
    public User getUserOfLvl(String lvl) {
        return dao.getUserOfLvl(lvl);
    }
    public User getUserOfNewIds(String newIds) {
        return dao.getUserOfNewIds(newIds);
    }
    public User getUserOfUserIds(String userIds) {
        return dao.getUserOfUserIds(userIds);
    }
    public User getUserOfDesc(String desc) {
        return dao.getUserOfDesc(desc);
    }
    public User getUserOfImage(String image) {
        return dao.getUserOfImage(image);
    }
    public User getUserOfFamous(String famous) {
        return dao.getUserOfFamous(famous);
    }
    public User getUserOfBUserIds(String bUserIds) {
        return dao.getUserOfBUserIds(bUserIds);
    }
    public User getUserOfUserIdAndPassword(String userId, String password) {
        return dao.getUserOfUserIdAndPassword(userId, password);
    }
    public User getUserOfUserIdAndName(String userId, String name) {
        return dao.getUserOfUserIdAndName(userId, name);
    }
    public User getUserOfUserIdAndSex(String userId, String sex) {
        return dao.getUserOfUserIdAndSex(userId, sex);
    }
    public User getUserOfUserIdAndRegisterDate(String userId, String registerDate) {
        return dao.getUserOfUserIdAndRegisterDate(userId, registerDate);
    }
    public User getUserOfUserIdAndLoginDate(String userId, String loginDate) {
        return dao.getUserOfUserIdAndLoginDate(userId, loginDate);
    }
    public User getUserOfUserIdAndPhone(String userId, String phone) {
        return dao.getUserOfUserIdAndPhone(userId, phone);
    }
    public User getUserOfUserIdAndEmail(String userId, String email) {
        return dao.getUserOfUserIdAndEmail(userId, email);
    }
    public User getUserOfUserIdAndMoney(String userId, String money) {
        return dao.getUserOfUserIdAndMoney(userId, money);
    }
    public User getUserOfUserIdAndScore(String userId, String score) {
        return dao.getUserOfUserIdAndScore(userId, score);
    }
    public User getUserOfUserIdAndPath(String userId, String path) {
        return dao.getUserOfUserIdAndPath(userId, path);
    }
    public User getUserOfUserIdAndParam(String userId, String param) {
        return dao.getUserOfUserIdAndParam(userId, param);
    }
    public User getUserOfUserIdAndLvl(String userId, String lvl) {
        return dao.getUserOfUserIdAndLvl(userId, lvl);
    }
    public User getUserOfUserIdAndNewIds(String userId, String newIds) {
        return dao.getUserOfUserIdAndNewIds(userId, newIds);
    }
    public User getUserOfUserIdAndUserIds(String userId, String userIds) {
        return dao.getUserOfUserIdAndUserIds(userId, userIds);
    }
    public User getUserOfUserIdAndDesc(String userId, String desc) {
        return dao.getUserOfUserIdAndDesc(userId, desc);
    }
    public User getUserOfUserIdAndImage(String userId, String image) {
        return dao.getUserOfUserIdAndImage(userId, image);
    }
    public User getUserOfUserIdAndFamous(String userId, String famous) {
        return dao.getUserOfUserIdAndFamous(userId, famous);
    }
    public User getUserOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.getUserOfUserIdAndBUserIds(userId, bUserIds);
    }
    public User getUserOfPasswordAndName(String password, String name) {
        return dao.getUserOfPasswordAndName(password, name);
    }
    public User getUserOfPasswordAndSex(String password, String sex) {
        return dao.getUserOfPasswordAndSex(password, sex);
    }
    public User getUserOfPasswordAndRegisterDate(String password, String registerDate) {
        return dao.getUserOfPasswordAndRegisterDate(password, registerDate);
    }
    public User getUserOfPasswordAndLoginDate(String password, String loginDate) {
        return dao.getUserOfPasswordAndLoginDate(password, loginDate);
    }
    public User getUserOfPasswordAndPhone(String password, String phone) {
        return dao.getUserOfPasswordAndPhone(password, phone);
    }
    public User getUserOfPasswordAndEmail(String password, String email) {
        return dao.getUserOfPasswordAndEmail(password, email);
    }
    public User getUserOfPasswordAndMoney(String password, String money) {
        return dao.getUserOfPasswordAndMoney(password, money);
    }
    public User getUserOfPasswordAndScore(String password, String score) {
        return dao.getUserOfPasswordAndScore(password, score);
    }
    public User getUserOfPasswordAndPath(String password, String path) {
        return dao.getUserOfPasswordAndPath(password, path);
    }
    public User getUserOfPasswordAndParam(String password, String param) {
        return dao.getUserOfPasswordAndParam(password, param);
    }
    public User getUserOfPasswordAndLvl(String password, String lvl) {
        return dao.getUserOfPasswordAndLvl(password, lvl);
    }
    public User getUserOfPasswordAndNewIds(String password, String newIds) {
        return dao.getUserOfPasswordAndNewIds(password, newIds);
    }
    public User getUserOfPasswordAndUserIds(String password, String userIds) {
        return dao.getUserOfPasswordAndUserIds(password, userIds);
    }
    public User getUserOfPasswordAndDesc(String password, String desc) {
        return dao.getUserOfPasswordAndDesc(password, desc);
    }
    public User getUserOfPasswordAndImage(String password, String image) {
        return dao.getUserOfPasswordAndImage(password, image);
    }
    public User getUserOfPasswordAndFamous(String password, String famous) {
        return dao.getUserOfPasswordAndFamous(password, famous);
    }
    public User getUserOfPasswordAndBUserIds(String password, String bUserIds) {
        return dao.getUserOfPasswordAndBUserIds(password, bUserIds);
    }
    public User getUserOfNameAndSex(String name, String sex) {
        return dao.getUserOfNameAndSex(name, sex);
    }
    public User getUserOfNameAndRegisterDate(String name, String registerDate) {
        return dao.getUserOfNameAndRegisterDate(name, registerDate);
    }
    public User getUserOfNameAndLoginDate(String name, String loginDate) {
        return dao.getUserOfNameAndLoginDate(name, loginDate);
    }
    public User getUserOfNameAndPhone(String name, String phone) {
        return dao.getUserOfNameAndPhone(name, phone);
    }
    public User getUserOfNameAndEmail(String name, String email) {
        return dao.getUserOfNameAndEmail(name, email);
    }
    public User getUserOfNameAndMoney(String name, String money) {
        return dao.getUserOfNameAndMoney(name, money);
    }
    public User getUserOfNameAndScore(String name, String score) {
        return dao.getUserOfNameAndScore(name, score);
    }
    public User getUserOfNameAndPath(String name, String path) {
        return dao.getUserOfNameAndPath(name, path);
    }
    public User getUserOfNameAndParam(String name, String param) {
        return dao.getUserOfNameAndParam(name, param);
    }
    public User getUserOfNameAndLvl(String name, String lvl) {
        return dao.getUserOfNameAndLvl(name, lvl);
    }
    public User getUserOfNameAndNewIds(String name, String newIds) {
        return dao.getUserOfNameAndNewIds(name, newIds);
    }
    public User getUserOfNameAndUserIds(String name, String userIds) {
        return dao.getUserOfNameAndUserIds(name, userIds);
    }
    public User getUserOfNameAndDesc(String name, String desc) {
        return dao.getUserOfNameAndDesc(name, desc);
    }
    public User getUserOfNameAndImage(String name, String image) {
        return dao.getUserOfNameAndImage(name, image);
    }
    public User getUserOfNameAndFamous(String name, String famous) {
        return dao.getUserOfNameAndFamous(name, famous);
    }
    public User getUserOfNameAndBUserIds(String name, String bUserIds) {
        return dao.getUserOfNameAndBUserIds(name, bUserIds);
    }
    public User getUserOfSexAndRegisterDate(String sex, String registerDate) {
        return dao.getUserOfSexAndRegisterDate(sex, registerDate);
    }
    public User getUserOfSexAndLoginDate(String sex, String loginDate) {
        return dao.getUserOfSexAndLoginDate(sex, loginDate);
    }
    public User getUserOfSexAndPhone(String sex, String phone) {
        return dao.getUserOfSexAndPhone(sex, phone);
    }
    public User getUserOfSexAndEmail(String sex, String email) {
        return dao.getUserOfSexAndEmail(sex, email);
    }
    public User getUserOfSexAndMoney(String sex, String money) {
        return dao.getUserOfSexAndMoney(sex, money);
    }
    public User getUserOfSexAndScore(String sex, String score) {
        return dao.getUserOfSexAndScore(sex, score);
    }
    public User getUserOfSexAndPath(String sex, String path) {
        return dao.getUserOfSexAndPath(sex, path);
    }
    public User getUserOfSexAndParam(String sex, String param) {
        return dao.getUserOfSexAndParam(sex, param);
    }
    public User getUserOfSexAndLvl(String sex, String lvl) {
        return dao.getUserOfSexAndLvl(sex, lvl);
    }
    public User getUserOfSexAndNewIds(String sex, String newIds) {
        return dao.getUserOfSexAndNewIds(sex, newIds);
    }
    public User getUserOfSexAndUserIds(String sex, String userIds) {
        return dao.getUserOfSexAndUserIds(sex, userIds);
    }
    public User getUserOfSexAndDesc(String sex, String desc) {
        return dao.getUserOfSexAndDesc(sex, desc);
    }
    public User getUserOfSexAndImage(String sex, String image) {
        return dao.getUserOfSexAndImage(sex, image);
    }
    public User getUserOfSexAndFamous(String sex, String famous) {
        return dao.getUserOfSexAndFamous(sex, famous);
    }
    public User getUserOfSexAndBUserIds(String sex, String bUserIds) {
        return dao.getUserOfSexAndBUserIds(sex, bUserIds);
    }
    public User getUserOfRegisterDateAndLoginDate(String registerDate, String loginDate) {
        return dao.getUserOfRegisterDateAndLoginDate(registerDate, loginDate);
    }
    public User getUserOfRegisterDateAndPhone(String registerDate, String phone) {
        return dao.getUserOfRegisterDateAndPhone(registerDate, phone);
    }
    public User getUserOfRegisterDateAndEmail(String registerDate, String email) {
        return dao.getUserOfRegisterDateAndEmail(registerDate, email);
    }
    public User getUserOfRegisterDateAndMoney(String registerDate, String money) {
        return dao.getUserOfRegisterDateAndMoney(registerDate, money);
    }
    public User getUserOfRegisterDateAndScore(String registerDate, String score) {
        return dao.getUserOfRegisterDateAndScore(registerDate, score);
    }
    public User getUserOfRegisterDateAndPath(String registerDate, String path) {
        return dao.getUserOfRegisterDateAndPath(registerDate, path);
    }
    public User getUserOfRegisterDateAndParam(String registerDate, String param) {
        return dao.getUserOfRegisterDateAndParam(registerDate, param);
    }
    public User getUserOfRegisterDateAndLvl(String registerDate, String lvl) {
        return dao.getUserOfRegisterDateAndLvl(registerDate, lvl);
    }
    public User getUserOfRegisterDateAndNewIds(String registerDate, String newIds) {
        return dao.getUserOfRegisterDateAndNewIds(registerDate, newIds);
    }
    public User getUserOfRegisterDateAndUserIds(String registerDate, String userIds) {
        return dao.getUserOfRegisterDateAndUserIds(registerDate, userIds);
    }
    public User getUserOfRegisterDateAndDesc(String registerDate, String desc) {
        return dao.getUserOfRegisterDateAndDesc(registerDate, desc);
    }
    public User getUserOfRegisterDateAndImage(String registerDate, String image) {
        return dao.getUserOfRegisterDateAndImage(registerDate, image);
    }
    public User getUserOfRegisterDateAndFamous(String registerDate, String famous) {
        return dao.getUserOfRegisterDateAndFamous(registerDate, famous);
    }
    public User getUserOfRegisterDateAndBUserIds(String registerDate, String bUserIds) {
        return dao.getUserOfRegisterDateAndBUserIds(registerDate, bUserIds);
    }
    public User getUserOfLoginDateAndPhone(String loginDate, String phone) {
        return dao.getUserOfLoginDateAndPhone(loginDate, phone);
    }
    public User getUserOfLoginDateAndEmail(String loginDate, String email) {
        return dao.getUserOfLoginDateAndEmail(loginDate, email);
    }
    public User getUserOfLoginDateAndMoney(String loginDate, String money) {
        return dao.getUserOfLoginDateAndMoney(loginDate, money);
    }
    public User getUserOfLoginDateAndScore(String loginDate, String score) {
        return dao.getUserOfLoginDateAndScore(loginDate, score);
    }
    public User getUserOfLoginDateAndPath(String loginDate, String path) {
        return dao.getUserOfLoginDateAndPath(loginDate, path);
    }
    public User getUserOfLoginDateAndParam(String loginDate, String param) {
        return dao.getUserOfLoginDateAndParam(loginDate, param);
    }
    public User getUserOfLoginDateAndLvl(String loginDate, String lvl) {
        return dao.getUserOfLoginDateAndLvl(loginDate, lvl);
    }
    public User getUserOfLoginDateAndNewIds(String loginDate, String newIds) {
        return dao.getUserOfLoginDateAndNewIds(loginDate, newIds);
    }
    public User getUserOfLoginDateAndUserIds(String loginDate, String userIds) {
        return dao.getUserOfLoginDateAndUserIds(loginDate, userIds);
    }
    public User getUserOfLoginDateAndDesc(String loginDate, String desc) {
        return dao.getUserOfLoginDateAndDesc(loginDate, desc);
    }
    public User getUserOfLoginDateAndImage(String loginDate, String image) {
        return dao.getUserOfLoginDateAndImage(loginDate, image);
    }
    public User getUserOfLoginDateAndFamous(String loginDate, String famous) {
        return dao.getUserOfLoginDateAndFamous(loginDate, famous);
    }
    public User getUserOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        return dao.getUserOfLoginDateAndBUserIds(loginDate, bUserIds);
    }
    public User getUserOfPhoneAndEmail(String phone, String email) {
        return dao.getUserOfPhoneAndEmail(phone, email);
    }
    public User getUserOfPhoneAndMoney(String phone, String money) {
        return dao.getUserOfPhoneAndMoney(phone, money);
    }
    public User getUserOfPhoneAndScore(String phone, String score) {
        return dao.getUserOfPhoneAndScore(phone, score);
    }
    public User getUserOfPhoneAndPath(String phone, String path) {
        return dao.getUserOfPhoneAndPath(phone, path);
    }
    public User getUserOfPhoneAndParam(String phone, String param) {
        return dao.getUserOfPhoneAndParam(phone, param);
    }
    public User getUserOfPhoneAndLvl(String phone, String lvl) {
        return dao.getUserOfPhoneAndLvl(phone, lvl);
    }
    public User getUserOfPhoneAndNewIds(String phone, String newIds) {
        return dao.getUserOfPhoneAndNewIds(phone, newIds);
    }
    public User getUserOfPhoneAndUserIds(String phone, String userIds) {
        return dao.getUserOfPhoneAndUserIds(phone, userIds);
    }
    public User getUserOfPhoneAndDesc(String phone, String desc) {
        return dao.getUserOfPhoneAndDesc(phone, desc);
    }
    public User getUserOfPhoneAndImage(String phone, String image) {
        return dao.getUserOfPhoneAndImage(phone, image);
    }
    public User getUserOfPhoneAndFamous(String phone, String famous) {
        return dao.getUserOfPhoneAndFamous(phone, famous);
    }
    public User getUserOfPhoneAndBUserIds(String phone, String bUserIds) {
        return dao.getUserOfPhoneAndBUserIds(phone, bUserIds);
    }
    public User getUserOfEmailAndMoney(String email, String money) {
        return dao.getUserOfEmailAndMoney(email, money);
    }
    public User getUserOfEmailAndScore(String email, String score) {
        return dao.getUserOfEmailAndScore(email, score);
    }
    public User getUserOfEmailAndPath(String email, String path) {
        return dao.getUserOfEmailAndPath(email, path);
    }
    public User getUserOfEmailAndParam(String email, String param) {
        return dao.getUserOfEmailAndParam(email, param);
    }
    public User getUserOfEmailAndLvl(String email, String lvl) {
        return dao.getUserOfEmailAndLvl(email, lvl);
    }
    public User getUserOfEmailAndNewIds(String email, String newIds) {
        return dao.getUserOfEmailAndNewIds(email, newIds);
    }
    public User getUserOfEmailAndUserIds(String email, String userIds) {
        return dao.getUserOfEmailAndUserIds(email, userIds);
    }
    public User getUserOfEmailAndDesc(String email, String desc) {
        return dao.getUserOfEmailAndDesc(email, desc);
    }
    public User getUserOfEmailAndImage(String email, String image) {
        return dao.getUserOfEmailAndImage(email, image);
    }
    public User getUserOfEmailAndFamous(String email, String famous) {
        return dao.getUserOfEmailAndFamous(email, famous);
    }
    public User getUserOfEmailAndBUserIds(String email, String bUserIds) {
        return dao.getUserOfEmailAndBUserIds(email, bUserIds);
    }
    public User getUserOfMoneyAndScore(String money, String score) {
        return dao.getUserOfMoneyAndScore(money, score);
    }
    public User getUserOfMoneyAndPath(String money, String path) {
        return dao.getUserOfMoneyAndPath(money, path);
    }
    public User getUserOfMoneyAndParam(String money, String param) {
        return dao.getUserOfMoneyAndParam(money, param);
    }
    public User getUserOfMoneyAndLvl(String money, String lvl) {
        return dao.getUserOfMoneyAndLvl(money, lvl);
    }
    public User getUserOfMoneyAndNewIds(String money, String newIds) {
        return dao.getUserOfMoneyAndNewIds(money, newIds);
    }
    public User getUserOfMoneyAndUserIds(String money, String userIds) {
        return dao.getUserOfMoneyAndUserIds(money, userIds);
    }
    public User getUserOfMoneyAndDesc(String money, String desc) {
        return dao.getUserOfMoneyAndDesc(money, desc);
    }
    public User getUserOfMoneyAndImage(String money, String image) {
        return dao.getUserOfMoneyAndImage(money, image);
    }
    public User getUserOfMoneyAndFamous(String money, String famous) {
        return dao.getUserOfMoneyAndFamous(money, famous);
    }
    public User getUserOfMoneyAndBUserIds(String money, String bUserIds) {
        return dao.getUserOfMoneyAndBUserIds(money, bUserIds);
    }
    public User getUserOfScoreAndPath(String score, String path) {
        return dao.getUserOfScoreAndPath(score, path);
    }
    public User getUserOfScoreAndParam(String score, String param) {
        return dao.getUserOfScoreAndParam(score, param);
    }
    public User getUserOfScoreAndLvl(String score, String lvl) {
        return dao.getUserOfScoreAndLvl(score, lvl);
    }
    public User getUserOfScoreAndNewIds(String score, String newIds) {
        return dao.getUserOfScoreAndNewIds(score, newIds);
    }
    public User getUserOfScoreAndUserIds(String score, String userIds) {
        return dao.getUserOfScoreAndUserIds(score, userIds);
    }
    public User getUserOfScoreAndDesc(String score, String desc) {
        return dao.getUserOfScoreAndDesc(score, desc);
    }
    public User getUserOfScoreAndImage(String score, String image) {
        return dao.getUserOfScoreAndImage(score, image);
    }
    public User getUserOfScoreAndFamous(String score, String famous) {
        return dao.getUserOfScoreAndFamous(score, famous);
    }
    public User getUserOfScoreAndBUserIds(String score, String bUserIds) {
        return dao.getUserOfScoreAndBUserIds(score, bUserIds);
    }
    public User getUserOfPathAndParam(String path, String param) {
        return dao.getUserOfPathAndParam(path, param);
    }
    public User getUserOfPathAndLvl(String path, String lvl) {
        return dao.getUserOfPathAndLvl(path, lvl);
    }
    public User getUserOfPathAndNewIds(String path, String newIds) {
        return dao.getUserOfPathAndNewIds(path, newIds);
    }
    public User getUserOfPathAndUserIds(String path, String userIds) {
        return dao.getUserOfPathAndUserIds(path, userIds);
    }
    public User getUserOfPathAndDesc(String path, String desc) {
        return dao.getUserOfPathAndDesc(path, desc);
    }
    public User getUserOfPathAndImage(String path, String image) {
        return dao.getUserOfPathAndImage(path, image);
    }
    public User getUserOfPathAndFamous(String path, String famous) {
        return dao.getUserOfPathAndFamous(path, famous);
    }
    public User getUserOfPathAndBUserIds(String path, String bUserIds) {
        return dao.getUserOfPathAndBUserIds(path, bUserIds);
    }
    public User getUserOfParamAndLvl(String param, String lvl) {
        return dao.getUserOfParamAndLvl(param, lvl);
    }
    public User getUserOfParamAndNewIds(String param, String newIds) {
        return dao.getUserOfParamAndNewIds(param, newIds);
    }
    public User getUserOfParamAndUserIds(String param, String userIds) {
        return dao.getUserOfParamAndUserIds(param, userIds);
    }
    public User getUserOfParamAndDesc(String param, String desc) {
        return dao.getUserOfParamAndDesc(param, desc);
    }
    public User getUserOfParamAndImage(String param, String image) {
        return dao.getUserOfParamAndImage(param, image);
    }
    public User getUserOfParamAndFamous(String param, String famous) {
        return dao.getUserOfParamAndFamous(param, famous);
    }
    public User getUserOfParamAndBUserIds(String param, String bUserIds) {
        return dao.getUserOfParamAndBUserIds(param, bUserIds);
    }
    public User getUserOfLvlAndNewIds(String lvl, String newIds) {
        return dao.getUserOfLvlAndNewIds(lvl, newIds);
    }
    public User getUserOfLvlAndUserIds(String lvl, String userIds) {
        return dao.getUserOfLvlAndUserIds(lvl, userIds);
    }
    public User getUserOfLvlAndDesc(String lvl, String desc) {
        return dao.getUserOfLvlAndDesc(lvl, desc);
    }
    public User getUserOfLvlAndImage(String lvl, String image) {
        return dao.getUserOfLvlAndImage(lvl, image);
    }
    public User getUserOfLvlAndFamous(String lvl, String famous) {
        return dao.getUserOfLvlAndFamous(lvl, famous);
    }
    public User getUserOfLvlAndBUserIds(String lvl, String bUserIds) {
        return dao.getUserOfLvlAndBUserIds(lvl, bUserIds);
    }
    public User getUserOfNewIdsAndUserIds(String newIds, String userIds) {
        return dao.getUserOfNewIdsAndUserIds(newIds, userIds);
    }
    public User getUserOfNewIdsAndDesc(String newIds, String desc) {
        return dao.getUserOfNewIdsAndDesc(newIds, desc);
    }
    public User getUserOfNewIdsAndImage(String newIds, String image) {
        return dao.getUserOfNewIdsAndImage(newIds, image);
    }
    public User getUserOfNewIdsAndFamous(String newIds, String famous) {
        return dao.getUserOfNewIdsAndFamous(newIds, famous);
    }
    public User getUserOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        return dao.getUserOfNewIdsAndBUserIds(newIds, bUserIds);
    }
    public User getUserOfUserIdsAndDesc(String userIds, String desc) {
        return dao.getUserOfUserIdsAndDesc(userIds, desc);
    }
    public User getUserOfUserIdsAndImage(String userIds, String image) {
        return dao.getUserOfUserIdsAndImage(userIds, image);
    }
    public User getUserOfUserIdsAndFamous(String userIds, String famous) {
        return dao.getUserOfUserIdsAndFamous(userIds, famous);
    }
    public User getUserOfUserIdsAndBUserIds(String userIds, String bUserIds) {
        return dao.getUserOfUserIdsAndBUserIds(userIds, bUserIds);
    }
    public User getUserOfDescAndImage(String desc, String image) {
        return dao.getUserOfDescAndImage(desc, image);
    }
    public User getUserOfDescAndFamous(String desc, String famous) {
        return dao.getUserOfDescAndFamous(desc, famous);
    }
    public User getUserOfDescAndBUserIds(String desc, String bUserIds) {
        return dao.getUserOfDescAndBUserIds(desc, bUserIds);
    }
    public User getUserOfImageAndFamous(String image, String famous) {
        return dao.getUserOfImageAndFamous(image, famous);
    }
    public User getUserOfImageAndBUserIds(String image, String bUserIds) {
        return dao.getUserOfImageAndBUserIds(image, bUserIds);
    }
    public User getUserOfFamousAndBUserIds(String famous, String bUserIds) {
        return dao.getUserOfFamousAndBUserIds(famous, bUserIds);
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
    public List<User> getUsersOfName(String name) {
        return dao.getUsersOfName(name);
    }
    public List<User> getUsersOfSex(String sex) {
        return dao.getUsersOfSex(sex);
    }
    public List<User> getUsersOfRegisterDate(String registerDate) {
        return dao.getUsersOfRegisterDate(registerDate);
    }
    public List<User> getUsersOfLoginDate(String loginDate) {
        return dao.getUsersOfLoginDate(loginDate);
    }
    public List<User> getUsersOfPhone(String phone) {
        return dao.getUsersOfPhone(phone);
    }
    public List<User> getUsersOfEmail(String email) {
        return dao.getUsersOfEmail(email);
    }
    public List<User> getUsersOfMoney(String money) {
        return dao.getUsersOfMoney(money);
    }
    public List<User> getUsersOfScore(String score) {
        return dao.getUsersOfScore(score);
    }
    public List<User> getUsersOfPath(String path) {
        return dao.getUsersOfPath(path);
    }
    public List<User> getUsersOfParam(String param) {
        return dao.getUsersOfParam(param);
    }
    public List<User> getUsersOfLvl(String lvl) {
        return dao.getUsersOfLvl(lvl);
    }
    public List<User> getUsersOfNewIds(String newIds) {
        return dao.getUsersOfNewIds(newIds);
    }
    public List<User> getUsersOfUserIds(String userIds) {
        return dao.getUsersOfUserIds(userIds);
    }
    public List<User> getUsersOfDesc(String desc) {
        return dao.getUsersOfDesc(desc);
    }
    public List<User> getUsersOfImage(String image) {
        return dao.getUsersOfImage(image);
    }
    public List<User> getUsersOfFamous(String famous) {
        return dao.getUsersOfFamous(famous);
    }
    public List<User> getUsersOfBUserIds(String bUserIds) {
        return dao.getUsersOfBUserIds(bUserIds);
    }
    public List<User> getUsersOfUserIdAndPassword(String userId, String password) {
        return dao.getUsersOfUserIdAndPassword(userId, password);
    }
    public List<User> getUsersOfUserIdAndName(String userId, String name) {
        return dao.getUsersOfUserIdAndName(userId, name);
    }
    public List<User> getUsersOfUserIdAndSex(String userId, String sex) {
        return dao.getUsersOfUserIdAndSex(userId, sex);
    }
    public List<User> getUsersOfUserIdAndRegisterDate(String userId, String registerDate) {
        return dao.getUsersOfUserIdAndRegisterDate(userId, registerDate);
    }
    public List<User> getUsersOfUserIdAndLoginDate(String userId, String loginDate) {
        return dao.getUsersOfUserIdAndLoginDate(userId, loginDate);
    }
    public List<User> getUsersOfUserIdAndPhone(String userId, String phone) {
        return dao.getUsersOfUserIdAndPhone(userId, phone);
    }
    public List<User> getUsersOfUserIdAndEmail(String userId, String email) {
        return dao.getUsersOfUserIdAndEmail(userId, email);
    }
    public List<User> getUsersOfUserIdAndMoney(String userId, String money) {
        return dao.getUsersOfUserIdAndMoney(userId, money);
    }
    public List<User> getUsersOfUserIdAndScore(String userId, String score) {
        return dao.getUsersOfUserIdAndScore(userId, score);
    }
    public List<User> getUsersOfUserIdAndPath(String userId, String path) {
        return dao.getUsersOfUserIdAndPath(userId, path);
    }
    public List<User> getUsersOfUserIdAndParam(String userId, String param) {
        return dao.getUsersOfUserIdAndParam(userId, param);
    }
    public List<User> getUsersOfUserIdAndLvl(String userId, String lvl) {
        return dao.getUsersOfUserIdAndLvl(userId, lvl);
    }
    public List<User> getUsersOfUserIdAndNewIds(String userId, String newIds) {
        return dao.getUsersOfUserIdAndNewIds(userId, newIds);
    }
    public List<User> getUsersOfUserIdAndUserIds(String userId, String userIds) {
        return dao.getUsersOfUserIdAndUserIds(userId, userIds);
    }
    public List<User> getUsersOfUserIdAndDesc(String userId, String desc) {
        return dao.getUsersOfUserIdAndDesc(userId, desc);
    }
    public List<User> getUsersOfUserIdAndImage(String userId, String image) {
        return dao.getUsersOfUserIdAndImage(userId, image);
    }
    public List<User> getUsersOfUserIdAndFamous(String userId, String famous) {
        return dao.getUsersOfUserIdAndFamous(userId, famous);
    }
    public List<User> getUsersOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.getUsersOfUserIdAndBUserIds(userId, bUserIds);
    }
    public List<User> getUsersOfPasswordAndName(String password, String name) {
        return dao.getUsersOfPasswordAndName(password, name);
    }
    public List<User> getUsersOfPasswordAndSex(String password, String sex) {
        return dao.getUsersOfPasswordAndSex(password, sex);
    }
    public List<User> getUsersOfPasswordAndRegisterDate(String password, String registerDate) {
        return dao.getUsersOfPasswordAndRegisterDate(password, registerDate);
    }
    public List<User> getUsersOfPasswordAndLoginDate(String password, String loginDate) {
        return dao.getUsersOfPasswordAndLoginDate(password, loginDate);
    }
    public List<User> getUsersOfPasswordAndPhone(String password, String phone) {
        return dao.getUsersOfPasswordAndPhone(password, phone);
    }
    public List<User> getUsersOfPasswordAndEmail(String password, String email) {
        return dao.getUsersOfPasswordAndEmail(password, email);
    }
    public List<User> getUsersOfPasswordAndMoney(String password, String money) {
        return dao.getUsersOfPasswordAndMoney(password, money);
    }
    public List<User> getUsersOfPasswordAndScore(String password, String score) {
        return dao.getUsersOfPasswordAndScore(password, score);
    }
    public List<User> getUsersOfPasswordAndPath(String password, String path) {
        return dao.getUsersOfPasswordAndPath(password, path);
    }
    public List<User> getUsersOfPasswordAndParam(String password, String param) {
        return dao.getUsersOfPasswordAndParam(password, param);
    }
    public List<User> getUsersOfPasswordAndLvl(String password, String lvl) {
        return dao.getUsersOfPasswordAndLvl(password, lvl);
    }
    public List<User> getUsersOfPasswordAndNewIds(String password, String newIds) {
        return dao.getUsersOfPasswordAndNewIds(password, newIds);
    }
    public List<User> getUsersOfPasswordAndUserIds(String password, String userIds) {
        return dao.getUsersOfPasswordAndUserIds(password, userIds);
    }
    public List<User> getUsersOfPasswordAndDesc(String password, String desc) {
        return dao.getUsersOfPasswordAndDesc(password, desc);
    }
    public List<User> getUsersOfPasswordAndImage(String password, String image) {
        return dao.getUsersOfPasswordAndImage(password, image);
    }
    public List<User> getUsersOfPasswordAndFamous(String password, String famous) {
        return dao.getUsersOfPasswordAndFamous(password, famous);
    }
    public List<User> getUsersOfPasswordAndBUserIds(String password, String bUserIds) {
        return dao.getUsersOfPasswordAndBUserIds(password, bUserIds);
    }
    public List<User> getUsersOfNameAndSex(String name, String sex) {
        return dao.getUsersOfNameAndSex(name, sex);
    }
    public List<User> getUsersOfNameAndRegisterDate(String name, String registerDate) {
        return dao.getUsersOfNameAndRegisterDate(name, registerDate);
    }
    public List<User> getUsersOfNameAndLoginDate(String name, String loginDate) {
        return dao.getUsersOfNameAndLoginDate(name, loginDate);
    }
    public List<User> getUsersOfNameAndPhone(String name, String phone) {
        return dao.getUsersOfNameAndPhone(name, phone);
    }
    public List<User> getUsersOfNameAndEmail(String name, String email) {
        return dao.getUsersOfNameAndEmail(name, email);
    }
    public List<User> getUsersOfNameAndMoney(String name, String money) {
        return dao.getUsersOfNameAndMoney(name, money);
    }
    public List<User> getUsersOfNameAndScore(String name, String score) {
        return dao.getUsersOfNameAndScore(name, score);
    }
    public List<User> getUsersOfNameAndPath(String name, String path) {
        return dao.getUsersOfNameAndPath(name, path);
    }
    public List<User> getUsersOfNameAndParam(String name, String param) {
        return dao.getUsersOfNameAndParam(name, param);
    }
    public List<User> getUsersOfNameAndLvl(String name, String lvl) {
        return dao.getUsersOfNameAndLvl(name, lvl);
    }
    public List<User> getUsersOfNameAndNewIds(String name, String newIds) {
        return dao.getUsersOfNameAndNewIds(name, newIds);
    }
    public List<User> getUsersOfNameAndUserIds(String name, String userIds) {
        return dao.getUsersOfNameAndUserIds(name, userIds);
    }
    public List<User> getUsersOfNameAndDesc(String name, String desc) {
        return dao.getUsersOfNameAndDesc(name, desc);
    }
    public List<User> getUsersOfNameAndImage(String name, String image) {
        return dao.getUsersOfNameAndImage(name, image);
    }
    public List<User> getUsersOfNameAndFamous(String name, String famous) {
        return dao.getUsersOfNameAndFamous(name, famous);
    }
    public List<User> getUsersOfNameAndBUserIds(String name, String bUserIds) {
        return dao.getUsersOfNameAndBUserIds(name, bUserIds);
    }
    public List<User> getUsersOfSexAndRegisterDate(String sex, String registerDate) {
        return dao.getUsersOfSexAndRegisterDate(sex, registerDate);
    }
    public List<User> getUsersOfSexAndLoginDate(String sex, String loginDate) {
        return dao.getUsersOfSexAndLoginDate(sex, loginDate);
    }
    public List<User> getUsersOfSexAndPhone(String sex, String phone) {
        return dao.getUsersOfSexAndPhone(sex, phone);
    }
    public List<User> getUsersOfSexAndEmail(String sex, String email) {
        return dao.getUsersOfSexAndEmail(sex, email);
    }
    public List<User> getUsersOfSexAndMoney(String sex, String money) {
        return dao.getUsersOfSexAndMoney(sex, money);
    }
    public List<User> getUsersOfSexAndScore(String sex, String score) {
        return dao.getUsersOfSexAndScore(sex, score);
    }
    public List<User> getUsersOfSexAndPath(String sex, String path) {
        return dao.getUsersOfSexAndPath(sex, path);
    }
    public List<User> getUsersOfSexAndParam(String sex, String param) {
        return dao.getUsersOfSexAndParam(sex, param);
    }
    public List<User> getUsersOfSexAndLvl(String sex, String lvl) {
        return dao.getUsersOfSexAndLvl(sex, lvl);
    }
    public List<User> getUsersOfSexAndNewIds(String sex, String newIds) {
        return dao.getUsersOfSexAndNewIds(sex, newIds);
    }
    public List<User> getUsersOfSexAndUserIds(String sex, String userIds) {
        return dao.getUsersOfSexAndUserIds(sex, userIds);
    }
    public List<User> getUsersOfSexAndDesc(String sex, String desc) {
        return dao.getUsersOfSexAndDesc(sex, desc);
    }
    public List<User> getUsersOfSexAndImage(String sex, String image) {
        return dao.getUsersOfSexAndImage(sex, image);
    }
    public List<User> getUsersOfSexAndFamous(String sex, String famous) {
        return dao.getUsersOfSexAndFamous(sex, famous);
    }
    public List<User> getUsersOfSexAndBUserIds(String sex, String bUserIds) {
        return dao.getUsersOfSexAndBUserIds(sex, bUserIds);
    }
    public List<User> getUsersOfRegisterDateAndLoginDate(String registerDate, String loginDate) {
        return dao.getUsersOfRegisterDateAndLoginDate(registerDate, loginDate);
    }
    public List<User> getUsersOfRegisterDateAndPhone(String registerDate, String phone) {
        return dao.getUsersOfRegisterDateAndPhone(registerDate, phone);
    }
    public List<User> getUsersOfRegisterDateAndEmail(String registerDate, String email) {
        return dao.getUsersOfRegisterDateAndEmail(registerDate, email);
    }
    public List<User> getUsersOfRegisterDateAndMoney(String registerDate, String money) {
        return dao.getUsersOfRegisterDateAndMoney(registerDate, money);
    }
    public List<User> getUsersOfRegisterDateAndScore(String registerDate, String score) {
        return dao.getUsersOfRegisterDateAndScore(registerDate, score);
    }
    public List<User> getUsersOfRegisterDateAndPath(String registerDate, String path) {
        return dao.getUsersOfRegisterDateAndPath(registerDate, path);
    }
    public List<User> getUsersOfRegisterDateAndParam(String registerDate, String param) {
        return dao.getUsersOfRegisterDateAndParam(registerDate, param);
    }
    public List<User> getUsersOfRegisterDateAndLvl(String registerDate, String lvl) {
        return dao.getUsersOfRegisterDateAndLvl(registerDate, lvl);
    }
    public List<User> getUsersOfRegisterDateAndNewIds(String registerDate, String newIds) {
        return dao.getUsersOfRegisterDateAndNewIds(registerDate, newIds);
    }
    public List<User> getUsersOfRegisterDateAndUserIds(String registerDate, String userIds) {
        return dao.getUsersOfRegisterDateAndUserIds(registerDate, userIds);
    }
    public List<User> getUsersOfRegisterDateAndDesc(String registerDate, String desc) {
        return dao.getUsersOfRegisterDateAndDesc(registerDate, desc);
    }
    public List<User> getUsersOfRegisterDateAndImage(String registerDate, String image) {
        return dao.getUsersOfRegisterDateAndImage(registerDate, image);
    }
    public List<User> getUsersOfRegisterDateAndFamous(String registerDate, String famous) {
        return dao.getUsersOfRegisterDateAndFamous(registerDate, famous);
    }
    public List<User> getUsersOfRegisterDateAndBUserIds(String registerDate, String bUserIds) {
        return dao.getUsersOfRegisterDateAndBUserIds(registerDate, bUserIds);
    }
    public List<User> getUsersOfLoginDateAndPhone(String loginDate, String phone) {
        return dao.getUsersOfLoginDateAndPhone(loginDate, phone);
    }
    public List<User> getUsersOfLoginDateAndEmail(String loginDate, String email) {
        return dao.getUsersOfLoginDateAndEmail(loginDate, email);
    }
    public List<User> getUsersOfLoginDateAndMoney(String loginDate, String money) {
        return dao.getUsersOfLoginDateAndMoney(loginDate, money);
    }
    public List<User> getUsersOfLoginDateAndScore(String loginDate, String score) {
        return dao.getUsersOfLoginDateAndScore(loginDate, score);
    }
    public List<User> getUsersOfLoginDateAndPath(String loginDate, String path) {
        return dao.getUsersOfLoginDateAndPath(loginDate, path);
    }
    public List<User> getUsersOfLoginDateAndParam(String loginDate, String param) {
        return dao.getUsersOfLoginDateAndParam(loginDate, param);
    }
    public List<User> getUsersOfLoginDateAndLvl(String loginDate, String lvl) {
        return dao.getUsersOfLoginDateAndLvl(loginDate, lvl);
    }
    public List<User> getUsersOfLoginDateAndNewIds(String loginDate, String newIds) {
        return dao.getUsersOfLoginDateAndNewIds(loginDate, newIds);
    }
    public List<User> getUsersOfLoginDateAndUserIds(String loginDate, String userIds) {
        return dao.getUsersOfLoginDateAndUserIds(loginDate, userIds);
    }
    public List<User> getUsersOfLoginDateAndDesc(String loginDate, String desc) {
        return dao.getUsersOfLoginDateAndDesc(loginDate, desc);
    }
    public List<User> getUsersOfLoginDateAndImage(String loginDate, String image) {
        return dao.getUsersOfLoginDateAndImage(loginDate, image);
    }
    public List<User> getUsersOfLoginDateAndFamous(String loginDate, String famous) {
        return dao.getUsersOfLoginDateAndFamous(loginDate, famous);
    }
    public List<User> getUsersOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        return dao.getUsersOfLoginDateAndBUserIds(loginDate, bUserIds);
    }
    public List<User> getUsersOfPhoneAndEmail(String phone, String email) {
        return dao.getUsersOfPhoneAndEmail(phone, email);
    }
    public List<User> getUsersOfPhoneAndMoney(String phone, String money) {
        return dao.getUsersOfPhoneAndMoney(phone, money);
    }
    public List<User> getUsersOfPhoneAndScore(String phone, String score) {
        return dao.getUsersOfPhoneAndScore(phone, score);
    }
    public List<User> getUsersOfPhoneAndPath(String phone, String path) {
        return dao.getUsersOfPhoneAndPath(phone, path);
    }
    public List<User> getUsersOfPhoneAndParam(String phone, String param) {
        return dao.getUsersOfPhoneAndParam(phone, param);
    }
    public List<User> getUsersOfPhoneAndLvl(String phone, String lvl) {
        return dao.getUsersOfPhoneAndLvl(phone, lvl);
    }
    public List<User> getUsersOfPhoneAndNewIds(String phone, String newIds) {
        return dao.getUsersOfPhoneAndNewIds(phone, newIds);
    }
    public List<User> getUsersOfPhoneAndUserIds(String phone, String userIds) {
        return dao.getUsersOfPhoneAndUserIds(phone, userIds);
    }
    public List<User> getUsersOfPhoneAndDesc(String phone, String desc) {
        return dao.getUsersOfPhoneAndDesc(phone, desc);
    }
    public List<User> getUsersOfPhoneAndImage(String phone, String image) {
        return dao.getUsersOfPhoneAndImage(phone, image);
    }
    public List<User> getUsersOfPhoneAndFamous(String phone, String famous) {
        return dao.getUsersOfPhoneAndFamous(phone, famous);
    }
    public List<User> getUsersOfPhoneAndBUserIds(String phone, String bUserIds) {
        return dao.getUsersOfPhoneAndBUserIds(phone, bUserIds);
    }
    public List<User> getUsersOfEmailAndMoney(String email, String money) {
        return dao.getUsersOfEmailAndMoney(email, money);
    }
    public List<User> getUsersOfEmailAndScore(String email, String score) {
        return dao.getUsersOfEmailAndScore(email, score);
    }
    public List<User> getUsersOfEmailAndPath(String email, String path) {
        return dao.getUsersOfEmailAndPath(email, path);
    }
    public List<User> getUsersOfEmailAndParam(String email, String param) {
        return dao.getUsersOfEmailAndParam(email, param);
    }
    public List<User> getUsersOfEmailAndLvl(String email, String lvl) {
        return dao.getUsersOfEmailAndLvl(email, lvl);
    }
    public List<User> getUsersOfEmailAndNewIds(String email, String newIds) {
        return dao.getUsersOfEmailAndNewIds(email, newIds);
    }
    public List<User> getUsersOfEmailAndUserIds(String email, String userIds) {
        return dao.getUsersOfEmailAndUserIds(email, userIds);
    }
    public List<User> getUsersOfEmailAndDesc(String email, String desc) {
        return dao.getUsersOfEmailAndDesc(email, desc);
    }
    public List<User> getUsersOfEmailAndImage(String email, String image) {
        return dao.getUsersOfEmailAndImage(email, image);
    }
    public List<User> getUsersOfEmailAndFamous(String email, String famous) {
        return dao.getUsersOfEmailAndFamous(email, famous);
    }
    public List<User> getUsersOfEmailAndBUserIds(String email, String bUserIds) {
        return dao.getUsersOfEmailAndBUserIds(email, bUserIds);
    }
    public List<User> getUsersOfMoneyAndScore(String money, String score) {
        return dao.getUsersOfMoneyAndScore(money, score);
    }
    public List<User> getUsersOfMoneyAndPath(String money, String path) {
        return dao.getUsersOfMoneyAndPath(money, path);
    }
    public List<User> getUsersOfMoneyAndParam(String money, String param) {
        return dao.getUsersOfMoneyAndParam(money, param);
    }
    public List<User> getUsersOfMoneyAndLvl(String money, String lvl) {
        return dao.getUsersOfMoneyAndLvl(money, lvl);
    }
    public List<User> getUsersOfMoneyAndNewIds(String money, String newIds) {
        return dao.getUsersOfMoneyAndNewIds(money, newIds);
    }
    public List<User> getUsersOfMoneyAndUserIds(String money, String userIds) {
        return dao.getUsersOfMoneyAndUserIds(money, userIds);
    }
    public List<User> getUsersOfMoneyAndDesc(String money, String desc) {
        return dao.getUsersOfMoneyAndDesc(money, desc);
    }
    public List<User> getUsersOfMoneyAndImage(String money, String image) {
        return dao.getUsersOfMoneyAndImage(money, image);
    }
    public List<User> getUsersOfMoneyAndFamous(String money, String famous) {
        return dao.getUsersOfMoneyAndFamous(money, famous);
    }
    public List<User> getUsersOfMoneyAndBUserIds(String money, String bUserIds) {
        return dao.getUsersOfMoneyAndBUserIds(money, bUserIds);
    }
    public List<User> getUsersOfScoreAndPath(String score, String path) {
        return dao.getUsersOfScoreAndPath(score, path);
    }
    public List<User> getUsersOfScoreAndParam(String score, String param) {
        return dao.getUsersOfScoreAndParam(score, param);
    }
    public List<User> getUsersOfScoreAndLvl(String score, String lvl) {
        return dao.getUsersOfScoreAndLvl(score, lvl);
    }
    public List<User> getUsersOfScoreAndNewIds(String score, String newIds) {
        return dao.getUsersOfScoreAndNewIds(score, newIds);
    }
    public List<User> getUsersOfScoreAndUserIds(String score, String userIds) {
        return dao.getUsersOfScoreAndUserIds(score, userIds);
    }
    public List<User> getUsersOfScoreAndDesc(String score, String desc) {
        return dao.getUsersOfScoreAndDesc(score, desc);
    }
    public List<User> getUsersOfScoreAndImage(String score, String image) {
        return dao.getUsersOfScoreAndImage(score, image);
    }
    public List<User> getUsersOfScoreAndFamous(String score, String famous) {
        return dao.getUsersOfScoreAndFamous(score, famous);
    }
    public List<User> getUsersOfScoreAndBUserIds(String score, String bUserIds) {
        return dao.getUsersOfScoreAndBUserIds(score, bUserIds);
    }
    public List<User> getUsersOfPathAndParam(String path, String param) {
        return dao.getUsersOfPathAndParam(path, param);
    }
    public List<User> getUsersOfPathAndLvl(String path, String lvl) {
        return dao.getUsersOfPathAndLvl(path, lvl);
    }
    public List<User> getUsersOfPathAndNewIds(String path, String newIds) {
        return dao.getUsersOfPathAndNewIds(path, newIds);
    }
    public List<User> getUsersOfPathAndUserIds(String path, String userIds) {
        return dao.getUsersOfPathAndUserIds(path, userIds);
    }
    public List<User> getUsersOfPathAndDesc(String path, String desc) {
        return dao.getUsersOfPathAndDesc(path, desc);
    }
    public List<User> getUsersOfPathAndImage(String path, String image) {
        return dao.getUsersOfPathAndImage(path, image);
    }
    public List<User> getUsersOfPathAndFamous(String path, String famous) {
        return dao.getUsersOfPathAndFamous(path, famous);
    }
    public List<User> getUsersOfPathAndBUserIds(String path, String bUserIds) {
        return dao.getUsersOfPathAndBUserIds(path, bUserIds);
    }
    public List<User> getUsersOfParamAndLvl(String param, String lvl) {
        return dao.getUsersOfParamAndLvl(param, lvl);
    }
    public List<User> getUsersOfParamAndNewIds(String param, String newIds) {
        return dao.getUsersOfParamAndNewIds(param, newIds);
    }
    public List<User> getUsersOfParamAndUserIds(String param, String userIds) {
        return dao.getUsersOfParamAndUserIds(param, userIds);
    }
    public List<User> getUsersOfParamAndDesc(String param, String desc) {
        return dao.getUsersOfParamAndDesc(param, desc);
    }
    public List<User> getUsersOfParamAndImage(String param, String image) {
        return dao.getUsersOfParamAndImage(param, image);
    }
    public List<User> getUsersOfParamAndFamous(String param, String famous) {
        return dao.getUsersOfParamAndFamous(param, famous);
    }
    public List<User> getUsersOfParamAndBUserIds(String param, String bUserIds) {
        return dao.getUsersOfParamAndBUserIds(param, bUserIds);
    }
    public List<User> getUsersOfLvlAndNewIds(String lvl, String newIds) {
        return dao.getUsersOfLvlAndNewIds(lvl, newIds);
    }
    public List<User> getUsersOfLvlAndUserIds(String lvl, String userIds) {
        return dao.getUsersOfLvlAndUserIds(lvl, userIds);
    }
    public List<User> getUsersOfLvlAndDesc(String lvl, String desc) {
        return dao.getUsersOfLvlAndDesc(lvl, desc);
    }
    public List<User> getUsersOfLvlAndImage(String lvl, String image) {
        return dao.getUsersOfLvlAndImage(lvl, image);
    }
    public List<User> getUsersOfLvlAndFamous(String lvl, String famous) {
        return dao.getUsersOfLvlAndFamous(lvl, famous);
    }
    public List<User> getUsersOfLvlAndBUserIds(String lvl, String bUserIds) {
        return dao.getUsersOfLvlAndBUserIds(lvl, bUserIds);
    }
    public List<User> getUsersOfNewIdsAndUserIds(String newIds, String userIds) {
        return dao.getUsersOfNewIdsAndUserIds(newIds, userIds);
    }
    public List<User> getUsersOfNewIdsAndDesc(String newIds, String desc) {
        return dao.getUsersOfNewIdsAndDesc(newIds, desc);
    }
    public List<User> getUsersOfNewIdsAndImage(String newIds, String image) {
        return dao.getUsersOfNewIdsAndImage(newIds, image);
    }
    public List<User> getUsersOfNewIdsAndFamous(String newIds, String famous) {
        return dao.getUsersOfNewIdsAndFamous(newIds, famous);
    }
    public List<User> getUsersOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        return dao.getUsersOfNewIdsAndBUserIds(newIds, bUserIds);
    }
    public List<User> getUsersOfUserIdsAndDesc(String userIds, String desc) {
        return dao.getUsersOfUserIdsAndDesc(userIds, desc);
    }
    public List<User> getUsersOfUserIdsAndImage(String userIds, String image) {
        return dao.getUsersOfUserIdsAndImage(userIds, image);
    }
    public List<User> getUsersOfUserIdsAndFamous(String userIds, String famous) {
        return dao.getUsersOfUserIdsAndFamous(userIds, famous);
    }
    public List<User> getUsersOfUserIdsAndBUserIds(String userIds, String bUserIds) {
        return dao.getUsersOfUserIdsAndBUserIds(userIds, bUserIds);
    }
    public List<User> getUsersOfDescAndImage(String desc, String image) {
        return dao.getUsersOfDescAndImage(desc, image);
    }
    public List<User> getUsersOfDescAndFamous(String desc, String famous) {
        return dao.getUsersOfDescAndFamous(desc, famous);
    }
    public List<User> getUsersOfDescAndBUserIds(String desc, String bUserIds) {
        return dao.getUsersOfDescAndBUserIds(desc, bUserIds);
    }
    public List<User> getUsersOfImageAndFamous(String image, String famous) {
        return dao.getUsersOfImageAndFamous(image, famous);
    }
    public List<User> getUsersOfImageAndBUserIds(String image, String bUserIds) {
        return dao.getUsersOfImageAndBUserIds(image, bUserIds);
    }
    public List<User> getUsersOfFamousAndBUserIds(String famous, String bUserIds) {
        return dao.getUsersOfFamousAndBUserIds(famous, bUserIds);
    }
}
