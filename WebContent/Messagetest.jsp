<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>email</title>
<script type="text/javascript" src="js/jquery-2.1.4.js" ></script>
<style type="text/css">
#customers
  {
  font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;
  width:100%;
  border-collapse:collapse;
  }

#customers td, #customers th 
  {
  font-size:1em;
  border:1px solid #98bf21;
  padding:3px 7px 2px 7px;
  }

#customers th 
  {
  font-size:1.1em;
  text-align:left;
  padding-top:5px;
  padding-bottom:4px;
  background-color:#A7C942;
  color:#ffffff;
  } 
  a
  {
  text-decoration:none;
  color:#000;
  }
  .someCheck-open{
  display:display;
  }
  .allCheck{
  width:16px;
  height:16px;
  }
  tr:hover{
  background-color: #eee;
  }

</style>
</head>
<body>
	<table id="customers">
		<tr>
			<th><input class="allCheck" type="checkbox" name="allCheck"/>全选</th>
			<th>序号</th>
			<th>内容</th>
			<th>时间</th>
			<th>发布人</th>
			<th class="someCheck-open">操作</th>
		</tr>
		<c:forEach items="${pageMessages}" var="n" varStatus="i">
		<tr>
			<td><input class="Check" type="checkbox" name="Check" /></td>
			<td>${i.index+1 }</td>
			<td><a href="AllshowMessage.jsp?body=${n.body}&time=${n.time}&user=${n.emailId}">${n.body}</a></td>
			<td>${n.time}</td>
			<td>${n.emailId }</td>
			<td class="someCheck-open">
				<a class="deleteNews" href="MessageAction.do?method=remove&emailId=${n.emailId}">删除</a>
			</td>
		</tr>
		</c:forEach>
		<tr>
		${info}
		<a href="${pageContext.request.contextPath}/MessageAction.do?method=query&page=1">查询</a>
		</tr>
	</table>
	</form>
</body>
<script type="text/javascript">
$(document).ready(function(){
	var $
	
});
</script>
</html>