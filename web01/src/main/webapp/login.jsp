<%--
  Created by IntelliJ IDEA.
  User: guilin
  Date: 2020/10/13
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/login4.action">
    <input type="text" name="username" /><br/>
    <input type="text" name="password"/><br/>
    <input type="submit" value="登录"/><br/>
</form>
</body>
</html>
