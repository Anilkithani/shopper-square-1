/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
import dao.AdminDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AdminController extends HttpServlet {
//private static String INSERT_OR_EDIT = "/adminAddProduct.jsp";
//private static String ADMIN = "/admin.jsp";
private AdminDao dao;
public AdminController(){
    super();
    dao = new AdminDao();
}

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        PrintWriter out = response.getWriter();
       // out.println("here afngg");
       // String forward = "";
        String action = request.getParameter("action");
        if(action.equalsIgnoreCase("delete")){
            String productId = request.getParameter("productId");
            dao.deleteProduct(productId);
          response.sendRedirect("admin.jsp");
            request.setAttribute("pro", dao.getAllProducts());
        }else if(action.equalsIgnoreCase("edit")){  
           response.sendRedirect("adminAddProduct.jsp");
        String productId = request.getParameter("productId");
        Product p = dao.getProductById(productId);
        request.setAttribute("product", p);
    }else if(action.equalsIgnoreCase("admin")){
       response.sendRedirect("admin.jsp");
        request.setAttribute("pro", dao.getAllProducts());
        
    }else{
       response.sendRedirect("adminAddProduct.jsp");
        
    }
       // RequestDispatcher rd = request.getRequestDispatcher(forward);
       // rd.forward(request, response);  
    }   

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Product p = new Product();
        String productid = request.getParameter("productid");
        p.setProductname(request.getParameter("productname"));
        p.setCategory(request.getParameter("category"));
        p.setDescription(request.getParameter("description"));
       String price = request.getParameter("price");
       String quantity = request.getParameter("quantity");
      
      if(productid==null || productid.isEmpty()){
          dao.addProduct(p);
          
      }else{
          p.setPrice(Double.parseDouble(price));
          p.setQuantity(Integer.parseInt(quantity));
         p.setProductid(productid);
        dao.updateProduct(p);
          
          
      }
      RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
      request.setAttribute("pro", dao.getAllProducts());
      rd.forward(request, response);
      
         
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
