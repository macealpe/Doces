<%-- 
    Document   : admin
    Created on : 11/11/2017, 18:36:20
    Author     : Macealpe
--%>

<%@page import="beans.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/admin.css">
        <title>Admin :  Consultas</title>
    </head>
    <body>
        <div id="caixa">
        <h1>Área Administrativa</h1>
        <form action="ProdutoServlet" method="POST" accept-charset="UTF-8">
            <fieldset>
                <legend>PRODUTOS</legend>
                <label for="id">Id Produto:</label>
                <input type="text" name="id" size="6" maxlength="6" required="required" pattern="[0-9]+$" title="Somente números">
                <input type="hidden" name="operacao" value="select">                
                <input type="submit"  class="btn btn-red" value="Buscar Produto" title="Buscar Produto">
            </fieldset>                
        </form>
        <a href="ExibeCliente.jsp" class="btn btn-purple">Mostrar Todos</a>
        <a href="ExibeCliente.jsp" class="btn btn-green">Mostrar Todos</a>
        <a href="ExibeCliente.jsp" class="btn btn-red">Mostrar Todos</a>
        <a href="ExibeCliente.jsp" class="btn btn-purple">Mostrar Todos</a>
        <a href="ExibeCliente.jsp" class="btn btn-green">Mostrar Todos</a>
        </div>
        <!--
        <br>
        <button class="btn btn-green">Salvar</button>
        <a href="#" class="btn btn-purple">Acessar</a>     
        <a href=""><img src="imagens/busca.png" alt="Buscar Produto" title="Buscar Produto"></a>   -->
        <%--<jsp:useBean id="dao" class="jdbc.ClienteDao"/>
        <table border="1" bordercolor="777777" border-style="dotted" cellspacing="0">
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
        </table> --%>
        
    </body>
</html>
