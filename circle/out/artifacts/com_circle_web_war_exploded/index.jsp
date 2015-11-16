<%--
  Created by IntelliJ IDEA.
  User: okcoin
  Date: 2015/11/11
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; UTF-8" %>
<html>
  <head>
    <title>login</title>
  </head>
  <body>
  <form action="/user/login.do" method="post">
    username: <input type="text" name="username"/><br>
    password: <input type="password" name="password"/><br>
    <input type="submit" value="login"/>
  </form>

  </body>
</html>
