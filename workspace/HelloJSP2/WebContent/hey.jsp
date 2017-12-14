<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>こんにちは</title>
</head>
<body>
<% out.println("こんにちは"); %>

<c:forEach var="name" items="tanaka, satoh, ishii, wada, kuga">
	<p>こんにちは、${name}さん！</p>
</c:forEach>

<c:forEach var="i" begin="1" end="5">
	<h${i}>こんにちは！</h${i}>
</c:forEach>

</body>
</html>