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
        <%-- <//jsp:useBean id="dao" class="jdbc.ProdutoDao"/> --%>
       
        <p><img src="imagens/${produto.imagemProduto}"></p> 
        <p>Id: ${produto.id}</p>
        <p>Descrição: ${produto.descricao}</p>
        <p>Preço Unitário R$: ${produto.precoUnitario}</p>
        <p>Qt. Estoque: ${produto.quantidadeEstoque}</p>
        <p>Ativo: ${produto.ativo}</p> 
        <form action="ProdutoServlet" method="POST">
            <input type="hidden" name="operacao" value="update">
            <input type="hidden" name="id" value="${produto.id}">
            <input type="hidden" name="descricao" value="${produto.descricao}">
            <input type="hidden" name="preco" value="${produto.precoUnitario}">
            <input type="hidden" name="quantidade" value="${produto.quantidadeEstoque}">
            <input type="hidden" name="imagem" value="${produto.imagemProduto}">
            <input type="submit"  class="btn btn-red" value="Alterar Produto" title="Alterar Produto">
        </form>        
    </body>
</html>
