/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
<<<<<<< HEAD
 * Generated at: 2018-01-09 03:11:01 UTC
=======
 * Generated at: 2018-01-09 01:38:32 UTC
>>>>>>> 986ba4fb356a832239379560407e2e90dae63cde
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <title> 后台管理系统</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("    <link href=\"css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/font-awesome.min.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"fixed-sidebar full-height-layout gray-bg\" style=\"overflow:hidden\">\r\n");
      out.write("<input style=\"display: none\" id=\"usersession\" value=\"1\">\r\n");
      out.write("<input style=\"display: none\" id=\"dlsession\" value=\"\">\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("    <nav class=\"navbar-default navbar-static-side\" role=\"navigation\">\r\n");
      out.write("        <div class=\"nav-close\"><i class=\"fa fa-times-circle\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidebar-collapse\">\r\n");
      out.write("            <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("                <li class=\"nav-header\">\r\n");
      out.write("                    <div class=\"dropdown profile-element\">\r\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"index\">\r\n");
      out.write("                            <span class=\"clear\">\r\n");
      out.write("                                <span class=\"block m-t-xs\" style=\"font-size:20px;\">\r\n");
      out.write("                                    <strong class=\"font-bold\">购物街</strong>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"logo-element\">\r\n");
      out.write("                        admin\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <li class=\"line dk\"></li>\r\n");
      out.write("                <li class=\"hidden-folded padder m-t m-b-sm text-muted text-xs\">\r\n");
      out.write("                    <span class=\"ng-scope\">商品管理</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-cogs\"></i>\r\n");
      out.write("                    <span class=\"nav-label\">产品管理</span>\r\n");
      out.write("                    <span class=\"fa arrow\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"nav nav-second-level\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"J_menuItem\" href=\"product-add\">产品新增</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"J_menuItem\" href=\"product-list\">产品列表</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
<<<<<<< HEAD
      out.write("                        <a class=\"J_menuItem\" href=\"category-add\">参数新增</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"J_menuItem\" href=\"category-list\">规格参数</a>\r\n");
=======
      out.write("                        <a class=\"J_menuItem\" href=\"category-add\">分类新增</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"J_menuItem\" href=\"category-list\">分类列表</a>\r\n");
>>>>>>> 986ba4fb356a832239379560407e2e90dae63cde
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <li class=\"line dk\"></li>\r\n");
      out.write("                <li class=\"hidden-folded padder m-t m-b-sm text-muted text-xs\">\r\n");
      out.write("                    <span class=\"ng-scope\">订单管理</span>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-cogs\"></i>\r\n");
      out.write("                        <span class=\"nav-label\">订单细则</span>\r\n");
      out.write("                        <span class=\"fa arrow\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"nav nav-second-level\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"J_menuItem\" href=\"order-list\">订单总览</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\r\n");
      out.write("        <div class=\"row border-bottom\">\r\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <a class=\"navbar-minimalize minimalize-styl-2 btn btn-info \" href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a class=\"dropdown-toggle count-info\" data-toggle=\"\" href=\"loginout.action\" title=\"退出\">\r\n");
      out.write("                            admin  <i class=\"fa fa-power-off\"></i> <span class=\"label label-warning\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-messages\" style=\"width: 100px;padding: 0px;\">\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row J_mainContent\" id=\"content-main\">\r\n");
      out.write("            <iframe id=\"J_iframe\" width=\"100%\" height=\"100%\" src=\"welcome.html\" frameborder=\"0\" data-id=\"welcome\" seamless></iframe>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 全局js -->\r\n");
      out.write("<script src=\"js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("<script src=\"js/jquery.metisMenu.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"js/layer.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 自定义js -->\r\n");
      out.write("<script src=\"js/hAdmin.js?v=4.1.0\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/index.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        var usersession=$(\"#usersession\").val();\r\n");
      out.write("        var dlsession=$(\"#dlsession\").val();\r\n");
      out.write("        if(usersession==null|dlsession==null){\r\n");
      out.write("            window.location.href=\"login.jsp\";\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<!-- 第三方插件 -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
