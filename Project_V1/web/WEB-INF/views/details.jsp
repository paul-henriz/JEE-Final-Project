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
            <h1 class="navbar-brand ">Hello <b><%=u.getLogin()%></b> ! Your session is active</h1>
            <a href="?action=logout" class="logout"><i class="fas fa-power-off"></i></a>
        </nav>
            <form class="detailForm" method="POST" action="Controller">
            <%
                String isDisabled = "disabled";
                if(u.getIsAdmin()) isDisabled = "";
                Boolean create = false;
                Employee em = (Employee) request.getAttribute("emp");
                if (em!=null) {
                   request.setAttribute("id", em.getId());
            %>
            <h3><%=em.getFirstName()%> <%=em.getName()%></h3>
            <%
                } else {
                   em = new Employee();
                   create = true;
            %>
            <h3>Create User</h3>
            <%
                }
            %>
            <hr>
            <input type="hidden" name="id" value="<%=em.getId()%>">
            <div class="form-group row">
                <label for="nom" class="col-sm-2 col-form-label">Nom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nom" value="<%if(em.getName()!=null){%><%=em.getName()%><%}%>" name="name" <%=isDisabled %> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="prenom" class="col-sm-2 col-form-label">Prénom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="prenom" value="<%if(em.getFirstName()!=null){%><%=em.getFirstName()%><%}%>" name="firstname" <%=isDisabled %> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="teldom" class="col-sm-2 col-form-label">Tel Dom</label>
                <div class="col-sm-10">
                  <input type="tel" class="form-control" id="teldom" value="<%if(em.getTelHome()!=null){%><%=em.getTelHome()%><%}%>" name="teldom" <%=isDisabled %> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="telpro" class="col-sm-2 col-form-label">Tel Pro</label>
                <div class="col-sm-10">
                  <input type="tel" class="form-control" id="telpro" value="<%if(em.getTelPro()!=null){%><%=em.getTelPro()%><%}%>" name="telpro" <%=isDisabled %> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="telmob" class="col-sm-2 col-form-label">Tel Mob</label>
                <div class="col-sm-10">
                    <input type="tel" class="form-control" id="telmob" value="<%if(em.getTelMobile()!=null){%><%=em.getTelMobile()%><%}%>" name="telmob" <%=isDisabled %> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="adresse" class="col-sm-2 col-form-label">Adresse</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="adresse" value="<%if(em.getAddress()!=null){%><%=em.getAddress()%><%}%>" name="address" <%=isDisabled %> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="zip" class="col-sm-2 col-form-label">Code Postal</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="zip" value="<%if(em.getZipCode()!=null){%><%=em.getZipCode()%><%}%>" name="zip" <%=isDisabled %> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="ville" class="col-sm-2 col-form-label">Ville</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="ville" value="<%if(em.getCity()!=null){%><%=em.getCity()%><%}%>" name="city" <%=isDisabled %> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="email" value="<%if(em.getEmail()!=null){%><%=em.getEmail()%><%}%>" name="email" <%=isDisabled %> required>
                </div>
            </div>
            <button class="btn btn-secondary float-right" type='submit' name="action" value="cancel">Cancel</button>
            <%
                if (create == false) {
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
