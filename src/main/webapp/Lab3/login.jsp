<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%-- todo 9: use c:out to print message fron request --%>
<%--<%=//request.getAttribute("message")%>--%>

<%--todo 1: use c:url to set url in action="validate.jsp" --%>
<h2>${message}</h2>
<form action="validate.jsp">
    Username : <input type="text" name="username"><br>
    Password : <input type="password" name="password"><br>
    <input type="submit" value="Login"/>
</form>

</body>
</html>