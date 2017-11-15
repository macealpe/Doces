package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Doces e Salgados</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Lista de Clientes</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr bgcolor=\"#aaee88\">\n");
      out.write("                <td>ID</td>\n");
      out.write("                <td>Nome</td>\n");
      out.write("                <td>Usuário</td>\n");
      out.write("                <td>Senha</td>\n");
      out.write("                <td>Endereço</td>\n");
      out.write("                <td>Telefone</td>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>CPF</td>\n");
      out.write("                <td>RG</td>\n");
      out.write("                <td>Foto</td>\n");
      out.write("                <td>Ativo</td>               \n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"#ffffff\">\n");
      out.write("                <td>A</td>\n");
      out.write("                <td>B</td>\n");
      out.write("                <td>C</td>\n");
      out.write("                <td>D</td>\n");
      out.write("                <td>E</td>\n");
      out.write("                <td>F</td>\n");
      out.write("                <td>G</td>\n");
      out.write("                <td>H</td>\n");
      out.write("                <td>I</td>\n");
      out.write("                <td>J</td>\n");
      out.write("                <td>K</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
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
