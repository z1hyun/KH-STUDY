<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<h1>home PAGE</h1>
		
		<h1>�α��� �������� : ${sessionScope.loginUser != null}</h1>
		<h1>�α��� �������� : ${loginUser != null }</h1>
		<h1>�α��� �������� : ${not empty loginUser}</h1>
</body>
</html>