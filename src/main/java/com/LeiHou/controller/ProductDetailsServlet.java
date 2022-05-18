package com.LeiHou.controller;

import com.LeiHou.dao.ProductDao;
import com.LeiHou.model.Category;
import com.LeiHou.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductDetailsServlet",value = "/productDetails")
public class ProductDetailsServlet extends HttpServlet {
    private Connection con =null;

    public void init() throws SecurityException{
        con = (Connection)getServletContext().getAttribute("con");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = request.getParameter("id")!=null?Integer.parseInt(request.getParameter("id")):0;
        ProductDao productDao = new ProductDao();
        if(id==0){
            return;//error
        }
        List<Category> categoryList = null;
        try {
            categoryList = Category.findAllCategory(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("categoryList",categoryList);

        Product product = null;
        try {
            product = productDao.findById(id,con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("p",product);
        String path = "/WEB-INF/views/productDetails.jsp";
        request.getRequestDispatcher(path).forward(request,response);

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
