package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.PerfilDAO;
import java.util.ArrayList;
import model.Perfil;
import java.util.List;

public final class listar_005fperfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/banner.jsp");
    _jspx_dependants.add("/menu.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1,\n");
      out.write("              user-scalable=no\" name=\"viewport\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./static/bootstrap/bootstrap-theme.min.css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      out.write("<img src=\"./imagens/banner.jpg\" alt=\"banner\" \n");
      out.write("     title=\"banner\" width=\"100%\" height=\"150px\"/>");
      out.write("\n");
      out.write("            ");
      out.write("<div class=\"menu\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"#\">Início</a></li>\n");
      out.write("        <li><a href=\"listar_perfil.jsp\">Perfis</a></li>\n");
      out.write("        <li><a href=\"#\">Menus</a></li>\n");
      out.write("        <li><a href=\"#\">Usuário</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"./static/menu.css\" type=\"text/css\"/>");
      out.write("\n");
      out.write("        <h1>Lista de Perfis</h1>\n");
      out.write("        <a href=\"form_perfil.jsp\" class=\"btn btn-primary\">Novo Cadastro</a>\n");
      out.write("        <table class=\"table table-hover\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Nome Peril</th>\n");
      out.write("                <th>Opções</th> \n");
      out.write("            </tr>\n");
      out.write("        ");

            ArrayList<Perfil> lista = new ArrayList<>();
            try{
                PerfilDAO pDAO = new PerfilDAO();
                lista = pDAO.getLista();
            }catch(Exception e){
                out.print(e);
            }
                for(Perfil p:lista){
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("                <td>");
      out.print( p.getIdPerfil() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( p.getNome() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( p.getOpcoes() );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                <a class=\"btn btn-primary\" href=\"#\">\n");
      out.write("                    <i class=\"glyphicon glyphicon-pencil\"></i>\n");
      out.write("                </a>\n");
      out.write("                <button class=\"btn btn-danger\">\n");
      out.write("                    <i class=\"glyphicon glyphicon-trash\"></i>\n");
      out.write("                </button>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
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
