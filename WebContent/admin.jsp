<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>登入</title>
                <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
                <meta name="keywords" content="SunnyNews">
                <meta name="description" content="SunnyNews 向阳小队旗舰之作">
                <link rel="stylesheet" type="text/css" href="comm/layui/css/layui.css" />
                <link rel="stylesheet" type="text/css" href="comm/layui/global.css" />
                <link rel="stylesheet" type="text/css" href="comm/layui/css/modules/layer/default/layer.css" />
                <link rel="stylesheet" type="text/css" href="comm/layer/theme/default/layer.css" />
                <script src="comm/layui/layui.js" charset="utf-8"></script>
                <script src="comm/jquery/jquery-2.1.4.js"></script>
                <script src="comm/layer/layer.js"></script>
        <c:if test="${not empty info}">
                <script>layer.msg('${info}')</script>
                <c:remove var="info" />
        </c:if>
</head>
<body>

        <div class="fly-header layui-bg-black">
                <div class="layui-container">
                        <a class="fly-logo" href="/">
                                <img src="img/logo.png" style="height: 29px;padding-left:-10px;" alt="logo">
                        </a>
                        <ul class="layui-nav fly-nav layui-hide-xs">
                                <li class="layui-nav-item layui-this">
                                        <a href="message.jsp"><i class="iconfont icon-jiaoliu"></i>通知</a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="index.jsp"><i class="layui-icon">&#xe705;</i>我发布的</a>
                                </li>
                                <li class="layui-nav-item">
                                        <a href="../news/newsPos.jsp" target="_blank"><i class="layui-icon">&#xe609;</i>写新闻</a>
                                </li>
                        </ul>

                        <ul class="layui-nav fly-nav-user">

                                <c:if test="${empty sessionScope.user}">
                                        <!-- 未登入的状态 -->
                                        <li class="layui-nav-item">
                                                <a class="iconfont icon-touxiang layui-hide-xs" href="ogin.jsp"></a>
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
                                <c:if test="${not empty sessionScope.user}">
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
                                </c:if> 
                        </ul>
                </div>
        </div>

        <div class="layui-container fly-marginTop">
                <div class="fly-panel fly-panel-user" pad20>
                        <div class="layui-tab layui-tab-brief" lay-filter="user">
                                <ul class="layui-tab-title">
                                        <li class="layui-this">登入</li>
                                        <li><a href="reg.jsp">注册</a></li>
                                </ul>
                                <div class="layui-form layui-tab-content" id="LAY_ucm" style="padding: 20px 0;">
                                        <div class="layui-tab-item layui-show">
                                                <div class="layui-form layui-form-pane">
                                                        <form action="${pageContext.request.contextPath}/UserAction.do?method=login" method="post">
                                                                <div class="layui-form-item">
                                                                        <label for="L_email" class="layui-form-label">邮箱</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="text" id="L_email" name="email" required lay-verify="required" autocomplete="off" class="layui-input">
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <label for="L_pass" class="layui-form-label">密码</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="password" id="L_pass" name="pass" required lay-verify="required" autocomplete="off" class="layui-input">
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <label for="L_vercode" class="layui-form-label">人类验证</label>
                                                                        <div class="layui-input-inline">
                                                                                <input type="text" id="L_vercode" name="vercode" required lay-verify="required" placeholder="请回答后面的问题" autocomplete="off" class="layui-input">
                                                                        </div>
                                                                        <div class="layui-form-mid">
                                                                                <span style="color: #c00;"><img src="../token.do"></img></span>
                                                                        </div>
                                                                </div>
                                                                <div class="layui-form-item">
                                                                        <button class="layui-btn" lay-submit>立即登录</button>
                                                                        <span style="padding-left:20px;">
                                                                                <a href="forget.jsp">忘记密码？</a>
                                                                        </span>
                                                                </div>
                                                                <div class="layui-form-item fly-form-app">
                                                                        <span>或者使用社交账号登入</span>
                                                                        <a href="" onclick="layer.msg('正在通过QQ登入', {icon: 16, shade: 0.1, time: 0})" class="iconfont icon-qq" title="QQ登入"></a>
                                                                        <a href="" onclick="layer.msg('正在通过微博登入', {icon: 16, shade: 0.1, time: 0})" class="iconfont icon-weibo" title="微博登入"></a>
                                                                </div>
                                                        </form>
                                                </div>
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