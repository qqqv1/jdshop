<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/6
  Time: 8:46
  To change this template use File | Se
  ttings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <title> 后台管理系统</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/bootstrap-table.css" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <!-- Data Tables -->
    <%--<link href="css/dataTables.bootstrap.css" rel="stylesheet">--%>
    <!-- Sweet Alert -->
    <link href="css/sweetalert.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <%--<link type="text/css" rel="stylesheet" href="css/laydate.css">
    <link type="text/css" rel="stylesheet" href="css/laydate1.css">--%>

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>订单管理</h5>
                    <div class="ibox-tools">
                        <a href="order-add">
                        </a>
                    </div>
                </div>
                </div>



                <div class="ibox-content">

                    <div id="toolbar">
                        <div style="padding: 5px; background-color: #fff;">

                            <div class="ibox-tools" style="margin-top: 0px;float: left;">
                                <form action="admin_huiyuanmeirishouzhilog_list.action" method="post" role="form" class="form-inline">
                                    <input type="hidden" name="" value="">
                                    <div class="form-group" style="padding-right: 5px;padding-left: 5px;">
                                        <div class="col-sm-10" style="margin-bottom: 5px; margin-top:5px;padding-right: 0px;padding-left: 0px;">
                                            <input name="oid" placeholder="订单编号" style="height: 29px;width: 120px;" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group" style="padding-right: 5px;padding-left: 5px;">
                                        <div class="col-sm-10" style="margin-bottom: 5px; margin-top:5px;padding-right: 0px;padding-left: 0px;">
                                            <input name="oid" placeholder="订单编号" style="height: 29px;width: 120px;" class="form-control">
                                        </div>
                                    </div>
                                    <div class="checkbox m-l m-r-xs" style="margin-left: 0px; ">
                                        <button class="btn btn-white" type="submit">查询</button>
                                    </div>
                                </form>
                            </div>





                           <%-- <label>订单状态：</label>
                            <select id="status" name="status" class="easyui-combobox" >
                                <option value="0">全部</option>
                                <option value="1">正常</option>
                                <option value="2">下架</option>
                            </select>--%>
                            <!--http://www.cnblogs.com/wisdomoon/p/3330856.html-->
                            <!--注意：要加上type="button",默认行为是submit-->
                            <%--<button onclick="searchForm()" type="button" class="easyui-linkbutton">搜索</button>--%>

                           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                            <button onclick="edit()" class="btn btn-white" >编辑</button>
                            <button onclick="remove()" class="btn btn-white" >删除</button>
                            <button onclick="down()" class="btn btn-white" >下架</button>
                            <button onclick="up()" class="btn btn-white" >上架</button>
                        </div>
                    </div>

                    <table class="table table-striped table-bordered table-hover dataTables-example" id="orderListDg"></table>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>
<script src="js/bootstrap-table.min.js"></script>
<script src="js/bootstrap-table-zh-CN.js"></script>

<%--<script src="js/jquery.jeditable.js"></script>
<!-- Data Tables -->
<!-- 页面 分页 -->
<script src="js/jquery.dataTables.js"></script>
<script src="js/dataTables.bootstrap.js"></script>--%>
<!-- 自定义js -->
<script src="js/content.js?v=1.0.0"></script>
<!-- Page-Level Scripts -->

<!-- Sweet alert -->
<script src="js/sweetalert.min.js"></script>

<script>
    $(function () {
        $("#orderListDg").bootstrapTable({
            toolbar:'#toolbar',
            url:'orders',
            pagination:true,
            columns: [[
                {field: 'ck', checkbox: true},
                {field: 'oid', title: '订单编号'},
                {field: 'count', title: '商品数量'},
                {field: 'pname', title: '商品名'},
                {field: 'subtotal', title: '合计'},
                {field: 'status', title: '订单状态'},
                {field: 'name', title: '买家'},
                {field: 'telephone', title: '手机'}
            ]]
        })
    })
</script>
</body>
</html>