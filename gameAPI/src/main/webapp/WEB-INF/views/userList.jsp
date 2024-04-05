<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
		<tr>
			<th>유저 번호</th>
			<th>유저 이름</th>
			<th>유저 아이디</th>
			<th>유저 비밀번호</th>
			<th>게임 닉네임</th>
		</tr>
		<c:forEach var="list" items="${list }">
		<tr>
			<td>${list.u_num }</td>
			<td>${list.u_name }</td>
			<td>${list.u_id }</td>
			<td>${list.u_pwd }</td>
			<td>${list.u_gamename }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>