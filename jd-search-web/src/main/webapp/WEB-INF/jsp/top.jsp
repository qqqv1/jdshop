<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/18
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--顶部导航条 -->
<div class="am-container header">
    <ul class="message-l">
        <div class="topMessage">
            <div class="menu-hd">
                <a href="client-login" target="_top" class="h">亲，请登录</a>
                <a href="client-register" target="_top">免费注册</a>
            </div>
        </div>
    </ul>
    <ul class="message-r">
        <div class="topMessage home">
            <div class="menu-hd"><a href="index" target="_top" class="h">商城首页</a></div>
        </div>
        <div class="topMessage my-shangcheng">
            <div class="menu-hd MyShangcheng"><a href="client-information" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
        </div>
        <div class="topMessage mini-cart">
            <div class="menu-hd"><a id="mc-menu-hd" href="shoppingcart" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>

        </div>
        <div class="topMessage favorite">
            <div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
        </div>
    </ul>
</div>

<!--悬浮搜索框-->

<div class="nav white">
    <div class="logo" style="width: 30%"><img src="images/logo.png" /></div>
    <div class="logoBig">
        <li><img src="images/logobig.png" /></li>
    </div>
    <div class="search-bar pr" >
        <a name="index_none_header_sysc" href="#"></a>
        <form action="javascript:void(0)">
            <input id="searchInput" name="pname" type="text" placeholder="搜索" autocomplete="off">
            <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
        </form>
    </div>
</div>
<script>
    $(function () {
        $('#ai-topsearch').on('click',function () {
            if($('#searchInput').val().trim()==''){
                window.location.href = 'product-portal-list?keyword=手机' ;
            }else {
                window.location.href = 'product-portal-list?keyword=' + $('#searchInput').val();
            }
        })
    })

</script>