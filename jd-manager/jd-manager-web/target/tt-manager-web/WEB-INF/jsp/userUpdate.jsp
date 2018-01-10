<%--
  Created by IntelliJ IDEA.
  User: jialin
  Date: 2018/1/9
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="shortcut icon" href="favicon.ico">


    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">
    <link href="css/custom.css" rel="stylesheet">
    <link href="css/chosen.css" rel="stylesheet">
    <link href="css/bootstrap-colorpicker.min.css" rel="stylesheet">
    <link href="css/cropper.min.css" rel="stylesheet">
    <link href="css/switchery.css" rel="stylesheet">
    <link href="css/jasny-bootstrap.min.css" rel="stylesheet">
    <link href="css/jquery.nouislider.css" rel="stylesheet">
    <link href="css/datepicker3.css" rel="stylesheet">
    <link href="css/ion.rangeSlider.css" rel="stylesheet">
    <link href="css/ion.rangeSlider.skinFlat.css" rel="stylesheet">
    <link href="css/awesome-bootstrap-checkbox.css" rel="stylesheet">
    <link href="css/clockpicker.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/laydate.css">
    <link type="text/css" rel="stylesheet" href="css/laydate1.css">

    <link href="css/sweetalert.css" rel="stylesheet">
    <link rel="stylesheet" href="themes/default/default.css" />
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>用户注册</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal" id="user" action="javascript:void(0)">
                        <div class="form-group">
                            <input type="hidden" id="uid" name="uid">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-8" style="color: red;font-size: 15px">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>用户名：</label>
                            <div class="col-sm-8">
                                <input id="username" name="username" value="" type="text" placeholder=" 请输入用户名"  class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>密码：</label>
                            <div class="col-sm-8">
                                <input id="password" name="password" value="" type="password" placeholder=" 请输入密码" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>确认密码：</label>
                            <div class="col-sm-8">
                                <input id="re_password" name="re_password" value="" type="password" placeholder=" 请再次输入密码" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;"></span>真实姓名：</label>
                            <div class="col-sm-8">
                                <input id="name" name="name" value="" type="text" placeholder=" 请输入真实姓名" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;"></span>性别：</label>
                            <div class="col-sm-8">
                                <select id="sex" name="sex" style="width: 100%;" class="form-control">
                                    <option selected="" value="1">男</option>
                                    <option selected="" value="0">女</option>
                                </select>
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;"></span>邮件：</label>
                            <div class="col-sm-8">
                                <input id="email" name="email" value="" type="text" placeholder=" 请输入邮箱" class="form-control" >
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;"></span>电话：</label>
                            <div class="col-sm-8">
                                <input id="telephone" name="telephone" value="" type="text" placeholder=" 请输入电话" class="form-control" >
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;"></span>生日：</label>
                            <div class="col-sm-8">
                                <input id="birthday" name="birthday" value="" type="date" placeholder=" 请输入生日箱" class="form-control" >
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">账户状态：</label>
                            <span class="spanwitch" style="float: left;margin-left: 15px;">
                                <div class="onoffswitch">
                                    <input class="onoffswitch-checkbox" id="state" type="checkbox" name="state" value="1">
                                    <label class="onoffswitch-label" for="state">
                                        <span class="onoffswitch-inner"></span>
                                        <span class="onoffswitch-switch"></span>
                                    </label>
                                </div>
                            </span>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-8">
                                <button id="submit" class="btn btn-sm btn-info" type="submit">确认保存</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>
<!-- 自定义js -->
<script src="js/content.js?v=1.0.0"></script>
<!-- Sweet alert -->
<script src="js/sweetalert.min.js"></script>
<!-- iCheck -->
<script src="js/icheck.min.js"></script>
<!-- jQuery Validation plugin javascript-->
<script src="js/jquery.validate.min.js"></script>
<script src="js/messages_zh.min.js"></script>

<script src="js/form-validate-demo.js"></script>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url:"user/${param.uid}",
            dataType:"json",
            success:function(data){
                $("#uid").val(data.uid);
                $("#username").val(data.username);
                $("#password").val(data.password);
                $("#name").val(data.name);
                if(data.sex==='男') {
                    $("#sex").val(1);
                }else{
                    $("#sex").val(0);
                }
                $("#email").val(data.email);
                $("#telephone").val(data.telephone);
                $("#birthday").val(data.birthday);
                $("#state").val(data.state);
            }
        })
    });
    $(function () {
        //有值true
        var data = $('#product').serialize();
        //序列化获得表单数据，结果为：user_id=12&user_name=John&user_age=20
        var submitData = decodeURIComponent(data, true);
        //submitData是解码后的表单数据，结果同上
        $("#submit").click(function () {
            var username = $("#username").val();
            var password = $("#password").val();
            var re_password = $("#re_password").val();
            if (!username) {
                alert("请输入用户名");
                return false;
            } else if (!password) {
                alert("请输入密码");
                return false;
            } else if (!re_password) {
                alert("请再次输入密码");
                return false;
            }
            $.ajax({
                url: 'editUser',
                data: submitData,
                type: 'POST',
                dataType: "json",
                cache: false,
                success: function (result) {
                    //请求成功时
                    if (result > 0) {
                        alert("修改用户成功！");
                        location.href = 'userManage';
                        return true;
                    } else {
                        alert("修改用户失败！");
                        return false;
                    }
                },
                error: function () {
                    //请求失败时
                    alert("error");
                    return false;
                }
            });
            return true;
        });
    });
    $(function () {
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
    });
</script>
</body>
</html>

