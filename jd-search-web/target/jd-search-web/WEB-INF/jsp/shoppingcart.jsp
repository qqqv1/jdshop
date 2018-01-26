<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>购物车页面</title>
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css"/>
    <link href="basic/css/demo.css" rel="stylesheet" type="text/css"/>
    <link href="css/seastyle.css" rel="stylesheet" type="text/css"/>
    <link href="css/cartstyle.css" rel="stylesheet" type="text/css"/>
    <link href="css/optstyle.css" rel="stylesheet" type="text/css"/>

    <script type="text/javascript" src="js/jquery.js"></script>

</head>

<body>

<jsp:include page="top.jsp"/>
<div class="clear"></div>

<!--购物车 -->
<div class="concent">
    <div id="cartTable">
        <div class="cart-table-th">
            <div class="wp">
                <div class="th th-chk">
                    <div id="J_SelectAll1" class="select-all J_SelectAll"></div>
                </div>
                <div class="th th-item" style="width: 30%">
                    <div class="td-inner">商品信息</div>
                </div>
                <div class="th th-price" style="width: 20%">
                    <div class="td-inner">单价</div>
                </div>
                <div class="th th-amount" style="width: 25%">
                    <div class="td-inner">数量</div>
                </div>
                <div class="th th-sum" style="width: 15%">
                    <div class="td-inner">金额(元)</div>
                </div>
                <div class="th th-op" style="width: 10%">
                    <div class="td-inner">操作</div>
                </div>
            </div>
        </div>

        <tr class="item-list">
            <div class="bundle  bundle-last ">
                <div class="clear"></div>
                <div class="bundle-main">


                    <table width="100%" border="0" cellspacing="0" id="cart" class="table table-striped table-hover">
                        <c:forEach items="${cart.items }" var="entry">
                            <tr>
                                <td></td>
                                <td width="15%"><img style="width:60px;height:60px;" alt="图片"
                                                     src="${entry.value.product.pimage}"></td>
                                <td width="23%">${entry.value.product.pname }</td>

                                <td width="17%">${entry.value.product.shopPrice}</td>
                                <td width="25%">
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input class="min am-btn btn btn-danger" name="" type="button" value="-"
                                           onclick="reduce(${entry.value.product.pid},this)"/>
                                    <input class="text_box" disabled="disabled" name="" type="text" id="count" value="${entry.value.count }"
                                           style="width:30px;"/>
                                    <input class="add am-btn btn btn-success btn-lg " name="" type="button" value="+" onclick="add(${entry.value.product.pid },this)"/>
                                </td>
                                <td width="12%">${entry.value.subTotal }</td>

                                <td width="8%">&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="${pageContext.request.contextPath}/deleteProductFromCart?pid=${entry.value.product.pid}">
                                        删除</a>
                                    <input type="hidden" value="${entry.value.product.pid}">
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </tr>
        <div class="clear"></div>

    </div>
    <div class="clear"></div>

    <%--结算那一行--%>
    <div class="float-bar-wrapper">

        <div class="float-bar-right">
            <div class="amount-sum">
                <div class="arrow-box">
                    <span class="selected-items-arrow"></span>
                    <span class="arrow"></span>
                </div>
            </div>

            <div class="price-sum">
                <span class="txt">合计:</span>
                <strong class="price">&nbsp;&nbsp;¥</strong>
                <strong class="price" id="price">${cart.total }<em id="J_Total"></em></strong>
            </div>

            <div class="btn-area">
                <a id="J_Go1" class="submit-btn submit-btn-disabled" aria-label="请注意如果没有选择宝贝，将无法结算"
                   onclick="goonShopping()">
                    <span>继续购物</span></a>
            </div>

            <div class="btn-area">
                <a href="pay.html" id="J_Go" class="submit-btn submit-btn-disabled" aria-label="请注意如果没有选择宝贝，将无法结算">
                    <span>结&nbsp;算</span>
                </a>
            </div>
        </div>
    </div>

    <jsp:include page="bottom.jsp"/>

</div>

<script>
    //删除商品
    function deleteProductFromCart(pid) {
        window.location.href = "${pageContext.request.contextPath}/deleteProductFromCart?pid=" + pid;
    }


    // 继续购物
    function goonShopping(){
        window.location.href="${pageContext.request.contextPath}/product-portal-list";
    }

    //    选中一种减
    function reduce(pid,elm){
        if($(elm.parentNode).find('#count').val()>1) {
            $.ajax({
                url:"reduceProductFromCart",
                data:{'pid':pid},
                type:'post',
                success:function (data) {
                    var rows = elm.parentNode.parentNode.rowIndex;
                    $('#cart').find('tr:eq(' + rows + ') td:eq(5) ').html((data.subTotal).toFixed(1));
                    $('#price').text((data.total).toFixed(1));
                }
            });
        }
    }

    //选中一种增加
    function add(pid, elm) {
        $.ajax({
            url: "addProductOneToCart",
            data: {'pid': pid},
            type: 'post',
            success: function (data) {
                console.log(data);
                var rows = elm.parentNode.parentNode.rowIndex;
//                $('#cart tr:eq(' + rows + ') td:eq(5) ').html((data.subTotal).toFixed(1));
                $('#cart').find('tr:eq('+rows+') td:eq(5) ').html((data.subTotal).toFixed(1));
                $('#price').text((data.total).toFixed(1));
            }
        });
    }

</script>
</body>
</html>
