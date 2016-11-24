<%-- 
    Document   : viewCart
    Created on : 26-Oct-2016, 16:38:32
    Author     : Faiz
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Product"%>
<%@page import="java.sql.*"%>
<%@page import=" java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopper Square</title>
    </head>
    <body>
         <%-- This is jsp include directive  header and menubar common page for All jsp page   --%>
        <%@include file="Include_Page/Header.jsp" %> 
        <%@include file="Include_Page/menubar.jsp" %> 
        
        <div class="container-fluid" style="font-size: 30px;">
        
        <h2 align="center"><u>Your Shopping Cart</u></h2><br/><br/>
        <br/>
       <a href="Electronics.jsp">Continue Shopping</a><br/><br/>
        <table align="center" cellpadding="20" cellspacing="20" border="3">
            <tr>
                
                 <th>P Id</th>
                  <th>P Name</th>
                   <th>P Price</th>
                    <th>P Quantity</th>
                    <%--   <th>Sub Total</th> --%>
                     <th colspan="2">Option</th>
            </tr>  
              <%-- here i'm using connection and prparedStatement for display a cart_item data   --%>
        <%   
          try {
                                     Class.forName("oracle.jdbc.OracleDriver");
                                     Connection con;
                                     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
                                        
                                Statement st ;
                                       ResultSet rs; 
                                   st =  con.createStatement();
                                   rs = st.executeQuery("select * from cart_item");
                                    while(rs.next()){
        
        
                                    
        
        %>
        
         <%-- here i'm using Rseultset interface for print the cart_item data   --%>
                       <tr>
                           
                             <td><%=rs.getString("p_id")%></td> 
                       <td><%=rs.getString("p_name")%></td>
                              <td><%=rs.getString("p_price")%></td>
                              <td><%=rs.getString("p_quantity")%></td>
                              <%--      <td><%=rs.getString(" p_price") %>*<%=rs.getString("p_quantity")   %></td> --%>
                              <td><a href="/Shopper_Square/cart?pid1=<%=rs.getString("p_id")%>">Delete</a></td>
                       </tr>        
               <% }%>
               
      <%  }catch(SQLException e){
  e.printStackTrace();
}%>    
       
                     
 <a href="ItemDelete" class="btn btn-lg btn-info" id="checkbutton">Check Out</a>
        </table>
 
     
        </div>  <br/><br/><br/> 
      
        <%-- This is jsp include directive   footer common page for All jsp page  --%>
<%@include file="Include_Page/Footer.jsp" %> 
    </body>
</html>
