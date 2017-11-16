<%-- 
    Document   : produto
    Created on : 04/11/2017, 15:29:56
    Author     : Macealpe
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8" %> --%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Silvana Doces e Salgados :: Cadastro de Produtos</title>
        <link rel="shortcut icon" href="img/enaj-logo.png">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/style2.css">
    </head>
    <body>


        <header class="cabecalho fixed-top">	
            <nav class="nav navbar-light bg-light" style="height: 80px;">
                <a class="navbar-brand col-md-4">
                    <img src="imagens/logo.png" style="height: 50px; margin-top: 10px;">
                </a>
                <%--
                <form class="form-inline col-md-4" >
                    <input class="form-control " type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
                <div class="carrinho col-md-4">
                    <a href="#">
                        <img src="image/shopping-cart.png">
                    </a>
                </div> --%>
            </nav>	
        </header>


        <section class="container">
            <div class="with-id" style="color: #777;">
                <h2 class="text-center">CADASTRAR PRODUTOS</h2>
                <hr class="hr-geral">
            </div>
            <form action="ProdutoServlet" method="POST" accept-charset="UTF-8">
                <div class="form-group row">
                    <label for="descricao" class="col-md-1 col-form-label">Descrição:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="text" name="descricao" placeholder="Descrição do produto" autofocus required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="categoria" class="col-md-1 col-form-label">Categoria:</label>
                    <div class="col-md-4">                        
                        <select class="form-control" type="text" name="categoria" required>
                            <option value="doces">doces</option>
                            <option selected value="salgados">salgados</option>
                        </select>                        
                    </div>
                </div>
                <div class="form-group row">
                    <label for="preco" class="col-md-1 col-form-label">Preço:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="number" name="preco" placeholder="Preço do produto" step="0.01">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="quantidade" class="col-md-1 col-form-label">Qtd. de entrada:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="number" name="quantidade" placeholder="Quantidade de entrada">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="imagem" class="col-md-1 col-form-label">Imagem:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="file" name="imagem">
                    </div>
                </div>
                <input type="hidden" name="operacao" value="insert">
                <div class="form-group-trab">
                    <label class="col-md-7 control-label" for="btnsalvar"></label>
                    <div class="col-md-8">
                        <button type="submit" value="Submit" id="btnsalvar" name="btnsalvar" class="btn btn-primary">Cadastrar</button>
                        <button type="reset" value="Reset" id="btncancelar" name="btncancelar" class="btn btn-danger">Limpar</button>
                    </div>
                </div>
            </form>
        </section>

        <footer>

            <div class="row" style="margin-top: 17px;">

                <div class="container" >

                    <p class="pull-left">Sistema de Vendas de Doces e Salgados.</p>

                    <p class="pull-right">4ºADS - FAT</p>

                </div>
                <!--
                <div class="container-fluid">
                        
                        <p class="pull-left">Organização: FENAJU</p>
                        
                </div>
                -->
            </div>

        </footer>


        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
    </body>
</html>
