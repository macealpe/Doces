<%-- 
    Document   : login
    Created on : 05/11/2017, 16:54:35
    Author     : Macealpe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">
        <title>Página de Login</title>
    </head>
    <body>
        <form action="" method="">
            <fieldset>
                <legend>LOGIN</legend>
                <p>
                    <label for="usuario">Usuário</label>
                    <input type="text" name="usuario" required> 
                </p>
                
                <p>
                    <label for="senha">Senha:</label>
                    <input type="password" name="senha" required>
                </p>
                <p>
                    <input type="submit" value="Entrar">
                </p>
                <p>
                    <a href="cliente.jsp">Não possui cadastro? Clique aqui.</a>
                </p>
            </fieldset>                
        </form>
    </body>
</html>
