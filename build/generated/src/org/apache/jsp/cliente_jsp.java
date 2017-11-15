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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro do Cliente</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">        \n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <form action=\"ClienteServlet\" method=\"POST\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>CADASTRO DE CLIENTE</legend>\n");
      out.write("                <p>\n");
      out.write("                    <label for=\"nome\">Nome:</label>\n");
      out.write("                    <input type=\"text\" name=\"nome\" > \n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <label for=\"usuario\">Usuário</label>\n");
      out.write("                    <input type=\"text\" name=\"usuario\" > \n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <label for=\"senha\">Senha:</label>\n");
      out.write("                    <input type=\"password\" name=\"senha\" >\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <label for=\"endereco\">Endereço:</label>\n");
      out.write("                    <input type=\"text\" name=\"endereco\" > \n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>               \n");
      out.write("                    <label for=\"telefone\">Telefone:</label>\n");
      out.write("                    <input type=\"tel\" name=\"telefone\"  pattern=\"[0-9]{10}\" title=\"Somente números, no máximo 10 dígitos, padrão: 8298765432\">\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <label for=\"email\">E-mail:</label>\n");
      out.write("                    <input type=\"email\" name=\"email\" >                    \n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <label for=\"cpf\">CPF:</label>\n");
      out.write("                    <input type=\"text\" name=\"cpf\"  pattern=\"[0-9]{11}\" title=\"Somente números, o CPF deve conter 11 dígitos\">\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <label for=\"rg\">RG:</label>\n");
      out.write("                    <input type=\"text\" name=\"rg\" >                    \n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <label for=\"foto\">Foto:</label>\n");
      out.write("                    <input type=\"file\" name=\"foto\">\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                    <input type=\"submit\" value=\"Cadastrar\">\n");
      out.write("                </p>               \n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
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
