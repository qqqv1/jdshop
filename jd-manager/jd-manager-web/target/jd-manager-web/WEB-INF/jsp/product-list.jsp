<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/6
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <title>- 产品列表</title>
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
                    <h5>产品列表</h5>
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
                    <button id="up" type="button" class="btn btn-default" onclick="up();">
                        <span class="glyphicon glyphicon-arrow-up" aria-hidden="true"></span>上架
                    </button>
                    <button id="down" type="button" class="btn btn-default" onclick="down();">
                        <span class="glyphicon glyphicon-arrow-down" aria-hidden="true"></span>下架
                    </button>
                </div>
                <table class="table table-striped table-bordered table-hover dataTables-example" id="productListDg"></table>
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
        $("#productListDg").bootstrapTable({
            toolbar:"#toolbar",
            url:'products',
            pagination:true,
            search: true,
            clickToSelect: true,
            columns: [[
                {checkbox : true,align : 'center'},
                {field: 'pid', title: '商品编号',sortable : true},
                {field: 'pname', title: '商品标题',sortable : true},
                {field: 'pdesc', title: '商品详情',sortable : true},
                {field: 'marketPrice', title: '商品售价',sortable : true},
                {field: 'shopPrice', title: '商品供货价',sortable : true},
                {field: 'cname', title: '分类名称',sortable : true},
                {
                    field: 'created', title: '创建时间', formatter: function (v, r, i) {
                        return moment(v).format('L');
                    },sortable : true
                },
                {
                    field:'isHot',title:'是否热门', formatter: function (v, r, i) {
                        switch (v) {
                            case 0:
                                return '否';
                                break;
                            case 1:
                                return '是';
                                break;
                            default:
                                return '未知';
                                break;
                        }
                    },sortable : true
                },
                {
                    field: 'pflag', title: '商品状态', formatter: function (v, r, i) {
                        switch (v) {
                            case 1:
                                return '正常';
                                break;
                            case 2:
                                return '下架';
                                break;
                            case 3:
                                return '删除';
                                break;
                            default:
                                return '未知';
                                break;
                        }
                    },sortable : true
                }
            ]]
        })
    });
    function add(){
        location.href='product-add';
    }
    function del() {
        var pids=[];
        var $table=$("#productListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if (selRow.length < 1) {
            alert('请选取要删除的数据行！');
            return false;
        }
        var flag = confirm('此操作不可逆，确认删除吗？');
        if (flag === true) {
            for (var i = 0; i < selRow.length; i++) {
                pids.push(selRow[i].pid)
            }
            $.ajax({
//                    type:"POST",
                cache: false,
                async: true,
                dataType: "json",
                url: "updateproduct",
                data: {"pids": pids,"pflag":3},
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
    function up() {
        var pids=[];
        var $table=$("#productListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if (selRow.length < 1) {
            alert('请选取要上架的数据行！');
            return false;
        }
        var flag = confirm('确认上架吗？');
        if (flag === true) {
            for (var i = 0; i < selRow.length; i++) {
                pids.push(selRow[i].pid)
            }
            $.ajax({
//                    type:"POST",
                cache: false,
                async: true,
                dataType: "json",
                url: "updateproduct",
                data: {"pids": pids,"pflag":1},
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
    function down() {
        var pids=[];
        var $table=$("#productListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if (selRow.length  < 1) {
            alert('请选取要下架的数据行！');
            return false;
        }
        var flag = confirm('确认下架吗？');
        if (flag === true) {
            for (var i = 0; i < selRow.length; i++) {
                pids.push(selRow[i].pid)
            }
            $.ajax({
//                    type:"POST",
                cache: false,
                async: true,
                dataType: "json",
                url: "updateproduct",
                data: {"pids": pids,"pflag":2},
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
        var $table=$("#productListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if(selRow.length > 0){
            if(selRow.length > 1) {
                alert('请只选取一行要编辑的数据行！');
                return false;
            }
            pid=selRow[0].pid;
            location.href='product-edit?pid='+pid;
        }else{
            alert('请选取要编辑的数据行！');
            return false;
        }
    }
</script>
</body>
</html>