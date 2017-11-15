<%-- 
    Document   : ExibeProduto
    Created on : 11/11/2017, 22:15:11
    Author     : Macealpe
--%>

<%@page import="beans.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informações do Produto</title>
    </head>
    <body>
        <h1>Dados do Produto:</h1>
        <% Produto produto = (Produto) request.getAttribute("produtocadastrado"); %>
        <p><%= "Id do Produto: " + produto.getId() %></p>
        <p><%= "Descrição do Produto: " + produto.getDescricao() %></p>
        <p><%= "Preço do Produto: " + produto.getPrecoUnitario() %></p>
        <p><%= "Quantidade em Estoque: " + produto.getQuantidadeEstoque() %></p>
        <p><%= "Imagem do Produto: " + produto.getImagemProduto() %></p>
        <p><%= "Produto Ativo: " + produto.isAtivo() %></p>        
    </body>
</html>
