<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>激活邮箱</title>
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

<div class="fly-header layui-bg-black" >
  <div class="layui-container">
    <a class="fly-logo" href="/">
      <img src="../img/logo.png" style="height: 29px;padding-left:-10px;" alt="logo">
    </a>
    <ul class="layui-nav fly-nav layui-hide-xs">
      <li class="layui-nav-item layui-this">
        <a href=""><i class="iconfont icon-jiaoliu"></i>通知</a>
      </li>
      <li class="layui-nav-item">
        <a href=""><i class="layui-icon">&#xe705;</i>我发布的</a>
      </li>
      <li class="layui-nav-item">
        <a href="" target="_blank"><i class="layui-icon">&#xe609;</i>写新闻</a>
      </li>
    </ul>
    
    <ul class="layui-nav fly-nav-user">
      
      <!-- 未登入的状态 -->
      <!--<li class="layui-nav-item">
        <a class="iconfont icon-touxiang layui-hide-xs" href="../user/login.jsp"></a>
      </li>
      <li class="layui-nav-item">
        <a href="../user/login.jsp">登入</a>
      </li>
      <li class="layui-nav-item">
        <a href="../user/reg.jsp">注册</a>
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
          <dd><a href="../user/set.jsp"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>
          <dd><a href="../user/message.jsp"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>
          <dd><a href="../user/home.jsp"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
          <hr style="margin: 5px 0;">
          <dd><a href="../user/logout/" style="text-align: center;">退出</a></dd>
        </dl>
      </li>  
    </ul>
  </div>
</div>

<div class="layui-container fly-marginTop fly-user-main">
  <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
    <li class="layui-nav-item">
      <a href="home.html">
        <i class="layui-icon">&#xe609;</i>
        我的主页
      </a>
    </li>
    <li class="layui-nav-item layui-this">
      <a href="index.html">
        <i class="layui-icon">&#xe612;</i>
        用户中心
      </a>
    </li>
    <li class="layui-nav-item">
      <a href="set.html">
        <i class="layui-icon">&#xe620;</i>
        基本设置
      </a>
    </li>
    <li class="layui-nav-item">
      <a href="message.html">
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
  
  <div class="fly-panel fly-panel-user" pad20 >
    <div class="layui-tab layui-tab-brief" lay-filter="user" >
      <ul class="layui-tab-title">
        <li class="layui-this">
          激活邮箱
        </li>
      </ul>
      <div class="layui-tab-content" id="LAY_ucm" style="padding: 20px 0;">
        <ul class="layui-form">
          <li class="layui-form-li">
            <label for="activate">您的邮箱：</label>
            <span class="layui-form-text">xx@xx.com
              <!-- <em style="color:#999;">（已成功激活）</em> -->
              <em style="color:#c00;">（尚未激活）</em>
            </span>
          </li>
          <li class="layui-form-li" style="margin-top: 20px; line-height: 26px;">
            <div>
              1. 如果您未收到邮件，或激活链接失效，您可以
              <a class="layui-form-a" style="color:#4f99cf;" id="LAY-activate" href="javascript:;" email="{{user.email}}">重新发送邮件</a>，或者
              <a class="layui-form-a" style="color:#4f99cf;" href="set.html">更换邮箱</a>；
            </div>
            <div>
              2. 如果您始终没有收到 SunnyNews 发送的邮件，请注意查看您邮箱中的垃圾邮件；
            </div>
            <div>
              3. 如果你实在无法激活邮件，您还可以联系：linglian@aliyun.com
            </div>
          </li>
        </ul>
      </div>
    </div>
  </div>
  
</div>

<div class="fly-footer">
  <p><a href="http://fly.layui.com/" target="_blank">SunnyNews</a> 2018 &copy; <a href="http://www.layui.com/" target="_blank">向阳出品</a></p>
  <p>
    <a href="http://fly.layui.com/jie/2461/" target="_blank">微信公众号</a>
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