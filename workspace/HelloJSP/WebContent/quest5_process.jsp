<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.util.*, javax.naming.*, com.internousdev.hellojsp.util.DBConnector" %>
<%
request.setCharacterEncoding("UTF-8");
Connection con = null;
PreparedStatement ps = null;
try {
	DBConnector db = new DBConnector();
	con = db.getConnection();
	ps = con.prepareStatement("insert into book(isbn, name, price, publish, published) values (?, ?, ?, ?, ?)");
	ps.setString(1, request.getParameter("isbn"));
	ps.setString(2, request.getParameter("name"));
	ps.setString(3, request.getParameter("price"));
	ps.setString(4, request.getParameter("publish"));
	ps.setString(5, request.getParameter("published"));
	ps.executeUpdate();
} catch (Exception e) {
	throw new ServletException(e);
} finally {
	try {
		if(ps != null) {
			ps.close();
		}
		if(con != null) {
			con.close();
		}
	} catch (Exception e) {}
}
response.sendRedirect("quest5_form.jsp");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>