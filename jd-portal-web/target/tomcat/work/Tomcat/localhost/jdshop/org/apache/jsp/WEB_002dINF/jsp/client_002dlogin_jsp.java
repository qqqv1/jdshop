/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-19 08:58:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class client_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head lang=\"en\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>登录</title>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("    <meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #form div label i:before{\r\n");
      out.write("            line-height: inherit;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"AmazeUI-2.4.2/assets/css/amazeui.css\" type=\"text/css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/dlstyle.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function(){\r\n");
      out.write("        $(\"#submit\").click(function () {\r\n");
      out.write("            var uname = $(\"#username\").val();\r\n");
      out.write("            var upwd = $(\"#password\").val();\r\n");
      out.write("            var flag = false;\r\n");
      out.write("            if (uname == null || upwd == null) {\r\n");
      out.write("                $(\"#sp\").html(\"密码或者用户名为空\");\r\n");
      out.write("            } else {\r\n");
      out.write("                $(\"#sp\").html(\"\");\r\n");
      out.write("                flag = true;\r\n");
      out.write("            }\r\n");
      out.write("            if (flag) {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url: \"clientLogin\",\r\n");
      out.write("                    data: {\"username\": uname, \"password\": upwd},\r\n");
      out.write("                    dataType: \"json\",\r\n");
      out.write("                    type:\"post\",\r\n");
      out.write("                    cache: \"false\",\r\n");
      out.write("                    success: function (data) {\r\n");
      out.write("                        alert(\"xxxx2\");\r\n");
      out.write("                        if (data > 0) {\r\n");
      out.write("                            location.href = \"client-information\";\r\n");
      out.write("                        } else {\r\n");
      out.write("                            $(\"#sp\").html(\"用户名或者密码错误\");\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    error: function (XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("                        alert(\"111xxxx2\");\r\n");
      out.write("                            alert(XMLHttpRequest.status);\r\n");
      out.write("                            alert(XMLHttpRequest.readyState);\r\n");
      out.write("                            alert(textStatus);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"login-boxtitle\">\r\n");
      out.write("    <a href=\"home.html\"><img alt=\"logo\" src=\"images/logobig.png\" /></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"login-banner\">\r\n");
      out.write("    <div class=\"login-main\">\r\n");
      out.write("        <div class=\"login-banner-bg\"><span></span><img src=\"images/big.jpg\" /></div>\r\n");
      out.write("        <div class=\"login-box\">\r\n");
      out.write("\r\n");
      out.write("            <h3 class=\"title\">登录商城</h3>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"login-form\">\r\n");
      out.write("                <form id=\"form\" >\r\n");
      out.write("                    <div class=\"user-name\">\r\n");
      out.write("                        <label for=\"username\"><i class=\"am-icon-user\"></i></label>\r\n");
      out.write("                        <input type=\"text\" name=\"username\" id=\"username\" placeholder=\"邮箱/手机/用户名\">\r\n");
      out.write("                    </div><span id=\"sp\"></span>\r\n");
      out.write("                    <div class=\"user-pass\">\r\n");
      out.write("                        <label for=\"password\"><i class=\"am-icon-lock\"></i></label>\r\n");
      out.write("                        <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"请输入密码\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"login-links\">\r\n");
      out.write("                <label for=\"remember-me\"><input id=\"remember-me\" type=\"checkbox\">记住密码</label>\r\n");
      out.write("                <a href=\"#\" class=\"am-fr\">忘记密码</a>\r\n");
      out.write("                <a href=\"client-register\" class=\"zcnext am-fr am-btn-default\">注册</a>\r\n");
      out.write("                <br />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"am-cf\">\r\n");
      out.write("                <input type=\"submit\" id=\"submit\" name=\"\" value=\"登 录\" class=\"am-btn am-btn-primary am-btn-sm\" >\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"partner\">\r\n");
      out.write("                <h3>合作账号</h3>\r\n");
      out.write("                <div class=\"am-btn-group\">\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"am-icon-qq am-icon-sm\"></i><span>QQ登录</span></a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"am-icon-weibo am-icon-sm\"></i><span>微博登录</span> </a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"am-icon-weixin am-icon-sm\"></i><span>微信登录</span> </a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottom.jsp", out, false);
      out.write("\r\n");
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
