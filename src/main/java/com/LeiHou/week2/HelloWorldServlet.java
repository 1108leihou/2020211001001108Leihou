package com.LeiHou.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Name:LeiHou ");
        writer.println("ID:2020211001001108");
        writer.println("Date and Time Tuesday March 8 15:58 2022");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}

