<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<body>
<head>
    <title>converter</title>
    <meta charset="utf-8">
</head>
<h2>converter</h2>
<div id="resp">

</div>
<input type="button" onclick="req();" value="请求"/>
</body>
<script src="../assets/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script>

    function req() {
        $.ajax({
            url:"converter",
            data:"1-lengedyun",
            type:"POST",
            contentType:"application/x-widely",//后端自定义数据类型
            success:function (data) {
                $("#resp").html(data)
            }
        })
    }
</script>
</html>

