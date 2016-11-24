<%-- 
    Document   : admin
    Created on : 31-Oct-2016, 07:42:40
    Author     : Faiz
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.* " %>
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
      <h1>This is Admin page</h1>
        <%-- here print a name is static not coming to any form   --%>
      Welcome <font color="red">Faiz khan</font>
              <br/><br/>
      <table border="1" align="center" font-size="5px;">
          
          <tr>              <th>P Id</th>
                           <th>P Name</th>
                           <th>P Category</th>
                           <th>P Description</th>
                           <th>P price</th>
                           <th>P Quantity</th>
                           <th colspan="4" align="center">Action</th>
                             <%-- here i'm using connection and prparedStatement for display a e_product data   --%>
                        
                           <%
                            Class.forName("oracle.jdbc.OracleDriver");
                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
                            PreparedStatement ps = con.prepareStatement("select * from e_product");
                            ResultSet rs = ps.executeQuery();
                            while(rs.next()){
                                
                           
                               
                               
                               
                               %>
                               <%-- Here two types for display a  product detailes first is here am using ResultSet interface--%>
          </tr>  
          
          <tr>
              <td><%=rs.getString("p_id")%></td>
              <td><%=rs.getString("p_name")%></td>
              <td><%=rs.getString("p_category")%></td>
              <td><%=rs.getString("p_description")%></td>
              <td><%=rs.getString("p_price")%></td>
              <td><%=rs.getString("p_quantity")%></td>
              <%-- <td><a href="/Shopper_Square/AdminController?action=edit&productId=<%=rs.getString("p_id")  %>">Update Product</a></td>--%>
         <td><a href="/Shopper_Square/AdminController?action=delete&productId=<%=rs.getString("p_id")%>">Delete Product</a></td>
              
              <% } %>
              
              
          </tr>
           <%-- Here second types for display a  product detailes using jsp <c: forEach tag > but here i can  use only one for it      --%>
          <%--   <c:forEach items="${pro}" var="p">
                         <tr>          
                             <td><c:out value="${p.productid}"/></td>
                             <td><c:out value="${p.productname}"/></td>
                             <td><c:out value="${p.category}"/></td>
                             <td><c:out value="${p.description}"/></td>
                             <td><c:out value="${p.price}"/></td>
                             <td><c:out value="${p.quantity}"/></td>
                             
                             
             
                             <td><a href="/Shopper_Square/AdminController?action=edit&productId=<c:out value="${p.productid}"/>">Update Product</a></td>
                             <td><a href="/Shopper_Square/AdminController?action=delete&productId=<c:out value="${p.productid}"/>">Delete Product</a></td>
          </tr>
              </c:forEach>--%>
             </table>
              <%-- This link i'm giving here for add a new product   --%>
              <a href="AdminController?action=insert">Add New Product</a>
   
      <%-- This is jsp include directive   footer common page for All jsp page  --%>
      <%@include file="Include_Page/Footer.jsp" %>
   
    </body>
</html>
