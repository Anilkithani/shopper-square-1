/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import dao.ProductDao;
import java.sql.*;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class CartController extends HttpServlet {
//private static String ADDPRODUCT ="/Electronics.jsp";
private ProductDao dao;
   private Product prod = new Product();

private Connection con;
public CartController(){
    super();
    dao = new ProductDao();
}






    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     PrintWriter out = response.getWriter();
     
          
            }
     
       
       
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String pid = request.getParameter("pid");
         String pid1 = request.getParameter("pid1");
       out.println(pid);
         try{
            
        Class.forName("oracle.jdbc.OracleDriver");
        
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
          
            PreparedStatement ps;
             
            ps = con.prepareStatement("insert into cart_item select p_id,p_name,p_price,p_quantity from E_product where p_id=?");
          
          // ps = con.prepareStatement("insert into cart_item select p_id,p_name,p_price,p_quantity from E_product values(?,?,?,?)");
            ps.setString(1, pid);
            
         //   ps.setString(2, prod.getProductname());
           // ps.setDouble(3, prod.getPrice());
            //ps.setInt(4, prod.getQuantity());
           // ps.executeQuery();
           
           int i=ps.executeUpdate();
           
            if(i>0);
           // response.sendRedirect("viewCart.jsp");
               
            try{
            PreparedStatement ps1 = con.prepareStatement("delete  from cart_item where p_id=?");
              
                    ps1.setString(1, pid1);
             
                    ps1.executeUpdate();
                          out.println("connected or not");
               
                          
             response.sendRedirect("viewCart.jsp");
       
            }catch(SQLException e){
                
            }
             
            }catch(SQLException |ClassNotFoundException e){
            System.out.println(e);
        }
        
    
        }

        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        
    }
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
