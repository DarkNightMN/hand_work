<%--
  Created by IntelliJ IDEA.
  User: GuoYinxin
  Date: 2018/8/21
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="${pageContext.request.contextPath}${'/student'}"
           method="post"
           modelAttribute="student">


    <c:if test="${student.studentId==0}">
        Name:<form:input path="studentName" />
        <form:errors path="studentName"></form:errors><br />
    </c:if>

    <c:if test="${student.studentId!=0}">
        <%--隐藏表单域需要form:hidden加input hidden--%>
        <form:hidden path="studentId" />
        <input type="hidden" name="_method" value="PUT">
    </c:if>


    Age:<form:input path="studentAge" />
    <form:errors path="studentAge"></form:errors><br />

    Department:
    <form:select path="department.departmentId"
                 items="${requestScope.departments}"
                 itemLabel="departmentName"
                 itemValue="departmentId"/><br />

    <input type="submit" value="保存">
</form:form>

</body>
</html>
