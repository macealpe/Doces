<%-- 
    Document   : index
    Created on : 15/11/2017, 16:45:09
    Author     : Macealpe
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Silvana Doces e Salgados</title>
        <link rel="shortcut icon" href="img/enaj-logo.png">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/style2.css">
        <link rel="stylesheet" type="text/css" href="css/botoes.css">
    </head>
    <body>
        <jsp:useBean id="dao" class="jdbc.ProdutoDao"/>
        <header class="cabecalho fixed-top">	
            <nav class="nav navbar-light bg-light" style="height: 80px;">
                <a class="navbar-brand">
                    <img src="imagens/logo.png" style="height: 50px; margin-top: 10px;">
                </a>
                <form class="form-inline" >
                    <input class="form-control " type="search" placeholder="Buscar Produto" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                </form>
                <div class="carrinho">
                    <a href="#">
                        <img src="imagens/shopping-cart.png">
                    </a>
                </div>
                <div class="nav-link">
                    <a href="login.jsp" class="btn btn-purple">Login</a>
                </div>
            </nav>	
        </header>


        <section class="container prod-sec">
            <div class="with-id" style="color: #777; ">
                <h2 class="text-center" s>NOSSOS PRODUTOS</h2>
                <hr class="hr-geral">
            </div>
            <div class="row">
                <c:forEach var="produto" items="${dao.listaTodosProdutos()}" varStatus="id">
                    <div class="produto col-md-4">
                        <div class="prod-img">
                            <a href="carrinho.jsp"><img src="imagens/${produto.imagemProduto}"></a>	
                        </div>
                        <div class="info">
                            <span class="prod-name">${produto.descricao}</span>
                            </br>
                            <span class="prod-price">R$ ${produto.precoUnitario}</span>
                        </div>

                    </div>
                </c:forEach>
            </div>
        </section>







        <footer>

            <div class="row" style="margin-top: 17px;">

                <div class="container" >

                    <p class="pull-left">Sistema de Vendas de Doces e Salgados.</p>

                    <p class="pull-right">4ºADS - FAT</p>

                </div>

            </div>

        </footer>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

    </body>
</html>
