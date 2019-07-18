
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
            <p class="tab fixed">员工添加</p>
        </div>

        <!--正文内容-->
        <div class="main">
            <form id="form">
                <!--文本框-->
                <div class="unit clear">
                    <div class="left"><p class="subtitle">姓名</p></div>
                    <div class="right">
                        <input type="text" name="empName" data-type="必填" style="height: 30px" />
                    </div>

                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">年龄</p></div>
                    <div class="right">
                        <input type="text" name="empAge" data-type="正整数" style="height: 30px;width: 50px" />
                    </div>
                </div>
                <!--单选框-->
                <div class="unit clear">
                    <div class="left"><p class="subtitle">性别</p></div>
                    <div class="right">
                        <ul class="equal-8 clear">
                            <li><input type="radio"  class="fill" name="empSex" checked value="M"/>男</li>
                            <li><input type="radio" class="fill" name="empSex" value="F"/>女</li>
                        </ul>
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">联系电话</p></div>
                    <div class="right">
                        <input type="text" name="empPhone" data-type="手机号" style="height: 30px" class="icon-headphones" />
                    </div>
                </div>
                <!--下拉选择框-->
                <div class="unit clear">
                    <div class="left"><p class="subtitle">部门</p></div>
                    <div class="right">
                        <select id="dept" name="deptId">
                            <option value="">请选择</option>
                        </select>
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">职位</p></div>
                    <div class="right">
                        <select id="type" name="typeId">
                            <option value="">请选择</option>
                        </select>
                    </div>
                </div>
                <!--文本域-->
                <div class="unit clear">
                    <div class="left"><p class="subtitle">住址</p></div>
                    <div class="right">
                        <textarea data-type="中文" name="empAddress" class="desc" placeholder="请填写住址"></textarea>
                    </div>
                </div>
                <!--提交按钮-->
                <div class="unit clear" style="width: 800px;">
                    <div style="text-align: center;">
                        <!--表单提交时，必须是input元素，并指定type类型为button，否则ajax提交时，会返回error回调函数-->
                        <input type="button" id="save" class="button yes" value="保存" />
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
<script>
    $(function () {
        $.ajax({
            url:"<%=path%>/depts",
            dataType:"json",
            type:"POST",
            success:function (data) {

                $.each(data,function (index,item) {

                    $.each(item,function (i,it){
                        var option =$("<option></option>").append(it.deptName).attr("value",it.deptId);
                        option.appendTo("#dept");
                    });

                });
            }
        });
        $.ajax({
            url:"<%=path%>/type",
            dataType:"json",
            type:"POST",
            success:function (data) {
                $.each(data,function (index,item) {

                    $.each(item,function (i,it){
                        console.log(it.typrName)
                        var option =$("<option></option>").append(it.typeName).attr("value",it.typeId);
                        option.appendTo("#type");
                    });
                });
            }
        })
    });
    javaex.select({
        id : "select",
        isSearch : false
    });
    javaex.tag({
        id : "tag"
    });

    // 监听点击保存按钮事件
    $("#save").click(function() {
        // 表单验证函数
        if (javaexVerify()) {
            // 返回错误信息时，可以添加自定义异常提示。参数为元素id和提示
            // addErrorMsg("username", "用户名不存在");
            // 提交
            $.ajax({
                url:"<%=path%>/emp/saveEmp",
                data:$("#form").serialize(),
                dataType:"json",
                type:"POST",
                success:function (data) {
                    if(data.success){
                        javaex.optTip({
                            content : "保存成功",
                            type : "success"
                        });
                    }else if(data.success){
                        javaex.optTip({
                            content : "保存失败",
                            type : "error"
                        });
                    }
                }
            })


        }
    });
</script>
</html>
