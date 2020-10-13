
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1px" width="100%">
    <tr>
        <td>编号 </td>
        <td>用户名 </td>
        <td>密码 </td>
        <td>城市 </td>
        <td>备注 </td>
    </tr>
    <c:forEach items="${list}" var="item" >
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.password}</td>
            <td>${item.city}</td>
            <td><a href="#">改动</a> </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

