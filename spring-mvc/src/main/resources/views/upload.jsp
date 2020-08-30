<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<body>
<head>
    <title>uplaod</title>
    <meta charset="utf-8">
</head>
<h2>文件上传</h2>
<div class="upload">
    <form action="upload" enctype="multipart/form-data" method="post">
        <input type="file" name="file">
        <input type="submit" value="上传"/>
    </form>
</div>
</body>
</html>
