






<!--_meta 作为公共模版分离出去-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> - 基本表单</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
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


    <!-- Sweet Alert -->
    <link href="css/sweetalert.css" rel="stylesheet">
    <script type="text/javascript" src="js/kindeditor-min.js"></script>
    <script type="text/javascript" src="js/kindeditor.js"></script>
    <style type="text/css">
        .note-editable{
            height: 200px;
        }
    </style>
    <script>
        var editor;
        KindEditor.ready(function(K) {
            editor = K.create('textarea[name="hh"]', {
                allowFileManager : true,
                width : "700px",
                height : "400px",
                uploadJson : 'tw/jsp/upload_json.jsp',
                fileManagerJson : 'tw/jsp/file_manager_json.jsp'
            });

            K('#selectImg').click(function() {
                editor.loadPlugin('image', function() {
                    editor.plugin.imageDialog({
                        imageUrl : K('#image').val(),
                        clickFn : function(url, title, width, height,
                                           border, align) {
                            K('#image').val(url);
                            $("#img_image").attr("src",url);
                            editor.hideDialog();
                        }
                    });
                });
            });
            K('#selectImg2').click(function() {
                editor.loadPlugin('image', function() {
                    editor.plugin.imageDialog({
                        imageUrl : K('#image2').val(),
                        clickFn : function(url, title, width, height,
                                           border, align) {
                            K('#image2').val(url);
                            $("#img_image2").attr("src",url);
                            editor.hideDialog();
                        }
                    });
                });
            });
            K('#selectImg3').click(function() {
                editor.loadPlugin('image', function() {
                    editor.plugin.imageDialog({
                        imageUrl : K('#image3').val(),
                        clickFn : function(url, title, width, height,
                                           border, align) {
                            K('#image3').val(url);
                            $("#img_image3").attr("src",url);
                            editor.hideDialog();
                        }
                    });
                });
            });
        });
    </script>
</head>
<body class="gray-bg">
<script src="js/jquery-1.7.2.min_1.js"></script>

<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>订单添加</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal" id="form1" action="/addOrders"  method="post">
                        <input type="hidden" name="user.id" value="">
                        <div class="form-group">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-8" style="color: red;font-size: 15px">

                            </div>
                        </div>

                        <%--这里要2级联动--%>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>商品名：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="pname"  placeholder=" 请输入商品名称" value="" maxlength="20" id="pname" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
<<<<<<< HEAD
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>商品数量：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="count"  placeholder=" 请输入商品数量" value="" maxlength="20" id="count" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
=======
>>>>>>> 899a68154a86e72a76f8f359df945566a398f9d1
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>商品总价：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="subtotal"  placeholder=" 请输入商品总价" value="" id="subtotal" maxlength="20" class="form-control">
                            </div>
                        </div>


                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>买家：</label>
                            <div class="col-sm-8" >
<<<<<<< HEAD
                                <input type="text" name="name"  placeholder=" 请输入买家名" value="" id="name" maxlength="20" class="form-control">
=======
                                <input type="text" name="name"  placeholder=" 请输入用户名" value="" id="name" maxlength="20" class="form-control">
>>>>>>> 899a68154a86e72a76f8f359df945566a398f9d1
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>手机号：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="telephone"  placeholder=" 请输入手机号" value="" maxlength="20" id="telephone" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
<<<<<<< HEAD
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>地址：</label>
=======
                            <label class="col-sm-3 control-label">地址：</label>
>>>>>>> 899a68154a86e72a76f8f359df945566a398f9d1
                            <div class="col-sm-8">
                                <div >
                                    <style type="text/css">



                                        /* m_zlxg */

                                        .m_zlxg{ width:140px; height:35px; line-height:35px;cursor:pointer;float:left;margin:0 10px 0 0;display:inline;background:url(images/zlxg2.jpg) no-repeat;}

                                        .m_zlxg p{ width:100px; padding-left:10px; overflow:hidden; line-height:35px; color:#333333; font-size:14px; font-family:"微软雅黑";text-overflow:ellipsis; white-space:nowrap;}

                                        .m_zlxg2{ position:absolute; top:32px; border:1px solid #ded3c1;background:#fff; width:129px !important; display:none; max-height:224px;-height:224px; overflow-x:hidden; overflow-y:auto;white-space:nowrap;    z-index: 999999; list-style:none; padding:0;}
                                        .m_zlxg2 ul{ padding:0;}
                                        .m_zlxg2 li{list-style:none;line-height:28px;white-space:nowrap; padding-left:10px;font-family:"微软雅黑";color:#333333; font-size:12px; padding:0; text-align:center;}

                                        .m_zlxg2 li:hover{ color:#7a5a21;}

                                    </style>
                                    <div id="sjld" style="">

                                        <div class="m_zlxg" id="shenfen" style="margin-left:0;">

                                            <p title="">选择省份</p>

                                            <div class="m_zlxg2">

                                                <ul></ul>

                                            </div>

                                        </div>

                                        <div class="m_zlxg" id="chengshi">

                                            <p title="">选择城市</p>

                                            <div class="m_zlxg2">

                                                <ul></ul>

                                            </div>

                                        </div>

                                        <div class="m_zlxg" id="quyu">

                                            <p title="">选择区域</p>

                                            <div class="m_zlxg2">

                                                <ul></ul>

                                            </div>

                                        </div>

                                        <input id="sfdq_num" type="hidden" value="" />

                                        <input id="csdq_num" type="hidden" value="" />

                                        <input id="sfdq_tj" type="hidden" value="" />

                                        <input id="csdq_tj" type="hidden" value="" />

                                        <input id="qydq_tj" type="hidden" value="" />

                                    </div>
                                    <script type="text/javascript" src="js/address.js"></script>
                                    <script type="text/javascript">

                                        $(function(){



                                            $("#sjld").sjld("#shenfen","#chengshi","#quyu");



                                        });

                                    </script>
                                </div>
                                <span class="help-block m-b-none"></span>
                            </div>
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
<script>
    $(document).ready(function () {
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
    });
</script>
<script type="text/javascript">
    $(document).ready(function(){
        $("#submit").click(function(){
            var huiyuanid = $("#huiyuanid").val();
            var username = $("#username").val();
            var xm = $("#xm").val();
            if(!username){
                alert("请输入用户名");
                return false;
            }
            if(!xm){
                alert("请输入姓名");
                return false;
            }
            return true;
        });
    });
</script>
</body>
</html>
