/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-27 04:30:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dportal_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("\r\n");
      out.write("    <title>搜索页面</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"AmazeUI-2.4.2/assets/css/amazeui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"AmazeUI-2.4.2/assets/css/admin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("    <link href=\"basic/css/demo.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/seastyle.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"basic/js/jquery-1.7.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<b class=\"line\"></b>\r\n");
      out.write("<div class=\"search\">\r\n");
      out.write("    <div class=\"search-list\">\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"am-g am-g-fixed\">\r\n");
      out.write("            <div class=\"am-u-sm-12 am-u-md-12\">\r\n");
      out.write("                <div class=\"theme-popover\">\r\n");
      out.write("                    <div class=\"searchAbout\">\r\n");
      out.write("                        <span class=\"font-pale\">相关搜索：</span>\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <ul class=\"select\">\r\n");
      out.write("                        <p class=\"title font-normal\">\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            <span class=\"total fl\">搜索到<strong class=\"num\" id=\"searchNum\">0</strong>件相关商品</span>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                        <li class=\"select-result\">\r\n");
      out.write("                            <dl>\r\n");
      out.write("                                <dt>已选</dt>\r\n");
      out.write("                                <dd class=\"select-no\"></dd>\r\n");
      out.write("                                <p class=\"eliminateCriteria\">清除</p>\r\n");
      out.write("                            </dl>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <div class=\"clear\"></div>\r\n");
      out.write("                        <li class=\"select-list\">\r\n");
      out.write("                            <dl id=\"select1\">\r\n");
      out.write("                                <dt class=\"am-badge am-round\">品牌</dt>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"dd-conent\">\r\n");
      out.write("                                    <dd class=\"select-all selected\"><a href=\"#\">全部</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">百草味</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">良品铺子</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">新农哥</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">楼兰蜜语</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">口水娃</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">考拉兄弟</a></dd>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </dl>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"select-list\">\r\n");
      out.write("                            <dl id=\"select2\">\r\n");
      out.write("                                <dt class=\"am-badge am-round\">种类</dt>\r\n");
      out.write("                                <div class=\"dd-conent\">\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </dl>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"select-list\">\r\n");
      out.write("                            <dl id=\"select3\">\r\n");
      out.write("                                <dt class=\"am-badge am-round\">选购热点</dt>\r\n");
      out.write("                                <div class=\"dd-conent\">\r\n");
      out.write("                                    <dd class=\"select-all selected\"><a href=\"#\">全部</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">手剥松子</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">薄壳松子</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">进口零食</a></dd>\r\n");
      out.write("                                    <dd><a href=\"#\">有机零食</a></dd>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </dl>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"search-content\">\r\n");
      out.write("                    <div class=\"sort\">\r\n");
      out.write("                        <li class=\"first\"><a title=\"综合\" href=\"javascript:\">综合排序</a></li>\r\n");
      out.write("                        <li><a title=\"销量\" href=\"javascript:\">销量排序</a></li>\r\n");
      out.write("                        <li><a title=\"价格\" href=\"javascript:\">价格优先</a></li>\r\n");
      out.write("                        <li class=\"big\"><a title=\"评价\" href=\"javascript:\">评价为主</a></li>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("                    <ul class=\"am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes\" id=\"product\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"search-side\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"side-title\">\r\n");
      out.write("                        经典搭配\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"i-pic check\">\r\n");
      out.write("                            <img src=\"images/cp.jpg\" />\r\n");
      out.write("                            <p class=\"check-title\">萨拉米 1+1小鸡腿</p>\r\n");
      out.write("                            <p class=\"price fl\">\r\n");
      out.write("                                <b>¥</b>\r\n");
      out.write("                                <strong>29.90</strong>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"number fl\">\r\n");
      out.write("                                销量<span>1110</span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"i-pic check\">\r\n");
      out.write("                            <img src=\"images/cp2.jpg\" />\r\n");
      out.write("                            <p class=\"check-title\">ZEK 原味海苔</p>\r\n");
      out.write("                            <p class=\"price fl\">\r\n");
      out.write("                                <b>¥</b>\r\n");
      out.write("                                <strong>8.90</strong>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"number fl\">\r\n");
      out.write("                                销量<span>1110</span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"i-pic check\">\r\n");
      out.write("                            <img src=\"images/cp.jpg\" />\r\n");
      out.write("                            <p class=\"check-title\">萨拉米 1+1小鸡腿</p>\r\n");
      out.write("                            <p class=\"price fl\">\r\n");
      out.write("                                <b>¥</b>\r\n");
      out.write("                                <strong>29.90</strong>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p class=\"number fl\">\r\n");
      out.write("                                销量<span>1110</span>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("                <!--分页 -->\r\n");
      out.write("                <ul class=\"am-pagination am-pagination-right\" id=\"page\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "bottom.jsp", out, false);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "guide.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    //    window.jQuery || document.write('<script src=\"basic/js/jquery-1.9.min.js\"><\\/script>');\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 商品搜索项\r\n");
      out.write("     * @type {{page: number, pname: string, bname: string, cname: string, hname: string}}\r\n");
      out.write("     * page 当前页\r\n");
      out.write("     * pname 商品名\r\n");
      out.write("     * bname 品牌名\r\n");
      out.write("     * cname 分类名\r\n");
      out.write("     * hname 热点名\r\n");
      out.write("     */\r\n");
      out.write("    var productOption={\r\n");
      out.write("        'page':1,\r\n");
      out.write("        'pname':'',\r\n");
      out.write("        'bname':'',\r\n");
      out.write("        'cname':'',\r\n");
      out.write("        'hname':''\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("    $(function () {\r\n");
      out.write("        // 初始化搜索栏的值\r\n");
      out.write("        $('#searchInput').val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.pname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("        productOption.pname=$('#searchInput').val();\r\n");
      out.write("//        console.log(productOption);\r\n");
      out.write("        // 初始化分类\r\n");
      out.write("        displayCategory();\r\n");
      out.write("        // 初始化商品列表\r\n");
      out.write("        pagination(productOption);\r\n");
      out.write("//        displayProduct(productOption);\r\n");
      out.write("        // 为清除绑定初始化商品列表事件\r\n");
      out.write("        $(\".select-result dl p\").on('click',function () {\r\n");
      out.write("            pagination(productOption);\r\n");
      out.write("//            displayProduct(productOption);\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    // 查询全部分类\r\n");
      out.write("    function displayCategory() {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:'categoryList',\r\n");
      out.write("            dataType:'json',\r\n");
      out.write("            success:function (categorys) {\r\n");
      out.write("                $div=$('#select2 .dd-conent');\r\n");
      out.write("                $div.empty();\r\n");
      out.write("                $div.append('<dd class=\"select-all selected\"><a href=\"javascript:void(0)\">全部</a></dd>');\r\n");
      out.write("                $.each(categorys,function (i,category) {\r\n");
      out.write("                    $dd=$('<dd><a href=\"javascript:void(0)\">'+category.cname+'</a></dd>');\r\n");
      out.write("                    $div.append($dd);\r\n");
      out.write("                });\r\n");
      out.write("                $(\"#select2 dd\").click(function() {\r\n");
      out.write("                    $(this).addClass(\"selected\").siblings().removeClass(\"selected\");\r\n");
      out.write("                    if ($(this).hasClass(\"select-all\")) {\r\n");
      out.write("                        $(\"#selectB\").remove();\r\n");
      out.write("                    } else {\r\n");
      out.write("                        var copyThisB = $(this).clone();\r\n");
      out.write("                        if ($(\"#selectB\").length > 0) {\r\n");
      out.write("                            $(\"#selectB a\").html($(this).text());\r\n");
      out.write("                        } else {\r\n");
      out.write("                            $(\".select-result dl\").append(copyThisB.attr(\"id\", \"selectB\"));\r\n");
      out.write("                            $(\"#selectB a\").on('click',function () {\r\n");
      out.write("                                pagination(productOption);\r\n");
      out.write("//                                displayProduct(productOption);\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    productOption.cname=$(this).text();\r\n");
      out.write("                    pagination(productOption);\r\n");
      out.write("//                    displayProduct(productOption);\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 根据商品搜索项分页展示商品\r\n");
      out.write("    function pagination(productOption) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:'pageTotal',\r\n");
      out.write("            data:JSON.stringify(productOption),\r\n");
      out.write("            type:'POST',\r\n");
      out.write("            dataType:'json',\r\n");
      out.write("            contentType:'application/json;charset=UTF-8',\r\n");
      out.write("            success:function(total){\r\n");
      out.write("                var pageTotal=1;\r\n");
      out.write("                if(total % 12 === 0) {\r\n");
      out.write("                    pageTotal = parseInt(total / 12);\r\n");
      out.write("                }else{\r\n");
      out.write("                    pageTotal = parseInt(total / 12) +1;\r\n");
      out.write("                }\r\n");
      out.write("                $('#searchNum').html(total);\r\n");
      out.write("                $('#page').empty();\r\n");
      out.write("                $('#page').append('<li><a href=\"javascript:void(0)\" id=\"first\">&laquo;</a></li>');\r\n");
      out.write("                for(var i = 1;i <= pageTotal;i++){\r\n");
      out.write("                    $li=$('<li>');\r\n");
      out.write("                    $a=$('<a href=\"javascript:void(0)\">'+i+'</a>');\r\n");
      out.write("                    $a.on('click',function(){\r\n");
      out.write("                        productOption.page=$(this).text();\r\n");
      out.write("                        displayProduct(productOption);\r\n");
      out.write("                    });\r\n");
      out.write("                    $li.append($a);\r\n");
      out.write("                    $('#page').append($li);\r\n");
      out.write("                }\r\n");
      out.write("                $('#page').append('<li><a href=\"javascript:void(0)\" id=\"last\">&raquo;</a></li>');\r\n");
      out.write("                $('#first').on('click',function () {\r\n");
      out.write("                    productOption.page=1;\r\n");
      out.write("                    displayProduct(productOption);\r\n");
      out.write("                });\r\n");
      out.write("                $('#last').on('click',function () {\r\n");
      out.write("                    productOption.page=pageTotal;\r\n");
      out.write("                    displayProduct(productOption);\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        displayProduct(productOption);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    // 根据商品搜索项展示商品\r\n");
      out.write("    function displayProduct(productOption){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:'productList',\r\n");
      out.write("            data:JSON.stringify(productOption),\r\n");
      out.write("            type:'POST',\r\n");
      out.write("            dataType:'json',\r\n");
      out.write("            contentType:'application/json;charset=UTF-8',\r\n");
      out.write("            success:function (products) {\r\n");
      out.write("                $('#product').empty();\r\n");
      out.write("                $.each(products,function (i,product) {\r\n");
      out.write("                    $li=$('<li>');\r\n");
      out.write("                    $li.on('click',function () {\r\n");
      out.write("                       window.location.href='product-portal-info?pid='+product.pid;\r\n");
      out.write("                    });\r\n");
      out.write("                    $div=$('<div class=\"i-pic limit\">');\r\n");
      out.write("                    $img=$('<div style=\"padding: 35px\"><img src=\"'+product.pimage+'\" style=\"width: 148px;height: 148px\" alt=\"暂缺\"/></div>'+\r\n");
      out.write("                        '                        <p class=\"title fl\">'+product.pname+'</p>\\n' +\r\n");
      out.write("                        '                        <p class=\"price fl\">\\n' +\r\n");
      out.write("                        '                        <b>¥</b>\\n' +\r\n");
      out.write("                        '                        <strong>'+product.shopPrice+'</strong>\\n' +\r\n");
      out.write("                        '                        </p>\\n' +\r\n");
      out.write("                        '                        <p class=\"number fl\">\\n' +\r\n");
      out.write("                        '                        销量<span>'+product.psold+'</span>\\n' +\r\n");
      out.write("                        '                        </p>');\r\n");
      out.write("                    $div.append($img);\r\n");
      out.write("                    $li.append($div);\r\n");
      out.write("                    $('#product').append($li);\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"basic/js/quick_links.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"theme-popover-mask\"></div>\r\n");
      out.write("</body>\r\n");
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
