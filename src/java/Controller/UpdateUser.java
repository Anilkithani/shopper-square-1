/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class UpdateUser extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
           
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();   
         // String UserId = request.getParameter("uid");
        String Name = request.getParameter("uname");
        String Contact = request.getParameter("contact");
        String Address = request.getParameter("address");
        String Password = request.getParameter("psw");
      
        
           int UpdateQuery = 0;
     
        
               try {
                 Class.forName("oracle.jdbc.OracleDriver");
                 Connection con;
                
                 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
        String query = "update register set contact=?,address=? ,password=?"+ "where name=?";
           PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, Contact);
         ps.setString(2, Address);
    ps.setString(3, Password);
      ps.setString(4,Name);
           UpdateQuery = ps.executeUpdate();
           if(UpdateQuery>0){
               response.sendRedirect("login.jsp");
               out.println("successfully updated");
               
           }else{
               response.sendRedirect("error.jsp");
                out.println("Not updated ");   
               }
           
           
          
        
        
    }catch(ClassNotFoundException | SQLException e){
        out.println("You are not update your profile" + e);
    }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
