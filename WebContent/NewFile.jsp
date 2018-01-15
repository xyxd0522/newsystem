<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <title>Insert title here</title>
        </head>
        <body>
                ${pageNews}
                ${info}
                <a href="${pageContext.request.contextPath}/UserAction.do?method=login&email=123&pass=123&vercode=${sessionScope.token}">login</a>
                <a href="${pageContext.request.contextPath}/UserAction.do?method=insert&username=凌恋">asdasd</a>
                <form action="UserAction.do?method=insert" method="POST">
                        <input name="username"/>
                        <button type="submit">阿萨德</button>
                </form>
                <form action="${pageContext.request.contextPath}/UserAction.do?method=insert"  method="post">
                        <div class="layui-form-item">
                                <label for="L_email" class="layui-form-label">邮箱</label>
                                <div class="layui-input-inline">
                                        <input type="text" id="L_email" name="email" required lay-verify="email" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid layui-word-aux">将会成为您唯一的登入名</div>
                        </div>
                        <div class="layui-form-item">
                                <label for="L_username" class="layui-form-label">昵称</label>
                                <div class="layui-input-inline">
                                        <input type="text" id="L_username" name="username" required lay-verify="required" autocomplete="off" class="layui-input">
                                </div>
                        </div>
                        <div class="layui-form-item">
                                <label for="L_pass" class="layui-form-label">密码</label>
                                <div class="layui-input-inline">
                                        <input type="password" id="L_pass" name="pass" required lay-verify="required" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid layui-word-aux">6到16个字符</div>
                        </div>
                        <div class="layui-form-item">
                                <label for="L_repass" class="layui-form-label">确认密码</label>
                                <div class="layui-input-inline">
                                        <input type="password" id="L_repass" name="repass" required lay-verify="required" autocomplete="off" class="layui-input">
                                </div>
                        </div>
                        <div class="layui-form-item">
                                <label class="layui-form-label">联动选择框</label>
                                <div class="layui-input-inline">
                                        <select name="quiz1">
                                                <option value="">请选择省</option>
                                                <option value="浙江" selected="">浙江省</option>
                                                <option value="江西省">江西省</option>
                                                <option value="福建省">福建省</option>
                                        </select>
                                </div>
                                <div class="layui-input-inline">
                                        <select name="quiz2">
                                                <option value="">请选择市</option>
                                                <option value="杭州">杭州</option>
                                                <option value="宁波" disabled="">宁波</option>
                                                <option value="温州">温州</option>
                                                <option value="温州">台州</option>
                                                <option value="温州">绍兴</option>
                                        </select>
                                </div>
                                <div class="layui-input-inline">
                                        <select name="quiz3">
                                                <option value="">请选择县/区</option>
                                                <option value="西湖区">西湖区</option>
                                                <option value="余杭区">余杭区</option>
                                                <option value="拱墅区">临安市</option>
                                        </select>
                                </div>
                                <div class="layui-form-mid layui-word-aux">此处只是演示联动排版，并未做联动交互</div>
                        </div>
                        <div class="layui-form-item">
                                <label for="L_vercode" class="layui-form-label">人类验证</label>
                                <div class="layui-input-inline">
                                        <input type="text" id="L_vercode" name="vercode" required lay-verify="required" placeholder="请回答后面的问题" autocomplete="off" class="layui-input">
                                </div>
                                <div class="layui-form-mid">
                                        <span style="color: #c00;"><img src="token.do"></span>
                                </div>
                        </div>
                        <div class="layui-form-item">
                                <button class="layui-btn"  lay-submit>立即注册</button>
                        </div>
                        <div class="layui-form-item fly-form-app">
                                <span>或者直接使用社交账号快捷注册</span>
                                <a href="" onclick="layer.msg('正在通过QQ登入', {icon: 16, shade: 0.1, time: 0})" class="iconfont icon-qq" title="QQ登入"></a>
                                <a href="" onclick="layer.msg('正在通过微博登入', {icon: 16, shade: 0.1, time: 0})" class="iconfont icon-weibo" title="微博登入"></a>
                        </div>
                </form>
        </body>
</html>