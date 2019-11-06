<%-- 
    Document   : welcom
    Created on : 15 oct. 2019, 10:40:14
    Author     : nicolas
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
                    <%
                        ArrayList<Employee> employees = (ArrayList<Employee>) request.getAttribute("employeesList");
                        for (int i = 0; i < employees.size(); i++) {
                    %>
                        <tr>
                            <th scope="row"><input type="radio" name="id" value="<%=employees.get(i).getId()%>" checked ></th>
                            <td><%=employees.get(i).getName()%></td>
                            <td><%=employees.get(i).getFirstName()%></td>
                            <td class="remove"><%=employees.get(i).getTelHome()%></td>
                            <td class="remove"><%=employees.get(i).getTelMob()%></td>
                            <td class="remove"><%=employees.get(i).getTelPro()%></td>
                            <td class="remove"><%=employees.get(i).getAdress()%></td>
                            <td class="remove"><%=employees.get(i).getPostalCode()%></td>
                            <td class="remove"><%=employees.get(i).getCity()%></td>
                            <td class="remove"><%=employees.get(i).getEmail()%></td>
                        </tr>
                    <%}%>
                </tbody>
                </table>
                    <button class="btn btn-primary float-right" type='submit' name="action" value="delete" <%=isDisabled%>>Delete</button>
                <button class="btn btn-secondary float-right" type='submit' name="action" value="details">Details</button>
                <button class="btn btn-danger float-right" type='submit' name="action" value="add" <%=isDisabled%>>Add</button>
            </div>
    </body>
</html>
