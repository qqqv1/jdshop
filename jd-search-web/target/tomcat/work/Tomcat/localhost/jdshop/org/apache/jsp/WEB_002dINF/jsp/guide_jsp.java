/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-26 04:28:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guide_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--引导 -->\r\n");
      out.write("<div class=\"navCir\">\r\n");
      out.write("    <li><a href=\"home\"><i class=\"am-icon-home \"></i>首页</a></li>\r\n");
      out.write("    <li><a href=\"sort\"><i class=\"am-icon-list\"></i>分类</a></li>\r\n");
      out.write("    <li><a href=\"shopcart\"><i class=\"am-icon-shopping-basket\"></i>购物车</a></li>\r\n");
      out.write("    <li><a href=\"person/index\"><i class=\"am-icon-user\"></i>我的</a></li>\r\n");
      out.write("</div>\r\n");
      out.write("<!--菜单 -->\r\n");
      out.write("<div class=tip>\r\n");
      out.write("    <div id=\"sidebar\">\r\n");
      out.write("        <div id=\"wrap\">\r\n");
      out.write("            <div id=\"prof\" class=\"item\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <span class=\"setting\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"ibar_login_box status_login\">\r\n");
      out.write("                    <div class=\"avatar_box\">\r\n");
      out.write("                        <p class=\"avatar_imgbox\"><img src=\"images/no-img_mid_.jpg\" /></p>\r\n");
      out.write("                        <ul class=\"user_info\">\r\n");
      out.write("                            <li>用户名：sl1903</li>\r\n");
      out.write("                            <li>级&nbsp;别：普通会员</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"login_btnbox\">\r\n");
      out.write("                        <a href=\"#\" class=\"login_order\">我的订单</a>\r\n");
      out.write("                        <a href=\"#\" class=\"login_favorite\">我的收藏</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <i class=\"icon_arrow_white\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"shopCart\" class=\"item\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <span class=\"message\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <p>\r\n");
      out.write("                    购物车\r\n");
      out.write("                </p>\r\n");
      out.write("                <p class=\"cart_num\">0</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"asset\" class=\"item\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <span class=\"view\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"mp_tooltip\">\r\n");
      out.write("                    我的资产\r\n");
      out.write("                    <i class=\"icon_arrow_right_black\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"foot\" class=\"item\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <span class=\"zuji\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"mp_tooltip\">\r\n");
      out.write("                    我的足迹\r\n");
      out.write("                    <i class=\"icon_arrow_right_black\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"brand\" class=\"item\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <span class=\"wdsc\"><img src=\"images/wdsc.png\" /></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"mp_tooltip\">\r\n");
      out.write("                    我的收藏\r\n");
      out.write("                    <i class=\"icon_arrow_right_black\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"broadcast\" class=\"item\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <span class=\"chongzhi\"><img src=\"images/chongzhi.png\" /></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"mp_tooltip\">\r\n");
      out.write("                    我要充值\r\n");
      out.write("                    <i class=\"icon_arrow_right_black\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"quick_toggle\">\r\n");
      out.write("                <li class=\"qtitem\">\r\n");
      out.write("                    <a href=\"#\"><span class=\"kfzx\"></span></a>\r\n");
      out.write("                    <div class=\"mp_tooltip\">客服中心<i class=\"icon_arrow_right_black\"></i></div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--二维码 -->\r\n");
      out.write("                <li class=\"qtitem\">\r\n");
      out.write("                    <a href=\"#none\"><span class=\"mpbtn_qrcode\"></span></a>\r\n");
      out.write("                    <div class=\"mp_qrcode\" style=\"display:none;\"><img src=\"images/weixin_code_145.png\" /><i class=\"icon_arrow_white\"></i></div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"qtitem\">\r\n");
      out.write("                    <a href=\"#top\" class=\"return_top\"><span class=\"top\"></span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--回到顶部 -->\r\n");
      out.write("            <div id=\"quick_links_pop\" class=\"quick_links_pop hide\"></div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"prof-content\" class=\"nav-content\">\r\n");
      out.write("        <div class=\"nav-con-close\">\r\n");
      out.write("            <i class=\"am-icon-angle-right am-icon-fw\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            我\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"shopCart-content\" class=\"nav-content\">\r\n");
      out.write("        <div class=\"nav-con-close\">\r\n");
      out.write("            <i class=\"am-icon-angle-right am-icon-fw\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            购物车\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"asset-content\" class=\"nav-content\">\r\n");
      out.write("        <div class=\"nav-con-close\">\r\n");
      out.write("            <i class=\"am-icon-angle-right am-icon-fw\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            资产\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"ia-head-list\">\r\n");
      out.write("            <a href=\"#\" target=\"_blank\" class=\"pl\">\r\n");
      out.write("                <div class=\"num\">0</div>\r\n");
      out.write("                <div class=\"text\">优惠券</div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" target=\"_blank\" class=\"pl\">\r\n");
      out.write("                <div class=\"num\">0</div>\r\n");
      out.write("                <div class=\"text\">红包</div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" target=\"_blank\" class=\"pl money\">\r\n");
      out.write("                <div class=\"num\">￥0</div>\r\n");
      out.write("                <div class=\"text\">余额</div>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"foot-content\" class=\"nav-content\">\r\n");
      out.write("        <div class=\"nav-con-close\">\r\n");
      out.write("            <i class=\"am-icon-angle-right am-icon-fw\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            足迹\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"brand-content\" class=\"nav-content\">\r\n");
      out.write("        <div class=\"nav-con-close\">\r\n");
      out.write("            <i class=\"am-icon-angle-right am-icon-fw\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            收藏\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"broadcast-content\" class=\"nav-content\">\r\n");
      out.write("        <div class=\"nav-con-close\">\r\n");
      out.write("            <i class=\"am-icon-angle-right am-icon-fw\"></i>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            充值\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
