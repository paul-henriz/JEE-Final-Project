<%-- 
    !!!!!!!!!!
    TO DO 
    !!!!!!!!!!

    Afficher un message s'il n'y a aucun employé dans la base
--%>

<%@page import="m1se.project.Model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="m1se.project.Model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/674819ebd8.js" crossorigin="anonymous"></script>
        <title>Welcome page to see employees</title>
    </head>
    <style>
        <%@ include file="../css/style.css"%>
    </style>
    <body>
        <nav class="navbar fixed-top navbar-dark bg-dark">
            
            <% User u = (User) request.getSession().getAttribute("user");
            String isDisabled = "disabled";
            if(u.getIsAdmin()) isDisabled = "";
            %>
            <h1 class="navbar-brand ">Hello <b><%=u.getLogin()%></b> ! Your session is active</h1>
            <a href="?action=logout" class="logout"><i class="fas fa-power-off"></i></a>
        </nav>
        
        <form method="POST" action="Controller">
            <div class="tabCenter">
            <table border = 1 class="table table-striped tSize">
                <thead>
                    <tr>
                        <th scope="col">Sel</th>
                        <th scope="col">Name</th>
                        <th scope="col">First Name</th>
                        <th scope="col" class="remove">Home phone</th>
                        <th scope="col" class="remove">Mobile phone</th>
                        <th scope="col" class="remove">Office phone</th>
                        <th scope="col" class="remove">Adress</th>
                        <th scope="col" class="remove">Postal Code</th>
                        <th scope="col" class="remove">City</th>
                        <th scope="col" class="remove">Email</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${employeesList}" var="emp">
                        <tr>
                            <th scope="row"><input type="radio" name="id" value="${emp.id}" checked ></th>
                            <td>${emp.name}</td>
                            <td>${emp.firstName}</td>
                            <td class="remove">${emp.telHome}</td>
                            <td class="remove">${emp.telMobile}</td>
                            <td class="remove">${emp.telPro}</td>
                            <td class="remove">${emp.address}</td>
                            <td class="remove">${emp.zipCode}</td>
                            <td class="remove">${emp.city}</td>
                            <td class="remove">${emp.email}</td>
                        </tr>
                        </c:forEach>
                </tbody>
                </table>
                    <button class="btn btn-primary float-right" type='submit' name="action" value="delete">Delete</button>
                <button class="btn btn-secondary float-right" type='submit' name="action" value="details">Details</button>
                <button class="btn btn-danger float-right" type='submit' name="action" value="add">Add</button>
            </div>
    </body>
</html>
