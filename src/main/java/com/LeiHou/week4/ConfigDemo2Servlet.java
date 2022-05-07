package com.LeiHou.week4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConfigDemo2Servlet",
        urlPatterns = {"/config2"},
        initParams = {
                @WebInitParam(name= "name", value="LeiHou"),
                @WebInitParam(name= "studentId", value= "2020211001001108"),
        }
)
public class ConfigDemo2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = getServletConfig().getInitParameter("name");
        String studentId = getServletConfig().getInitParameter("studentId");
        System.out.println("name:"+name);
        System.out.println("studentId:"+studentId);
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>name:" + name + "</h1>");
        out.println("<h1>studentId:" + studentId + "</h1>");
        out.println("</body></html>");
    }
}

