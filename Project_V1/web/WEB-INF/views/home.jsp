<%-- 
    Document   : home
    Created on : 15 oct. 2019, 08:57:02
    Author     : nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <style>
     <%@ include file="../css/style.css"%>
    </style>
    <body>
        <form class="formLogin" method="POST">
            <h4 class="loginTitle">Login</h3>
            <div class="padForm">
                <div class="form-group">
                  <input type="text" class="form-control" name="loginSent" placeholder="Enter login">
                </div>
                <div class="form-group">
                  <input type="password" class="form-control" name="passwordSent" placeholder="Enter Password">
                </div>
                <button type="submit" class="btn btn-primary" name="action" value="login">Login</button>
            </div>
        </form>
    </body>
</html>
