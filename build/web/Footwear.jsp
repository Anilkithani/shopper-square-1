<%-- 
    Document   : Electronics
    Created on : 17-Oct-2016, 09:21:19
    Author     : Faiz
--%>

<%@page import="Model.Product"%>
<%@page import="java.sql.*"%>
<%@page import=" java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="Include_Page/Header.jsp" %>
    </head>
    <body>

        <div class="container-fluid">

            <%@include file="Include_Page/menubar.jsp" %>
            Welcome  <font color ="red">    <%=session.getAttribute("username")%></font>
       <font color ="Blue"> 
            





            <marquee width="100%" height="15%" behavior="scroll" class="alert alert-danger">  This is only dummy data not for sell
            </marquee>
            <div class="row">
               
                   
                             <%    try {
                                     Class.forName("oracle.jdbc.OracleDriver");
                                     Connection con;
                                     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
                                        
                                Statement st ;
                                       ResultSet rs; 
                                   st =  con.createStatement();
                                   rs = st.executeQuery("select * from fw_product");
                                    while(rs.next()){
                   %>     
                          
          
                   
                   <div class="col-sm-4 col-lg-4 col-md-4">
                            <div class="thumbnail">
                                <img src="image/footwear/<%=rs.getString("p_id")%>.jpg" alt="" height="210px" width="150px>
                                     <div class="caption">
                                     <h4 class="pull-right">Rs <%=rs.getString("p_price")%></h4>
                                <h4><a href="#"><%=rs.getString("p_name")%></a>
                                </h4>
                                <p><%=rs.getString("p_description")%></p>    </div>
                                <a class="btn btn-success" id="click">Add to cart</a>
                             <br/><br/>
   
                       </div>  <% }%>   
                               
            
                            
                        
             
                
       

    
       
     
<%  }  catch (Exception e) {

                            } %>
        
        <%@include file="Include_Page/Footer.jsp" %> 

        </div>
</body>
</html>
