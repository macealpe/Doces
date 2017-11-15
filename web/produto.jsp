<%-- 
    Document   : produto
    Created on : 04/11/2017, 15:29:56
    Author     : Macealpe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produto</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <form action="ProdutoServlet" method="POST" accept-charset="UTF-8">
            <!--<input type="text" id="part" name="part" required pattern="[A-Z]{3}[0-9]{4}"
       title="Part numbers consist of 3 uppercase letters followed by 4 digits."/>
            <input type="submit" formnovalidate value="Save">
            <input type="submit" value="Submit"> -->
            <fieldset>
                <legend>CADASTRO DE PRODUTO</legend>
                <p>
                    <label for="descricao">Descrição:</label>
                    <input type="text" name="descricao" required>
                </p>
                <p>
                    <label for="preco">Preço:</label>
                    <input type="number" name="preco" step="0.01" required>
                </p>
                <p>
                    <label for="quantidade">Quantidade de entrada:</label>
                    <input type="number" name="quantidade" required>
                </p>
                <p>
                    <label for="imagem">Imagem do Produto:</label>
                    <input type="file" name="imagem" required>
                </p>
                <p>
                    <input type="submit" value="Cadastrar">
                </p>
            </fieldset>
        </form>
    </body>
</html>