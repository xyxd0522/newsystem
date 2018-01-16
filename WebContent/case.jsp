<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html style="background-color: #e2e2e2;">
        <head>
                <meta charset="utf-8">
                <title>发现 SunnyNews 2017 年度最佳新闻</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="comm/layui/css/modules/layer/default/layer.css" />
                <script src="comm/layui/layui.js" charset="utf-8"></script>
                <script src="comm/layer/layer.js"></script>
                <script src="comm/jquery/jquery-2.1.4.js"></script>
                <style>
                        .header{border-bottom: 1px solid #404553; border-right: 1px solid #404553;}
                </style>
        </head>
        <body class="fly-full">

                <c:import url="${pageContext.request.contextPath}/user/top.jsp" />

                <div class="fly-case-header">
                        <p class="fly-case-year">2018</p>
                        <a href="/case/{{ year }}/">
                                <img class="fly-case-banner" src="img/case.png" alt="发现 SunnyNews 年度最佳新闻">
                        </a>
                        <div class="fly-case-btn">
                                <a href="news/newsPost.jsp" class="layui-btn layui-btn-big fly-case-active" data-type="push">发布新闻</a>
                                <a href="user/index.jsp" class="layui-btn layui-btn-primary layui-btn-big">我发布的</a>

                                <a href="" target="_blank" style="padding: 0 15px; text-decoration: underline">新闻要求</a>
                        </div>
                </div>

                <div class="fly-main" style="overflow: hidden;">

                        <div class="fly-tab-border fly-case-tab">
                                <span>
                                        <a href="news/newsList.jsp" class="tab-this">2017年度</a>
                                        <a href="news/newsList.jsp">2016年度</a>
                                </span>
                        </div>
                        <div class="layui-tab layui-tab-brief">
                                <ul class="layui-tab-title">
                                        <li class="layui-this"><a href="news/newsList.jsp">按提交时间</a></li>
                                        <li><a href="news/newsList.jsp">按点赞排行</a></li>
                                </ul>
                        </div>

                        <ul class="fly-case-list">
                                <li data-id="123">
                                        <a class="fly-case-img" href="https://github.com/xyxd0522/newsystem" target="_blank" >
                                                <img src="img/Sunlogo.JPG" alt="Fly社区">
                                                <cite class="layui-btn layui-btn-primary layui-btn-small">去围观</cite>
                                        </a>
                                        <h2><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews</a></h2>
                                        <p class="fly-case-desc">SunnyNews新闻网站的开发已经接近尾声。</p>
                                        <div class="fly-case-info">
                                                <a href="user/home.jsp" class="fly-case-user" target="_blank"><img src="img/logo.png"></a>
                                                <p class="layui-elip" style="font-size: 12px;"><span style="color: #666;">小彭</span> 2017-11-30</p>
                                                <p>获得<a class="fly-case-nums fly-case-active" href="javascript:;" data-type="showPraise" style=" padding:0 5px; color: #01AAED;">666</a>个赞</p>
                                                <button class="layui-btn layui-btn-primary fly-case-active" data-type="praise">点赞</button>
                                                <!-- <button class="layui-btn  fly-case-active" data-type="praise">已赞</button> -->
                                        </div>
                                </li>
                                <li data-id="123">
                                        <a class="fly-case-img" href="https://github.com/xyxd0522/newsystem" target="_blank" >
                                                <img src="img/Sunlogo.JPG" alt="SunnyNews社区">
                                                <cite class="layui-btn layui-btn-primary layui-btn-small">去围观</cite>
                                        </a>
                                        <h2><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews社区</a></h2>
                                        <p class="fly-case-desc">SunnyNews 社区是 向阳小队 的官方新闻社区</p>
                                        <div class="fly-case-info">
                                                <a href="user/home.jsp" class="fly-case-user" target="_blank"><img src="img/logo.png"></a>
                                                <p class="layui-elip" style="font-size: 12px;"><span style="color: #666;">小彭</span> 2017-11-30</p>
                                                <p>获得<a class="fly-case-nums fly-case-active" href="javascript:;" data-type="showPraise" style=" padding:0 5px; color: #01AAED;">666</a>个赞</p>
                                                <button class="layui-btn  fly-case-active" data-type="praise">已赞</button>
                                        </div>
                                </li>
                                <li data-id="123">
                                        <a class="fly-case-img" href="https://github.com/xyxd0522/newsystem" target="_blank" >
                                                <img src="img/Sunlogo.JPG" alt="SunnyNews社区">
                                                <cite class="layui-btn layui-btn-primary layui-btn-small">去围观</cite>
                                        </a>
                                        <h2><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews社区</a></h2>
                                        <p class="fly-case-desc">SunnyNews 社区是 向阳小队 的官方新闻社区</p>
                                        <div class="fly-case-info">
                                                <a href="user/home.jsp" class="fly-case-user" target="_blank"><img src="img/logo.png"></a>
                                                <p class="layui-elip" style="font-size: 12px;"><span style="color: #666;">小彭</span> 2017-11-30</p>
                                                <p>获得<a class="fly-case-nums fly-case-active" href="javascript:;" data-type="showPraise" style=" padding:0 5px; color: #01AAED;">666</a>个赞</p>
                                                <button class="layui-btn  fly-case-active" data-type="praise">已赞</button>
                                        </div>
                                </li>
                                <li data-id="123">
                                        <a class="fly-case-img" href="https://github.com/xyxd0522/newsystem" target="_blank" >
                                                <img src="img/Sunlogo.JPG" alt="SunnyNews社区">
                                                <cite class="layui-btn layui-btn-primary layui-btn-small">去围观</cite>
                                        </a>
                                        <h2><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews社区</a></h2>
                                        <p class="fly-case-desc">SunnyNews 社区是 向阳小队 的官方新闻社区</p>
                                        <div class="fly-case-info">
                                                <a href="user/home.jsp" class="fly-case-user" target="_blank"><img src="img/logo.png"></a>
                                                <p class="layui-elip" style="font-size: 12px;"><span style="color: #666;">小彭</span> 2017-11-30</p>
                                                <p>获得<a class="fly-case-nums fly-case-active" href="javascript:;" data-type="showPraise" style=" padding:0 5px; color: #01AAED;">666</a>个赞</p>
                                                <button class="layui-btn  fly-case-active" data-type="praise">已赞</button>
                                        </div>
                                </li>
                                <li data-id="123">
                                        <a class="fly-case-img" href="https://github.com/xyxd0522/newsystem" target="_blank" >
                                                <img src="img/Sunlogo.JPG" alt="SunnyNews社区">
                                                <cite class="layui-btn layui-btn-primary layui-btn-small">去围观</cite>
                                        </a>
                                        <h2><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews社区</a></h2>
                                        <p class="fly-case-desc">SunnyNews 社区是 向阳小队 的官方新闻社区</p>
                                        <div class="fly-case-info">
                                                <a href="user/home.jsp" class="fly-case-user" target="_blank"><img src="img/logo.png"></a>
                                                <p class="layui-elip" style="font-size: 12px;"><span style="color: #666;">小彭</span> 2017-11-30</p>
                                                <p>获得<a class="fly-case-nums fly-case-active" href="javascript:;" data-type="showPraise" style=" padding:0 5px; color: #01AAED;">666</a>个赞</p>
                                                <button class="layui-btn  fly-case-active" data-type="praise">已赞</button>
                                        </div>
                                </li>
                                <li data-id="123">
                                        <a class="fly-case-img" href="https://github.com/xyxd0522/newsystem" target="_blank" >
                                                <img src="img/Sunlogo.JPG" alt="SunnyNews社区">
                                                <cite class="layui-btn layui-btn-primary layui-btn-small">去围观</cite>
                                        </a>
                                        <h2><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews社区</a></h2>
                                        <p class="fly-case-desc">SunnyNews 社区是 向阳小队 的官方新闻社区</p>
                                        <div class="fly-case-info">
                                                <a href="user/home.jsp" class="fly-case-user" target="_blank"><img src="img/logo.png"></a>
                                                <p class="layui-elip" style="font-size: 12px;"><span style="color: #666;">小彭</span> 2017-11-30</p>
                                                <p>获得<a class="fly-case-nums fly-case-active" href="javascript:;" data-type="showPraise" style=" padding:0 5px; color: #01AAED;">666</a>个赞</p>
                                                <button class="layui-btn  fly-case-active" data-type="praise">已赞</button>
                                        </div>
                                </li>
                                <li data-id="123">
                                        <a class="fly-case-img" href="https://github.com/xyxd0522/newsystem" target="_blank" >
                                                <img src="img/Sunlogo.JPG" alt="SunnyNews社区">
                                                <cite class="layui-btn layui-btn-primary layui-btn-small">去围观</cite>
                                        </a>
                                        <h2><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews社区</a></h2>
                                        <p class="fly-case-desc">SunnyNews 社区是 向阳小队 的官方新闻社区</p>
                                        <div class="fly-case-info">
                                                <a href="user/home.jsp" class="fly-case-user" target="_blank"><img src="img/logo.png"></a>
                                                <p class="layui-elip" style="font-size: 12px;"><span style="color: #666;">小彭</span> 2017-11-30</p>
                                                <p>获得<a class="fly-case-nums fly-case-active" href="javascript:;" data-type="showPraise" style=" padding:0 5px; color: #01AAED;">666</a>个赞</p>
                                                <button class="layui-btn  fly-case-active" data-type="praise">已赞</button>
                                        </div>
                                </li>
                                <li data-id="123">
                                        <a class="fly-case-img" href="https://github.com/xyxd0522/newsystem" target="_blank" >
                                                <img src="img/Sunlogo.JPG" alt="SunnyNews社区">
                                                <cite class="layui-btn layui-btn-primary layui-btn-small">去围观</cite>
                                        </a>
                                        <h2><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews社区</a></h2>
                                        <p class="fly-case-desc">SunnyNews 社区是 向阳小队 的官方新闻社区</p>
                                        <div class="fly-case-info">
                                                <a href="user/home.jsp" class="fly-case-user" target="_blank"><img src="img/logo.png"></a>
                                                <p class="layui-elip" style="font-size: 12px;"><span style="color: #666;">小彭</span> 2017-11-30</p>
                                                <p>获得<a class="fly-case-nums fly-case-active" href="javascript:;" data-type="showPraise" style=" padding:0 5px; color: #01AAED;">666</a>个赞</p>
                                                <button class="layui-btn  fly-case-active" data-type="praise">已赞</button>
                                        </div>
                                </li>
                        </ul>

                        <!-- <blockquote class="layui-elem-quote layui-quote-nm">暂无数据</blockquote> -->

                        <div style="text-align: center;">
                                <div class="laypage-main">
                                        <span class="laypage-curr">1</span>
                                        <a href="news/newsList.jsp">2</a><a href="">3</a>
                                        <a href="news/newsList.jsp">4</a>
                                        <a href="news/newsList.jsp">5</a>
                                        <span>…</span>
                                        <a href="news/newsList.jsp" class="laypage-last" title="尾页">尾页</a>
                                        <a href="news/newsList.jsp" class="laypage-next">下一页</a>
                                </div>
                        </div>

                </div>

                <div class="fly-footer">
                        <p><a href="https://github.com/xyxd0522/newsystem" target="_blank">SunnyNews</a> 2018 &copy; <a href="https://github.com/xyxd0522/newsystem" target="_blank">向阳出品</a></p>
                        <p>
                                <a href="https://github.com/xyxd0522/newsystem" target="_blank">微信公众号</a>
                        </p>
                </div>

                <script src="comm/layui/layui.js"></script>
                <script>
layui.cache.page = '';
layui.cache.user = {
    username: '游客'
    , uid: -1
    , avatar: 'img/logo.jpg'
    , experience: 83
    , sex: '男'
};
layui.config({
    version: "3.0.0"
    , base: 'comm/mods/'
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