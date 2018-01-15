<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>SunnyNews</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="keywords" content="SunnyNews">
		<meta name="description" content="SunnyNews 向阳小队旗舰之作">
		<link rel="stylesheet" type="text/css" href="comm/layui/css/layui.css" />
		<link rel="stylesheet" type="text/css" href="comm/layui/global.css" />
		<link rel="stylesheet" type="text/css" href="comm/layui/css/modules/layer/default/layer.css" />
		<script src="comm/layui/layui.js" charset="utf-8"></script>
		<script src="comm/layer/layer.js"></script>
		<script src="comm/jquery/jquery-2.1.4.js"></script>
	</head>
	<body>
		<div>
			<div class="fly-header layui-bg-black">
				<div class="layui-container">
					<a class="fly-logo" href="/">
						<img src="img/logo.png" style="height: 29px;padding-left:-10px;" alt="logo">
					</a>
					<ul class="layui-nav fly-nav layui-hide-xs">
						<!-- 若要指定为那个模块 添加 layui-this class 如<li class="layui-nav-item layui-this"> -->
						<li class="layui-nav-item layui-this">
							<a href="user/message.jsp"><i class="iconfont icon-jiaoliu"></i>通知</a>
						</li>
						<li class="layui-nav-item">
							<a href="user/index.jsp"><i class="layui-icon">&#xe705;</i>我发布的</a>
						</li>
						<li class="layui-nav-item">
							<a href="news/newsPost.jsp" target="_blank"><i class="layui-icon">&#xe609;</i>写新闻</a>
						</li>
					</ul>

					<ul class="layui-nav fly-nav-user">

						<!-- 未登入的状态 -->
						<!-- 
						<li class="layui-nav-item">
        						<a class="iconfont icon-touxiang layui-hide-xs" href="user/login.jsp"></a>
      						</li>
      						<li class="layui-nav-item">
        						<a href="user/login.jsp">登入</a>
      						</li>
      						<li class="layui-nav-item">
        						<a href="user/reg.jsp">注册</a>
      						</li>
      						<li class="layui-nav-item layui-hide-xs">
        						<a href="/app/qq/" onclick="layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})" title="QQ登入" class="iconfont icon-qq"></a>
      						</li>
      						<li class="layui-nav-item layui-hide-xs">
        						<a href="/app/weibo/" onclick="layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})" title="微博登入" class="iconfont icon-weibo"></a>
      						</li>
      					 -->
						<!-- 登入后的状态 -->
						
						<li class="layui-nav-item">
							<a class="fly-nav-avatar" href="javascript:;">
								<cite class="layui-hide-xs">小彭</cite>
								<i class="iconfont icon-renzheng layui-hide-xs" title="认证信息：layui 作者"></i>
								<i class="layui-badge fly-badge-vip layui-hide-xs">VIP3</i>
								<img src="https://tva1.sinaimg.cn/crop.0.0.118.118.180/5db11ff4gw1e77d3nqrv8j203b03cweg.jpg">
							</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="user/set.jsp"><i class="layui-icon">&#xe620;</i>基本设置</a>
								</dd>
								<dd>
									<a href="user/message.jsp"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a>
								</dd>
								<dd>
									<a href="user/home.jsp"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a>
								</dd>
								<hr style="margin: 5px 0;">
								<dd>
									<a href="/user/logout/" style="text-align: center;">退出</a>
								</dd>
							</dl>
						</li>
						 
						
					</ul>
				</div>
			</div>
			<div class="fly-panel fly-column">
				<div class="layui-container">
					<ul class="layui-clear">
						<li class="layui-hide-xs layui-this" style="padding-left:-10px;">
							<a href="/">首页</a>
						</li>
						<li>
							<a href="news/newsList.jsp">讨论版&nbsp;&nbsp;<span class="layui-badge-dot"></span></a>
						</li>

						<!-- 用户登入后显示 -->
						<!-- 我收藏的贴 我发布的帖 
      						<li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><span class="fly-mid"></span></li> 
      						<li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="user/index.jsp">我发布的</a></li> 
      						<li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="user/index.jsp#collection">我收藏的</a></li>
     					-->
					</ul>
					<div class="fly-column-right layui-hide-xs">
						<span class="fly-search"><i class="layui-icon"></i></span>
						<a href="news/newsPost.jsp" class="layui-btn">发表新闻</a>
					</div>
					<div class="layui-hide-sm layui-show-xs-block" style="margin-top: -10px; padding-bottom: 10px; text-align: center;">
						<a href="news/newsPost.jsp" class="layui-btn">发表新闻</a>
					</div>
				</div>
			</div>
			<div style="width:1250px;padding-left:60px;">
				<div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
					<ul class="layui-tab-title">
						<li>时政</li>
						<li>国际</li>
						<li>金融</li>
						<li>社会</li>
						<li>财经</li>
						<li>产经</li>
						<li>汽车</li>
						<li>港澳</li>
						<li>台湾</li>
						<li>华人</li>
						<li>娱乐</li>
						<li>体育</li>
						<li>文化</li>
					</ul>
					<div class="layui-tab-content"></div>
				</div>
				<div class="layui-container">
					<div class="layui-row layui-col-space15">
						<div class="layui-col-md8">
							<div class="fly-panel">
								<div class="fly-panel-title fly-filter">
									<a>置顶新闻</a>
									<a href="#signin" class="layui-hide-sm layui-show-xs-block fly-right" id="LAY_goSignin" style="color: #FF5722;">去签到</a>
								</div>
								<ul class="fly-list">
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              								<a class="layui-badge">公告</a>
              								<a href="news/newsDetail.jsp">SunnyNews 第三版</a>
            							</h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>SunnyNews 官方</cite>
												<i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
												<i class="layui-badge fly-badge-vip">VIP3</i>
											</a>
											<span>刚刚</span>
											<span class="fly-list-kiss layui-hide-xs" title="悬赏飞吻"><i class="layui-icon">&#xe65e;</i>  60</span>
											<span class="layui-badge fly-badge-accept layui-hide-xs">必读</span>
											<span class="fly-list-nums"> 
                								<i class="iconfont icon-pinglun1" title="评论"></i> 66
              								</span>
										</div>
										<div class="fly-list-badge">
											<span class="layui-badge layui-bg-black">置顶</span>
											<span class="layui-badge layui-bg-red">精品</span>
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              								<a class="layui-badge">公告</a>
              								<a href="news/newsDetail.jsp">SunnyNews 第二版</a>
            							</h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>SunnyNews 官方</cite>
												<i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
												<i class="layui-badge fly-badge-vip">VIP3</i>
											</a>
											<span>2018-01-01</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<span class="layui-badge fly-badge-accept layui-hide-xs">必读</span>
											<span class="fly-list-nums"> 
                								<i class="iconfont icon-pinglun1" title="评论"></i> 66
              								</span>
										</div>
										<div class="fly-list-badge">
											<!-- <span class="layui-badge layui-bg-black">置顶</span> -->
											<span class="layui-badge layui-bg-red">精品</span>
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              								<a class="layui-badge">公告</a>
              								<a href="news/newsDetail.jsp">SunnyNews 第一版</a>
            							</h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>SunnyNews 官方</cite>
												<i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
												<i class="layui-badge fly-badge-vip">VIP3</i>
											</a>
											<span>2017-11-30</span>
											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<span class="layui-badge fly-badge-accept layui-hide-xs">必读</span>
											<span class="fly-list-nums"> 
                								<i class="iconfont icon-pinglun1" title="评论"></i> 66
              								</span>
										</div>
										<div class="fly-list-badge">
											<!-- <span class="layui-badge layui-bg-black">置顶</span> -->
											<span class="layui-badge layui-bg-red">精品</span>
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              								<a class="layui-badge">娱乐</a>
              								<a href="news/newsDetail.jsp">鹿晗和关晓彤在一起了！！</a>
            							</h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!-- <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>-->
												<i class="layui-badge fly-badge-vip">VIP1</i>
											</a>
											<span>2017-10-8</span>
											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<span class="layui-badge fly-badge-accept layui-hide-xs">热搜</span>
											<span class="fly-list-nums"> 
                								<i class="iconfont icon-pinglun1" title="评论"></i> 66
              								</span>
										</div>
										<div class="fly-list-badge">
											<!-- <span class="layui-badge layui-bg-black">置顶</span> -->
											<!-- <span class="layui-badge layui-bg-red">精品</span> -->
										</div>
									</li>
								</ul>
							</div>
							<div class="fly-panel" style="margin-bottom: 0;">
								<div class="fly-panel-title fly-filter">
									<!-- 都是访问news/newsDetail.jsp 但是参数不同-->
									<a href="newsAction.do/method=queryAll" class="layui-this">综合</a>
									<span class="fly-mid"></span>
									<a href="">个性推荐</a>
									<span class="fly-mid"></span>
									<a href="">精品</a>
									<span class="fly-filter-right layui-hide-xs">
            							<a href="${pageContext.request.contextPath }NewsAction.do?method=queryByNewsdate" class="layui-this">按最新</a>
            							<span class="fly-mid"></span>
										<a href="">按热搜</a>
									</span>
								</div>
								<ul class="fly-list">
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              								<a class="layui-badge">${requestScope.news.typename }</a>
              								<a href="news/newsDetail.jsp">${requestScope.news.title }</a>
            							</h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>${requestScope.news.userid }</cite>
												<!--
                									<i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                									<i class="layui-badge fly-badge-vip">VIP3</i>
                									-->
											</a>
											<span>${requestScope.news.newsdate }</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                								<i class="iconfont icon-pinglun1" title="评论"></i> 10
              								</span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">科技</a>
              <a href="news/newsDetail.jsp">IconFont</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭彭</cite>
												<!--<i class="iconfont icon-renzheng" title="认证信息：XXX"></i>-->
												<i class="layui-badge fly-badge-vip">VIP3</i>
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<span class="layui-badge fly-badge-accept layui-hide-xs">推荐</span>
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 66
              </span>
										</div>
										<div class="fly-list-badge">
											<span class="layui-badge layui-bg-red">精品</span>
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="news/newsDetail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="jie/detail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="news/newsDetail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="news/newsDetail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="news/newsDetail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="news/newsDetail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="news/newsDetail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="回答"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="news/newsDetail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="news/newsDetail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
									<li>
										<a href="user/home.jsp" class="fly-avatar">
											<img src="img/logo.png" alt="">
										</a>
										<h2>
              <a class="layui-badge">娱乐</a>
              <a href="jie/detail.jsp">朋友圈的惊天大新闻</a>
            </h2>
										<div class="fly-list-info">
											<a href="user/home.jsp" link>
												<cite>小彭</cite>
												<!--
                <i class="iconfont icon-renzheng" title="认证信息：XXX"></i>
                <i class="layui-badge fly-badge-vip">VIP3</i>
                -->
											</a>
											<span>刚刚</span>

											<span class="fly-list-kiss layui-hide-xs" title="悬赏阳光值"><i class="layui-icon">&#xe65e;</i> 60</span>
											<!--<span class="layui-badge fly-badge-accept layui-hide-xs">已结</span>-->
											<span class="fly-list-nums"> 
                <i class="iconfont icon-pinglun1" title="评论"></i> 10
              </span>
										</div>
										<div class="fly-list-badge">
											<!--<span class="layui-badge layui-bg-red">精帖</span>-->
										</div>
									</li>
								</ul>
								<div style="text-align: center">
									<div class="laypage-main">
										<a href="" class="laypage-next">更多推荐</a>
									</div>
								</div>

							</div>
						</div>
						<div class="layui-col-md4">
							<!-- 图片轮播 -->
							<div class="layui-carousel" id="test1">
								<div carousel-item>
									<div><img src="img/Sunlogo.JPG" style="width: 380px;height:290px"></img>
									</div>
									<div><img src="img/Sunlogo.JPG" style="width: 380px;height:290px"></img>
									</div>
									<div><img src="img/Sunlogo.JPG" style="width: 380px;height:290px"></img>
									</div>
									<div><img src="img/Sunlogo.JPG" style="width: 380px;height:290px"></img>
									</div>
									<div><img src="img/Sunlogo.JPG" style="width: 380px;height:290px"></img>
									</div>
								</div>
							</div>
							<!-- 会员特享-->
							<div class="fly-panel">
								<h3 class="fly-panel-title">会员通道</h3>
								<ul class="fly-panel-main fly-list-static">
									<li>
										<a href="" target="_blank">点进来定制你的专属会员新闻文件夹</a>
									</li>
								</ul>
							</div>

							<div class="fly-panel fly-signin">
								<div class="fly-panel-title">
									签到
									<i class="fly-mid"></i>
									<a href="javascript:;" class="fly-link" id="LAY_signinHelp">说明</a>
									<i class="fly-mid"></i>
									<a href="javascript:;" class="fly-link" id="LAY_signinTop">活跃榜<span class="layui-badge-dot"></span></a>
									<span class="fly-signin-days">已连续签到<cite>16</cite>天</span>
								</div>
								<div class="fly-panel-main fly-signin-main">
									<button class="layui-btn layui-btn-danger" id="LAY_signin">今日签到</button>
									<span>可获得<cite>5</cite><i class="layui-icon">&#xe65e;</i>阳光值</span>

									<!-- 已签到状态 -->
									<!--
          <button class="layui-btn layui-btn-disabled">今日已签到</button>
          <span>获得了<cite>20</cite>飞吻</span>
          -->
								</div>
							</div>

							<div class="fly-panel fly-rank fly-rank-reply" id="LAY_replyRank">
								<h3 class="fly-panel-title">发布新闻周榜</h3>
								<dl>
									<!--<i class="layui-icon fly-loading">&#xe63d;</i>-->
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
									<dd>
										<a href="user/home.jsp">
											<img src="img/logo.png" alt="userImg"><cite>小彭</cite><i>10次发布</i>
										</a>
									</dd>
								</dl>
							</div>

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

							<div class="fly-panel">
								<div class="fly-panel-main">
									<a href="https://github.com/xyxd0522" target="_blank" class="fly-zanzhu" time-limit="2017.09.25-2099.01.01" style="background-color: #5FB878;">SunnyNews 向阳小队旗舰之作</a>
								</div>
								<div class="fly-panel" style="padding: 20px 0; text-align: center;">
									<img src="http://img.blog.csdn.net/20170410111808727?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbGluZ2xpYW4wNTIy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast" style="max-width: 100%;" alt="layui">
									<p style="position: relative; color: #666;">微信扫码关注 向阳小队 公众号</p>
								</div>
							</div>

							<div class="fly-panel fly-link">
								<h3 class="fly-panel-title">友情链接</h3>
								<dl class="fly-panel-main">
									<dd>
										<a href="https://ele-peng.github.io/" target="_blank">Ele-Peng's Blog</a>
									</dd>
									<dd>
										<a href="https://github.com/linglian" target="_blank">Lee's GitHub</a>
									</dd>
									<dd>
										<a href="http://blog.csdn.net/linglian0522" target="_blank">Lee's CSDN</a>
									</dd>
									<dd>
										<a href="http://blog.csdn.net/elle_peng" target="_blank">Ele-Peng's CSDN</a>
									</dd>
									<dd>
										<a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews开发代码管理</a>
									</dd>
									<dd>
										<a href="mailto:xianxin@layui-inc.com?subject=%E7%94%B3%E8%AF%B7Fly%E7%A4%BE%E5%8C%BA%E5%8F%8B%E9%93%BE" class="fly-link">申请友链</a>
									</dd>
								</dl>
							</div>
						</div>
						</div>
					</div>
				</div>

				<div class="fly-footer">
					<p>
						<a href="https://github.com/xyxd0522" target="_blank">SunnyNews</a> 2018 &copy;
						<a href="https://github.com/xyxd0522" target="_blank">向阳出品</a>
					</p>
					<p>
						<a href="https://github.com/xyxd0522" target="_blank">微信公众号</a>
					</p>
				</div>

				<script src="comm/layui/layui.js"></script>
				<script>
					layui.cache.page = '';
					layui.cache.user = {
						username: '游客',
						uid: -1,
						avatar: 'img/logo.jpg',
						experience: 83,
						sex: '男'
					};
					layui.config({
						version: "3.0.0",
						base: 'comm/mods/'
					}).extend({
						fly: 'index'
					}).use(['fly', 'face'], function() {
						var $ = layui.$,
							fly = layui.fly;
						//如果你是采用模版自带的编辑器，你需要开启以下语句来解析。

						$('.detail-body').each(function() {
							var othis = $(this),
								html = othis.html();
							othis.html(fly.content(html));
						});

					});
				</script>
				<script>
					layui.use('carousel', function(){
					  var carousel = layui.carousel;
					  //建造实例
					  carousel.render({
					    elem: '#test1'
					    ,width: '100%' //设置容器宽度
					    ,arrow: 'always' //始终显示箭头
					    //,anim: 'updown' //切换动画方式
					  });
					});
				</script>
	</body>
</html>