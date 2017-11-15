<%-- 
    Document   : cadastrocliente
    Created on : 25/10/2017, 14:05:01
    Author     : Macealpe
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro do Cliente</title>
        <link rel="stylesheet" href="css/style.css">        
    </head>
    <body>        
        <form action="ClienteServlet" method="POST"  accept-charset="UTF-8">
            <fieldset>
                <legend>CADASTRO DE CLIENTE</legend>
                <p>
                    <label for="nome">Nome:</label>
                    <input type="text" name="nome"> 
                </p>
                
                <p>
                    <label for="usuario">Usuário</label>
                    <input type="text" name="usuario"> 
                </p>
                
                <p>
                    <label for="senha">Senha:</label>
                    <input type="password" name="senha">
                </p>
                
                <p>
                    <label for="endereco">Endereço:</label>
                    <input type="text" name="endereco"> 
                </p>
                
                <p>               
                    <label for="telefone">Telefone:</label>
                    <input type="tel" name="telefone"  pattern="[0-9]{10}" title="Somente números, no m�ximo 10 dígitos, padrão: 8298765432">
                </p>
                
                <p>
                    <label for="email">E-mail:</label>
                    <input type="email" name="email" >                    
                </p>
                
                <p>
                    <label for="cpf">CPF:</label>
                    <input type="text" name="cpf"  pattern="[0-9]{11}" title="Somente números, o CPF deve conter 11 dígitos">
                </p>
                
                <p>
                    <label for="rg">RG:</label>
                    <input type="text" name="rg" >                    
                </p>
                
                <p>
                    <label for="foto">Foto:</label>
                    <input type="file" name="foto">
                </p>
                
                <p>
                    <input type="submit" value="Cadastrar">
                </p>               
            </fieldset>
        </form>
    </body>
</html>
