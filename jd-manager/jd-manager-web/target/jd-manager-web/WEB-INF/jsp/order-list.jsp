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
                    </div>
                </div>
                <div class="ibox-content">
                    <div id="toolbar">
                        <button id="edit" type="button" class="btn btn-default" onclick="edit();">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                        </button>
                        <button id="delete" type="button" class="btn btn-default" onclick="del();">
                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                        </button>

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
<script src="moment/moment-with-locales.js"></script>
<script>
    moment.locale();
</script>
<script>
    $(function () {
        $("#orderListDg").bootstrapTable({
           //自适应查询，查询记录所有字段
            search: true,
            toolbar:'#toolbar',
            url:'orders',

            clickToSelect: true,
            pagination:true,
            columns: [[
                {field: 'ck', checkbox: true},
                {field: 'id', title: '订单详情编号',sortable:true},
                {field: 'pname', title: '商品名',sortable:true},
                {field: 'num', title: '商品数量'},

                {field: 'totalFee', title: '小计'},
//                {field: 'state', title: '订单状态'},
                {
                    field: 'title', title: '订单状态', formatter: function (v, r, i) {
//                        console.log(v);
//                        console.log(v.valueOf())
                    switch (v) {
                        case '0':
                            return '已删除';
                            break;
                        case '1':
                            return '未支付';
                            break;
                        case '2':
                            return '已支付，未发货';
                            break;
                        case '3':
                            return '已支付，已发货';
                            break;
                        case 4:
                            return '已完成';
                            break;
                        default:
                            return '未知';
                            break;
                    }
                },sortable : true
                },
                {field: 'receiverName', title: '买家'},
                {field: 'receiverMobile', title: '手机'},
                {field:'receiverAddress',title:'地址'},
                {field: 'createTime', title: '订单时间', formatter: function (v, r, i) {
                    return moment(v).format('YYYY-MM-DD');
                },sortable : true
                }
            ]]
        })
    })

    function del() {
        var ids=[];
        var $table=$("#orderListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if(selRow!=null){
            for (var i = 0; i < selRow.length; i++) {
                ids.push(selRow[i].id)
            }
            var flag=confirm('此操作不可逆，确认删除吗？')
            if(flag==true) {
                $.ajax({
//                    type:"POST",
                    cache: false,
                    async: true,
                    dataType: "json",
                    url: "deleteOrderItems",
                    data: {"ids[]": ids},
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
        var $table=$("#orderListDg");
        var selRow = $table.bootstrapTable('getSelections');
        if(selRow!=null){
            if(selRow.length>1) {
                alert('请每次只选中一行数据！');
                return false;
            }
            id=selRow[0].id;
            location.href='order-edit?id='+id;
        }else{
            alert('请选取要编辑的数据行！');
            return false;
        }
    }
</script>
</body>
</html>