package com.news.linglian.serviceImpl;

import java.util.List;

import com.news.linglian.entity.Comment;

import com.news.linglian.dao.ICommentDao;
import com.news.linglian.daoImpl.ICommentDaoImpl;
import com.news.linglian.service.ICommentService;

public class ICommentServiceImpl implements ICommentService {
	ICommentDao dao = null;

	public ICommentServiceImpl() {
		dao = new ICommentDaoImpl();
	}
    public int update(Comment comment, Comment keyComment) {
        return dao.update(comment, keyComment);
    }
    public int updateOfCommentId(Comment comment, String commentId) {
        return dao.updateOfCommentId(comment, commentId);
    }
    public int updateOfFid(Comment comment, String fid) {
        return dao.updateOfFid(comment, fid);
    }
    public int updateOfCids(Comment comment, String cids) {
        return dao.updateOfCids(comment, cids);
    }
    public int updateOfBody(Comment comment, String body) {
        return dao.updateOfBody(comment, body);
    }
    public int updateOfTime(Comment comment, String time) {
        return dao.updateOfTime(comment, time);
    }
    public int updateOfGood(Comment comment, String good) {
        return dao.updateOfGood(comment, good);
    }
    public int updateOfBad(Comment comment, String bad) {
        return dao.updateOfBad(comment, bad);
    }
    public int updateOfCommentIdAndFid(Comment comment, String commentId, String fid) {
        return dao.updateOfCommentIdAndFid(comment, commentId, fid);
    }
    public int updateOfCommentIdAndCids(Comment comment, String commentId, String cids) {
        return dao.updateOfCommentIdAndCids(comment, commentId, cids);
    }
    public int updateOfCommentIdAndBody(Comment comment, String commentId, String body) {
        return dao.updateOfCommentIdAndBody(comment, commentId, body);
    }
    public int updateOfCommentIdAndTime(Comment comment, String commentId, String time) {
        return dao.updateOfCommentIdAndTime(comment, commentId, time);
    }
    public int updateOfCommentIdAndGood(Comment comment, String commentId, String good) {
        return dao.updateOfCommentIdAndGood(comment, commentId, good);
    }
    public int updateOfCommentIdAndBad(Comment comment, String commentId, String bad) {
        return dao.updateOfCommentIdAndBad(comment, commentId, bad);
    }
    public int updateOfFidAndCids(Comment comment, String fid, String cids) {
        return dao.updateOfFidAndCids(comment, fid, cids);
    }
    public int updateOfFidAndBody(Comment comment, String fid, String body) {
        return dao.updateOfFidAndBody(comment, fid, body);
    }
    public int updateOfFidAndTime(Comment comment, String fid, String time) {
        return dao.updateOfFidAndTime(comment, fid, time);
    }
    public int updateOfFidAndGood(Comment comment, String fid, String good) {
        return dao.updateOfFidAndGood(comment, fid, good);
    }
    public int updateOfFidAndBad(Comment comment, String fid, String bad) {
        return dao.updateOfFidAndBad(comment, fid, bad);
    }
    public int updateOfCidsAndBody(Comment comment, String cids, String body) {
        return dao.updateOfCidsAndBody(comment, cids, body);
    }
    public int updateOfCidsAndTime(Comment comment, String cids, String time) {
        return dao.updateOfCidsAndTime(comment, cids, time);
    }
    public int updateOfCidsAndGood(Comment comment, String cids, String good) {
        return dao.updateOfCidsAndGood(comment, cids, good);
    }
    public int updateOfCidsAndBad(Comment comment, String cids, String bad) {
        return dao.updateOfCidsAndBad(comment, cids, bad);
    }
    public int updateOfBodyAndTime(Comment comment, String body, String time) {
        return dao.updateOfBodyAndTime(comment, body, time);
    }
    public int updateOfBodyAndGood(Comment comment, String body, String good) {
        return dao.updateOfBodyAndGood(comment, body, good);
    }
    public int updateOfBodyAndBad(Comment comment, String body, String bad) {
        return dao.updateOfBodyAndBad(comment, body, bad);
    }
    public int updateOfTimeAndGood(Comment comment, String time, String good) {
        return dao.updateOfTimeAndGood(comment, time, good);
    }
    public int updateOfTimeAndBad(Comment comment, String time, String bad) {
        return dao.updateOfTimeAndBad(comment, time, bad);
    }
    public int updateOfGoodAndBad(Comment comment, String good, String bad) {
        return dao.updateOfGoodAndBad(comment, good, bad);
    }
    public int remove(Comment comment) {
        return dao.remove(comment);
    }
    public int removeOfCommentId(String commentId) {
        return dao.removeOfCommentId(commentId);
    }
    public int removeOfFid(String fid) {
        return dao.removeOfFid(fid);
    }
    public int removeOfCids(String cids) {
        return dao.removeOfCids(cids);
    }
    public int removeOfBody(String body) {
        return dao.removeOfBody(body);
    }
    public int removeOfTime(String time) {
        return dao.removeOfTime(time);
    }
    public int removeOfGood(String good) {
        return dao.removeOfGood(good);
    }
    public int removeOfBad(String bad) {
        return dao.removeOfBad(bad);
    }
    public int removeOfCommentIdAndFid(String commentId, String fid) {
        return dao.removeOfCommentIdAndFid(commentId, fid);
    }
    public int removeOfCommentIdAndCids(String commentId, String cids) {
        return dao.removeOfCommentIdAndCids(commentId, cids);
    }
    public int removeOfCommentIdAndBody(String commentId, String body) {
        return dao.removeOfCommentIdAndBody(commentId, body);
    }
    public int removeOfCommentIdAndTime(String commentId, String time) {
        return dao.removeOfCommentIdAndTime(commentId, time);
    }
    public int removeOfCommentIdAndGood(String commentId, String good) {
        return dao.removeOfCommentIdAndGood(commentId, good);
    }
    public int removeOfCommentIdAndBad(String commentId, String bad) {
        return dao.removeOfCommentIdAndBad(commentId, bad);
    }
    public int removeOfFidAndCids(String fid, String cids) {
        return dao.removeOfFidAndCids(fid, cids);
    }
    public int removeOfFidAndBody(String fid, String body) {
        return dao.removeOfFidAndBody(fid, body);
    }
    public int removeOfFidAndTime(String fid, String time) {
        return dao.removeOfFidAndTime(fid, time);
    }
    public int removeOfFidAndGood(String fid, String good) {
        return dao.removeOfFidAndGood(fid, good);
    }
    public int removeOfFidAndBad(String fid, String bad) {
        return dao.removeOfFidAndBad(fid, bad);
    }
    public int removeOfCidsAndBody(String cids, String body) {
        return dao.removeOfCidsAndBody(cids, body);
    }
    public int removeOfCidsAndTime(String cids, String time) {
        return dao.removeOfCidsAndTime(cids, time);
    }
    public int removeOfCidsAndGood(String cids, String good) {
        return dao.removeOfCidsAndGood(cids, good);
    }
    public int removeOfCidsAndBad(String cids, String bad) {
        return dao.removeOfCidsAndBad(cids, bad);
    }
    public int removeOfBodyAndTime(String body, String time) {
        return dao.removeOfBodyAndTime(body, time);
    }
    public int removeOfBodyAndGood(String body, String good) {
        return dao.removeOfBodyAndGood(body, good);
    }
    public int removeOfBodyAndBad(String body, String bad) {
        return dao.removeOfBodyAndBad(body, bad);
    }
    public int removeOfTimeAndGood(String time, String good) {
        return dao.removeOfTimeAndGood(time, good);
    }
    public int removeOfTimeAndBad(String time, String bad) {
        return dao.removeOfTimeAndBad(time, bad);
    }
    public int removeOfGoodAndBad(String good, String bad) {
        return dao.removeOfGoodAndBad(good, bad);
    }
    public int insert(Comment comment) {
        return dao.insert(comment);
    }
    public int insertOfCommentId(String commentId) {
        return dao.insertOfCommentId(commentId);
    }
    public int insertOfFid(String fid) {
        return dao.insertOfFid(fid);
    }
    public int insertOfCids(String cids) {
        return dao.insertOfCids(cids);
    }
    public int insertOfBody(String body) {
        return dao.insertOfBody(body);
    }
    public int insertOfTime(String time) {
        return dao.insertOfTime(time);
    }
    public int insertOfGood(String good) {
        return dao.insertOfGood(good);
    }
    public int insertOfBad(String bad) {
        return dao.insertOfBad(bad);
    }
    public int insertOfCommentIdAndFid(String commentId, String fid) {
        return dao.insertOfCommentIdAndFid(commentId, fid);
    }
    public int insertOfCommentIdAndCids(String commentId, String cids) {
        return dao.insertOfCommentIdAndCids(commentId, cids);
    }
    public int insertOfCommentIdAndBody(String commentId, String body) {
        return dao.insertOfCommentIdAndBody(commentId, body);
    }
    public int insertOfCommentIdAndTime(String commentId, String time) {
        return dao.insertOfCommentIdAndTime(commentId, time);
    }
    public int insertOfCommentIdAndGood(String commentId, String good) {
        return dao.insertOfCommentIdAndGood(commentId, good);
    }
    public int insertOfCommentIdAndBad(String commentId, String bad) {
        return dao.insertOfCommentIdAndBad(commentId, bad);
    }
    public int insertOfFidAndCids(String fid, String cids) {
        return dao.insertOfFidAndCids(fid, cids);
    }
    public int insertOfFidAndBody(String fid, String body) {
        return dao.insertOfFidAndBody(fid, body);
    }
    public int insertOfFidAndTime(String fid, String time) {
        return dao.insertOfFidAndTime(fid, time);
    }
    public int insertOfFidAndGood(String fid, String good) {
        return dao.insertOfFidAndGood(fid, good);
    }
    public int insertOfFidAndBad(String fid, String bad) {
        return dao.insertOfFidAndBad(fid, bad);
    }
    public int insertOfCidsAndBody(String cids, String body) {
        return dao.insertOfCidsAndBody(cids, body);
    }
    public int insertOfCidsAndTime(String cids, String time) {
        return dao.insertOfCidsAndTime(cids, time);
    }
    public int insertOfCidsAndGood(String cids, String good) {
        return dao.insertOfCidsAndGood(cids, good);
    }
    public int insertOfCidsAndBad(String cids, String bad) {
        return dao.insertOfCidsAndBad(cids, bad);
    }
    public int insertOfBodyAndTime(String body, String time) {
        return dao.insertOfBodyAndTime(body, time);
    }
    public int insertOfBodyAndGood(String body, String good) {
        return dao.insertOfBodyAndGood(body, good);
    }
    public int insertOfBodyAndBad(String body, String bad) {
        return dao.insertOfBodyAndBad(body, bad);
    }
    public int insertOfTimeAndGood(String time, String good) {
        return dao.insertOfTimeAndGood(time, good);
    }
    public int insertOfTimeAndBad(String time, String bad) {
        return dao.insertOfTimeAndBad(time, bad);
    }
    public int insertOfGoodAndBad(String good, String bad) {
        return dao.insertOfGoodAndBad(good, bad);
    }
    public Comment getComment(Comment comment) {
        return dao.getComment(comment);
    }
    public Comment getCommentOfCommentId(String commentId) {
        return dao.getCommentOfCommentId(commentId);
    }
    public Comment getCommentOfFid(String fid) {
        return dao.getCommentOfFid(fid);
    }
    public Comment getCommentOfCids(String cids) {
        return dao.getCommentOfCids(cids);
    }
    public Comment getCommentOfBody(String body) {
        return dao.getCommentOfBody(body);
    }
    public Comment getCommentOfTime(String time) {
        return dao.getCommentOfTime(time);
    }
    public Comment getCommentOfGood(String good) {
        return dao.getCommentOfGood(good);
    }
    public Comment getCommentOfBad(String bad) {
        return dao.getCommentOfBad(bad);
    }
    public Comment getCommentOfCommentIdAndFid(String commentId, String fid) {
        return dao.getCommentOfCommentIdAndFid(commentId, fid);
    }
    public Comment getCommentOfCommentIdAndCids(String commentId, String cids) {
        return dao.getCommentOfCommentIdAndCids(commentId, cids);
    }
    public Comment getCommentOfCommentIdAndBody(String commentId, String body) {
        return dao.getCommentOfCommentIdAndBody(commentId, body);
    }
    public Comment getCommentOfCommentIdAndTime(String commentId, String time) {
        return dao.getCommentOfCommentIdAndTime(commentId, time);
    }
    public Comment getCommentOfCommentIdAndGood(String commentId, String good) {
        return dao.getCommentOfCommentIdAndGood(commentId, good);
    }
    public Comment getCommentOfCommentIdAndBad(String commentId, String bad) {
        return dao.getCommentOfCommentIdAndBad(commentId, bad);
    }
    public Comment getCommentOfFidAndCids(String fid, String cids) {
        return dao.getCommentOfFidAndCids(fid, cids);
    }
    public Comment getCommentOfFidAndBody(String fid, String body) {
        return dao.getCommentOfFidAndBody(fid, body);
    }
    public Comment getCommentOfFidAndTime(String fid, String time) {
        return dao.getCommentOfFidAndTime(fid, time);
    }
    public Comment getCommentOfFidAndGood(String fid, String good) {
        return dao.getCommentOfFidAndGood(fid, good);
    }
    public Comment getCommentOfFidAndBad(String fid, String bad) {
        return dao.getCommentOfFidAndBad(fid, bad);
    }
    public Comment getCommentOfCidsAndBody(String cids, String body) {
        return dao.getCommentOfCidsAndBody(cids, body);
    }
    public Comment getCommentOfCidsAndTime(String cids, String time) {
        return dao.getCommentOfCidsAndTime(cids, time);
    }
    public Comment getCommentOfCidsAndGood(String cids, String good) {
        return dao.getCommentOfCidsAndGood(cids, good);
    }
    public Comment getCommentOfCidsAndBad(String cids, String bad) {
        return dao.getCommentOfCidsAndBad(cids, bad);
    }
    public Comment getCommentOfBodyAndTime(String body, String time) {
        return dao.getCommentOfBodyAndTime(body, time);
    }
    public Comment getCommentOfBodyAndGood(String body, String good) {
        return dao.getCommentOfBodyAndGood(body, good);
    }
    public Comment getCommentOfBodyAndBad(String body, String bad) {
        return dao.getCommentOfBodyAndBad(body, bad);
    }
    public Comment getCommentOfTimeAndGood(String time, String good) {
        return dao.getCommentOfTimeAndGood(time, good);
    }
    public Comment getCommentOfTimeAndBad(String time, String bad) {
        return dao.getCommentOfTimeAndBad(time, bad);
    }
    public Comment getCommentOfGoodAndBad(String good, String bad) {
        return dao.getCommentOfGoodAndBad(good, bad);
    }
    public List<Comment> getComments(Comment comment) {
        return dao.getComments(comment);
    }
    public List<Comment> getCommentsOfCommentId(String commentId) {
        return dao.getCommentsOfCommentId(commentId);
    }
    public List<Comment> getCommentsOfFid(String fid) {
        return dao.getCommentsOfFid(fid);
    }
    public List<Comment> getCommentsOfCids(String cids) {
        return dao.getCommentsOfCids(cids);
    }
    public List<Comment> getCommentsOfBody(String body) {
        return dao.getCommentsOfBody(body);
    }
    public List<Comment> getCommentsOfTime(String time) {
        return dao.getCommentsOfTime(time);
    }
    public List<Comment> getCommentsOfGood(String good) {
        return dao.getCommentsOfGood(good);
    }
    public List<Comment> getCommentsOfBad(String bad) {
        return dao.getCommentsOfBad(bad);
    }
    public List<Comment> getCommentsOfCommentIdAndFid(String commentId, String fid) {
        return dao.getCommentsOfCommentIdAndFid(commentId, fid);
    }
    public List<Comment> getCommentsOfCommentIdAndCids(String commentId, String cids) {
        return dao.getCommentsOfCommentIdAndCids(commentId, cids);
    }
    public List<Comment> getCommentsOfCommentIdAndBody(String commentId, String body) {
        return dao.getCommentsOfCommentIdAndBody(commentId, body);
    }
    public List<Comment> getCommentsOfCommentIdAndTime(String commentId, String time) {
        return dao.getCommentsOfCommentIdAndTime(commentId, time);
    }
    public List<Comment> getCommentsOfCommentIdAndGood(String commentId, String good) {
        return dao.getCommentsOfCommentIdAndGood(commentId, good);
    }
    public List<Comment> getCommentsOfCommentIdAndBad(String commentId, String bad) {
        return dao.getCommentsOfCommentIdAndBad(commentId, bad);
    }
    public List<Comment> getCommentsOfFidAndCids(String fid, String cids) {
        return dao.getCommentsOfFidAndCids(fid, cids);
    }
    public List<Comment> getCommentsOfFidAndBody(String fid, String body) {
        return dao.getCommentsOfFidAndBody(fid, body);
    }
    public List<Comment> getCommentsOfFidAndTime(String fid, String time) {
        return dao.getCommentsOfFidAndTime(fid, time);
    }
    public List<Comment> getCommentsOfFidAndGood(String fid, String good) {
        return dao.getCommentsOfFidAndGood(fid, good);
    }
    public List<Comment> getCommentsOfFidAndBad(String fid, String bad) {
        return dao.getCommentsOfFidAndBad(fid, bad);
    }
    public List<Comment> getCommentsOfCidsAndBody(String cids, String body) {
        return dao.getCommentsOfCidsAndBody(cids, body);
    }
    public List<Comment> getCommentsOfCidsAndTime(String cids, String time) {
        return dao.getCommentsOfCidsAndTime(cids, time);
    }
    public List<Comment> getCommentsOfCidsAndGood(String cids, String good) {
        return dao.getCommentsOfCidsAndGood(cids, good);
    }
    public List<Comment> getCommentsOfCidsAndBad(String cids, String bad) {
        return dao.getCommentsOfCidsAndBad(cids, bad);
    }
    public List<Comment> getCommentsOfBodyAndTime(String body, String time) {
        return dao.getCommentsOfBodyAndTime(body, time);
    }
    public List<Comment> getCommentsOfBodyAndGood(String body, String good) {
        return dao.getCommentsOfBodyAndGood(body, good);
    }
    public List<Comment> getCommentsOfBodyAndBad(String body, String bad) {
        return dao.getCommentsOfBodyAndBad(body, bad);
    }
    public List<Comment> getCommentsOfTimeAndGood(String time, String good) {
        return dao.getCommentsOfTimeAndGood(time, good);
    }
    public List<Comment> getCommentsOfTimeAndBad(String time, String bad) {
        return dao.getCommentsOfTimeAndBad(time, bad);
    }
    public List<Comment> getCommentsOfGoodAndBad(String good, String bad) {
        return dao.getCommentsOfGoodAndBad(good, bad);
    }
}
