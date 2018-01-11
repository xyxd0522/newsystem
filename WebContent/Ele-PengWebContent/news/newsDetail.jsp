<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>新闻详情</title>
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
        <a class="iconfont icon-touxiang layui-hide-xs" href="user/login.html"></a>
      </li>
      <li class="layui-nav-item">
        <a href="user/login.html">登入</a>
      </li>
      <li class="layui-nav-item">
        <a href="user/reg.html">注册</a>
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
          <dd><a href="user/set.html"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>
          <dd><a href="user/message.html"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>
          <dd><a href="user/home.html"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>
          <hr style="margin: 5px 0;">
          <dd><a href="/user/logout/" style="text-align: center;">退出</a></dd>
        </dl>
      </li>  
    </ul>
  </div>
</div>

<div class="fly-panel fly-column">
  <div class="layui-container">
    <ul class="layui-clear" >
      <li class="layui-hide-xs layui-this" ><a href="/" >首页</a></li> 
      <li><a href=""  >讨论版&nbsp;&nbsp;<span class="layui-badge-dot"></span></a></li> 
      <!-- 用户登入后显示 -->
      <!-- 我收藏的新闻 我发布的新闻 
      <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><span class="fly-mid"></span></li> 
      <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="../user/index.html">我发表的贴</a></li> 
      <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="../user/index.html#collection">我收藏的贴</a></li>
     -->
    </ul> 
    <div class="fly-column-right layui-hide-xs"> 
      <span class="fly-search"><i class="layui-icon"></i></span> 
      <a href="../news/newsPost.jsp" class="layui-btn">发表新闻</a> 
    </div> 
    <div class="layui-hide-sm layui-show-xs-block" style="margin-top: -10px; padding-bottom: 10px; text-align: center;"> 
      <a href="../news/newsPost.jsp" class="layui-btn">发表新闻</a> 
    </div> 
  </div>
</div>

<div class="layui-container">
  <div class="layui-row layui-col-space15">
    <div class="layui-col-md8 content detail">
      <div class="fly-panel detail-box">
        <h1>SunnyNews 第一版</h1>
        <div class="fly-detail-info">
          <!-- <span class="layui-badge">审核中</span> -->
          <span class="layui-badge layui-bg-green fly-detail-column">必读</span>
          
          <span class="layui-badge" style="background-color: #999;">官方</span>
          <!-- <span class="layui-badge" style="background-color: #5FB878;">已结</span> -->
          
          <span class="layui-badge layui-bg-black">置顶</span>
          <span class="layui-badge layui-bg-red">精帖</span>
          
          <div class="fly-admin-box" data-id="123">
            <span class="layui-btn layui-btn-xs jie-admin" type="del">删除</span>
            
            <span class="layui-btn layui-btn-xs jie-admin" type="set" field="stick" rank="1">置顶</span> 
            <!-- <span class="layui-btn layui-btn-xs jie-admin" type="set" field="stick" rank="0" style="background-color:#ccc;">取消置顶</span> -->
            
            <span class="layui-btn layui-btn-xs jie-admin" type="set" field="status" rank="1">加精</span> 
            <!-- <span class="layui-btn layui-btn-xs jie-admin" type="set" field="status" rank="0" style="background-color:#ccc;">取消加精</span> -->
          </div>
          <span class="fly-list-nums"> 
            <a href="#comment"><i class="iconfont" title="评论">&#xe60c;</i> 66</a>
            <i class="iconfont" title="人气">&#xe60b;</i> 99999
          </span>
        </div>
        <div class="detail-about">
          <a class="fly-avatar" href="../user/home.html">
            <img src="../img/logo.png" alt="SunnyNews 官方">
          </a>
          <div class="fly-detail-user">
            <a href="../user/home.html" class="fly-link">
              <cite>SunnyNews 官方</cite>
              <i class="iconfont icon-renzheng" title="认证信息：{{ rows.user.approve }}"></i>
              <i class="layui-badge fly-badge-vip">VIP3</i>
            </a>
            <span>2017-11-30</span>
          </div>
          <div class="detail-hits" id="LAY_jieAdmin" data-id="123">
            <span style="padding-right: 10px; color: #FF7200">悬赏：60阳光值</span>  
            <span class="layui-btn layui-btn-xs jie-admin" type="edit"><a href="add.html">评论此新闻</a></span>
          </div>
        </div>
        <div class="detail-body photos">
          <p>
            	该新闻由向阳小队（<a href="https://github.com/xyxd0522" target="_blank">https://github.com/xyxd0522</a>）倾情提供，只为表明我们对 向阳 执着的信念、以及对未来持续加强的承诺。
          </p>
          <p>更新日志：</p>
<pre>
# v1.0 2017-11-30
* 采用 layui 2.2.3 作为 UI 支撑
* 采用 MySQL数据库 作为 数据库 支撑
</pre>
          
          下载<hr>
          <p>
            GitHub：<a href="https://github.com/xyxd0522/newsystem" target="_blank">https://github.com/xyxd0522/newsystem</a>
          </p>
          封面<hr>
          <p>
            <img src="../img/Sunlogo.JPG" alt="向阳小队">
          </p>
        </div>
      </div>

      <div class="fly-panel detail-box" id="flyReply">
        <fieldset class="layui-elem-field layui-field-title" style="text-align: center;">
          <legend>评论</legend>
        </fieldset>

        <ul class="jieda" id="jieda">
          <li data-id="111" class="jieda-daan">
            <a name="item-1111111111"></a>
            <div class="detail-about detail-about-reply">
              <a class="fly-avatar" href="">
                <img src="../img/logo.png" alt=" ">
              </a>
              <div class="fly-detail-user">
                <a href="" class="fly-link">
                  <cite>SunnyNews 官方</cite>
                  <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                  <i class="layui-badge fly-badge-vip">VIP3</i>              
                </a>
                
                <!-- <span>(楼主)</span> -->
                <span style="color:#5FB878">(管理员)</span>
                <!--
                <span style="color:#FF9E3F">（社区之光）</span>
                <span style="color:#999">（该号已被封）</span>
                -->
              </div>

              <div class="detail-hits">
                <span>2017-11-30</span>
              </div>

              <i class="iconfont icon-caina" title="最佳评论"></i>
            </div>
            <div class="detail-body jieda-body photos">
              <p>欢迎多来踩踩</p>
            </div>
            <div class="jieda-reply">
              <span class="jieda-zan zanok" type="zan">
                <i class="iconfont icon-zan"></i>
                <em>66</em>
              </span>
              <span type="reply">
                <i class="iconfont icon-svgmoban53"></i>
                回复
              </span>
              <div class="jieda-admin">
                <span type="edit">编辑</span>
                <span type="del">删除</span>
                <!-- <span class="jieda-accept" type="accept">采纳</span> -->
              </div>
            </div>
          </li>
          
          <li data-id="111">
            <a name="item-1111111111"></a>
            <div class="detail-about detail-about-reply">
              <a class="fly-avatar" href="">
                <img src="../img/logo.png" alt=" 咸鱼一条">
              </a>
              <div class="fly-detail-user">
                <a href="" class="fly-link">
                  <cite>咸鱼一条</cite>       
                </a>
              </div>
              <div class="detail-hits">
                <span>2017-11-31</span>
              </div>
            </div>
            <div class="detail-body jieda-body photos">
              <p>蓝瘦那个香菇，这是一条没被采纳的回帖</p>
            </div>
            <div class="jieda-reply">
              <span class="jieda-zan" type="zan">
                <i class="iconfont icon-zan"></i>
                <em>0</em>
              </span>
              <span type="reply">
                <i class="iconfont icon-svgmoban53"></i>
                回复
              </span>
              <div class="jieda-admin">
                <span type="edit">编辑</span>
                <span type="del">删除</span>
                <span class="jieda-accept" type="accept">采纳</span>
              </div>
            </div>
          </li>
          
          <!-- 无数据时 -->
          <!-- <li class="fly-none">消灭零回复</li> -->
        </ul>
        
        <div class="layui-form layui-form-pane">
          <form action="/jie/reply/" method="post">
            <div class="layui-form-item layui-form-text">
              <a name="comment"></a>
              <div class="layui-input-block">
                <textarea id="L_content" name="content" required lay-verify="required" placeholder="请输入内容"  class="layui-textarea fly-editor" style="height: 150px;"></textarea>
              </div>
            </div>
            <div class="layui-form-item">
              <input type="hidden" name="jid" value="123">
              <button class="layui-btn" lay-filter="*" lay-submit>提交回复</button>
            </div>
          </form>
        </div>
      </div>
    </div>
    <div class="layui-col-md4">
      <dl class="fly-panel fly-list-one">
			<dt class="fly-panel-title">本周热搜</dt>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<dd>
			  <a href="">热搜新闻</a>
			  <span><i class="layui-icon">&#xe615;</i>  16</span>
			</dd>
			<!-- 无数据时 -->
			<!--
        		<div class="fly-none">没有相关数据</div>
        	-->
		  </dl>

      <div class="fly-panel" >
		  <div class="fly-panel-main">
			<a href="http://layim.layui.com/?from=fly" target="_blank" class="fly-zanzhu" time-limit="2017.09.25-2099.01.01" style="background-color: #5FB878;">SunnyNews 向阳小队旗舰之作</a>
		  </div>
		  <div class="fly-panel" style="padding: 20px 0; text-align: center;">
			<img src="http://img.blog.csdn.net/20170410111808727?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbGluZ2xpYW4wNTIy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" style="max-width: 100%;" alt="layui">
			<p style="position: relative; color: #666;">微信扫码关注 向阳小队 公众号</p>
		  </div>
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