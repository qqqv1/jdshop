<%--
  Created by IntelliJ IDEA.
  User: jialin
  Date: 2018/1/9
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> - 用户列表</title>
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
                    <h5>用户管理</h5>
                </div>
            </div>
            <div class="ibox-content">
                <div id="toolbar" class="btn-group">
                    <button id="add" type="button" class="btn btn-default" onclick="add();">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
                    </button>
                    <button id="edit" type="button" class="btn btn-default" onclick="edit();">
                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                    </button>
                    <button id="delete" type="button" class="btn btn-default" onclick="del();">
                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                    </button>
                </div>
                <table class="table table-striped table-bordered table-hover dataTables-example" id="userListDg"></table>
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

<script src="moment/moment-with-locales.js"></script>
<script>
    moment.locale();
</script>
<script>
    $(function () {
        $("#userListDg").bootstrapTable({
            toolbar: "#toolbar",
            url: 'users',
            pagination: true,
            search: true,
            clickToSelect: true,
            columns: [[
                {checkbox: true, align: 'center'},
                {field: 'uid', title: '用户编号', sortable: true},
                {field: 'username', title: '用户名', sortable: true},
                {field: 'name', title: '姓名', sortable: true},
                {field: 'sex', title: '性别', sortable: true},
                {field: 'email', title: '邮件', sortable: true},
                {field: 'telephone', title: '电话', sortable: true},
                {
                    field: 'birthday', title: '生日', formatter: function (v, r, i) {
                        return moment(v).format('L');
                    },sortable : true
                }
            ]]
        })
    })
    function add(){
        location.href='userAdd';
    }
    function del() {
        var pids=[];
        var $table=$("#userListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if (selRow.length < 1) {
            alert('请选取要删除的数据行！');
            return false;
        }
        var flag = confirm('此操作不可逆，确认删除吗？');
        if (flag === true) {
            for (var i = 0; i < selRow.length; i++) {
                uids.push(selRow[i].uid)
            }
            $.ajax({
//                    type:"POST",
                cache: false,
                async: true,
                dataType: "json",
                url: "updateUser",
                data: {"uids": pids,"state":"delete"},
                success: function (data) {
                    if (data > 0) {
                        $table.bootstrapTable('refresh');
                    }
                }
            });
        } else {
            return false;
        }
    }
    function edit() {
        var $table=$("#userListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if(selRow.length > 0){
            if(selRow.length > 1) {
                alert('请只选取一行要编辑的数据行！');
                return false;
            }
            uid=selRow[0].uid;
            location.href='userUpdate?uid='+uid;
        }else{
            alert('请选取要编辑的数据行！');
            return false;
        }
    }
</script>
</body>
</html>
