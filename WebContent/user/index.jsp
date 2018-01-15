<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>用户中心</title>
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
                <c:import url="${pageContext.request.contextPath}/user/top.jsp" />
                <div class="layui-container fly-marginTop fly-user-main">
                        <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="user">
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/UserAction.do?method=query&userId=${identity.userId}">
                                                <i class="layui-icon">&#xe609;</i>
                                                我的主页
                                        </a>
                                </li>
                                <li class="layui-nav-item layui-this">
                                        <a href="${pageContext.request.contextPath}/UserAction.do?method=index">
                                                <i class="layui-icon">&#xe612;</i>
                                                用户中心
                                        </a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/user/set.jsp">
                                                <i class="layui-icon">&#xe620;</i>
                                                基本设置
                                        </a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="${pageContext.request.contextPath}/EmailAction.do?method=getEmail">
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
                                <!--
                                <div class="fly-msg" style="margin-top: 15px;">
                                  您的邮箱尚未验证，这比较影响您的帐号安全，<a href="activate.jsp">立即去激活？</a>
                                </div>
                                -->
                                <div class="layui-tab layui-tab-brief" lay-filter="user">
                                        <ul class="layui-tab-title" id="LAY_mine">
                                                <li data-type="mine-jie" lay-id="index" class="layui-this">我发布的（<span>${fn:length(newsList)}</span>）</li>
                                                <li data-type="collection" data-url="/collection/find/" lay-id="collection">我收藏的（<span>${fn:length(scList)}</span>）</li>
                                        </ul>
                                        <div class="layui-tab-content" style="padding: 20px 0;">
                                                <div class="layui-tab-item layui-show">
                                                        <ul class="mine-view jie-row">
                                                                <c:forEach items="${newsList}" var="n">
                                                                    <li>
                                                                            <a class="jie-title" href="../news/newsDetail.jsp" target="_blank">${n.title}</a>
                                                                            <i>${n.time}</i>
                                                                            <a class="mine-edit" href="../news/newsPost.jsp">编辑</a>
                                                                            <em>
                                                                                    ${n.good}<i class="layui-icon" style="font-size: 24px; color: green;">&#xe6c6;</i>
                                                                                    /
                                                                                    ${n.bad}<i class="layui-icon" style="font-size: 24px; color: red;">&#xe6c5;</i></em>
                                                                    </li>
                                                                </c:forEach>
                                                        </ul>
                                                        <div id="LAY_page"></div>
                                                </div>
                                                <div class="layui-tab-item">
                                                        <ul class="mine-view jie-row">
                                                                <c:forEach items="${scList}" var="n">
                                                                    <li>
                                                                            <a class="jie-title" href="../news/newsDetail.jsp" target="_blank">${n.title}</a>
                                                                            <i>${n.time}</i>
                                                                            <em>
                                                                                    ${n.good}<i class="layui-icon" style="font-size: 24px; color: green;">&#xe6c6;</i>
                                                                                    /
                                                                                    ${n.bad}<i class="layui-icon" style="font-size: 24px; color: red;">&#xe6c5;</i></em>
                                                                    </li>
                                                                </c:forEach>
                                                        </ul>
                                                        <div id="LAY_page1"></div>
                                                </div>
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