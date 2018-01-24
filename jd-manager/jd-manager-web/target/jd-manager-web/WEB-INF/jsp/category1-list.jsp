<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/8
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <title> - 分类列表</title>
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
                    <h5>分类列表</h5>
                </div>
            </div>
            <div class="ibox-content">
                <div id="toolbar" class="btn-group">
                    <button id="add" type="button" class="btn btn-default" onclick="add();">
                        <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
                    </button>
                    <%-- <button id="edit" type="button" class="btn btn-default" onclick="edit();">
                         <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                     </button>--%>
                    <button id="delete" type="button" class="btn btn-default" onclick="del();">
                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                    </button>
                </div>
                <table class="table table-striped table-bordered table-hover dataTables-example" id="categoryListDg"></table>
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
        $("#categoryListDg").bootstrapTable({
            toolbar:"#toolbar",
            url:'listCats1',
            pagination:true,
            search: true,
            clickToSelect: true,
            columns: [[
                {checkbox : true,align : 'center'},
                {field: 'cid', title: '分类编号',sortable : true},
                {field: 'cname', title: '分类名称',sortable : true},
                {
                    field: 'created', title: '创建时间', formatter: function (v, r, i) {
                    return moment(v).format('L');
                },sortable : true
                },
                {
                    field: 'updated', title: '更新时间', formatter: function (v, r, i) {
                    return moment(v).format('L');
                },sortable : true
                },
                {title:'操作',formatter: function actionFormatter(value, row, index) {
                    return '<a class="btn btn-white btn-bitbucket" title="编辑" id="mod"><i class="fa fa fa-pencil fa-fw" aria-hidden="true"></i></a> ' +
                        '<a class="btn btn-white btn-bitbucket" title="删除" id="delete"><i class="fa fa-trash-o fa-fw" aria-hidden="true"></i></a>';
                },events:window.actionEvents = {
                    'click #mod': function(e, value, row, index) {
                        //修改操作
                        location.href='category1-edit?cid='+row.cid;
                        return false;
                    },
                    'click #delete' : function(e, value, row, index) {
                        //删除操作
                        var $table=$("#categoryListDg");
                        var cids=[];
                        cids.push(row.cid);
                        $.ajax({
                            type:"POST",
                            dataType: "json",
                            url: "deleteCat",
                            data: {"cids": cids},
                            success: function (data) {
                                if (data > 0) {
                                    $table.bootstrapTable('refresh');
                                }
                            }
                        });
                        return false;
                    }
                },align : 'center'}
            ]]
        })
    });
    function add(){
        location.href='category1-add';
    }
    function del() {
        var cids=[];
        var $table=$("#categoryListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if(selRow.length>0){
            console.log(selRow);
            for (var i = 0; i < selRow.length; i++) {
                cids.push(selRow[i].cid)
            }
            var flag=confirm('此操作不可逆，确认删除吗？');
            if(flag===true) {
                $.ajax({
//                    type:"POST",
                    cache: false,
                    async: false,
                    dataType: "json",
                    url: "deleteCat",
                    data: {"cids": cids},
                    success: function (data) {
                        if (data > 0) {
                            $table.bootstrapTable('refresh');
                        }
                    }
                });
            }else{
                return false;
            }
        }else{
            alert('请选取要删除的数据行！');
            return false;
        }
    }
    function edit() {
        var $table=$("#categoryListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if(selRow.length > 0){
            if(selRow.length>1) {
                alert('请只选取一行要编辑的数据行！');
                return false;
            }
            cid=selRow[0].cid;
            location.href='category1-edit?cid='+cid;
        }else{
            alert('请选取要编辑的数据行！');
            return false;
        }
    }
</script>
</body>
</html>
