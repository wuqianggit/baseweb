<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
配置SpringMVC成功<br/>
请点击添加用户
<form method="post" action="${pageContext.request.contextPath}/addUser">
    姓名：<input type="text" name="userName" id="username" /><br/>
    密码：<input type="password" name="passWord" id="password"><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
