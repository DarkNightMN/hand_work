<%--
  Created by IntelliJ IDEA.
  User: GuoYinxin
  Date: 2018/8/20
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

Hello World!
<form action="test2" method="post">
    name:<input type="text" name="name">
    password:<input type="text" name="password">
    <button type="submit">提交</button>
</form>

<form action="testPojo" method="post">
    studentName:<input type="text" name="studentName" ><br/>
    studentAge:<input type="text" name="studentAge"><br/>
    departmentId:<input type="text" name="department.departmentId"><br/>
    departmentName:<input type="text" name="department.departmentName"><br/>
    <button type="submit">提交</button>
</form>

<a href="testS">API</a>
<a href="testMAndV">MandV</a>
<a href="testMap">Map</a>
<a href="testSession">Session</a>
<a href="testMyView">MyView</a>

<form action="/testModelAttr" method="post">
    <input type="hidden" name="studentId" value="1">
    <%--studentName:<input type="text" name="studentName" value="张三"><br/>--%>
    studentAge:<input type="text" name="studentAge" value="20"><br/>
    departmentId:<input type="text" name="department.departmentId" value="1"><br/>
    departmentName:<input type="text" name="department.departmentName" value="d1"><br/>
    <button type="submit">提交</button>
</form>

<a href="${pageContext.request.contextPath}/testViewAndViewResolver">testViewAndViewResolver</a>

<%--<a href="test22?name=admin&password=123">url传参</a>--%>

<%--<a href="testReqHead">Header</a>--%>

<%--<a href="testCookie">Cookie</a>--%>

<%--<a href="test/hello">hello</a>--%>

<%--<a href="testGet/1">test get</a><br />--%>

<%--<form action="/testPost" method="post">--%>
    <%--<input type="hidden" name="_method" value="POST">--%>
    <%--<button type="submit">post</button>--%>
<%--</form>--%>

<%--<form action="/testPut/1" method="post">--%>
    <%--<input type="hidden" name="_method" value="PUT">--%>
    <%--<button type="submit">put</button>--%>
<%--</form>--%>

<%--<form action="/testDelete/1" method="post">--%>
    <%--<input type="hidden" name="_method" value="DELETE">--%>
    <%--&lt;%&ndash;<input type="submit" value="delete">&ndash;%&gt;--%>
    <%--<button type="submit">delete</button>--%>
<%--</form>--%>

</body>
</html>
