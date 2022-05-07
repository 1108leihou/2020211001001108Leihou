package com.LeiHou.week6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RedirectServlet",value = "/redirect")
public class RedirectServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //redirect - same server - Relative URL
        //1.start without /
        System.out.println("before redirect ");

        //response.sendRedirect("index.jsp");//url- change to index.jsp
        //http://localhost:8080/LeiHou2020211001001108/rediirect
        //http://localhost:8080/LeiHou2020211001001108/index.jsp
        //see the url - only last part of url changed ( redirect --> index.jsp )
        System.out.println("after redirect ");

        //2.start with /
        //response.sendRedirect("/HuangXingyue2020211001001101/index.jsp");//- ??? -HTTP Status 404 - Not Found
        //why ? -look at url
        //http://localhost:8080/LeiHou2020211001001108/redirect
        //http://localhost:8080/index.jsp
        //url change after 8080 - means tomcat
        //add LeiHou2020211001001108/


        //redirect - another server - Absolute URL - full url
        response.sendRedirect("http://www.baidu.com/");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
