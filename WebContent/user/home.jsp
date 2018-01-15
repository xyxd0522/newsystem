<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>用户主页</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="../comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="../comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="../comm/layui/css/modules/layer/default/layer.css" />
                <script src="../comm/layui/layui.js" charset="utf-8"></script>
                <script src="../comm/jquery/jquery-2.1.4.js"></script>
                <script src="../comm/layer/layer.js"></script>
                <c:if test="${not empty info}">
                    <script>layer.msg('${info}')</script>
                    <c:remove var="info" />
                </c:if>
        </head>
        <body style="margin-top: 65px;">
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

                                        <c:if test="${empty sessionScope.identity}">
                                            <!-- 未登入的状态 -->

                                            <li class="layui-nav-item">
                                                    <a class="iconfont icon-touxiang layui-hide-xs" href="login.jsp"></a>
                                            </li>
                                            <li class="layui-nav-item">
                                                    <a href="login.jsp">登入</a>
                                            </li>
                                            <li class="layui-nav-item">
                                                    <a href="reg.jsp">注册</a>
                                            </li>
                                            <li class="layui-nav-item layui-hide-xs">
                                                    <a href="/app/qq/" onclick="layer.msg('正在通过QQ登入', {icon: 16, shade: 0.1, time: 0})" title="QQ登入" class="iconfont icon-qq"></a>
                                            </li>
                                            <li class="layui-nav-item layui-hide-xs">
                                                    <a href="/app/weibo/" onclick="layer.msg('正在通过微博登入', {icon: 16, shade: 0.1, time: 0})" title="微博登入" class="iconfont icon-weibo"></a>
                                            </li>
                                        </c:if>
                                        <c:if test="${not empty sessionScope.identity}">
                                            <!-- 登入后的状态 -->

                                            <li class="layui-nav-item">
                                                    <a class="fly-nav-avatar" href="${pageContext.request.contextPath}/user/home.jsp">
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
                                        </c:if>
                                </ul>
                        </div>
                </div>

                <div class="fly-home fly-panel" style="background-image: url();">
                        <img src="../img/logo.png" alt="SunnyNews 官方">
                        <i class="iconfont icon-renzheng" title="SunnyNews认证"></i>
                        <h1>
                                ${sessionScope.user.name}
                                <c:if test="${sessionScope.user.sex == '男'}">
                                    <i class="iconfont icon-nan"></i>
                                </c:if>
                                <c:if test="${sessionScope.user.sex == '女'}">
                                    <i class="iconfont icon-nv"></i>
                                </c:if>
                                <c:if test="${sessionScope.user.lvl >= 1}">
                                    <i class="layui-badge fly-badge-vip">VIP${sessionScope.user.lvl}</i>
                                </c:if>
                                <c:if test="${sessionScope.user.lvl == -99}">
                                    <span style="color:#c00;">（管理员）</span>
                                </c:if>
                                <!--
                                <span style="color:#5FB878;">（社区之光）</span>
                                <span>（该号已被封）</span>
                                -->
                        </h1>
                        <!--
                            <p style="padding: 10px 0; color: #5FB878;">${sessionScope.user.signature}</p>
                        -->
                        <p class="fly-home-info">
                                <i class="iconfont" title="阳光值"><i class="layui-icon">&#xe65e;</i></i><span style="color: #FF7200;">${sessionScope.user.money}</span>
                                <i class="iconfont icon-shijian"></i><span>${sessionScope.user.registerDate} 加入</span>
                                <i class="iconfont icon-chengshi"></i><span>来自${sessionScope.user.path}</span>
                        </p>

                        <p class="fly-home-sign">${sessionScope.user.signature}</p>

                        <div class="fly-sns" data-user="">
                                <a href="${pageContext.request.contextPath}/UserAction.do?method=insertFriend&userId=${sessionScope.user.userId}" class="layui-btn layui-btn-primary fly-imActive" data-type="addFriend">加为好友</a>
                                <a href="javascript:;" class="layui-btn layui-btn-normal fly-imActive" data-type="chat">发起会话</a>
                        </div>

                </div>

                <div class="layui-container">
                        <div class="layui-row layui-col-space15">
                                <div class="layui-col-md6 fly-home-jie">
                                        <div class="fly-panel">
                                                <h3 class="fly-panel-title">SunnyNews 最近的评论</h3>
                                                <ul class="jie-row">
                                                        <li>
                                                                <span class="fly-jing">精</span>
                                                                <a href="../news/newsDetail.jsp" class="jie-title"> 鹿晗 和 关晓彤 分手了没</a>
                                                                <i>刚刚</i>
                                                                <em class="layui-hide-xs">1136阅/27答</em>
                                                        </li>
                                                        <li>
                                                                <a href="../news/newsDetail.jsp" class="jie-title"> 鹿晗 和 关晓彤 分手了没</a>
                                                                <i>1天前</i>
                                                                <em class="layui-hide-xs">1136阅/27答</em>
                                                        </li>
                                                        <li>
                                                                <a href="../news/newsDetail.jsp" class="jie-title"> 鹿晗 和 关晓彤 分手了没</a>
                                                                <i>2017-10-30</i>
                                                                <em class="layui-hide-xs">1136阅/27答</em>
                                                        </li>
                                                        <li>
                                                                <a href="../news/newsDetail.jsp" class="jie-title"> 鹿晗 和 关晓彤 分手了没</a>
                                                                <i>1天前</i>
                                                                <em class="layui-hide-xs">1136阅/27答</em>
                                                        </li>
                                                        <li>
                                                                <a href="../news/newsDetail.jsp" class="jie-title"> 鹿晗 和 关晓彤 分手了没</a>
                                                                <i>1天前</i>
                                                                <em class="layui-hide-xs">1136阅/27答</em>
                                                        </li>
                                                        <li>
                                                                <a href="../news/newsDetail.jsp" class="jie-title"> 鹿晗 和 关晓彤 分手了没</a>
                                                                <i>1天前</i>
                                                                <em class="layui-hide-xs">1136阅/27答</em>
                                                        </li>
                                                        <li>
                                                                <a href="../news/newsDetail.jsp" class="jie-title"> 鹿晗 和 关晓彤 分手了没</a>
                                                                <i>1天前</i>
                                                                <em class="layui-hide-xs">1136阅/27答</em>
                                                        </li>
                                                        <!-- <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><i style="font-size:14px;">没有发表任何求解</i></div> -->
                                                </ul>
                                        </div>
                                </div>

                                <div class="layui-col-md6 fly-home-da">
                                        <div class="fly-panel">
                                                <h3 class="fly-panel-title">SunnyNews 最近的讨论</h3>
                                                <ul class="home-jieda">
                                                        <li>
                                                                <p>
                                                                        <span>1分钟前</span>
                                                                        SunnyNews<a href="../news/newsDetail.jsp" target="_blank">啥时候开发移动端</a>中回答：
                                                                </p>
                                                                <div class="home-dacontent">
                                                                        已经开发了小程序版的了
                                                                        <pre>
程序员小二输入：老板没有此需求~~哈哈哈哈         
                                                                        </pre>
                                                                        需求文档没有提及
                                                                </div>
                                                        </li>
                                                        <li>
                                                                <p>
                                                                        <span>5分钟前</span>
                                                                        在<a href="../news/newsDetail.jsp" target="_blank">在SunnyNews如何重置密码啊？</a>中回答：
                                                                </p>
                                                                <div class="home-dacontent">
                                                                        好好找，有重置跳转的。
                                                                </div>
                                                        </li>

                                                        <!-- <div class="fly-none" style="min-height: 50px; padding:30px 0; height:auto;"><span>没有回答任何问题</span></div> -->
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
                                                            , uid: -1
                                                            , avatar: '../img/logo.jpg'
                                                            , experience: 83
                                                            , sex: '男'
                                                        };
                                                        layui.config({
                                                            version: "3.0.0"
                                                            , base: '../comm/mods/'
                                                        }).extend({
                                                            fly: 'index'
                                                        }).use(['fly', 'face'], function () {
                                                            var $ = layui.$
                                                                    , fly = layui.fly;
                                                            //如果你是采用模版自带的编辑器，你需要开启以下语句来解析。

                                                            $('.detail-body').each(function () {
                                                                var othis = $(this), html = othis.html();
                                                                othis.html(fly.content(html));
                                                            });

                                                        });
                </script>

        </body>
</html>