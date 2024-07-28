<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
<%@ page import="IMC.documentation.controller.*"%>
<%@ page import="IMC.documentation.dao.UserDao"%>
<%@ page import="IMC.documentation.dao.*"%>
<%@ page import="IMC.documentation.entity.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IMC-user profile</title>
<style>
.button{
	padding: 9px 25px;
	background-color:navy;
	border: none;
	color:white;
	margin-top:20px;
	border-radius: 10px;
	text-decoration:none;
	cursor: pointer;

}
</style>
</head>
<body style="background-color:#6699CC;">
<header style= "margin-top: 20px;text-align: right;">
        <nav>
            <a class = "button" style ="background-color: red;" href="logout.jsp?">Logout</a>
            
        </nav>
    </header>
	<div class="container">
        <h2 style = "text-align: center">Profile</h2>
        <%
            User user = (User) session.getAttribute("user");
            if (user != null) {
        %>
            <p style = "text-align: center">User Name: <%= user.getUsername() %></p>
            <p style = "text-align: center">Email: <%= user.getEmail() %></p>
        <% } else { %>
            <p style ="font-size: 20px;font-weight: bold;text-align: center;">Please <a class = "button" href="login.jsp">login</a> to view your profile.</p>
        <% } %>
        </ul>
    </div>
</body>
</html>