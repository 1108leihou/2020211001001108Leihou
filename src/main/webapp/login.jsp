<%--
  Created by IntelliJ IDEA.
  User: 小雷
  Date: 2022/3/9
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<form method="post" action="register">
    Username: <input type="text" name="username"/><br/>
    Password: <input type="password" name="password"/><br/>
    Email: <input type="text" name="email"/><br>
    Gender: <input type="radio" name = "gender"> Male <input type="radio" name = "gender"> Female<br/>
    <input type="submit" value="register"/>
</form>

</body>
</html>