<%-- 
    Document   : welcom
    Created on : 15 oct. 2019, 10:40:14
    Author     : nicolas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>This is an HTML Table at your service!</title>
    </head>
    <style>
        <%@ include file="../css/style.css"%>
    </style>
    <body>
        <form method="GET">
            <table border = 1 class="table table-striped tSize">
                <thead>
                    <tr>
                        <th scope="col">Sel</th>
                        <th scope="col">Name</th>
                        <th scope="col">First Name</th>
                        <th scope="col">Home phone</th>
                        <th scope="col">Mobile phone</th>
                        <th scope="col">Office phone</th>
                        <th scope="col">Adress</th>
                        <th scope="col">Postal Code</th>
                        <th scope="col">City</th>
                        <th scope="col">Email</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${employeesList}" var="emp">
                        <tr>
                            <th scope="row"><input type="radio" name="id" value="${emp.id}" checked ></th>
                            <td>${emp.name}</td>
                            <td>${emp.firstName}</td>
                            <td>${emp.telHome}</td>
                            <td>${emp.telMobile}</td>
                            <td>${emp.telPro}</td>
                            <td>${emp.address}</td>
                            <td>${emp.zipCode}</td>
                            <td>${emp.city}</td>
                            <td>${emp.email}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <button class="btn btn-primary" type='submit' name="action" value="delete">Delete</button>
            <button class="btn btn-secondary" type='submit' name="action" value="details">Details</button>
            <button class="btn btn-danger" type='submit' name="action" value="add">Add</button>
        </form>
    </body>
</html>
