<%-- 
    Document   : index
    Created on : 12/03/2024, 08:30:16
    Author     : 05274565190
--%>

<%@page import="model.PerfilDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Perfil"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1,
              user-scalable=no" name="viewport"/>
        <link rel="stylesheet" href="./static/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="./static/bootstrap/bootstrap-theme.min.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="container">
            <%@include file="banner.jsp" %>
            <%@include file="menu.jsp" %>
        <h1>Lista de Perfis</h1>
        <a href="form_perfil.jsp" class="btn btn-primary">Novo Cadastro</a>
        <table class="table table-hover">
            <tr>
                <th>ID</th>
                <th>Nome Peril</th>
                <th>Opções</th> 
            </tr>
        <%
            ArrayList<Perfil> lista = new ArrayList<>();
            try{
                PerfilDAO pDAO = new PerfilDAO();
                lista = pDAO.getLista();
            }catch(Exception e){
                out.print(e);
            }
                for(Perfil p:lista){
        %>
        
        <jsp:useBean class="model.PerfilDAO" id="pDAO"/>
        
        <tr>
                <td><%= p.getIdPerfil() %></td>
                <td><%= p.getNome() %></td>
                <td><%= p.getOpcoes() %></td>
            <td>
                <a class="btn btn-primary" href="#">
                    <i class="glyphicon glyphicon-pencil"></i>
                </a>
                <button class="btn btn-danger">
                    <i class="glyphicon glyphicon-trash"></i>
                </button>
            </td>
        </tr>
        <% } %>


            
        </div>
    </body>
</html>
