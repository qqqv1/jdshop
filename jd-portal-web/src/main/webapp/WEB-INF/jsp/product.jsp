<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>购物车页面</title>

    <link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="css/cartstyle.css" rel="stylesheet" type="text/css" />
    <link href="css/optstyle.css" rel="stylesheet" type="text/css" />



</head>

<body>
<%--购买商品--%>
<input name="count" type="button" id="count"  value=购买1
       style="width:40px;text-align:center" />

<input name="count2" type="button" id="count2"  value=购买2
       style="width:40px;text-align:center" />

<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">

    $(function(){

        $("#count").click(function(){
            location.href="${pageContext.request.contextPath}/addProductToCart?pid="+5+"&count="+1;
        });
    });

    $(function(){

        $("#count2").click(function(){
            location.href="${pageContext.request.contextPath}/addProductToCart?pid="+6+"&count="+1;
        });
    });


</script>
</body>

</html>
