/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-01-08 06:46:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title> - 基本表单</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/font-awesome.css?v=4.4.0\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/chosen.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/bootstrap-colorpicker.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/cropper.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/switchery.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/jasny-bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/jquery.nouislider.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/datepicker3.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/ion.rangeSlider.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/ion.rangeSlider.skinFlat.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/awesome-bootstrap-checkbox.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/clockpicker.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/style.css?v=4.1.0\" rel=\"stylesheet\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/laydate.css\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"css/laydate1.css\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/sweetalert.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"themes/default/default.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"gray-bg\">\r\n");
      out.write("<div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-12\">\r\n");
      out.write("            <div class=\"ibox float-e-margins\">\r\n");
      out.write("                <div class=\"ibox-title\">\r\n");
      out.write("                    <h5>产品添加</h5>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"ibox-content\">\r\n");
      out.write("                    <form class=\"form-horizontal\" id=\"product\" action=\"\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"></label>\r\n");
      out.write("                            <div class=\"col-sm-8\" style=\"color: red;font-size: 15px\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"><span style=\"color:red;\">*</span>商品名称：</label>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                <input id=\"pname\" name=\"pname\" value=\"\" type=\"text\" placeholder=\" 请输入商品名称\" class=\"form-control\">\r\n");
      out.write("                                <span class=\"help-block m-b-none\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"><span style=\"color:red;\">*</span>商品售价：</label>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                <input id=\"marketPrice\" name=\"marketPrice\" value=\"\" type=\"text\" placeholder=\" 请输入商品售价\"  onkeyup=\"value=value.replace(/[^\\d.]/g,'')\"  onblur=\"value=value.replace(/[^\\d.]/g,'') \"  class=\"form-control\">\r\n");
      out.write("                                <span class=\"help-block m-b-none\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"><span style=\"color:red;\">*</span>商品供货价：</label>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                <input id=\"shopPrice\" name=\"shopPrice\" value=\"\" type=\"text\" placeholder=\" 请输入商品供货价\"  onkeyup=\"value=value.replace(/[^\\d.]/g,'')\"  onblur=\"value=value.replace(/[^\\d.]/g,'') \"  class=\"form-control\">\r\n");
      out.write("                                <span class=\"help-block m-b-none\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"><span style=\"color:red;\">*</span>库存：</label>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                <input id=\"quantity\" name=\"quantity\" value=\"\" type=\"text\" placeholder=\" 请输入商品库存\" class=\"form-control\" onkeyup=\"value=value.replace(/[^\\d]/g,'')\"  onblur=\"value=value.replace(/[^\\d]/g,'') \" >\r\n");
      out.write("                                <span class=\"help-block m-b-none\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"><span style=\"color:red;\">*</span>类别：</label>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                <select id =\"cid\" name=\"cid\" style=\"width: 100%;\" class=\"form-control selectpicker\">\r\n");
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <span class=\"help-block m-b-none\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"><span style=\"color:red;\"></span>是否热门：</label>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                <select id=\"isHot\" name=\"isHot\" style=\"width: 100%;\" class=\"form-control\">\r\n");
      out.write("                                    <option selected=\"\" value=\"1\">是</option>\r\n");
      out.write("                                    <option selected=\"\" value=\"0\">否</option>\r\n");
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <span class=\"help-block m-b-none\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"><span style=\"color:red;\"></span>图片：</label>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                <input type=\"file\" id=\"image\" name=\"image\" value=\"选择图片\" />\r\n");
      out.write("                                <span class=\"help-block m-b-none\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label class=\"col-sm-3 control-label\"><span style=\"color:red;\"></span>商品描述：</label>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                <script id=\"container\" name=\"pdesc\" type=\"text/plain\"></script>\r\n");
      out.write("                                <span class=\"help-block m-b-none\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <div class=\"col-sm-offset-3 col-sm-8\">\r\n");
      out.write("                                <button id=\"submit\" class=\"btn btn-sm btn-info\" type=\"button\">确认保存</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 全局js -->\r\n");
      out.write("<script src=\"js/jquery.min.js?v=2.1.4\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js?v=3.3.6\"></script>\r\n");
      out.write("<!-- 自定义js -->\r\n");
      out.write("<script src=\"js/content.js?v=1.0.0\"></script>\r\n");
      out.write("<!-- Sweet alert -->\r\n");
      out.write("<script src=\"js/sweetalert.min.js\"></script>\r\n");
      out.write("<!-- iCheck -->\r\n");
      out.write("<script src=\"js/icheck.min.js\"></script>\r\n");
      out.write("<!-- jQuery Validation plugin javascript-->\r\n");
      out.write("<script src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"js/messages_zh.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/form-validate-demo.js\"></script>\r\n");
      out.write("<!-- 百度富文本编辑器 -->\r\n");
      out.write("<!-- 配置文件 -->\r\n");
      out.write("<script src=\"ueditor/ueditor.config.js\"></script>\r\n");
      out.write("<!-- 编辑器源码文件 -->\r\n");
      out.write("<script src=\"ueditor/ueditor.all.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    UE.getEditor('container');\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        $(\"#submit\").click(function(){\r\n");
      out.write("            var pname = $(\"#pname\").val();\r\n");
      out.write("            var marketPrice = $(\"#marketPrice\").val();\r\n");
      out.write("            var shopPrice = $(\"#shopPrice\").val();\r\n");
      out.write("            var quantity=$(\"#quantity\").val();\r\n");
      out.write("            var cid = $(\"#cid\").val();\r\n");
      out.write("            if(!pname){\r\n");
      out.write("                alert(\"请输入商品名称\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }else if(!marketPrice){\r\n");
      out.write("                alert(\"请输入商品售价\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }else if(!shopPrice){\r\n");
      out.write("                alert(\"请输入商品供货价\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }else if(!quantity){\r\n");
      out.write("                alert(\"请输入商品库存\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }else if(!cid){\r\n");
      out.write("                alert(\"请输入商品分类\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            var data = $('#product').serialize();\r\n");
      out.write("            //序列化获得表单数据\r\n");
      out.write("            var submitData = decodeURIComponent(data, true);\r\n");
      out.write("            //submitData是解码后的表单数据，结果同上\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url: 'addproduct',\r\n");
      out.write("                type: 'POST',\r\n");
      out.write("                data: submitData,\r\n");
      out.write("                dataType: \"json\",\r\n");
      out.write("                success: function (result) {\r\n");
      out.write("                    //请求成功时\r\n");
      out.write("                    if(result> 0){\r\n");
      out.write("                        alert(\"新增商品成功！\");\r\n");
      out.write("                        location.href='product-list';\r\n");
      out.write("                    }\r\n");
      out.write("                    else{\r\n");
      out.write("                        alert(\"新增商品失败！\");\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                error: function () {\r\n");
      out.write("                    //请求失败时\r\n");
      out.write("                    alert(\"error\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("            return true;\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        $('.i-checks').iCheck({\r\n");
      out.write("            checkboxClass: 'icheckbox_square-green',\r\n");
      out.write("            radioClass: 'iradio_square-green',\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    $(function() {//获取下拉学校列表\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"productCats\",//写你自己的方法，返回map，我返回的map包含了两个属性：data：集合，total：集合记录数量，所以后边会有data.data的写法。。。\r\n");
      out.write("            // 接受数据格式\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            // 回调函数，接受服务器端返回给客户端的值，即result值\r\n");
      out.write("            success: function (data) {\r\n");
      out.write("                //alert(data.data);\r\n");
      out.write("                $.each(data, function (i,items) {\r\n");
      out.write("                    $('#cid').append(\"<option value=\" + items.cid + \">\" + items.cname + \"</option>\");\r\n");
      out.write("                });\r\n");
      out.write("                $('#cid').selectpicker('refresh');\r\n");
      out.write("            },\r\n");
      out.write("            error: function (data) {\r\n");
      out.write("                alert(\"查询失败\" + data);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
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
