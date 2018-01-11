package com.news.linglian.entity;

public class Log {
    private String logid;
    private String body;
    private String logdate;
    private String adminid;

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getLogdate() {
        return logdate;
    }

    public void setLogdate(String logdate) {
        this.logdate = logdate;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    @Override
    public String toString() {
        return "Log [logid=" + logid + ", body=" + body + ", logdate=" + logdate + ", adminid=" + adminid + ", ]";
    }

}
