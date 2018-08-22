<%--
  Created by IntelliJ IDEA.
  User: GuoYinxin
  Date: 2018/8/21
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $("#json").click(function () {
                var url="testJson";
                var args={};
                $.post(url,args,function (data) {
                    console.log(data)
                })
            })
        })
    </script>
</head>
<body>
<a href="student">列表</a>
<button id="json">Json</button>
</body>
</html>
