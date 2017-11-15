package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import beans.Produto;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("        <title>?rea Administrativa</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"caixa\">\n");
      out.write("        <h1>Área Administrativa</h1>\n");
      out.write("        <form action=\"ProdutoServlet\" method=\"POST\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>PRODUTOS</legend>\n");
      out.write("                <label for=\"id\">Id Produto:</label>\n");
      out.write("                <input type=\"text\" name=\"id\" size=\"6\" maxlength=\"6\" required=\"required\" pattern=\"[0-9]+$\" title=\"Somente números\">\n");
      out.write("                <input type=\"hidden\" name=\"operacao\" value=\"select\">                \n");
      out.write("                <input type=\"submit\"  class=\"btn btn-red\" value=\"Buscar Produto\" title=\"Buscar Produto\">\n");
      out.write("            </fieldset>                \n");
      out.write("        </form>\n");
      out.write("        <a href=\"ExibeCliente.jsp\" class=\"btn btn-purple\">Mostrar Todos</a>\n");
      out.write("        <a href=\"ExibeCliente.jsp\" class=\"btn btn-green\">Mostrar Todos</a>\n");
      out.write("        <a href=\"ExibeCliente.jsp\" class=\"btn btn-red\">Mostrar Todos</a>\n");
      out.write("        <a href=\"ExibeCliente.jsp\" class=\"btn btn-purple\">Mostrar Todos</a>\n");
      out.write("        <a href=\"ExibeCliente.jsp\" class=\"btn btn-green\">Mostrar Todos</a>\n");
      out.write("        </div>\n");
      out.write("        <!--\n");
      out.write("        <br>\n");
      out.write("        <button class=\"btn btn-green\">Salvar</button>\n");
      out.write("        <a href=\"#\" class=\"btn btn-purple\">Acessar</a>     \n");
      out.write("        <a href=\"\"><img src=\"imagens/busca.png\" alt=\"Buscar Produto\" title=\"Buscar Produto\"></a>   -->\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
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
