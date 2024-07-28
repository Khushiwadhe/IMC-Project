<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
 <form action="user" method="post">
    <fieldset>
    <legend>Enter Your Info.</legend>
        <input type="hidden" name="action" value="register">
        <input type="text" name="username" placeholder="Enter Username"><br>
        <input type="text" name="email" placeholder="Enter Email"><br>
        <input type="password" name="password" placeholder="Enter Password"><br>
        <input type="text" name="role" placeholder="Enter Role."><br>
        <input type="text" name="phone" placeholder="Enter Phone no."><br>
        <input class="button" id="submit" type="submit" value="Register"><br>
        <p>Already have an account!<a id="login" href="login.jsp">Login</a></p>
    </fieldset>    
    </form>
</body>
</html>