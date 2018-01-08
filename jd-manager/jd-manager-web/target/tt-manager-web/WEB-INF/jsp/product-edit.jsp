<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/8
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> - 基本表单</title>
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
    <script charset="utf-8" src="kindeditor-min.js"></script>
    <script charset="utf-8" src="lang/zh_CN.js"></script>
    <script>
        KindEditor.ready(function(K) {
            K.create('#content1', {
                pasteType : 0
            });
            K.create('#content2', {
                pasteType : 1
            });
            K.create('#content3', {
                pasteType : 2
            });
        });
    </script>
    <script>
        KindEditor.ready(function(K) {
            var editor = K.editor({
                allowFileManager : true
            });
            K('#image1').click(function() {
                editor.loadPlugin('image', function() {
                    editor.plugin.imageDialog({
                        imageUrl : K('#url1').val(),
                        clickFn : function(url, title, width, height, border, align) {
                            K('#url1').val(url);
                            editor.hideDialog();
                        }
                    });
                });
            })
        });
    </script>

</head>
<body class="gray-bg">
<div style="display: none;">
    <textarea name="hh"></textarea>
</div>
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>商品修改</h5>
                </div>
                <div class="ibox-content">
                    <form class="form-horizontal"  action="/editproduct"  method="post">
                        <div class="form-group">
                            <input type="hidden" name="pid" value="p116">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-8" style="color: red;font-size: 15px">

                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>商品名称：</label>
                            <div class="col-sm-8">
                                <input id="pname" name="pname" value="iPhone 8" type="text" placeholder=" 请输入商品名称" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>商品售价：</label>
                            <div class="col-sm-8">
                                <input id="marketPrice" name="marketPrice" value="6888.0" type="text" placeholder=" 请输入商品售价"  onkeyup="value=value.replace(/[^\d.]/g,'')"  onblur="value=value.replace(/[^\d.]/g,'') "  class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>商品供货价：</label>
                            <div class="col-sm-8">
                                <input id="shopPrice" name="shopPrice" value="6888.0" type="text" placeholder=" 请输入商品供货价"  onkeyup="value=value.replace(/[^\d.]/g,'')"  onblur="value=value.replace(/[^\d.]/g,'') "  class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>库存：</label>
                            <div class="col-sm-8">
                                <input id="quantity" name="quantity" value="99" type="text" placeholder=" 请输入商品库存" class="form-control" onkeyup="value=value.replace(/[^\d]/g,'')"  onblur="value=value.replace(/[^\d]/g,'') " >
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>类别：</label>
                            <div class="col-sm-8">
                                <select name="cid" style="width: 100%;" class="form-control">
                                    <option selected="" value="114">红酒</option>
                                    <option selected="" value="113">鹿茸</option>
                                    <option selected="" value="112">书房四宝</option>
                                    <option selected="" value="111">发卡</option>
                                    <option selected="" value="110">戒指</option>
                                    <option selected="" value="109">啤酒</option>
                                    <option selected="" value="108">白酒</option>
                                    <option selected="" value="107">桌子</option>
                                    <option selected="" value="106">窗帘</option>
                                    <option selected="" value="105">电脑</option>
                                    <option selected="" value="104">手机</option>
                                    <option selected="" value="103">包</option>
                                    <option selected="" value="102">羽绒服</option>
                                    <option selected="" value="101">裤子</option>
                                    <option selected="" value="100">鞋子</option>
                                    <option selected="" value="99">口腔用品</option>
                                    <option selected="" value="98">化妆品</option>
                                    <option selected="" value="97">厨房电器</option>
                                    <option selected="" value="96">文玩</option>
                                    <option selected="" value="95">家用电器</option>
                                    <option selected="" value="94">家纺</option>
                                    <option selected="" value="93">配饰</option>
                                    <option selected="" value="92">矿泉水</option>
                                    <option selected="" value="91">滋补品</option>

                                </select>
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>是否热门：</label>
                            <div class="col-sm-8">
                                <select id="isHot" name="isHot" style="width: 100%;" class="form-control">
                                    <option selected="" value="1">是</option>
                                    <option selected="" value="2">否</option>

                                </select>
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>图片：</label>
                            <div class="col-sm-8">
                                <input type="file" id="image" name="image" value="选择图片" />
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>商品描述：</label>
                            <div class="col-sm-8">
                                <textarea name="pdesc" style="width:700px;height:200px;visibility:hidden;"></textarea>
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
</body>
</html>