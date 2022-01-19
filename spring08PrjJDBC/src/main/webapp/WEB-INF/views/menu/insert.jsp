<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Menu Insert 페이지입니다.</h1>
	
	<form action="insert" method="post">
	메뉴 이름 :<input type="text" name="menu"><br>
	가격: <input type="text" name="price">
	<input type="submit" value="메뉴등록">
	</form>
</body>
</html>