<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>购物车页面</title>
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="css/seastyle.css" rel="stylesheet" type="text/css" />
    <link href="css/cartstyle.css" rel="stylesheet" type="text/css" />
    <link href="css/optstyle.css" rel="stylesheet" type="text/css" />

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
                    <div class="td-inner" >商品信息</div>
                </div>
                <div class="th th-price" style="width: 20%">
                    <div class="td-inner">单价</div>
                </div>
                <div class="th th-amount" style="width: 25%">
                    <div class="td-inner">数量</div>
                </div>
                <div class="th th-sum" style="width: 15%">
                    <div class="td-inner">金额</div>
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
<<<<<<< HEAD





                       <table width="100%" border="0" cellspacing="0" id="cart" class="table table-striped" >
                       <%--<table width="100%" border="0" cellspacing="0" id="cart" class="table table-striped table-hover">--%>
                                <c:forEach items="${cart.items }" var="entry">
                                    <tr></tr>
                                    <tr>
                                        <td></td>
                                        <td width="15%"><img style="width:60px;height:60px;" alt="" src="${entry.value.product.pimage}"></td>
                                        <td width="23%">${entry.value.product.pname }</td>

                                        <td width="17%">${entry.value.product.shopPrice}</td>
                                        <td width="25%">
                                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                            <input class="min am-btn" name="" type="button" value="-" onclick="reduce(${entry.value.product.pid},this)" />
                                            <input class="text_box" name="" type="text" id="count" value="${entry.value.count }" style="width:30px;" />
                                            <input class="add am-btn" name="" type="button" value="+" onclick="add(${entry.value.product.pid },this)" />
                                        </td>
                                        <%--<td width="10%">1</td>--%>
                                        <td width="12%">${entry.value.subTotal }元</td>

                                        <td width="8%">&nbsp;&nbsp;&nbsp;&nbsp;
                                            <%--<a href="javascript:deleteProductFromCart(${entry.value.product.pid })"  class="delete">--%>
                                                <%--删除</a>--%>
                                            <a  href="${pageContext.request.contextPath}/deleteProductFromCart?pid=${entry.value.product.pid}">
                                                <%--onclick="deleteProductFromCart(${entry.value.product.pid})"--%>
                                                删除</a>
                                            <input type="hidden" value="${entry.value.product.pid}">
                                        </td>
                                        <%--data-point-url="#"--%>
                                    </tr>

                                </c:forEach>
                            </table>






=======
                    <table width="100%" border="0" cellspacing="0" id="cart" class="table table-striped" >
                        <%--<table width="100%" border="0" cellspacing="0" id="cart" class="table table-striped table-hover">--%>
                        <c:forEach items="${cart.items }" var="entry">
                            <tr></tr>
                            <tr>
                                <td></td>
                                <td width="15%"><img style="width:60px;height:60px;" alt="" src="${entry.value.product.pimage}"></td>
                                <td width="23%">${entry.value.product.pname }</td>
                                <td width="17%">${entry.value.product.shopPrice}</td>
                                <td width="25%">
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                    <input class="min am-btn" name="" type="button" value="-" onclick="reduce(${entry.value.product.pid},this)" />
                                    <input class="text_box" name="" type="text" id="count" value="${entry.value.count }" style="width:30px;" />
                                    <input class="add am-btn" name="" type="button" value="+" onclick="add(${entry.value.product.pid },this)" />
                                </td>
                                    <%--<td width="10%">1</td>--%>
                                <td width="12%">${entry.value.subTotal }元</td>
                                <td width="8%">&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="javascript:deleteProductFromCart(${entry.value.product.pid })" data-point-url="#" class="delete">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
>>>>>>> origin/branch_zhou
                </div>
            </div>
        </tr>
        <div class="clear"></div>
       <%-- <tr class="item-list">
            <div class="bundle  bundle-last ">
                <div class="bundle-hd">
                    <div class="bd-promos">
                        <div class="bd-has-promo">已享优惠:<span class="bd-has-promo-content">省￥19.50</span>&nbsp;&nbsp;</div>
                        <div class="act-promo">
                            <a href="#" target="_blank">第二支半价，第三支免费<span class="gt">&gt;&gt;</span></a>
                        </div>
                        <span class="list-change theme-login">编辑</span>
                    </div>
                </div>
                <div class="clear"></div>
                <div class="bundle-main">
                    <ul class="item-content clearfix">
                        <li class="td td-chk">
                            <div class="cart-checkbox ">
                                <input class="check" id="J_CheckBox_170769542747" name="items[]" value="170769542747" type="checkbox">
                                <label for="J_CheckBox_170769542747"></label>
                            </div>
                        </li>
                        <li class="td td-item">
                            <div class="item-pic">
                                <a href="#" target="_blank" data-title="美康粉黛醉美东方唇膏口红正品 持久保湿滋润防水不掉色护唇彩妆" class="J_MakePoint" data-point="tbcart.8.12">
                                    <img src="images/kouhong.jpg_80x80.jpg" class="itempic J_ItemImg"></a>
                            </div>
                            <div class="item-info">
                                <div class="item-basic-info">
                                    <a href="#" target="_blank" title="美康粉黛醉美唇膏 持久保湿滋润防水不掉色" class="item-title J_MakePoint" data-point="tbcart.8.11">美康粉黛醉美唇膏 持久保湿滋润防水不掉色</a>
                                </div>
                            </div>
                        </li>
                        <li class="td td-info">
                            <div class="item-props item-props-can">
                                <span class="sku-line">颜色：10#蜜橘色</span>
                                <span class="sku-line">包装：两支手袋装（送彩带）</span>
                                <span tabindex="0" class="btn-edit-sku theme-login">修改</span>
                                <i class="theme-login am-icon-sort-desc"></i>
                            </div>
                        </li>
                        <li class="td td-price">
                            <div class="item-price price-promo-promo">
                                <div class="price-content">
                                    <div class="price-line">
                                        <em class="price-original">78.00</em>
                                    </div>
                                    <div class="price-line">
                                        <em class="J_Price price-now" tabindex="0">39.00</em>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li class="td td-amount">
                            <div class="amount-wrapper ">
                                <div class="item-amount ">
                                    <div class="sl">
                                        <input class="min am-btn" name="" type="button" value="-" />
                                        <input class="text_box" name="" type="text" value="3" style="width:30px;" />
                                        <input class="add am-btn" name="" type="button" value="+" />
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li class="td td-sum">
                            <div class="td-inner">
                                <em tabindex="0" class="J_ItemSum number">117.00</em>
                            </div>
                        </li>
                        <li class="td td-op">
                            <div class="td-inner">
                                <a title="移入收藏夹" class="btn-fav" href="#">
                                    移入收藏夹</a>
                                <a href="javascript:;" data-point-url="#" class="delete">
                                    删除</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </tr>--%>
    </div>
    <div class="clear"></div>

    <%--结算那一行--%>
    <div class="float-bar-wrapper">
        <%--<div id="J_SelectAll2" class="select-all J_SelectAll">
            <div class="cart-checkbox">
                <input class="check-all check" id="J_SelectAllCbx2" name="select-all" value="true" type="checkbox">
                <label for="J_SelectAllCbx2"></label>
            </div>
            <span>全选</span>
        </div>
        <div class="operations">
            <a href="#" hidefocus="true" class="deleteAll">删除</a>
            <a href="#" hidefocus="true" class="J_BatchFav">移入收藏夹</a>

        </div>--%>

        <div class="float-bar-right">
            <div class="amount-sum">
               <%-- <span class="txt">已选商品</span>
                <em id="J_SelectedItemsCount">0</em><span class="txt">件</span>--%>
                <div class="arrow-box">
                    <span class="selected-items-arrow"></span>
                    <span class="arrow"></span>
                </div>
            </div>

            <div class="price-sum">
                <span class="txt">合计:</span>
                <strong class="price" >&nbsp;&nbsp;¥</strong>
                <strong class="price" id="price">${cart.total }<em id="J_Total"></em></strong>
            </div>

            <div class="btn-area">
                <a  id="J_Go1" class="submit-btn submit-btn-disabled" aria-label="请注意如果没有选择宝贝，将无法结算" onclick="goonShopping()">
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
    <%--<div class="footer">
        <div class="footer-hd">
            <p>
                <a href="#">恒望科技</a>
                <b>|</b>
                <a href="#">商城首页</a>
                <b>|</b>
                <a href="#">支付宝</a>
                <b>|</b>
                <a href="#">物流</a>
            </p>
        </div>
        <div class="footer-bd">
            <p>
                <a href="#">关于恒望</a>
                <a href="#">合作伙伴</a>
                <a href="#">联系我们</a>
                <a href="#">网站地图</a>
                <em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
            </p>
        </div>
    </div>--%>

</div>

<script>
<%--根据ID删除商品--%>
<<<<<<< HEAD

/*$(function () {
    $(".delete").each(function (){
        var that =this;
        $(this).on("click", function(){
            var rows=that.parentNode.parentNode.rowIndex;
            var pid=$('#cart tr:eq('+rows+') td:eq(6) input').val();
            console.log(pid);
            console.log(valueOf(pid))
            window.location.href="${pageContext.request.contextPath}/deleteProductFromCart?pid="+pid;
        });
    })
})*/


   /* function deleteProductFromCart(pid){
        console.log(pid)
        window.location.href="${pageContext.request.contextPath}/deleteProductFromCart?pid="+pid;
        console.log(123)

    }*/
=======
    function deleteProductFromCart(pid){
        window.location.href="${pageContext.request.contextPath}/deleteProductFromCart?pid="+pid;
    }
>>>>>>> origin/branch_zhou
//    继续购物

    function goonShopping(){
        <%--window.location.href="${pageContext.request.contextPath}/product-portal-list";--%>
        window.location.href="${pageContext.request.contextPath}/product2";
    }

//    选中一种
    function reduce(pid,elm){
        var rows1=elm.parentNode.parentNode.rowIndex;
        if(parseInt($('#cart tr:eq('+rows1+') td:eq(4) ').find('input[class*=text_box]').val())!=0){
            $.ajax({
                url:"reduceProductFromCart",
                data:{'pid':pid},
                type:'post',
                success:function (data) {
//                debugger;
//                $('#subtotal').val(11);
                    console.log(data);
//                $('#subtotal').text(data.subTotal);
//                $('#price').text(data.total);

                    var rows=elm.parentNode.parentNode.rowIndex;
//                td:eq(5)
                    /*$('#cart tr:eq('+rows+') td:eq(5) ').html((data.subTotal).toFixed(1));
                    $('#price').text((data.total).toFixed(1));*/
                    $('#cart tr:eq('+rows+') td:eq(5) ').html((data.subTotal).toFixed(1));
                    $('#price').text((data.total).toFixed(1));
                }
            });
        }
    }

    function add(pid,elm){
//        console.log(pid)
        $.ajax({
            url:"addProductOneToCart",
            data:{'pid':pid},
            type:'post',
            success:function (data) {
//                debugger;
//                $('#subtotal').val(11);
                console.log(data);
//                $('#subtotal').text(data.subTotal);
//                $('#price').text(data.total);
                var rows=elm.parentNode.parentNode.rowIndex;
//                td:eq(5)
                /*$('#cart tr:eq('+rows+') td:eq(5) ').html((data.subTotal).toFixed(1));
                $('#price').text((data.total).toFixed(1));*/
                $('#cart tr:eq('+rows+') td:eq(5) ').html((data.subTotal).toFixed(1));
                $('#price').text((data.total).toFixed(1));
            }
        });
    }
</script>
</body>
</html>
