<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>MENU LIST입니다.</h1>
	
	<table border="1">
		<c:forEach items="${list}" var="m">
		<tr>
			<td>${m.menu}</td>
			<td>${m.price}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>