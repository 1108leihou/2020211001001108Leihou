package com.LeiHou.week4;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//now we can use another way - one easy
/*@WebServlet(name = "JDBCDemoServlet",urlPatterns = {"/jdbc"},
        initParams = {
        @WebInitParam(name="driver",value="com.microsoft.sqlserver.jdbc.SQLServerDriver"),
                @WebInitParam(name="url",value="jdbc:sqlserver://localhost:1433;database=userdb;encrypt=false"),
                @WebInitParam(name="username",value="sa"),
                @WebInitParam(name="password",value="admin123456789")
        },
        loadOnStartup = 1
)*/
//done --use @WebServlet - no web.xml code


//demo #3 - many servlet need driver,url,username,password yo connection db
//so its better use servletcontext( one for all servlet )in web.xml not servlet Config(only for this servlet)
@WebServlet(urlPatterns = {"/jdbc"},loadOnStartup = 1)//only url and load on startup
public class JDBCDemoServlet extends HttpServlet {
    Connection con=null;//class variable;
    @Override
    public void init() throws ServletException {
        super.init();
        //way 2 - create connection with init()
        //to get connection we need 4 variables
        //connect to sql server
        //String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";//name ="value"
        //String url="jdbc:sqlserver://localhost:1433;database=userdb;encrypt=false";
        //String username="sa";
        //String password="admin123456789";

        //there 4 variable should not in java code -- most be in web.xml as config param
        //get init param
        //step 1- get servlet config
        //ServletConfig config=getServletConfig();
        //step 2 - get param
        // String driver= config.getInitParameter("driver");//get <param-name>driver</param-name> value
        //String url= config.getInitParameter("url");//get <param-name>url</param-name> value
        //String username= config.getInitParameter("username");//get  <param-name>username</param-name> value
        // String password= config.getInitParameter("password");//get <param-name>password</param-name> value

        //demo #3 - use Servletcontext
        ServletContext context =getServletContext();
        String driver=context.getInitParameter("driver");
        String url=context.getInitParameter("url");
        String username=context.getInitParameter("username");
        String password=context.getInitParameter("password");


        //now use 4 variables to get connection
        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("Connection --> in JDBCDemoServlet"+con);//just print for test
            //one connection -
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //way 1 create connection within doget



        //dont create con here - only use it to do select insert update
        System.out.println("Connection --> "+con);//just print for test

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        super.destroy();
        //close connection here - when stop tomcat
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
