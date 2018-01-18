var postsData = require("../../data/posts-data.js");
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
    var postId = options.id;
    var postData = postsData.postList[postId];
    this.setData({
      //用:进行赋值
      postData:postData
    });
  },
  onCamera:function(){
    // 只允许从相机扫码
    wx.scanCode({
      onlyFromCamera: true,
      success: (res) => {
        console.log(res);
        wx.request({
          url: res,
          data: {
            x: '',
            y: ''
          },
          header: {
            'content-type': 'application/json' // 默认值
          },
          success: function (res) {
            console.log(res.data)
          }
        })
      }
    })
  },
  
})