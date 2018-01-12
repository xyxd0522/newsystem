<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>404 - Fly社区</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <meta name="keywords" content="fly,layui,前端社区">
  <meta name="description" content="Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力">
  <link rel = "stylesheet" type = "text/css" href = "../comm/layui/css/layui.css"/>
  <link rel = "stylesheet" type = "text/css" href = "../comm/layui/global.css"/>
</head>
<body>

<div class="fly-header layui-bg-black">
  <div class="layui-container">
    <a class="fly-logo" href="/">
      <img src="../img/logo.png" style="height: 29px;" alt="layui">
    </a>
    
    <ul class="layui-nav fly-nav-user">
      
      <!-- 未登入的状态 -->
      <li class="layui-nav-item">
        <a class="iconfont icon-touxiang layui-hide-xs" href="../user/login.jsp"></a>
      </li>
      <li class="layui-nav-item">
        <a href="../user/login.jsp">登入</a>
      </li>
      <li class="layui-nav-item">
        <a href="../user/reg.jsp">注册</a>
      </li>
      <li class="layui-nav-item layui-hide-xs">
        <a href="" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" title="QQ登入" class="iconfont icon-qq"></a>
      </li>
      <li class="layui-nav-item layui-hide-xs">
        <a href="" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" title="微博登入" class="iconfont icon-weibo"></a>
      </li>
    </ul>
  </div>
</div>


<div class="layui-container fly-marginTop">
	<div class="fly-panel">
	  <div class="fly-none">
	    <h2><i class="iconfont icon-404"></i></h2>
	    <p>页面或者数据被<a href="http://fly.layui.com/u/336" target="_blank"> 纸飞机 </a>运到火星了，啥都看不到了…</p>
	  </div>
	</div>
</div>

<div class="fly-footer">
  <p><a href="https://github.com/xyxd0522" target="_blank">SunnyNews</a> 2018 &copy; <a href="https://github.com/xyxd0522" target="_blank">向阳出品</a></p>
  <p>
    <a href="https://github.com/xyxd0522" target="_blank">微信公众号</a>
  </p>
</div>


    
</body>
</html>