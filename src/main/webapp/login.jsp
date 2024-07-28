<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="user" method="post">
    <fieldset>
    <legend>Input Login Info.</legend>
        <input type="hidden" name="action" value="login">
        <input type="text" name="email" placeholder="Enter Email"><br>
        <input type="password" name="password" placeholder="Enter Password"><br>
        <input class="button" id="submit" type="submit" value="Login"><br>
        <p>If you are new here!<a id="register" href="register.jsp">Register</a></p>
    </fieldset>    
    </form>

</body>
</html>