/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-08 09:54:11 UTC
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
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"ibox-content\">\r\n");
      out.write("                    <div id=\"toolbar\" class=\"btn-group\">\r\n");
      out.write("                        <button id=\"add\" type=\"button\" class=\"btn btn-default\" onclick=\"add();\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span>新增\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <button id=\"edit\" type=\"button\" class=\"btn btn-default\" onclick=\"edit();\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>修改\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <button id=\"delete\" type=\"button\" class=\"btn btn-default\" onclick=\"del();\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>删除\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
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
      out.write("<script src=\"moment/moment-with-locales.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    moment.locale();\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\"#productListDg\").bootstrapTable({\r\n");
      out.write("            toolbar:\"#toolbar\",\r\n");
      out.write("            url:'products',\r\n");
      out.write("            pagination:true,\r\n");
      out.write("            search: true,\r\n");
      out.write("            clickToSelect: true,\r\n");
      out.write("            columns: [[\r\n");
      out.write("                {checkbox : true,align : 'center'},\r\n");
      out.write("                {field: 'pid', title: '商品编号',sortable : true},\r\n");
      out.write("                {field: 'pname', title: '商品标题',sortable : true},\r\n");
      out.write("                {field: 'pdesc', title: '商品详情',sortable : true},\r\n");
      out.write("                {field: 'marketPrice', title: '价格',sortable : true},\r\n");
      out.write("                {field: 'shopPrice', title: '商品卖点',sortable : true},\r\n");
      out.write("//                {field: 'cid', title: '分类名称'},\r\n");
      out.write("                {\r\n");
      out.write("                    field: 'created', title: '创建时间', formatter: function (v, r, i) {\r\n");
      out.write("                        return moment(v).format('L');\r\n");
      out.write("                    },sortable : true\r\n");
      out.write("                },\r\n");
      out.write("                {field:'isHot',title:'是否热门',sortable : true},\r\n");
      out.write("                {\r\n");
      out.write("                    field: 'pflag', title: '商品状态', formatter: function (v, r, i) {\r\n");
      out.write("                        switch (v) {\r\n");
      out.write("                            case 1:\r\n");
      out.write("                                return '正常';\r\n");
      out.write("                                break;\r\n");
      out.write("                            case 2:\r\n");
      out.write("                                return '下架';\r\n");
      out.write("                                break;\r\n");
      out.write("                            case 3:\r\n");
      out.write("                                return '删除';\r\n");
      out.write("                                break;\r\n");
      out.write("                            default:\r\n");
      out.write("                                return '未知';\r\n");
      out.write("                                break;\r\n");
      out.write("                        }\r\n");
      out.write("                    },sortable : true\r\n");
      out.write("                }\r\n");
      out.write("            ]]\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("    function add(){\r\n");
      out.write("        location.href='product-add';\r\n");
      out.write("    }\r\n");
      out.write("    function del() {\r\n");
      out.write("        var pids=[];\r\n");
      out.write("        var $table=$(\"#productListDg\");\r\n");
      out.write("        var selRow = $table.bootstrapTable('getSelections');\r\n");
      out.write("        if(selRow!=null){\r\n");
      out.write("            for (var i = 0; i < selRow.length; i++) {\r\n");
      out.write("                pids.push(selRow[i].pid)\r\n");
      out.write("            }\r\n");
      out.write("            var flag=confirm('此操作不可逆，确认删除吗？')\r\n");
      out.write("            if(flag==true) {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("//                    type:\"POST\",\r\n");
      out.write("                    cache: false,\r\n");
      out.write("                    async: true,\r\n");
      out.write("                    dataType: \"json\",\r\n");
      out.write("                    url: \"deleteproduct\",\r\n");
      out.write("                    data: {\"pids\": pids},\r\n");
      out.write("                    success: function (data) {\r\n");
      out.write("                        if (data > 0) {\r\n");
      out.write("                            $table.bootstrapTable('refresh');\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }else{\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("        }else{\r\n");
      out.write("            alert('请选取要删除的数据行！');\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function edit() {\r\n");
      out.write("        var $table=$(\"#productListDg\");\r\n");
      out.write("        var selRow = $table.bootstrapTable('getSelections');\r\n");
      out.write("        if(selRow!=null){\r\n");
      out.write("            if(selRow.length>1) {\r\n");
      out.write("                alert('请只选取一行要编辑的数据行！');\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            pid=selRow[0].pid;\r\n");
      out.write("            location.href='product-edit?pid='+pid;\r\n");
      out.write("        }else{\r\n");
      out.write("            alert('请选取要编辑的数据行！');\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
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
