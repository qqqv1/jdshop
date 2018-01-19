<%--
  Created by IntelliJ IDEA.
  User: jialin
  Date: 2018/1/16
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>注册</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <style type="text/css">
        .am-tab-panel form div label i:before{
            line-height: inherit;
        }
    </style>

    <link rel="stylesheet" href="AmazeUI-2.4.2/assets/css/amazeui.min.css" type="text/css" />
    <link rel="stylesheet" href="css/dlstyle.css" type="text/css">

    <script type="text/javascript" src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>
</head>

<body>

    <div class="login-boxtitle">
        <a href="index"><img alt="" src="images/logobig.png" /></a>
    </div>

    <div class="res-banner">
    <div class="res-main">
        <div class="login-banner-bg"><span></span><img src="images/big.jpg" /></div>
        <div class="login-box">
            <div class="am-tabs" data-am-tabs>
                <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                    <li class="am-active"><a href="">邮箱注册</a></li>
                    <li><a href="">手机号注册</a></li>
                </ul>

                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-active">
                        <form id="form1" method="post">

                            <div class="user-email">
                                <label for="email"><i class="am-icon-envelope-o"></i></label>
                                <input type="email" name="" id="email" placeholder="请输入邮箱账号">
                            </div>
                            <div class="user-pass">
                                <label for="upwd"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="upwd" placeholder="设置密码">
                            </div>
                            <div class="user-pass">
                                <label for=""><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="" placeholder="确认密码">
                            </div>

                        </form>

                        <div class="login-links">
                            <label for="-me">
                                <input id="-me" type="checkbox"> 点击表示您同意商城《服务协议》
                            </label>
                        </div>
                        <div class="am-cf">
                            <input type="submit"  id="sub1" name="" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>

                    </div>

                    <div class="am-tab-panel">
                        <form id="form2" method="post">
                            <div class="user-phone">
                                <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
                                <input type="tel" name="" id="phone" placeholder="请输入手机号">
                            </div>
                            <div class="verification">
                                <label for="code"><i class="am-icon-code-fork"></i></label>
                                <input type="tel" name="" id="code" placeholder="请输入验证码">
                                <a class="btn" href="javascript:void(0);" onclick="sendMobileCode();" id="sendMobileCode">
                                    <span id="dyMobileButton">获取</span></a>
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="password" placeholder="设置密码">
                            </div>
                            <div class="user-pass">
                                <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                <input type="password" name="" id="passwordRepeat" placeholder="确认密码">
                            </div>
                        </form>
                        <div class="login-links">
                            <label for="reader-me">
                                <input id="reader-me" type="checkbox"> 点击表示您同意商城《服务协议》
                            </label>
                        </div>
                        <div class="am-cf">
                            <input type="submit" id="sub2" name="" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                        </div>

                        <hr>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>

    <!--底部-->
    <jsp:include page="bottom.jsp"/>

<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    $(function() {
        $("#sub1").click(function(){
            alert("sub11111111111111111111");
            var uname = $("#email").val();
            var upwd = $("#upwd").val();
            $.ajax({
                url: "insertUserByEmail",
                data:{"username": uname, "password": upwd},
                dataType:"json",
                type:"POST",
                cache:"false",
                success: function (data) {
                    if (data > 0) {
                        alert("注册成功");
                        location.href = "client-login";
                    } else {
                        alert("注册失败");
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                }
            });
        });

        $("#sub2").click(function(){
            var username = $("#phone").val();
            var password = $("#password").val();
            alert("sub2222222");
            $.ajax({
                url: "insertUserByTelephone",
                data:{"username": username, "password": password},
                dataType:"json",
                type:"POST",
                cache:"false",
                success: function (data) {
                    if (data > 0) {
                        alert("注册成功");
                        location.href = "client-login";
                    } else {
                        alert("注册失败");
                    }
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                }
            });
        });


    });
</script>
</body>
</html>


