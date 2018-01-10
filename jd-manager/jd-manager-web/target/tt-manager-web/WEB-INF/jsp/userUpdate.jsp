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
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
    <link href="css/sweetalert.css" rel="stylesheet">
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
                    <form class="form-horizontal" action="${pageContext.request.contextPath}/insertUser" method="post">
                        <div class="form-group">
                            <input type="hidden" name="canshushezhi.id" id="id" value="1">
                            <label class="col-sm-3 control-label"></label>
                            <div class="col-sm-8" style="color: #ff1407;font-size: 15px">

                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>用户名：</label>
                            <div class="col-sm-8">
                                <input id="username" name="username" value="10%"
                                       onkeyup="value = value.replace(/[^\d.]/g,'') " placeholder="  " type="text"
                                       class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>密码：</label>
                            <div class="col-sm-8">
                                <input id="password" name="canshushezhi.hyzsbfb" value="第三天"
                                       onkeyup="value = value.replace(/[^\d.]/g,'') " placeholder="  " type="password"
                                       class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>真实姓名：</label>
                            <div class="col-sm-8">
                                <input id="realname" name="canshushezhi.mtzs" value="2%"
                                       onkeyup="value = value.replace(/[^\d.]/g,'') " placeholder="  " type="text"
                                       class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>性别：</label>
                            <div class="col-sm-8">
                                男<input id="sexM" name="" type="radio" class="form-control">
                                女<input id="sexW" name="" type="radio" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>出身年月：</label>
                            <div class="col-sm-8">
                                <select name="YYYY" onChange="YYYYDD(this.value)">
                                    <option value="">请选择 年</option>
                                </select>
                                <select name="MM" onChange="MMDD(this.value)">
                                    <option value="">选择 月</option>
                                </select>
                                <select name="DD">
                                    <option value="">选择 日</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>邮箱：</label>
                            <div class="col-sm-8">
                                <input id="email" name=" " value="10%" onkeyup="value = value.replace(/[^\d.]/g,'') "
                                       placeholder="  " type="text" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>电话：</label>
                            <div class="col-sm-8">
                                <input id="te" name="" value="小数点前几位" onkeyup="value = value.replace(/[^\d.]/g,'') "
                                       placeholder="  " type="text" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>单位：</label>
                            <div class="col-sm-8">
                                <input id="danwei" name=" " value=" " onkeyup="value = value.replace(/[^\d.]/g,'') "
                                       placeholder="  " type="text" class="form-control">
                                <span class="help-block m-b-none"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"><span style="color:red;">*</span>城市：</label>
                            <div class="col-sm-8">
                                <input id="city" name="" value="默认零点" onkeyup="value = value.replace(/[^\d.]/g,'') "
                                       placeholder="  " type="text" class="form-control">
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
<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>
<!-- 自定义js -->
<script src="js/content.js?v=1.0.0"></script>
<!-- Sweet alert -->
<script src="js/sweetalert.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        //有值true
        $("#submit").click(function () {
            return true;
        });
    });
</script>
<!-- iCheck -->
<script src="js/icheck.min.js"></script>
<!-- jQuery Validation plugin javascript-->
<script src="js/jquery.validate.min.js"></script>
<script src="js/messages_zh.min.js"></script>

<script src="js/form-validate-demo.js"></script>
<script language="JavaScript">
    function YYYYMMDDstart() {
        MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

        //先给年下拉框赋内容
        var y = new Date().getFullYear();
        for (var i = (y - 100); i < (y + 1); i++) //以今年为准，前30年，后30年
            document.reg_testdate.YYYY.options.add(new Option(" " + i + " 年", i));

        //赋月份的下拉框
        for (var i = 1; i < 13; i++)
            document.reg_testdate.MM.options.add(new Option(" " + i + " 月", i));

        document.reg_testdate.YYYY.value = y;
        document.reg_testdate.MM.value = new Date().getMonth() + 1;
        var n = MonHead[new Date().getMonth()];
        if (new Date().getMonth() == 1 && IsPinYear(YYYYvalue)) n++;
        writeDay(n); //赋日期下拉框Author:meizz
        document.reg_testdate.DD.value = new Date().getDate();
    }

    if (document.attachEvent)
        window.attachEvent("onload", YYYYMMDDstart);
    else
        window.addEventListener('load', YYYYMMDDstart, false);

    function YYYYDD(str) //年发生变化时日期发生变化(主要是判断闰平年)
    {
        var MMvalue = document.reg_testdate.MM.options[document.reg_testdate.MM.selectedIndex].value;
        if (MMvalue == "") {
            var e = document.reg_testdate.DD;
            optionsClear(e);
            return;
        }
        var n = MonHead[MMvalue - 1];
        if (MMvalue == 2 && IsPinYear(str)) n++;
        writeDay(n)
    }

    function MMDD(str)   //月发生变化时日期联动
    {
        var YYYYvalue = document.reg_testdate.YYYY.options[document.reg_testdate.YYYY.selectedIndex].value;
        if (YYYYvalue == "") {
            var e = document.reg_testdate.DD;
            optionsClear(e);
            return;
        }
        var n = MonHead[str - 1];
        if (str == 2 && IsPinYear(YYYYvalue)) n++;
        writeDay(n)
    }

    function writeDay(n)   //据条件写日期的下拉框
    {
        var e = document.reg_testdate.DD;
        optionsClear(e);
        for (var i = 1; i < (n + 1); i++)
            e.options.add(new Option(" " + i + " 日", i));
    }

    function IsPinYear(year)//判断是否闰平年
    {
        return (0 == year % 4 && (year % 100 != 0 || year % 400 == 0));
    }

    function optionsClear(e) {
        e.options.length = 1;
    }
</script>
<script>
    $(document).ready(function () {
        $('.i-checks').iCheck({
            checkboxClass: 'icheckbox_square-green',
            radioClass: 'iradio_square-green',
        });
    });
</script>
</body>
</html>

