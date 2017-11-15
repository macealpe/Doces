<%-- 
    Document   : editaproduto
    Created on : 15/11/2017, 12:39:37
    Author     : Macealpe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edição de Produto</title>
    </head>
    <body>       
        <form action="ProdutoServlet" method="POST" accept-charset="UTF-8">
            <fieldset>
                <legend>Editar Produto</legend>
                <p>
                    <label for="id">Id:</label>
                    <input type="number" name="id" value="${produto.id}" required>
                </p>
                <p>
                    <label for="descricao">Descrição:</label>
                    <input type="text" name="descricao" value="${produto.descricao}" required>
                </p>
                <p>
                    <label for="preco">Preço:</label>
                    <input type="number" name="preco" step="0.01" value="${produto.precoUnitario}" required>
                </p>
                <p>
                    <label for="quantidade">Quantidade de entrada:</label>
                    <input type="number" name="quantidade" value="${produto.quantidadeEstoque}" required>
                </p>
                <p>
                    <label for="imagem">Imagem do Produto:</label>
                    <input type="file" name="imagem" value="${produto.imagemProduto}" required>
                </p>
                <p>
                    <input type="hidden" name="operacao" value="update"> 
                    <input type="submit" value="Atualizar Produto">
                </p>
            </fieldset>
        </form>
    </body>
</html>
