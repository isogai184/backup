<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ヘッダ情報</title>
</head>
<body>
<table border="1">
<%
Enumeration<String> headers = request.getHeaderNames();

while(headers.hasMoreElements()) {
	String name = (String)headers.nextElement();
%>
	<tr valign="top">
		<th><%= name %></th>
		<td><%= request.getHeader(name) %></td>
	</tr>
<% } %>
</table>

</body>
</html>