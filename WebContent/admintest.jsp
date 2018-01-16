<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${info}
<a href="${pageContext.request.contextPath}/AdminAction.do?method=queryAll&page=2">查询</a>
 <table id="customers">
		<tr>
			<th><input class="allCheck" type="checkbox" name="allCheck"/>全选</th>
			<th>序号</th>
			<th>用户编号</th>
			<th>用户名</th>	
			<th>操作</th>		
			<th class="someCheck-open">操作</th>
		</tr>
		<c:forEach items="${pageUser}" var="n" varStatus="i">
		<tr>
			<td><input class="Check" type="checkbox" name="Check" /></td>
			<td>${i.index+1 }</td>
			<td>${n.userId}</td>
			<td>${n.name}</td>			
			<td class="someCheck-open">
				<a href="">删除</a>
				<a href="">修改</a>
			</td>
		</tr>
		</c:forEach>
		<tr>
		<a href="">删除</a>
		</tr>
	</table>
	
</body>
</body>
</html>