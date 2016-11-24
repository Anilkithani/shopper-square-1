<%-- 
    Document   : Profile
    Created on : 22-Oct-2016, 16:30:12
    Author     : Faiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopper Square</title>
     <%@include file="Include_Page/Header.jsp" %>
    </head>
    <body>
        
      <%@include file="Include_Page/menubar.jsp" %>
 
      
        
   
        <h1>Update profile</h1>
         <form action="UpdateUser" method="Post">
  <div class="container">
     
    <label><b>User Name</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required>
    <br/>
     <label><b>Contact</b></label>
    <input type="text" placeholder="Enter Contact no" name="contact" required>
    <br/>
     <label><b>Address</b></label>
    <input type="text" placeholder="Enter  Address" name="address" required>
    <br/> 
     <label><b>Password</b></label>
    <input type="password" placeholder="Enter Contact no" name="psw" required>
    <br/>
    <button type="submit" class="Register-user">Update</button>
     <button type="reset" class="Register-user">Reset</button>
        
        
         <%@include file="Include_Page/Footer.jsp" %>
    </body>
</html>
