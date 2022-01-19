<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>홈페이지!!!!</h1>
	<h1>로그인 성공여부 입니다 : ${sessionScope.loginUser != null}</h1>
	<h1>로그인 성공여부 입니다 : ${loginUser != null}</h1>
	<h1>로그인 성공여부 입니다 : ${not empty loginUser}</h1>
	
	<h1>${loginUser.nick}</h1>
</body>
</html>