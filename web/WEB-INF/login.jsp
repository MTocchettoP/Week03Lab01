<%-- 
    Document   : login
    Created on : Sep 19, 2017, 8:40:00 AM
    Author     : 733196
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Login</title>
    </head>
    <body>
        <c:import url="/includes/header.html" />
        
        <h1>Login</h1>
        <div>
            <form action="login" method="post">
               Username: <input type="text" name="username" value= ${userName}><br>
               Password: <input type="password" name="password"  value= ${password}><br>
                <input type="submit" value="login">
            </form>
            
        </div>
        ${errorMessage}
        <c:import url="/includes/footer.html" />
    </body>
</html>
