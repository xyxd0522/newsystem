Page({
  onTap:function(){
    // wx.navigateTo({
    //   url: '../posts/posts',
    // });从父级跳子级，只有5级
    
    wx.redirectTo({
      url: '../posts/posts',
    })
  }
}) 