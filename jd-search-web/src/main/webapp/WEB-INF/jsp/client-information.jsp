<%--
  Created by IntelliJ IDEA.
  User: jialin
  Date: 2018/1/17
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

    <title>个人资料</title>

    <link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
    <link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">

    <link href="basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="css/personal.css" rel="stylesheet" type="text/css">
    <link href="css/infstyle.css" rel="stylesheet" type="text/css">
    <script src="AmazeUI-2.4.2/assets/js/jquery.min.js" type="text/javascript"></script>
    <script src="AmazeUI-2.4.2/assets/js/amazeui.js" type="text/javascript"></script>

</head>

<body>
<!--头 -->
<jsp:include page="top.jsp"/>
<div class="nav-table">
    <div class="long-title"><span class="all-goods">全部分类</span></div>
    <div class="nav-cont">
        <ul>
            <li class="index"><a href="#">首页</a></li>
            <li class="qc"><a href="#">闪购</a></li>
            <li class="qc"><a href="#">限时抢</a></li>
            <li class="qc"><a href="#">团购</a></li>
            <li class="qc last"><a href="#">大包装</a></li>
        </ul>
        <div class="nav-extra">
            <i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
            <i class="am-icon-angle-right" style="padding-left: 10px;"></i>
        </div>
    </div>
</div>
<b class="line"></b>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">

            <div class="user-info">
                <!--标题 -->
                <div class="am-cf am-padding">
                    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
                </div>
                <hr/>

                <!--头像 -->
                <div class="user-infoPic">

                    <div class="filePic">
                        <input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
                        <img class="am-circle am-img-thumbnail" src="images/getAvatar.do.jpg" alt="" />
                    </div>

                    <p class="am-form-help">头像</p>

                    <div class="info-m">
                        <div><b>用户名：<i>小叮当</i></b></div>
                        <div class="u-level">
									<span class="rank r2">
							             <s class="vip1"></s><a class="classes" href="#">铜牌会员</a>
						            </span>
                        </div>
                        <div class="u-safety">
                            <a href="safety.html">
                                账户安全
                                <span class="u-profile"><i class="bc_ee0000" style="width: 60px;" width="0">60分</i></span>
                            </a>
                        </div>
                    </div>
                </div>

                <!--个人信息 -->
                <div class="info-main">
                    <form class="am-form am-form-horizontal">

                        <div class="am-form-group">
                            <label for="username" class="am-form-label">昵称</label>
                            <div class="am-form-content">
                                <input type="text" id="username" value="${sessionUser.uname}" placeholder="nickname">

                            </div>
                        </div>

                        <div class="am-form-group">
                            <label for="name" class="am-form-label">姓名</label>
                            <div class="am-form-content">
                                <input type="text" id="name" value="${sessionUser.truename}">

                            </div>
                        </div>

                        <div class="am-form-group">
                            <label class="am-form-label">性别</label>
                            <div class="am-form-content sex">
                                <label class="am-radio-inline">
                                    <input type="radio"  name="sex" value="1" data-am-ucheck> 男
                                </label>
                                <label class="am-radio-inline">
                                    <input type="radio" name="sex" value="0" data-am-ucheck> 女
                                </label>
                            </div>
                        </div>

                        <div class="am-form-group">
                            <label for="birthday" class="am-form-label">生日</label>
                            <div class="am-form-content birth">
                                <input type="date" value="${sessionUser.birthday}" id="birthday"/>
                            </div>
                        </div>
                        <div class="am-form-group">
                            <label for="telephone" class="am-form-label">电话</label>
                            <div class="am-form-content">
                                <input id="telephone" value="${sessionUser.telephone}" type="tel">
                            </div>
                        </div>
                        <div class="am-form-group">
                            <label for="email" class="am-form-label">电子邮件</label>
                            <div class="am-form-content">
                                <input id="email" value="${sessionUser.email}" type="email">

                            </div>
                        </div>
                        <%--<div class="am-form-group address">
                            <label for="user-address" class="am-form-label">收货地址</label>
                            <div class="am-form-content address">
                                <a href="address.html">
                                    <p class="new-mu_l2cw">
                                        <span class="province">湖北</span>省
                                        <span class="city">武汉</span>市
                                        <span class="dist">洪山</span>区
                                        <span class="street">雄楚大道666号(中南财经政法大学)</span>
                                        <span class="am-icon-angle-right"></span>
                                    </p>
                                </a>

                            </div>
                        </div>--%>
                        <div class="am-form-group safety">
                            <label class="am-form-label">账号安全</label>
                            <div class="am-form-content safety">
                                <a href="safety.html">

                                    <span class="am-icon-angle-right"></span>

                                </a>

                            </div>
                        </div>
                        <div class="info-btn">
                            <div class="am-btn am-btn-danger" id="save">保存修改</div>
                        </div>

                    </form>
                </div>

            </div>

        </div>

        <!--底部-->
        <jsp:include page="bottom.jsp"/>
    </div>

    <aside class="menu">
        <ul>
            <li class="person">
                <a href="index.html">个人中心</a>
            </li>
            <li class="person">
                <a href="#">个人资料</a>
                <ul>
                    <li class="active"> <a href="information.html">个人信息</a></li>
                    <li> <a href="safety.html">安全设置</a></li>
                    <li> <a href="address.html">收货地址</a></li>
                </ul>
            </li>
            <li class="person">
                <a href="#">我的交易</a>
                <ul>
                    <li><a href="order.html">订单管理</a></li>
                    <li> <a href="change.html">退款售后</a></li>
                </ul>
            </li>
            <li class="person">
                <a href="#">我的资产</a>
                <ul>
                    <li> <a href="coupon.html">优惠券 </a></li>
                    <li> <a href="bonus.html">红包</a></li>
                    <li> <a href="bill.html">账单明细</a></li>
                </ul>
            </li>

            <li class="person">
                <a href="#">我的小窝</a>
                <ul>
                    <li> <a href="collection.html">收藏</a></li>
                    <li> <a href="foot.html">足迹</a></li>
                    <li> <a href="comment.html">评价</a></li>
                    <li> <a href="news.html">消息</a></li>
                </ul>
            </li>

        </ul>

    </aside>
</div>

</body>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
    $(function(){
        $.ajax({
            url:"updateUserByInformation",
            data:{"username":${sessionScope.User.username}},
            dataType:"json",
            type:"post",
            cache:"false",
            success: function (data) {
                if (data > 0) {
                    alert("修改成功");
                    location.href = "client-information";
                } else {
                    alert("修改失败");
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
//                            alert(XMLHttpRequest.status);
//                            alert(XMLHttpRequest.readyState);
//                            alert(textStatus);
            }
        });

    });

</script>

</html>
