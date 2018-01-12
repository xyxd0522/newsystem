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
    public int updateOfImage(User user, String image) {
        return dao.updateOfImage(user, image);
    }
    public int updateOfLvl(User user, String lvl) {
        return dao.updateOfLvl(user, lvl);
    }
    public int updateOfNewIds(User user, String newIds) {
        return dao.updateOfNewIds(user, newIds);
    }
    public int updateOfFamous(User user, String famous) {
        return dao.updateOfFamous(user, famous);
    }
    public int updateOfSex(User user, String sex) {
        return dao.updateOfSex(user, sex);
    }
    public int updateOfLoginDate(User user, String loginDate) {
        return dao.updateOfLoginDate(user, loginDate);
    }
    public int updateOfUserId(User user, String userId) {
        return dao.updateOfUserId(user, userId);
    }
    public int updateOfBUserIds(User user, String bUserIds) {
        return dao.updateOfBUserIds(user, bUserIds);
    }
    public int updateOfScore(User user, String score) {
        return dao.updateOfScore(user, score);
    }
    public int updateOfPath(User user, String path) {
        return dao.updateOfPath(user, path);
    }
    public int updateOfPassword(User user, String password) {
        return dao.updateOfPassword(user, password);
    }
    public int updateOfMoney(User user, String money) {
        return dao.updateOfMoney(user, money);
    }
    public int updateOfPhone(User user, String phone) {
        return dao.updateOfPhone(user, phone);
    }
    public int updateOfParam(User user, String param) {
        return dao.updateOfParam(user, param);
    }
    public int updateOfUserIds(User user, String userIds) {
        return dao.updateOfUserIds(user, userIds);
    }
    public int updateOfName(User user, String name) {
        return dao.updateOfName(user, name);
    }
    public int updateOfResgisterDate(User user, String resgisterDate) {
        return dao.updateOfResgisterDate(user, resgisterDate);
    }
    public int updateOfEmail(User user, String email) {
        return dao.updateOfEmail(user, email);
    }
    public int updateOfDesc(User user, String desc) {
        return dao.updateOfDesc(user, desc);
    }
    public int updateOfImageAndLvl(User user, String image, String lvl) {
        return dao.updateOfImageAndLvl(user, image, lvl);
    }
    public int updateOfImageAndNewIds(User user, String image, String newIds) {
        return dao.updateOfImageAndNewIds(user, image, newIds);
    }
    public int updateOfImageAndFamous(User user, String image, String famous) {
        return dao.updateOfImageAndFamous(user, image, famous);
    }
    public int updateOfImageAndSex(User user, String image, String sex) {
        return dao.updateOfImageAndSex(user, image, sex);
    }
    public int updateOfImageAndLoginDate(User user, String image, String loginDate) {
        return dao.updateOfImageAndLoginDate(user, image, loginDate);
    }
    public int updateOfImageAndUserId(User user, String image, String userId) {
        return dao.updateOfImageAndUserId(user, image, userId);
    }
    public int updateOfImageAndBUserIds(User user, String image, String bUserIds) {
        return dao.updateOfImageAndBUserIds(user, image, bUserIds);
    }
    public int updateOfImageAndScore(User user, String image, String score) {
        return dao.updateOfImageAndScore(user, image, score);
    }
    public int updateOfImageAndPath(User user, String image, String path) {
        return dao.updateOfImageAndPath(user, image, path);
    }
    public int updateOfImageAndPassword(User user, String image, String password) {
        return dao.updateOfImageAndPassword(user, image, password);
    }
    public int updateOfImageAndMoney(User user, String image, String money) {
        return dao.updateOfImageAndMoney(user, image, money);
    }
    public int updateOfImageAndPhone(User user, String image, String phone) {
        return dao.updateOfImageAndPhone(user, image, phone);
    }
    public int updateOfImageAndParam(User user, String image, String param) {
        return dao.updateOfImageAndParam(user, image, param);
    }
    public int updateOfImageAndUserIds(User user, String image, String userIds) {
        return dao.updateOfImageAndUserIds(user, image, userIds);
    }
    public int updateOfImageAndName(User user, String image, String name) {
        return dao.updateOfImageAndName(user, image, name);
    }
    public int updateOfImageAndResgisterDate(User user, String image, String resgisterDate) {
        return dao.updateOfImageAndResgisterDate(user, image, resgisterDate);
    }
    public int updateOfImageAndEmail(User user, String image, String email) {
        return dao.updateOfImageAndEmail(user, image, email);
    }
    public int updateOfImageAndDesc(User user, String image, String desc) {
        return dao.updateOfImageAndDesc(user, image, desc);
    }
    public int updateOfLvlAndNewIds(User user, String lvl, String newIds) {
        return dao.updateOfLvlAndNewIds(user, lvl, newIds);
    }
    public int updateOfLvlAndFamous(User user, String lvl, String famous) {
        return dao.updateOfLvlAndFamous(user, lvl, famous);
    }
    public int updateOfLvlAndSex(User user, String lvl, String sex) {
        return dao.updateOfLvlAndSex(user, lvl, sex);
    }
    public int updateOfLvlAndLoginDate(User user, String lvl, String loginDate) {
        return dao.updateOfLvlAndLoginDate(user, lvl, loginDate);
    }
    public int updateOfLvlAndUserId(User user, String lvl, String userId) {
        return dao.updateOfLvlAndUserId(user, lvl, userId);
    }
    public int updateOfLvlAndBUserIds(User user, String lvl, String bUserIds) {
        return dao.updateOfLvlAndBUserIds(user, lvl, bUserIds);
    }
    public int updateOfLvlAndScore(User user, String lvl, String score) {
        return dao.updateOfLvlAndScore(user, lvl, score);
    }
    public int updateOfLvlAndPath(User user, String lvl, String path) {
        return dao.updateOfLvlAndPath(user, lvl, path);
    }
    public int updateOfLvlAndPassword(User user, String lvl, String password) {
        return dao.updateOfLvlAndPassword(user, lvl, password);
    }
    public int updateOfLvlAndMoney(User user, String lvl, String money) {
        return dao.updateOfLvlAndMoney(user, lvl, money);
    }
    public int updateOfLvlAndPhone(User user, String lvl, String phone) {
        return dao.updateOfLvlAndPhone(user, lvl, phone);
    }
    public int updateOfLvlAndParam(User user, String lvl, String param) {
        return dao.updateOfLvlAndParam(user, lvl, param);
    }
    public int updateOfLvlAndUserIds(User user, String lvl, String userIds) {
        return dao.updateOfLvlAndUserIds(user, lvl, userIds);
    }
    public int updateOfLvlAndName(User user, String lvl, String name) {
        return dao.updateOfLvlAndName(user, lvl, name);
    }
    public int updateOfLvlAndResgisterDate(User user, String lvl, String resgisterDate) {
        return dao.updateOfLvlAndResgisterDate(user, lvl, resgisterDate);
    }
    public int updateOfLvlAndEmail(User user, String lvl, String email) {
        return dao.updateOfLvlAndEmail(user, lvl, email);
    }
    public int updateOfLvlAndDesc(User user, String lvl, String desc) {
        return dao.updateOfLvlAndDesc(user, lvl, desc);
    }
    public int updateOfNewIdsAndFamous(User user, String newIds, String famous) {
        return dao.updateOfNewIdsAndFamous(user, newIds, famous);
    }
    public int updateOfNewIdsAndSex(User user, String newIds, String sex) {
        return dao.updateOfNewIdsAndSex(user, newIds, sex);
    }
    public int updateOfNewIdsAndLoginDate(User user, String newIds, String loginDate) {
        return dao.updateOfNewIdsAndLoginDate(user, newIds, loginDate);
    }
    public int updateOfNewIdsAndUserId(User user, String newIds, String userId) {
        return dao.updateOfNewIdsAndUserId(user, newIds, userId);
    }
    public int updateOfNewIdsAndBUserIds(User user, String newIds, String bUserIds) {
        return dao.updateOfNewIdsAndBUserIds(user, newIds, bUserIds);
    }
    public int updateOfNewIdsAndScore(User user, String newIds, String score) {
        return dao.updateOfNewIdsAndScore(user, newIds, score);
    }
    public int updateOfNewIdsAndPath(User user, String newIds, String path) {
        return dao.updateOfNewIdsAndPath(user, newIds, path);
    }
    public int updateOfNewIdsAndPassword(User user, String newIds, String password) {
        return dao.updateOfNewIdsAndPassword(user, newIds, password);
    }
    public int updateOfNewIdsAndMoney(User user, String newIds, String money) {
        return dao.updateOfNewIdsAndMoney(user, newIds, money);
    }
    public int updateOfNewIdsAndPhone(User user, String newIds, String phone) {
        return dao.updateOfNewIdsAndPhone(user, newIds, phone);
    }
    public int updateOfNewIdsAndParam(User user, String newIds, String param) {
        return dao.updateOfNewIdsAndParam(user, newIds, param);
    }
    public int updateOfNewIdsAndUserIds(User user, String newIds, String userIds) {
        return dao.updateOfNewIdsAndUserIds(user, newIds, userIds);
    }
    public int updateOfNewIdsAndName(User user, String newIds, String name) {
        return dao.updateOfNewIdsAndName(user, newIds, name);
    }
    public int updateOfNewIdsAndResgisterDate(User user, String newIds, String resgisterDate) {
        return dao.updateOfNewIdsAndResgisterDate(user, newIds, resgisterDate);
    }
    public int updateOfNewIdsAndEmail(User user, String newIds, String email) {
        return dao.updateOfNewIdsAndEmail(user, newIds, email);
    }
    public int updateOfNewIdsAndDesc(User user, String newIds, String desc) {
        return dao.updateOfNewIdsAndDesc(user, newIds, desc);
    }
    public int updateOfFamousAndSex(User user, String famous, String sex) {
        return dao.updateOfFamousAndSex(user, famous, sex);
    }
    public int updateOfFamousAndLoginDate(User user, String famous, String loginDate) {
        return dao.updateOfFamousAndLoginDate(user, famous, loginDate);
    }
    public int updateOfFamousAndUserId(User user, String famous, String userId) {
        return dao.updateOfFamousAndUserId(user, famous, userId);
    }
    public int updateOfFamousAndBUserIds(User user, String famous, String bUserIds) {
        return dao.updateOfFamousAndBUserIds(user, famous, bUserIds);
    }
    public int updateOfFamousAndScore(User user, String famous, String score) {
        return dao.updateOfFamousAndScore(user, famous, score);
    }
    public int updateOfFamousAndPath(User user, String famous, String path) {
        return dao.updateOfFamousAndPath(user, famous, path);
    }
    public int updateOfFamousAndPassword(User user, String famous, String password) {
        return dao.updateOfFamousAndPassword(user, famous, password);
    }
    public int updateOfFamousAndMoney(User user, String famous, String money) {
        return dao.updateOfFamousAndMoney(user, famous, money);
    }
    public int updateOfFamousAndPhone(User user, String famous, String phone) {
        return dao.updateOfFamousAndPhone(user, famous, phone);
    }
    public int updateOfFamousAndParam(User user, String famous, String param) {
        return dao.updateOfFamousAndParam(user, famous, param);
    }
    public int updateOfFamousAndUserIds(User user, String famous, String userIds) {
        return dao.updateOfFamousAndUserIds(user, famous, userIds);
    }
    public int updateOfFamousAndName(User user, String famous, String name) {
        return dao.updateOfFamousAndName(user, famous, name);
    }
    public int updateOfFamousAndResgisterDate(User user, String famous, String resgisterDate) {
        return dao.updateOfFamousAndResgisterDate(user, famous, resgisterDate);
    }
    public int updateOfFamousAndEmail(User user, String famous, String email) {
        return dao.updateOfFamousAndEmail(user, famous, email);
    }
    public int updateOfFamousAndDesc(User user, String famous, String desc) {
        return dao.updateOfFamousAndDesc(user, famous, desc);
    }
    public int updateOfSexAndLoginDate(User user, String sex, String loginDate) {
        return dao.updateOfSexAndLoginDate(user, sex, loginDate);
    }
    public int updateOfSexAndUserId(User user, String sex, String userId) {
        return dao.updateOfSexAndUserId(user, sex, userId);
    }
    public int updateOfSexAndBUserIds(User user, String sex, String bUserIds) {
        return dao.updateOfSexAndBUserIds(user, sex, bUserIds);
    }
    public int updateOfSexAndScore(User user, String sex, String score) {
        return dao.updateOfSexAndScore(user, sex, score);
    }
    public int updateOfSexAndPath(User user, String sex, String path) {
        return dao.updateOfSexAndPath(user, sex, path);
    }
    public int updateOfSexAndPassword(User user, String sex, String password) {
        return dao.updateOfSexAndPassword(user, sex, password);
    }
    public int updateOfSexAndMoney(User user, String sex, String money) {
        return dao.updateOfSexAndMoney(user, sex, money);
    }
    public int updateOfSexAndPhone(User user, String sex, String phone) {
        return dao.updateOfSexAndPhone(user, sex, phone);
    }
    public int updateOfSexAndParam(User user, String sex, String param) {
        return dao.updateOfSexAndParam(user, sex, param);
    }
    public int updateOfSexAndUserIds(User user, String sex, String userIds) {
        return dao.updateOfSexAndUserIds(user, sex, userIds);
    }
    public int updateOfSexAndName(User user, String sex, String name) {
        return dao.updateOfSexAndName(user, sex, name);
    }
    public int updateOfSexAndResgisterDate(User user, String sex, String resgisterDate) {
        return dao.updateOfSexAndResgisterDate(user, sex, resgisterDate);
    }
    public int updateOfSexAndEmail(User user, String sex, String email) {
        return dao.updateOfSexAndEmail(user, sex, email);
    }
    public int updateOfSexAndDesc(User user, String sex, String desc) {
        return dao.updateOfSexAndDesc(user, sex, desc);
    }
    public int updateOfLoginDateAndUserId(User user, String loginDate, String userId) {
        return dao.updateOfLoginDateAndUserId(user, loginDate, userId);
    }
    public int updateOfLoginDateAndBUserIds(User user, String loginDate, String bUserIds) {
        return dao.updateOfLoginDateAndBUserIds(user, loginDate, bUserIds);
    }
    public int updateOfLoginDateAndScore(User user, String loginDate, String score) {
        return dao.updateOfLoginDateAndScore(user, loginDate, score);
    }
    public int updateOfLoginDateAndPath(User user, String loginDate, String path) {
        return dao.updateOfLoginDateAndPath(user, loginDate, path);
    }
    public int updateOfLoginDateAndPassword(User user, String loginDate, String password) {
        return dao.updateOfLoginDateAndPassword(user, loginDate, password);
    }
    public int updateOfLoginDateAndMoney(User user, String loginDate, String money) {
        return dao.updateOfLoginDateAndMoney(user, loginDate, money);
    }
    public int updateOfLoginDateAndPhone(User user, String loginDate, String phone) {
        return dao.updateOfLoginDateAndPhone(user, loginDate, phone);
    }
    public int updateOfLoginDateAndParam(User user, String loginDate, String param) {
        return dao.updateOfLoginDateAndParam(user, loginDate, param);
    }
    public int updateOfLoginDateAndUserIds(User user, String loginDate, String userIds) {
        return dao.updateOfLoginDateAndUserIds(user, loginDate, userIds);
    }
    public int updateOfLoginDateAndName(User user, String loginDate, String name) {
        return dao.updateOfLoginDateAndName(user, loginDate, name);
    }
    public int updateOfLoginDateAndResgisterDate(User user, String loginDate, String resgisterDate) {
        return dao.updateOfLoginDateAndResgisterDate(user, loginDate, resgisterDate);
    }
    public int updateOfLoginDateAndEmail(User user, String loginDate, String email) {
        return dao.updateOfLoginDateAndEmail(user, loginDate, email);
    }
    public int updateOfLoginDateAndDesc(User user, String loginDate, String desc) {
        return dao.updateOfLoginDateAndDesc(user, loginDate, desc);
    }
    public int updateOfUserIdAndBUserIds(User user, String userId, String bUserIds) {
        return dao.updateOfUserIdAndBUserIds(user, userId, bUserIds);
    }
    public int updateOfUserIdAndScore(User user, String userId, String score) {
        return dao.updateOfUserIdAndScore(user, userId, score);
    }
    public int updateOfUserIdAndPath(User user, String userId, String path) {
        return dao.updateOfUserIdAndPath(user, userId, path);
    }
    public int updateOfUserIdAndPassword(User user, String userId, String password) {
        return dao.updateOfUserIdAndPassword(user, userId, password);
    }
    public int updateOfUserIdAndMoney(User user, String userId, String money) {
        return dao.updateOfUserIdAndMoney(user, userId, money);
    }
    public int updateOfUserIdAndPhone(User user, String userId, String phone) {
        return dao.updateOfUserIdAndPhone(user, userId, phone);
    }
    public int updateOfUserIdAndParam(User user, String userId, String param) {
        return dao.updateOfUserIdAndParam(user, userId, param);
    }
    public int updateOfUserIdAndUserIds(User user, String userId, String userIds) {
        return dao.updateOfUserIdAndUserIds(user, userId, userIds);
    }
    public int updateOfUserIdAndName(User user, String userId, String name) {
        return dao.updateOfUserIdAndName(user, userId, name);
    }
    public int updateOfUserIdAndResgisterDate(User user, String userId, String resgisterDate) {
        return dao.updateOfUserIdAndResgisterDate(user, userId, resgisterDate);
    }
    public int updateOfUserIdAndEmail(User user, String userId, String email) {
        return dao.updateOfUserIdAndEmail(user, userId, email);
    }
    public int updateOfUserIdAndDesc(User user, String userId, String desc) {
        return dao.updateOfUserIdAndDesc(user, userId, desc);
    }
    public int updateOfBUserIdsAndScore(User user, String bUserIds, String score) {
        return dao.updateOfBUserIdsAndScore(user, bUserIds, score);
    }
    public int updateOfBUserIdsAndPath(User user, String bUserIds, String path) {
        return dao.updateOfBUserIdsAndPath(user, bUserIds, path);
    }
    public int updateOfBUserIdsAndPassword(User user, String bUserIds, String password) {
        return dao.updateOfBUserIdsAndPassword(user, bUserIds, password);
    }
    public int updateOfBUserIdsAndMoney(User user, String bUserIds, String money) {
        return dao.updateOfBUserIdsAndMoney(user, bUserIds, money);
    }
    public int updateOfBUserIdsAndPhone(User user, String bUserIds, String phone) {
        return dao.updateOfBUserIdsAndPhone(user, bUserIds, phone);
    }
    public int updateOfBUserIdsAndParam(User user, String bUserIds, String param) {
        return dao.updateOfBUserIdsAndParam(user, bUserIds, param);
    }
    public int updateOfBUserIdsAndUserIds(User user, String bUserIds, String userIds) {
        return dao.updateOfBUserIdsAndUserIds(user, bUserIds, userIds);
    }
    public int updateOfBUserIdsAndName(User user, String bUserIds, String name) {
        return dao.updateOfBUserIdsAndName(user, bUserIds, name);
    }
    public int updateOfBUserIdsAndResgisterDate(User user, String bUserIds, String resgisterDate) {
        return dao.updateOfBUserIdsAndResgisterDate(user, bUserIds, resgisterDate);
    }
    public int updateOfBUserIdsAndEmail(User user, String bUserIds, String email) {
        return dao.updateOfBUserIdsAndEmail(user, bUserIds, email);
    }
    public int updateOfBUserIdsAndDesc(User user, String bUserIds, String desc) {
        return dao.updateOfBUserIdsAndDesc(user, bUserIds, desc);
    }
    public int updateOfScoreAndPath(User user, String score, String path) {
        return dao.updateOfScoreAndPath(user, score, path);
    }
    public int updateOfScoreAndPassword(User user, String score, String password) {
        return dao.updateOfScoreAndPassword(user, score, password);
    }
    public int updateOfScoreAndMoney(User user, String score, String money) {
        return dao.updateOfScoreAndMoney(user, score, money);
    }
    public int updateOfScoreAndPhone(User user, String score, String phone) {
        return dao.updateOfScoreAndPhone(user, score, phone);
    }
    public int updateOfScoreAndParam(User user, String score, String param) {
        return dao.updateOfScoreAndParam(user, score, param);
    }
    public int updateOfScoreAndUserIds(User user, String score, String userIds) {
        return dao.updateOfScoreAndUserIds(user, score, userIds);
    }
    public int updateOfScoreAndName(User user, String score, String name) {
        return dao.updateOfScoreAndName(user, score, name);
    }
    public int updateOfScoreAndResgisterDate(User user, String score, String resgisterDate) {
        return dao.updateOfScoreAndResgisterDate(user, score, resgisterDate);
    }
    public int updateOfScoreAndEmail(User user, String score, String email) {
        return dao.updateOfScoreAndEmail(user, score, email);
    }
    public int updateOfScoreAndDesc(User user, String score, String desc) {
        return dao.updateOfScoreAndDesc(user, score, desc);
    }
    public int updateOfPathAndPassword(User user, String path, String password) {
        return dao.updateOfPathAndPassword(user, path, password);
    }
    public int updateOfPathAndMoney(User user, String path, String money) {
        return dao.updateOfPathAndMoney(user, path, money);
    }
    public int updateOfPathAndPhone(User user, String path, String phone) {
        return dao.updateOfPathAndPhone(user, path, phone);
    }
    public int updateOfPathAndParam(User user, String path, String param) {
        return dao.updateOfPathAndParam(user, path, param);
    }
    public int updateOfPathAndUserIds(User user, String path, String userIds) {
        return dao.updateOfPathAndUserIds(user, path, userIds);
    }
    public int updateOfPathAndName(User user, String path, String name) {
        return dao.updateOfPathAndName(user, path, name);
    }
    public int updateOfPathAndResgisterDate(User user, String path, String resgisterDate) {
        return dao.updateOfPathAndResgisterDate(user, path, resgisterDate);
    }
    public int updateOfPathAndEmail(User user, String path, String email) {
        return dao.updateOfPathAndEmail(user, path, email);
    }
    public int updateOfPathAndDesc(User user, String path, String desc) {
        return dao.updateOfPathAndDesc(user, path, desc);
    }
    public int updateOfPasswordAndMoney(User user, String password, String money) {
        return dao.updateOfPasswordAndMoney(user, password, money);
    }
    public int updateOfPasswordAndPhone(User user, String password, String phone) {
        return dao.updateOfPasswordAndPhone(user, password, phone);
    }
    public int updateOfPasswordAndParam(User user, String password, String param) {
        return dao.updateOfPasswordAndParam(user, password, param);
    }
    public int updateOfPasswordAndUserIds(User user, String password, String userIds) {
        return dao.updateOfPasswordAndUserIds(user, password, userIds);
    }
    public int updateOfPasswordAndName(User user, String password, String name) {
        return dao.updateOfPasswordAndName(user, password, name);
    }
    public int updateOfPasswordAndResgisterDate(User user, String password, String resgisterDate) {
        return dao.updateOfPasswordAndResgisterDate(user, password, resgisterDate);
    }
    public int updateOfPasswordAndEmail(User user, String password, String email) {
        return dao.updateOfPasswordAndEmail(user, password, email);
    }
    public int updateOfPasswordAndDesc(User user, String password, String desc) {
        return dao.updateOfPasswordAndDesc(user, password, desc);
    }
    public int updateOfMoneyAndPhone(User user, String money, String phone) {
        return dao.updateOfMoneyAndPhone(user, money, phone);
    }
    public int updateOfMoneyAndParam(User user, String money, String param) {
        return dao.updateOfMoneyAndParam(user, money, param);
    }
    public int updateOfMoneyAndUserIds(User user, String money, String userIds) {
        return dao.updateOfMoneyAndUserIds(user, money, userIds);
    }
    public int updateOfMoneyAndName(User user, String money, String name) {
        return dao.updateOfMoneyAndName(user, money, name);
    }
    public int updateOfMoneyAndResgisterDate(User user, String money, String resgisterDate) {
        return dao.updateOfMoneyAndResgisterDate(user, money, resgisterDate);
    }
    public int updateOfMoneyAndEmail(User user, String money, String email) {
        return dao.updateOfMoneyAndEmail(user, money, email);
    }
    public int updateOfMoneyAndDesc(User user, String money, String desc) {
        return dao.updateOfMoneyAndDesc(user, money, desc);
    }
    public int updateOfPhoneAndParam(User user, String phone, String param) {
        return dao.updateOfPhoneAndParam(user, phone, param);
    }
    public int updateOfPhoneAndUserIds(User user, String phone, String userIds) {
        return dao.updateOfPhoneAndUserIds(user, phone, userIds);
    }
    public int updateOfPhoneAndName(User user, String phone, String name) {
        return dao.updateOfPhoneAndName(user, phone, name);
    }
    public int updateOfPhoneAndResgisterDate(User user, String phone, String resgisterDate) {
        return dao.updateOfPhoneAndResgisterDate(user, phone, resgisterDate);
    }
    public int updateOfPhoneAndEmail(User user, String phone, String email) {
        return dao.updateOfPhoneAndEmail(user, phone, email);
    }
    public int updateOfPhoneAndDesc(User user, String phone, String desc) {
        return dao.updateOfPhoneAndDesc(user, phone, desc);
    }
    public int updateOfParamAndUserIds(User user, String param, String userIds) {
        return dao.updateOfParamAndUserIds(user, param, userIds);
    }
    public int updateOfParamAndName(User user, String param, String name) {
        return dao.updateOfParamAndName(user, param, name);
    }
    public int updateOfParamAndResgisterDate(User user, String param, String resgisterDate) {
        return dao.updateOfParamAndResgisterDate(user, param, resgisterDate);
    }
    public int updateOfParamAndEmail(User user, String param, String email) {
        return dao.updateOfParamAndEmail(user, param, email);
    }
    public int updateOfParamAndDesc(User user, String param, String desc) {
        return dao.updateOfParamAndDesc(user, param, desc);
    }
    public int updateOfUserIdsAndName(User user, String userIds, String name) {
        return dao.updateOfUserIdsAndName(user, userIds, name);
    }
    public int updateOfUserIdsAndResgisterDate(User user, String userIds, String resgisterDate) {
        return dao.updateOfUserIdsAndResgisterDate(user, userIds, resgisterDate);
    }
    public int updateOfUserIdsAndEmail(User user, String userIds, String email) {
        return dao.updateOfUserIdsAndEmail(user, userIds, email);
    }
    public int updateOfUserIdsAndDesc(User user, String userIds, String desc) {
        return dao.updateOfUserIdsAndDesc(user, userIds, desc);
    }
    public int updateOfNameAndResgisterDate(User user, String name, String resgisterDate) {
        return dao.updateOfNameAndResgisterDate(user, name, resgisterDate);
    }
    public int updateOfNameAndEmail(User user, String name, String email) {
        return dao.updateOfNameAndEmail(user, name, email);
    }
    public int updateOfNameAndDesc(User user, String name, String desc) {
        return dao.updateOfNameAndDesc(user, name, desc);
    }
    public int updateOfResgisterDateAndEmail(User user, String resgisterDate, String email) {
        return dao.updateOfResgisterDateAndEmail(user, resgisterDate, email);
    }
    public int updateOfResgisterDateAndDesc(User user, String resgisterDate, String desc) {
        return dao.updateOfResgisterDateAndDesc(user, resgisterDate, desc);
    }
    public int updateOfEmailAndDesc(User user, String email, String desc) {
        return dao.updateOfEmailAndDesc(user, email, desc);
    }
    public int remove(User user) {
        return dao.remove(user);
    }
    public int removeOfImage(String image) {
        return dao.removeOfImage(image);
    }
    public int removeOfLvl(String lvl) {
        return dao.removeOfLvl(lvl);
    }
    public int removeOfNewIds(String newIds) {
        return dao.removeOfNewIds(newIds);
    }
    public int removeOfFamous(String famous) {
        return dao.removeOfFamous(famous);
    }
    public int removeOfSex(String sex) {
        return dao.removeOfSex(sex);
    }
    public int removeOfLoginDate(String loginDate) {
        return dao.removeOfLoginDate(loginDate);
    }
    public int removeOfUserId(String userId) {
        return dao.removeOfUserId(userId);
    }
    public int removeOfBUserIds(String bUserIds) {
        return dao.removeOfBUserIds(bUserIds);
    }
    public int removeOfScore(String score) {
        return dao.removeOfScore(score);
    }
    public int removeOfPath(String path) {
        return dao.removeOfPath(path);
    }
    public int removeOfPassword(String password) {
        return dao.removeOfPassword(password);
    }
    public int removeOfMoney(String money) {
        return dao.removeOfMoney(money);
    }
    public int removeOfPhone(String phone) {
        return dao.removeOfPhone(phone);
    }
    public int removeOfParam(String param) {
        return dao.removeOfParam(param);
    }
    public int removeOfUserIds(String userIds) {
        return dao.removeOfUserIds(userIds);
    }
    public int removeOfName(String name) {
        return dao.removeOfName(name);
    }
    public int removeOfResgisterDate(String resgisterDate) {
        return dao.removeOfResgisterDate(resgisterDate);
    }
    public int removeOfEmail(String email) {
        return dao.removeOfEmail(email);
    }
    public int removeOfDesc(String desc) {
        return dao.removeOfDesc(desc);
    }
    public int removeOfImageAndLvl(String image, String lvl) {
        return dao.removeOfImageAndLvl(image, lvl);
    }
    public int removeOfImageAndNewIds(String image, String newIds) {
        return dao.removeOfImageAndNewIds(image, newIds);
    }
    public int removeOfImageAndFamous(String image, String famous) {
        return dao.removeOfImageAndFamous(image, famous);
    }
    public int removeOfImageAndSex(String image, String sex) {
        return dao.removeOfImageAndSex(image, sex);
    }
    public int removeOfImageAndLoginDate(String image, String loginDate) {
        return dao.removeOfImageAndLoginDate(image, loginDate);
    }
    public int removeOfImageAndUserId(String image, String userId) {
        return dao.removeOfImageAndUserId(image, userId);
    }
    public int removeOfImageAndBUserIds(String image, String bUserIds) {
        return dao.removeOfImageAndBUserIds(image, bUserIds);
    }
    public int removeOfImageAndScore(String image, String score) {
        return dao.removeOfImageAndScore(image, score);
    }
    public int removeOfImageAndPath(String image, String path) {
        return dao.removeOfImageAndPath(image, path);
    }
    public int removeOfImageAndPassword(String image, String password) {
        return dao.removeOfImageAndPassword(image, password);
    }
    public int removeOfImageAndMoney(String image, String money) {
        return dao.removeOfImageAndMoney(image, money);
    }
    public int removeOfImageAndPhone(String image, String phone) {
        return dao.removeOfImageAndPhone(image, phone);
    }
    public int removeOfImageAndParam(String image, String param) {
        return dao.removeOfImageAndParam(image, param);
    }
    public int removeOfImageAndUserIds(String image, String userIds) {
        return dao.removeOfImageAndUserIds(image, userIds);
    }
    public int removeOfImageAndName(String image, String name) {
        return dao.removeOfImageAndName(image, name);
    }
    public int removeOfImageAndResgisterDate(String image, String resgisterDate) {
        return dao.removeOfImageAndResgisterDate(image, resgisterDate);
    }
    public int removeOfImageAndEmail(String image, String email) {
        return dao.removeOfImageAndEmail(image, email);
    }
    public int removeOfImageAndDesc(String image, String desc) {
        return dao.removeOfImageAndDesc(image, desc);
    }
    public int removeOfLvlAndNewIds(String lvl, String newIds) {
        return dao.removeOfLvlAndNewIds(lvl, newIds);
    }
    public int removeOfLvlAndFamous(String lvl, String famous) {
        return dao.removeOfLvlAndFamous(lvl, famous);
    }
    public int removeOfLvlAndSex(String lvl, String sex) {
        return dao.removeOfLvlAndSex(lvl, sex);
    }
    public int removeOfLvlAndLoginDate(String lvl, String loginDate) {
        return dao.removeOfLvlAndLoginDate(lvl, loginDate);
    }
    public int removeOfLvlAndUserId(String lvl, String userId) {
        return dao.removeOfLvlAndUserId(lvl, userId);
    }
    public int removeOfLvlAndBUserIds(String lvl, String bUserIds) {
        return dao.removeOfLvlAndBUserIds(lvl, bUserIds);
    }
    public int removeOfLvlAndScore(String lvl, String score) {
        return dao.removeOfLvlAndScore(lvl, score);
    }
    public int removeOfLvlAndPath(String lvl, String path) {
        return dao.removeOfLvlAndPath(lvl, path);
    }
    public int removeOfLvlAndPassword(String lvl, String password) {
        return dao.removeOfLvlAndPassword(lvl, password);
    }
    public int removeOfLvlAndMoney(String lvl, String money) {
        return dao.removeOfLvlAndMoney(lvl, money);
    }
    public int removeOfLvlAndPhone(String lvl, String phone) {
        return dao.removeOfLvlAndPhone(lvl, phone);
    }
    public int removeOfLvlAndParam(String lvl, String param) {
        return dao.removeOfLvlAndParam(lvl, param);
    }
    public int removeOfLvlAndUserIds(String lvl, String userIds) {
        return dao.removeOfLvlAndUserIds(lvl, userIds);
    }
    public int removeOfLvlAndName(String lvl, String name) {
        return dao.removeOfLvlAndName(lvl, name);
    }
    public int removeOfLvlAndResgisterDate(String lvl, String resgisterDate) {
        return dao.removeOfLvlAndResgisterDate(lvl, resgisterDate);
    }
    public int removeOfLvlAndEmail(String lvl, String email) {
        return dao.removeOfLvlAndEmail(lvl, email);
    }
    public int removeOfLvlAndDesc(String lvl, String desc) {
        return dao.removeOfLvlAndDesc(lvl, desc);
    }
    public int removeOfNewIdsAndFamous(String newIds, String famous) {
        return dao.removeOfNewIdsAndFamous(newIds, famous);
    }
    public int removeOfNewIdsAndSex(String newIds, String sex) {
        return dao.removeOfNewIdsAndSex(newIds, sex);
    }
    public int removeOfNewIdsAndLoginDate(String newIds, String loginDate) {
        return dao.removeOfNewIdsAndLoginDate(newIds, loginDate);
    }
    public int removeOfNewIdsAndUserId(String newIds, String userId) {
        return dao.removeOfNewIdsAndUserId(newIds, userId);
    }
    public int removeOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        return dao.removeOfNewIdsAndBUserIds(newIds, bUserIds);
    }
    public int removeOfNewIdsAndScore(String newIds, String score) {
        return dao.removeOfNewIdsAndScore(newIds, score);
    }
    public int removeOfNewIdsAndPath(String newIds, String path) {
        return dao.removeOfNewIdsAndPath(newIds, path);
    }
    public int removeOfNewIdsAndPassword(String newIds, String password) {
        return dao.removeOfNewIdsAndPassword(newIds, password);
    }
    public int removeOfNewIdsAndMoney(String newIds, String money) {
        return dao.removeOfNewIdsAndMoney(newIds, money);
    }
    public int removeOfNewIdsAndPhone(String newIds, String phone) {
        return dao.removeOfNewIdsAndPhone(newIds, phone);
    }
    public int removeOfNewIdsAndParam(String newIds, String param) {
        return dao.removeOfNewIdsAndParam(newIds, param);
    }
    public int removeOfNewIdsAndUserIds(String newIds, String userIds) {
        return dao.removeOfNewIdsAndUserIds(newIds, userIds);
    }
    public int removeOfNewIdsAndName(String newIds, String name) {
        return dao.removeOfNewIdsAndName(newIds, name);
    }
    public int removeOfNewIdsAndResgisterDate(String newIds, String resgisterDate) {
        return dao.removeOfNewIdsAndResgisterDate(newIds, resgisterDate);
    }
    public int removeOfNewIdsAndEmail(String newIds, String email) {
        return dao.removeOfNewIdsAndEmail(newIds, email);
    }
    public int removeOfNewIdsAndDesc(String newIds, String desc) {
        return dao.removeOfNewIdsAndDesc(newIds, desc);
    }
    public int removeOfFamousAndSex(String famous, String sex) {
        return dao.removeOfFamousAndSex(famous, sex);
    }
    public int removeOfFamousAndLoginDate(String famous, String loginDate) {
        return dao.removeOfFamousAndLoginDate(famous, loginDate);
    }
    public int removeOfFamousAndUserId(String famous, String userId) {
        return dao.removeOfFamousAndUserId(famous, userId);
    }
    public int removeOfFamousAndBUserIds(String famous, String bUserIds) {
        return dao.removeOfFamousAndBUserIds(famous, bUserIds);
    }
    public int removeOfFamousAndScore(String famous, String score) {
        return dao.removeOfFamousAndScore(famous, score);
    }
    public int removeOfFamousAndPath(String famous, String path) {
        return dao.removeOfFamousAndPath(famous, path);
    }
    public int removeOfFamousAndPassword(String famous, String password) {
        return dao.removeOfFamousAndPassword(famous, password);
    }
    public int removeOfFamousAndMoney(String famous, String money) {
        return dao.removeOfFamousAndMoney(famous, money);
    }
    public int removeOfFamousAndPhone(String famous, String phone) {
        return dao.removeOfFamousAndPhone(famous, phone);
    }
    public int removeOfFamousAndParam(String famous, String param) {
        return dao.removeOfFamousAndParam(famous, param);
    }
    public int removeOfFamousAndUserIds(String famous, String userIds) {
        return dao.removeOfFamousAndUserIds(famous, userIds);
    }
    public int removeOfFamousAndName(String famous, String name) {
        return dao.removeOfFamousAndName(famous, name);
    }
    public int removeOfFamousAndResgisterDate(String famous, String resgisterDate) {
        return dao.removeOfFamousAndResgisterDate(famous, resgisterDate);
    }
    public int removeOfFamousAndEmail(String famous, String email) {
        return dao.removeOfFamousAndEmail(famous, email);
    }
    public int removeOfFamousAndDesc(String famous, String desc) {
        return dao.removeOfFamousAndDesc(famous, desc);
    }
    public int removeOfSexAndLoginDate(String sex, String loginDate) {
        return dao.removeOfSexAndLoginDate(sex, loginDate);
    }
    public int removeOfSexAndUserId(String sex, String userId) {
        return dao.removeOfSexAndUserId(sex, userId);
    }
    public int removeOfSexAndBUserIds(String sex, String bUserIds) {
        return dao.removeOfSexAndBUserIds(sex, bUserIds);
    }
    public int removeOfSexAndScore(String sex, String score) {
        return dao.removeOfSexAndScore(sex, score);
    }
    public int removeOfSexAndPath(String sex, String path) {
        return dao.removeOfSexAndPath(sex, path);
    }
    public int removeOfSexAndPassword(String sex, String password) {
        return dao.removeOfSexAndPassword(sex, password);
    }
    public int removeOfSexAndMoney(String sex, String money) {
        return dao.removeOfSexAndMoney(sex, money);
    }
    public int removeOfSexAndPhone(String sex, String phone) {
        return dao.removeOfSexAndPhone(sex, phone);
    }
    public int removeOfSexAndParam(String sex, String param) {
        return dao.removeOfSexAndParam(sex, param);
    }
    public int removeOfSexAndUserIds(String sex, String userIds) {
        return dao.removeOfSexAndUserIds(sex, userIds);
    }
    public int removeOfSexAndName(String sex, String name) {
        return dao.removeOfSexAndName(sex, name);
    }
    public int removeOfSexAndResgisterDate(String sex, String resgisterDate) {
        return dao.removeOfSexAndResgisterDate(sex, resgisterDate);
    }
    public int removeOfSexAndEmail(String sex, String email) {
        return dao.removeOfSexAndEmail(sex, email);
    }
    public int removeOfSexAndDesc(String sex, String desc) {
        return dao.removeOfSexAndDesc(sex, desc);
    }
    public int removeOfLoginDateAndUserId(String loginDate, String userId) {
        return dao.removeOfLoginDateAndUserId(loginDate, userId);
    }
    public int removeOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        return dao.removeOfLoginDateAndBUserIds(loginDate, bUserIds);
    }
    public int removeOfLoginDateAndScore(String loginDate, String score) {
        return dao.removeOfLoginDateAndScore(loginDate, score);
    }
    public int removeOfLoginDateAndPath(String loginDate, String path) {
        return dao.removeOfLoginDateAndPath(loginDate, path);
    }
    public int removeOfLoginDateAndPassword(String loginDate, String password) {
        return dao.removeOfLoginDateAndPassword(loginDate, password);
    }
    public int removeOfLoginDateAndMoney(String loginDate, String money) {
        return dao.removeOfLoginDateAndMoney(loginDate, money);
    }
    public int removeOfLoginDateAndPhone(String loginDate, String phone) {
        return dao.removeOfLoginDateAndPhone(loginDate, phone);
    }
    public int removeOfLoginDateAndParam(String loginDate, String param) {
        return dao.removeOfLoginDateAndParam(loginDate, param);
    }
    public int removeOfLoginDateAndUserIds(String loginDate, String userIds) {
        return dao.removeOfLoginDateAndUserIds(loginDate, userIds);
    }
    public int removeOfLoginDateAndName(String loginDate, String name) {
        return dao.removeOfLoginDateAndName(loginDate, name);
    }
    public int removeOfLoginDateAndResgisterDate(String loginDate, String resgisterDate) {
        return dao.removeOfLoginDateAndResgisterDate(loginDate, resgisterDate);
    }
    public int removeOfLoginDateAndEmail(String loginDate, String email) {
        return dao.removeOfLoginDateAndEmail(loginDate, email);
    }
    public int removeOfLoginDateAndDesc(String loginDate, String desc) {
        return dao.removeOfLoginDateAndDesc(loginDate, desc);
    }
    public int removeOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.removeOfUserIdAndBUserIds(userId, bUserIds);
    }
    public int removeOfUserIdAndScore(String userId, String score) {
        return dao.removeOfUserIdAndScore(userId, score);
    }
    public int removeOfUserIdAndPath(String userId, String path) {
        return dao.removeOfUserIdAndPath(userId, path);
    }
    public int removeOfUserIdAndPassword(String userId, String password) {
        return dao.removeOfUserIdAndPassword(userId, password);
    }
    public int removeOfUserIdAndMoney(String userId, String money) {
        return dao.removeOfUserIdAndMoney(userId, money);
    }
    public int removeOfUserIdAndPhone(String userId, String phone) {
        return dao.removeOfUserIdAndPhone(userId, phone);
    }
    public int removeOfUserIdAndParam(String userId, String param) {
        return dao.removeOfUserIdAndParam(userId, param);
    }
    public int removeOfUserIdAndUserIds(String userId, String userIds) {
        return dao.removeOfUserIdAndUserIds(userId, userIds);
    }
    public int removeOfUserIdAndName(String userId, String name) {
        return dao.removeOfUserIdAndName(userId, name);
    }
    public int removeOfUserIdAndResgisterDate(String userId, String resgisterDate) {
        return dao.removeOfUserIdAndResgisterDate(userId, resgisterDate);
    }
    public int removeOfUserIdAndEmail(String userId, String email) {
        return dao.removeOfUserIdAndEmail(userId, email);
    }
    public int removeOfUserIdAndDesc(String userId, String desc) {
        return dao.removeOfUserIdAndDesc(userId, desc);
    }
    public int removeOfBUserIdsAndScore(String bUserIds, String score) {
        return dao.removeOfBUserIdsAndScore(bUserIds, score);
    }
    public int removeOfBUserIdsAndPath(String bUserIds, String path) {
        return dao.removeOfBUserIdsAndPath(bUserIds, path);
    }
    public int removeOfBUserIdsAndPassword(String bUserIds, String password) {
        return dao.removeOfBUserIdsAndPassword(bUserIds, password);
    }
    public int removeOfBUserIdsAndMoney(String bUserIds, String money) {
        return dao.removeOfBUserIdsAndMoney(bUserIds, money);
    }
    public int removeOfBUserIdsAndPhone(String bUserIds, String phone) {
        return dao.removeOfBUserIdsAndPhone(bUserIds, phone);
    }
    public int removeOfBUserIdsAndParam(String bUserIds, String param) {
        return dao.removeOfBUserIdsAndParam(bUserIds, param);
    }
    public int removeOfBUserIdsAndUserIds(String bUserIds, String userIds) {
        return dao.removeOfBUserIdsAndUserIds(bUserIds, userIds);
    }
    public int removeOfBUserIdsAndName(String bUserIds, String name) {
        return dao.removeOfBUserIdsAndName(bUserIds, name);
    }
    public int removeOfBUserIdsAndResgisterDate(String bUserIds, String resgisterDate) {
        return dao.removeOfBUserIdsAndResgisterDate(bUserIds, resgisterDate);
    }
    public int removeOfBUserIdsAndEmail(String bUserIds, String email) {
        return dao.removeOfBUserIdsAndEmail(bUserIds, email);
    }
    public int removeOfBUserIdsAndDesc(String bUserIds, String desc) {
        return dao.removeOfBUserIdsAndDesc(bUserIds, desc);
    }
    public int removeOfScoreAndPath(String score, String path) {
        return dao.removeOfScoreAndPath(score, path);
    }
    public int removeOfScoreAndPassword(String score, String password) {
        return dao.removeOfScoreAndPassword(score, password);
    }
    public int removeOfScoreAndMoney(String score, String money) {
        return dao.removeOfScoreAndMoney(score, money);
    }
    public int removeOfScoreAndPhone(String score, String phone) {
        return dao.removeOfScoreAndPhone(score, phone);
    }
    public int removeOfScoreAndParam(String score, String param) {
        return dao.removeOfScoreAndParam(score, param);
    }
    public int removeOfScoreAndUserIds(String score, String userIds) {
        return dao.removeOfScoreAndUserIds(score, userIds);
    }
    public int removeOfScoreAndName(String score, String name) {
        return dao.removeOfScoreAndName(score, name);
    }
    public int removeOfScoreAndResgisterDate(String score, String resgisterDate) {
        return dao.removeOfScoreAndResgisterDate(score, resgisterDate);
    }
    public int removeOfScoreAndEmail(String score, String email) {
        return dao.removeOfScoreAndEmail(score, email);
    }
    public int removeOfScoreAndDesc(String score, String desc) {
        return dao.removeOfScoreAndDesc(score, desc);
    }
    public int removeOfPathAndPassword(String path, String password) {
        return dao.removeOfPathAndPassword(path, password);
    }
    public int removeOfPathAndMoney(String path, String money) {
        return dao.removeOfPathAndMoney(path, money);
    }
    public int removeOfPathAndPhone(String path, String phone) {
        return dao.removeOfPathAndPhone(path, phone);
    }
    public int removeOfPathAndParam(String path, String param) {
        return dao.removeOfPathAndParam(path, param);
    }
    public int removeOfPathAndUserIds(String path, String userIds) {
        return dao.removeOfPathAndUserIds(path, userIds);
    }
    public int removeOfPathAndName(String path, String name) {
        return dao.removeOfPathAndName(path, name);
    }
    public int removeOfPathAndResgisterDate(String path, String resgisterDate) {
        return dao.removeOfPathAndResgisterDate(path, resgisterDate);
    }
    public int removeOfPathAndEmail(String path, String email) {
        return dao.removeOfPathAndEmail(path, email);
    }
    public int removeOfPathAndDesc(String path, String desc) {
        return dao.removeOfPathAndDesc(path, desc);
    }
    public int removeOfPasswordAndMoney(String password, String money) {
        return dao.removeOfPasswordAndMoney(password, money);
    }
    public int removeOfPasswordAndPhone(String password, String phone) {
        return dao.removeOfPasswordAndPhone(password, phone);
    }
    public int removeOfPasswordAndParam(String password, String param) {
        return dao.removeOfPasswordAndParam(password, param);
    }
    public int removeOfPasswordAndUserIds(String password, String userIds) {
        return dao.removeOfPasswordAndUserIds(password, userIds);
    }
    public int removeOfPasswordAndName(String password, String name) {
        return dao.removeOfPasswordAndName(password, name);
    }
    public int removeOfPasswordAndResgisterDate(String password, String resgisterDate) {
        return dao.removeOfPasswordAndResgisterDate(password, resgisterDate);
    }
    public int removeOfPasswordAndEmail(String password, String email) {
        return dao.removeOfPasswordAndEmail(password, email);
    }
    public int removeOfPasswordAndDesc(String password, String desc) {
        return dao.removeOfPasswordAndDesc(password, desc);
    }
    public int removeOfMoneyAndPhone(String money, String phone) {
        return dao.removeOfMoneyAndPhone(money, phone);
    }
    public int removeOfMoneyAndParam(String money, String param) {
        return dao.removeOfMoneyAndParam(money, param);
    }
    public int removeOfMoneyAndUserIds(String money, String userIds) {
        return dao.removeOfMoneyAndUserIds(money, userIds);
    }
    public int removeOfMoneyAndName(String money, String name) {
        return dao.removeOfMoneyAndName(money, name);
    }
    public int removeOfMoneyAndResgisterDate(String money, String resgisterDate) {
        return dao.removeOfMoneyAndResgisterDate(money, resgisterDate);
    }
    public int removeOfMoneyAndEmail(String money, String email) {
        return dao.removeOfMoneyAndEmail(money, email);
    }
    public int removeOfMoneyAndDesc(String money, String desc) {
        return dao.removeOfMoneyAndDesc(money, desc);
    }
    public int removeOfPhoneAndParam(String phone, String param) {
        return dao.removeOfPhoneAndParam(phone, param);
    }
    public int removeOfPhoneAndUserIds(String phone, String userIds) {
        return dao.removeOfPhoneAndUserIds(phone, userIds);
    }
    public int removeOfPhoneAndName(String phone, String name) {
        return dao.removeOfPhoneAndName(phone, name);
    }
    public int removeOfPhoneAndResgisterDate(String phone, String resgisterDate) {
        return dao.removeOfPhoneAndResgisterDate(phone, resgisterDate);
    }
    public int removeOfPhoneAndEmail(String phone, String email) {
        return dao.removeOfPhoneAndEmail(phone, email);
    }
    public int removeOfPhoneAndDesc(String phone, String desc) {
        return dao.removeOfPhoneAndDesc(phone, desc);
    }
    public int removeOfParamAndUserIds(String param, String userIds) {
        return dao.removeOfParamAndUserIds(param, userIds);
    }
    public int removeOfParamAndName(String param, String name) {
        return dao.removeOfParamAndName(param, name);
    }
    public int removeOfParamAndResgisterDate(String param, String resgisterDate) {
        return dao.removeOfParamAndResgisterDate(param, resgisterDate);
    }
    public int removeOfParamAndEmail(String param, String email) {
        return dao.removeOfParamAndEmail(param, email);
    }
    public int removeOfParamAndDesc(String param, String desc) {
        return dao.removeOfParamAndDesc(param, desc);
    }
    public int removeOfUserIdsAndName(String userIds, String name) {
        return dao.removeOfUserIdsAndName(userIds, name);
    }
    public int removeOfUserIdsAndResgisterDate(String userIds, String resgisterDate) {
        return dao.removeOfUserIdsAndResgisterDate(userIds, resgisterDate);
    }
    public int removeOfUserIdsAndEmail(String userIds, String email) {
        return dao.removeOfUserIdsAndEmail(userIds, email);
    }
    public int removeOfUserIdsAndDesc(String userIds, String desc) {
        return dao.removeOfUserIdsAndDesc(userIds, desc);
    }
    public int removeOfNameAndResgisterDate(String name, String resgisterDate) {
        return dao.removeOfNameAndResgisterDate(name, resgisterDate);
    }
    public int removeOfNameAndEmail(String name, String email) {
        return dao.removeOfNameAndEmail(name, email);
    }
    public int removeOfNameAndDesc(String name, String desc) {
        return dao.removeOfNameAndDesc(name, desc);
    }
    public int removeOfResgisterDateAndEmail(String resgisterDate, String email) {
        return dao.removeOfResgisterDateAndEmail(resgisterDate, email);
    }
    public int removeOfResgisterDateAndDesc(String resgisterDate, String desc) {
        return dao.removeOfResgisterDateAndDesc(resgisterDate, desc);
    }
    public int removeOfEmailAndDesc(String email, String desc) {
        return dao.removeOfEmailAndDesc(email, desc);
    }
    public int insert(User user) {
        return dao.insert(user);
    }
    public int insertOfImage(String image) {
        return dao.insertOfImage(image);
    }
    public int insertOfLvl(String lvl) {
        return dao.insertOfLvl(lvl);
    }
    public int insertOfNewIds(String newIds) {
        return dao.insertOfNewIds(newIds);
    }
    public int insertOfFamous(String famous) {
        return dao.insertOfFamous(famous);
    }
    public int insertOfSex(String sex) {
        return dao.insertOfSex(sex);
    }
    public int insertOfLoginDate(String loginDate) {
        return dao.insertOfLoginDate(loginDate);
    }
    public int insertOfUserId(String userId) {
        return dao.insertOfUserId(userId);
    }
    public int insertOfBUserIds(String bUserIds) {
        return dao.insertOfBUserIds(bUserIds);
    }
    public int insertOfScore(String score) {
        return dao.insertOfScore(score);
    }
    public int insertOfPath(String path) {
        return dao.insertOfPath(path);
    }
    public int insertOfPassword(String password) {
        return dao.insertOfPassword(password);
    }
    public int insertOfMoney(String money) {
        return dao.insertOfMoney(money);
    }
    public int insertOfPhone(String phone) {
        return dao.insertOfPhone(phone);
    }
    public int insertOfParam(String param) {
        return dao.insertOfParam(param);
    }
    public int insertOfUserIds(String userIds) {
        return dao.insertOfUserIds(userIds);
    }
    public int insertOfName(String name) {
        return dao.insertOfName(name);
    }
    public int insertOfResgisterDate(String resgisterDate) {
        return dao.insertOfResgisterDate(resgisterDate);
    }
    public int insertOfEmail(String email) {
        return dao.insertOfEmail(email);
    }
    public int insertOfDesc(String desc) {
        return dao.insertOfDesc(desc);
    }
    public int insertOfImageAndLvl(String image, String lvl) {
        return dao.insertOfImageAndLvl(image, lvl);
    }
    public int insertOfImageAndNewIds(String image, String newIds) {
        return dao.insertOfImageAndNewIds(image, newIds);
    }
    public int insertOfImageAndFamous(String image, String famous) {
        return dao.insertOfImageAndFamous(image, famous);
    }
    public int insertOfImageAndSex(String image, String sex) {
        return dao.insertOfImageAndSex(image, sex);
    }
    public int insertOfImageAndLoginDate(String image, String loginDate) {
        return dao.insertOfImageAndLoginDate(image, loginDate);
    }
    public int insertOfImageAndUserId(String image, String userId) {
        return dao.insertOfImageAndUserId(image, userId);
    }
    public int insertOfImageAndBUserIds(String image, String bUserIds) {
        return dao.insertOfImageAndBUserIds(image, bUserIds);
    }
    public int insertOfImageAndScore(String image, String score) {
        return dao.insertOfImageAndScore(image, score);
    }
    public int insertOfImageAndPath(String image, String path) {
        return dao.insertOfImageAndPath(image, path);
    }
    public int insertOfImageAndPassword(String image, String password) {
        return dao.insertOfImageAndPassword(image, password);
    }
    public int insertOfImageAndMoney(String image, String money) {
        return dao.insertOfImageAndMoney(image, money);
    }
    public int insertOfImageAndPhone(String image, String phone) {
        return dao.insertOfImageAndPhone(image, phone);
    }
    public int insertOfImageAndParam(String image, String param) {
        return dao.insertOfImageAndParam(image, param);
    }
    public int insertOfImageAndUserIds(String image, String userIds) {
        return dao.insertOfImageAndUserIds(image, userIds);
    }
    public int insertOfImageAndName(String image, String name) {
        return dao.insertOfImageAndName(image, name);
    }
    public int insertOfImageAndResgisterDate(String image, String resgisterDate) {
        return dao.insertOfImageAndResgisterDate(image, resgisterDate);
    }
    public int insertOfImageAndEmail(String image, String email) {
        return dao.insertOfImageAndEmail(image, email);
    }
    public int insertOfImageAndDesc(String image, String desc) {
        return dao.insertOfImageAndDesc(image, desc);
    }
    public int insertOfLvlAndNewIds(String lvl, String newIds) {
        return dao.insertOfLvlAndNewIds(lvl, newIds);
    }
    public int insertOfLvlAndFamous(String lvl, String famous) {
        return dao.insertOfLvlAndFamous(lvl, famous);
    }
    public int insertOfLvlAndSex(String lvl, String sex) {
        return dao.insertOfLvlAndSex(lvl, sex);
    }
    public int insertOfLvlAndLoginDate(String lvl, String loginDate) {
        return dao.insertOfLvlAndLoginDate(lvl, loginDate);
    }
    public int insertOfLvlAndUserId(String lvl, String userId) {
        return dao.insertOfLvlAndUserId(lvl, userId);
    }
    public int insertOfLvlAndBUserIds(String lvl, String bUserIds) {
        return dao.insertOfLvlAndBUserIds(lvl, bUserIds);
    }
    public int insertOfLvlAndScore(String lvl, String score) {
        return dao.insertOfLvlAndScore(lvl, score);
    }
    public int insertOfLvlAndPath(String lvl, String path) {
        return dao.insertOfLvlAndPath(lvl, path);
    }
    public int insertOfLvlAndPassword(String lvl, String password) {
        return dao.insertOfLvlAndPassword(lvl, password);
    }
    public int insertOfLvlAndMoney(String lvl, String money) {
        return dao.insertOfLvlAndMoney(lvl, money);
    }
    public int insertOfLvlAndPhone(String lvl, String phone) {
        return dao.insertOfLvlAndPhone(lvl, phone);
    }
    public int insertOfLvlAndParam(String lvl, String param) {
        return dao.insertOfLvlAndParam(lvl, param);
    }
    public int insertOfLvlAndUserIds(String lvl, String userIds) {
        return dao.insertOfLvlAndUserIds(lvl, userIds);
    }
    public int insertOfLvlAndName(String lvl, String name) {
        return dao.insertOfLvlAndName(lvl, name);
    }
    public int insertOfLvlAndResgisterDate(String lvl, String resgisterDate) {
        return dao.insertOfLvlAndResgisterDate(lvl, resgisterDate);
    }
    public int insertOfLvlAndEmail(String lvl, String email) {
        return dao.insertOfLvlAndEmail(lvl, email);
    }
    public int insertOfLvlAndDesc(String lvl, String desc) {
        return dao.insertOfLvlAndDesc(lvl, desc);
    }
    public int insertOfNewIdsAndFamous(String newIds, String famous) {
        return dao.insertOfNewIdsAndFamous(newIds, famous);
    }
    public int insertOfNewIdsAndSex(String newIds, String sex) {
        return dao.insertOfNewIdsAndSex(newIds, sex);
    }
    public int insertOfNewIdsAndLoginDate(String newIds, String loginDate) {
        return dao.insertOfNewIdsAndLoginDate(newIds, loginDate);
    }
    public int insertOfNewIdsAndUserId(String newIds, String userId) {
        return dao.insertOfNewIdsAndUserId(newIds, userId);
    }
    public int insertOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        return dao.insertOfNewIdsAndBUserIds(newIds, bUserIds);
    }
    public int insertOfNewIdsAndScore(String newIds, String score) {
        return dao.insertOfNewIdsAndScore(newIds, score);
    }
    public int insertOfNewIdsAndPath(String newIds, String path) {
        return dao.insertOfNewIdsAndPath(newIds, path);
    }
    public int insertOfNewIdsAndPassword(String newIds, String password) {
        return dao.insertOfNewIdsAndPassword(newIds, password);
    }
    public int insertOfNewIdsAndMoney(String newIds, String money) {
        return dao.insertOfNewIdsAndMoney(newIds, money);
    }
    public int insertOfNewIdsAndPhone(String newIds, String phone) {
        return dao.insertOfNewIdsAndPhone(newIds, phone);
    }
    public int insertOfNewIdsAndParam(String newIds, String param) {
        return dao.insertOfNewIdsAndParam(newIds, param);
    }
    public int insertOfNewIdsAndUserIds(String newIds, String userIds) {
        return dao.insertOfNewIdsAndUserIds(newIds, userIds);
    }
    public int insertOfNewIdsAndName(String newIds, String name) {
        return dao.insertOfNewIdsAndName(newIds, name);
    }
    public int insertOfNewIdsAndResgisterDate(String newIds, String resgisterDate) {
        return dao.insertOfNewIdsAndResgisterDate(newIds, resgisterDate);
    }
    public int insertOfNewIdsAndEmail(String newIds, String email) {
        return dao.insertOfNewIdsAndEmail(newIds, email);
    }
    public int insertOfNewIdsAndDesc(String newIds, String desc) {
        return dao.insertOfNewIdsAndDesc(newIds, desc);
    }
    public int insertOfFamousAndSex(String famous, String sex) {
        return dao.insertOfFamousAndSex(famous, sex);
    }
    public int insertOfFamousAndLoginDate(String famous, String loginDate) {
        return dao.insertOfFamousAndLoginDate(famous, loginDate);
    }
    public int insertOfFamousAndUserId(String famous, String userId) {
        return dao.insertOfFamousAndUserId(famous, userId);
    }
    public int insertOfFamousAndBUserIds(String famous, String bUserIds) {
        return dao.insertOfFamousAndBUserIds(famous, bUserIds);
    }
    public int insertOfFamousAndScore(String famous, String score) {
        return dao.insertOfFamousAndScore(famous, score);
    }
    public int insertOfFamousAndPath(String famous, String path) {
        return dao.insertOfFamousAndPath(famous, path);
    }
    public int insertOfFamousAndPassword(String famous, String password) {
        return dao.insertOfFamousAndPassword(famous, password);
    }
    public int insertOfFamousAndMoney(String famous, String money) {
        return dao.insertOfFamousAndMoney(famous, money);
    }
    public int insertOfFamousAndPhone(String famous, String phone) {
        return dao.insertOfFamousAndPhone(famous, phone);
    }
    public int insertOfFamousAndParam(String famous, String param) {
        return dao.insertOfFamousAndParam(famous, param);
    }
    public int insertOfFamousAndUserIds(String famous, String userIds) {
        return dao.insertOfFamousAndUserIds(famous, userIds);
    }
    public int insertOfFamousAndName(String famous, String name) {
        return dao.insertOfFamousAndName(famous, name);
    }
    public int insertOfFamousAndResgisterDate(String famous, String resgisterDate) {
        return dao.insertOfFamousAndResgisterDate(famous, resgisterDate);
    }
    public int insertOfFamousAndEmail(String famous, String email) {
        return dao.insertOfFamousAndEmail(famous, email);
    }
    public int insertOfFamousAndDesc(String famous, String desc) {
        return dao.insertOfFamousAndDesc(famous, desc);
    }
    public int insertOfSexAndLoginDate(String sex, String loginDate) {
        return dao.insertOfSexAndLoginDate(sex, loginDate);
    }
    public int insertOfSexAndUserId(String sex, String userId) {
        return dao.insertOfSexAndUserId(sex, userId);
    }
    public int insertOfSexAndBUserIds(String sex, String bUserIds) {
        return dao.insertOfSexAndBUserIds(sex, bUserIds);
    }
    public int insertOfSexAndScore(String sex, String score) {
        return dao.insertOfSexAndScore(sex, score);
    }
    public int insertOfSexAndPath(String sex, String path) {
        return dao.insertOfSexAndPath(sex, path);
    }
    public int insertOfSexAndPassword(String sex, String password) {
        return dao.insertOfSexAndPassword(sex, password);
    }
    public int insertOfSexAndMoney(String sex, String money) {
        return dao.insertOfSexAndMoney(sex, money);
    }
    public int insertOfSexAndPhone(String sex, String phone) {
        return dao.insertOfSexAndPhone(sex, phone);
    }
    public int insertOfSexAndParam(String sex, String param) {
        return dao.insertOfSexAndParam(sex, param);
    }
    public int insertOfSexAndUserIds(String sex, String userIds) {
        return dao.insertOfSexAndUserIds(sex, userIds);
    }
    public int insertOfSexAndName(String sex, String name) {
        return dao.insertOfSexAndName(sex, name);
    }
    public int insertOfSexAndResgisterDate(String sex, String resgisterDate) {
        return dao.insertOfSexAndResgisterDate(sex, resgisterDate);
    }
    public int insertOfSexAndEmail(String sex, String email) {
        return dao.insertOfSexAndEmail(sex, email);
    }
    public int insertOfSexAndDesc(String sex, String desc) {
        return dao.insertOfSexAndDesc(sex, desc);
    }
    public int insertOfLoginDateAndUserId(String loginDate, String userId) {
        return dao.insertOfLoginDateAndUserId(loginDate, userId);
    }
    public int insertOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        return dao.insertOfLoginDateAndBUserIds(loginDate, bUserIds);
    }
    public int insertOfLoginDateAndScore(String loginDate, String score) {
        return dao.insertOfLoginDateAndScore(loginDate, score);
    }
    public int insertOfLoginDateAndPath(String loginDate, String path) {
        return dao.insertOfLoginDateAndPath(loginDate, path);
    }
    public int insertOfLoginDateAndPassword(String loginDate, String password) {
        return dao.insertOfLoginDateAndPassword(loginDate, password);
    }
    public int insertOfLoginDateAndMoney(String loginDate, String money) {
        return dao.insertOfLoginDateAndMoney(loginDate, money);
    }
    public int insertOfLoginDateAndPhone(String loginDate, String phone) {
        return dao.insertOfLoginDateAndPhone(loginDate, phone);
    }
    public int insertOfLoginDateAndParam(String loginDate, String param) {
        return dao.insertOfLoginDateAndParam(loginDate, param);
    }
    public int insertOfLoginDateAndUserIds(String loginDate, String userIds) {
        return dao.insertOfLoginDateAndUserIds(loginDate, userIds);
    }
    public int insertOfLoginDateAndName(String loginDate, String name) {
        return dao.insertOfLoginDateAndName(loginDate, name);
    }
    public int insertOfLoginDateAndResgisterDate(String loginDate, String resgisterDate) {
        return dao.insertOfLoginDateAndResgisterDate(loginDate, resgisterDate);
    }
    public int insertOfLoginDateAndEmail(String loginDate, String email) {
        return dao.insertOfLoginDateAndEmail(loginDate, email);
    }
    public int insertOfLoginDateAndDesc(String loginDate, String desc) {
        return dao.insertOfLoginDateAndDesc(loginDate, desc);
    }
    public int insertOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.insertOfUserIdAndBUserIds(userId, bUserIds);
    }
    public int insertOfUserIdAndScore(String userId, String score) {
        return dao.insertOfUserIdAndScore(userId, score);
    }
    public int insertOfUserIdAndPath(String userId, String path) {
        return dao.insertOfUserIdAndPath(userId, path);
    }
    public int insertOfUserIdAndPassword(String userId, String password) {
        return dao.insertOfUserIdAndPassword(userId, password);
    }
    public int insertOfUserIdAndMoney(String userId, String money) {
        return dao.insertOfUserIdAndMoney(userId, money);
    }
    public int insertOfUserIdAndPhone(String userId, String phone) {
        return dao.insertOfUserIdAndPhone(userId, phone);
    }
    public int insertOfUserIdAndParam(String userId, String param) {
        return dao.insertOfUserIdAndParam(userId, param);
    }
    public int insertOfUserIdAndUserIds(String userId, String userIds) {
        return dao.insertOfUserIdAndUserIds(userId, userIds);
    }
    public int insertOfUserIdAndName(String userId, String name) {
        return dao.insertOfUserIdAndName(userId, name);
    }
    public int insertOfUserIdAndResgisterDate(String userId, String resgisterDate) {
        return dao.insertOfUserIdAndResgisterDate(userId, resgisterDate);
    }
    public int insertOfUserIdAndEmail(String userId, String email) {
        return dao.insertOfUserIdAndEmail(userId, email);
    }
    public int insertOfUserIdAndDesc(String userId, String desc) {
        return dao.insertOfUserIdAndDesc(userId, desc);
    }
    public int insertOfBUserIdsAndScore(String bUserIds, String score) {
        return dao.insertOfBUserIdsAndScore(bUserIds, score);
    }
    public int insertOfBUserIdsAndPath(String bUserIds, String path) {
        return dao.insertOfBUserIdsAndPath(bUserIds, path);
    }
    public int insertOfBUserIdsAndPassword(String bUserIds, String password) {
        return dao.insertOfBUserIdsAndPassword(bUserIds, password);
    }
    public int insertOfBUserIdsAndMoney(String bUserIds, String money) {
        return dao.insertOfBUserIdsAndMoney(bUserIds, money);
    }
    public int insertOfBUserIdsAndPhone(String bUserIds, String phone) {
        return dao.insertOfBUserIdsAndPhone(bUserIds, phone);
    }
    public int insertOfBUserIdsAndParam(String bUserIds, String param) {
        return dao.insertOfBUserIdsAndParam(bUserIds, param);
    }
    public int insertOfBUserIdsAndUserIds(String bUserIds, String userIds) {
        return dao.insertOfBUserIdsAndUserIds(bUserIds, userIds);
    }
    public int insertOfBUserIdsAndName(String bUserIds, String name) {
        return dao.insertOfBUserIdsAndName(bUserIds, name);
    }
    public int insertOfBUserIdsAndResgisterDate(String bUserIds, String resgisterDate) {
        return dao.insertOfBUserIdsAndResgisterDate(bUserIds, resgisterDate);
    }
    public int insertOfBUserIdsAndEmail(String bUserIds, String email) {
        return dao.insertOfBUserIdsAndEmail(bUserIds, email);
    }
    public int insertOfBUserIdsAndDesc(String bUserIds, String desc) {
        return dao.insertOfBUserIdsAndDesc(bUserIds, desc);
    }
    public int insertOfScoreAndPath(String score, String path) {
        return dao.insertOfScoreAndPath(score, path);
    }
    public int insertOfScoreAndPassword(String score, String password) {
        return dao.insertOfScoreAndPassword(score, password);
    }
    public int insertOfScoreAndMoney(String score, String money) {
        return dao.insertOfScoreAndMoney(score, money);
    }
    public int insertOfScoreAndPhone(String score, String phone) {
        return dao.insertOfScoreAndPhone(score, phone);
    }
    public int insertOfScoreAndParam(String score, String param) {
        return dao.insertOfScoreAndParam(score, param);
    }
    public int insertOfScoreAndUserIds(String score, String userIds) {
        return dao.insertOfScoreAndUserIds(score, userIds);
    }
    public int insertOfScoreAndName(String score, String name) {
        return dao.insertOfScoreAndName(score, name);
    }
    public int insertOfScoreAndResgisterDate(String score, String resgisterDate) {
        return dao.insertOfScoreAndResgisterDate(score, resgisterDate);
    }
    public int insertOfScoreAndEmail(String score, String email) {
        return dao.insertOfScoreAndEmail(score, email);
    }
    public int insertOfScoreAndDesc(String score, String desc) {
        return dao.insertOfScoreAndDesc(score, desc);
    }
    public int insertOfPathAndPassword(String path, String password) {
        return dao.insertOfPathAndPassword(path, password);
    }
    public int insertOfPathAndMoney(String path, String money) {
        return dao.insertOfPathAndMoney(path, money);
    }
    public int insertOfPathAndPhone(String path, String phone) {
        return dao.insertOfPathAndPhone(path, phone);
    }
    public int insertOfPathAndParam(String path, String param) {
        return dao.insertOfPathAndParam(path, param);
    }
    public int insertOfPathAndUserIds(String path, String userIds) {
        return dao.insertOfPathAndUserIds(path, userIds);
    }
    public int insertOfPathAndName(String path, String name) {
        return dao.insertOfPathAndName(path, name);
    }
    public int insertOfPathAndResgisterDate(String path, String resgisterDate) {
        return dao.insertOfPathAndResgisterDate(path, resgisterDate);
    }
    public int insertOfPathAndEmail(String path, String email) {
        return dao.insertOfPathAndEmail(path, email);
    }
    public int insertOfPathAndDesc(String path, String desc) {
        return dao.insertOfPathAndDesc(path, desc);
    }
    public int insertOfPasswordAndMoney(String password, String money) {
        return dao.insertOfPasswordAndMoney(password, money);
    }
    public int insertOfPasswordAndPhone(String password, String phone) {
        return dao.insertOfPasswordAndPhone(password, phone);
    }
    public int insertOfPasswordAndParam(String password, String param) {
        return dao.insertOfPasswordAndParam(password, param);
    }
    public int insertOfPasswordAndUserIds(String password, String userIds) {
        return dao.insertOfPasswordAndUserIds(password, userIds);
    }
    public int insertOfPasswordAndName(String password, String name) {
        return dao.insertOfPasswordAndName(password, name);
    }
    public int insertOfPasswordAndResgisterDate(String password, String resgisterDate) {
        return dao.insertOfPasswordAndResgisterDate(password, resgisterDate);
    }
    public int insertOfPasswordAndEmail(String password, String email) {
        return dao.insertOfPasswordAndEmail(password, email);
    }
    public int insertOfPasswordAndDesc(String password, String desc) {
        return dao.insertOfPasswordAndDesc(password, desc);
    }
    public int insertOfMoneyAndPhone(String money, String phone) {
        return dao.insertOfMoneyAndPhone(money, phone);
    }
    public int insertOfMoneyAndParam(String money, String param) {
        return dao.insertOfMoneyAndParam(money, param);
    }
    public int insertOfMoneyAndUserIds(String money, String userIds) {
        return dao.insertOfMoneyAndUserIds(money, userIds);
    }
    public int insertOfMoneyAndName(String money, String name) {
        return dao.insertOfMoneyAndName(money, name);
    }
    public int insertOfMoneyAndResgisterDate(String money, String resgisterDate) {
        return dao.insertOfMoneyAndResgisterDate(money, resgisterDate);
    }
    public int insertOfMoneyAndEmail(String money, String email) {
        return dao.insertOfMoneyAndEmail(money, email);
    }
    public int insertOfMoneyAndDesc(String money, String desc) {
        return dao.insertOfMoneyAndDesc(money, desc);
    }
    public int insertOfPhoneAndParam(String phone, String param) {
        return dao.insertOfPhoneAndParam(phone, param);
    }
    public int insertOfPhoneAndUserIds(String phone, String userIds) {
        return dao.insertOfPhoneAndUserIds(phone, userIds);
    }
    public int insertOfPhoneAndName(String phone, String name) {
        return dao.insertOfPhoneAndName(phone, name);
    }
    public int insertOfPhoneAndResgisterDate(String phone, String resgisterDate) {
        return dao.insertOfPhoneAndResgisterDate(phone, resgisterDate);
    }
    public int insertOfPhoneAndEmail(String phone, String email) {
        return dao.insertOfPhoneAndEmail(phone, email);
    }
    public int insertOfPhoneAndDesc(String phone, String desc) {
        return dao.insertOfPhoneAndDesc(phone, desc);
    }
    public int insertOfParamAndUserIds(String param, String userIds) {
        return dao.insertOfParamAndUserIds(param, userIds);
    }
    public int insertOfParamAndName(String param, String name) {
        return dao.insertOfParamAndName(param, name);
    }
    public int insertOfParamAndResgisterDate(String param, String resgisterDate) {
        return dao.insertOfParamAndResgisterDate(param, resgisterDate);
    }
    public int insertOfParamAndEmail(String param, String email) {
        return dao.insertOfParamAndEmail(param, email);
    }
    public int insertOfParamAndDesc(String param, String desc) {
        return dao.insertOfParamAndDesc(param, desc);
    }
    public int insertOfUserIdsAndName(String userIds, String name) {
        return dao.insertOfUserIdsAndName(userIds, name);
    }
    public int insertOfUserIdsAndResgisterDate(String userIds, String resgisterDate) {
        return dao.insertOfUserIdsAndResgisterDate(userIds, resgisterDate);
    }
    public int insertOfUserIdsAndEmail(String userIds, String email) {
        return dao.insertOfUserIdsAndEmail(userIds, email);
    }
    public int insertOfUserIdsAndDesc(String userIds, String desc) {
        return dao.insertOfUserIdsAndDesc(userIds, desc);
    }
    public int insertOfNameAndResgisterDate(String name, String resgisterDate) {
        return dao.insertOfNameAndResgisterDate(name, resgisterDate);
    }
    public int insertOfNameAndEmail(String name, String email) {
        return dao.insertOfNameAndEmail(name, email);
    }
    public int insertOfNameAndDesc(String name, String desc) {
        return dao.insertOfNameAndDesc(name, desc);
    }
    public int insertOfResgisterDateAndEmail(String resgisterDate, String email) {
        return dao.insertOfResgisterDateAndEmail(resgisterDate, email);
    }
    public int insertOfResgisterDateAndDesc(String resgisterDate, String desc) {
        return dao.insertOfResgisterDateAndDesc(resgisterDate, desc);
    }
    public int insertOfEmailAndDesc(String email, String desc) {
        return dao.insertOfEmailAndDesc(email, desc);
    }
    public User getUser(User user) {
        return dao.getUser(user);
    }
    public User getUserOfImage(String image) {
        return dao.getUserOfImage(image);
    }
    public User getUserOfLvl(String lvl) {
        return dao.getUserOfLvl(lvl);
    }
    public User getUserOfNewIds(String newIds) {
        return dao.getUserOfNewIds(newIds);
    }
    public User getUserOfFamous(String famous) {
        return dao.getUserOfFamous(famous);
    }
    public User getUserOfSex(String sex) {
        return dao.getUserOfSex(sex);
    }
    public User getUserOfLoginDate(String loginDate) {
        return dao.getUserOfLoginDate(loginDate);
    }
    public User getUserOfUserId(String userId) {
        return dao.getUserOfUserId(userId);
    }
    public User getUserOfBUserIds(String bUserIds) {
        return dao.getUserOfBUserIds(bUserIds);
    }
    public User getUserOfScore(String score) {
        return dao.getUserOfScore(score);
    }
    public User getUserOfPath(String path) {
        return dao.getUserOfPath(path);
    }
    public User getUserOfPassword(String password) {
        return dao.getUserOfPassword(password);
    }
    public User getUserOfMoney(String money) {
        return dao.getUserOfMoney(money);
    }
    public User getUserOfPhone(String phone) {
        return dao.getUserOfPhone(phone);
    }
    public User getUserOfParam(String param) {
        return dao.getUserOfParam(param);
    }
    public User getUserOfUserIds(String userIds) {
        return dao.getUserOfUserIds(userIds);
    }
    public User getUserOfName(String name) {
        return dao.getUserOfName(name);
    }
    public User getUserOfResgisterDate(String resgisterDate) {
        return dao.getUserOfResgisterDate(resgisterDate);
    }
    public User getUserOfEmail(String email) {
        return dao.getUserOfEmail(email);
    }
    public User getUserOfDesc(String desc) {
        return dao.getUserOfDesc(desc);
    }
    public User getUserOfImageAndLvl(String image, String lvl) {
        return dao.getUserOfImageAndLvl(image, lvl);
    }
    public User getUserOfImageAndNewIds(String image, String newIds) {
        return dao.getUserOfImageAndNewIds(image, newIds);
    }
    public User getUserOfImageAndFamous(String image, String famous) {
        return dao.getUserOfImageAndFamous(image, famous);
    }
    public User getUserOfImageAndSex(String image, String sex) {
        return dao.getUserOfImageAndSex(image, sex);
    }
    public User getUserOfImageAndLoginDate(String image, String loginDate) {
        return dao.getUserOfImageAndLoginDate(image, loginDate);
    }
    public User getUserOfImageAndUserId(String image, String userId) {
        return dao.getUserOfImageAndUserId(image, userId);
    }
    public User getUserOfImageAndBUserIds(String image, String bUserIds) {
        return dao.getUserOfImageAndBUserIds(image, bUserIds);
    }
    public User getUserOfImageAndScore(String image, String score) {
        return dao.getUserOfImageAndScore(image, score);
    }
    public User getUserOfImageAndPath(String image, String path) {
        return dao.getUserOfImageAndPath(image, path);
    }
    public User getUserOfImageAndPassword(String image, String password) {
        return dao.getUserOfImageAndPassword(image, password);
    }
    public User getUserOfImageAndMoney(String image, String money) {
        return dao.getUserOfImageAndMoney(image, money);
    }
    public User getUserOfImageAndPhone(String image, String phone) {
        return dao.getUserOfImageAndPhone(image, phone);
    }
    public User getUserOfImageAndParam(String image, String param) {
        return dao.getUserOfImageAndParam(image, param);
    }
    public User getUserOfImageAndUserIds(String image, String userIds) {
        return dao.getUserOfImageAndUserIds(image, userIds);
    }
    public User getUserOfImageAndName(String image, String name) {
        return dao.getUserOfImageAndName(image, name);
    }
    public User getUserOfImageAndResgisterDate(String image, String resgisterDate) {
        return dao.getUserOfImageAndResgisterDate(image, resgisterDate);
    }
    public User getUserOfImageAndEmail(String image, String email) {
        return dao.getUserOfImageAndEmail(image, email);
    }
    public User getUserOfImageAndDesc(String image, String desc) {
        return dao.getUserOfImageAndDesc(image, desc);
    }
    public User getUserOfLvlAndNewIds(String lvl, String newIds) {
        return dao.getUserOfLvlAndNewIds(lvl, newIds);
    }
    public User getUserOfLvlAndFamous(String lvl, String famous) {
        return dao.getUserOfLvlAndFamous(lvl, famous);
    }
    public User getUserOfLvlAndSex(String lvl, String sex) {
        return dao.getUserOfLvlAndSex(lvl, sex);
    }
    public User getUserOfLvlAndLoginDate(String lvl, String loginDate) {
        return dao.getUserOfLvlAndLoginDate(lvl, loginDate);
    }
    public User getUserOfLvlAndUserId(String lvl, String userId) {
        return dao.getUserOfLvlAndUserId(lvl, userId);
    }
    public User getUserOfLvlAndBUserIds(String lvl, String bUserIds) {
        return dao.getUserOfLvlAndBUserIds(lvl, bUserIds);
    }
    public User getUserOfLvlAndScore(String lvl, String score) {
        return dao.getUserOfLvlAndScore(lvl, score);
    }
    public User getUserOfLvlAndPath(String lvl, String path) {
        return dao.getUserOfLvlAndPath(lvl, path);
    }
    public User getUserOfLvlAndPassword(String lvl, String password) {
        return dao.getUserOfLvlAndPassword(lvl, password);
    }
    public User getUserOfLvlAndMoney(String lvl, String money) {
        return dao.getUserOfLvlAndMoney(lvl, money);
    }
    public User getUserOfLvlAndPhone(String lvl, String phone) {
        return dao.getUserOfLvlAndPhone(lvl, phone);
    }
    public User getUserOfLvlAndParam(String lvl, String param) {
        return dao.getUserOfLvlAndParam(lvl, param);
    }
    public User getUserOfLvlAndUserIds(String lvl, String userIds) {
        return dao.getUserOfLvlAndUserIds(lvl, userIds);
    }
    public User getUserOfLvlAndName(String lvl, String name) {
        return dao.getUserOfLvlAndName(lvl, name);
    }
    public User getUserOfLvlAndResgisterDate(String lvl, String resgisterDate) {
        return dao.getUserOfLvlAndResgisterDate(lvl, resgisterDate);
    }
    public User getUserOfLvlAndEmail(String lvl, String email) {
        return dao.getUserOfLvlAndEmail(lvl, email);
    }
    public User getUserOfLvlAndDesc(String lvl, String desc) {
        return dao.getUserOfLvlAndDesc(lvl, desc);
    }
    public User getUserOfNewIdsAndFamous(String newIds, String famous) {
        return dao.getUserOfNewIdsAndFamous(newIds, famous);
    }
    public User getUserOfNewIdsAndSex(String newIds, String sex) {
        return dao.getUserOfNewIdsAndSex(newIds, sex);
    }
    public User getUserOfNewIdsAndLoginDate(String newIds, String loginDate) {
        return dao.getUserOfNewIdsAndLoginDate(newIds, loginDate);
    }
    public User getUserOfNewIdsAndUserId(String newIds, String userId) {
        return dao.getUserOfNewIdsAndUserId(newIds, userId);
    }
    public User getUserOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        return dao.getUserOfNewIdsAndBUserIds(newIds, bUserIds);
    }
    public User getUserOfNewIdsAndScore(String newIds, String score) {
        return dao.getUserOfNewIdsAndScore(newIds, score);
    }
    public User getUserOfNewIdsAndPath(String newIds, String path) {
        return dao.getUserOfNewIdsAndPath(newIds, path);
    }
    public User getUserOfNewIdsAndPassword(String newIds, String password) {
        return dao.getUserOfNewIdsAndPassword(newIds, password);
    }
    public User getUserOfNewIdsAndMoney(String newIds, String money) {
        return dao.getUserOfNewIdsAndMoney(newIds, money);
    }
    public User getUserOfNewIdsAndPhone(String newIds, String phone) {
        return dao.getUserOfNewIdsAndPhone(newIds, phone);
    }
    public User getUserOfNewIdsAndParam(String newIds, String param) {
        return dao.getUserOfNewIdsAndParam(newIds, param);
    }
    public User getUserOfNewIdsAndUserIds(String newIds, String userIds) {
        return dao.getUserOfNewIdsAndUserIds(newIds, userIds);
    }
    public User getUserOfNewIdsAndName(String newIds, String name) {
        return dao.getUserOfNewIdsAndName(newIds, name);
    }
    public User getUserOfNewIdsAndResgisterDate(String newIds, String resgisterDate) {
        return dao.getUserOfNewIdsAndResgisterDate(newIds, resgisterDate);
    }
    public User getUserOfNewIdsAndEmail(String newIds, String email) {
        return dao.getUserOfNewIdsAndEmail(newIds, email);
    }
    public User getUserOfNewIdsAndDesc(String newIds, String desc) {
        return dao.getUserOfNewIdsAndDesc(newIds, desc);
    }
    public User getUserOfFamousAndSex(String famous, String sex) {
        return dao.getUserOfFamousAndSex(famous, sex);
    }
    public User getUserOfFamousAndLoginDate(String famous, String loginDate) {
        return dao.getUserOfFamousAndLoginDate(famous, loginDate);
    }
    public User getUserOfFamousAndUserId(String famous, String userId) {
        return dao.getUserOfFamousAndUserId(famous, userId);
    }
    public User getUserOfFamousAndBUserIds(String famous, String bUserIds) {
        return dao.getUserOfFamousAndBUserIds(famous, bUserIds);
    }
    public User getUserOfFamousAndScore(String famous, String score) {
        return dao.getUserOfFamousAndScore(famous, score);
    }
    public User getUserOfFamousAndPath(String famous, String path) {
        return dao.getUserOfFamousAndPath(famous, path);
    }
    public User getUserOfFamousAndPassword(String famous, String password) {
        return dao.getUserOfFamousAndPassword(famous, password);
    }
    public User getUserOfFamousAndMoney(String famous, String money) {
        return dao.getUserOfFamousAndMoney(famous, money);
    }
    public User getUserOfFamousAndPhone(String famous, String phone) {
        return dao.getUserOfFamousAndPhone(famous, phone);
    }
    public User getUserOfFamousAndParam(String famous, String param) {
        return dao.getUserOfFamousAndParam(famous, param);
    }
    public User getUserOfFamousAndUserIds(String famous, String userIds) {
        return dao.getUserOfFamousAndUserIds(famous, userIds);
    }
    public User getUserOfFamousAndName(String famous, String name) {
        return dao.getUserOfFamousAndName(famous, name);
    }
    public User getUserOfFamousAndResgisterDate(String famous, String resgisterDate) {
        return dao.getUserOfFamousAndResgisterDate(famous, resgisterDate);
    }
    public User getUserOfFamousAndEmail(String famous, String email) {
        return dao.getUserOfFamousAndEmail(famous, email);
    }
    public User getUserOfFamousAndDesc(String famous, String desc) {
        return dao.getUserOfFamousAndDesc(famous, desc);
    }
    public User getUserOfSexAndLoginDate(String sex, String loginDate) {
        return dao.getUserOfSexAndLoginDate(sex, loginDate);
    }
    public User getUserOfSexAndUserId(String sex, String userId) {
        return dao.getUserOfSexAndUserId(sex, userId);
    }
    public User getUserOfSexAndBUserIds(String sex, String bUserIds) {
        return dao.getUserOfSexAndBUserIds(sex, bUserIds);
    }
    public User getUserOfSexAndScore(String sex, String score) {
        return dao.getUserOfSexAndScore(sex, score);
    }
    public User getUserOfSexAndPath(String sex, String path) {
        return dao.getUserOfSexAndPath(sex, path);
    }
    public User getUserOfSexAndPassword(String sex, String password) {
        return dao.getUserOfSexAndPassword(sex, password);
    }
    public User getUserOfSexAndMoney(String sex, String money) {
        return dao.getUserOfSexAndMoney(sex, money);
    }
    public User getUserOfSexAndPhone(String sex, String phone) {
        return dao.getUserOfSexAndPhone(sex, phone);
    }
    public User getUserOfSexAndParam(String sex, String param) {
        return dao.getUserOfSexAndParam(sex, param);
    }
    public User getUserOfSexAndUserIds(String sex, String userIds) {
        return dao.getUserOfSexAndUserIds(sex, userIds);
    }
    public User getUserOfSexAndName(String sex, String name) {
        return dao.getUserOfSexAndName(sex, name);
    }
    public User getUserOfSexAndResgisterDate(String sex, String resgisterDate) {
        return dao.getUserOfSexAndResgisterDate(sex, resgisterDate);
    }
    public User getUserOfSexAndEmail(String sex, String email) {
        return dao.getUserOfSexAndEmail(sex, email);
    }
    public User getUserOfSexAndDesc(String sex, String desc) {
        return dao.getUserOfSexAndDesc(sex, desc);
    }
    public User getUserOfLoginDateAndUserId(String loginDate, String userId) {
        return dao.getUserOfLoginDateAndUserId(loginDate, userId);
    }
    public User getUserOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        return dao.getUserOfLoginDateAndBUserIds(loginDate, bUserIds);
    }
    public User getUserOfLoginDateAndScore(String loginDate, String score) {
        return dao.getUserOfLoginDateAndScore(loginDate, score);
    }
    public User getUserOfLoginDateAndPath(String loginDate, String path) {
        return dao.getUserOfLoginDateAndPath(loginDate, path);
    }
    public User getUserOfLoginDateAndPassword(String loginDate, String password) {
        return dao.getUserOfLoginDateAndPassword(loginDate, password);
    }
    public User getUserOfLoginDateAndMoney(String loginDate, String money) {
        return dao.getUserOfLoginDateAndMoney(loginDate, money);
    }
    public User getUserOfLoginDateAndPhone(String loginDate, String phone) {
        return dao.getUserOfLoginDateAndPhone(loginDate, phone);
    }
    public User getUserOfLoginDateAndParam(String loginDate, String param) {
        return dao.getUserOfLoginDateAndParam(loginDate, param);
    }
    public User getUserOfLoginDateAndUserIds(String loginDate, String userIds) {
        return dao.getUserOfLoginDateAndUserIds(loginDate, userIds);
    }
    public User getUserOfLoginDateAndName(String loginDate, String name) {
        return dao.getUserOfLoginDateAndName(loginDate, name);
    }
    public User getUserOfLoginDateAndResgisterDate(String loginDate, String resgisterDate) {
        return dao.getUserOfLoginDateAndResgisterDate(loginDate, resgisterDate);
    }
    public User getUserOfLoginDateAndEmail(String loginDate, String email) {
        return dao.getUserOfLoginDateAndEmail(loginDate, email);
    }
    public User getUserOfLoginDateAndDesc(String loginDate, String desc) {
        return dao.getUserOfLoginDateAndDesc(loginDate, desc);
    }
    public User getUserOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.getUserOfUserIdAndBUserIds(userId, bUserIds);
    }
    public User getUserOfUserIdAndScore(String userId, String score) {
        return dao.getUserOfUserIdAndScore(userId, score);
    }
    public User getUserOfUserIdAndPath(String userId, String path) {
        return dao.getUserOfUserIdAndPath(userId, path);
    }
    public User getUserOfUserIdAndPassword(String userId, String password) {
        return dao.getUserOfUserIdAndPassword(userId, password);
    }
    public User getUserOfUserIdAndMoney(String userId, String money) {
        return dao.getUserOfUserIdAndMoney(userId, money);
    }
    public User getUserOfUserIdAndPhone(String userId, String phone) {
        return dao.getUserOfUserIdAndPhone(userId, phone);
    }
    public User getUserOfUserIdAndParam(String userId, String param) {
        return dao.getUserOfUserIdAndParam(userId, param);
    }
    public User getUserOfUserIdAndUserIds(String userId, String userIds) {
        return dao.getUserOfUserIdAndUserIds(userId, userIds);
    }
    public User getUserOfUserIdAndName(String userId, String name) {
        return dao.getUserOfUserIdAndName(userId, name);
    }
    public User getUserOfUserIdAndResgisterDate(String userId, String resgisterDate) {
        return dao.getUserOfUserIdAndResgisterDate(userId, resgisterDate);
    }
    public User getUserOfUserIdAndEmail(String userId, String email) {
        return dao.getUserOfUserIdAndEmail(userId, email);
    }
    public User getUserOfUserIdAndDesc(String userId, String desc) {
        return dao.getUserOfUserIdAndDesc(userId, desc);
    }
    public User getUserOfBUserIdsAndScore(String bUserIds, String score) {
        return dao.getUserOfBUserIdsAndScore(bUserIds, score);
    }
    public User getUserOfBUserIdsAndPath(String bUserIds, String path) {
        return dao.getUserOfBUserIdsAndPath(bUserIds, path);
    }
    public User getUserOfBUserIdsAndPassword(String bUserIds, String password) {
        return dao.getUserOfBUserIdsAndPassword(bUserIds, password);
    }
    public User getUserOfBUserIdsAndMoney(String bUserIds, String money) {
        return dao.getUserOfBUserIdsAndMoney(bUserIds, money);
    }
    public User getUserOfBUserIdsAndPhone(String bUserIds, String phone) {
        return dao.getUserOfBUserIdsAndPhone(bUserIds, phone);
    }
    public User getUserOfBUserIdsAndParam(String bUserIds, String param) {
        return dao.getUserOfBUserIdsAndParam(bUserIds, param);
    }
    public User getUserOfBUserIdsAndUserIds(String bUserIds, String userIds) {
        return dao.getUserOfBUserIdsAndUserIds(bUserIds, userIds);
    }
    public User getUserOfBUserIdsAndName(String bUserIds, String name) {
        return dao.getUserOfBUserIdsAndName(bUserIds, name);
    }
    public User getUserOfBUserIdsAndResgisterDate(String bUserIds, String resgisterDate) {
        return dao.getUserOfBUserIdsAndResgisterDate(bUserIds, resgisterDate);
    }
    public User getUserOfBUserIdsAndEmail(String bUserIds, String email) {
        return dao.getUserOfBUserIdsAndEmail(bUserIds, email);
    }
    public User getUserOfBUserIdsAndDesc(String bUserIds, String desc) {
        return dao.getUserOfBUserIdsAndDesc(bUserIds, desc);
    }
    public User getUserOfScoreAndPath(String score, String path) {
        return dao.getUserOfScoreAndPath(score, path);
    }
    public User getUserOfScoreAndPassword(String score, String password) {
        return dao.getUserOfScoreAndPassword(score, password);
    }
    public User getUserOfScoreAndMoney(String score, String money) {
        return dao.getUserOfScoreAndMoney(score, money);
    }
    public User getUserOfScoreAndPhone(String score, String phone) {
        return dao.getUserOfScoreAndPhone(score, phone);
    }
    public User getUserOfScoreAndParam(String score, String param) {
        return dao.getUserOfScoreAndParam(score, param);
    }
    public User getUserOfScoreAndUserIds(String score, String userIds) {
        return dao.getUserOfScoreAndUserIds(score, userIds);
    }
    public User getUserOfScoreAndName(String score, String name) {
        return dao.getUserOfScoreAndName(score, name);
    }
    public User getUserOfScoreAndResgisterDate(String score, String resgisterDate) {
        return dao.getUserOfScoreAndResgisterDate(score, resgisterDate);
    }
    public User getUserOfScoreAndEmail(String score, String email) {
        return dao.getUserOfScoreAndEmail(score, email);
    }
    public User getUserOfScoreAndDesc(String score, String desc) {
        return dao.getUserOfScoreAndDesc(score, desc);
    }
    public User getUserOfPathAndPassword(String path, String password) {
        return dao.getUserOfPathAndPassword(path, password);
    }
    public User getUserOfPathAndMoney(String path, String money) {
        return dao.getUserOfPathAndMoney(path, money);
    }
    public User getUserOfPathAndPhone(String path, String phone) {
        return dao.getUserOfPathAndPhone(path, phone);
    }
    public User getUserOfPathAndParam(String path, String param) {
        return dao.getUserOfPathAndParam(path, param);
    }
    public User getUserOfPathAndUserIds(String path, String userIds) {
        return dao.getUserOfPathAndUserIds(path, userIds);
    }
    public User getUserOfPathAndName(String path, String name) {
        return dao.getUserOfPathAndName(path, name);
    }
    public User getUserOfPathAndResgisterDate(String path, String resgisterDate) {
        return dao.getUserOfPathAndResgisterDate(path, resgisterDate);
    }
    public User getUserOfPathAndEmail(String path, String email) {
        return dao.getUserOfPathAndEmail(path, email);
    }
    public User getUserOfPathAndDesc(String path, String desc) {
        return dao.getUserOfPathAndDesc(path, desc);
    }
    public User getUserOfPasswordAndMoney(String password, String money) {
        return dao.getUserOfPasswordAndMoney(password, money);
    }
    public User getUserOfPasswordAndPhone(String password, String phone) {
        return dao.getUserOfPasswordAndPhone(password, phone);
    }
    public User getUserOfPasswordAndParam(String password, String param) {
        return dao.getUserOfPasswordAndParam(password, param);
    }
    public User getUserOfPasswordAndUserIds(String password, String userIds) {
        return dao.getUserOfPasswordAndUserIds(password, userIds);
    }
    public User getUserOfPasswordAndName(String password, String name) {
        return dao.getUserOfPasswordAndName(password, name);
    }
    public User getUserOfPasswordAndResgisterDate(String password, String resgisterDate) {
        return dao.getUserOfPasswordAndResgisterDate(password, resgisterDate);
    }
    public User getUserOfPasswordAndEmail(String password, String email) {
        return dao.getUserOfPasswordAndEmail(password, email);
    }
    public User getUserOfPasswordAndDesc(String password, String desc) {
        return dao.getUserOfPasswordAndDesc(password, desc);
    }
    public User getUserOfMoneyAndPhone(String money, String phone) {
        return dao.getUserOfMoneyAndPhone(money, phone);
    }
    public User getUserOfMoneyAndParam(String money, String param) {
        return dao.getUserOfMoneyAndParam(money, param);
    }
    public User getUserOfMoneyAndUserIds(String money, String userIds) {
        return dao.getUserOfMoneyAndUserIds(money, userIds);
    }
    public User getUserOfMoneyAndName(String money, String name) {
        return dao.getUserOfMoneyAndName(money, name);
    }
    public User getUserOfMoneyAndResgisterDate(String money, String resgisterDate) {
        return dao.getUserOfMoneyAndResgisterDate(money, resgisterDate);
    }
    public User getUserOfMoneyAndEmail(String money, String email) {
        return dao.getUserOfMoneyAndEmail(money, email);
    }
    public User getUserOfMoneyAndDesc(String money, String desc) {
        return dao.getUserOfMoneyAndDesc(money, desc);
    }
    public User getUserOfPhoneAndParam(String phone, String param) {
        return dao.getUserOfPhoneAndParam(phone, param);
    }
    public User getUserOfPhoneAndUserIds(String phone, String userIds) {
        return dao.getUserOfPhoneAndUserIds(phone, userIds);
    }
    public User getUserOfPhoneAndName(String phone, String name) {
        return dao.getUserOfPhoneAndName(phone, name);
    }
    public User getUserOfPhoneAndResgisterDate(String phone, String resgisterDate) {
        return dao.getUserOfPhoneAndResgisterDate(phone, resgisterDate);
    }
    public User getUserOfPhoneAndEmail(String phone, String email) {
        return dao.getUserOfPhoneAndEmail(phone, email);
    }
    public User getUserOfPhoneAndDesc(String phone, String desc) {
        return dao.getUserOfPhoneAndDesc(phone, desc);
    }
    public User getUserOfParamAndUserIds(String param, String userIds) {
        return dao.getUserOfParamAndUserIds(param, userIds);
    }
    public User getUserOfParamAndName(String param, String name) {
        return dao.getUserOfParamAndName(param, name);
    }
    public User getUserOfParamAndResgisterDate(String param, String resgisterDate) {
        return dao.getUserOfParamAndResgisterDate(param, resgisterDate);
    }
    public User getUserOfParamAndEmail(String param, String email) {
        return dao.getUserOfParamAndEmail(param, email);
    }
    public User getUserOfParamAndDesc(String param, String desc) {
        return dao.getUserOfParamAndDesc(param, desc);
    }
    public User getUserOfUserIdsAndName(String userIds, String name) {
        return dao.getUserOfUserIdsAndName(userIds, name);
    }
    public User getUserOfUserIdsAndResgisterDate(String userIds, String resgisterDate) {
        return dao.getUserOfUserIdsAndResgisterDate(userIds, resgisterDate);
    }
    public User getUserOfUserIdsAndEmail(String userIds, String email) {
        return dao.getUserOfUserIdsAndEmail(userIds, email);
    }
    public User getUserOfUserIdsAndDesc(String userIds, String desc) {
        return dao.getUserOfUserIdsAndDesc(userIds, desc);
    }
    public User getUserOfNameAndResgisterDate(String name, String resgisterDate) {
        return dao.getUserOfNameAndResgisterDate(name, resgisterDate);
    }
    public User getUserOfNameAndEmail(String name, String email) {
        return dao.getUserOfNameAndEmail(name, email);
    }
    public User getUserOfNameAndDesc(String name, String desc) {
        return dao.getUserOfNameAndDesc(name, desc);
    }
    public User getUserOfResgisterDateAndEmail(String resgisterDate, String email) {
        return dao.getUserOfResgisterDateAndEmail(resgisterDate, email);
    }
    public User getUserOfResgisterDateAndDesc(String resgisterDate, String desc) {
        return dao.getUserOfResgisterDateAndDesc(resgisterDate, desc);
    }
    public User getUserOfEmailAndDesc(String email, String desc) {
        return dao.getUserOfEmailAndDesc(email, desc);
    }
    public List<User> getUsers(User user) {
        return dao.getUsers(user);
    }
    public List<User> getUsersOfImage(String image) {
        return dao.getUsersOfImage(image);
    }
    public List<User> getUsersOfLvl(String lvl) {
        return dao.getUsersOfLvl(lvl);
    }
    public List<User> getUsersOfNewIds(String newIds) {
        return dao.getUsersOfNewIds(newIds);
    }
    public List<User> getUsersOfFamous(String famous) {
        return dao.getUsersOfFamous(famous);
    }
    public List<User> getUsersOfSex(String sex) {
        return dao.getUsersOfSex(sex);
    }
    public List<User> getUsersOfLoginDate(String loginDate) {
        return dao.getUsersOfLoginDate(loginDate);
    }
    public List<User> getUsersOfUserId(String userId) {
        return dao.getUsersOfUserId(userId);
    }
    public List<User> getUsersOfBUserIds(String bUserIds) {
        return dao.getUsersOfBUserIds(bUserIds);
    }
    public List<User> getUsersOfScore(String score) {
        return dao.getUsersOfScore(score);
    }
    public List<User> getUsersOfPath(String path) {
        return dao.getUsersOfPath(path);
    }
    public List<User> getUsersOfPassword(String password) {
        return dao.getUsersOfPassword(password);
    }
    public List<User> getUsersOfMoney(String money) {
        return dao.getUsersOfMoney(money);
    }
    public List<User> getUsersOfPhone(String phone) {
        return dao.getUsersOfPhone(phone);
    }
    public List<User> getUsersOfParam(String param) {
        return dao.getUsersOfParam(param);
    }
    public List<User> getUsersOfUserIds(String userIds) {
        return dao.getUsersOfUserIds(userIds);
    }
    public List<User> getUsersOfName(String name) {
        return dao.getUsersOfName(name);
    }
    public List<User> getUsersOfResgisterDate(String resgisterDate) {
        return dao.getUsersOfResgisterDate(resgisterDate);
    }
    public List<User> getUsersOfEmail(String email) {
        return dao.getUsersOfEmail(email);
    }
    public List<User> getUsersOfDesc(String desc) {
        return dao.getUsersOfDesc(desc);
    }
    public List<User> getUsersOfImageAndLvl(String image, String lvl) {
        return dao.getUsersOfImageAndLvl(image, lvl);
    }
    public List<User> getUsersOfImageAndNewIds(String image, String newIds) {
        return dao.getUsersOfImageAndNewIds(image, newIds);
    }
    public List<User> getUsersOfImageAndFamous(String image, String famous) {
        return dao.getUsersOfImageAndFamous(image, famous);
    }
    public List<User> getUsersOfImageAndSex(String image, String sex) {
        return dao.getUsersOfImageAndSex(image, sex);
    }
    public List<User> getUsersOfImageAndLoginDate(String image, String loginDate) {
        return dao.getUsersOfImageAndLoginDate(image, loginDate);
    }
    public List<User> getUsersOfImageAndUserId(String image, String userId) {
        return dao.getUsersOfImageAndUserId(image, userId);
    }
    public List<User> getUsersOfImageAndBUserIds(String image, String bUserIds) {
        return dao.getUsersOfImageAndBUserIds(image, bUserIds);
    }
    public List<User> getUsersOfImageAndScore(String image, String score) {
        return dao.getUsersOfImageAndScore(image, score);
    }
    public List<User> getUsersOfImageAndPath(String image, String path) {
        return dao.getUsersOfImageAndPath(image, path);
    }
    public List<User> getUsersOfImageAndPassword(String image, String password) {
        return dao.getUsersOfImageAndPassword(image, password);
    }
    public List<User> getUsersOfImageAndMoney(String image, String money) {
        return dao.getUsersOfImageAndMoney(image, money);
    }
    public List<User> getUsersOfImageAndPhone(String image, String phone) {
        return dao.getUsersOfImageAndPhone(image, phone);
    }
    public List<User> getUsersOfImageAndParam(String image, String param) {
        return dao.getUsersOfImageAndParam(image, param);
    }
    public List<User> getUsersOfImageAndUserIds(String image, String userIds) {
        return dao.getUsersOfImageAndUserIds(image, userIds);
    }
    public List<User> getUsersOfImageAndName(String image, String name) {
        return dao.getUsersOfImageAndName(image, name);
    }
    public List<User> getUsersOfImageAndResgisterDate(String image, String resgisterDate) {
        return dao.getUsersOfImageAndResgisterDate(image, resgisterDate);
    }
    public List<User> getUsersOfImageAndEmail(String image, String email) {
        return dao.getUsersOfImageAndEmail(image, email);
    }
    public List<User> getUsersOfImageAndDesc(String image, String desc) {
        return dao.getUsersOfImageAndDesc(image, desc);
    }
    public List<User> getUsersOfLvlAndNewIds(String lvl, String newIds) {
        return dao.getUsersOfLvlAndNewIds(lvl, newIds);
    }
    public List<User> getUsersOfLvlAndFamous(String lvl, String famous) {
        return dao.getUsersOfLvlAndFamous(lvl, famous);
    }
    public List<User> getUsersOfLvlAndSex(String lvl, String sex) {
        return dao.getUsersOfLvlAndSex(lvl, sex);
    }
    public List<User> getUsersOfLvlAndLoginDate(String lvl, String loginDate) {
        return dao.getUsersOfLvlAndLoginDate(lvl, loginDate);
    }
    public List<User> getUsersOfLvlAndUserId(String lvl, String userId) {
        return dao.getUsersOfLvlAndUserId(lvl, userId);
    }
    public List<User> getUsersOfLvlAndBUserIds(String lvl, String bUserIds) {
        return dao.getUsersOfLvlAndBUserIds(lvl, bUserIds);
    }
    public List<User> getUsersOfLvlAndScore(String lvl, String score) {
        return dao.getUsersOfLvlAndScore(lvl, score);
    }
    public List<User> getUsersOfLvlAndPath(String lvl, String path) {
        return dao.getUsersOfLvlAndPath(lvl, path);
    }
    public List<User> getUsersOfLvlAndPassword(String lvl, String password) {
        return dao.getUsersOfLvlAndPassword(lvl, password);
    }
    public List<User> getUsersOfLvlAndMoney(String lvl, String money) {
        return dao.getUsersOfLvlAndMoney(lvl, money);
    }
    public List<User> getUsersOfLvlAndPhone(String lvl, String phone) {
        return dao.getUsersOfLvlAndPhone(lvl, phone);
    }
    public List<User> getUsersOfLvlAndParam(String lvl, String param) {
        return dao.getUsersOfLvlAndParam(lvl, param);
    }
    public List<User> getUsersOfLvlAndUserIds(String lvl, String userIds) {
        return dao.getUsersOfLvlAndUserIds(lvl, userIds);
    }
    public List<User> getUsersOfLvlAndName(String lvl, String name) {
        return dao.getUsersOfLvlAndName(lvl, name);
    }
    public List<User> getUsersOfLvlAndResgisterDate(String lvl, String resgisterDate) {
        return dao.getUsersOfLvlAndResgisterDate(lvl, resgisterDate);
    }
    public List<User> getUsersOfLvlAndEmail(String lvl, String email) {
        return dao.getUsersOfLvlAndEmail(lvl, email);
    }
    public List<User> getUsersOfLvlAndDesc(String lvl, String desc) {
        return dao.getUsersOfLvlAndDesc(lvl, desc);
    }
    public List<User> getUsersOfNewIdsAndFamous(String newIds, String famous) {
        return dao.getUsersOfNewIdsAndFamous(newIds, famous);
    }
    public List<User> getUsersOfNewIdsAndSex(String newIds, String sex) {
        return dao.getUsersOfNewIdsAndSex(newIds, sex);
    }
    public List<User> getUsersOfNewIdsAndLoginDate(String newIds, String loginDate) {
        return dao.getUsersOfNewIdsAndLoginDate(newIds, loginDate);
    }
    public List<User> getUsersOfNewIdsAndUserId(String newIds, String userId) {
        return dao.getUsersOfNewIdsAndUserId(newIds, userId);
    }
    public List<User> getUsersOfNewIdsAndBUserIds(String newIds, String bUserIds) {
        return dao.getUsersOfNewIdsAndBUserIds(newIds, bUserIds);
    }
    public List<User> getUsersOfNewIdsAndScore(String newIds, String score) {
        return dao.getUsersOfNewIdsAndScore(newIds, score);
    }
    public List<User> getUsersOfNewIdsAndPath(String newIds, String path) {
        return dao.getUsersOfNewIdsAndPath(newIds, path);
    }
    public List<User> getUsersOfNewIdsAndPassword(String newIds, String password) {
        return dao.getUsersOfNewIdsAndPassword(newIds, password);
    }
    public List<User> getUsersOfNewIdsAndMoney(String newIds, String money) {
        return dao.getUsersOfNewIdsAndMoney(newIds, money);
    }
    public List<User> getUsersOfNewIdsAndPhone(String newIds, String phone) {
        return dao.getUsersOfNewIdsAndPhone(newIds, phone);
    }
    public List<User> getUsersOfNewIdsAndParam(String newIds, String param) {
        return dao.getUsersOfNewIdsAndParam(newIds, param);
    }
    public List<User> getUsersOfNewIdsAndUserIds(String newIds, String userIds) {
        return dao.getUsersOfNewIdsAndUserIds(newIds, userIds);
    }
    public List<User> getUsersOfNewIdsAndName(String newIds, String name) {
        return dao.getUsersOfNewIdsAndName(newIds, name);
    }
    public List<User> getUsersOfNewIdsAndResgisterDate(String newIds, String resgisterDate) {
        return dao.getUsersOfNewIdsAndResgisterDate(newIds, resgisterDate);
    }
    public List<User> getUsersOfNewIdsAndEmail(String newIds, String email) {
        return dao.getUsersOfNewIdsAndEmail(newIds, email);
    }
    public List<User> getUsersOfNewIdsAndDesc(String newIds, String desc) {
        return dao.getUsersOfNewIdsAndDesc(newIds, desc);
    }
    public List<User> getUsersOfFamousAndSex(String famous, String sex) {
        return dao.getUsersOfFamousAndSex(famous, sex);
    }
    public List<User> getUsersOfFamousAndLoginDate(String famous, String loginDate) {
        return dao.getUsersOfFamousAndLoginDate(famous, loginDate);
    }
    public List<User> getUsersOfFamousAndUserId(String famous, String userId) {
        return dao.getUsersOfFamousAndUserId(famous, userId);
    }
    public List<User> getUsersOfFamousAndBUserIds(String famous, String bUserIds) {
        return dao.getUsersOfFamousAndBUserIds(famous, bUserIds);
    }
    public List<User> getUsersOfFamousAndScore(String famous, String score) {
        return dao.getUsersOfFamousAndScore(famous, score);
    }
    public List<User> getUsersOfFamousAndPath(String famous, String path) {
        return dao.getUsersOfFamousAndPath(famous, path);
    }
    public List<User> getUsersOfFamousAndPassword(String famous, String password) {
        return dao.getUsersOfFamousAndPassword(famous, password);
    }
    public List<User> getUsersOfFamousAndMoney(String famous, String money) {
        return dao.getUsersOfFamousAndMoney(famous, money);
    }
    public List<User> getUsersOfFamousAndPhone(String famous, String phone) {
        return dao.getUsersOfFamousAndPhone(famous, phone);
    }
    public List<User> getUsersOfFamousAndParam(String famous, String param) {
        return dao.getUsersOfFamousAndParam(famous, param);
    }
    public List<User> getUsersOfFamousAndUserIds(String famous, String userIds) {
        return dao.getUsersOfFamousAndUserIds(famous, userIds);
    }
    public List<User> getUsersOfFamousAndName(String famous, String name) {
        return dao.getUsersOfFamousAndName(famous, name);
    }
    public List<User> getUsersOfFamousAndResgisterDate(String famous, String resgisterDate) {
        return dao.getUsersOfFamousAndResgisterDate(famous, resgisterDate);
    }
    public List<User> getUsersOfFamousAndEmail(String famous, String email) {
        return dao.getUsersOfFamousAndEmail(famous, email);
    }
    public List<User> getUsersOfFamousAndDesc(String famous, String desc) {
        return dao.getUsersOfFamousAndDesc(famous, desc);
    }
    public List<User> getUsersOfSexAndLoginDate(String sex, String loginDate) {
        return dao.getUsersOfSexAndLoginDate(sex, loginDate);
    }
    public List<User> getUsersOfSexAndUserId(String sex, String userId) {
        return dao.getUsersOfSexAndUserId(sex, userId);
    }
    public List<User> getUsersOfSexAndBUserIds(String sex, String bUserIds) {
        return dao.getUsersOfSexAndBUserIds(sex, bUserIds);
    }
    public List<User> getUsersOfSexAndScore(String sex, String score) {
        return dao.getUsersOfSexAndScore(sex, score);
    }
    public List<User> getUsersOfSexAndPath(String sex, String path) {
        return dao.getUsersOfSexAndPath(sex, path);
    }
    public List<User> getUsersOfSexAndPassword(String sex, String password) {
        return dao.getUsersOfSexAndPassword(sex, password);
    }
    public List<User> getUsersOfSexAndMoney(String sex, String money) {
        return dao.getUsersOfSexAndMoney(sex, money);
    }
    public List<User> getUsersOfSexAndPhone(String sex, String phone) {
        return dao.getUsersOfSexAndPhone(sex, phone);
    }
    public List<User> getUsersOfSexAndParam(String sex, String param) {
        return dao.getUsersOfSexAndParam(sex, param);
    }
    public List<User> getUsersOfSexAndUserIds(String sex, String userIds) {
        return dao.getUsersOfSexAndUserIds(sex, userIds);
    }
    public List<User> getUsersOfSexAndName(String sex, String name) {
        return dao.getUsersOfSexAndName(sex, name);
    }
    public List<User> getUsersOfSexAndResgisterDate(String sex, String resgisterDate) {
        return dao.getUsersOfSexAndResgisterDate(sex, resgisterDate);
    }
    public List<User> getUsersOfSexAndEmail(String sex, String email) {
        return dao.getUsersOfSexAndEmail(sex, email);
    }
    public List<User> getUsersOfSexAndDesc(String sex, String desc) {
        return dao.getUsersOfSexAndDesc(sex, desc);
    }
    public List<User> getUsersOfLoginDateAndUserId(String loginDate, String userId) {
        return dao.getUsersOfLoginDateAndUserId(loginDate, userId);
    }
    public List<User> getUsersOfLoginDateAndBUserIds(String loginDate, String bUserIds) {
        return dao.getUsersOfLoginDateAndBUserIds(loginDate, bUserIds);
    }
    public List<User> getUsersOfLoginDateAndScore(String loginDate, String score) {
        return dao.getUsersOfLoginDateAndScore(loginDate, score);
    }
    public List<User> getUsersOfLoginDateAndPath(String loginDate, String path) {
        return dao.getUsersOfLoginDateAndPath(loginDate, path);
    }
    public List<User> getUsersOfLoginDateAndPassword(String loginDate, String password) {
        return dao.getUsersOfLoginDateAndPassword(loginDate, password);
    }
    public List<User> getUsersOfLoginDateAndMoney(String loginDate, String money) {
        return dao.getUsersOfLoginDateAndMoney(loginDate, money);
    }
    public List<User> getUsersOfLoginDateAndPhone(String loginDate, String phone) {
        return dao.getUsersOfLoginDateAndPhone(loginDate, phone);
    }
    public List<User> getUsersOfLoginDateAndParam(String loginDate, String param) {
        return dao.getUsersOfLoginDateAndParam(loginDate, param);
    }
    public List<User> getUsersOfLoginDateAndUserIds(String loginDate, String userIds) {
        return dao.getUsersOfLoginDateAndUserIds(loginDate, userIds);
    }
    public List<User> getUsersOfLoginDateAndName(String loginDate, String name) {
        return dao.getUsersOfLoginDateAndName(loginDate, name);
    }
    public List<User> getUsersOfLoginDateAndResgisterDate(String loginDate, String resgisterDate) {
        return dao.getUsersOfLoginDateAndResgisterDate(loginDate, resgisterDate);
    }
    public List<User> getUsersOfLoginDateAndEmail(String loginDate, String email) {
        return dao.getUsersOfLoginDateAndEmail(loginDate, email);
    }
    public List<User> getUsersOfLoginDateAndDesc(String loginDate, String desc) {
        return dao.getUsersOfLoginDateAndDesc(loginDate, desc);
    }
    public List<User> getUsersOfUserIdAndBUserIds(String userId, String bUserIds) {
        return dao.getUsersOfUserIdAndBUserIds(userId, bUserIds);
    }
    public List<User> getUsersOfUserIdAndScore(String userId, String score) {
        return dao.getUsersOfUserIdAndScore(userId, score);
    }
    public List<User> getUsersOfUserIdAndPath(String userId, String path) {
        return dao.getUsersOfUserIdAndPath(userId, path);
    }
    public List<User> getUsersOfUserIdAndPassword(String userId, String password) {
        return dao.getUsersOfUserIdAndPassword(userId, password);
    }
    public List<User> getUsersOfUserIdAndMoney(String userId, String money) {
        return dao.getUsersOfUserIdAndMoney(userId, money);
    }
    public List<User> getUsersOfUserIdAndPhone(String userId, String phone) {
        return dao.getUsersOfUserIdAndPhone(userId, phone);
    }
    public List<User> getUsersOfUserIdAndParam(String userId, String param) {
        return dao.getUsersOfUserIdAndParam(userId, param);
    }
    public List<User> getUsersOfUserIdAndUserIds(String userId, String userIds) {
        return dao.getUsersOfUserIdAndUserIds(userId, userIds);
    }
    public List<User> getUsersOfUserIdAndName(String userId, String name) {
        return dao.getUsersOfUserIdAndName(userId, name);
    }
    public List<User> getUsersOfUserIdAndResgisterDate(String userId, String resgisterDate) {
        return dao.getUsersOfUserIdAndResgisterDate(userId, resgisterDate);
    }
    public List<User> getUsersOfUserIdAndEmail(String userId, String email) {
        return dao.getUsersOfUserIdAndEmail(userId, email);
    }
    public List<User> getUsersOfUserIdAndDesc(String userId, String desc) {
        return dao.getUsersOfUserIdAndDesc(userId, desc);
    }
    public List<User> getUsersOfBUserIdsAndScore(String bUserIds, String score) {
        return dao.getUsersOfBUserIdsAndScore(bUserIds, score);
    }
    public List<User> getUsersOfBUserIdsAndPath(String bUserIds, String path) {
        return dao.getUsersOfBUserIdsAndPath(bUserIds, path);
    }
    public List<User> getUsersOfBUserIdsAndPassword(String bUserIds, String password) {
        return dao.getUsersOfBUserIdsAndPassword(bUserIds, password);
    }
    public List<User> getUsersOfBUserIdsAndMoney(String bUserIds, String money) {
        return dao.getUsersOfBUserIdsAndMoney(bUserIds, money);
    }
    public List<User> getUsersOfBUserIdsAndPhone(String bUserIds, String phone) {
        return dao.getUsersOfBUserIdsAndPhone(bUserIds, phone);
    }
    public List<User> getUsersOfBUserIdsAndParam(String bUserIds, String param) {
        return dao.getUsersOfBUserIdsAndParam(bUserIds, param);
    }
    public List<User> getUsersOfBUserIdsAndUserIds(String bUserIds, String userIds) {
        return dao.getUsersOfBUserIdsAndUserIds(bUserIds, userIds);
    }
    public List<User> getUsersOfBUserIdsAndName(String bUserIds, String name) {
        return dao.getUsersOfBUserIdsAndName(bUserIds, name);
    }
    public List<User> getUsersOfBUserIdsAndResgisterDate(String bUserIds, String resgisterDate) {
        return dao.getUsersOfBUserIdsAndResgisterDate(bUserIds, resgisterDate);
    }
    public List<User> getUsersOfBUserIdsAndEmail(String bUserIds, String email) {
        return dao.getUsersOfBUserIdsAndEmail(bUserIds, email);
    }
    public List<User> getUsersOfBUserIdsAndDesc(String bUserIds, String desc) {
        return dao.getUsersOfBUserIdsAndDesc(bUserIds, desc);
    }
    public List<User> getUsersOfScoreAndPath(String score, String path) {
        return dao.getUsersOfScoreAndPath(score, path);
    }
    public List<User> getUsersOfScoreAndPassword(String score, String password) {
        return dao.getUsersOfScoreAndPassword(score, password);
    }
    public List<User> getUsersOfScoreAndMoney(String score, String money) {
        return dao.getUsersOfScoreAndMoney(score, money);
    }
    public List<User> getUsersOfScoreAndPhone(String score, String phone) {
        return dao.getUsersOfScoreAndPhone(score, phone);
    }
    public List<User> getUsersOfScoreAndParam(String score, String param) {
        return dao.getUsersOfScoreAndParam(score, param);
    }
    public List<User> getUsersOfScoreAndUserIds(String score, String userIds) {
        return dao.getUsersOfScoreAndUserIds(score, userIds);
    }
    public List<User> getUsersOfScoreAndName(String score, String name) {
        return dao.getUsersOfScoreAndName(score, name);
    }
    public List<User> getUsersOfScoreAndResgisterDate(String score, String resgisterDate) {
        return dao.getUsersOfScoreAndResgisterDate(score, resgisterDate);
    }
    public List<User> getUsersOfScoreAndEmail(String score, String email) {
        return dao.getUsersOfScoreAndEmail(score, email);
    }
    public List<User> getUsersOfScoreAndDesc(String score, String desc) {
        return dao.getUsersOfScoreAndDesc(score, desc);
    }
    public List<User> getUsersOfPathAndPassword(String path, String password) {
        return dao.getUsersOfPathAndPassword(path, password);
    }
    public List<User> getUsersOfPathAndMoney(String path, String money) {
        return dao.getUsersOfPathAndMoney(path, money);
    }
    public List<User> getUsersOfPathAndPhone(String path, String phone) {
        return dao.getUsersOfPathAndPhone(path, phone);
    }
    public List<User> getUsersOfPathAndParam(String path, String param) {
        return dao.getUsersOfPathAndParam(path, param);
    }
    public List<User> getUsersOfPathAndUserIds(String path, String userIds) {
        return dao.getUsersOfPathAndUserIds(path, userIds);
    }
    public List<User> getUsersOfPathAndName(String path, String name) {
        return dao.getUsersOfPathAndName(path, name);
    }
    public List<User> getUsersOfPathAndResgisterDate(String path, String resgisterDate) {
        return dao.getUsersOfPathAndResgisterDate(path, resgisterDate);
    }
    public List<User> getUsersOfPathAndEmail(String path, String email) {
        return dao.getUsersOfPathAndEmail(path, email);
    }
    public List<User> getUsersOfPathAndDesc(String path, String desc) {
        return dao.getUsersOfPathAndDesc(path, desc);
    }
    public List<User> getUsersOfPasswordAndMoney(String password, String money) {
        return dao.getUsersOfPasswordAndMoney(password, money);
    }
    public List<User> getUsersOfPasswordAndPhone(String password, String phone) {
        return dao.getUsersOfPasswordAndPhone(password, phone);
    }
    public List<User> getUsersOfPasswordAndParam(String password, String param) {
        return dao.getUsersOfPasswordAndParam(password, param);
    }
    public List<User> getUsersOfPasswordAndUserIds(String password, String userIds) {
        return dao.getUsersOfPasswordAndUserIds(password, userIds);
    }
    public List<User> getUsersOfPasswordAndName(String password, String name) {
        return dao.getUsersOfPasswordAndName(password, name);
    }
    public List<User> getUsersOfPasswordAndResgisterDate(String password, String resgisterDate) {
        return dao.getUsersOfPasswordAndResgisterDate(password, resgisterDate);
    }
    public List<User> getUsersOfPasswordAndEmail(String password, String email) {
        return dao.getUsersOfPasswordAndEmail(password, email);
    }
    public List<User> getUsersOfPasswordAndDesc(String password, String desc) {
        return dao.getUsersOfPasswordAndDesc(password, desc);
    }
    public List<User> getUsersOfMoneyAndPhone(String money, String phone) {
        return dao.getUsersOfMoneyAndPhone(money, phone);
    }
    public List<User> getUsersOfMoneyAndParam(String money, String param) {
        return dao.getUsersOfMoneyAndParam(money, param);
    }
    public List<User> getUsersOfMoneyAndUserIds(String money, String userIds) {
        return dao.getUsersOfMoneyAndUserIds(money, userIds);
    }
    public List<User> getUsersOfMoneyAndName(String money, String name) {
        return dao.getUsersOfMoneyAndName(money, name);
    }
    public List<User> getUsersOfMoneyAndResgisterDate(String money, String resgisterDate) {
        return dao.getUsersOfMoneyAndResgisterDate(money, resgisterDate);
    }
    public List<User> getUsersOfMoneyAndEmail(String money, String email) {
        return dao.getUsersOfMoneyAndEmail(money, email);
    }
    public List<User> getUsersOfMoneyAndDesc(String money, String desc) {
        return dao.getUsersOfMoneyAndDesc(money, desc);
    }
    public List<User> getUsersOfPhoneAndParam(String phone, String param) {
        return dao.getUsersOfPhoneAndParam(phone, param);
    }
    public List<User> getUsersOfPhoneAndUserIds(String phone, String userIds) {
        return dao.getUsersOfPhoneAndUserIds(phone, userIds);
    }
    public List<User> getUsersOfPhoneAndName(String phone, String name) {
        return dao.getUsersOfPhoneAndName(phone, name);
    }
    public List<User> getUsersOfPhoneAndResgisterDate(String phone, String resgisterDate) {
        return dao.getUsersOfPhoneAndResgisterDate(phone, resgisterDate);
    }
    public List<User> getUsersOfPhoneAndEmail(String phone, String email) {
        return dao.getUsersOfPhoneAndEmail(phone, email);
    }
    public List<User> getUsersOfPhoneAndDesc(String phone, String desc) {
        return dao.getUsersOfPhoneAndDesc(phone, desc);
    }
    public List<User> getUsersOfParamAndUserIds(String param, String userIds) {
        return dao.getUsersOfParamAndUserIds(param, userIds);
    }
    public List<User> getUsersOfParamAndName(String param, String name) {
        return dao.getUsersOfParamAndName(param, name);
    }
    public List<User> getUsersOfParamAndResgisterDate(String param, String resgisterDate) {
        return dao.getUsersOfParamAndResgisterDate(param, resgisterDate);
    }
    public List<User> getUsersOfParamAndEmail(String param, String email) {
        return dao.getUsersOfParamAndEmail(param, email);
    }
    public List<User> getUsersOfParamAndDesc(String param, String desc) {
        return dao.getUsersOfParamAndDesc(param, desc);
    }
    public List<User> getUsersOfUserIdsAndName(String userIds, String name) {
        return dao.getUsersOfUserIdsAndName(userIds, name);
    }
    public List<User> getUsersOfUserIdsAndResgisterDate(String userIds, String resgisterDate) {
        return dao.getUsersOfUserIdsAndResgisterDate(userIds, resgisterDate);
    }
    public List<User> getUsersOfUserIdsAndEmail(String userIds, String email) {
        return dao.getUsersOfUserIdsAndEmail(userIds, email);
    }
    public List<User> getUsersOfUserIdsAndDesc(String userIds, String desc) {
        return dao.getUsersOfUserIdsAndDesc(userIds, desc);
    }
    public List<User> getUsersOfNameAndResgisterDate(String name, String resgisterDate) {
        return dao.getUsersOfNameAndResgisterDate(name, resgisterDate);
    }
    public List<User> getUsersOfNameAndEmail(String name, String email) {
        return dao.getUsersOfNameAndEmail(name, email);
    }
    public List<User> getUsersOfNameAndDesc(String name, String desc) {
        return dao.getUsersOfNameAndDesc(name, desc);
    }
    public List<User> getUsersOfResgisterDateAndEmail(String resgisterDate, String email) {
        return dao.getUsersOfResgisterDateAndEmail(resgisterDate, email);
    }
    public List<User> getUsersOfResgisterDateAndDesc(String resgisterDate, String desc) {
        return dao.getUsersOfResgisterDateAndDesc(resgisterDate, desc);
    }
    public List<User> getUsersOfEmailAndDesc(String email, String desc) {
        return dao.getUsersOfEmailAndDesc(email, desc);
    }
}
