<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Ȩ������!!!!</h1>
	<h1>�α��� �������� �Դϴ� : ${sessionScope.loginUser != null}</h1>
	<h1>�α��� �������� �Դϴ� : ${loginUser != null}</h1>
	<h1>�α��� �������� �Դϴ� : ${not empty loginUser}</h1>
	
	<h1>${loginUser.nick}</h1>
</body>
</html>