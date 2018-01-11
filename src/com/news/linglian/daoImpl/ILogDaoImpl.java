package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Log;

import com.news.linglian.dao.ILogDao;
import db.DBMan;

public class ILogDaoImpl implements ILogDao {
    public int update(Log log, Log keyLog) {
        return DBMan.getInstance().updateWithoutThrow(log, keyLog, "log");
    }
    public int updateOfLogid(Log log, String logid) {
        Log kLog = new Log();
        kLog.setLogid(logid);
        return update(log, kLog);
    }
    public int updateOfBody(Log log, String body) {
        Log kLog = new Log();
        kLog.setBody(body);
        return update(log, kLog);
    }
    public int updateOfLogdate(Log log, String logdate) {
        Log kLog = new Log();
        kLog.setLogdate(logdate);
        return update(log, kLog);
    }
    public int updateOfAdminid(Log log, String adminid) {
        Log kLog = new Log();
        kLog.setAdminid(adminid);
        return update(log, kLog);
    }
    public int updateOfLogidAndBody(Log log, String logid, String body) {
        Log kLog = new Log();
        kLog.setLogid(logid);
        kLog.setBody(body);
        return update(log, kLog);
    }
    public int updateOfLogidAndLogdate(Log log, String logid, String logdate) {
        Log kLog = new Log();
        kLog.setLogid(logid);
        kLog.setLogdate(logdate);
        return update(log, kLog);
    }
    public int updateOfLogidAndAdminid(Log log, String logid, String adminid) {
        Log kLog = new Log();
        kLog.setLogid(logid);
        kLog.setAdminid(adminid);
        return update(log, kLog);
    }
    public int updateOfBodyAndLogdate(Log log, String body, String logdate) {
        Log kLog = new Log();
        kLog.setBody(body);
        kLog.setLogdate(logdate);
        return update(log, kLog);
    }
    public int updateOfBodyAndAdminid(Log log, String body, String adminid) {
        Log kLog = new Log();
        kLog.setBody(body);
        kLog.setAdminid(adminid);
        return update(log, kLog);
    }
    public int updateOfLogdateAndAdminid(Log log, String logdate, String adminid) {
        Log kLog = new Log();
        kLog.setLogdate(logdate);
        kLog.setAdminid(adminid);
        return update(log, kLog);
    }
    public int updateOfLogidAndBodyAndLogdate(Log log, String logid, String body, String logdate) {
        Log kLog = new Log();
        kLog.setLogid(logid);
        kLog.setBody(body);
        kLog.setLogdate(logdate);
        return update(log, kLog);
    }
    public int updateOfLogidAndBodyAndAdminid(Log log, String logid, String body, String adminid) {
        Log kLog = new Log();
        kLog.setLogid(logid);
        kLog.setBody(body);
        kLog.setAdminid(adminid);
        return update(log, kLog);
    }
    public int updateOfLogidAndLogdateAndAdminid(Log log, String logid, String logdate, String adminid) {
        Log kLog = new Log();
        kLog.setLogid(logid);
        kLog.setLogdate(logdate);
        kLog.setAdminid(adminid);
        return update(log, kLog);
    }
    public int updateOfBodyAndLogdateAndAdminid(Log log, String body, String logdate, String adminid) {
        Log kLog = new Log();
        kLog.setBody(body);
        kLog.setLogdate(logdate);
        kLog.setAdminid(adminid);
        return update(log, kLog);
    }
    public int updateOfLogidAndBodyAndLogdateAndAdminid(Log log, String logid, String body, String logdate, String adminid) {
        Log kLog = new Log();
        kLog.setLogid(logid);
        kLog.setBody(body);
        kLog.setLogdate(logdate);
        kLog.setAdminid(adminid);
        return update(log, kLog);
    }
    public int remove(Log log) {
        return DBMan.getInstance().deleteWithoutThrow(log, "log");
    }
    public int removeOfLogid(String logid) {
        Log log = new Log();
        log.setLogid(logid);
        return remove(log);
    }
    public int removeOfBody(String body) {
        Log log = new Log();
        log.setBody(body);
        return remove(log);
    }
    public int removeOfLogdate(String logdate) {
        Log log = new Log();
        log.setLogdate(logdate);
        return remove(log);
    }
    public int removeOfAdminid(String adminid) {
        Log log = new Log();
        log.setAdminid(adminid);
        return remove(log);
    }
    public int removeOfLogidAndBody(String logid, String body) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        return remove(log);
    }
    public int removeOfLogidAndLogdate(String logid, String logdate) {
        Log log = new Log();
        log.setLogid(logid);
        log.setLogdate(logdate);
        return remove(log);
    }
    public int removeOfLogidAndAdminid(String logid, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setAdminid(adminid);
        return remove(log);
    }
    public int removeOfBodyAndLogdate(String body, String logdate) {
        Log log = new Log();
        log.setBody(body);
        log.setLogdate(logdate);
        return remove(log);
    }
    public int removeOfBodyAndAdminid(String body, String adminid) {
        Log log = new Log();
        log.setBody(body);
        log.setAdminid(adminid);
        return remove(log);
    }
    public int removeOfLogdateAndAdminid(String logdate, String adminid) {
        Log log = new Log();
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return remove(log);
    }
    public int removeOfLogidAndBodyAndLogdate(String logid, String body, String logdate) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setLogdate(logdate);
        return remove(log);
    }
    public int removeOfLogidAndBodyAndAdminid(String logid, String body, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setAdminid(adminid);
        return remove(log);
    }
    public int removeOfLogidAndLogdateAndAdminid(String logid, String logdate, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return remove(log);
    }
    public int removeOfBodyAndLogdateAndAdminid(String body, String logdate, String adminid) {
        Log log = new Log();
        log.setBody(body);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return remove(log);
    }
    public int removeOfLogidAndBodyAndLogdateAndAdminid(String logid, String body, String logdate, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return remove(log);
    }
    public int insert(Log log) {
        return DBMan.getInstance().insertWithoutThrow(log, "log");
    }
    public int insertOfLogid(String logid) {
        Log log = new Log();
        log.setLogid(logid);
        return insert(log);
    }
    public int insertOfBody(String body) {
        Log log = new Log();
        log.setBody(body);
        return insert(log);
    }
    public int insertOfLogdate(String logdate) {
        Log log = new Log();
        log.setLogdate(logdate);
        return insert(log);
    }
    public int insertOfAdminid(String adminid) {
        Log log = new Log();
        log.setAdminid(adminid);
        return insert(log);
    }
    public int insertOfLogidAndBody(String logid, String body) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        return insert(log);
    }
    public int insertOfLogidAndLogdate(String logid, String logdate) {
        Log log = new Log();
        log.setLogid(logid);
        log.setLogdate(logdate);
        return insert(log);
    }
    public int insertOfLogidAndAdminid(String logid, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setAdminid(adminid);
        return insert(log);
    }
    public int insertOfBodyAndLogdate(String body, String logdate) {
        Log log = new Log();
        log.setBody(body);
        log.setLogdate(logdate);
        return insert(log);
    }
    public int insertOfBodyAndAdminid(String body, String adminid) {
        Log log = new Log();
        log.setBody(body);
        log.setAdminid(adminid);
        return insert(log);
    }
    public int insertOfLogdateAndAdminid(String logdate, String adminid) {
        Log log = new Log();
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return insert(log);
    }
    public int insertOfLogidAndBodyAndLogdate(String logid, String body, String logdate) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setLogdate(logdate);
        return insert(log);
    }
    public int insertOfLogidAndBodyAndAdminid(String logid, String body, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setAdminid(adminid);
        return insert(log);
    }
    public int insertOfLogidAndLogdateAndAdminid(String logid, String logdate, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return insert(log);
    }
    public int insertOfBodyAndLogdateAndAdminid(String body, String logdate, String adminid) {
        Log log = new Log();
        log.setBody(body);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return insert(log);
    }
    public int insertOfLogidAndBodyAndLogdateAndAdminid(String logid, String body, String logdate, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return insert(log);
    }
    public Log getLog(Log log) {
        return DBMan.getInstance().queryByIdWithoutThrow(log, "log");
    }
    public Log getLogOfLogid(String logid) {
        Log log = new Log();
        log.setLogid(logid);
        return getLog(log);
    }
    public Log getLogOfBody(String body) {
        Log log = new Log();
        log.setBody(body);
        return getLog(log);
    }
    public Log getLogOfLogdate(String logdate) {
        Log log = new Log();
        log.setLogdate(logdate);
        return getLog(log);
    }
    public Log getLogOfAdminid(String adminid) {
        Log log = new Log();
        log.setAdminid(adminid);
        return getLog(log);
    }
    public Log getLogOfLogidAndBody(String logid, String body) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        return getLog(log);
    }
    public Log getLogOfLogidAndLogdate(String logid, String logdate) {
        Log log = new Log();
        log.setLogid(logid);
        log.setLogdate(logdate);
        return getLog(log);
    }
    public Log getLogOfLogidAndAdminid(String logid, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setAdminid(adminid);
        return getLog(log);
    }
    public Log getLogOfBodyAndLogdate(String body, String logdate) {
        Log log = new Log();
        log.setBody(body);
        log.setLogdate(logdate);
        return getLog(log);
    }
    public Log getLogOfBodyAndAdminid(String body, String adminid) {
        Log log = new Log();
        log.setBody(body);
        log.setAdminid(adminid);
        return getLog(log);
    }
    public Log getLogOfLogdateAndAdminid(String logdate, String adminid) {
        Log log = new Log();
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return getLog(log);
    }
    public Log getLogOfLogidAndBodyAndLogdate(String logid, String body, String logdate) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setLogdate(logdate);
        return getLog(log);
    }
    public Log getLogOfLogidAndBodyAndAdminid(String logid, String body, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setAdminid(adminid);
        return getLog(log);
    }
    public Log getLogOfLogidAndLogdateAndAdminid(String logid, String logdate, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return getLog(log);
    }
    public Log getLogOfBodyAndLogdateAndAdminid(String body, String logdate, String adminid) {
        Log log = new Log();
        log.setBody(body);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return getLog(log);
    }
    public Log getLogOfLogidAndBodyAndLogdateAndAdminid(String logid, String body, String logdate, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return getLog(log);
    }
    public List<Log> getLogs(Log log) {
        return DBMan.getInstance().queryWithoutThrow(log, "log");
    }
    public List<Log> getLogsOfLogid(String logid) {
        Log log = new Log();
        log.setLogid(logid);
        return getLogs(log);
    }
    public List<Log> getLogsOfBody(String body) {
        Log log = new Log();
        log.setBody(body);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogdate(String logdate) {
        Log log = new Log();
        log.setLogdate(logdate);
        return getLogs(log);
    }
    public List<Log> getLogsOfAdminid(String adminid) {
        Log log = new Log();
        log.setAdminid(adminid);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogidAndBody(String logid, String body) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogidAndLogdate(String logid, String logdate) {
        Log log = new Log();
        log.setLogid(logid);
        log.setLogdate(logdate);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogidAndAdminid(String logid, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setAdminid(adminid);
        return getLogs(log);
    }
    public List<Log> getLogsOfBodyAndLogdate(String body, String logdate) {
        Log log = new Log();
        log.setBody(body);
        log.setLogdate(logdate);
        return getLogs(log);
    }
    public List<Log> getLogsOfBodyAndAdminid(String body, String adminid) {
        Log log = new Log();
        log.setBody(body);
        log.setAdminid(adminid);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogdateAndAdminid(String logdate, String adminid) {
        Log log = new Log();
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogidAndBodyAndLogdate(String logid, String body, String logdate) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setLogdate(logdate);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogidAndBodyAndAdminid(String logid, String body, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setAdminid(adminid);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogidAndLogdateAndAdminid(String logid, String logdate, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return getLogs(log);
    }
    public List<Log> getLogsOfBodyAndLogdateAndAdminid(String body, String logdate, String adminid) {
        Log log = new Log();
        log.setBody(body);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return getLogs(log);
    }
    public List<Log> getLogsOfLogidAndBodyAndLogdateAndAdminid(String logid, String body, String logdate, String adminid) {
        Log log = new Log();
        log.setLogid(logid);
        log.setBody(body);
        log.setLogdate(logdate);
        log.setAdminid(adminid);
        return getLogs(log);
    }
}
