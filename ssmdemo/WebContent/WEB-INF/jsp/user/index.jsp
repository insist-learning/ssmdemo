<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse:collapse;
	}
	td {
		width:200px;
		text-align:center;
	}
	#all {
		width:800px;
		text-align:center;
	}
</style>
</head>
<body>
<a href="/ssmdemo/user/add">添加用户</a>
	<table border="1">
		<caption>用户信息</caption>
		<tr>
			<td>id</td>
			<td>用户名</td>
			<td>密码</td>
			<td>年龄</td>
			<td>详情</td>
		</tr>
		<c:forEach items="${ user }" varStatus="i" var="item">
			<tr>
				<td><c:out value="${ item.id }"></c:out></td>
				<td><c:out value="${ item.name }"></c:out></td>
				<td><c:out value="${ item.password }"></c:out></td>
				<td><c:out value="${ item.age }"></c:out></td>
				<td>
					<a href="/ssmdemo/user/look/${ item.id }">查看</a>
					<a href="/ssmdemo/user/update/${ item.id }">修改</a>
					<a href="/ssmdemo/user/delete/${ item.id }">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div id="all">
		总共${ count }条数据&nbsp;
	    <a href = "/ssmdemo/user/getAllUser?page_current=1" >首页</a>  
	    <a href = "/ssmdemo/user/getAllUser?page_current=${ page_current-1<=0?page_current:page_current-1 }" >上一页</a>  
	    <a href = "/ssmdemo/user/getAllUser?page_current=${ page_current+1>=pageCount?pageCount:page_current+1 }" >下一页</a>  
	    <a href = "/ssmdemo/user/getAllUser?page_current=${ pageCount }" >尾页</a>
                          第${ page_current }页/共${ pageCount }页 
	</div>
	
</body>
</html>