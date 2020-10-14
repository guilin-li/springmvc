
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <td>生日1 </td>
        <td>生日2</td>
        <td>备注 </td>
    </tr>
    <c:forEach items="${list}" var="item" >
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.password}</td>
            <td>${item.city}</td>
            <td>${item.birthday.year}/${item.birthday.month}/${item.birthday.day}</td>
            <td><fmt:formatDate value="${item.birthday2}" pattern="yyyy年MM月dd日"/> </td>
<%--            <td><a href="#">改动</a> </td>--%>
            <td><a href="${pageContext.request.contextPath}/update.action?id=${item.id}">修改</a> </td>

        </tr>
    </c:forEach>

</table>
</body>
</html>

