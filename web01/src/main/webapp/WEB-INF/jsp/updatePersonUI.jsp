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

${Person}
<form method="post" action="${pageContext.request.contextPath}/update2.action">
    用户名： <input type="text" name="username"  value="${person.username}"/><br/>
    用户密码： <input type="text" name="password"  value="${person.password}"/><br/>
    城市： <input type="text" name="city"  value="${person.city}"/><br/>
    年 <input type="text" name="birthday.year"  value="${person.birthday.year}"/><br/>
    月<input type="text" name="birthday.month"  value="${person.birthday.month}"/><br/>
    日<input type="text" name="birthday.day"  value="${person.birthday.day}"/><br/>
    出生日期<input type="text" name="birthday2"value="${person.birthday2}" /><br/>
    <input type="submit" value="更新"/><br/>
</form>


</body>
</html>
