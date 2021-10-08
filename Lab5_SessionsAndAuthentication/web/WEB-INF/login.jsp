<%-- 
    Document   : login
    Created on : Oct 7, 2021, 12:15:38 PM
    Author     : rmjba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="POST">
            <div>
                <label>Username: ${username}</label>
                <input type="text" name="username" value="">
            </div>
            <div>
                <label>Password: </label>
                <input type="password" name="password" value="">
            </div>
            <input type="submit" value="Log in">
        </form>
        <p>${message}</p>
    </body>
</html>
