package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Operaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Operaciones</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/estilos.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"ProcesoOperacion.jsp\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table width=\"500\" id=\"one-column-emphasis\">\n");
      out.write("                <caption>\n");
      out.write("                    Bienvenido a la pagina de las Operaciones\n");
      out.write("                </caption>\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"oce-first\">\n");
      out.write("                        Ingrese una Cantidad:\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"default\" type=\"number\" name=\"cantidad\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"oce-first\">\n");
      out.write("                        Eliga la(s) Operaciones a realizar con dicha cantidad\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"default\" type=\"radio\" name=\"operacion\" value=\"deposito\"/>Depositar<br>\n");
      out.write("                        <input class=\"default\" type=\"radio\" name=\"operacion\" value=\"retiro\"/>Retirar<br>\n");
      out.write("                        <input class=\"default\" type=\"radio\" name=\"operacion\" value=\"balance\"/>Chequear Balance\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr style=\"text-align: center;\">\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"reset\" value=\"Limpiar\" class=\"default\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"Enviar\" class=\"default\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
