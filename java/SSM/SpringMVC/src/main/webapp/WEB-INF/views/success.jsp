<%--
  Created by IntelliJ IDEA.
  User: GuoYinxin
  Date: 2018/8/20
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
success!!!!!
<%--${requestScope.aaa}--%>
requestPa:
<%=
    request.getParameter("name")
%><br />
requestAttr:
<%=
   request.getAttribute("name")
%>
<br />
requestScope:
<%--<%=--%>
    <%--request.getParameter("password")--%>
<%--%>--%>

<%--${requestScope.name}--%>
${requestScope.student}
<br />

sessionScope:
${sessionScope.student}


<%--${param.name}--%>
</body>
</html>
