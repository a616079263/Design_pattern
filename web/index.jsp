<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/6
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>主页</title>
    <script>

    </script>
</head>
<body>
<center>
    <table>
        <tr>
            <td><a href="/pattern/static">静态</a></td>
        </tr>
        ${pageContext.request.contextPath}
        <tr>
            <td><a href="/pattern/strategy">策略</a></td>
        </tr>
    </table>
</center>
</body>
</html>
