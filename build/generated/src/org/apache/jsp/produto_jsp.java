package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class produto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro de Produto</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ProdutoServlet\" method=\"POST\">\n");
      out.write("            <!--<input type=\"text\" id=\"part\" name=\"part\" required pattern=\"[A-Z]{3}[0-9]{4}\"\n");
      out.write("       title=\"Part numbers consist of 3 uppercase letters followed by 4 digits.\"/>\n");
      out.write("            <input type=\"submit\" formnovalidate value=\"Save\">\n");
      out.write("            <input type=\"submit\" value=\"Submit\"> -->\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>CADASTRO DE PRODUTO</legend>\n");
      out.write("                <label for=\"descricao\">Descrição:</label>\n");
      out.write("                <input type=\"text\" name=\"descricao\" required> <br>\n");
      out.write("                <label for=\"preco\">Preço:</label>\n");
      out.write("                <input type=\"number\" name=\"preco\" step=\"0.01\" required> <br>\n");
      out.write("                <label for=\"quantidade\">Quantidade de entrada:</label>\n");
      out.write("                <input type=\"number\" name=\"quantidade\" required> <br>\n");
      out.write("                <label for=\"imagem\">Imagem do Produto:</label>\n");
      out.write("                <input type=\"file\" name=\"imagem\" required> <br>\n");
      out.write("                <input type=\"submit\" value=\"Cadastrar\">\n");
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
