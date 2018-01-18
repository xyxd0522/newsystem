var postsData = require("../data/posts-data.js");
Page({

  /**
   * 页面的初始数据
   */
  data: {
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      posts_key:postsData.postList
    });
  },
  onPostTap:function(event){
    //currentTarget 点击组件即view 同时自定义变量会转换成小写
    var postId = event.currentTarget.dataset.postid;
    wx.navigateTo({
      url: 'post-detail/post-detail?id=' + postId
    })
  }
})