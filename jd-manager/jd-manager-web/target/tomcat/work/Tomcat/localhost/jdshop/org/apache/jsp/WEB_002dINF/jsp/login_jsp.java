/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-25 10:55:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <title> - 登录</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/login.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        if (window.top !== window.self) {\r\n");
      out.write("            window.top.location = window.location;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    <script>\r\n");
      out.write("        function sub1() {\r\n");
      out.write("            $(\"#form\").submit(function () {\r\n");
      out.write("                var uname = $(\"#uname\").val();\r\n");
      out.write("                var upwd = $(\"#upwd\").val();\r\n");
      out.write("                var v = $(\"#v\").val();\r\n");
      out.write("                var vcode = $(\"#vcode\").val();\r\n");
      out.write("                var flag = false;\r\n");
      out.write("\r\n");
      out.write("                if (uname === null || upwd === null) {\r\n");
      out.write("                    $(\"#sp\").html(\"密码或者用户名为空\");\r\n");
      out.write("                }else if(v === null){\r\n");
      out.write("                    $(\"#sp\").html(\"请输入验证码\");\r\n");
      out.write("                }else if(vcode !== v){\r\n");
      out.write("                    $(\"#sp\").html(\"验证码错误\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"#sp\").html(\"\");\r\n");
      out.write("                    flag = true;\r\n");
      out.write("                }\r\n");
      out.write("                //阻止表单提交\r\n");
      out.write("//                e.preventDefault();\r\n");
      out.write("\r\n");
      out.write("                if (flag) {\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        url: \"userLogin\",\r\n");
      out.write("                        data: {\"username\": uname, \"password\": upwd},\r\n");
      out.write("                        dataType: \"json\",\r\n");
      out.write("                        type:\"POST\",\r\n");
      out.write("                        cache: \"false\",\r\n");
      out.write("                        success: function (data) {\r\n");
      out.write("                            if (data > 0) {\r\n");
      out.write("                                location.href = \"index\";\r\n");
      out.write("                            } else {\r\n");
      out.write("                                $(\"#sp\").html(\"用户名或者密码错误\");\r\n");
      out.write("                            }\r\n");
      out.write("                        },\r\n");
      out.write("                        error: function (XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("//                            alert(XMLHttpRequest.status);\r\n");
      out.write("//                            alert(XMLHttpRequest.readyState);\r\n");
      out.write("//                            alert(textStatus);\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function sub2() {\r\n");
      out.write("            window.location.href='userAdd';\r\n");
      out.write("        }\r\n");
      out.write("        $(function () {\r\n");
      out.write("            //点击图片更换验证码\r\n");
      out.write("            $(\"#Verify\").click(function () {\r\n");
      out.write("                $(this).attr('src', 'images/securitycodeimageaction.action?timestamp=' + new Date().getTime());\r\n");
      out.write("                $(this).attr('value','8395');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"signin\">\r\n");
      out.write("<script src=\"js/canvas-nest.min.js\" count=\"200\" zindex=\"-2\" opacity=\"0.8\" color=\"46,190,246\"\r\n");
      out.write("        type=\"text/javascript\"></script>\r\n");
      out.write("<div class=\"signinpanel\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-12\">\r\n");
      out.write("            <form method=\"post\" action=\"javascript:void(0)\" id=\"form\" autocomplete=\"off\">\r\n");
      out.write("                <h4 class=\"no-margins\">登录：<span id=\"sp\" style=\"color:red\"></span></h4>\r\n");
      out.write("                <input autocomplete=\"off\" type=\"text\" class=\"form-control uname\" name=\"user\" placeholder=\"用户名\" value=\"\"\r\n");
      out.write("                       id=\"uname\"/>\r\n");
      out.write("                <input autocomplete=\"off\" type=\"password\" class=\"form-control pword m-b\" name=\"password\"\r\n");
      out.write("                       placeholder=\"密码\" value=\"\" id=\"upwd\"/>\r\n");
      out.write("                <input name=\"verifycode\" class=\"form-control pword m-b\" type=\"text\" placeholder=\"验证码\"\r\n");
      out.write("                       onblur=\"if(this.value===''){this.value=''}\" onclick=\"if(this.value==='验证码:'){this.value='';}\"\r\n");
      out.write("                       value=\"\" style=\"width: 190px;\" id='vcode'>\r\n");
      out.write("                <img src=\"images/securitycodeimageaction.action\" id=\"Verify\"\r\n");
      out.write("                     style=\"cursor:hand;height: 30px;float: right;margin-top: -45px;\" alt=\"看不清，换一张\"/>\r\n");
      out.write("                <input type=\"hidden\" name=\"\" id=\"v\" value=\"8395\">\r\n");
      out.write("                <button class=\"btn btn-success btn-block\" onclick=\"sub1()\">登录</button>\r\n");
      out.write("                <button class=\"btn btn-success btn-block\" onclick=\"sub2()\">注册</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"signup-footer\">\r\n");
      out.write("        <div class=\"pull-left\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
