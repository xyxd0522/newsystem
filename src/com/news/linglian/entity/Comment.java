package com.news.linglian.entity;

public class Comment {
    private String commentId;
    private String fid;
    private String cids;
    private String body;
    private String time;
    private String good;
    private String bad;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getCids() {
        return cids;
    }

    public void setCids(String cids) {
        this.cids = cids;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    @Override
    public String toString() {
        return "Comment [commentId=" + commentId + ", fid=" + fid + ", cids=" + cids + ", body=" + body + ", time=" + time + ", good=" + good + ", bad=" + bad + ", ]";
    }

}
