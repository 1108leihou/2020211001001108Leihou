<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<div style="text-align: center;">
    <h2>Welcome to My Online shop Home page</h2> <br/>
    <form method="post" target="_blank" action="SearchServlet">
        <input type="text" name="txt" size = 55 />
        <select name="search">
            <option value="baidu">Baidu</option>
            <option value="bing">Bing</option>
            <option value="goolge">Google</option>
        </select>
        <input type="submit" value="Search">
    </form>

    <br/><br/>
    <a href="hello">Hello Servlet</a>
    <br/>
    <a href="hello">Student Info Servlet</a>
    <br/>
    <a href="register">Register and JDBC </a>
    <br/>
    <a href="register.jsp">register </a>
    <br/>
    <a href="config">config </a>
    <br/>
    <a href="Myjsp.jsp">Myjsp </a>
    <br/>
    <b><a href="Login.jsp">Login </a></b>
</div>
<%@include file="footer.jsp"%>