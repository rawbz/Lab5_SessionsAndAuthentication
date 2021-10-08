<%-- 
    Document   : home
    Created on : Oct 7, 2021, 12:15:46 PM
    Author     : rmjba
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p>Hello ${username}</p>
        
        <a href="login?logout" name="operation" value="logout">Log out</a>
    </body>
</html>
