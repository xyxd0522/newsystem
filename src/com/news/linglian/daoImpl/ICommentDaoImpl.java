package com.news.linglian.daoImpl;

import java.util.List;

import com.news.linglian.entity.Comment;

import com.news.linglian.dao.ICommentDao;
import db.DBMan;

public class ICommentDaoImpl implements ICommentDao {
    public int update(Comment comment, Comment keyComment) {
        return DBMan.getInstance().updateNoSqlWithoutThrow(comment, keyComment, "newsystem");
    }
    public int updateOfCommentId(Comment comment, String commentId) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        return update(comment, kComment);
    }
    public int updateOfFid(Comment comment, String fid) {
        Comment kComment = new Comment();
        kComment.setFid(fid);
        return update(comment, kComment);
    }
    public int updateOfCids(Comment comment, String cids) {
        Comment kComment = new Comment();
        kComment.setCids(cids);
        return update(comment, kComment);
    }
    public int updateOfBody(Comment comment, String body) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfTime(Comment comment, String time) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfGood(Comment comment, String good) {
        Comment kComment = new Comment();
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfBad(Comment comment, String bad) {
        Comment kComment = new Comment();
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndFid(Comment comment, String commentId, String fid) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setFid(fid);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndCids(Comment comment, String commentId, String cids) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setCids(cids);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndBody(Comment comment, String commentId, String body) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndTime(Comment comment, String commentId, String time) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndGood(Comment comment, String commentId, String good) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfCommentIdAndBad(Comment comment, String commentId, String bad) {
        Comment kComment = new Comment();
        kComment.setCommentId(commentId);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfFidAndCids(Comment comment, String fid, String cids) {
        Comment kComment = new Comment();
        kComment.setFid(fid);
        kComment.setCids(cids);
        return update(comment, kComment);
    }
    public int updateOfFidAndBody(Comment comment, String fid, String body) {
        Comment kComment = new Comment();
        kComment.setFid(fid);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfFidAndTime(Comment comment, String fid, String time) {
        Comment kComment = new Comment();
        kComment.setFid(fid);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfFidAndGood(Comment comment, String fid, String good) {
        Comment kComment = new Comment();
        kComment.setFid(fid);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfFidAndBad(Comment comment, String fid, String bad) {
        Comment kComment = new Comment();
        kComment.setFid(fid);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfCidsAndBody(Comment comment, String cids, String body) {
        Comment kComment = new Comment();
        kComment.setCids(cids);
        kComment.setBody(body);
        return update(comment, kComment);
    }
    public int updateOfCidsAndTime(Comment comment, String cids, String time) {
        Comment kComment = new Comment();
        kComment.setCids(cids);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfCidsAndGood(Comment comment, String cids, String good) {
        Comment kComment = new Comment();
        kComment.setCids(cids);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfCidsAndBad(Comment comment, String cids, String bad) {
        Comment kComment = new Comment();
        kComment.setCids(cids);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfBodyAndTime(Comment comment, String body, String time) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setTime(time);
        return update(comment, kComment);
    }
    public int updateOfBodyAndGood(Comment comment, String body, String good) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfBodyAndBad(Comment comment, String body, String bad) {
        Comment kComment = new Comment();
        kComment.setBody(body);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfTimeAndGood(Comment comment, String time, String good) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        kComment.setGood(good);
        return update(comment, kComment);
    }
    public int updateOfTimeAndBad(Comment comment, String time, String bad) {
        Comment kComment = new Comment();
        kComment.setTime(time);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int updateOfGoodAndBad(Comment comment, String good, String bad) {
        Comment kComment = new Comment();
        kComment.setGood(good);
        kComment.setBad(bad);
        return update(comment, kComment);
    }
    public int remove(Comment comment) {
        return DBMan.getInstance().deleteNoSqlWithoutThrow(comment, "newsystem");
    }
    public int removeOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return remove(comment);
    }
    public int removeOfFid(String fid) {
        Comment comment = new Comment();
        comment.setFid(fid);
        return remove(comment);
    }
    public int removeOfCids(String cids) {
        Comment comment = new Comment();
        comment.setCids(cids);
        return remove(comment);
    }
    public int removeOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfGood(String good) {
        Comment comment = new Comment();
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfBad(String bad) {
        Comment comment = new Comment();
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfCommentIdAndFid(String commentId, String fid) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setFid(fid);
        return remove(comment);
    }
    public int removeOfCommentIdAndCids(String commentId, String cids) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCids(cids);
        return remove(comment);
    }
    public int removeOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfCommentIdAndGood(String commentId, String good) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfCommentIdAndBad(String commentId, String bad) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfFidAndCids(String fid, String cids) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setCids(cids);
        return remove(comment);
    }
    public int removeOfFidAndBody(String fid, String body) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfFidAndTime(String fid, String time) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfFidAndGood(String fid, String good) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfFidAndBad(String fid, String bad) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfCidsAndBody(String cids, String body) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setBody(body);
        return remove(comment);
    }
    public int removeOfCidsAndTime(String cids, String time) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfCidsAndGood(String cids, String good) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfCidsAndBad(String cids, String bad) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return remove(comment);
    }
    public int removeOfBodyAndGood(String body, String good) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfBodyAndBad(String body, String bad) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfTimeAndGood(String time, String good) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setGood(good);
        return remove(comment);
    }
    public int removeOfTimeAndBad(String time, String bad) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setBad(bad);
        return remove(comment);
    }
    public int removeOfGoodAndBad(String good, String bad) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setBad(bad);
        return remove(comment);
    }
    public int insert(Comment comment) {
        return DBMan.getInstance().insertNoSqlWithoutThrow(comment, "newsystem");
    }
    public int insertOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return insert(comment);
    }
    public int insertOfFid(String fid) {
        Comment comment = new Comment();
        comment.setFid(fid);
        return insert(comment);
    }
    public int insertOfCids(String cids) {
        Comment comment = new Comment();
        comment.setCids(cids);
        return insert(comment);
    }
    public int insertOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfGood(String good) {
        Comment comment = new Comment();
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfBad(String bad) {
        Comment comment = new Comment();
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfCommentIdAndFid(String commentId, String fid) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setFid(fid);
        return insert(comment);
    }
    public int insertOfCommentIdAndCids(String commentId, String cids) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCids(cids);
        return insert(comment);
    }
    public int insertOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfCommentIdAndGood(String commentId, String good) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfCommentIdAndBad(String commentId, String bad) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfFidAndCids(String fid, String cids) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setCids(cids);
        return insert(comment);
    }
    public int insertOfFidAndBody(String fid, String body) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfFidAndTime(String fid, String time) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfFidAndGood(String fid, String good) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfFidAndBad(String fid, String bad) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfCidsAndBody(String cids, String body) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setBody(body);
        return insert(comment);
    }
    public int insertOfCidsAndTime(String cids, String time) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfCidsAndGood(String cids, String good) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfCidsAndBad(String cids, String bad) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return insert(comment);
    }
    public int insertOfBodyAndGood(String body, String good) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfBodyAndBad(String body, String bad) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfTimeAndGood(String time, String good) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setGood(good);
        return insert(comment);
    }
    public int insertOfTimeAndBad(String time, String bad) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setBad(bad);
        return insert(comment);
    }
    public int insertOfGoodAndBad(String good, String bad) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setBad(bad);
        return insert(comment);
    }
    public Comment getComment(Comment comment) {
        return DBMan.getInstance().queryByIdNoSqlWithoutThrow(comment, "newsystem");
    }
    public Comment getCommentOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return getComment(comment);
    }
    public Comment getCommentOfFid(String fid) {
        Comment comment = new Comment();
        comment.setFid(fid);
        return getComment(comment);
    }
    public Comment getCommentOfCids(String cids) {
        Comment comment = new Comment();
        comment.setCids(cids);
        return getComment(comment);
    }
    public Comment getCommentOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfGood(String good) {
        Comment comment = new Comment();
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfBad(String bad) {
        Comment comment = new Comment();
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndFid(String commentId, String fid) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setFid(fid);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndCids(String commentId, String cids) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCids(cids);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndGood(String commentId, String good) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfCommentIdAndBad(String commentId, String bad) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfFidAndCids(String fid, String cids) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setCids(cids);
        return getComment(comment);
    }
    public Comment getCommentOfFidAndBody(String fid, String body) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfFidAndTime(String fid, String time) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfFidAndGood(String fid, String good) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfFidAndBad(String fid, String bad) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfCidsAndBody(String cids, String body) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setBody(body);
        return getComment(comment);
    }
    public Comment getCommentOfCidsAndTime(String cids, String time) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfCidsAndGood(String cids, String good) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfCidsAndBad(String cids, String bad) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndGood(String body, String good) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfBodyAndBad(String body, String bad) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfTimeAndGood(String time, String good) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setGood(good);
        return getComment(comment);
    }
    public Comment getCommentOfTimeAndBad(String time, String bad) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setBad(bad);
        return getComment(comment);
    }
    public Comment getCommentOfGoodAndBad(String good, String bad) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setBad(bad);
        return getComment(comment);
    }
    public List<Comment> getComments(Comment comment) {
        return DBMan.getInstance().queryNoSqlWithoutThrow(comment, "newsystem");
    }
    public List<Comment> getCommentsOfCommentId(String commentId) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfFid(String fid) {
        Comment comment = new Comment();
        comment.setFid(fid);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCids(String cids) {
        Comment comment = new Comment();
        comment.setCids(cids);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBody(String body) {
        Comment comment = new Comment();
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTime(String time) {
        Comment comment = new Comment();
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfGood(String good) {
        Comment comment = new Comment();
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBad(String bad) {
        Comment comment = new Comment();
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndFid(String commentId, String fid) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setFid(fid);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndCids(String commentId, String cids) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setCids(cids);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndBody(String commentId, String body) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndTime(String commentId, String time) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndGood(String commentId, String good) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCommentIdAndBad(String commentId, String bad) {
        Comment comment = new Comment();
        comment.setCommentId(commentId);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfFidAndCids(String fid, String cids) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setCids(cids);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfFidAndBody(String fid, String body) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfFidAndTime(String fid, String time) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfFidAndGood(String fid, String good) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfFidAndBad(String fid, String bad) {
        Comment comment = new Comment();
        comment.setFid(fid);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCidsAndBody(String cids, String body) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setBody(body);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCidsAndTime(String cids, String time) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCidsAndGood(String cids, String good) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfCidsAndBad(String cids, String bad) {
        Comment comment = new Comment();
        comment.setCids(cids);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndTime(String body, String time) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setTime(time);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndGood(String body, String good) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfBodyAndBad(String body, String bad) {
        Comment comment = new Comment();
        comment.setBody(body);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTimeAndGood(String time, String good) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setGood(good);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfTimeAndBad(String time, String bad) {
        Comment comment = new Comment();
        comment.setTime(time);
        comment.setBad(bad);
        return getComments(comment);
    }
    public List<Comment> getCommentsOfGoodAndBad(String good, String bad) {
        Comment comment = new Comment();
        comment.setGood(good);
        comment.setBad(bad);
        return getComments(comment);
    }
}
