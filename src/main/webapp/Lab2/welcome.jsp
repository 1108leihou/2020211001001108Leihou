<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h2>Welcome,
    <%--todo 9 : use jsp:useBean to access the same instance of login bean from request scope--%>
    <jsp:useBean id="Login" class="com.Lab2.Login" scope="request"></jsp:useBean>
    <%--todo 10 : use jsp:getProperty to display username --%>
    <jsp:getProperty name="Login" property="username"/>
</h2>
</body>
</html>
