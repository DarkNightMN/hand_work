<%--
  Created by IntelliJ IDEA.
  User: GuoYinxin
  Date: 2018/8/22
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width:500px;margin:50px auto">
    <a href="departmentList"><button>Add Student</button></a>
    <table border="1" cellpadding="10px" cellspacing="0" style="margin-top: 10px;text-align: center">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>DepartmentName</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${requestScope.student}" var="student">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.studentName}</td>
                <td>${student.studentAge}</td>
                <td>${student.department.departmentName}</td>
                <td><a href="department/${student.studentId}"><button>Edit</button></a></td>
                <td><a href="delete/${student.studentId}"><button>Delete</button></a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
