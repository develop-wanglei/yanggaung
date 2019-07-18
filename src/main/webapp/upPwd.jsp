
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%@include file="head.jsp"%>
</head>
<style>
    body{background-color: #fff;}
    .login-form{width: 288px;background: #fff;padding: 20px 38px 0;margin:20px;}
    .login-title{font-size: 20px;text-align: center;margin-bottom: 25px;}
    .login-item{display: flex;margin-bottom: 14px;}
    .login-link{margin-bottom: 14px;}
    .login-link label, .login-link a{color: #9B9B9C;}
    .login-link a{font-size: 14px;}
    .login-text{min-height: 40px;width: 100%;color: #B3B3B3;font-size: 14px;border: 1px solid #EEEFF0;border-radius: 3px;font-family: Helvetica, "microsoft yahei", sans-serif;padding-left: 16px;outline: none;}
    .button.login{background-color: #2D9C8B;color: white;width: 100%;border-radius: 3px;font-size: 14px;height: 40px;line-height: 40px;}
    .login-link .line{display: inline-block;width: 1px;height: 12px;background-color: #EEEEEE;margin: 0 6px;}
</style>
<body>
<!--添加-->
<div class="list-content">
    <!--块元素-->
    <div class="block">
        <!--修饰块元素名称-->
        <div class="banner">
            <p class="tab fixed">修改密码</p>
        </div>

        <!--正文内容-->
        <div class="main">
            <form id="form">
                <!--文本框-->
                <div class="unit clear">
                    <div class="left"><p class="subtitle">新密码</p></div>
                    <div class="right">
                        <input type="password" id="pwd1" class="text" error-msg="6到16位字母或数字或它们的组合"  data-type="密码" />
                    </div>

                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">确认密码</p></div>
                    <div class="right">
                        <input type="password" id="pwd2" class="text" error-msg="6到16位字母或数字或它们的组合" onblur="check()" data-type="密码" />
                    </div>
                </div>
                <!--提交按钮-->
                <div class="unit clear" style="width: 800px;">
                        <button class="button disable">提交</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
<script>
function check() {
    if($("#pwd1").val()===$("#pwd2").val()){
        $("button").attr("class","button blue");
        $("button").click(function () {
            $.post(
                "<%=path%>/user/updataPwd",
                {pwd:$("#pwd2").val()},
                function (data) {
                    console.log(data);
                    if(data.success){
                        javaex.optTip({
                            content : "修改成功",
                            type : "success"
                        });
                    }else{
                        javaex.optTip({
                            content : "修改失败",
                            type : "error"
                        });
                    }
                },
                "json"
            );
        });
    }else {
        javaex.optTip({
            content : "两次密码不一致！",
            type : "error"
        });
    }
}
</script>
</html>
