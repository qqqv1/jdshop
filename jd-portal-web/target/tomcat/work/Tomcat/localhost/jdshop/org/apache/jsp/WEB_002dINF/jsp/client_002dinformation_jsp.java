/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-19 09:23:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class client_002dinformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0\">\r\n");
      out.write("\r\n");
      out.write("    <title>个人资料</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"AmazeUI-2.4.2/assets/css/admin.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"AmazeUI-2.4.2/assets/css/amazeui.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"basic/css/demo.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"css/personal.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"css/infstyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <script src=\"AmazeUI-2.4.2/assets/js/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"AmazeUI-2.4.2/assets/js/amazeui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!--头 -->\r\n");
      out.write("<header>\r\n");
      out.write("    <article>\r\n");
      out.write("        <div class=\"mt-logo\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </article>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"nav-table\">\r\n");
      out.write("    <div class=\"long-title\"><span class=\"all-goods\">全部分类</span></div>\r\n");
      out.write("    <div class=\"nav-cont\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li class=\"index\"><a href=\"#\">首页</a></li>\r\n");
      out.write("            <li class=\"qc\"><a href=\"#\">闪购</a></li>\r\n");
      out.write("            <li class=\"qc\"><a href=\"#\">限时抢</a></li>\r\n");
      out.write("            <li class=\"qc\"><a href=\"#\">团购</a></li>\r\n");
      out.write("            <li class=\"qc last\"><a href=\"#\">大包装</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"nav-extra\">\r\n");
      out.write("            <i class=\"am-icon-user-secret am-icon-md nav-user\"></i><b></b>我的福利\r\n");
      out.write("            <i class=\"am-icon-angle-right\" style=\"padding-left: 10px;\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<b class=\"line\"></b>\r\n");
      out.write("<div class=\"center\">\r\n");
      out.write("    <div class=\"col-main\">\r\n");
      out.write("        <div class=\"main-wrap\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"user-info\">\r\n");
      out.write("                <!--标题 -->\r\n");
      out.write("                <div class=\"am-cf am-padding\">\r\n");
      out.write("                    <div class=\"am-fl am-cf\"><strong class=\"am-text-danger am-text-lg\">个人资料</strong> / <small>Personal&nbsp;information</small></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr/>\r\n");
      out.write("\r\n");
      out.write("                <!--头像 -->\r\n");
      out.write("                <div class=\"user-infoPic\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"filePic\">\r\n");
      out.write("                        <input type=\"file\" class=\"inputPic\" allowexts=\"gif,jpeg,jpg,png,bmp\" accept=\"image/*\">\r\n");
      out.write("                        <img class=\"am-circle am-img-thumbnail\" src=\"images/getAvatar.do.jpg\" alt=\"\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <p class=\"am-form-help\">头像</p>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"info-m\">\r\n");
      out.write("                        <div><b>用户名：<i>小叮当</i></b></div>\r\n");
      out.write("                        <div class=\"u-level\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"rank r2\">\r\n");
      out.write("\t\t\t\t\t\t\t             <s class=\"vip1\"></s><a class=\"classes\" href=\"#\">铜牌会员</a>\r\n");
      out.write("\t\t\t\t\t\t            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"u-safety\">\r\n");
      out.write("                            <a href=\"safety.html\">\r\n");
      out.write("                                账户安全\r\n");
      out.write("                                <span class=\"u-profile\"><i class=\"bc_ee0000\" style=\"width: 60px;\" width=\"0\">60分</i></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!--个人信息 -->\r\n");
      out.write("                <div class=\"info-main\">\r\n");
      out.write("                    <form class=\"am-form am-form-horizontal\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"am-form-group\">\r\n");
      out.write("                            <label for=\"username\" class=\"am-form-label\">昵称</label>\r\n");
      out.write("                            <div class=\"am-form-content\">\r\n");
      out.write("                                <input type=\"text\" id=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"nickname\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"am-form-group\">\r\n");
      out.write("                            <label for=\"name\" class=\"am-form-label\">姓名</label>\r\n");
      out.write("                            <div class=\"am-form-content\">\r\n");
      out.write("                                <input type=\"text\" id=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"am-form-group\">\r\n");
      out.write("                            <label class=\"am-form-label\">性别</label>\r\n");
      out.write("                            <div class=\"am-form-content sex\">\r\n");
      out.write("                                <label class=\"am-radio-inline\">\r\n");
      out.write("                                    <input type=\"radio\"  name=\"sex\" value=\"1\" data-am-ucheck> 男\r\n");
      out.write("                                </label>\r\n");
      out.write("                                <label class=\"am-radio-inline\">\r\n");
      out.write("                                    <input type=\"radio\" name=\"sex\" value=\"0\" data-am-ucheck> 女\r\n");
      out.write("                                </label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"am-form-group\">\r\n");
      out.write("                            <label for=\"birthday\" class=\"am-form-label\">生日</label>\r\n");
      out.write("                            <div class=\"am-form-content birth\">\r\n");
      out.write("                                <input type=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.birthday}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"birthday\"/>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"am-form-group\">\r\n");
      out.write("                            <label for=\"telephone\" class=\"am-form-label\">电话</label>\r\n");
      out.write("                            <div class=\"am-form-content\">\r\n");
      out.write("                                <input id=\"telephone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.telephone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"tel\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"am-form-group\">\r\n");
      out.write("                            <label for=\"email\" class=\"am-form-label\">电子邮件</label>\r\n");
      out.write("                            <div class=\"am-form-content\">\r\n");
      out.write("                                <input id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionUser.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"email\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        <div class=\"am-form-group safety\">\r\n");
      out.write("                            <label class=\"am-form-label\">账号安全</label>\r\n");
      out.write("                            <div class=\"am-form-content safety\">\r\n");
      out.write("                                <a href=\"safety.html\">\r\n");
      out.write("\r\n");
      out.write("                                    <span class=\"am-icon-angle-right\"></span>\r\n");
      out.write("\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"info-btn\">\r\n");
      out.write("                            <div class=\"am-btn am-btn-danger\" id=\"save\">保存修改</div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--底部-->\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"footer-hd\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    <a href=\"#\">恒望科技</a>\r\n");
      out.write("                    <b>|</b>\r\n");
      out.write("                    <a href=\"#\">商城首页</a>\r\n");
      out.write("                    <b>|</b>\r\n");
      out.write("                    <a href=\"#\">支付宝</a>\r\n");
      out.write("                    <b>|</b>\r\n");
      out.write("                    <a href=\"#\">物流</a>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer-bd\">\r\n");
      out.write("                <p>\r\n");
      out.write("                    <a href=\"#\">关于恒望</a>\r\n");
      out.write("                    <a href=\"#\">合作伙伴</a>\r\n");
      out.write("                    <a href=\"#\">联系我们</a>\r\n");
      out.write("                    <a href=\"#\">网站地图</a>\r\n");
      out.write("                    <em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href=\"http://www.cssmoban.com/\" target=\"_blank\" title=\"模板之家\">模板之家</a> - Collect from <a href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></em>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <aside class=\"menu\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li class=\"person\">\r\n");
      out.write("                <a href=\"index.html\">个人中心</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"person\">\r\n");
      out.write("                <a href=\"#\">个人资料</a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"active\"> <a href=\"information.html\">个人信息</a></li>\r\n");
      out.write("                    <li> <a href=\"safety.html\">安全设置</a></li>\r\n");
      out.write("                    <li> <a href=\"address.html\">收货地址</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"person\">\r\n");
      out.write("                <a href=\"#\">我的交易</a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"order.html\">订单管理</a></li>\r\n");
      out.write("                    <li> <a href=\"change.html\">退款售后</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"person\">\r\n");
      out.write("                <a href=\"#\">我的资产</a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li> <a href=\"coupon.html\">优惠券 </a></li>\r\n");
      out.write("                    <li> <a href=\"bonus.html\">红包</a></li>\r\n");
      out.write("                    <li> <a href=\"bill.html\">账单明细</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li class=\"person\">\r\n");
      out.write("                <a href=\"#\">我的小窝</a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li> <a href=\"collection.html\">收藏</a></li>\r\n");
      out.write("                    <li> <a href=\"foot.html\">足迹</a></li>\r\n");
      out.write("                    <li> <a href=\"comment.html\">评价</a></li>\r\n");
      out.write("                    <li> <a href=\"news.html\">消息</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("    </aside>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function(){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("\r\n");
      out.write("            url:\"updateUserByInformation\",\r\n");
      out.write("            data:{\"username\":");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.User.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("},\r\n");
      out.write("            dataType:\"json\",\r\n");
      out.write("            type:\"post\",\r\n");
      out.write("            cache:\"false\",\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                if (data > 0) {\r\n");
      out.write("                    alert(\"修改成功\");\r\n");
      out.write("                    location.href = \"client-information\";\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"修改失败\");\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            error: function (XMLHttpRequest, textStatus, errorThrown) {\r\n");
      out.write("//                            alert(XMLHttpRequest.status);\r\n");
      out.write("//                            alert(XMLHttpRequest.readyState);\r\n");
      out.write("//                            alert(textStatus);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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