<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path=request.getContextPath();%>
<!DOCTYPE >
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script src="<%=path%>/static/js/jquery-3.3.1.js"></script>
    <link href="<%=path%>/static/css/login2.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>欢迎登录阳光大姐员工管理</h1>

<div class="login" style="margin-top:50px;">

    <div class="header">
        <div class="switch" id="switch"><a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);" tabindex="7">登录</a>
            <div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;"></div>
        </div>
    </div>


    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 300px;">

        <!--登录-->
        <div class="web_login" id="web_login">

                <div class="login_form">
                        <div class="uinArea" id="uinArea">
                            <label class="input-tips" for="u">帐号：</label>
                            <div class="inputOuter" id="uArea">
                                <input type="text" id="u" name="username" class="inputstyle" placeholder="输入手机号"/>
                            </div>
                        </div>
                        <div class="pwdArea" id="pwdArea">
                            <label class="input-tips" for="p">密码：</label>
                            <div class="inputOuter" id="pArea">
                                <input type="password" id="p" name="p" class="inputstyle" placeholder="输入密码"/>
                            </div>
                        </div>
                        <div class="yanzhengma">
                            <input id="code" class="input-tips" style="width: 120px;height:40px"  placeholder="输入验证码"/>
                                <a href="#" id="changeImg">
                                    <canvas style="margin-top: 10px" class="show-captcha" id="canvas" width="130px" height="40px"></canvas>
                                </a>
                        </div>
                        <div style="padding-left:50px;margin-top:20px;">
                            <a href="#"><input value="登 录" style="width:150px;" class="button_blue"/></a>
                        </div>
                </div>

        </div>
        <!--登录end-->
    </div>
</div>
<script>
    /*验证码生成*/
    $(function () {
        /**生成一个随机数**/
        function randomNum(min, max) {
            return Math.floor(Math.random() * (max - min) + min);
        }
        /**生成一个随机色**/
        function randomColor(min, max) {
            var r = randomNum(min, max);
            var g = randomNum(min, max);
            var b= randomNum(min, max);
            return "rgb(" + r + "," + g + "," + b + ")";
        }
        var code=drawPic();
        document.getElementById("changeImg").onclick = function(e) {
            e.preventDefault();
            code=drawPic();
        }
        /**绘制验证码图片**/
        function drawPic() {
            var canvas = document.getElementById("canvas");
            var width = canvas.width;
            var height = canvas.height;
            //获取该canvas的2D绘图环境
            var ctx = canvas.getContext('2d');
            ctx.textBaseline ='bottom';
            /**绘制背景色**/
            ctx.fillStyle = randomColor(180,240);
            //颜色若太深可能导致看不清
            ctx.fillRect(0,0,width,height);
            /**绘制文字**/
            var str ='ABCEFGHJKLMNPQRSTWXY123456789';
            var code="";
            //生成四个验证码
            for(var i=1;i<=4;i++) {
                var txt = str[randomNum(0,str.length)];
                code=code+txt;
                ctx.fillStyle = randomColor(50,160);
                //随机生成字体颜色
                ctx.font = randomNum(15,40) +'px SimHei';
                //随机生成字体大小
                var x =10 +i *25;
                var y = randomNum(25,35);
                var deg = randomNum(-45,45);
                //修改坐标原点和旋转角度
                ctx.translate(x, y);
                ctx.rotate(deg * Math.PI /180);
                ctx.fillText(txt,0,0);
                //恢复坐标原点和旋转角度
                ctx.rotate(-deg * Math.PI /180);
                ctx.translate(-x, -y);
            }
            return code;
        }
        $(".button_blue").click(function () {
            if($("#code").val()==code){
                $.post(
                    "user/login",
                    {username:parseInt($("#u").val()),password:$("#p").val()},
                    function (data) {
                        if(data.code==0){
                                location.href="user/index";
                        }else {
                            alert("用户名或密码错误！");
                        }
                    },
                    "json"
                );
            }else {
                alert("验证码错误！");
            }
        });

    });
</script>
</body>
</html>