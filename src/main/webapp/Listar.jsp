<%-- 
    Document   : Listar
    Created on : 13/12/2017, 14:12:36
    Author     : wellington
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuários</title>
        <link type="text/css" rel="stylesheet" href="<c:url value="/css/style.css" />">
    </head>
    <body>
    <legend>Lista de Usuários</legend>

    <c:forEach var="usuario" items="${usuarios}" varStatus="i">		
          <div class="card">
            <img src="https://www.w3schools.com/w3images/team2.jpg" alt="John" style="width:100%">
            <h1>John Doe</h1>
            <p class="title">CEO & Founder, Example</p>
            <p>Harvard University</p>
            <a href="#"><i class="fa fa-dribbble"></i></a> 
            <a href="#"><i class="fa fa-twitter"></i></a> 
            <a href="#"><i class="fa fa-linkedin"></i></a> 
            <a href="#"><i class="fa fa-facebook"></i></a> 
            <p><button>Contact</button></p>
            
        </div>
</c:forEach>


</body>
</html>