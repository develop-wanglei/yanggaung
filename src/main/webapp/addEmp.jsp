
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
                <!--单选框-->
                <div class="unit clear">
                    <div class="left"><p class="subtitle">性别</p></div>
                    <div class="right">
                        <ul class="equal-8 clear">
                            <li><input type="radio"  class="fill" name="empSex"  value=0/>男</li>
                            <li><input type="radio" class="fill" name="empSex" checked value=1/>女</li>
                        </ul>
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">出生日期</p></div>
                    <div class="right">
                        <input type="text" id="date1" class="date" name="time" style="width: 140px;" value="" readonly/>
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">民族</p></div>
                    <div class="right">
                        <input type="text" name="empNation"  style="height: 30px;width: 40px;" />
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">学历</p></div>
                    <div class="right">
                        <select id="select" name="empEducation">
                            <option value="">请选择</option>
                            <option value="小学">小学</option>
                            <option value="初中">初中</option>
                            <option value="高中">高中</option>
                            <option value="中专">中专</option>
                            <option value="大专">大专</option>
                            <option value="本科">本科</option>
                            <option value="无">无</option>
                        </select>
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">政治面貌</p></div>
                    <div class="right">
                        <input type="text" name="empPoliticsstatus"  style="height: 30px;width: 40px;"  />
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">籍贯</p></div>
                    <div class="right">
                        <input type="text" name="empPlace" data-type="必填" style="height: 30px" />
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">联系电话</p></div>
                    <div class="right">
                        <input type="text" name="empPhone" data-type="手机号" style="height: 30px" class="icon-headphones" />
                    </div>
                </div>
                <!--文本域-->
                <div class="unit clear">
                    <div class="left"><p class="subtitle">住址</p></div>
                    <div class="right">
                        <textarea data-type="中文" name="empAddress" class="desc" placeholder="请填写住址"></textarea>
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">身份证号</p></div>
                    <div class="right">
                        <input type="text" name="empCardid" data-type="身份证号" style="height: 30px;width: 250px;"  class="icon-headphones" />
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">人员身份</p></div>
                    <div class="right">
                        <input type="text" name="empIdentity"  style="height: 30px"  />
                    </div>
                </div>
                <div class="unit clear">
                    <div class="left"><p class="subtitle">求职意向</p></div>
                    <div class="right">
                        <textarea data-type="中文" name="empJob" class="desc" placeholder="请填写意向，两个意向之间用“，”隔开"></textarea>
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
    //日期选择
    javaex.date({
        id : "date1",		// 承载日期组件的id
        monthNum : 1,		// 1代表选择单日日期
        date : "2019-01-01",	// 选择的日期
        // 重新选择日期之后返回一个时间对象
        callback : function(rtn) {

        }
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
