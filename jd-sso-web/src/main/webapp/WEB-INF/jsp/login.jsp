<%--
  Created by IntelliJ IDEA.
  User: jialin
  Date: 2018/1/16
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <style type="text/css">
        #form div label i:before{
            line-height: inherit;
        }
    </style>

    <link rel="stylesheet" href="AmazeUI-2.4.2/assets/css/amazeui.css" type="text/css"/>
    <link rel="stylesheet" href="css/dlstyle.css" type="text/css">
</head>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    $(function(){
        $("#submit").click(function () {
            var uname = $("#username").val();
            var upwd = $("#password").val();
            var flag = false;
            if (uname == null || upwd == null) {
                $("#sp").html("密码或者用户名为空");
            } else {
                $("#sp").html("");
                flag = true;
            }
            if (flag) {
                $.ajax({
                    url: "user/login",
                    data: {"username": uname, "password": upwd},
                    dataType: "json",
                    type:"post",
                    cache: "false",
                    success: function (data) {
                        if (data) {
                            location.href = "http://localhost:8083/jdshop";
                        } else {
                            $("#sp").html("用户名或者密码错误");
                        }
                    },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        alert(XMLHttpRequest.status);
                        alert(XMLHttpRequest.readyState);
                        alert(textStatus);
                    }
                });
            }
        });
    });
</script>
<body>

<div class="login-boxtitle">
    <a href="index"><img alt="logo" src="images/logobig.png" /></a>
</div>

<div class="login-banner">
    <div class="login-main">
        <div class="login-banner-bg"><span></span><img src="images/big.jpg" /></div>
        <div class="login-box">

            <h3 class="title">登录商城</h3>

            <div class="clear"></div>

            <div class="login-form">
                <form id="form" >
                    <div class="user-name">
                        <label for="username"><i class="am-icon-user"></i></label>
                        <input type="text" name="username" id="username" placeholder="邮箱/手机/用户名">
                    </div><span id="sp"></span>
                    <div class="user-pass">
                        <label for="password"><i class="am-icon-lock"></i></label>
                        <input type="password" name="password" id="password" placeholder="请输入密码">
                    </div>
                </form>
            </div>

            <div class="login-links">
                <label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>
                <a href="#" class="am-fr">忘记密码</a>
                <a href="client-register" class="zcnext am-fr am-btn-default">注册</a>
                <br />
            </div>
            <div class="am-cf">
                <input type="submit" id="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm" >
            </div>
            <div class="partner">
                <h3>合作账号</h3>
                <div class="am-btn-group">
                    <li><a href="#"><i class="am-icon-qq am-icon-sm"></i><span>QQ登录</span></a></li>
                    <li><a href="#"><i class="am-icon-weibo am-icon-sm"></i><span>微博登录</span> </a></li>
                    <li><a href="#"><i class="am-icon-weixin am-icon-sm"></i><span>微信登录</span> </a></li>
                </div>
            </div>
        </div>
    </div>
</div>

<!--底部-->
<jsp:include page="/WEB-INF/jsp/bottom.jsp"/>
</body>
</html>
