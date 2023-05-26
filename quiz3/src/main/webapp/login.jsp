<%--
  Created by IntelliJ IDEA.
  User: illusion
  Date: 2022/10/26
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="loginDiv" style="height: 350px">
    <form action="/quiz3/loginServlet" method="post" id="form">

        <p>账号:<input id="username" name="username"value="${cookie.username.value}" type="text"></p>
        <p>密码:<input id="password" name="password" type="password"></p>
        <p><input id="remember" name="remember" value="1" type="checkbox">记住账号</p>
        <div id="subDiv">
            <input type="submit" class="button" value="登录">
        </div>
    </form>
</div>
</body>
</html>
