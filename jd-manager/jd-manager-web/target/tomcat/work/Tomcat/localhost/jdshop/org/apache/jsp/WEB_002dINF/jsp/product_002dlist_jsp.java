/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-06 09:11:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
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
      out.write("    <link href=\"css/bootstrap-table.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/font-awesome.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Data Tables -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <!-- Sweet Alert -->\r\n");
      out.write("    <link href=\"css/sweetalert.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("<div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-12\">\r\n");
      out.write("            <div class=\"ibox float-e-margins\">\r\n");
      out.write("                <div class=\"ibox-title\">\r\n");
      out.write("                    <h5>商品管理</h5>\r\n");
      out.write("                    <div class=\"ibox-tools\">\r\n");
      out.write("                        <a href=\"product-edit\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default btn-xs\">添加</button>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"ibox-content\">\r\n");
      out.write("                    <table class=\"table table-striped table-bordered table-hover dataTables-example\" id=\"productListDg\"></table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 全局js -->\r\n");
      out.write("<script src=\"js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("<script src=\"js/bootstrap-table.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 自定义js -->\r\n");
      out.write("<script src=\"js/content.js?v=1.0.0\"></script>\r\n");
      out.write("<!-- Page-Level Scripts -->\r\n");
      out.write("\r\n");
      out.write("<!-- Sweet alert -->\r\n");
      out.write("<script src=\"js/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\"#productListDg\").bootstrapTable({\r\n");
      out.write("            url:'products',\r\n");
      out.write("            pagination:true,\r\n");
      out.write("            columns: [[\r\n");
      out.write("                {field: 'pid', title: '商品编号'},\r\n");
      out.write("                {field: 'pname', title: '商品标题'},\r\n");
      out.write("                {field: 'pdesc', title: '商品详情'}\r\n");
      out.write("            ]]\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
