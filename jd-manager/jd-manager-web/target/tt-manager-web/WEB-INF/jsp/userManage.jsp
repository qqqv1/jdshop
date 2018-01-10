<%--
  Created by IntelliJ IDEA.
  User: jialin
  Date: 2018/1/9
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> - 数据表格</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <!-- Data Tables -->
    <link href="css/dataTables.bootstrap.css" rel="stylesheet">
    <!-- Sweet Alert -->
    <link href="css/sweetalert.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/laydate.css">
    <link type="text/css" rel="stylesheet" href="css/laydate1.css">
</head>

<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>用户管理</h5>

                    <div class="ibox-tools">
                        <a href="userAdd">
                            <button type="button" class="btn btn-default btn-xs">添加</button>
                        </a>
                    </div>
                </div>
                <div class="ibox-tools" style="margin-top: 0px;float: left;">
                    <form action="findByDim" method="post" role="form" class="form-inline">
                        <input type="hidden" name="" value=""/>
                        <div class="form-group" style="padding-right: 5px;padding-left: 5px;">
                            <div class="col-sm-10"
                                 style="margin-bottom: 5px; margin-top:5px;padding-right: 0px;padding-left: 0px;">
                                <input id="username" name="username" placeholder="用户名"
                                       style="height: 29px;width: 120px;" class="form-control">
                            </div>
                        </div>
                        <div class="form-group" style="padding-right: 5px;padding-left: 5px;">
                            <div class="col-sm-10"
                                 style="margin-bottom: 5px; margin-top:5px;padding-right: 0px;padding-left: 0px;">
                                <input id="realname" name="realname" placeholder="真实姓名"
                                       style="height: 29px;width: 120px;padding: 6px 5px;" class="form-control">
                            </div>
                        </div>
                        <div class="form-group" style="padding-right: 5px;padding-left: 5px;">
                            <div class="col-sm-10"
                                 style="margin-bottom: 5px; margin-top:5px;padding-right: 0px;padding-left: 0px;">
                                <input id="stats" name="stats" placeholder="状态码" style="height: 29px;width: 120px;"
                                       class="form-control">
                            </div>
                        </div>
                        <div class="form-group" style="padding-right: 5px;padding-left: 5px;">
                            <div class="col-sm-10"
                                 style="margin-bottom: 5px; margin-top:5px;padding-right: 0px;padding-left: 0px;">
                                <input id="tel" name="tel" placeholder="电话" style="height: 29px;width: 120px;"
                                       class="form-control">
                            </div>
                        </div>
                        <div class="checkbox m-l m-r-xs" style="margin-left: 0px; margin-top:5px;">
                            <button class="btn btn-white" type="submit" id="submit">提交</button>
                        </div>
                    </form>
                </div>
                <div class="ibox-content">

                    <table class="table table-striped table-bordered table-hover dataTables-example">
                        <thead>
                        <tr>
                            <th>uid</th>
                            <th>用户名</th>
                            <th>密码</th>
                            <th>真实姓名</th>
                            <th>性别</th>
                            <th>出生年月</th>
                            <th>邮箱</th>
                            <th>电话</th>
                            <th>code</th>
                            <%--   <th>城市</th>--%>
                            <th style="text-align: center;">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${cs}" var="findAllUser">
                            <tr class="gradeX">
                                <td>${findAllUser.uid}</td>
                                <td>${findAllUser.username}</td>
                                <td>${findAllUser.password}</td>
                                <td>${findAllUser.name}</td>
                                <td>${findAllUser.email}</td>
                                <td>${findAllUser.telephone}</td>
                                <td>${findAllUser.birthday}</td>
                                <td>${findAllUser.state}</td>
                                <td>${findAllUser.code}</td>
                                    <%--  <td>${findAllUser.username}</td>--%>
                                <td style="text-align: center;">
                                    <a class="btn btn-white btn-bitbucket" title="编辑" href="userUpdate">
                                        <i class="fa fa-pencil-square-o" aria-hidden="true"></i>
                                    </a>
                                    <input type="hidden" value="123"/>
                                    <a class="btn btn-white btn-bitbucket delete" title="删除"
                                       href="/deleteUserById?uid=${findAllUser.uid}">
                                        <i class="fa fa-trash-o" aria-hidden="true"></i>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>
<script src="js/jquery.jeditable.js"></script>
<!-- Data Tables -->
<!-- 页面 分页 -->

<script src="js/dataTables.bootstrap.js"></script>
<!-- 自定义js -->
<script src="js/content.js?v=1.0.0"></script>
<!-- Page-Level Scripts -->

<!-- Sweet alert -->
<script src="js/sweetalert.min.js"></script>
<script>
    $(document).ready(function () {
        $(".delete").click(function () {
            var id = $(this).prev().val();
            if (confirm("确定删除吗？删除后将无法恢复！")) {
                window.location.href = "admin_guanlilyuan_del.action?guanlilyuan.id=" + id;
                return true;
            } else {
                return false;
            }
        });

        $('.dataTables-example').dataTable();
        /* Init DataTables */
        var oTable = $('#editable').dataTable();

        /* Apply the jEditable handlers to the table */
        oTable.$('td').editable('../example_ajax.php', {
            "callback": function (sValue, y) {
                var aPos = oTable.fnGetPosition(this);
                oTable.fnUpdate(sValue, aPos[0], aPos[1]);
            },
            "submitdata": function (value, settings) {
                return {
                    "row_id": this.parentNode.getAttribute('id'),
                    "column": oTable.fnGetPosition(this)[2]
                };
            },

            "width": "90%",
            "height": "100%"
        });


    });

    function fnClickAddRow() {
        $('#editable').dataTable().fnAddData([
            "Custom row",
            "New row",
            "New row",
            "New row",
            "New row"]);

    }
</script>
<script src="js/laydate.js"></script>
<script>
    //外部js调用

</script>
</body>

</html>
