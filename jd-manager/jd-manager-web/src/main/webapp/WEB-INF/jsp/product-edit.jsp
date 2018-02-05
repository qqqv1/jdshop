<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/8
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> - 产品修改</title>
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
                    <h5>产品修改</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal" id="product" action="javascript:void(0)">
                        <div class="form-group">
                            <input type="hidden" id="pid" name="pid">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-8" style="color: red;font-size: 15px">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>商品名称：</label>
                            <div class="col-sm-8">
                                <input id="pname" name="pname" type="text" placeholder=" 请输入商品名称" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>商品售价：</label>
                            <div class="col-sm-8">
                                <input id="marketPrice" name="marketPrice" type="text" placeholder=" 请输入商品售价"  onkeyup="value=value.replace(/[^\d.]/g,'')"  onblur="value=value.replace(/[^\d.]/g,'') "  class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>商品供货价：</label>
                            <div class="col-sm-8">
                                <input id="shopPrice" name="shopPrice" type="text" placeholder=" 请输入商品供货价"  onkeyup="value=value.replace(/[^\d.]/g,'')"  onblur="value=value.replace(/[^\d.]/g,'') "  class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>库存：</label>
                            <div class="col-sm-8">
                                <input id="pstock" name="pstock" type="text" placeholder=" 请输入商品库存" class="form-control" onkeyup="value=value.replace(/[^\d]/g,'')"  onblur="value=value.replace(/[^\d]/g,'') " >
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>类别：</label>
                            <div class="col-sm-8">
                                <select id="cid" name="cid" style="width: 100%;font-size: 12px" class="form-control"></select>
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;"></span>图片：</label>
                            <div class="col-sm-8" id="pic">
                                <input type="file" id="file" name="upfile" value="选择图片"/>
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;"></span>商品描述：</label>
                            <div class="col-sm-8">
                                <script id="pdesc" name="pdesc" type="text/plain"></script>
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-8">
                                <button id="submit" class="btn btn-sm btn-info" type="submit">确认保存</button>
                                <button class="btn btn-sm btn-info" type="button" onclick="history.back()" >返回</button>
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

<script src="js/ajaxfileupload.js"></script>

<script src="js/form-validate-demo.js"></script>
<!-- 百度富文本编辑器 -->
<!-- 配置文件 -->
<script src="ueditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script src="ueditor/ueditor.all.js"></script>
<script>
    $(function(){
        //实例化之前先删除容器
        UE.delEditor('pdesc');
        //实例化富文本编辑器
        var ue=UE.getEditor('pdesc',{
            serverUrl:'file/upload'
        });
        UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;
        UE.Editor.prototype.getActionUrl = function(action) {
            if (action === 'uploadimage') {
                return '${pageContext.request.contextPath}/file/upload';
            }else {
                return this._bkGetActionUrl.call(this, action);
            }
        };
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green'
        });
        //获取下拉列表
        $.ajax({
            url: "productCats",//写你自己的方法
            // 接受数据格式
            dataType: "json",
            // 回调函数，接受服务器端返回给客户端的值，即result值
            success: function (data) {
                //alert(data.data);
                $.each(data, function (i,items) {
                    $('#cid').append("<option value=" + items.cid + ">" + items.cname + "</option>");
                });
//                $('#cid').selectpicker('refresh');
            },
            error: function (data) {
                alert("查询失败" + data);
            }
        });
        $.ajax({
            url:"product/${param.pid}",
            dataType:"json",
            success:function(data){
                $("#pid").val(data.pid);
                $("#pname").val(data.pname);
                $("#marketPrice").val(data.marketPrice);
                $("#shopPrice").val(data.shopPrice);
                $("#pstock").val(data.pstock);
                $("#cid").val(data.cid);
                $("#pic").append('<img src='+data.pimage+' style="height:150px;width:150px"/>');
                ue.ready(function(){
                    ue.setContent(data.pdesc);
                })
            }
        })
    });
    $(function(){
        $("#submit").click(function(){
            var pname = $("#pname").val();
            var marketPrice = $("#marketPrice").val();
            var shopPrice = $("#shopPrice").val();
            var pstock=$("#pstock").val();
            var cid = $("#cid").val();
            if(!pname){
                alert("请输入商品名称");
                return false;
            }else if(!marketPrice){
                alert("请输入商品售价");
                return false;
            }else if(!shopPrice){
                alert("请输入商品供货价");
                return false;
            }else if(!pstock){
                alert("请输入商品库存");
                return false;
            }else if(!cid){
                alert("请输入商品分类");
                return false;
            }
            if($('#file').val()!=''){
                uploadFile();
            }
            var data = $('#product').serialize();
            //序列化获得表单数据
            var submitData = decodeURIComponent(data, true);
            //submitData是解码后的表单数据，结果同上
            $.ajax({
                url: 'editproduct',
                type: 'POST',
                data: submitData,
                dataType: "json",
                cache:false,
                success: function (result) {
                    //请求成功时
                    if(result){
                        alert("修改商品成功！");
                        location.href='product-list';
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
        });
    });
    function uploadFile() {
        $.ajaxFileUpload({
            url : 'file/upload',
            secureuri : false,
            fileElementId : 'file',
            dataType:'text',
            error : function(data, status, e) {
                alert(data);
            },
            success : function(data, status) {
                data= $.parseJSON(data.replace(/<.*?>/ig,''));
                $('#pimage').val('http://www.wyfei8.top/images'+data.url)
            }
        });
    }
</script>
</body>
</html>