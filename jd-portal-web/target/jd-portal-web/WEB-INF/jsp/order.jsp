<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/16
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>订单管理</title>

    <link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="css/personal.css" rel="stylesheet" type="text/css">
    <link href="css/orstyle.css" rel="stylesheet" type="text/css">

    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/bootstrap-table.css" rel="stylesheet">

    <script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="AmazeUI-2.4.2/assets/js/amazeui.js"></script>

</head>

<body>

<div class="center">
    <div class="col-main">
        <div class="main-wrap">

            <div class="user-order">

                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">订单管理</strong> / <small>Order</small></div>
                </div>
                <hr/>

                <div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

                    <ul class="am-avg-sm-5 am-tabs-nav am-nav am-nav-tabs">
                        <li class="am-active"><a href="#tab1">所有订单</a></li>
                        <li><a href="#tab2">待付款</a></li>
                        <li><a href="#tab3">待发货</a></li>
                        <li><a href="#tab4">待收货</a></li>
                        <li><a href="#tab5">待评价</a></li>
                    </ul>
                    <table class="table table-striped table-bordered table-hover dataTables-example" id="orderListDg"></table>
                </div>

    </div>

</div>
        <!-- 全局js -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap-table.min.js"></script>
        <script src="js/bootstrap-table-zh-CN.js"></script>
        <script src="moment/moment-with-locales.js"></script>

        <script>

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
                        {field: 'itemid', title: '订单详情编号'},
                        {field: 'pname', title: '商品名',sortable:true},
                        {field: 'count', title: '商品数量'},

                        {field: 'subtotal', title: '合计'},
//                {field: 'state', title: '订单状态'},
                        {
                            field: 'state', title: '订单状态', formatter: function (v, r, i) {
                                switch (v) {
                                    case 0:
                                        return '已删除';
                                        break;
                                    case 1:
                                        return '未支付';
                                        break;
                                    case 2:
                                        return '已支付，未发货';
                                        break;
                                    case 3:
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
                        {field: 'name', title: '买家'},
                        {field: 'telephone', title: '手机'},
                        {field:'address',title:'地址'},
                        {field: 'ordertime', title: '订单时间', formatter: function (v, r, i) {
                                return moment(v).format('YYYY-MM-DD');
                            },sortable : true
                        }
                    ]]
                })
            })

            function del() {
                var itemids=[];
                var $table=$("#orderListDg");
                var selRow = $table.bootstrapTable('getSelections');
                if(selRow!=null){
                    for (var i = 0; i < selRow.length; i++) {
                        itemids.push(selRow[i].itemid)
                    }
                    var flag=confirm('此操作不可逆，确认删除吗？')
                    if(flag==true) {
                        $.ajax({
//                    type:"POST",
                            cache: false,
                            async: true,
                            dataType: "json",
                            url: "deleteOrders",
                            data: {"itemids[]": itemids},
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
                    itemid=selRow[0].itemid;
                    location.href='order-edit?itemid='+itemid;
                }else{
                    alert('请选取要编辑的数据行！');
                    return false;
                }
            }
        </script>
</body>

</html>
