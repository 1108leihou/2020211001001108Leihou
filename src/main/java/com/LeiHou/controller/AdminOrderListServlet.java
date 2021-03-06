package com.LeiHou.controller;

import com.LeiHou.dao.OrderDao;
import com.LeiHou.model.Order;
import com.LeiHou.model.Payment;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/admin/orderList")
public class AdminOrderListServlet extends HttpServlet {
    private Connection con = null;
    public void destroy(){
        super.destroy();//just puts "destroy" string in log
    }
    public void init() throws ServletException{
        con = (Connection)getServletContext().getAttribute("con");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Payment> paymentTypeList = Payment.findAllPayment(con);
        request.setAttribute("paymentTypeList",paymentTypeList);
        OrderDao orderDao= new OrderDao();
        List<Order> orderList=orderDao.findAll(con);
        request.setAttribute("orderList",orderList);
                 String path="/WEB-INF/views/admin/orderList.jsp";
         request.getRequestDispatcher(path).forward(request,response);
    }//end doGet

}//end
