package com.example._2020211001001108leihou.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloworldServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //        当客户端请求方式是GET

        PrintWriter writer = response.getWriter();
        writer.println("Nickname: Leihou");
        writer.println("ID: 2020211001001108");
        writer.println("Date and Time: 2022-03-09 13:22");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        //        当客户端请求方式是Post
    }
}
