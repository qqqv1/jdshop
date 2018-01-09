






<!--_meta 作为公共模版分离出去-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<script type="text/javascript" src="${pageContext.request.contextPath }/My97DatePicker/WdatePicker.js"></script>

<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>订单添加</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal" id="Order" action="javascript:void(0)"  method="post">
                        <div class="form-group">
                            <input type="hidden" id="itemid" name="itemid">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-8" style="color: red;font-size: 15px">
                            </div>
                        </div>

                        <div class="form-group">
                            <input type="hidden" id="oid" name="oid">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-8" style="color: red;font-size: 15px">
                            </div>
                        </div>


                        <%--这里要2级联动--%>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>商品名：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="pname" disabled="disabled" placeholder=" 请输入商品名称" value="" maxlength="20" id="pname" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>商品数量：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="count"  placeholder=" 请输入商品数量" value="" maxlength="20" id="count" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>合计：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="subtotal"  placeholder=" 请输入商品名称" value="" maxlength="20" id="subtotal" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;"></span>订单状态：</label>
                            <div class="col-sm-8">
                                <select id="state" name="state" style="width: 100%;" class="form-control">
                                    <option selected="" value="0">已删除</option>
                                    <option selected="" value="1">未支付</option>
                                    <option selected="" value="2">已支付，未发货</option>
                                    <option selected="" value="3">已支付，已发货</option>
                                    <option selected="" value="4">已完成</option>
                                </select>
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>



                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>买家：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="name"  placeholder=" 请输入买家名" value="" id="name" maxlength="20" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>手机号：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="telephone"  placeholder=" 请输入手机号" value="" maxlength="20" id="telephone" class="form-control">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>地址：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="address"  placeholder=" 请输入地址" value="" maxlength="20" id="address" class="form-control">
                            </div>
                        </div>

                     <%--   <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>创建时间：</label>
                            <div class="col-sm-8" >
                                <input type="text" name="ordertime"  placeholder=" 请输入时间" value="" maxlength="20" id="ordertime" class="form-control">

                            </div>
                        </div>--%>



                      <%--  <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;" >*</span>创建时间：</label>
                            <div class="col-sm-8" >
                                <input id="ordertime" type="text" name="ordertime" value="" onClick="WdatePicker()" />

                            </div>
                        </div>--%>







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
    $(function () {
        $.ajax({
            url:"order/${param.itemid}",
            dataType:"json",
            success:function(data){
                $("#oid").val(data.oid);
                $("#itemid").val(data.itemid);
                $("#pname").val(data.pname);
                $("#count").val(data.count);
                $("#subtotal").val(data.subtotal);
                $("#state").val(data.state);
                $("#name").val(data.name);
                $("#telephone").val(data.telephone);
                $("#address").val(data.address);
                $("#ordertime").val(data.ordertime);
                ue.ready(function(){
                    ue.setContent(data.pdesc);
                })
            }
        })
    });
    $(function(){
        $("#submit").click(function(){
            var pname = $("#pname").val();
            var count = $("#count").val();
            var subtotal = $("#subtotal").val();
            var state=$("#state").val();
            var name = $("#name").val();
            if(!pname){
                alert("请输入商品名称");
                return false;
            }else if(!name){
                alert("请输入买家名");
                return false;
            }else if(!count){
                alert("请输入商品数量");
                return false;
            }else if(!subtotal){
                alert("请输入商品小记");
                return false;
            }else if(!state){
                alert("请输入订单状态");
                return false;
            }
            var data = $('#Order').serialize();
            //序列化获得表单数据，结果为：user_id=12&user_name=John&user_age=20
            var submitData = decodeURIComponent(data, true);
            //submitData是解码后的表单数据，结果同上
            $.ajax({
                url: 'editOrdersCustom',
                type: 'POST',
                data: submitData,
                dataType: "json",
                cache:false,
                success: function (result) {
                    //请求成功时
                    if(result> 0){
                        alert("修改商品成功！");
                        location.href='order-list';
                        return true;
                    }else{
                        alert("修改商品失败！");
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
        })
    })
</script>
</body>
</html>
