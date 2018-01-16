<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>发布新闻 修改新闻 公用</title>
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

                <div class="layui-container fly-marginTop">
                        <div class="fly-panel" pad20 style="padding-top: 5px;">
                                <!--<div class="fly-none">没有权限</div>-->
                                <div class="layui-form layui-form-pane">
                                        <div class="layui-tab layui-tab-brief" lay-filter="user">
                                                <ul class="layui-tab-title">
                                                        <li class="layui-this">发布新闻<!-- 修改新闻 --></li>
                                                </ul>
                                                <div class="layui-form layui-tab-content" id="LAY_ucm" style="padding: 20px 0;">
                                                        <div class="layui-tab-item layui-show">
                                                                <form action="" method="post">
                                                                        <div class="layui-row layui-col-space15 layui-form-item">
                                                                                <div class="layui-col-md3">
                                                                                        <label class="layui-form-label">所在专栏</label>
                                                                                        <div class="layui-input-block">
                                                                                                <select lay-verify="required" name="class" lay-filter="column"> 
                                                                                                        <option></option> 
                                                                                                        <option value="0">发布新闻</option> 
                                                                                                        <option value="99">编辑新闻</option> 
                                                                                                        <option value="100">讨论版</option> 
                                                                                                        <option value="101">即时通讯</option> 
                                                                                                        <option value="168">公告</option> 
                                                                                                </select>
                                                                                        </div>
                                                                                </div>
                                                                                <div class="layui-col-md3">
                                                                                        <label class="layui-form-label">所在专栏</label>
                                                                                        <div class="layui-input-block">
                                                                                                <select lay-verify="required" name="class" lay-filter="column"> 
                                                                                                        <option></option> 
                                                                                                        <option value="0">发布新闻</option> 
                                                                                                        <option value="99">编辑新闻</option> 
                                                                                                        <option value="100">讨论版</option> 
                                                                                                        <option value="101">即时通讯</option> 
                                                                                                        <option value="168">公告</option> 
                                                                                                </select>
                                                                                        </div>
                                                                                </div>
                                                                                <div class="layui-col-md9">
                                                                                        <label for="L_title" class="layui-form-label">标题</label>
                                                                                        <div class="layui-input-block">
                                                                                                <input type="text" id="L_title" name="title" required lay-verify="required" autocomplete="off" class="layui-input">
                                                                                                <!-- <input type="hidden" name="id" value="{{d.edit.id}}"> -->
                                                                                        </div>
                                                                                </div>
                                                                        </div>
                                                                        <div class="layui-form-item layui-form-text">
                                                                                <div class="layui-input-block">
                                                                                        <textarea id="L_content" name="content" required lay-verify="required" placeholder="编辑内容" class="layui-textarea fly-editor" style="height: 260px;"></textarea>
                                                                                </div>
                                                                        </div>
                                                                        <div class="layui-form-item">
                                                                                <div class="layui-inline">
                                                                                        <label class="layui-form-label">悬赏阳光值</label>
                                                                                        <div class="layui-input-inline" style="width: 190px;">
                                                                                                <select name="experience">
                                                                                                        <option value="20">20</option>
                                                                                                        <option value="30">30</option>
                                                                                                        <option value="50">50</option>
                                                                                                        <option value="60">60</option>
                                                                                                        <option value="80">80</option>
                                                                                                </select>
                                                                                        </div>
                                                                                        <div class="layui-form-mid layui-word-aux">发布后无法更改阳光值</div>
                                                                                </div>
                                                                        </div>
                                                                        <div class="layui-form-item">
                                                                                <button class="layui-btn" lay-filter="*" lay-submit>立即发布</button>
                                                                        </div>
                                                                </form>
                                                        </div>
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