<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>我的消息</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="keywords" content="SunnyNews">
  <meta name="description" content="SunnyNews 向阳小队旗舰之作">
  <link rel="stylesheet" type="text/css" href="../comm/layui/css/layui.css" />
  <link rel="stylesheet" type="text/css" href="../comm/layui/global.css" />
  <link rel="stylesheet" type="text/css" href="../comm/layui/css/modules/layer/default/layer.css" />
  <script src="../comm/layui/layui.js" charset="utf-8"></script>
  <script src="../comm/layer/layer.js"></script>
  <script src="../comm/jquery/jquery-2.1.4.js"></script>
</head>
<body>

<div class="fly-header layui-bg-black">
  <div class="layui-container">
    <a class="fly-logo" href="/">
      <img src="../img/logo.png" style="height: 29px;padding-left:-10px;" alt="logo">
    </a>
    <ul class="layui-nav fly-nav layui-hide-xs">
      <li class="layui-nav-item layui-this">
        <a href="message.jsp"><i class="iconfont icon-jiaoliu"></i>通知</a>
      </li>
      <li class="layui-nav-item">
        <a href="index.jsp"><i class="layui-icon">&#xe705;</i>我发布的</a>
      </li>
      <li class="layui-nav-item">
        <a href="../news/newsPost.jsp" target="_blank"><i class="layui-icon">&#xe609;</i>写新闻</a>
      </li>
    </ul>
    
    <ul class="layui-nav fly-nav-user">
      
      <!-- 未登入的状态 -->
      <!--<li class="layui-nav-item">
        <a class="iconfont icon-touxiang layui-hide-xs" href="login.jsp"></a>
      </li>
      <li class="layui-nav-item">
        <a href="login.jsp">登入</a>
      </li>
      <li class="layui-nav-item">
        <a href="reg.jsp">注册</a>
      </li>
      <li class="layui-nav-item layui-hide-xs">
        <a href="/app/qq/" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" title="QQ登入" class="iconfont icon-qq"></a>
      </li>
      <li class="layui-nav-item layui-hide-xs">
        <a href="/app/weibo/" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" title="微博登入" class="iconfont icon-weibo"></a>
      </li>-->
      
      <!-- 登入后的状态 -->
     
      <li class="layui-nav-item">
        <a class="fly-nav-avatar" href="javascript:;">
          <cite class="layui-hide-xs">小彭</cite>
          <i class="iconfont icon-renzheng layui-hide-xs" title="认证信息：layui 作者"></i>
          <i class="layui-badge fly-badge-vip layui-hide-xs">VIP3</i>
          <img src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg">
        </a>
        <dl class="layui-nav-child">
          <dd><a href="set.jsp"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>
          <dd><a href="message.jsp"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>
          <dd><a href="home.jsp"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
          <hr style="margin: 5px 0;">
          <dd><a href="../user/logout/" style="text-align: center;">退出</a></dd>
        </dl>
      </li>  
    </ul>
  </div>
</div>

<ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
  <li class="layui-nav-item">
    <a href="home.jsp">
      <i class="layui-icon">&#xe609;</i>
      我的主页
    </a>
  </li>
  <li class="layui-nav-item ">
    <a href="index.jsp">
      <i class="layui-icon">&#xe612;</i>
      用户中心
    </a>
  </li>
  <li class="layui-nav-item ">
    <a href="set.jsp">
      <i class="layui-icon">&#xe620;</i>
      基本设置
    </a>
  </li>
  <li class="layui-nav-item layui-this">
    <a href="message.jsp">
      <i class="layui-icon">&#xe611;</i>
      我的消息
    </a>
  </li>
</ul>

<div class="site-tree-mobile layui-hide">
  <i class="layui-icon">&#xe602;</i>
</div>
<div class="site-mobile-shade"></div>

<div class="site-tree-mobile layui-hide">
  <i class="layui-icon">&#xe602;</i>
</div>
<div class="site-mobile-shade"></div>
  
  
  <div class="fly-panel fly-panel-user" pad20>
	  <div class="layui-tab layui-tab-brief" lay-filter="user" id="LAY_msg" style="margin-top: 15px;">
	    <button class="layui-btn layui-btn-danger" id="LAY_delallmsg">清空全部消息</button>
	    <div  id="LAY_minemsg" style="margin-top: 10px;">
        <!--<div class="fly-none">您暂时没有最新消息</div>-->
        <ul class="mine-msg">
          <li data-id="123">
            <blockquote class="layui-elem-quote">
              <a href="/jump?username=Absolutely" target="_blank"><cite>Absolutely</cite></a>回答了您的求解<a target="_blank" href=""><cite>鹿晗和关晓彤在一起了？</cite></a>
            </blockquote>
            <p><span>1小时前</span><a href="javascript:;" class="layui-btn layui-btn-small layui-btn-danger fly-delete">删除</a></p>
          </li>
          <li data-id="123">
            <blockquote class="layui-elem-quote">
              系统消息：欢迎使用 SunnyNews
            </blockquote>
            <p><span>1小时前</span><a href="javascript:;" class="layui-btn layui-btn-small layui-btn-danger fly-delete">删除</a></p>
          </li>
        </ul>
      </div>
	  </div>
	</div>

</div>


<div class="fly-footer">
  <p><a href="https://github.com/xyxd0522" target="_blank">SunnyNews</a> 2018 &copy; <a href="https://github.com/xyxd0522" target="_blank">向阳出品</a></p>
  <p>
    <a href="https://github.com/xyxd0522" target="_blank">微信公众号</a>
  </p>
</div>

<script src="../comm/layui/layui.js"></script>
<script>
layui.cache.page = '';
layui.cache.user = {
  username: '游客'
  ,uid: -1
  ,avatar: '../img/logo.jpg'
  ,experience: 83
  ,sex: '男'
};
layui.config({
  version: "3.0.0"
  ,base: '../comm/mods/'
}).extend({
  fly: 'index'
}).use(['fly', 'face'], function(){
  var $ = layui.$
  ,fly = layui.fly;
  //如果你是采用模版自带的编辑器，你需要开启以下语句来解析。
  
  $('.detail-body').each(function(){
    var othis = $(this), html = othis.html();
    othis.html(fly.content(html));
  });
 
});
</script>

</body>
</html>