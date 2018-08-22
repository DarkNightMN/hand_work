<%--
  Created by IntelliJ IDEA.
  User: GuoYinxin
  Date: 2018/8/21
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" isErrorPage="true" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $(".delete").click(function () {
                var href=$(this).attr("href");
                $("#deleteForm").attr("action",href).submit();
                return false;
            });
        })
    </script>
</head>

<body>

<%--隐藏表单域，改请求为DELETE，用js赋予action的href--%>
<form action="" method="POST" id="deleteForm">
    <input type="hidden" name="_method" value="DELETE">
</form>

<c:if test="${empty requestScope.list}">
    没有信息
</c:if>
<c:if test="${!empty requestScope.list}">
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Department</th>
            <th>EDIT</th>
            <th>DELETE</th>
        </tr>

        <c:forEach items="${requestScope.list}" var="student">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.studentName}</td>
                <td>${student.studentAge}</td>
                <td>${student.department.departmentName}</td>
                <td><a href="department2/${student.studentId}">EDIT</a></td>
                <td><a class="delete" href="student/${student.studentId}">DELETE</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<a href="department">
    <button>添加学生</button>
</a>

</body>
</html>
