<%-- 
    Document   : details
    Created on : 21 oct. 2019, 22:47:43
    Author     : nicolas
--%>

<%@page import="m1se.project.Model.User"%>
<%@page import="m1se.project.Model.Employee"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/674819ebd8.js" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <style>
        <%@ include file="../css/style.css"%>
    </style>
    <body>
        <nav class="navbar fixed-top navbar-dark bg-dark">
            <% User u = (User) request.getSession().getAttribute("user");%>
            <h1 class="navbar-brand "><%=u.getLogin()%></h1>
            <a href="" class="logout"><i class="fas fa-power-off"></i></a>
        </nav>
        <form class="detailForm">
            <%
                Employee em = (Employee) request.getAttribute("emp");
                if (em!=null) {
            %>
            <h3>${emp.firstName} ${emp.name}</h3>
            <%
                } else {
            %>
            <h3>Create User</h3>
            <%
                }
            %>
            <hr>
            <div class="form-group row">
                <label for="nom" class="col-sm-2 col-form-label">Nom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nom" value="${emp.name}" name="name">
                </div>
            </div>
            <div class="form-group row">
                <label for="prenom" class="col-sm-2 col-form-label">Prénom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="prenom" value="${emp.firstName}" name="firstname">
                </div>
            </div>
            <div class="form-group row">
                <label for="teldom" class="col-sm-2 col-form-label">Tel Dom</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="teldom" value="${emp.telHome}" name="teldom">
                </div>
            </div>
            <div class="form-group row">
                <label for="telpro" class="col-sm-2 col-form-label">Tel Pro</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="telpro" value="${emp.telPro}" name="telpro">
                </div>
            </div>
            <div class="form-group row">
                <label for="telmob" class="col-sm-2 col-form-label">Tel Mob</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="telmob" value="${emp.telMobile}" name="telmob">
                </div>
            </div>
            <div class="form-group row">
                <label for="adresse" class="col-sm-2 col-form-label">Adresse</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="adresse" value="${emp.address}" name="address">
                </div>
            </div>
            <div class="form-group row">
                <label for="zip" class="col-sm-2 col-form-label">Code Postal</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="zip" value="${emp.zipCode}" name="zip">
                </div>
            </div>
            <div class="form-group row">
                <label for="ville" class="col-sm-2 col-form-label">Ville</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="ville" value="${emp.city}" name="city">
                </div>
            </div>
            <div class="form-group row">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="email" value="${emp.email}" name="email">
                </div>
            </div>
            <button class="btn btn-secondary float-right" type='submit' name="action" value="cancel">Cancel</button>
            <%
                if (em!=null) {
            %>
            <button class="btn btn-primary float-right" type='submit' name="action" value="save">Save</button>
            <%
                } else {
            %>
            <button class="btn btn-primary float-right" type='submit' name="action" value="create">Create</button>
            <%
                }
            %>
        </form>
    </body>
</html>
