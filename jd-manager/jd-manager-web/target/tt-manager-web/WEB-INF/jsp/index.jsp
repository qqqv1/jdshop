<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <title> 后台管理系统</title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">
</head>
<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
<input style="display: none" id="usersession" value="1">
<input style="display: none" id="dlsession" value="">
<div id="wrapper">
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="nav-close"><i class="fa fa-times-circle"></i>
        </div>
        <div class="sidebar-collapse">
            <ul class="nav" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="index">
                            <span class="clear">
                                <span class="block m-t-xs" style="font-size:20px;">
                                    <strong class="font-bold">购物街</strong>
                                </span>
                            </span>
                        </a>
                    </div>
                    <div class="logo-element">
                        admin
                    </div>
                </li>
                <li class="line dk"></li>
                <li class="hidden-folded padder m-t m-b-sm text-muted text-xs">
                    <span class="ng-scope">商品管理</span>
                </li>
                <li>
                <a href="#">
                    <i class="fa fa-cogs"></i>
                    <span class="nav-label">产品管理</span>
                    <span class="fa arrow"></span>
                </a>
                <ul class="nav nav-second-level">
                    <li>
                        <a class="J_menuItem" href="product-list">产品专区</a>
                    </li>
                </ul>
                </li>
            </ul>
        </div>
    </nav>
    <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row border-bottom">
            <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-info " href="#">
                        <i class="fa fa-bars"></i>
                    </a>
                </div>

                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown">
                        <a class="dropdown-toggle count-info" data-toggle="" href="loginout.action" title="退出">
                            admin  <i class="fa fa-power-off"></i> <span class="label label-warning"></span>
                        </a>
                        <ul class="dropdown-menu dropdown-messages" style="width: 100px;padding: 0px;">
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="row J_mainContent" id="content-main">
            <iframe id="J_iframe" width="100%" height="100%" src="welcome.html" frameborder="0" data-id="welcome" seamless></iframe>
        </div>
    </div>
</div>

<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>
<script src="js/jquery.metisMenu.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<script src="js/layer.min.js"></script>

<!-- 自定义js -->
<script src="js/hAdmin.js?v=4.1.0"></script>
<script type="text/javascript" src="js/index.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        var usersession=$("#usersession").val();
        var dlsession=$("#dlsession").val();
        if(usersession==null|dlsession==null){
            window.location.href="login.jsp";
        }
    });
</script>
<!-- 第三方插件 -->
<script src="js/plugins/pace/pace.min.js"></script>
</body>
</html>
