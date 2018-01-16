<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>提示页面</title>
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
                <div class="fly-panel fly-column">
                        <div class="layui-container">
                                <ul class="layui-clear" >
                                        <li class="layui-hide-xs layui-this" ><a href="/" >首页</a></li> 
                                        <li><a href="../news/newsList.jsp"  >讨论版&nbsp;&nbsp;<span class="layui-badge-dot"></span></a></li> 

                                        <!-- 用户登入后显示 -->
                                        <!-- 我收藏的贴 我发布的帖 
                                        <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><span class="fly-mid"></span></li> 
                                        
                                        
                                        <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="../user/index.jsp">我发布的</a></li> 
                                        <li class="layui-hide-xs layui-hide-sm layui-show-md-inline-block"><a href="../user/index.jsp#collection">我收藏的</a></li>
                                        -->
                                </ul> 

                                <div class="fly-column-right layui-hide-xs"> 
                                        <span class="fly-search"><i class="layui-icon"></i></span> 
                                        <a href="../news/newsPost.jsp" class="layui-btn">发布新闻</a> 
                                </div> 
                                <div class="layui-hide-sm layui-show-xs-block" style="margin-top: -10px; padding-bottom: 10px; text-align: center;"> 
                                        <a href="../news/newsPost.jsp" class="layui-btn">发布新闻</a> 
                                </div> 
                        </div>
                </div>

                <div class="layui-container fly-marginTop">
                        <div class="fly-panel">
                                <div class="fly-none">
                                        <h2><i class="iconfont icon-tishilian"></i></h2>
                                        <p>小二已经马不停蹄地去写代码啦~~后续会有精彩内容，欢迎期待~~</p>
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