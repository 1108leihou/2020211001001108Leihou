<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h2>Welcome,<%-- todo 8 use c:out to print username from parammeter --%>
    <%--<%=request.getParameter("username")%>--%>
    <c:out value="${param.username}"/>
</h2>
</body>
</html>
