<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>你好</title>
</head>
<body>
${identity.adminname }
${info}

<a href="AdminAction.do?method=login&adminid=admin&password=123456">登录</a>
<a href="AdminAction.do?method=update&adminid=admin&adminname=linglian&password=123456">修改</a>
<a href="AdminAction.do?method=insert&adminid=admin&adminname=linglian&password=123456">插入</a>
<a href="AdminAction.do?method=query&adminid=admin">获取</a>
<a href="AdminAction.do?method=remove&adminid=admin">删除</a>
</body>
</html>