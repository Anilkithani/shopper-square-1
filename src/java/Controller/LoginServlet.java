package Controller;




import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


/**
 *
 * @author chirag
 */
public class LoginServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        doPost(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String Name, Password;
      
        PrintWriter out = response.getWriter();
       Name = request.getParameter("uname");
        Password = request.getParameter("psw");
        
        
      try {
            
           Class.forName("oracle.jdbc.OracleDriver");
                 Connection con;
                 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
           

            
            PreparedStatement st = con.prepareStatement("Select * from Register where Name=? and Password=?");
        st.setString(1, Name);
       st.setString(2, Password);
        ResultSet rs = st.executeQuery();                        
        if(rs.next())  { 
        
     
            if(Name.equals("admin")&&Password.equals("iamfrk@123")){
               HttpSession session = request.getSession();
               session.setAttribute("username", Name);
                RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
                rd.forward(request, response);
            
                    
            }
            
            else if(Name.equals(Name)&&Password.equals(Password)){
               HttpSession session = request.getSession();
               session.setAttribute("username", Name);
                RequestDispatcher rd = request.getRequestDispatcher("Electronics.jsp");
                rd.forward(request, response);
            
            }
         
                      
        }  else{
           out.println("Invalid login credentials");  
            request.getRequestDispatcher("error.jsp").forward(request, response);
   }
           
        }
   catch(ClassNotFoundException | SQLException e){       
       out.println("Something went wrong !! Please try again");       
   }      
    }
}
