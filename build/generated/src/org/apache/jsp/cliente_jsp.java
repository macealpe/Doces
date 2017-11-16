package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <title>Silvana Doces e Salgados :: Cadastro de Clientes</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style2.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\t\n");
      out.write("        <header class=\"cabecalho fixed-top\">\t\n");
      out.write("            <nav class=\"nav navbar-light bg-light\" style=\"height: 80px;\">\n");
      out.write("                <a class=\"navbar-brand\">\n");
      out.write("                    <img src=\"imagens/logo.png\" style=\"height: 50px; margin-top: 10px;\">\n");
      out.write("                </a>\n");
      out.write("                ");
      out.write("\n");
      out.write("            </nav>\t\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <div class=\"with-id\" style=\"color: #777;\">\n");
      out.write("                <h2 class=\"text-center\">CADASTRO DE CLIENTE</h2>\n");
      out.write("                <hr class=\"hr-geral\">\n");
      out.write("            </div>\n");
      out.write("            <form action=\"ClienteServlet\" method=\"POST\" accept-charset=\"UTF-8\">\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"nome\" class=\"col-md-1 col-form-label\">Nome:</label>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"nome\" placeholder=\"Nome cliente\" autofocus required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"usuario\" class=\"col-md-1 col-form-label\">Usuário:</label>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"usuario\" placeholder=\"Usuário\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"qtd-entrada\" class=\"col-md-1 col-form-label\">Senha:</label>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"senha\" placeholder=\"Senha\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"endereco\" class=\"col-md-1 col-form-label\">Endereço:</label>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"endereco\" placeholder=\"Endereço\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"telefone\" class=\"col-md-1 col-form-label\">Telefone:</label>                    \n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input class=\"form-control\" type=\"tel\" name=\"telefone\" pattern=\"[0-9]{10}\" title=\"Somente números, no máximo 10 dígitos, padrão: 8298765432\" placeholder=\"Telefone\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"e-mail\" class=\"col-md-1 col-form-label\">E-mail:</label>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input class=\"form-control\" type=\"email\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"cpf\" class=\"col-md-1 col-form-label\">CPF:</label>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input  class=\"form-control\" type=\"text\" name=\"cpf\"  pattern=\"[0-9]{11}\" title=\"Somente números, o CPF deve conter 11 dígitos\" placeholder=\"CPF\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"rg\" class=\"col-md-1 col-form-label\">RG:</label>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"rg\" placeholder=\"RG\" required>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label for=\"foto\" class=\"col-md-1 col-form-label\">Foto:</label>\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <input class=\"\" type=\"file\" name=\"foto\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"hidden\" name=\"operacao\" value=\"insert\">\n");
      out.write("                <div class=\"form-group-trab\">\n");
      out.write("                    <label class=\"col-md-7 control-label\" for=\"btnsalvar\"></label>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <button type=\"submit\" value=\"Submit\" id=\"btnsalvar\" name=\"btnsalvar\" class=\"btn btn-primary\">Cadastrar</button>\n");
      out.write("                        <button type=\"reset\" value=\"Reset\" id=\"btncancelar\" name=\"btncancelar\" class=\"btn btn-danger\">Limpar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
