<%--
  Created by IntelliJ IDEA.
  User: 小雷
  Date: 2022/3/30
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<div style="text-align: center;">
  <h2>Login</h2>
  <%
    if(!(request.getAttribute("message") == null)) {
      PrintWriter writer = response.getWriter();
      writer.println(
              "<h2>" + request.getAttribute("message") + "</h2>"
      );
    }
  %>
  <form method="post" action="login">
    ID : <input type="text" name="ID" /> <br/>
    Password: <input type="password" name="password"/><br/>
    <input type="submit" value="Login"/>
  </form>
</div>
<%@include file="footer.jsp"%>