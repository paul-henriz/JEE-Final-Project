<%-- 
    Document   : details
    Created on : 21 oct. 2019, 22:47:43
    Author     : nicolas
--%>

<%@page import="m1se.project.Model.User"%>
<%@page import="m1se.project.Model.Employee"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
            <c:set var="u" value="${ user }" />
            
            <h1 class="navbar-brand ">Hello <b>${u.login}</b> ! Your session is active</h1>
            <a href="?action=logout" class="logout"><i class="fas fa-power-off"></i></a>
        </nav>
            <form class="detailForm" method="POST" action="Controller">
                <c:set var="em" value="${ emp }" />
                <c:choose>
                    <c:when test="${em ne null}"> 
                        <h3>${em.firstName} ${em.name}</h3>
                    </c:when>
                    <c:otherwise>
                        <h3>Create User</h3>
                    </c:otherwise>
                </c:choose>
            <hr>
            <input type="hidden" name="id" value="${em.id}">
            <div class="form-group row">
                <label for="nom" class="col-sm-2 col-form-label">Nom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nom" value="${em.name}" name="name" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="prenom" class="col-sm-2 col-form-label">Prénom</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="prenom" value="${em.firstName}" name="firstname" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="teldom" class="col-sm-2 col-form-label">Tel Dom</label>
                <div class="col-sm-10">
                  <input type="tel" class="form-control" id="teldom" value="${em.telHome}" name="teldom" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="telpro" class="col-sm-2 col-form-label">Tel Pro</label>
                <div class="col-sm-10">
                  <input type="tel" class="form-control" id="telpro" value="${em.telMob}" name="telpro" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="telmob" class="col-sm-2 col-form-label">Tel Mob</label>
                <div class="col-sm-10">
                    <input type="tel" class="form-control" id="telmob" value="${em.telPro}" name="telmob" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="adresse" class="col-sm-2 col-form-label">Adresse</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="adresse" value="${em.adress}" name="address" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="zip" class="col-sm-2 col-form-label">Code Postal</label>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="zip" value="${em.postalCode}" name="zip" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="ville" class="col-sm-2 col-form-label">Ville</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="ville" value="${em.city}" name="city" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <div class="form-group row">
                <label for="email" class="col-sm-2 col-form-label">Email</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="email" value="${em.email}" name="email" <c:if test="${!u.isAdmin}">disabled</c:if> required>
                </div>
            </div>
            <a href="Controller" class="cancel">
                <button class="btn btn-secondary float-right" type='button' name="action" value="cancel">Cancel</button>
            </a>
                <c:if test="${u.isAdmin eq true}">
                    <c:choose>
                        <c:when test="${em ne null}">
                            <button class="btn btn-primary float-right" type='submit' name="action" value="save">Save</button>
                        </c:when>
                        <c:otherwise>
                            <button class="btn btn-primary float-right" type='submit' name="action" value="create">Create</button>
                        </c:otherwise>
                    </c:choose>
                </c:if>
        </form>
    </body>
</html>
