
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();%>
<html>
<head>
    <title>阳光大姐(东港店)</title>
    <%@include file="head.jsp"%>
    <!--钟表-->
    <link href="<%=path%>/static/css/jb51.css" rel="stylesheet" type="text/css">
</head>

<body>
<!--左侧内容-->
<!--右侧内容-->
<%@include file="body.jsp"%>
    <!-- 时钟代码 开始 -->
    <div class="icon-large icon-clock">
        <div class="clock">
            <ol>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ol>
            <div id="hour"></div>
            <div id="min"></div>
            <div id="sec"></div>
        </div>
    </div>
    <script type="text/javascript" src="../..<%=path%>/static/js/jb51.js"></script>
</div>
</body>
</html>
