<%-- 
    Document   : cadastrocliente
    Created on : 25/10/2017, 14:05:01
    Author     : Macealpe
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Silvana Doces e Salgados :: Cadastro de Clientes</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/style2.css">
    </head>

    <body>	
        <header class="cabecalho fixed-top">	
            <nav class="nav navbar-light bg-light" style="height: 80px;">
                <a class="navbar-brand">
                    <img src="imagens/logo.png" style="height: 50px; margin-top: 10px;">
                </a>
                <%--
                <form class="form-inline" action="" method="">
                  <input class="form-control " type="search" placeholder="Buscar Produto" aria-label="Search">
                  <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
                </form>
                <div class="carrinho">
                        <a href="#">
                              <img src="imagens/shopping-cart.png">
                        </a>
                </div> --%>
            </nav>	
        </header>


        <section class="container">
            <div class="with-id" style="color: #777;">
                <h2 class="text-center">CADASTRO DE CLIENTE</h2>
                <hr class="hr-geral">
            </div>
            <form action="ClienteServlet" method="POST" accept-charset="UTF-8">
                <div class="form-group row">
                    <label for="nome" class="col-md-1 col-form-label">Nome:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="text" name="nome" placeholder="Nome cliente" autofocus required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="usuario" class="col-md-1 col-form-label">Usuário:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="text" name="usuario" placeholder="Usuário" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="qtd-entrada" class="col-md-1 col-form-label">Senha:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="password" name="senha" placeholder="Senha" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="endereco" class="col-md-1 col-form-label">Endereço:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="text" name="endereco" placeholder="Endereço" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="telefone" class="col-md-1 col-form-label">Telefone:</label>                    
                    <div class="col-md-4">
                        <input class="form-control" type="tel" name="telefone" pattern="[0-9]{10}" title="Somente números, no máximo 10 dígitos, padrão: 8298765432" placeholder="Telefone" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="e-mail" class="col-md-1 col-form-label">E-mail:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="email" name="email" placeholder="Email" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="cpf" class="col-md-1 col-form-label">CPF:</label>
                    <div class="col-md-4">
                        <input  class="form-control" type="text" name="cpf"  pattern="[0-9]{11}" title="Somente números, o CPF deve conter 11 dígitos" placeholder="CPF" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="rg" class="col-md-1 col-form-label">RG:</label>
                    <div class="col-md-4">
                        <input class="form-control" type="text" name="rg" placeholder="RG" required>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="foto" class="col-md-1 col-form-label">Foto:</label>
                    <div class="col-md-10">
                        <input class="" type="file" name="foto">
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
            </div>
        </footer> 

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
    </body>
</html>
