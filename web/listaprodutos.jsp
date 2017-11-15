<%-- 
    Document   : listaprodutos
    Created on : 12/11/2017, 17:38:42
    Author     : Macealpe
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="beans.Produto" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/tabela.css"> 
        <title>Admin : Exibindo Produtos</title>
    </head>
    <body>
        <jsp:useBean id="dao" class="jdbc.ProdutoDao"/>
        <div>
        <h1>Lista de Produtos:</h1>
        <table border="1" bordercolor="777777" cellspacing="0" cellpadding="10">
            <tr bgcolor="#FFFFF0">
                <td>Ordem</td>
                <td>ID</td>
                <td>Descrição</td>
                <td>Preço</td>
                <td>Estoque</td>               
                <td>Imagem</td>
                <td>Ativo</td> 
            </tr>
            <c:forEach var="produto" items="${dao.listaTodosProdutos()}" varStatus="id">
                <tr bgcolor="#${id.count % 2 == 0 ? 'FFFFF0' : 'CDCDC1' }" >
                    <td>${id.count}</td>
                    <td>${produto.id}</td>
                    <td>${produto.descricao}</td>
                    <td>${produto.precoUnitario}</td>
                    <td>${produto.quantidadeEstoque}</td>
                    <td><img src="imagens/${produto.imagemProduto}"></td>   
                    <td>${produto.ativo}</td>              
                </tr>
            </c:forEach>
        </table>
        </div>
    </body>
</html>
