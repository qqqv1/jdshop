/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
<<<<<<< HEAD
 * Generated at: 2018-01-20 03:43:29 UTC
=======
 * Generated at: 2018-01-19 11:27:37 UTC
>>>>>>> 3437019b865fe5bb7d8fb7bf211d289ad9ac5c28
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--顶部导航条 -->\r\n");
      out.write("<div class=\"am-container header\">\r\n");
      out.write("    <ul class=\"message-l\">\r\n");
      out.write("        <div class=\"topMessage\">\r\n");
      out.write("            <div class=\"menu-hd\">\r\n");
      out.write("                <a href=\"client-login\" target=\"_top\" class=\"h\">亲，请登录</a>\r\n");
      out.write("                <a href=\"client-register\" target=\"_top\">免费注册</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"message-r\">\r\n");
      out.write("        <div class=\"topMessage home\">\r\n");
      out.write("            <div class=\"menu-hd\"><a href=\"index\" target=\"_top\" class=\"h\">商城首页</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"topMessage my-shangcheng\">\r\n");
      out.write("            <div class=\"menu-hd MyShangcheng\"><a href=\"client-information\" target=\"_top\"><i class=\"am-icon-user am-icon-fw\"></i>个人中心</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"topMessage mini-cart\">\r\n");
<<<<<<< HEAD
      out.write("            <div class=\"menu-hd\"><a id=\"mc-menu-hd\" href=\"shoppingcart\" target=\"_top\"><i class=\"am-icon-shopping-cart  am-icon-fw\"></i><span>购物车</span><strong id=\"J_MiniCartNum\" class=\"h\">0</strong></a></div>\r\n");
=======
      out.write("            <div class=\"menu-hd\"><a id=\"mc-menu-hd\" href=\"shopcart\" target=\"_top\"><i class=\"am-icon-shopping-cart  am-icon-fw\"></i><span>购物车</span><strong id=\"J_MiniCartNum\" class=\"h\">0</strong></a></div>\r\n");
>>>>>>> 3437019b865fe5bb7d8fb7bf211d289ad9ac5c28
      out.write("        </div>\r\n");
      out.write("        <div class=\"topMessage favorite\">\r\n");
      out.write("            <div class=\"menu-hd\"><a href=\"#\" target=\"_top\"><i class=\"am-icon-heart am-icon-fw\"></i><span>收藏夹</span></a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--悬浮搜索框-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"nav white\">\r\n");
<<<<<<< HEAD
      out.write("    <div class=\"logo\"><img src=\"images/logo.png\" /></div>\r\n");
      out.write("    <div class=\"logoBig\">\r\n");
      out.write("        <li><img src=\"images/logobig.png\" /></li>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"search-bar pr\">\r\n");
=======
      out.write("    <div class=\"logo\" style=\"width: 30%\"><img src=\"images/logo.png\" /></div>\r\n");
      out.write("    <div class=\"logoBig\">\r\n");
      out.write("        <li><img src=\"images/logobig.png\" /></li>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"search-bar pr\" >\r\n");
>>>>>>> 3437019b865fe5bb7d8fb7bf211d289ad9ac5c28
      out.write("        <a name=\"index_none_header_sysc\" href=\"#\"></a>\r\n");
      out.write("        <form action=\"javascript:void(0)\">\r\n");
      out.write("            <input id=\"searchInput\" name=\"pname\" type=\"text\" placeholder=\"搜索\" autocomplete=\"off\">\r\n");
      out.write("            <input id=\"ai-topsearch\" class=\"submit am-btn\" value=\"搜索\" index=\"1\" type=\"submit\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $('#ai-topsearch').on('click',function () {\r\n");
      out.write("            window.location.href='product-portal-list?pname='+$('#searchInput').val();\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>");
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
