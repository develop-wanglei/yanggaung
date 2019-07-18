<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path=request.getContextPath();%>
<html>
<head>
    <%@include file="head.jsp"%>
</head>
<body>
<!--右侧内容-->
<div class="admin-right">
    <%@include file="body.jsp"%>
    <!--全部主体内容-->
    <div class="list-content">
            <!--正文内容-->
            <div class="main">
                <div class="list-content">
                    <!--块元素-->
                    <div class="block">
                        <!--页面有多个表格时，可以用于标识表格-->
                        <h2>员工信息</h2>
                        <!--右上角的返回按钮-->
                        <a href="javascript:history.back()">
                            <button class="button wathet" style="position: absolute;right: 20px;top: 16px;"><span class="icon-arrow_back"></span> 返回</button>
                        </a>
                        <!--正文内容-->
                        <div class="main">
                            <!--表格上方的搜索操作-->
                            <div class="admin-search">
                                <div class="input-group">
                                    <input type="text" class="text" id="likeInfo" placeholder="输入姓名关键字" />
                                    <button class="button blue" id="likeName">搜索</button>
                                </div>
                            </div>

                            <!--表格上方的操作元素，添加、删除等-->
                            <div class="operation-wrap">
                                <div class="buttons-wrap">
                                    <button class="button blue" id="addButton"><span class="icon-plus"></span> 添加</button>
                                    <button class="button red" onclick="deleteDialog(this, 'xxxx')"><span class="icon-remove" ></span> 删除</button>
                                </div>
                            </div>
                            <table id="table" class="table color2">
                                <thead>
                                <tr>
                                    <th class="checkbox"><input type="checkbox" class="fill listen-1" /> </th>
                                    <th>工号</th>
                                    <th>姓名</th>
                                    <th>年龄</th>
                                    <th>性别</th>
                                    <th>联系方式</th>
                                    <th>住址</th>
                                    <th>部门</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody id="emptbody">

                                <c:forEach items="${pageInfo.list}" var="emp" >
                                <tr>
                                    <td class="checkbox"><input type="checkbox" class="fill listen-1-2" /> </td>
                                    <td>${emp.empId}</td>
                                    <td>${emp.empName}</td>
                                    <td>${emp.empAge}</td>
                                    <td>${emp.empSex=='M'?"男":"女"}</td>
                                    <td>${emp.empPhone}</td>
                                    <td>${emp.empAddress}</td>
                                    <td>${emp.department.deptName}</td>
                                    <td>
                                        <button id="update" onclick="update(${emp.empId})" class="button green">修改</button>
                                        <button class="button red" onclick="deleteDialog(this,${emp.empId})">删除</button>
                                    </td>
                                </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                            <div class="page">
                                <ul id="page" class="pagination"></ul>
                            </div>
                            <script>
                                javaex.page({
                                    id : "page",
                                    pageCount : ${pageInfo.pages},	// 总页数
                                    currentPage : ${pageInfo.pageNum},// 默认选中第几页
                                    position : "left",
                                    // 返回当前选中的页数
                                    callback : function(rtn) {
                                        location.href="<%=path%>/emp/empAll?pn="+rtn.pageNum;
                                    }
                                });

                                // obj为当前点击的元素对象
                                function deleteDialog(obj, id) {
                                    javaex.deleteDialog(
                                        obj,	// obj是必须的
                                        {
                                            content : "确定要删除么",
                                            callback : "callback('"+id+"')"
                                        }

                                    );
                                }
                                /*删除*/
                                function callback(id) {
                                    $.post(
                                        "<%=path%>/emp/delEmp",
                                        {empId:id},
                                        null
                                    );

                                    // 如果你想阻止弹出层关闭，直接 return false; 即可
                                    //return false;
                                }
                                /*添加*/
                                $("#addButton").click(function() {
                                    javaex.dialog({
                                        type : "login",	// 弹出层类型
                                        width : "700",
                                        height : "600",
                                        url : "<%=path%>/emp/addEmp"
                                    });
                                });
                                /*修改*/
                                function update(id){
                                    javaex.confirm({
                                        content : "确定要修改吗？",
                                        callback : "callbacks('"+id+"')"
                                    });
                                }
                                function callbacks(id) {
                                    // 如果你想阻止弹出层关闭，直接 return false; 即可
                                    //return false;
                                    $.post(
                                        "<%=path%>/emp/queryEmp",
                                        {empId:id},
                                        function (data) {
                                            if(data.success){
                                                javaex.dialog({
                                                    type : "login",	// 弹出层类型
                                                    width : "700",
                                                    height : "600",
                                                    url : "<%=path%>/emp/upEmp"
                                                });
                                            }else {
                                                javaex.alert({
                                                    content : "请重试！"
                                                });
                                            }
                                        },
                                        "json"
                                    );

                                }
                                $("#likeName").click(function(){
                                    $.post(
                                        "<%=path%>/emp/like",
                                        {name:$("#likeInfo").val()},
                                       null
                                    );
                                });
                            </script>
                        </div>
                    </div>
                </div>
            </div>
    </div>
</div>
</body>
</html>
