<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<button id="import" class="btn btn-default" type="button">一键导入商品数据到索引库</button>
<span id="importmsg"></span>
<script src="js/jquery.min.js?v=2.1.4"></script>
<script>

    $(function (){
        $('#import').click(function () {
            $('#importmsg').html('正在导入，请稍后！')
            $.post(
                'product/index',
                function (data) {
                    if (data.success){
                        alert('温馨提示,导入成功！');
                    }else{
                        alert('温馨提示,导入失败！请刷新后再尝试！');
                    }
                }
            );
        });
    });
</script>
