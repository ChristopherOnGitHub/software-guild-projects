<%-- 
    Document   : login
    Created on : Nov 29, 2016, 11:19:28 AM
    Author     : ahill
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form Page</title>
    </head>
    <body>
        <!-- Unless you are replacing the security with something else
            to utilize the spring form authentication you HAVE to go to the below
            location (or action) to process your credentials. -->
        <form method="POST" action="j_spring_security_check">
            Username: <input name="j_username" type="text"/><br/>
            Password: <input name="j_password" type="password"/><br/>
            <input name="commit" type="submit" value="Sign In" />
        </form>
    </body>
</html>
