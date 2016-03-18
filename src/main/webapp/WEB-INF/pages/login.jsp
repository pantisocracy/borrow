<%--
  Created by IntelliJ IDEA.
  User: lbc
  Date: 16/3/18
  Time: 下午8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>登陆</title>
</head>
<body>
  <form method="post" action="/user/submit">
    <input type="text" name="userName"/>
    <input type="password" name="passWord"/>
    <input type="submit" value="login"/>
  </form>
</body>
</html>
