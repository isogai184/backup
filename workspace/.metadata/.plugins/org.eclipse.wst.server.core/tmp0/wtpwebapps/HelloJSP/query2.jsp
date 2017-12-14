<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クエリ情報</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
out.println("こんにちは、" + request.getParameter("nam") + "さん！");
%>
<%
response.setHeader("Refresh", "5; URL=./query1.jsp");
out.print("現在時刻" + new Date());
%>


</body>
</html>