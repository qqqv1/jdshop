<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/15
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>搜索页面</title>

    <link href="AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

    <link href="basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="css/seastyle.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
</head>

<body>
<jsp:include page="top.jsp"/>

<div class="clear"></div>
<b class="line"></b>
<div class="search">
    <div class="search-list">

        <jsp:include page="banner.jsp"/>

        <div class="am-g am-g-fixed">
            <div class="am-u-sm-12 am-u-md-12">
                <div class="theme-popover">
                    <div class="searchAbout">
                        <span class="font-pale">相关搜索：</span>
                        <%--<a title="坚果" href="#">坚果</a>
                        <a title="瓜子" href="#">瓜子</a>
                        <a title="鸡腿" href="#">豆干</a>--%>
                    </div>
                    <ul class="select">
                        <p class="title font-normal">
                            <%--<span class="fl" id="searchName"></span>--%>
                            <span class="total fl">搜索到<strong class="num" id="searchNum">0</strong>件相关商品</span>
                        </p>
                        <div class="clear"></div>
                        <li class="select-result">
                            <dl>
                                <dt>已选</dt>
                                <dd class="select-no"></dd>
                                <p class="eliminateCriteria">清除</p>
                            </dl>
                        </li>
                        <div class="clear"></div>
                        <li class="select-list">
                            <dl id="select1">
                                <dt class="am-badge am-round">品牌</dt>

                                <div class="dd-conent">
                                    <dd class="select-all selected"><a href="#">全部</a></dd>
                                    <dd><a href="#">百草味</a></dd>
                                    <dd><a href="#">良品铺子</a></dd>
                                    <dd><a href="#">新农哥</a></dd>
                                    <dd><a href="#">楼兰蜜语</a></dd>
                                    <dd><a href="#">口水娃</a></dd>
                                    <dd><a href="#">考拉兄弟</a></dd>
                                </div>

                            </dl>
                        </li>
                        <li class="select-list">
                            <dl id="select2">
                                <dt class="am-badge am-round">种类</dt>
                                <div class="dd-conent">
                                    <%--<dd class="select-all selected"><a href="#">全部</a></dd>
                                    <dd><a href="#">东北松子</a></dd>
                                    <dd><a href="#">巴西松子</a></dd>
                                    <dd><a href="#">夏威夷果</a></dd>
                                    <dd><a href="#">松子</a></dd>--%>
                                </div>
                            </dl>
                        </li>
                        <li class="select-list">
                            <dl id="select3">
                                <dt class="am-badge am-round">选购热点</dt>
                                <div class="dd-conent">
                                    <dd class="select-all selected"><a href="#">全部</a></dd>
                                    <dd><a href="#">手剥松子</a></dd>
                                    <dd><a href="#">薄壳松子</a></dd>
                                    <dd><a href="#">进口零食</a></dd>
                                    <dd><a href="#">有机零食</a></dd>
                                </div>
                            </dl>
                        </li>

                    </ul>
                    <div class="clear"></div>
                </div>
                <div class="search-content">
                    <div class="sort">
                        <li class="first"><a title="综合" href="javascript:">综合排序</a></li>
                        <li><a title="销量" href="javascript:">销量排序</a></li>
                        <li><a title="价格" href="javascript:">价格优先</a></li>
                        <li class="big"><a title="评价" href="javascript:">评价为主</a></li>
                    </div>
                    <div class="clear"></div>

                    <ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes" id="product">
                        <%--<li>
                            <div class="i-pic limit">
                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic limit">

                                <img src="images/imgsearch1.jpg" />
                                <p class="title fl">【良品铺子旗舰店】手剥松子218g 坚果炒货零食新货巴西松子包邮</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>56.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>--%>
                    </ul>
                </div>
                <div class="search-side">

                    <div class="side-title">
                        经典搭配
                    </div>

                    <li>
                        <div class="i-pic check">
                            <img src="images/cp.jpg" />
                            <p class="check-title">萨拉米 1+1小鸡腿</p>
                            <p class="price fl">
                                <b>¥</b>
                                <strong>29.90</strong>
                            </p>
                            <p class="number fl">
                                销量<span>1110</span>
                            </p>
                        </div>
                    </li>
                    <li>
                        <div class="i-pic check">
                            <img src="images/cp2.jpg" />
                            <p class="check-title">ZEK 原味海苔</p>
                            <p class="price fl">
                                <b>¥</b>
                                <strong>8.90</strong>
                            </p>
                            <p class="number fl">
                                销量<span>1110</span>
                            </p>
                        </div>
                    </li>
                    <li>
                        <div class="i-pic check">
                            <img src="images/cp.jpg" />
                            <p class="check-title">萨拉米 1+1小鸡腿</p>
                            <p class="price fl">
                                <b>¥</b>
                                <strong>29.90</strong>
                            </p>
                            <p class="number fl">
                                销量<span>1110</span>
                            </p>
                        </div>
                    </li>

                </div>
                <div class="clear"></div>
                <!--分页 -->
                <ul class="am-pagination am-pagination-right" id="page">
                    <%--<li class="am-disabled"><a href="#">&laquo;</a></li>
                    <li class="am-active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#">&raquo;</a></li>--%>
                </ul>
            </div>
        </div>
        <jsp:include page="bottom.jsp"/>
    </div>

</div>

<jsp:include page="guide.jsp"/>

<script>
    window.jQuery || document.write('<script src="basic/js/jquery-1.9.min.js"><\/script>');
    $(function () {
        $('#searchInput').val('${param.pname}');
        displayCategory();
        pagination('');
        displayProduct(1,'');
//        $('#searchName').html($('#searchInput').text());
        $(".select-result dl p").on('click',function () {
            pagination('');
            displayProduct(1,'');
        });
    });
    // 查询全部分类
    function displayCategory() {
        $.ajax({
            url:'categoryList',
            dataType:'json',
            success:function (categorys) {
                $div=$('#select2 .dd-conent');
                $div.empty();
                $div.append('<dd class="select-all selected"><a href="javascript:void(0)">全部</a></dd>');
                $.each(categorys,function (i,category) {
                    $dd=$('<dd><a href="javascript:void(0)">'+category.cname+'</a></dd>');
                    $div.append($dd);
                });
                $("#select2 dd").click(function() {
                    $(this).addClass("selected").siblings().removeClass("selected");
                    if ($(this).hasClass("select-all")) {
                        $("#selectB").remove();
                    } else {
                        var copyThisB = $(this).clone();
                        if ($("#selectB").length > 0) {
                            $("#selectB a").html($(this).text());
                        } else {
                            $(".select-result dl").append(copyThisB.attr("id", "selectB"));
                            $("#selectB a").on('click',function () {
                                pagination('');
                                displayProduct(1,'');
                            });
                        }
                    }
                    pagination($(this).text());
                    displayProduct(1,$(this).text());
                });
            }
        });
    }
    // 分页展示商品
    function pagination(cname) {
        var $pname=$('#searchInput').val();
        $.ajax({
            url:'pageTotal',
            data:{'cname':cname,'pname':$pname},
            type:'POST',
            dataType:'json',
            success:function(total){
                var pageTotal=1;
                if(total % 12 === 0) {
                    pageTotal = parseInt(total / 12);
                }else{
                    pageTotal = parseInt(total / 12) +1;
                }
                $('#searchNum').html(total);
                $('#page').empty();
                $('#page').append('<li><a href="javascript:void(0)" id="first">&laquo;</a></li>');
                for(var i = 1;i <= pageTotal;i++){
                    $li=$('<li>');
                    $a=$('<a href="javascript:void(0)">'+i+'</a>');
                    $a.on('click',function(){
                        displayProduct($(this).text(),cname);
                    });
                    $li.append($a);
                    $('#page').append($li);
                }
                $('#page').append('<li><a href="javascript:void(0)" id="last">&raquo;</a></li>');
                $('#first').on('click',function () {
                    displayProduct(1,cname);
                });
                $('#last').on('click',function () {
                    displayProduct(pageTotal,cname);
                });
            }
        });
    }
    // 查询商品
    function displayProduct(page,cname){
        var $pname=$('#searchInput').val();
        $.ajax({
            url:'productList',
            data:{'page':page,'cname':cname,'pname':$pname},
            type:'POST',
            dataType:'json',
            success:function (products) {
                $('#product').empty();
                $.each(products,function (i,product) {
                    $li=$('<li>');
                    $li.on('click',function () {
                       window.location.href='product-portal-info?pid='+product.pid;
                    });
                    $div=$('<div class="i-pic limit">');
                    $img=$('<div style="padding: 35px"><img src="'+product.pimage+'" style="width: 148px;height: 148px" alt="暂缺"/></div>'+
                        '                        <p class="title fl">'+product.pname+'</p>\n' +
                        '                        <p class="price fl">\n' +
                        '                        <b>¥</b>\n' +
                        '                        <strong>'+product.shopPrice+'</strong>\n' +
                        '                        </p>\n' +
                        '                        <p class="number fl">\n' +
                        '                        销量<span>'+product.quantity+'</span>\n' +
                        '                        </p>');
                    $div.append($img);
                    $li.append($div);
                    $('#product').append($li);
                })
            }
        })
    }
</script>
<script type="text/javascript" src="basic/js/quick_links.js"></script>

<div class="theme-popover-mask"></div>
</body>

</html>
