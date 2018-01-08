<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/8
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> - 分类修改</title>
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
                    <h5>分类修改</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal" id="category" action="javascript:void(0)">
                        <div class="form-group">
                            <input type="hidden" id="cid" name="cid">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-8" style="color: red;font-size: 15px"></div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>分类名称：</label>
                            <div class="col-sm-8">
                                <input id="cname" name="cname" value="" type="text" placeholder=" 请输入分类名称" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-8">
                                <button id="submit" class="btn btn-sm btn-info" type="button">确认保存</button>
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
<script>
    $(function(){
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
        $.ajax({
            url:"category/${param.cid}",
            dataType:"json",
            success:function(data){
                $("#cid").val(data.cid);
                $("#cname").val(data.cname);
            }
        })
    })
    $(function(){
        $("#submit").click(function(){
            var cname = $("#cname").val();
            if(!cname){
                alert("请输入分类名称");
                return false;
            }
            var data = $('#category').serialize();
            //序列化获得表单数据
            var submitData = decodeURIComponent(data, true);
            //submitData是解码后的表单数据，结果同上
            $.ajax({
                url: 'editCat',
                type: 'POST',
                data: submitData,
                dataType: "json",
                success: function (result) {
                    //请求成功时
                    if(result> 0){
                        alert("修改分类成功！");
                        location.href='category-list';
                        return true;
                    }else{
                        alert("修改分类失败！")
                        return false;
                    }
                },
                error: function () {
                    //请求失败时
                    alert("error");
                    return false;
                }
            })
            return true;
        });
    })
</script>
</body>
</html>
