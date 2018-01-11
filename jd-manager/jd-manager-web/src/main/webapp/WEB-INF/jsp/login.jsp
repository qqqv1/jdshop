<%--
  Created by IntelliJ IDEA.
  User: jialin
  Date: 2018/1/9
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">

    <title> - 登录</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
    <script type="text/javascript" src="js/jquery.min.js"></script>

    <script>
        if (window.top !== window.self) {
            window.top.location = window.location;
        }
    </script>
    <script>
        function sub1() {
            $("#form").submit(function () {
                var uname = $("#uname").val();
                var upwd = $("#upwd").val();
                var v = $("#v").val();
                var vcode = $("#vcode").val();
                var flag = false;

                if (uname === null || upwd === null) {
                    $("#sp").html("密码或者用户名为空");
                }else if(v === null){
                    $("#sp").html("请输入验证码");
                }else if(vcode !== v){
                    $("#sp").html("验证码错误");
                } else {
                    $("#sp").html("");
                    flag = true;
                }
                //阻止表单提交
//                e.preventDefault();

                if (flag) {
                    $.ajax({
                        url: "userLogin",
                        data: {"username": uname, "password": upwd},
                        dataType: "json",
                        type:"POST",
                        cache: "false",
                        success: function (data) {
                            if (data > 0) {
                                location.href = "index";
                            } else {
                                $("#sp").html("用户名或者密码错误");
                            }
                        },
                        error: function (XMLHttpRequest, textStatus, errorThrown) {
//                            alert(XMLHttpRequest.status);
//                            alert(XMLHttpRequest.readyState);
//                            alert(textStatus);
                        }
                    });
                }
            });
        }

        function sub2() {
            window.location.href='userAdd';
        }
        $(function () {
            //点击图片更换验证码
            $("#Verify").click(function () {
                $(this).attr('src', 'images/securitycodeimageaction.action?timestamp=' + new Date().getTime());
                $(this).attr('value','8395');
            });
        });
    </script>
</head>

<body class="signin">
<script src="js/canvas-nest.min.js" count="200" zindex="-2" opacity="0.8" color="46,190,246"
        type="text/javascript"></script>
<div class="signinpanel">
    <div class="row">
        <div class="col-sm-12">
            <form method="post" action="javascript:void(0)" id="form" autocomplete="off">
                <h4 class="no-margins">登录：<span id="sp" style="color:red"></span></h4>
                <input autocomplete="off" type="text" class="form-control uname" name="user" placeholder="用户名" value=""
                       id="uname"/>
                <input autocomplete="off" type="password" class="form-control pword m-b" name="password"
                       placeholder="密码" value="" id="upwd"/>
                <input name="verifycode" class="form-control pword m-b" type="text" placeholder="验证码"
                       onblur="if(this.value===''){this.value=''}" onclick="if(this.value==='验证码:'){this.value='';}"
                       value="" style="width: 190px;" id='vcode'>
                <img src="images/securitycodeimageaction.action" id="Verify"
                     style="cursor:hand;height: 30px;float: right;margin-top: -45px;" alt="看不清，换一张"/>
                <input type="hidden" name="" id="v" value="8395">
                <button class="btn btn-success btn-block" onclick="sub1()">登录</button>
                <button class="btn btn-success btn-block" onclick="sub2()">注册</button>
            </form>
        </div>
    </div>
    <div class="signup-footer">
        <div class="pull-left">
        </div>
    </div>
</div>
</body>
</html>
