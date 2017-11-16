<%-- 
    Document   : carrinho
    Created on : 15/11/2017, 17:10:40
    Author     : Macealpe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Silvana Doces e Salgados :: Carrinho</title>
    </head>
    <body>
        <h1>Carrinho de Compras</h1>
        <h1>${report}</h1>
        <table border="1" bordercolor="#777777" cellspacing="0" cellpadding="10">
                <tr bgcolor="#FFFFF0">
                    <td>Ordem</td>
                    <td>Imagem</td>
                    <td>Código</td>
                    <td>Produto</td>
                    <td>Categoria</td>
                    <td>Preço</td>
                </tr>
                <c:forEach var="produto" items="${dao.listaTodosProdutos()}" varStatus="id">
                    <tr bgcolor="#${id.count % 2 == 0 ? 'FFFFF0' : 'CDCDC1' }" >
                        <td>${id.count}</td>
                        <td><img src="imagens/${produto.imagemProduto}"></td> 
                        <td>${produto.id}</td>
                        <td>${produto.descricao}</td>
                        <td>${produto.categoria}</td>
                        <td>${produto.precoUnitario}</td>                        
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
