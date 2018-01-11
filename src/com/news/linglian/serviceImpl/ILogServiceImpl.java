package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Log;

import com.news.linglian.dao.ILogDao;
import com.news.linglian.daoImpl.ILogDaoImpl;
import com.news.linglian.service.ILogService;

public class ILogServiceImpl implements ILogService {
	ILogDao dao = null;

	public ILogServiceImpl() {
		dao = new ILogDaoImpl();
	}
    public int update(Log log, Log keyLog) {
        return dao.update(log, keyLog);
    }
    public int updateOfLogid(Log log, String logid) {
        return dao.updateOfLogid(log, logid);
    }
    public int updateOfBody(Log log, String body) {
        return dao.updateOfBody(log, body);
    }
    public int updateOfLogdate(Log log, String logdate) {
        return dao.updateOfLogdate(log, logdate);
    }
    public int updateOfAdminid(Log log, String adminid) {
        return dao.updateOfAdminid(log, adminid);
    }
    public int updateOfLogidAndBody(Log log, String logid, String body) {
        return dao.updateOfLogidAndBody(log, logid, body);
    }
    public int updateOfLogidAndLogdate(Log log, String logid, String logdate) {
        return dao.updateOfLogidAndLogdate(log, logid, logdate);
    }
    public int updateOfLogidAndAdminid(Log log, String logid, String adminid) {
        return dao.updateOfLogidAndAdminid(log, logid, adminid);
    }
    public int updateOfBodyAndLogdate(Log log, String body, String logdate) {
        return dao.updateOfBodyAndLogdate(log, body, logdate);
    }
    public int updateOfBodyAndAdminid(Log log, String body, String adminid) {
        return dao.updateOfBodyAndAdminid(log, body, adminid);
    }
    public int updateOfLogdateAndAdminid(Log log, String logdate, String adminid) {
        return dao.updateOfLogdateAndAdminid(log, logdate, adminid);
    }
    public int updateOfLogidAndBodyAndLogdate(Log log, String logid, String body, String logdate) {
        return dao.updateOfLogidAndBodyAndLogdate(log, logid, body, logdate);
    }
    public int updateOfLogidAndBodyAndAdminid(Log log, String logid, String body, String adminid) {
        return dao.updateOfLogidAndBodyAndAdminid(log, logid, body, adminid);
    }
    public int updateOfLogidAndLogdateAndAdminid(Log log, String logid, String logdate, String adminid) {
        return dao.updateOfLogidAndLogdateAndAdminid(log, logid, logdate, adminid);
    }
    public int updateOfBodyAndLogdateAndAdminid(Log log, String body, String logdate, String adminid) {
        return dao.updateOfBodyAndLogdateAndAdminid(log, body, logdate, adminid);
    }
    public int updateOfLogidAndBodyAndLogdateAndAdminid(Log log, String logid, String body, String logdate, String adminid) {
        return dao.updateOfLogidAndBodyAndLogdateAndAdminid(log, logid, body, logdate, adminid);
    }
    public int remove(Log log) {
        return dao.remove(log);
    }
    public int removeOfLogid(String logid) {
        return dao.removeOfLogid(logid);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfLogdate(String logdate) {
        return dao.removeOfLogdate(logdate);
    }
    public int removeOfAdminid(String adminid) {
        return dao.removeOfAdminid(adminid);
    }
    public int removeOfLogidAndBody(String logid, String body) {
        return dao.removeOfLogidAndBody(logid, body);
    }
    public int removeOfLogidAndLogdate(String logid, String logdate) {
        return dao.removeOfLogidAndLogdate(logid, logdate);
    }
    public int removeOfLogidAndAdminid(String logid, String adminid) {
        return dao.removeOfLogidAndAdminid(logid, adminid);
    }
    public int removeOfBodyAndLogdate(String body, String logdate) {
        return dao.removeOfBodyAndLogdate(body, logdate);
    }
    public int removeOfBodyAndAdminid(String body, String adminid) {
        return dao.removeOfBodyAndAdminid(body, adminid);
    }
    public int removeOfLogdateAndAdminid(String logdate, String adminid) {
        return dao.removeOfLogdateAndAdminid(logdate, adminid);
    }
    public int removeOfLogidAndBodyAndLogdate(String logid, String body, String logdate) {
        return dao.removeOfLogidAndBodyAndLogdate(logid, body, logdate);
    }
    public int removeOfLogidAndBodyAndAdminid(String logid, String body, String adminid) {
        return dao.removeOfLogidAndBodyAndAdminid(logid, body, adminid);
    }
    public int removeOfLogidAndLogdateAndAdminid(String logid, String logdate, String adminid) {
        return dao.removeOfLogidAndLogdateAndAdminid(logid, logdate, adminid);
    }
    public int removeOfBodyAndLogdateAndAdminid(String body, String logdate, String adminid) {
        return dao.removeOfBodyAndLogdateAndAdminid(body, logdate, adminid);
    }
    public int removeOfLogidAndBodyAndLogdateAndAdminid(String logid, String body, String logdate, String adminid) {
        return dao.removeOfLogidAndBodyAndLogdateAndAdminid(logid, body, logdate, adminid);
    }
    public int insert(Log log) {
        return dao.insert(log);
    }
    public int insertOfLogid(String logid) {
        return dao.insertOfLogid(logid);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfLogdate(String logdate) {
        return dao.insertOfLogdate(logdate);
    }
    public int insertOfAdminid(String adminid) {
        return dao.insertOfAdminid(adminid);
    }
    public int insertOfLogidAndBody(String logid, String body) {
        return dao.insertOfLogidAndBody(logid, body);
    }
    public int insertOfLogidAndLogdate(String logid, String logdate) {
        return dao.insertOfLogidAndLogdate(logid, logdate);
    }
    public int insertOfLogidAndAdminid(String logid, String adminid) {
        return dao.insertOfLogidAndAdminid(logid, adminid);
    }
    public int insertOfBodyAndLogdate(String body, String logdate) {
        return dao.insertOfBodyAndLogdate(body, logdate);
    }
    public int insertOfBodyAndAdminid(String body, String adminid) {
        return dao.insertOfBodyAndAdminid(body, adminid);
    }
    public int insertOfLogdateAndAdminid(String logdate, String adminid) {
        return dao.insertOfLogdateAndAdminid(logdate, adminid);
    }
    public int insertOfLogidAndBodyAndLogdate(String logid, String body, String logdate) {
        return dao.insertOfLogidAndBodyAndLogdate(logid, body, logdate);
    }
    public int insertOfLogidAndBodyAndAdminid(String logid, String body, String adminid) {
        return dao.insertOfLogidAndBodyAndAdminid(logid, body, adminid);
    }
    public int insertOfLogidAndLogdateAndAdminid(String logid, String logdate, String adminid) {
        return dao.insertOfLogidAndLogdateAndAdminid(logid, logdate, adminid);
    }
    public int insertOfBodyAndLogdateAndAdminid(String body, String logdate, String adminid) {
        return dao.insertOfBodyAndLogdateAndAdminid(body, logdate, adminid);
    }
    public int insertOfLogidAndBodyAndLogdateAndAdminid(String logid, String body, String logdate, String adminid) {
        return dao.insertOfLogidAndBodyAndLogdateAndAdminid(logid, body, logdate, adminid);
    }
    public Log getLog(Log log) {
        return dao.getLog(log);
    }
    public Log getLogOfLogid(String logid) {
        return dao.getLogOfLogid(logid);
    }
    public Log getLogOfBody(String body) {
        return dao.getLogOfBody(body);
    }
    public Log getLogOfLogdate(String logdate) {
        return dao.getLogOfLogdate(logdate);
    }
    public Log getLogOfAdminid(String adminid) {
        return dao.getLogOfAdminid(adminid);
    }
    public Log getLogOfLogidAndBody(String logid, String body) {
        return dao.getLogOfLogidAndBody(logid, body);
    }
    public Log getLogOfLogidAndLogdate(String logid, String logdate) {
        return dao.getLogOfLogidAndLogdate(logid, logdate);
    }
    public Log getLogOfLogidAndAdminid(String logid, String adminid) {
        return dao.getLogOfLogidAndAdminid(logid, adminid);
    }
    public Log getLogOfBodyAndLogdate(String body, String logdate) {
        return dao.getLogOfBodyAndLogdate(body, logdate);
    }
    public Log getLogOfBodyAndAdminid(String body, String adminid) {
        return dao.getLogOfBodyAndAdminid(body, adminid);
    }
    public Log getLogOfLogdateAndAdminid(String logdate, String adminid) {
        return dao.getLogOfLogdateAndAdminid(logdate, adminid);
    }
    public Log getLogOfLogidAndBodyAndLogdate(String logid, String body, String logdate) {
        return dao.getLogOfLogidAndBodyAndLogdate(logid, body, logdate);
    }
    public Log getLogOfLogidAndBodyAndAdminid(String logid, String body, String adminid) {
        return dao.getLogOfLogidAndBodyAndAdminid(logid, body, adminid);
    }
    public Log getLogOfLogidAndLogdateAndAdminid(String logid, String logdate, String adminid) {
        return dao.getLogOfLogidAndLogdateAndAdminid(logid, logdate, adminid);
    }
    public Log getLogOfBodyAndLogdateAndAdminid(String body, String logdate, String adminid) {
        return dao.getLogOfBodyAndLogdateAndAdminid(body, logdate, adminid);
    }
    public Log getLogOfLogidAndBodyAndLogdateAndAdminid(String logid, String body, String logdate, String adminid) {
        return dao.getLogOfLogidAndBodyAndLogdateAndAdminid(logid, body, logdate, adminid);
    }
    public List<Log> getLogs(Log log) {
        return dao.getLogs(log);
    }
    public List<Log> getLogsOfLogid(String logid) {
        return dao.getLogsOfLogid(logid);
    }
    public List<Log> getLogsOfBody(String body) {
        return dao.getLogsOfBody(body);
    }
    public List<Log> getLogsOfLogdate(String logdate) {
        return dao.getLogsOfLogdate(logdate);
    }
    public List<Log> getLogsOfAdminid(String adminid) {
        return dao.getLogsOfAdminid(adminid);
    }
    public List<Log> getLogsOfLogidAndBody(String logid, String body) {
        return dao.getLogsOfLogidAndBody(logid, body);
    }
    public List<Log> getLogsOfLogidAndLogdate(String logid, String logdate) {
        return dao.getLogsOfLogidAndLogdate(logid, logdate);
    }
    public List<Log> getLogsOfLogidAndAdminid(String logid, String adminid) {
        return dao.getLogsOfLogidAndAdminid(logid, adminid);
    }
    public List<Log> getLogsOfBodyAndLogdate(String body, String logdate) {
        return dao.getLogsOfBodyAndLogdate(body, logdate);
    }
    public List<Log> getLogsOfBodyAndAdminid(String body, String adminid) {
        return dao.getLogsOfBodyAndAdminid(body, adminid);
    }
    public List<Log> getLogsOfLogdateAndAdminid(String logdate, String adminid) {
        return dao.getLogsOfLogdateAndAdminid(logdate, adminid);
    }
    public List<Log> getLogsOfLogidAndBodyAndLogdate(String logid, String body, String logdate) {
        return dao.getLogsOfLogidAndBodyAndLogdate(logid, body, logdate);
    }
    public List<Log> getLogsOfLogidAndBodyAndAdminid(String logid, String body, String adminid) {
        return dao.getLogsOfLogidAndBodyAndAdminid(logid, body, adminid);
    }
    public List<Log> getLogsOfLogidAndLogdateAndAdminid(String logid, String logdate, String adminid) {
        return dao.getLogsOfLogidAndLogdateAndAdminid(logid, logdate, adminid);
    }
    public List<Log> getLogsOfBodyAndLogdateAndAdminid(String body, String logdate, String adminid) {
        return dao.getLogsOfBodyAndLogdateAndAdminid(body, logdate, adminid);
    }
    public List<Log> getLogsOfLogidAndBodyAndLogdateAndAdminid(String logid, String body, String logdate, String adminid) {
        return dao.getLogsOfLogidAndBodyAndLogdateAndAdminid(logid, body, logdate, adminid);
    }
}
