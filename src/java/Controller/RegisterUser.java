/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Register;
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
public class RegisterUser extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            
            /* TODO output your page here. You may use following sample code. */
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
             boolean isRegistered = false;
        // String UserId = request.getParameter("uid");
        String Name = request.getParameter("uname");
        String Contact = request.getParameter("contact");
        String Address = request.getParameter("address");
        String Password = request.getParameter("psw");
        String RePass = request.getParameter("re-psw");
        
          
     
        
               try {
                 Class.forName("oracle.jdbc.OracleDriver");
                 Connection con;
                 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
                
           
                 if(Password.length()>7 && Password.equals(RePass))
                 {
                
                 
                      
                 
          PreparedStatement ps = con.prepareStatement("insert into Register  values(? ,? ,? ,?) ");
           
          ps.setString(1, Name);
          ps.setString(2, Contact);
           ps.setString(3, Address);
           ps.setString(4, Password);
             int i = ps.executeUpdate();
             if(i==1){
                
                  Register reg = new Register();
               //reg.setUserId(UserId);
                  reg.setName(Name);
                  reg.setContact(Contact);
                  reg.setAddress(Address);
                  reg.setPassword(Password);
                  response.sendRedirect("Sucess.jsp");
                  
             }     
                 else{
                  response.sendRedirect("error.jsp");
                    
                    
                     }
                     }else{
                       isRegistered = false;
                  response.sendRedirect("error.jsp");
                     }
                 
                
          }  catch(ClassNotFoundException | SQLException | IOException e){
              out.println("File not found " + e);
          }
    }
    
}