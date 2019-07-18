<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--左侧内容-->
<div class="admin-left">
    <!--logo-->
    <div class="logo">
        <h1>阳光大姐(东港店)</h1>
    </div>
    <!--左侧菜单-->

    <div id="menu" class="menu">
        <ul>
            <li class="menu-item">
                <a href="<%=path%>/user/index"><span class="icon-home2"></span>主页</a>
            </li>
            <li class="menu-item">
                <a href="javascript:;"><span class="icon-users"></span>员工管理<i class="icon-keyboard_arrow_left"></i></a>
                <ul>
                    <li><a href="<%=path%>/employee/selectAllEmp">员工信息</a></li>
                </ul>
            </li>
            <li class="menu-item">
                <a href="javascript:;"><span class="icon-gears"></span>系统管理<i class="icon-keyboard_arrow_left"></i></a>
                <ul>
                    <li><a href="<%=path%>/file/fileUpload">文件上传</a></li>
                    <li><a href="<%=path%>/file/fileAll">文件下载</a></li>
                </ul>
            </li>
        </ul>
    </div>
</div>
<!--顶部-->
<div class="admin-header">
    <div class="admin-header">
        <ul class="header-right">
            <li>
                <p class="pull-left margin-left-10">欢迎您，工号：<b>${user.userName}</b></p>
                <label class="margin-left-10 margin-right-10">|</label>
                <a href="<%=path%>/user/logout">退出</a>
            </li>
            <li>
                <a href="#">
				<span class="icon-commenting-o" style="font-size: 20px;position: relative;top:2px;">
				</span>
                </a>
            </li>
            <li>
                <button class="button blue" id="uppwd"><span class="icon-key"></span> 修改密码</button>
            </li>
        </ul>
    </div>
    <script>
        javaex.menu({
            id: "menu",	// 菜单id
            isAutoSelected: true
        });
        $("#uppwd").click(function() {
            javaex.dialog({
                type : "login",	// 弹出层类型
                width : "400",
                height : "400",
                url : "<%=path%>/user/upPwd"
            });
        });
    </script>
</div>