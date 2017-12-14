<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.naming.*, javax.sql.*, com.internousdev.hellojsp.util.DBConnector" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>データベースへの接続</title>
</head>
<body>
<%
//Context context = new InitialContext();
//DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/selfjsp");
//Connection db = ds.getConnection();
//db.close();

DBConnector db = new DBConnector();
Connection con = db.getConnection();
con.close();
%>
データベースへの接続に成功しました。
</body>
</html>