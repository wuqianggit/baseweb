<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/9
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="get">

    用户名：<input type="text" id="username" name="username" />
    密码：<input  type="password" id="password" name="password">

    <input type="submit" value="get登录">
</form>

<form action="${pageContext.request.contextPath}/login" method="post">

    用户名：<input type="text" name="username" />
    密码：<input  type="password" name="password">

    <input type="submit" value="post登录">
</form>
</body>
</html>
