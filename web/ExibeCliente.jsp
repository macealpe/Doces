<%-- 
    Document   : ExibeCliente
    Created on : 25/10/2017, 14:16:03
    Author     : Macealpe
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="beans.Cliente" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
        <link rel="stylesheet" href="css/tabela.css">     
        <title>Admin : Exibindo Clientes</title>
    </head>
    <body>   
        <jsp:useBean id="dao" class="jdbc.ClienteDao"/>
        
        <h1>Lista de Clientes:</h1>
        <table border="1" bordercolor="777777" cellspacing="0">
            <tr bgcolor="#FFFFF0">
                <td>Ordem</td>
                <td>ID</td>
                <td>Nome</td>
                <td>Usuário</td>
                <td>Senha</td>
                <td>Endereço</td>
                <td>Telefone</td>
                <td>Email</td>
                <td>CPF</td>
                <td>RG</td>
                <td>Foto</td>
                <td>Ativo</td> 
            </tr>
            <c:forEach var="cli" items="${dao.listaTodosClientes()}" varStatus="id">
                <tr bgcolor="#${id.count % 2 == 0 ? 'FFFFF0' : 'CDCDC1' }" >
                    <td>${id.count}</td>
                    <td>${cli.id}</td>
                    <td>${cli.nome}</td>
                    <td>${cli.usuario}</td>
                    <td>${cli.senha}</td>
                    <td>${cli.endereco}</td>
                    <td>${cli.telefone}</td>
                    <td>${cli.email}</td>
                    <td>${cli.cpf}</td>
                    <td>${cli.rg}</td>
                    <td><img src="imagens/${cli.foto}"></td>
                    <td>${cli.ativo}</td> 
                </tr>
            </c:forEach>
        </table>
       
    </body>
</html>
