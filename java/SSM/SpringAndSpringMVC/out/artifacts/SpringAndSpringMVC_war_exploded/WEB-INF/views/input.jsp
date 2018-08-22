<%--
  Created by IntelliJ IDEA.
  User: GuoYinxin
  Date: 2018/8/22
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width:500px;margin:50px auto">
    <form:form action="${pageContext.request.contextPath}/addOrUpdate" modelAttribute="student">
        <form:hidden path="studentId"></form:hidden>
        Name:<form:input path="studentName"></form:input><br>
        Age:<form:input path="studentAge"></form:input><br>
        Department:<form:select path="department.departmentId" 
                                items="${requestScope.departments}"
                                itemLabel="departmentName"
                                itemValue="departmentId">
                    </form:select>
        <button type="submit">保存</button>
    </form:form>
</div>

</body>
</html>
