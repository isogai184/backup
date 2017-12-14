<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
HashMap<String, String> map = new HashMap<String, String>();

map.put("JSP", "JavaServlet Pages");
map.put("PHP", "PHP:Hypertext Preprpcessor");
map.put("ASP.NET", "Active Server Page .NET");

pageContext.setAttribute("arch", map);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>タグライブラリ</title>
</head>
<body>
<ul>
<c:forEach var="item" items="${arch }">
	<li>${item.key }: ${item.value }</li>
</c:forEach>
</ul>

</body>
</html>